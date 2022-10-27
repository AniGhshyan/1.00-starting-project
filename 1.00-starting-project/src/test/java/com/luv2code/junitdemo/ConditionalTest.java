package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

    @Test
    @Disabled("Don't run until JIRA #123 is resolved")
    void basicTest() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    void testForMacAndWindowsOnly() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyForJava17() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForOnlyForJava13() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_17)
    void testForOnlyForJavaRange() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testForOnlyForJavaRangeMin() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV", matches = "DEV")
    void testOnlyForDevEnvironment() {
        //կատարել մեթոդ և կատարել պնդումներ
    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty() {
        //կատարել մեթոդ և կատարել պնդումներ
    }
}
