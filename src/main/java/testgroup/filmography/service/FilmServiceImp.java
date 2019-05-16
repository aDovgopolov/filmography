package testgroup.filmography.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testgroup.filmography.dao.FilmDAO;
import testgroup.filmography.dao.FilmDAOImpl;
import testgroup.filmography.model.Film;
import java.util.List;

//@Service
public class FilmServiceImp implements FilmService {

    private FilmDAO filmDAO = new FilmDAOImpl();
    private int i = 1;
    @Override
    @Transactional
    public List<Film> allFilms() {
        return filmDAO.allFilms();
    }

    @Override
    @Transactional
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Override
    @Transactional
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Override
    @Transactional
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Override
    @Transactional
    public Film getById(int id) {
        return filmDAO.getById(id);
    }
}
