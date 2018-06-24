import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {
  title = 'Movie Library';
  subTitle = 'Click below to see what movies we have to offer!';

  constructor() {}

  ngOnInit() {}

}
