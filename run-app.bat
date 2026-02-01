@echo off
title Jetpack Compose - Run App
color 0A

echo.
echo ========================================
echo   Building Jetpack Compose App
echo ========================================
echo.

call gradlew.bat build
if %errorlevel% neq 0 (
    echo.
    echo ERROR: Build failed!
    pause
    exit /b 1
)

echo.
echo ========================================
echo   Installing on Emulator/Device
echo ========================================
echo.

call gradlew.bat installDebug
if %errorlevel% neq 0 (
    echo.
    echo ERROR: Installation failed!
    pause
    exit /b 1
)

echo.
echo ========================================
echo   Launching App
echo ========================================
echo.

adb shell am start -n com.practice.jetpack_compose/.MainActivity
if %errorlevel% neq 0 (
    echo.
    echo ERROR: Could not launch app!
    echo Make sure an emulator or device is connected.
    pause
    exit /b 1
)

echo.
echo ========================================
echo   SUCCESS! App is running!
echo ========================================
echo.
pause
