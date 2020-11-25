package org.pet.clinic.web.bootstrap;

import java.time.LocalDate;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.model.Pet;
import org.pet.clinic.data.model.PetType;
import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.services.OwnerService;
import org.pet.clinic.data.services.PetService;
import org.pet.clinic.data.services.PetTypeService;
import org.pet.clinic.data.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 
 * @author perica
 *
 */
@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final PetService petService;
	

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			PetService petService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public void run(String...args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerl");
		owner1.setCity("Miami");
		owner1.setTelephone("123412342");
		
		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now().minusYears(8));
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);
		
		ownerService.save( owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerl");
		owner2.setCity("Miami");
		owner2.setTelephone("123412342");
		
		Pet fionasCat = new Pet();
		fionasCat.setName("Just Cat");
		fionasCat.setOwner(owner2);
		fionasCat.setBirthDate(LocalDate.now());
		fionasCat.setPetType(savedCatPetType);
		
		owner2.getPets().add(fionasCat);
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
	}
}
