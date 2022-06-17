package main

import (
	"encoding/hex"
	"fmt"

	"github.com/sammyne/protobuf3-scala2.13-quickstart/checker/pb"

	"google.golang.org/protobuf/proto"
)

func main() {
	req := pb.SearchRequest{
		Query:         "how do you do",
		PageNumber:    456,
		ResultPerPage: 789,
	}

	encoded, err := proto.Marshal(&req)
	if err != nil {
		panic(err)
	}
	fmt.Printf("pb = %x\n", encoded)

	fmt.Println("---")
	pbFromScala, err := hex.DecodeString("0a0568656c6c6f107b18c803")
	if err != nil {
		panic(err)
	}

	var parsed pb.SearchRequest
	if err := proto.Unmarshal(pbFromScala, &parsed); err != nil {
		panic(err)
	}
	if parsed.Query != "hello" {
		fmt.Printf("bad query: %q\n", parsed.Query)
	}
	if parsed.PageNumber != 123 {
		fmt.Printf("bad pageNumber: %d\n", parsed.PageNumber)
	}
	if parsed.ResultPerPage != 456 {
		fmt.Printf("bad resultPerPage: %d\n", parsed.PageNumber)
	}
}
