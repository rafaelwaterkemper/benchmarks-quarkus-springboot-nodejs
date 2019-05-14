var Person = require('../model/Person')

let people = []

class PersonController {
    
    async findAll (req, res) {
        return res.json(people)
    }
    
    async create (req, res) {
        let person = new Person(req.body.name, req.body.age, req.body.birthDate);
        people.push(person)

        return res.json(person)
    }

}

module.exports = new PersonController()