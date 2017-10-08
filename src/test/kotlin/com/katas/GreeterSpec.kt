package com.katas

import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

object GreeterSpec : Spek({

    describe("Greeter") {
        it("should say hello") {
            val greeter = Greeter("John Doe")

            assertThat(greeter.sayHello()).isEqualTo("Hello, John Doe!")
        }
    }

})