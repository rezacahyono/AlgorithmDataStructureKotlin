package fizzbuzz

class FizzBuzzApp {

    fun convert(toConvertFizzBuzz: Int): String {

        if (toConvertFizzBuzz%15==0){
            return "fizzbuzz"
        }

        if (toConvertFizzBuzz%5==0){
            return "buzz"
        }

        if (toConvertFizzBuzz%3==0){
            return "fizz"
        }

        return toConvertFizzBuzz.toString()
    }
}