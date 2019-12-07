#### Some Notes for you

* Swagger2   __For Documentation__
* Exception Handling __@ExceptionHandler, @ControllerAdvice__



* forhughes.cxsp3c1bpdio.ap-south-1.rds.amazonaws.com

create database training;
use training;
persons
	id int primary key auto_increment
	name varchar(40)
	age int(3)

```sql
create table persons(id int(4) not null primary key auto_increment, name varchar(40), age int(4));
```


## Spring Tool Suite

* 

* Spring 5.x
* Spring Boot 2.x
* Cloud
* Lightweight container
* POJO framework
* Dependency Injection
interface AccountHome {
}
interface AccountRemote {
}
class AccountBean implements EntityBean {
	//no constructor
	//no static methods
	//no final variables
	//not use threads
	//should not extends an abstract class
}
ejb-jar.xml
container specific xml
.jar


class Account {
	id, balance
	deposit(amount) {
	}
	withdraaw(amount) {
	}
	transferFund(to, amount) {
	}
}
* Object Pooling
* Transaction Service
* Security

EJB

## Notes

* Spring 5.x
* Dependency Injection (Don'tc call me I will call you)
* Services (facilities; business logic; )
* Spring Boot (only focus on business logic; less configuration; provides quickstart;; embedded server;less work))