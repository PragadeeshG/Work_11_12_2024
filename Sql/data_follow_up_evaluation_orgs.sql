create table if not exists data_follow_up_evaluation_orgs(
follow_up_evaluation_org_code bigint not null,
modular_data varchar(255) null,
data_reqion varchar(255) null,
follow_up_evaluation_org_team varchar(255) null,
contact varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint data_follow_up_evaluation_orgs_pk primary key(follow_up_evaluation_org_code));