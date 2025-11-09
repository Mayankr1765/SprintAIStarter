package com.genai.ollama.SpringAI.CarPucho.Tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class CarDetailsFetcher {

    @Tool(name="car_details_api" , description = "Fetch latest car details from external api")
    public String fetchCarDetails(){
        return """
                [
                  {"name":"Maruti Alto K10","manufacturer":"Maruti Suzuki","segment":"Hatchback","price":5.2,"features":["1.0L Petrol Engine","ABS with EBD","2 airbags","Manual AC"]},
                  {"name":"Maruti Swift","manufacturer":"Maruti Suzuki","segment":"Hatchback","price":7.3,"features":["1.2L Petrol Engine","LED DRLs","SmartPlay infotainment","Rear parking sensors"]},
                  {"name":"Maruti Baleno","manufacturer":"Maruti Suzuki","segment":"Hatchback","price":8.2,"features":["1.2L DualJet Petrol","Auto climate control","6 airbags","Apple CarPlay"]},
                  {"name":"Tata Tiago","manufacturer":"Tata Motors","segment":"Hatchback","price":6.5,"features":["1.2L Revotron Engine","Dual Airbags","Touchscreen","ABS with EBD"]},
                  {"name":"Tata Altroz","manufacturer":"Tata Motors","segment":"Hatchback","price":8.8,"features":["1.5L Diesel Engine","Premium Interiors","Cruise Control","Projector Headlamps"]},
                  {"name":"Hyundai i20","manufacturer":"Hyundai","segment":"Hatchback","price":9.5,"features":["1.2L Petrol","Cruise Control","Wireless Charger","Voice enabled sunroof"]},
                  {"name":"Hyundai Grand i10 Nios","manufacturer":"Hyundai","segment":"Hatchback","price":6.9,"features":["1.2L Petrol","8-inch Display","Rear AC vents","LED tail lamps"]},
                  {"name":"Toyota Glanza","manufacturer":"Toyota","segment":"Hatchback","price":8.3,"features":["1.2L Petrol","9-inch Touchscreen","Auto headlamps","Rear Camera"]},
                  {"name":"Renault Kwid","manufacturer":"Renault","segment":"Hatchback","price":5.5,"features":["0.8L Petrol","Touchscreen Display","LED DRLs","Digital Cluster"]},
                  {"name":"Nissan Magnite","manufacturer":"Nissan","segment":"SUV","price":10.2,"features":["1.0L Turbo Petrol","360 Camera","Wireless Charging","Hill Start Assist"]},
                  {"name":"Kia Sonet","manufacturer":"Kia","segment":"SUV","price":13.1,"features":["1.0L Turbo Engine","Sunroof","BOSE Speakers","Ventilated Seats"]},
                  {"name":"Hyundai Venue","manufacturer":"Hyundai","segment":"SUV","price":12.6,"features":["1.2L Petrol","Connected Car Tech","Wireless Charger","6 Airbags"]},
                  {"name":"Maruti Brezza","manufacturer":"Maruti Suzuki","segment":"SUV","price":12.8,"features":["1.5L Petrol","Hybrid Tech","360 Camera","Sunroof"]},
                  {"name":"Mahindra XUV300","manufacturer":"Mahindra","segment":"SUV","price":13.2,"features":["1.2L Turbo Petrol","7-inch Infotainment","Dual Zone AC","ESP"]},
                  {"name":"Mahindra XUV700","manufacturer":"Mahindra","segment":"SUV","price":20.8,"features":["2.0L Turbo Petrol","ADAS","Panoramic Sunroof","Drive Modes"]},
                  {"name":"Hyundai Creta","manufacturer":"Hyundai","segment":"SUV","price":16.2,"features":["1.5L Turbo","ADAS","Ambient Lighting","Ventilated Seats"]},
                  {"name":"Kia Seltos","manufacturer":"Kia","segment":"SUV","price":17.1,"features":["1.5L Turbo Petrol","ADAS","Dual Screen Display","360 Camera"]},
                  {"name":"Tata Harrier","manufacturer":"Tata Motors","segment":"SUV","price":18.9,"features":["2.0L Diesel","Panoramic Sunroof","Terrain Modes","360 Camera"]},
                  {"name":"Tata Safari","manufacturer":"Tata Motors","segment":"SUV","price":21.3,"features":["2.0L Diesel","Captain Seats","Panoramic Roof","Premium Sound"]},
                  {"name":"MG Hector","manufacturer":"MG","segment":"SUV","price":19.7,"features":["1.5L Turbo Petrol","ADAS","Panoramic Sunroof","10.4-inch Display"]},
                  {"name":"MG Astor","manufacturer":"MG","segment":"SUV","price":13.5,"features":["AI Assistant","ADAS L2","Sunroof","Digital Cluster"]},
                  {"name":"Skoda Kushaq","manufacturer":"Skoda","segment":"SUV","price":15.4,"features":["1.0L TSI","6 Airbags","TPMS","Sunroof"]},
                  {"name":"Volkswagen Taigun","manufacturer":"Volkswagen","segment":"SUV","price":15.6,"features":["1.0L TSI","Ventilated Seats","LED Headlamps","Digital Cockpit"]},
                  {"name":"Toyota Urban Cruiser Hyryder","manufacturer":"Toyota","segment":"SUV","price":18.1,"features":["Strong Hybrid","All-Wheel Drive","9-inch Display","Cruise Control"]},
                  {"name":"Maruti Grand Vitara","manufacturer":"Maruti Suzuki","segment":"SUV","price":17.8,"features":["Strong Hybrid","AWD","360 Camera","Head-Up Display"]},
                  {"name":"Honda Elevate","manufacturer":"Honda","segment":"SUV","price":13.9,"features":["1.5L i-VTEC","ADAS","Sunroof","Wireless Charging"]},
                  {"name":"Jeep Compass","manufacturer":"Jeep","segment":"SUV","price":23.6,"features":["2.0L Diesel","4x4","10.1-inch Infotainment","Hill Descent Control"]},
                  {"name":"Toyota Fortuner","manufacturer":"Toyota","segment":"SUV","price":28.5,"features":["2.8L Diesel","4x4","Premium Interiors","11-Speaker JBL"]},
                  {"name":"Mahindra Scorpio N","manufacturer":"Mahindra","segment":"SUV","price":19.2,"features":["2.2L Diesel","4x4","AdrenoX Connect","Terrain Modes"]},
                  {"name":"Honda City","manufacturer":"Honda","segment":"Sedan","price":13.8,"features":["1.5L Petrol","ADAS","Wireless CarPlay","LED Headlamps"]},
                  {"name":"Hyundai Verna","manufacturer":"Hyundai","segment":"Sedan","price":14.5,"features":["1.5L Turbo","ADAS","Ventilated Seats","Digital Cluster"]},
                  {"name":"Skoda Slavia","manufacturer":"Skoda","segment":"Sedan","price":14.6,"features":["1.5L TSI","ESC","Sunroof","Ventilated Seats"]},
                  {"name":"Volkswagen Virtus","manufacturer":"Volkswagen","segment":"Sedan","price":14.3,"features":["1.5L Turbo","6 Airbags","Digital Cockpit","Wireless Charger"]},
                  {"name":"Maruti Ciaz","manufacturer":"Maruti Suzuki","segment":"Sedan","price":11.2,"features":["1.5L Petrol","Smart Hybrid","Rear AC Vents","Projector Lamps"]},
                  {"name":"Honda Amaze","manufacturer":"Honda","segment":"Sedan","price":9.8,"features":["1.2L Petrol","Dual Airbags","7-inch Display","LED DRLs"]},
                  {"name":"Tata Tigor","manufacturer":"Tata Motors","segment":"Sedan","price":8.7,"features":["1.2L Revotron","Touchscreen","Rear Camera","Harman Sound"]},
                  {"name":"Hyundai Aura","manufacturer":"Hyundai","segment":"Sedan","price":8.5,"features":["1.2L Petrol","Cruise Control","8-inch Touchscreen","Rear Defogger"]},
                  {"name":"Mercedes C-Class","manufacturer":"Mercedes-Benz","segment":"Sedan","price":58.3,"features":["2.0L Diesel","Luxury Interiors","Panoramic Roof","ADAS"]},
                  {"name":"BMW 3 Series","manufacturer":"BMW","segment":"Sedan","price":60.5,"features":["2.0L Petrol","M Sport Trim","Panoramic Sunroof","Ambient Lighting"]},
                  {"name":"Audi A4","manufacturer":"Audi","segment":"Sedan","price":59.2,"features":["2.0L TFSI","Virtual Cockpit","Bang & Olufsen Audio","Wireless Charging"]},
                  {"name":"Hyundai Kona Electric","manufacturer":"Hyundai","segment":"EV","price":25.6,"features":["39.2 kWh Battery","452 km Range","Fast Charging","Regenerative Braking"]},
                  {"name":"Tata Nexon EV","manufacturer":"Tata Motors","segment":"EV","price":16.8,"features":["40.5 kWh Battery","465 km Range","Connected Tech","Fast Charging"]},
                  {"name":"MG ZS EV","manufacturer":"MG","segment":"EV","price":24.5,"features":["50.3 kWh Battery","461 km Range","ADAS","Panoramic Sunroof"]},
                  {"name":"Mahindra XUV400 EV","manufacturer":"Mahindra","segment":"EV","price":17.9,"features":["39.4 kWh Battery","456 km Range","Dual Tone Interiors","Fast Charging"]},
                  {"name":"Tata Tiago EV","manufacturer":"Tata Motors","segment":"EV","price":8.8,"features":["24 kWh Battery","315 km Range","Connected Car Tech","Fast Charging"]},
                  {"name":"BYD Atto 3","manufacturer":"BYD","segment":"EV","price":33.9,"features":["60.5 kWh Battery","521 km Range","Rotating Display","Advanced ADAS"]},
                  {"name":"Kia EV6","manufacturer":"Kia","segment":"EV","price":60.9,"features":["77.4 kWh Battery","708 km Range","800V Fast Charging","ADAS L2"]},
                  {"name":"Volvo XC40 Recharge","manufacturer":"Volvo","segment":"EV","price":57.2,"features":["78 kWh Battery","418 km Range","AWD","Pilot Assist"]},
                  {"name":"BMW i4","manufacturer":"BMW","segment":"EV","price":74.9,"features":["83.9 kWh Battery","590 km Range","Luxury Cabin","Harman Kardon Audio"]},
                  {"name":"Mercedes EQB","manufacturer":"Mercedes-Benz","segment":"EV","price":74.5,"features":["66.5 kWh Battery","423 km Range","7 Seater","MBUX System"]}
                ]
                """;
    }
}
