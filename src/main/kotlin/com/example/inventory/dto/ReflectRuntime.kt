package com.example.inventory.dto

import java.util.regex.Pattern
import javax.validation.Constraint
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext
import javax.validation.Payload
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
@Constraint(validatedBy = [ValidatePrice::class])
annotation class ReflectRuntime(
        val message: String = "ignored message",
        val groups: Array<KClass<*>> = [],
        val payload: Array<KClass<out Payload>> = []
    )

class ValidatePrice: ConstraintValidator<ReflectRuntime, List<String>> {
    override
    fun isValid(ids: List<String>, context: ConstraintValidatorContext?):
            Boolean {
        val pattern = Pattern.compile("^\\d{6}\$")
        return ids.all { pattern.matcher(it)
                .find() }
    }

}
