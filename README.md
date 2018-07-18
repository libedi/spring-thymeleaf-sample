# spring-thymeleaf-sample 
## 1. Thymeleaf의 특징
- Thymeleaf는 JSTL의 요소기반과 다르게 속성기반이라 Natural Template이 가능.
- 때문에 디자인 팀과의 협업이 수월하고, HTML파일이라 바로 실행 가능.
- HTML5 지원 및 Spring Framework와의 호환성이 강점. (Spring Dialect 지원으로 확장기능 제공)
- Spring Boot에서 적극적으로 지원. (Auto-Configuration이 잘되어있어 별다른 설정없이 사용가능)
- fragment 기능을 이용하여 ajax 템플릿으로도 사용가능.
## 2. Syntax : [Thymeleaf Document](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
### 2.1. Text Binding
- `<p th:text="${text}">Basic Text Binding</p>`
- `<p th:utext="${escapeText}">Unescape Text Binding</p>`
- `<p th:text="'This is a' + ${text}">String Concat</p>`
### 2.2. loop
- `<tr th:each="item,status: ${list}">        <td th:text="${item.name}"></td>         </tr>`
