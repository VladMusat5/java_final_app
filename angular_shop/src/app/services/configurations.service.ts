import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ConfigurationsService {
  private apiUrl: string = 'http://localhost:8081/api';
  private appName: string = 'Pharmacy';
  private appOwner: string = 'Musat Vlad';
  private appLogo: string =
    'https://m.media-amazon.com/images/I/71Uzvgc-sdL.jpg';

  constructor() {}

  public getApiUrl() {
    return this.apiUrl;
  }

  public getAppName() {
    return this.appName;
  }

  public getAppOwner() {
    return this.appOwner;
  }

  public getAppLogo() {
    return this.appLogo;
  }
}
