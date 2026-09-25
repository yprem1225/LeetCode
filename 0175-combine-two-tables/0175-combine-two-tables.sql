# Write your MySQL query statement below
select Person.firstname, Person.lastname, Address.city , Address.state 
from Person
Left join Address
on Person.personId = Address.personId; 