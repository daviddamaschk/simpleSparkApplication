docker network create commonnet

docker build ./ -t sparkapp

docker run --net commonnet -it -p 8866:9999 sparkapp:latest
