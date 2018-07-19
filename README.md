# spring-thymeleaf-sample 
## 1. Thymeleaf의 특징
- Thymeleaf는 JSP와 같이 서블릿 의존성이 없어 Natural Template이 가능.
- Thymeleaf는 JSTL의 요소기반과 다르게 속성기반이라 Natural Template이 가능.
- 때문에 디자인 팀과의 협업이 수월하고, HTML파일이라 바로 실행 가능.
- HTML5 지원 및 Spring Framework와의 호환성이 강점. (SpEL, Spring Dialect 지원으로 확장기능 제공)
- Spring Boot에서 적극적으로 지원. (Auto-Configuration이 잘 되어있어 별다른 설정없이 사용가능)
- fragment 기능을 이용하여 ajax 템플릿으로도 사용가능.
## 2. Syntax : [Thymeleaf Document](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
### 2.1. Text Binding - 참고소스 : [text.html](https://github.com/libedi/spring-thymeleaf-sample/blob/master/demo-thymeleaf/src/main/resources/templates/text.html)
- `<p th:text="${text}">Basic Text Binding</p>`
- `<p th:utext="${escapeText}">Unescape Text Binding</p>`
- `<p th:text="'This is a' + ${text}">String Concatenation</p>`
- `<p th:text="#{message.source}">Load Message Source</p>`
- `<p th:text="#{message.source('param')}">Load Message Source with Parameter</p>`
### 2.2. Loop - 참고소스 : [loop.html](https://github.com/libedi/spring-thymeleaf-sample/blob/master/demo-thymeleaf/src/main/resources/templates/loop.html)
- `<tr th:each="item,status: ${list}"> <td th:text="'index: ' + ${status.index} + ', name: ' + ${item.name}"></td> </tr>`
- status
  - index : zero-based current index
  - count : one-based current index
  - size
  - current
  - even/odd : Whether the current iteration is even or odd. boolean value
  - first : Whether the current iteration is the first one. boolean value
  - last : Whether the current iteration is the last one. boolean value
### 2.3. Condition - 참고소스 : [condition.html](https://github.com/libedi/spring-thymeleaf-sample/blob/master/demo-thymeleaf/src/main/resources/templates/condition.html)
- `<p th:if="${trueCondition}">Display</p>`
- `<p th:if="${falseCondition}">Not Display</p>`
- `<p th:unless="${falseCondition}">Display</p>`
- `<p th:unless="${trueCondition}">Not Display</p>`
-
  `<div th:switch="${switchCase}">`  
  ` <p th:case="'case1'">Case1 : Display</p>`  
  ` <p th:case="'case2'">Case2 : Not Display</p>`  
  ` <p th:case="*">Default : Not Display</p>`  
  `</div>`
### 2.4. Layout - 참고소스 : [default.html](https://github.com/libedi/spring-thymeleaf-sample/blob/master/demo-thymeleaf/src/main/resources/templates/layout/default.html), [header.html](https://github.com/libedi/spring-thymeleaf-sample/blob/master/demo-thymeleaf/src/main/resources/templates/layout/header.html), [footer.html](https://github.com/libedi/spring-thymeleaf-sample/blob/master/demo-thymeleaf/src/main/resources/templates/layout/footer.html), [layout-content.html](https://github.com/libedi/spring-thymeleaf-sample/blob/master/demo-thymeleaf/src/main/resources/templates/layout-content.html)
- Dependency 추가 : Spring Boot 사용시 version 관리가 되므로 version은 안적어도 됨.
  - `<dependency>`  
		    `<groupId>nz.net.ultraq.thymeleaf</groupId>`  
		    `<artifactId>thymeleaf-layout-dialect</artifactId>`  
        `<version>2.3.0</version>`
		`</dependency>`
