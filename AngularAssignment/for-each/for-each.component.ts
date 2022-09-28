import { Component, OnInit } from '@angular/core';
import { cricketer } from '../cricketer';

@Component({
  selector: 'app-for-each',
  templateUrl: './for-each.component.html',
  styleUrls: ['./for-each.component.css']
})
export class ForEachComponent implements OnInit {
  cricketers = ['Virat', 'Rohit','Dravid', 'Bhuvi'];
  constructor() { }
  data = [
    new cricketer(123,"Rishabh"),
    new cricketer(456,"Surya")
  ]
  
  

  ngOnInit(): void {
  }

}
