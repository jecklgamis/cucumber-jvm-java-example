IMAGE_NAME:=cucumber-jvm-java-example
IMAGE_TAG:=latest
default:
	cat ./Makefile
dist:
	./mvnw clean package
image:
	 docker build -t $(IMAGE_NAME):$(IMAGE_TAG) -t $(IMAGE_NAME):$(IMAGE_TAG) .
run:
	 docker run $(IMAGE_NAME):$(IMAGE_TAG)
run-bash:
	 docker run -it $(IMAGE_NAME):$(IMAGE_TAG) /bin/bash
all: dist image

