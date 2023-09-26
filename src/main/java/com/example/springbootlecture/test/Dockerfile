FROM mysql:8.0

# MySQL 환경 변수 설정
ENV MYSQL_ROOT_PASSWORD=my-secret-pw
ENV MYSQL_DATABASE=mydatabase

# MySQL 외부 접속 허용 설정을 위한 my.cnf 추가
COPY my.cnf /etc/mysql/conf.d/my.cnf
