import { initializeApp } from 'chapter-12/petstore/src/firebase';

const app = initializeApp({
    apiKey: "",
    authDomain: "",
    databaseURL: "",
    projectId: "",
    storageBucket: "",
    messagingSenderId: "",
    appId: ""
});

export const db = app.database();

export const productsRef = db.ref('products');
