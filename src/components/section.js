import React from 'react';

export function Section(props) {

    const [showInfo, setShowInfo] = React.useState(false);

    function toggleInfo(){
        setShowInfo(!showInfo);
    }

    if (!showInfo){
        return(
            <div id={props.sectionId} className="section">
                <h2>{props.name}</h2>
                <img src={props.url} height="300px" width="300px"/>
                <button onClick={toggleInfo} type="button">{props.buttonText}</button>
            </div>
        );
    }else{
        return (
            <div>
                
                <p>About the Queue!</p>
                <p>Food Queue are a way to reserve surplus meals from restaurants in your area after business hours.  </p>
            </div>
        );
    }
}