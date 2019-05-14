var express = require('express')

var PersonController = require('../controller/PersonController')

const router = express.Router()

router.get('/person', PersonController.findAll)
router.post('/person', PersonController.create)

module.exports = router;