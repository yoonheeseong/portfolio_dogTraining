<h1>DOGOMI - 팀 프로젝트</h1>
<br>

![image](https://github.com/yoonheeseong/portfolio_dogTraining/assets/146051681/36ccd2e7-9e1f-4053-b387-5436a08bb5b0)

<br>
<br>

## 프로젝트 링크

https://yoonheeseong.github.io/portfolio_dogTraining/
<br>

## 프로젝트 목적
<br>

- 반려견 훈련소에 대해 찾아보거나 예약을 할 때 훈련소 정보를 한눈에 찾아보기 어렵다.
- 또한 견주들끼리 교육에 관한 정보를 나눌 커뮤니티도 마땅치 않음
- 이번 프로젝트를 통해 훈련소 정보와 각 훈련소에서 제공하는 훈련에 대한 정보, 훈련 예약 시스템을 보다 쉽게 접근할 수 있게 제작하는 것이 목표

---

## 프로젝트 인원
<br>

- 프론트 1명, 백엔드 4명

<br>

---

## 프로젝트 기간
<br>

- 2023-11-16 ~ 2023-11-29

![image](https://github.com/yoonheeseong/portfolio_dogTraining/assets/146051681/01a4f741-7fbd-446f-863b-af1695c20fa0)

<br>

---

## 팀 개발 환경
<br>

- 운영체제 : Windows
- 개발도구 : Visual Studio Code, Intellij
- DB : Mysql
- Server : Apache Tomcat 9.0.82
- Language: HTML5, CSS3, JavaScript, JQuery, AJax, Java, Jstl, JSP
- FrameWork: Spring, MyBatis

<br>

---

## 내가 사용한 기술 스택
<br>

- 운영체제 : Windows
- 개발도구 : Visual Studio Code, Intellij
- DB : Mysql
- Server : Apache Tomcat 9.0.82
- Language: HTML5, CSS3, Java, Jstl, JSP
- FrameWork: Spring, MyBatis

<br>

---

## 맡은 파트
<br>

백엔드

- 훈련소 검색페이지(훈련소의 주소, 훈련 과목, 강아지의 크기(강아지 크기마다 제공하는 훈련이 달라진다) 분류에 따른 조건 검색 기능)
- 이벤트 페이지(이벤트 리스트, 이벤트 상세 정보)
- 고객센터 페이지(FAQ)
- 데이터베이스 설계 및 테이블 생성

<br>

---

## ER-다이어그램
<br>

![image](https://github.com/yoonheeseong/portfolio_dogTraining/assets/146051681/1b464463-71ec-41bf-a3df-0639919b8990)

<br>

---

## **검색 페이지**
<br>

###### - 검색 전 화면

![image](https://github.com/yoonheeseong/portfolio_dogTraining/assets/146051681/2048ab37-e2c6-46ed-9443-cc328d671086)

- 네비 메뉴의 훈련소 찾기 링크를 통해 이동하면 보이는 화면이다.
- 데이터베이스에 저장되어 있는 훈련소의 정보들을 모두 가져와서 10개씩 보여주며, 페이지를 통해 이전/다음 데이터들을 볼 수 있는 페이지네이션 기능을 적용하였다.
  <br>
  <br>

###### - 검색 후 화면

![image](https://github.com/yoonheeseong/portfolio_dogTraining/assets/146051681/fb15e135-88d9-4263-960f-fb62d7faf97b)

- 검색 조건들을 선택하고 검색을 누를 시 데이터베이스의 훈련소 정보들 중 검색 조건에 맞는 훈련소들만 나열되며, 검색 조건을 선택하지 않고 검색을 누를 시 데이터베이스의 있는 모든 훈련소의 정보를 가져와서 나열한다.
- 검색후에도 페이지네이션 기능이 마찬가지로 적용된다.

<br>

---

## **이벤트 페이지**
<br>

###### - 이벤트 리스트

![screencapture-localhost-8080-app-event-listPage-2023-12-06-11_54_25](https://github.com/yoonheeseong/portfolio_dogTraining/assets/146051681/8d06d65b-280d-4201-9219-897adc9e5660)

- 데이터베이스에 저장되어 있는 이벤트 정보들을 10개씩 가져와 리스트화 하고 최신순으로 나열한다. 이 페이지 역시 페이지네이션 기능을 적용하였다.

<br>

##### - 이벤트 상세 정보

![screencapture-localhost-8080-app-event-info-2023-12-06-11_58_07](https://github.com/yoonheeseong/portfolio_dogTraining/assets/146051681/7767492a-8907-4541-907a-8ed1ab0ae323)

- 이벤트를 클릭하면 그 이벤트의 상세 정보를 보여준다.

<br>

---

## **FAQ(고객센터) 페이지**
<br>

![image](https://github.com/yoonheeseong/portfolio_dogTraining/assets/146051681/f028cf7e-6268-4d4e-98ed-187eff839ab6)

- 자바 스크립트의 제이쿼리를 이용하여 슬라이드 토글을 적용시켜 FAQ의 제목을 클릭하면 그 클릭한 제목에 대한 내용을 보여준다.

<br>


