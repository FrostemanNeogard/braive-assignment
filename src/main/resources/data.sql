INSERT INTO organizations (id, name) VALUES 
('10000000-0000-0000-0000-000000000001', 'Wellspring Clinic'),
('10000000-0000-0000-0000-000000000002', 'Inner Peace Center'),
('10000000-0000-0000-0000-000000000003', 'The Mind Hub');


INSERT INTO psychologists (id, name, national_id_num, date_of_birth, organization_id) VALUES
('20000000-0000-0000-0000-000000000001', 'Dr. Sarah Smith', '851020-1234', '1985-10-20', '10000000-0000-0000-0000-000000000001');

INSERT INTO psychologists (id, name, national_id_num, date_of_birth, organization_id) VALUES
('20000000-0000-0000-0000-000000000002', 'Dr. John Doe', '780115-5678', '1978-01-15', '10000000-0000-0000-0000-000000000002');

INSERT INTO psychologists (id, name, national_id_num, date_of_birth, organization_id) VALUES
('20000000-0000-0000-0000-000000000003', 'Dr. Emma Stone', '900501-9012', '1990-05-01', '10000000-0000-0000-0000-000000000003');


INSERT INTO patients (id, name, national_id_num, date_of_birth, organization_id, psychologist_id) VALUES
('30000000-0000-0000-0000-000000000001', 'Alice Johnson', '030607-9187', '2003-06-07', '10000000-0000-0000-0000-000000000001', '20000000-0000-0000-0000-000000000001');

INSERT INTO patients (id, name, national_id_num, date_of_birth, organization_id, psychologist_id) VALUES
('30000000-0000-0000-0000-000000000002', 'Bob Williams', '950228-3456', '1995-02-28', '10000000-0000-0000-0000-000000000002', '20000000-0000-0000-0000-000000000002');

INSERT INTO patients (id, name, national_id_num, date_of_birth, organization_id, psychologist_id) VALUES
('30000000-0000-0000-0000-000000000003', 'Clara Davies', '001111-7890', '2000-11-11', '10000000-0000-0000-0000-000000000003', NULL);
