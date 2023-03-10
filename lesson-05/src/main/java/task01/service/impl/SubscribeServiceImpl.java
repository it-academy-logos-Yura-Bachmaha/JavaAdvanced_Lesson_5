package task01.service.impl;

import java.sql.SQLException;
import java.util.List;

import task01.dao.SubscribeDao;
import task01.dao.impl.SubscribeDaoImpl;
import task01.domain.Subscribe;
import task01.service.SubscribeService;

public class SubscribeServiceImpl implements SubscribeService {

	private SubscribeDao subscribeDao;

	public SubscribeServiceImpl() {
		try {
			subscribeDao = new SubscribeDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Subscribe create(Subscribe subscribe) {
		return subscribeDao.create(subscribe);
	}

	@Override
	public List<Subscribe> readAll() {
		return subscribeDao.readAll();
	}

	@Override
	public Subscribe read(Integer id) {
		return subscribeDao.read(id);
	}

	@Override
	public Subscribe update(Subscribe subscribe) {
		return subscribeDao.update(subscribe);
	}

	@Override
	public void delete(Integer id) {
		subscribeDao.delete(id);
	}

}