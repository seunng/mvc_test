create table car( //테이블 생성
carNo number not null PRIMARY KEY,
carName VARCHAR2(100) not null,
carPrice number DEFAULT 0,
carVendor VARCHAR2(100) not null
);
drop table car;
insert into car
values(carno_seq.nextval, 'yf소나타',30000,'현대'); //데이터 추가
insert into CAR
values(carno_seq.nextval,'아이오닉',40000,'현대');
insert into CAR
values(carno_seq.nextval,'k9',100000,'kia');
insert into CAR
values(carno_seq.nextval,'k7',90000,'kia');
insert into CAR
values(carno_seq.nextval,'k5',40000,'kia');
insert into CAR
values(carno_seq.nextval,'k3',20000,'kia');
create SEQUENCE carno_seq; //carno 1부터 1씩 증가하게 
select carno_seq.nextval from dual ;
select * from car; //car 데이터 보기
select carno,carname from car //carno,carname만 보이게

/*where CARPRICE>=50000 and carno>=5 or carno=1 

order by carno desc*/
where carname like 'k%' ‘%k%’ ‘%k’
;
drop sequence carno_seq ;
drop table car;