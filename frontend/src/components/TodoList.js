import React from "react";
import styled from 'styled-components';
import TodoItem from "./TodoItem";
import { useTodoState }from './TodoContext'

const TodoListBlock = styled.div`
    flex: 1;
    margin-inline:30px;
    margin-bottom:30px;
    padding: 20px 32px;
    padding-bottom: 48px;
    overflow-y: auto;
    border-radius:20px;
`;

function TodoList() {
    const todos = useTodoState();

    return (
        <TodoListBlock>
            {todos && todos.map(Todo => 
            (
                <TodoItem
                    key={Todo.id}
                    id={Todo.id}
                    text={Todo.text}
                    done={Todo.done}
                />
            ))
        }
        </TodoListBlock>
    );
}

export default TodoList;