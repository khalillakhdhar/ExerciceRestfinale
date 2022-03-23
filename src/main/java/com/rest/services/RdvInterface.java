package com.rest.services;

import java.util.List;
import java.util.Optional;

import com.rest.entities.Rdv;

public interface RdvInterface {
Rdv createOneRdv(Rdv rdv);
List<Rdv> listerRdv();
void deleteRdv(int id);
List<Rdv> searchTitre(String titre);
List<Rdv> searchDescriptionContent(String content);
Optional<Rdv> searchRdvByid(int id);
}
