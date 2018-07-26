import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { Menu } from './Menu';
import { environment } from '../environments/environment';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class KrrunchyBackendService {

  constructor(private http: HttpClient) {

  }

  // public getAllMenus(): Observable<Menu[]>  {
  //   return this.http.get(API_URL + '/menus/all')
  //           .map(response => {
  //             const menus = response.json();
  //             return menus.map((menu) => new Menu());
  //           })
  //           .catch(this.handleError);
  // }
  public getAllMenus(): Observable<Menu[]>  {
    return this.http.get<Menu[]>('http://localhost:8080/menus/all');
    //.do(console.log);
  }


  private handleError (error: Response | any) {
    console.error('ApiService::handleError', error);
    return Observable.throw(error);
  }
}
