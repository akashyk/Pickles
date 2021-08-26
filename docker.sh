mvn clean install && docker build -t akidoc .

docker run -d --name akidoc -p 8080:8080 akidoc