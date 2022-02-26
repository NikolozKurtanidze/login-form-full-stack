import React from "react";
import LoginForm from "./components/LoginForm";
import "./App.css"
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import LoggedInForm from "./components/LoggedInForm";
import RequireAuth from "./components/RequireAuth";

function App() {
  localStorage.setItem('isLogged', 'false');
  return (
    <div className="App">
      <Routes>
        <Route path="/" exact element={<LoginForm />} />
        <Route path="/logged" exact element={<RequireAuth element={<LoggedInForm />} />} />
      </Routes>
    </div>
  );
}
export default App;
