(function() {
  var http = require('http');
  
  var srv = http.createServer(function(req, res) {
    res.end('Hello, ' + req.url);
  });

  var port = 9992;
  console.log("Listening on port " + port);
  srv.listen(port, '127.0.0.1');
})();
