import React from 'react';

export const wrapper = (Component) => ({...props}) => (
    <div style= {{border: '2px solid green', borderRadius: '3px'}}>
        <Component {...props}/>
        </div>
);