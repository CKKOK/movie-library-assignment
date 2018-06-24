import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movie-listings',
  templateUrl: './movie-listings.component.html',
  styleUrls: ['./movie-listings.component.css']
})
export class MovieListingsComponent implements OnInit {
  data = {};
  baseUrl = 'http://localhost:8080/movies';

  constructor(private http: HttpClient) {
    http.get(this.baseUrl).subscribe(data => {
      this.data = data;
      console.log(data);
    });
  }

  ngOnInit() {
  }

}
