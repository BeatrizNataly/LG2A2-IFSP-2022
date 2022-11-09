INSERT INTO Proprietario(id, nome) VALUES (1, 'Francisco Arruda');
INSERT INTO Proprietario(id, nome) VALUES (2, 'Leandro Canindé');
INSERT INTO Proprietario(id, nome) VALUES (3, 'Guilherme Ofner');

INSERT INTO Veiculo(id, modelo, fk_proprietario) VALUES (1, 'Chevett',1);
INSERT INTO Veiculo(id, modelo, fk_proprietario) VALUES (2, 'Astra',1);
INSERT INTO Veiculo(id, modelo, fk_proprietario) VALUES (3, 'Fusca',2);
INSERT INTO Veiculo(id, modelo, fk_proprietario) VALUES (4, 'Jeep',3);
INSERT INTO Veiculo(id, modelo, fk_proprietario) VALUES (5, 'Duster',3);
INSERT INTO Veiculo(id, modelo, fk_proprietario) VALUES (6, 'Pálio',3);