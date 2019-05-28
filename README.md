**Benchmark**
==
Measurements taken from the same quarkus, springboot and nodejs project, 
which have a single rest endpoint, and their models, in order to evaluate 
the footprint, startup time and the response time of the requests.

Tests went running on minikube, at Ubuntu 18.04.

## Config VM minikube:

`CPUs`: 4

`RAM`: 8GB

## Results

| stats       |quarkus|springboot |nodejs |
|---          |---    |---        |---    |
|footprint    | x     |           |       |
|startup      | x     |           |       |
|first request| x     |           |       |
