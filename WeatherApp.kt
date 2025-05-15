fun main(){
    println("Welcome to Umbrella CLI!")
    println("Type the name of your city to get weather information or type 'exit' to quit.")


    while(true){
        print("\nEnter city name: ")
        val input = readLine()?.trim()

        if(input.isNullOrEmpty()){
            println("Please enter a valid city name")
            continue
        }

        if(input.equals("exit", ignoreCase = true)){
            println("Goodbye! Stay dry")
        }

        //Placeholder for API call
    }
}

fun getWeather(city: String){
    println("Fetching weather for '$city'...")
}