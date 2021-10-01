CREATE TABLE IF NOT EXISTS userinfo (
  id Integer NOT NULL PRIMARY KEY,
  name VARCHAR(50),
  sex CHAR(1)
);

INSERT INTO userinfo (
  id,
  name,
  sex
) VALUES (
  1,
  '山田太郎',
  '男'
), (
  2,
  '佐藤花子',
  '女'
);

SET PASSWORD FOR root@localhost = PASSWORD('pass');

INSERT INTO userinfo (
  id,
  name,
  sex
) VALUES (
  3,
  '大谷翔平',
  '男'
);
