
function doSomething() {
  var merged = arr.reduce(function(a, b) {
    a.concat(b);
  }); // Noncompliant: No return statement

  var package = document.getElementsByName("foo"); // Noncompliant

  var j = 0;
  while (true) { // Noncompliant; constant end condition
    j++;
  }
  
}


