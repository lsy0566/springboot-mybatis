** 게시판 (포스팅)
- Post entity 
- table
create table posts(
  id int auto_increment primary key, 
  user_id varchar(20) not null, 
  title varchar(100) not null, 
  contents text, 
  del_yn tinyint default 0 --1: deleted, 0: not deleted, 
  createdAt datetime
)
- service, 
    게시물추가, 전체 목록, 사용자별 목록
    게시물 상세보기, 게시물 삭제
- repository, mapper
- mapper.xml 
