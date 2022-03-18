import './App.css';
import React, {useRef, useState} from 'react';
import TodoTemplate from './components/TodoTemplate';
import TodoHead from './components/TodoHeader';
import TodoList from './components/TodoList';
import TodoCreate from './components/TodoCreate';
import TodoItem from './components/TodoItem';
import { createGlobalStyle } from 'styled-components';
import TodoProvider from './components/TodoContext';

const GlobalStyle = createGlobalStyle`
  body {
    background: #e9ecef;
  }
`;


function App() {

  return (
    <>
    <TodoProvider>
    <GlobalStyle/>
    <TodoTemplate>
      <TodoHead>
        Todo-List
       </TodoHead>
       <TodoList>
         <TodoItem>

         </TodoItem>
       </TodoList>
       <TodoCreate>
       </TodoCreate>
    </TodoTemplate>
    </TodoProvider>
    </>
   );
}

export default App;
// import './App.css';
// import React from "react";
// import * as S from "./App.styles";

// import InputForm from "./components/InputForm";
// import StodoList from "./components/StodoList";
// function App() {
//   return (
//     <S.Container>
//       <S.Wrapper>
//         <h1>Redux 로 배우는 Todo List</h1>
//         <InputForm />
//         <StodoList />
//       </S.Wrapper>
//     </S.Container>
//   );
// }

// export default App;
