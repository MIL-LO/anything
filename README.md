# 🚀 Anything Lab

> **"궁금한 모든 것을 테스트할 수 있는 공간!"**  
> 다양한 기능과 기술을 실험하고 테스트하고 여러 가지 시도를 해볼 수 있는 **Sandbox Repository**입니다.  
---

## 🛠 개요
`Anything Repository`는 특정 목적 없이 다양한 기술, 기능, API, 성능 등을 자유롭게 테스트하는 공간입니다.  
필요에 따라 데이터베이스, 외부 API, 기타 기술들을 연동하여 실험할 수 있습니다.

<details>
    <summary>[Click] 📌 해당 Repository는 다음과 같은 테스트를 수행할 수 있습니다.</summary>

    - Spring Boot 기반 API 개발 및 실험
    - 다양한 데이터베이스(MySQL, PostgreSQL, Redis 등) 연결 테스트
    - OpenAI API와 같은 AI 관련 기능 테스트
    - GitHub Actions 및 CI/CD 파이프라인 실험
    - 새로운 라이브러리 또는 프레임워크 도입 및 검증
    - RESTful API & GraphQL API 테스트
    - 성능 테스트 및 로깅/모니터링 실험
    - 등등 그게 뭐든 어떤 것이든
</details>

# 👀 Grafana Monitoring
![Grafana Dashboard List](images/grafana_dashboard_list.png)
## 1. Spring Boot 3x Statistics 대시보드
Micrometer를 통해 수집된 Prometheus 메트릭을 활용하여, 애플리케이션의 전반적인 상태를 모니터링할 수 있도록 설계됨
### 주요 기능
- 애플리케이션의 전반적인 상태 모니터링
- HTTP 요청 및 응답 시간 분석
- JVM 메트릭 모니터링
- 대시보드 ID: `19004`
### 적용
![Spring Boot 3x Statistics](images/spring_boot_3_x_statistics.png)
## 2. Spring Boot HTTP (3.x) 대시보드
Spring Boot 애플리케이션의 HTTP 요청을 실시간으로 모니터링하며, Spring Boot Actuator를 통해 노출된 메트릭을 활용
### 주요 기능
- HTTP 요청 상태 코드별 모니터링 (20x, 4x0k, 5xox 등)
- 요청 처리 시간 분석
- 대시보드 ID: `21308`
### 적용
![Spring Boot HTTP (3.x) 대시보드](images/spring_boot_http_3_x.png)
## 3. JVM SpringBoot3 대시보드 (Prometheus Operator용)
Java Virtual Machine (JVM)의 성능 메트릭을 모니터링하기 위해 설계되었으 며, Prometheus Operator와 함께 사용
### 주요 기능:
- JVM 메모리 사용량 모니터링
- Garbage Collection(GC) 활동 추적
- 스레드 및 클래스 로딩 정보 제공
- 대시보드 ID: `22108`
### 적용
![JVM SpringBoot3](images/jvm_springboot3_dashboard.png)
# **올바른 실행 명령어**
- **Docker Compose v1 (구버전)**
  ```sh
  docker-compose up -d --build
  ```
- **Docker Compose v2 이상 (현재 표준)**
  ```sh
  docker compose up -d --build
  ```
# 추후 보안을 위한 필수 적용 리스트
## Spring Boot의 Spring Security
- actuator/prometheus 엔드포인트 보호
- hasRole적용 필요
- 접속 제한 IP리스트 적용 필요
## Prometheus 자체 보호
- Nginx 리버스 프록시 사용하여 인증 추가
- Prometheus 웹 UI(http://localhost:9090/graph 등)에 인증을 추가하거나 방화벽을 설정.
## Docker Network 내부에서만 접근 가능하도록 변경
- Prometheus와 Spring Boot를 같은 Docker 네트워크 안에 두고, 내부 네트워크에서만 통신하도록 변경.
