const fs = require('fs');
const path= require('path');
//fs.writeFile(path.join(__dirname,'/Trainingdetails','/student.txt')
  //  ,'dharma '
    //,(err)=>{
     //if(err) throw err;
    //console.log('student details updated...');
    //}
    //)
    // const fs = require('fs');
    // const path= require('path');
    // fs.writeFile(path.join(__dirname,'/test','/hello.txt')
    //     ,'my text file contains'
    //     ,(err)=>{
    //      if(err) throw err;
    //     console.log('File written to...');
    //     }
    //     )
    fs.readFile((__dirname,'/demo/aa1.java')
    ,'utf8'
    ,(err,data)=>{
     if(err) throw err;
    console.log(data);
    }
    )