package io.github.yukoba.barometer.ui.features.thirdpartylicenses.types

data class ThirdPartyLicense(
    val libraryName: String,
    val website: String?,
    val licenseName: String,
    val licenseUrl: String,
)
