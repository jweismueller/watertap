package watertap.service;

import watertap.domain.b.BStart;

public interface WatertapService {

	String execute(String name) throws Exception;

	BStart load(Long id) throws Exception;
}
