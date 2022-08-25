import './App.css';
import React from 'react';
import {Nav} from './components/nav';
import {PartnersToAdd} from './pages/partners';
import {Section} from './components/section';
import {wrapper} from './components/wrapper';

class gardens{
  constructor(name, url){
    this.name = name;
    this.url = url;
  }
}

function Welcome(){
  return (
    <div>
      <h3>Welcome to Abundant Gardens!</h3>
    </div>
  );
}


function View(){
  let garden = [];
  let sections = [];
  let count = 0;

  garden.push(new gardens('Food Queue', 'https://st2.depositphotos.com/1915171/5331/v/600/depositphotos_53310807-stock-illustration-queue-sign-icon-long-turn.jpg'));
  garden.push(new gardens('Partners', 'https://media.istockphoto.com/photos/satisfied-woman-working-at-vegetable-garden-picture-id1153409243?k=20&m=1153409243&s=612x612&w=0&h=thXZeG-alJHfW_tP7I9x-oEHOxTAr9Skd6Xfkt6I5HI='));

  //Helper method to render a new section with specific props
function renderSection(sectionId, name, url){
  return (
    <Section 
      sectionId={sectionId}
      name={name}
      url={url}
      key={count}
      buttonText={"Find out more about the " + name + "s"}/>
  );
}

for(let a of garden){
  sections.push(renderSection(a.sectionId, a.name, a.url));
  count++;
}
return(
  <div className="container">
    {sections}
  </div>
);

}

export function Site(){

  const HeadingComponent = wrapper(Welcome);
  return (
    <div>
      <Nav/>
      <HeadingComponent/>
      <View/>
    </div>
  );
}

export function Queue(){
  return(
    <div>
      <Nav/>xs
      <p>Welcome to the Queue!</p>
      <img 
      src="https://media.istockphoto.com/photos/close-up-of-fresh-and-juicy-vegetables-from-garden-bed-picture-id1178545179?k=20&m=1178545179&s=612x612&w=0&h=yiV1NEUuPoVjQ1tNcrnMXNsLdB1TmyqHk_pyLHV4KU0="
      height="300px"
      width="200px"/>
    </div>
  );
}

export function Partners(){
  return(
    <div>
      <Nav/>
      <br/>
      <h2>Participating Partners</h2>
      <p>The San Diego restaurants are dedicated to upholding the Live Well model for our community. This is why we have partnered with the County of San Diego to help combat food waste while supporting CalFresh households in our community.</p>
      <br/>
      <PartnersToAdd/>
    </div>
  )
}

export class AbundantGardens extends React.Component{
  render(){
    return <h1>Welcome to Abundant Gardens!</h1>
  }
}




