package kr.re.add.par;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kr.re.add.par.mapper.RecordMapper;

@SpringBootApplication
public class ParApplication implements CommandLineRunner{

	private final RecordMapper recordMapper;

	public ParApplication(RecordMapper recordMapper) {
		this.recordMapper = recordMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(ParApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.recordMapper.selectRecord());
	}

}
