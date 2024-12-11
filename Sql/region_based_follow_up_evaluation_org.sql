create table if not exists region_based_follow_up_evaluation_org(
follow_up_evaluation_org_code bigint not null,
routine_impact_analysys varchar(255) null,
follow_up_evaluation_org_region varchar(255) null,
follow_up_evaluation_org_level varchar(255) null,
metadata_code bigint null,
moduledata varchar(255) null,
remarks varchar(255) null,
content varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint region_based_follow_up_evaluation_org_pk primary key(follow_up_evaluation_org_code));