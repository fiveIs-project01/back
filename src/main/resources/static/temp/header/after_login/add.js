import Load from "/temp/load.js";

fetch("/temp/header/after_login")
.then(response=> response.text())
.then(html => {
  const parser = new DOMParser();
  const doc = parser.parseFromString(html, 'text/html');
  const content = doc.querySelector('header');            // 삽입할 컨텐츠 선택

  document.getElementById('header-placeholder').appendChild(content);    // 원하는 곳에 컨텐츠 삽입

  new Load(doc);                                                          // css, js 파일 로드
})
.catch(error => console.error('Error fetching header :', error));         // 에러 메시지 설정