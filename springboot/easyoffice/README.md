## Verify startup time from startup application even firsr response of request

We start looping in a shell, sending requests to the rest endpoint of the sample application we are testing.

while [[ "$(curl -s -o /dev/null -w ''%{http_code}'' localhost:8080/person)" != "200" ]]; do sleep .00001; done

In a separate terminal, we start the timing application that we are testing, printing the time the application starts

date +"%T.%3N" &&  ./target/easyoffice-1.0-SNAPSHOT-runner