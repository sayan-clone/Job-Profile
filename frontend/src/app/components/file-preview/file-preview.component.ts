/*import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-file-preview',
  templateUrl: './file-preview.component.html',
  styleUrls: ['./file-preview.component.scss']
})
export class FilePreviewComponent {
  imageUrl: string = '';
  fileName: string = '';

  constructor(private http: HttpClient) {}

  previewImage(): void {
    this.imageUrl = 'http://localhost:8080/api/files/photo.jpg';
  }

  downloadFile(): void {
    const url = 'http://localhost:8080/api/files/resume.pdf';
    this.http.get(url, { responseType: 'blob' }).subscribe(blob => {
      const link = document.createElement('a');
      link.href = window.URL.createObjectURL(blob);
      link.download = 'resume.pdf';
      link.click();
    });
  }
}*/
import { Component, Input } from '@angular/core';
import { SafeUrlPipe } from '../../pipes';

@Component({
  selector: 'app-file-preview',
  templateUrl: './file-preview.component.html',
  styleUrls: ['./file-preview.component.scss']
})
export class FilePreviewComponent {
  @Input() fileUrl: string = '';
}
