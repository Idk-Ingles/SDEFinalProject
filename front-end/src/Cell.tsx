import React from 'react';
import { Cell } from './game';


interface Props {
  cell: Cell
}

class BoardCell extends React.Component<Props> {
  render(): React.ReactNode {    
    if(this.props.cell.text=='P')
    return (
      <img src={require(".//images//fastPirate.png")} alt="Nothing" className={`resizecell `}></img>
    )
    else if(this.props.cell.text=='C')
      return (   
      <img src={require(".//images//ship.png")} alt="Nothing" className={`resizecell `}></img>  
      )
      else if(this.props.cell.text=='I')
        return (
          <img src={require(".//images//island.png")} alt="Nothing" className={`resizecell `}></img>  
        )
      else if(this.props.cell.text=='Q')
        return (
          <img src={require(".//images//pirateShip.png")} alt="Nothing" className={`resizecell `}></img>  
        )
        else if(this.props.cell.text=='M')
          return (
            <img src={require(".//images//shark.png")} alt="Nothing" className={`resizecell `}></img>  
          )
    else if(this.props.cell.text=='W')
      return (
        <img src={require(".//images//whirlpool.png")} alt="Nothing" className={`resizecell `}></img> 
      )
      else if(this.props.cell.text=='T')
        return (
        <img src={require(".//images//treasure.png")} alt="Nothing" className={`resizecell `}></img> 
        )
        else if (this.props.cell.text=='S')
          return (
            <img src={require(".//images//shield.png")} alt="Nothing" className={`resizecell `}></img> 
            )
      else
      return (
        <div className={`cell ` }>{this.props.cell.text}</div>
      )
  }
}

export default BoardCell;