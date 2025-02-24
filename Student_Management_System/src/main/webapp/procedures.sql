create or replace procedure sms_proc_retrieve_admin
(aid IN number,pword IN varchar2,fname OUT varchar2,lname OUT varchar2,mail OUT varchar2,pno OUT varchar2)is
begin
select first_name,last_name,email,phone_number into fname,lname,mail,pno from admin where admin_id =aid and password = pword;
end;
/ 