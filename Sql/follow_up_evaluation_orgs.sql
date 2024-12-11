create table if not exists follow_up_evaluation_orgs(
follow_up_evaluation_org_code bigint not null,
follow_up_evaluation_org_name varchar(255) null,
follow_up_evaluation_org_desc varchar(255) null,
remarks varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint follow_up_evaluation_orgs_pk primary key(follow_up_evaluation_org_code));