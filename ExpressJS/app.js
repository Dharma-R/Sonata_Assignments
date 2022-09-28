const express = require('express');
const app = express();



const members=[
    {
        id:1,
        name:'Dharma',
        email:'dharma@gmail.com',
        status:'active'
    },
    {
        id:2,
        name:'Anirudh',
        email:'anirudh@gmail.com',
        status:'active'
    },
    {
        id:3,
        name:'Sharath',
        email:'shararth@gmail.com',
        status:'active'
    },
];

app.get('/api/members',(req,res)=>{
    res.json(members);
});

const PORT = process.env.port || 3012;
app.listen(PORT, ()=>console.log('server started'));