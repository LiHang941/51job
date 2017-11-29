--
SELECT count(coid) as co,coid FROM job j GROUP BY coid ORDER BY co desc
--
select * from job where coid  = '4697470' ORDER BY lastupdate desc;

--查询国企
SElect * from  job where cotype = '国企'
--
select count(*) from job where coid  = '4228328'