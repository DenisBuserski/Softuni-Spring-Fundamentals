# Softuni-Spring-Fundamentals

## Additional information
- HTTP 
  - Hyper Text Transfer Protocol
  - This is how the client communicates with the server
  - Stateless - HTTP does not keep states(Does not keep information)
  - Cookies - Information, about you which is kept


- Web client -> HTTP request -> Web server -> HTTP response -> Web client
  - When we open a web page we send a request to the server
  - When the web page opens, that means the server has returned a response
  - If the server is more powerful we would get the response faster(This also depends on the internet speed)


- HTTP methods
  - [HTTP methods](https://www.w3schools.com/tags/ref_httpmethods.asp)
  - GET - Retrieve
  - HEAD - Identical to GET
  - POST - Create
  - PUT - Create/Update
  - PATCH - Update a specified part of the resource
  - DELETE - Remove


- URL
  - Example - http://mysite.com:8080/demo/index.php?id=27&lang=en#lectures

  | http://                                                                                       | mysite.com | :8080                                             | demo/index.php | id=27&lang=en                        | #lectures |
  |-----------------------------------------------------------------------------------------------|------------|---------------------------------------------------|----------------|--------------------------------------|-----------|
  | Protocol                                                                                      | Host       | Port                                              | Path           | Query string                         | Fragment  |
  | We can have FTP instead of HTTP, in this case the file would be loaded from our Local machine |            | The channel where the resource should be accessed |                | Everything after ? is a query string |           |
  |                                                                                               |            | On 1 port we can have only 1 application          |                | It's not a mandatory part of the URL |           |
  |                                                                                               |            | From 0 to 65535                                   |                | It's placed between ? and &          |           |

   |                      |                          |                                                                                   |                                                              |
   |----------------------|--------------------------|-----------------------------------------------------------------------------------|--------------------------------------------------------------|
   | Content-Type:        | application/json         | Resource type                                                                     |                                                              |
   | Content-Type:        | text/html; charset=utf-8 | If there is html, it can be under utf-8(It can hold cyrillic and chinese letters) |                                                              |
   | Content-Type:        | application/pdf          | What format have we received                                                      |                                                              |
   | Content-Disposition: | attachment;              | The form under which we have received the PDF file                                | A presentation which we can watch online and we can download |

   |                   |                                              | 
   |-------------------|----------------------------------------------|
   | Status            |                                              | 
   | Version           | HTTP protocol version                        | 
   | Transferred       | Information, which was sent as size          |
   | content-length    | Resource length in symbols                   |
   | content-type      | Resource type                                |
   | date              | The date when the resource was last modified |
   | Accepted-Language | The language, which is used                  |
   | User-Agent        | The browser, which is used                   |


- Status codes

  | Code    |              |                                                                                       | Example                                        | 
  |---------|--------------|---------------------------------------------------------------------------------------|------------------------------------------------|
  | 200     | OK           | Resource was successfully delivered                                                   |                                                |
  | 201     | Created      | Created new resource                                                                  | New comment in the forum                       |
  | 204     | No content   |                                                                                       |                                                |
  | 301/302 | Moved        | The link is old                                                                       | wikipedia.bg will transfer us to wikipedia.org |
  | 400     | Bad request  | The client has send an invalid information                                            |                                                |
  | 401/403 | Unauthorized | When a client is trying to access a part of a page, for which he does not have access |                                                |
  | 404     | No found     | The resource with this link has not been found; Client mistake                        |                                                |
  | 409     | Conflict     | Creating a user with an existing email                                                |                                                |
  | 500/503 | Server error |                                                                                       |                                                |

  | Code       |                                                                               | 
  |------------|-------------------------------------------------------------------------------|
  | 200 to 299 | The request has passed successfully                                           | 
  | 300 to 399 | The request has passed, but something could be made better or it was improved | 
  | 400 to 499 | The client has made a mistake                                                 | 
  | 500+       | Server errors                                                                 |


- OSI Model(Open System Interconnect) - 7 Layers
  - All => Application layer 
  - People => Presentation layer 
  - Seem => Session layer 
  - To => Transport layer 
  - Need => Network layer 
  - Data => Data link layer 
  - Processing => Physical layer


- XHR
  - XML HTTP request
  - Example - When you watch a YouTube video and in parallel you load the comments under the video
  - It is executed asynchronously


- gzip
  - Algorithm for compression 
  - The more compressed a file is, the faster it will travel over the network


- TTFB(Time To First Byte)
  - What is the time for which we will receive 1 byte of information
  - It is done for performance 

  
