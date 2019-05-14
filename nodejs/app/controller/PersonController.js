var Person = require('../model/Person')

let people = []

class PersonController {
    
    findAll (req, res) {
        return res.json(people)
    }
    
    create (req, res) {
        let person = new Person(req.body.name, req.body.age, req.body.birthDate);
        people.push(person)

        return res.json(person)
    }

}

module.exports = new PersonController()