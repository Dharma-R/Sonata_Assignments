import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponent } from './MyComponent';
import { ForEachComponent } from './for-each/for-each.component';
import { Image } from './Image';
import { Product } from './Product';
import { FormsModule } from '@angular/forms';
import { IfExampleComponent } from './if-example/if-example.component';
import { CustomDirective } from './CustomDirective';

@NgModule({
  declarations: [
    AppComponent,CustomDirective,MyComponent, ForEachComponent ,Image ,Product, IfExampleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
