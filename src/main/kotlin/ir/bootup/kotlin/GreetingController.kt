package ir.bootup.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(): String {
        return "Hello World! =)))"
    }
}

