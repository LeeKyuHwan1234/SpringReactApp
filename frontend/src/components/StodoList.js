import React from "react";

import * as S from "./StodoList.styles.js";

import TodoItem from "./StodoItem.js";
import { useSelector } from "react-redux";

const StodoList = () => {
  const todos = useSelector((state) => state.todos);

  return (
    <S.Container>
      {todos.map((todo) => (
        <TodoItem key={todo.id} todo={todo} />
      ))}
    </S.Container>
  );
};

export default StodoList;