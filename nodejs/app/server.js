var express = require('express')
var cors = require('cors')
var routes = require('../app/api/PersonResource')

let server = express()

server.use(cors());
server.use(express.json())
server.use(routes)

server.listen(3333, () => {
    console.log("Listening on port 3333")
})

