// This is a age checker


function ageChecker(user) {
    if (user.age != null) {
        if (user.age < 18) {
            console.log("Sorry no babies")
        } else if (user.age < 21) {
            console.log("You can't drink homie")
        } else {
            console.log("Take a seat and have a drink")
        }
    } else {
        console.log("Are you even human bro!")
    }

}

function canYouEvenDrinkBro(user) {

}

const paul = {
    age: 22,
}

ageChecker(paul)