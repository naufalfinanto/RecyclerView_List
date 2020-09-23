package com.naufal.cobasubmission1

object VgaData {

    private val vgaNama = arrayOf("MSI GT1030 AERO ITX 2G OC EDITION",
    "MSI GTX 1050TI GAMING X 4G",
    "MSI GTX 1060 CAMO SQUAD 6G",
    "MSI GTX 1070TI DUKE 8G",
    "MSI GTX 1080 ARMOR 8G OC",
    "MSI GTX 1080TI GAMING X TRIO",
    "MSI GTX 1660TI VENTUS XS 6G OC",
    "MSI RTX 2060 GAMING Z 6G",
    "MSI RTX 2060 SUPER GAMING X 8G",
    "MSI RTX 2070 ARMOR 8G OC",
    "MSI RTX 2080 GAMING X TRIO",
    "MSI RTX 2080TI SEA HAWK X")

    private val vgaDetail1 = arrayOf("""
        |OpenGL Support: 4.5 
        |DirectX Support: 12
        |HDCP Support: 2.2
    """.trimMargin(),"""
        |OpenGL Support: 4.5 
        |DirectX Support: 12
        |HDCP Support: 2.2
    """.trimMargin(),"""
        |OpenGL Support: 4.5 
        |DirectX Support: 12
        |HDCP Support: 2.2
    """.trimMargin(),"""
        |OpenGL Support: 4.5 
        |DirectX Support: 12
        |HDCP Support: 2.2
    """.trimMargin(),"""
        |OpenGL Support: 4.5 
        |DirectX Support: 12
        |HDCP Support: 2.2
    """.trimMargin(),"""
        |OpenGL Support: 4.5 
        |DirectX Support: 12
        |HDCP Support: 2.2
    """.trimMargin(),"""
        |OpenGL Support: 4.5 
        |DirectX Support: 12 API
        |HDCP Support: 2.2
    """.trimMargin(),"""
        |TwinFrozr 7 Thermal Design
        |TORX 3.0, Zero Frozr Technology
        |Double Ball Bearings
    """.trimMargin(),"""
        |TwinFrozr 7 Thermal Design
        |TORX 3.0
        |Zero Frozr Technology
    """.trimMargin(),"""
        |OpenGL Support: 4.5 
        |DirectX Support: 12 API
        |HDCP Support: 2.2
    """.trimMargin(),"""
        |TriFrozr 7 Thermal Design
        |TORX 3.0, Zero Frozr Technology
        |Double Ball Bearings
    """.trimMargin(),"""
        |TriFrozr 7 Thermal Design
        |TORX 3.0, Zero Frozr Technology
        |Double Ball Bearings
    """.trimMargin())

    private val vgaDetail2 = arrayOf("""
        Core/Memory
        - Boost Clock / Base Clock
        - 1518 MHz / 1265 MHz
        - 2GB GDDR5 / 6008 MHz Memory
        
        All Solid Capacitors
        - 10 years long lifetime under full load.
        - Lower temperature and higher efficiency.
        - Aluminum core for higher stability.
        
        Afterburner Overclocking Utility
        - Wireless control through Android/iOS devices.
        - Predator: In-game video recording.
        - GeForce Experience

        Ensures the best gaming experience by automatically updating users’ game-ready drivers.
        Allows users to optimize the game settings to their PC with a single click.
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Base Clock / Memory Frequency
        - 1493 MHz / 1379 MHz / 7108 MHz (OC Mode)
        - 1468 MHz / 1354 MHz / 7008 MHz (Gaming Mode)
        - 1392 MHz / 1290 MHz / 7008 MHz (Silent Mode)
        - 4096 MB GDDR5

        Video Output Function
        - DisplayPort x 1
        - HDMI x 1
        - Dual-link DVI-D x 1

        Features　
        - DirectX 12 Ready 　
        - Gamestream to NVIDIA SHIELD
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Base Clock / Memory Frequency
        - 1809 MHz / 1594 MHz / 8108 MHz (OC Mode)
        - 1784 MHz / 1569 MHz / 8008 MHz (Gaming Mode)
        - 1708 MHz / 1506 MHz / 8008 MHz (Silent Mode)
        - 6GB GDDR5
        
        Camouflaged TWIN FROZR VI: Stay Stealth!
        - Armed with MSI's award-winning GAMING X arsenal of features cooling its core to the fullest  to top your game
        - Smooth heat pipes: Squared shape at bottom maximize heat transfer from the copper base plate
        - Zero Frozr: Stopping the fan in low-load situations, keeping a noise-free environment
        
        TORX FAN 2.0: Supremely silent
        - Dispersion fan blade: Steeper curved blade accelerating the airflow
        - Traditional fan blade: Provides steady airflow to massive heat sink below
        
        Gaming App
        - Instant Performance Gain: Unlock extra performance or keep your card silent during light use in one click
        - LED control: Full control on your RGB, GAMING LEDs to set the mood
        - Mobile APP: Control your graphics card from your phone
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Base Clock / Memory Frequency
        - 1683 MHz / 1607 MHz / 8008 MHz 
        - 8GB GDDR5
        
        Triple Force Architecture
        - TriFrozr Thermal Design: Triple PWM fans with Independent Control System on Advanced Thermal Design.
        - Propeller Blade: 20% more airflow and less noise than traditional fan designs.
        - SuperPipes: Transfer heat much faster to the heat sink under PWM fans, and highly improve dissipation efficiency
        - Zero Frozr: Fans stop spinning in low load to keep the card quiet and increase lifetime.
        
        Afterburner Overclocking Utility
        - Wireless control through mobile devices.
        - Predator: In-game video recording.
        - Supports multi-GPU setups.
        
        Military Class certified Components
        - Certified to MIL-STD-810G standards for top stability and quality.
        - Built with Hi-c CAP, Solid CAP, and New SFC components.
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Base Clock
        - 1797 MHz / 1657 MHz
        - 8192 MB GDDR5X / 10010 MHz Memory

        Video Output Function
        - DisplayPort x 3
        - HDMI x 1
        - Dual-link DVI-D x 1

        Features
        - Virtual Reality Ready
        - DirectX 12 Ready
        - Great for 4K
        - Gamestream to NVIDIA SHIELD
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Base Clock / Memory Frequency
        - 1683 MHz / 1569 MHz / 11124 MHz (OC Mode)
        - 1657 MHz / 1544 MHz / 11016 MHz (Gaming Mode)
        - 1582 MHz / 1480 MHz / 11016 MHz (Silent Mode)
        - 11GB GDDR5X
        
        RGB Mystic Light
        - Customize colors and LED effects with exclusive MSI software and synchronize the look & feel with other components.
        
        TORX FAN 2.0: Supremely silent
        - Dispersion fan blade: Steeper curved blade accelerating the airflow.
        - Traditional fan blade: Provides steady airflow to massive heat sink below.
        - Double ball bearing: Strong and lasting core for years of smooth gaming.
        
        TRI-FROZR Thermal Design
        - Using three of the award-winning TORX 2.0 Fans with Double Ball Bearings.
        
        Gaming App
        - Instant Performance Gain: Unlock extra performance or keep your card silent during light use in one click.
        - LED control: Full control on your RGB GAMING LEDs to set the mood.
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Memory Speed
        - 1830 MHz / 12 Gbps
        - 6GB GDDR6
        - DisplayPort x 3 / HDMI x 1
        
        TORX Fan 2.0
        - Dispersion fan blade: Steep curved blade accelerating the airflow
        - Traditional fan blade: Provides steady airflow to massive heat sink below
        
        Afterburner Overclocking Utility
        - Wireless control through Android/iOS devices.
        - Predator: In-game video recording.
        - Kombustor: DirectX12 benchmark.
        
        NVIDIA G-SYNC™ and HDR
        - Get smooth, tear-free gameplay at refresh rates up to 240 Hz, plus HDR, and more. This is the ultimate gaming display and the go-to equipment for enthusiast gamers.
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Memory Speed
        - 1830 MHz / 14 Gbps
        - 6GB GDDR6
        - DisplayPort x 3 / HDMI x 1
        
        Twin Frozr 7 Thermal Design
        TORX Fan 3.0
        - Dispersion fan blade: Steep curved blade accelerating the airflow.
        - Traditional fan blade: Provides steady airflow to massive heat sink below.
        Mastery of Aerodynamics: The heatsink is optimized for efficient heat dissipation, keeping your temperatures low and performance high.
        - Zero Frozr technology: Stopping the fan in low-load situations, keeping a noise-free environment.
        
        RGB Mystic Light
        - Customize colors and LED effects with exclusive MSI software and synchronize the look & feel with other components.
        
        Dragon Center
        - 1 click to optimize all you need for smooth gaming.
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Memory Speed
        - 1695 MHz / 14 Gbps
        - 8GB GDDR6
        - DisplayPort x 3 / HDMI x 1
        
        Twin Frozr 7 Thermal Design
        TORX Fan 3.0
        - Dispersion fan blade: Steep curved blade accelerating the airflow.
        - Traditional fan blade: Provides steady airflow to massive heat sink below.
        Mastery of Aerodynamics: The heatsink is optimized for efficient heat dissipation, keeping your temperatures low and performance high.
        - Zero Frozr technology: Stopping the fan in low-load situations, keeping a noise-free environment.
        
        Dragon Center
        - A consolidated platform that offers all software including MYSTIC LIGHT functionality for your MSI Gaming product.
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Base Clock / Memory Speed
        - 1740 MHz / 1410 MHz / 14Gbps
        - 8GB GDDR6
        - DisplayPort x 3 / HDMI x 1 / USB Type-C x 1
        
        Armor Thermal Design
        TORX Fan 2.0 with Double Ball Bearings
        - Dispersion fan blade: Steep curved blade accelerating the airflow.
        - Traditional fan blade: Provides steady airflow to massive heat sink below.
        Mastery of Aerodynamics: The heatsink is optimized for efficient heat dissipation, keeping your temperatures low and performance high.
        - Zero Frozr technology: Stopping the fan in low-load situations, keeping a noise-free environment.
        
        RGB Mystic Light
        - Customize colors and LED effects with exclusive MSI software and synchronize the look & feel with other components.
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Base Clock /Memory Speed
        - 1860 MHz / 1515 MHz / 14 Gbps
        - 8GB GDDR6
        
        TORX FAN 3.0: Supremely silent
        - Dispersion fan blade: Steeper curved blade accelerating the airflow.
        - Traditional fan blade: Provides steady airflow to massive heat sink below.
        - Double ball bearing: Strong and lasting core for years of smooth gaming.
        
        Dragon Center
        - 1 click to optimize all you need for smooth gaming.
    """.trimIndent(),"""
        Core/Memory
        - Boost Clock / Base Clock / Memory Frequency
        - 1755 MHz / 1350 MHz / 7000 MHz
        - 11GB GDDR6
        
        Double Cooling Power
        - Full coverage, dual cooling: featuring Corsair Hydro series H55 thermal design, efficient liquid cooling for the GPU and air cooling for the memory and VRMs.
        - Efficient heat transfer circulation pump, silent wide diameter fan and easy-to-install aluminum radiator ensure greatest cooling performance.
        
        Dragon Center
        - 1 click to optimize all you need for smooth gaming.
    """.trimIndent())

    private val vgaDetails = arrayOf("MSI GT 1030 adalah sebuah vga yang memiliki ukuran yang kecil dan cocok untuk segala jenis casing, dibekali dengan memori DDR5 sebesar 2GB yang sudah suport overclocking membuat performa vga ini menjadi semakin baik untuk digunakan haian maupun kebutuhan gaming",
        "MSI GTX 1050TI adalah sebuah vga yang memiliki dual fan dengan teknologi zero frozr yang dimana kipas / fan tidak akan berputar jika belum mencapai suhu yang tinggi, dengan dukungan memori DDR5 sebesar 4GB menghasilkan performa yang mumpuni untuk menjalankan berbagai aplikasi maupun kebutuhan akan gaming",
        "MSI GTX 1060 Camo Squad adalah sebuah vga yang memiliki tema camoflage atau kamuflase dan memiliki dual fan dengan teknologi twinfrozr, vga ini juga dibekali dengan memori DDR5 sebesar 6GB yang memungkinkan untuk menjalankan berbagai macam aplikasi maupun digunakan untuk kebutuhan gaming dan editing",
        "MSI GTX 1070TI Duke adalah sebuah vga card yang memiliki triple fan dengan teknologi trifrozr, vga ini juga dibekali dengan memori DDR5 sebesar 8GB yang memungkinkan untuk menjalankan berbagai macam aplikasi maupun digunakan untuk kebutuhan gaming dan editing",
        "MSI GTX 1080 Armor adalah sebuah vga card yang memiliki dual fan yang sangat besar dan memungkinkan untuk penggunaan OC, vga ini juga dibekali dengan memori DDR5 sebesar 8GB yang memungkinkan untuk menjalankan berbagai macam aplikasi maupun digunakan untuk kebutuhan gaming dan editing",
        "MSI GTX 1080TI Gaming X Trio adalah sebuah vga card yang memiliki triple fan yang sangat besar dan memungkinkan untuk penggunaan OC, vga ini juga dibekali RGB Led pada sisi samping untuk memperindah tampilan dengan memori GDDR5X sebesar 11GB yang memungkinkan untuk menjalankan berbagai macam aplikasi maupun digunakan untuk kebutuhan gaming dan editing",
        "MSI GTX 1660 Ventus XS adalah sebuah vga yang memiliki dual fan dengan teknologi TORX 2.0 yang memungkinkan untuk menjaga suhu vga card, vga ini juga dibekali dengan memori GDDR6 sebesar 6GB yang sangat memungkinkan untuk menjalankan berbagai macam aplikasi maupun digunakan untuk kebutuhan gaming dan editing",
        "MSI RTX 2060 Gaming Z adalah sebuah vga dengan teknologi terbaru dan desain fan menggunakan TORX 3.0, vga ini juga dibekali RGB Light dan memori GDDR6 sebesar 6GB yang memungkinkan untuk penggunaan render video maupun memainkan game Triple A",
        "MSI RTX 2060 Super Gaming X adalah sebuah vga dengan teknologi terbaru dari nvidia dan desain fan menggunakan TORX 3.0 juga Zero Frozr , vga ini juga dibekali RGB Light dan memori GDDR6 sebesar 8GB yang memungkinkan untuk penggunaan render video maupun memainkan game Triple A",
        "MSI RTX 2070 Armor adalah sebuah vga dengan teknologi terbaru dan desain fan menggunakan TORX 2.0, vga ini juga dibekali RGB Light dan memori GDDR6 sebesar 8GB yang memungkinkan untuk penggunaan render video, machine learning / artificial intelegence, maupun memainkan game Triple A",
        "MSI RTX 2080 Gaming X Trio adalah sebuah vga yang dilengkapi dengan triple fan TORX 3.0 dan juga memiliki RGB Light yang akan memperindah tampilan, vga ini dibekali dengan memori GDDR6 Sebesar 8GB yang memungkinkan untuk penggunaan render video dengan cepat, machine learning / artificial intelegence, maupun memainkan game triple A",
        "MSI RTX 2080TI Sea Hawk X adalah sebuah vga yang dilengkapi dengan liquid cooling dan sebuah fan sehingga proses pendinginan menjadilebih cepat, vga ini dibekali dengan memori GDDR6 Sebesar 11GB yang memungkinkan untuk penggunaan render video dengan cepat, machine learning / artificial intelegence, maupun memainkan game triple A")

    private val vgaImages = intArrayOf(R.drawable.msi_1030,
        R.drawable.msi_1050ti,
        R.drawable.msi_1060,
        R.drawable.msi_1070ti,
        R.drawable.msi_1080,
        R.drawable.msi_1080ti,
        R.drawable.msi_1660ti,
        R.drawable.msi_2060,
        R.drawable.msi_2060super,
        R.drawable.msi_2070,
        R.drawable.msi_2080,
        R.drawable.msi_2080ti)

    val listData: ArrayList<Vga>
        get() {
            val list = arrayListOf<Vga>()
            for (position in vgaNama.indices){
                var vga = Vga()
                vga.nama = vgaNama[position]
                vga.detail = vgaDetail1[position]
                vga.photo = vgaImages[position]
                list.add(vga)
            }
            return list
        }
}
