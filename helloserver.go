package main

import (
	"log"
	"net/http"
)

func main() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		w.Write([]byte("Hello, " + r.URL.Path))
	})

	address := ":9991"
	log.Println("Listening on ", address)
	log.Fatal(http.ListenAndServe(address, nil))
}
