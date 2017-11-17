# AIIT 5AHME

##Einheit 1: 17.11.2017

- Testr�ckgabe
- Serielle Schnittstellen allgemein & unter Java

###Industrielle Kommunikation

- seriell
	-> RS232, RS485, ...

- Bussysteme 
	-> CAN (Verkabelung -> 2 Leitersystem) , Profibus (von Siemens, Hersteller unabh�ngig) (Glasfaser�bertragung)
	Bussysteme: komplex genormt -> Aufw�ndig
	-> Modbus -> Schlanke/Einfache Norm 
	
- Ethernet (soll seriell und Bussysteme ersetzten)
	-> Hat auch Modbussystem
	
-> Industrie 4.0 -> Internet der Dinge -> alles miteinander vernetzten

#### Serielle Schnittstelle unter Java

- Problem: Die serielle Schnittstelle wird im Gegensatz zur Netzwerkschnittstelle von Java-API _nicht_ unterst�tzt
- L�sungsansatz: 
	- "fertige" Bibliothek verwenden
	- Problem bei Bibliothek -> Java l�uft in der JavaVirtualMachine. Serielle Schnittstelle ist "unsichtbar" 
	- OS: Zugriff auf serielle Schnittstelle �ber OS-API 
	API- des Betriebssystem -> Application programming interface -> Funktionen die das Betriebssystem zu Verf�gung stellt.
	
	Windows API -> C:/System/32 -> *.dll-Datei -> kompilierte C-Funktionen
	Linux API -> *.so-Datei -> ebenfalls C-Funktionen
	
	JVM -> ruft die jeweiligen dll-Funktionen aufgerufen-> (Bsp. Rahmenfenster)
	
	Zugriff auf serielle Schnittstelle -> jeweiligen *.dll-Dateien aufrufen
	
- 2 spezielle Mechanismen um von Java aus C-Funktionen aufrufen zu k�nnen:
		- JNI ("Java Native Interface")
		- JNA ("Java Native Access")
	
	- Daf�r wird ben�tigt:
			- eine Java-Bibliothek
			- eine plattformabh�ngige C-Bibliothek
		
	- Verwendung: "JSSC"-Bibliothek
	
	JSSC (Java Simple serial Connector): Open Source Tool
		
	Unter : https://github.com/scream3r/java-simple-serial-connector/releases installieren

	Entpacken!
	
	JavaDoc �ffnen
	
	Eigene JavaClasse erstellen:
	
	
		
		
		
		
		