package com.pokemonreview.api;

import com.pokemonreview.api.models.Pokemon;
import com.pokemonreview.api.models.Role;
import com.pokemonreview.api.models.UserEntity;
import com.pokemonreview.api.repository.PokemonRepository;
import com.pokemonreview.api.repository.RoleRepository;
import com.pokemonreview.api.repository.UserRepository;
import com.pokemonreview.api.utils.PokemonVO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		System.out.println("Pokemon service app is running!");
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository,
										PokemonRepository pokemonRepository,
										RoleRepository roleRepository) {
		return getCommandLineRunner(userRepository, pokemonRepository, roleRepository);
	}

	private static CommandLineRunner getCommandLineRunner(UserRepository userRepository, PokemonRepository pokemonRepository, RoleRepository roleRepository) {
		return args -> {
			PasswordEncoder passEncoder = new BCryptPasswordEncoder();

			Role role = new Role("USER");
			roleRepository.save(role);

			UserEntity ashKetchum = new UserEntity("ash", passEncoder.encode("ash123"), Collections.singletonList(role));
			UserEntity leon = new UserEntity("leon", passEncoder.encode("leon123"), Collections.singletonList(role));
			List<UserEntity> pokemonMasters = Arrays.asList(ashKetchum, leon);
			userRepository.saveAll(pokemonMasters);


			PokemonVO pokemonVO = new PokemonVO();
			List<Pokemon> pokemonList = pokemonVO.getPokemonList();

			// Save the list of Pokemon to the repository
			pokemonRepository.saveAll(pokemonList);
		};
	}
}
