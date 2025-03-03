package com.cra.test.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class CountryAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCountryAllPropertiesEquals(Country expected, Country actual) {
        assertCountryAutoGeneratedPropertiesEquals(expected, actual);
        assertCountryAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCountryAllUpdatablePropertiesEquals(Country expected, Country actual) {
        assertCountryUpdatableFieldsEquals(expected, actual);
        assertCountryUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCountryAutoGeneratedPropertiesEquals(Country expected, Country actual) {
        assertThat(actual)
            .as("Verify Country auto generated properties")
            .satisfies(a -> assertThat(a.getId()).as("check id").isEqualTo(expected.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCountryUpdatableFieldsEquals(Country expected, Country actual) {
        assertThat(actual)
            .as("Verify Country relevant properties")
            .satisfies(a -> assertThat(a.getCountryName()).as("check countryName").isEqualTo(expected.getCountryName()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCountryUpdatableRelationshipsEquals(Country expected, Country actual) {
        assertThat(actual)
            .as("Verify Country relationships")
            .satisfies(a -> assertThat(a.getRegion()).as("check region").isEqualTo(expected.getRegion()));
    }
}
