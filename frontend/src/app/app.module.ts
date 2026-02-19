import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { ProfileComponent } from './components/profile/profile.component';
import { FilePreviewComponent } from './components/file-preview/file-preview.component';
import { SafeUrlPipe } from './pipes/safe-url.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ProfileComponent,
    FilePreviewComponent,
    SafeUrlPipe
  ],
  imports: [BrowserModule,
   HttpClientModule],
  bootstrap: [AppComponent]
})
export class AppModule {}
