package org.pet.clinic.web.bootstrap;

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
		
		ownerService.save( owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		
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
