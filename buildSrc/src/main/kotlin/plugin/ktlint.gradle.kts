package plugin

/**
 * @author İsmail Hakkı AYDIN
 * @date 02,April,2022
 */


import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.KtlintPlugin

apply<KtlintPlugin>()
configure<KtlintExtension> {
    version.set("0.40.0")
    disabledRules.set(setOf("no-wildcard-imports, import-ordering"))
}