import React from "react";
import styled from "styled-components";

const TodoHeadBlock = styled.div`
.title {
    margin: 40px;
    color:white;
    border-radius: 20px;
    height: 70px;
    font-size:60px;
    font-family: 'ImcreSoojin';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-04@2.3/ImcreSoojin.woff') format('woff');
    font-weight: normal;
    font-style: normal;
    }
}
`;

function TodoHead() {
    return (
        <TodoHeadBlock>
            <div className="title">TODO - LIST</div>
        </TodoHeadBlock>
    );
}

export default TodoHead;


