import * as React from 'react';
import {Link} from 'react-router-dom';

export function Nav(){
    return (
        <nav>
            <div>
                <ul className="navbar-nav">
                    <li className="nav-item">
                        <Link to="/">Home Page</Link>
                    </li>
                    <li className="nav-item">
                        <Link to="/partners">About the Partners</Link>
                    </li>
                    <li className="nav-item">
                        <Link to="/queues">Food Queues</Link>
                    </li>
                    
                </ul>
            </div>
        </nav>
    )
}