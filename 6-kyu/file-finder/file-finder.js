function search(files) {
  let fileResults = [];
​
  Object.keys(files).forEach(file => {
    searchFile(files[file], [file], fileResults);  
  });
​
  if (fileResults.length === 0) {
    throw new Error('No files!');
  }
  
​
  return fileResults.join("/");
}
​
function searchFile(file, currentPath, results) {
  Object.keys(file).forEach(key => {
    if (typeof file[key] === "string") {
      results.push([...currentPath, key].join("/")); 
    }
    if (typeof file[key] === "object") {
      searchFile(file[key], [...currentPath, key], results);
    }
  });
}