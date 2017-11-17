# AIIT 5AHME

##Einheit 1: 17.11.2017

- Testrückgabe
- Serielle Schnittstellen allgemein & unter Java

###Industrielle Kommunikation

- seriell
	-> RS232, RS485, ...

- Bussysteme 
	-> CAN (Verkabelung -> 2 Leitersystem) , Profibus (von Siemens, Hersteller unabhängig) (Glasfaserübertragung)
	Bussysteme: komplex genormt -> Aufwändig
	-> Modbus -> Schlanke/Einfache Norm 
	
- Ethernet (soll seriell und Bussysteme ersetzten)
	-> Hat auch Modbussystem
	
-> Industrie 4.0 -> Internet der Dinge -> alles miteinander vernetzten

#### Serielle Schnittstelle unter Java

- Problem: Die serielle Schnittstelle wird im Gegensatz zur Netzwerkschnittstelle von Java-API _nicht_ unterstützt
- Lösungsansatz: 
	- "fertige" Bibliothek verwenden
	- Problem bei Bibliothek -> Java läuft in der JavaVirtualMachine. Serielle Schnittstelle ist "unsichtbar" 
	- OS: Zugriff auf serielle Schnittstelle über OS-API 
	API- des Betriebssystem -> Application programming interface -> Funktionen die das Betriebssystem zu Verfügung stellt.
	
	Windows API -> C:/System/32 -> *.dll-Datei -> kompilierte C-Funktionen
	Linux API -> *.so-Datei -> ebenfalls C-Funktionen
	
	JVM -> ruft die jeweiligen dll-Funktionen aufgerufen-> (Bsp. Rahmenfenster)
	
	Zugriff auf serielle Schnittstelle -> jeweiligen *.dll-Dateien aufrufen
	
- 2 spezielle Mechanismen um von Java aus C-Funktionen aufrufen zu können:
		- JNI ("Java Native Interface")
		- JNA ("Java Native Access")
	
	- Dafür wird benötigt:
			- eine Java-Bibliothek
			- eine plattformabhängige C-Bibliothek
		
	- Verwendung: "JSSC"-Bibliothek
	
	JSSC (Java Simple serial Connector): Open Source Tool
		
	Unter : https://github.com/scream3r/java-simple-serial-connector/releases installieren

	Entpacken!
	
	JavaDoc öffnen
	
	Eigene JavaClasse erstellen:
	
	
		
		
		
		
		