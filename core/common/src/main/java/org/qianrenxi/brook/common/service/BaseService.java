package org.qianrenxi.brook.common.service;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.qianrenxi.brook.repository.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class BaseService<T, ID extends Serializable, R extends SupportRepository<T, ID>> implements CrudService<T, ID> {

	protected R repository;

	@Autowired
	public <S extends R> void setRepository(S repository) {
		this.repository = repository;
	}

	@Override
	public <S extends T> S save(S entity) {
		return repository.saveAndFlush(entity);
	}

	@Override
	public <S extends T> Iterable<S> save(Iterable<S> entities) {
		return repository.save(entities);
	}

	@Override
	public T findOne(ID id) {
		return repository.findOne(id);
	}

	@Override
	public T getOne(ID id) {
		return repository.findOne(id);
	}

	@Override
	public boolean exists(ID id) {
		return repository.exists(id);
	}

	@Override
	public Iterable<T> findAll() {
		return repository.findAll();
	}

	@Override
	public Iterable<T> findAll(Iterable<ID> ids) {
		return repository.findAll(ids);
	}

	@Override
	public long count() {
		return repository.count();
	}
	
	@Override
	public void delete(ID id) {
		repository.delete(id);
	}

	@Override
	public void delete(List<ID> ids) {
		for (ID id : ids) {
			delete(id);
		}
	}

	@Override
	public void delete(ID[] ids) {
		delete(Arrays.asList(ids));
	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}

	@Override
	public void delete(Iterable<? extends T> entities) {
		repository.delete(entities);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public <S extends T> Iterable<S> findAll(S entity) {
		return repository.findAll(Example.of(entity));
	}

	@Override
	public <S extends T> Page<S> findAll(S entity, Pageable pageable) {
		return repository.findAll(Example.of(entity), pageable);
	}

}
