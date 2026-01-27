package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository=inhousePartRepository;

    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if (partRepository.count() == 0) {

            InhousePart SSD = new InhousePart();
            SSD.setName("Solid State Drive (SSD)");
            SSD.setPrice(300.00);
            SSD.setInv(40);
            inhousePartRepository.save(SSD);

            InhousePart RAM = new InhousePart();
            RAM.setName("RAM (Memory)");
            RAM.setPrice(200.00);
            RAM.setInv(40);
            inhousePartRepository.save(RAM);

            InhousePart GraphicsCard = new InhousePart();
            GraphicsCard.setName("Graphics Card");
            GraphicsCard.setPrice(1200.00);
            GraphicsCard.setInv(40);
            inhousePartRepository.save(GraphicsCard);

            InhousePart PowerSupplies = new InhousePart();
            PowerSupplies.setName("Power Supplies");
            PowerSupplies.setPrice(150.00);
            PowerSupplies.setInv(60);
            inhousePartRepository.save(PowerSupplies);

            InhousePart Motherboards = new InhousePart();
            Motherboards.setName("Motherboards");
            Motherboards.setPrice(400.00);
            Motherboards.setInv(30);
            inhousePartRepository.save(Motherboards);

            partRepository.save(SSD);
            partRepository.save(RAM);
            partRepository.save(GraphicsCard);
            partRepository.save(PowerSupplies);
            partRepository.save(Motherboards);
        }

        if (outsourcedPartRepository.count() == 0) {

           /* OutsourcedPart Monitor = new OutsourcedPart();
            Monitor.setName("External Monitors");
            Monitor.setPrice(80.00);
            Monitor.setInv(10);
            Monitor.setCompanyName("GCorp");

            OutsourcedPart KeyboardMouseSet = new OutsourcedPart();
            KeyboardMouseSet.setName("External Keyboard & Mouse set");
            KeyboardMouseSet.setPrice(30.00);
            KeyboardMouseSet.setInv(10);
            KeyboardMouseSet.setCompanyName("GCorp");

            OutsourcedPart Speaker = new OutsourcedPart();
            Speaker.setName("External Speaker");
            Speaker.setPrice(50.00);
            Speaker.setInv(10);
            Speaker.setCompanyName("GCorp");

            OutsourcedPart Webcam = new OutsourcedPart();
            Webcam.setName("Webcam");
            Webcam.setPrice(20.00);
            Webcam.setInv(10);
            Webcam.setCompanyName("GCorp");

            OutsourcedPart VideoCable = new OutsourcedPart();
            VideoCable.setName("HDMI or DisplayPort Cable");
            VideoCable.setPrice(10.00);
            VideoCable.setInv(10);

            outsourcedPartRepository.save(Monitor);
            outsourcedPartRepository.save(KeyboardMouseSet);
            outsourcedPartRepository.save(Speaker);
            outsourcedPartRepository.save(Webcam);
            outsourcedPartRepository.save(VideoCable); */
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
        Product GamingPCs= new Product("Gaming PCs",3000.00,20);
        Product ProWorkstation= new Product("Professional Workstations",8000.00,10);
        Product Laptops= new Product("Laptops",2000.00,50);
        Product MiniPCs= new Product("Mini PCs",400.00,30);
        Product Allin1Computers= new Product("All-in-One Computers",2400.00,10);
        productRepository.save(GamingPCs);
        productRepository.save(ProWorkstation);
        productRepository.save(Laptops);
        productRepository.save(MiniPCs);
        productRepository.save(Allin1Computers);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());
    }
}
