insert into users (username, password, enabled, role) select 'admin@shop.pl','$2a$10$5gKX2W7v2qJlP7BWTm0gDer0vMTDTzg0yL881QDfB1cSoYzEGvwkW', 1, 'ADMIN'
from dual
where not exists (select 1 from users where username = 'admin@shop.pl');