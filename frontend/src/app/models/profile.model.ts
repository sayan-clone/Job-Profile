export interface Profile {
  name: string;
  title: string;
  summary: string;
  email: string;
  profileImageUrl: string;
  skills: string[];
  experience: Experience[];
  documents: DocumentLink[];
}

export interface Experience {
  company: string;
  role: string;
  duration: string;
  description: string;
}

export interface DocumentLink {
  name: string;
  url: string;
}
