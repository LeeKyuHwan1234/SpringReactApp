import React, {useContext, useReducer, useRef, useState, useEffect} from "react";
import { useDispatch } from "react-redux";

const TodoStateContext = React.createContext();
const TodoDispatchContext = React.createContext();
const TodoNextId = React.createContext();

function reducer(state, action){
    switch (action.type) {
        case "CREATE":
            return state.concat(action.todo);
        case 'TOGGLE':
            return state.map(todo =>
                todo.id === action.id ? { ...todo, done: !todo.done } : todo
            );
        case "REMOVE":
            return state.filter((todo =>todo.id !== action.id));
        case 'SUCCESS':
            return {
              loading: false,
              data: action.data,
              error: null,
            };
        default:
            
    }
}

function TodoProvider({children}) {
    const dispatch = useDispatch()
    const [message, setMessage] = useState("");
    const [loading, setLoading] = useState(false);
    const Todos123 = message;


    //const Todos =[{"id":"2","text":"할일2","done":"false"}];
    async function getData() {
        setLoading(true);
        try {
            const response = await fetch("http://localhost:8080/todolist")
            const data = await response.json();
            setMessage(data);
            dispatch({
                type:"SUCCESS",
                todo: message
            });
           
        } catch(e) {
            console.log(e)
        }
        setLoading(false);
    }
    useEffect(()=> {
        getData();
        
    }, []);
    const [state, action] = useReducer(reducer, Todos123);  
    const nextId = useRef(5);   
    console.log(message)

    if(loading) {
        return <div>대기중..</div>;
    }

    if(!message) {
        return null;
    }
    
    return (
        <TodoStateContext.Provider value={state}>
            <TodoDispatchContext.Provider value={action}>
                <TodoNextId.Provider value={nextId}>
                    <>{children}</>
                </TodoNextId.Provider>
            </TodoDispatchContext.Provider>
        </TodoStateContext.Provider>
    )
    
}


export function useTodoState() {
    return useContext(TodoStateContext);
}

export function useTodoDispatch() {
    return useContext(TodoDispatchContext);
}

export function useTodoNextId() {
    return useContext(TodoNextId);
}

export default TodoProvider;