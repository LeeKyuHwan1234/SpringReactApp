import logo from './logo.svg';
import './App.css';
import {memo, useEffect, useState} from 'react';

function App() {
  const [message, setMessage] = useState("")

  useEffect(()=> {
    async function getData() {
        setLoading(true);
        try {
            const response = await fetch("http://localhost:8080/todolist")
            const data = await response.json();
            setMessage(data);
        } catch(e) {
            console.log(e)
        }
        setLoading(false);
    }
    getData();
}, []); 

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          {message}
        </a>
      </header>
    </div>
  );
}

export default App;
