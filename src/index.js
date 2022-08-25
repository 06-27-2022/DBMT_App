import React from 'react';
import ReactDOM from 'react-dom/client';
import {Routes, Route, BrowserRouter} from 'react-router-dom';
import './index.css';
import {Partners, Queue} from './App';
import {Site} from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <div>
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Site/>} />
      <Route path="/partners" element={<Partners/>} />
      <Route path="/queues" element={<Queue/>} />
  
    </Routes>
    </BrowserRouter>
  </div>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
// reportWebVitals();
