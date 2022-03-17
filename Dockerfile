FROM adoptopenjdk:11-jre
COPY ./build/libs/*.jar /dist/
ENTRYPOINT java -jar /dist/*.jar