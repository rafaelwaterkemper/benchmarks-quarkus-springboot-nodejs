var Person = require('../model/Person')

let people = [new Person('Rafael', 21, '21/07/1996')]

class PersonController {
    
    async findAll (req, res) {
        console.log(new Date())
        return res.json(people)
    }
    
    async create (req, res) {
        let person = new Person(req.body.name, req.body.age, req.body.birthDate);
        people.push(person)

        return res.json(person)
    }

}

module.exports = new PersonController()