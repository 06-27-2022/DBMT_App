import React from 'react';

export function PartnersToAdd(){
    const [partnerToAdd, setPartnerList] = React.useState([]);

    return (
        <>
        <PartnerList partnerToAdd={partnerToAdd}/>
        <AddPartner setPartnerList={setPartnerList}/>
        </>
    );
}

function PartnerList({partnerToAdd}) {
    return (
        <ul>
            {partnerToAdd.map((part, i) => (
                <li key={"item" + i}>{part}</li>
            ))}
        </ul>
    );
}

function AddPartner({setPartnerList}) {
    function handleSubmit(event) {
        event.preventDefault();
        const partner = event.target.elements.partner.value;
        setPartnerList(prevPartner => [...prevPartner, partner]);
    }
    return (
        <form onSubmit={handleSubmit}>
        <input type="text" id="partner" />
        <button type="submit">Add Partner</button>
        </form>
    );
 }
