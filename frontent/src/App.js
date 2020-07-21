import React from 'react';
import Login from '../components/Login';
import { BrowserRouter as Router, Route, Link} from 'react-router-dom';
import './App.css';

function App() {
  return (<Router>
    <div className="App">
        <Link to={"/login"}>Welcome to SMS</Link>
        <switch>
        <Router exact path='/' component={Login}/>
          <Router path="/login"component ={Login}/>
        </switch>

      
    </div></Router>
  );
}

export default App;
