@echo off
echo ===================================================
echo Spring Boot MongoDB CRUD Application
echo ===================================================

echo Checking Java installation...
java -version
IF %ERRORLEVEL% NEQ 0 (
    echo Java is not installed or not in your PATH.
    echo Please install Java 17 or later and try again.
    pause
    exit /b 1
)

echo.
echo Cleaning and building the project using Maven Wrapper...
call mvnw.cmd clean package
IF %ERRORLEVEL% NEQ 0 (
    echo Maven build failed.
    pause
    exit /b 1
)

echo.
echo Running the application...
call mvnw.cmd spring-boot:run

pause
