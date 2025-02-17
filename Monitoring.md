# 👀 Grafana Monitoring
![스크린샷 2025-02-18 오전 1.09.07.png](..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fpt%2F10w6628s0tg0xswnn1r970mm0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_c6kqNO%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-02-18%20%EC%98%A4%EC%A0%84%201.09.07.png)
## 1. Spring Boot 3x Statistics 대시보드
Micrometer를 통해 수집된 Prometheus 메트릭을 활용하여, 애플리케이션의 전반적인 상태를 모니터링할 수 있도록 설계됨
### 주요 기능
- 애플리케이션의 전반적인 상태 모니터링 
- HTTP 요청 및 응답 시간 분석 
- JVM 메트릭 모니터링 
- 대시보드 ID: `19004`
### 적용
![스크린샷 2025-02-18 오전 1.08.54.png](..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fpt%2F10w6628s0tg0xswnn1r970mm0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_Cr8mws%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-02-18%20%EC%98%A4%EC%A0%84%201.08.54.png)
## 2. Spring Boot HTTP (3.x) 대시보드
Spring Boot 애플리케이션의 HTTP 요청을 실시간으로 모니터링하며, Spring Boot Actuator를 통해 노출된 메트릭을 활용
### 주요 기능
- HTTP 요청 상태 코드별 모니터링 (20x, 4x0k, 5xox 등)
- 요청 처리 시간 분석 
- 대시보드 ID: `21308`
### 적용
![스크린샷 2025-02-18 오전 1.08.33.png](..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fpt%2F10w6628s0tg0xswnn1r970mm0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_QdnHCc%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-02-18%20%EC%98%A4%EC%A0%84%201.08.33.png)
## 3. JVM SpringBoot3 대시보드 (Prometheus Operator용)
Java Virtual Machine (JVM)의 성능 메트릭을 모니터링하기 위해 설계되었으 며, Prometheus Operator와 함께 사용됩니다.
### 주요 기능:
- JVM 메모리 사용량 모니터링
- Garbage Collection(GC) 활동 추적 
- 스레드 및 클래스 로딩 정보 제공 
- 대시보드 ID: `22108`
### 적용
![스크린샷 2025-02-18 오전 1.08.17.png](..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fpt%2F10w6628s0tg0xswnn1r970mm0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_hPT4Is%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-02-18%20%EC%98%A4%EC%A0%84%201.08.17.png)
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

