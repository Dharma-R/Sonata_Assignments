const fs = require('fs');
const path= require('path');
fs.writeFile(path.join(__dirname,'/test','/hello.txt')
    ,'my text file contains'
    ,(err)=>{
     if(err) throw err;
    console.log('File written to...');
    }
    )
    // const fs = require('fs');
    // const path= require('path');
    // fs.writeFile(path.join(__dirname,'/test','/hello.txt')
    //     ,'my text file contains'
    //     ,(err)=>{
    //      if(err) throw err;
    //     console.log('File written to...');
    //     }
    //     )
    fs.readFile(path.join(__dirname,'/test','/hello.txt')
    ,'utf8'
    ,(err,data)=>{
     if(err) throw err;
    console.log(data);
    }
    )