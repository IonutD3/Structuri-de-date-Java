# Structuri de date și algoritmi în Java

---

# 🇷🇴 Română

## Despre proiect

Implementare Java a unor structuri de date fundamentale și algoritmi de procesare, cu accent pe gestionarea directă a structurilor de date, operații asupra colecțiilor și organizarea codului în componente separate.

Proiectul include implementări pentru **stive, cozi circulare și liste înlănțuite**, precum și algoritmul **Bubble Sort**.

---

## Funcționalități

### Stivă

Implementarea stivei oferă:

- `push`;
- `pop`;
- `peek`;
- verificarea stării de stivă goală/plină;
- parcurgerea elementelor;
- sortare Bubble Sort.

Stiva utilizează un tablou de dimensiune fixă pentru stocarea elementelor.

### Inversarea unui șir

O stivă de caractere este utilizată pentru inversarea șirurilor introduse de utilizator.

Exemplu:

```text
Intrare:  Java Developer
Ieșire:   repoleveD avaJ
```

Operația exploatează principiul **LIFO — Last In, First Out**.

### Coada circulară

Implementarea cozii circulare oferă:

- inserarea elementelor;
- eliminarea elementelor;
- accesarea primului element;
- inserarea în partea stângă;
- eliminarea din ambele capete;
- verificarea stării cozii;
- determinarea numărului de elemente;
- parcurgerea structurii;
- sortare Bubble Sort.

Indexarea circulară este realizată prin operații modulo, permițând reutilizarea pozițiilor disponibile din tabloul intern.

### Listă simplu înlănțuită

Lista simplu înlănțuită permite:

- inserare la început;
- ștergerea primului nod;
- căutare după identificator;
- ștergere după identificator;
- accesarea datelor;
- parcurgerea listei;
- verificarea listei goale.

Fiecare nod conține un identificator, date asociate și o referință către următorul nod.

### Listă cu referințe la primul și ultimul nod

A doua implementare de listă păstrează referințe către ambele capete ale structurii.

Sunt disponibile:

- inserarea la început;
- inserarea la sfârșit;
- ștergerea primului element;
- parcurgerea listei.

Păstrarea referinței către ultimul nod permite inserarea la sfârșit în timp constant.

---

## Structura proiectului

```text
Structuri-de-date-Java/
│
├── README.md
│
└── src/
    ├── stivanumerica/
    │   ├── StivaNumerica.java
    │   └── StivaBubbleSort.java
    │
    ├── stivacaractere/
    │   ├── StivaCaractere.java
    │   ├── InversorSir.java
    │   └── InversareSir.java
    │
    ├── coadacirculara/
    │   ├── CoadaCircularaStructura.java
    │   └── CoadaCirculara.java
    │
    ├── listasimpla/
    │   ├── NodListaSimpla.java
    │   ├── ListaSimplaStructura.java
    │   └── ListaSimpla.java
    │
    └── listadouacapete/
        ├── NodListaDouaCapete.java
        ├── ListaDouaCapeteStructura.java
        └── ListaDouaCapete.java
```

---

## Tehnologii

- **Java**
- Java Standard Library
- Programare Orientată pe Obiecte
- Tablouri
- Noduri și referințe
- Console I/O
- Algoritmi și structuri de date

---

## Structuri de date și algoritmi

| Componentă | Implementare | Operații principale |
|---|---|---|
| Stivă numerică | Tablou | Push, Pop, Peek |
| Stivă de caractere | Tablou | Push, Pop |
| Coadă circulară | Tablou + indexare modulo | Insert, Remove, Peek |
| Listă simplă | Noduri înlănțuite | Insert, Search, Delete |
| Listă cu două capete | Noduri înlănțuite | Insert First, Insert Last, Remove First |
| Sortare | Bubble Sort | Ordonare crescătoare |

---

## Complexitate

| Operație | Complexitate |
|---|---:|
| `push` | `O(1)` |
| `pop` | `O(1)` |
| `peek` | `O(1)` |
| Inserare în coada circulară | `O(1)` |
| Eliminare din coada circulară | `O(1)` |
| Inserare la începutul listei | `O(1)` |
| Ștergere de la început | `O(1)` |
| Căutare în listă | `O(n)` |
| Ștergere după cheie | `O(n)` |
| Inserare la sfârșitul listei cu referință `ultimul` | `O(1)` |
| Bubble Sort | `O(n²)` |

---

## Cerințe

- **Java JDK 8+**
- Terminal sau IDE compatibil cu Java

---

## Compilare

Din directorul principal:

```bash
mkdir -p out
javac -d out src/*.java
```

În Windows PowerShell:

```powershell
mkdir out
javac -d out src/*.java
```

---

## Rulare

### Stivă și Bubble Sort

```bash
java -cp out StivaBubbleSort
```

### Inversarea unui șir

```bash
java -cp out InversareSir
```

Programul primește șiruri prin consola standard și afișează forma inversată. O linie goală încheie aplicația.

### Coadă circulară

```bash
java -cp out CoadaCirculara
```

Programul permite demonstrarea modului de extragere de tip coadă sau stivă.

### Listă simplă

```bash
java -cp out ListaSimpla
```

### Listă cu două capete

```bash
java -cp out ListaDouaCapete
```

---

## Aspecte tehnice

### Structuri bazate pe tablouri

Stiva și coada circulară își gestionează direct tablourile și indicii interni, fără utilizarea claselor de colecții pentru stocarea principală.

Coada circulară folosește operații modulo pentru reutilizarea pozițiilor disponibile.

### Structuri înlănțuite

Listele utilizează obiecte de tip nod și referințe `next`.

Implementarea cu două capete menține:

```text
primul → ...
ultimul → ...
```

permițând inserarea la început și la sfârșit în timp constant.

### Sortare

Bubble Sort este implementat direct asupra secvenței de elemente, utilizând schimburi între poziții consecutive.

---

## Organizarea codului

Fiecare exemplu separă responsabilitatea structurii de date de punctul de intrare al aplicației.

Clasele de structură gestionează:

- starea internă;
- stocarea datelor;
- validarea operațiilor;
- operațiile specifice structurii;
- algoritmii asociați.

Clasele principale `main` gestionează execuția exemplului și interacțiunea cu utilizatorul.

Această organizare permite extinderea ulterioară a fiecărei implementări fără a amesteca logica structurii de date cu fluxul aplicației.

---

#Data Structures and Algorithms in Java

# 🇬🇧 English

## About the project

Java implementation of fundamental data structures and processing algorithms, with an emphasis on manual memory management, operations on data collections, and organizing code into reusable components. 

The project includes implementations for stacks, circular queues, and linked lists, as well as the Bubble Sort algorithm.

---

## Overview

The project provides a collection of Java implementations covering several fundamental data structures and algorithms:

- array-based stacks;
- character stacks;
- circular queues;
- singly linked lists;
- linked lists with front and rear references;
- Bubble Sort;
- search and deletion operations;
- interactive console-based input.

The implementations are built without relying on Java's high-level collection classes for the core data structures, providing direct control over indexing, node references, insertion, deletion and traversal.

---

## Features

### Stack

The stack implementation provides:

- `push`
- `pop`
- `peek`
- empty/full state validation
- element traversal
- Bubble Sort integration

The stack is implemented using a fixed-size array.

### String Reversal

A character stack is used to reverse arbitrary input strings according to the LIFO principle.

```text
Input:  Java Developer
Output: repoleveD avaJ
```

### Circular Queue

The circular queue implementation provides:

- insertion;
- removal;
- front-element access;
- insertion from the left side;
- removal from both sides;
- empty/full state validation;
- element counting;
- traversal;
- Bubble Sort.

Circular indexing is handled using modulo arithmetic, allowing the underlying array to be reused efficiently.

### Singly Linked List

The linked-list implementation supports:

- insertion at the beginning;
- removal of the first node;
- search by identifier;
- deletion by identifier;
- data retrieval;
- list traversal;
- empty-list validation.

Each node contains an identifier, associated data and a reference to the next node.

### Front/Rear Linked List

A second linked-list implementation maintains references to both the first and last nodes.

This allows:

- insertion at the beginning in `O(1)`;
- insertion at the end in `O(1)`;
- removal from the beginning in `O(1)`;
- sequential traversal.

---

## Project Structure

```text
Structuri-de-date-Java/
│
├── README.md
│
└── src/
    ├── stivanumerica/
    │   ├── StivaNumerica.java
    │   └── StivaBubbleSort.java
    │
    ├── stivacaractere/
    │   ├── StivaCaractere.java
    │   ├── InversorSir.java
    │   └── InversareSir.java
    │
    ├── coadacirculara/
    │   ├── CoadaCircularaStructura.java
    │   └── CoadaCirculara.java
    │
    ├── listasimpla/
    │   ├── NodListaSimpla.java
    │   ├── ListaSimplaStructura.java
    │   └── ListaSimpla.java
    │
    └── listadouacapete/
        ├── NodListaDouaCapete.java
        ├── ListaDouaCapeteStructura.java
        └── ListaDouaCapete.java
```

---

## Technologies

- **Java**
- Java Standard Library
- Object-Oriented Programming
- Arrays
- References and linked nodes
- Console I/O
- Algorithmic data processing

---

## Algorithms & Data Structures

| Component | Implementation | Main Operations |
|---|---|---|
| Numeric Stack | Array | Push, Pop, Peek |
| Character Stack | Array | Push, Pop |
| Circular Queue | Array + modular indexing | Insert, Remove, Peek |
| Singly Linked List | Linked nodes | Insert, Search, Delete |
| Front/Rear Linked List | Linked nodes | Insert First, Insert Last, Remove First |
| Sorting | Bubble Sort | Ascending ordering |

---

## Complexity

The main operations are designed around the standard complexity characteristics of their respective data structures.

| Operation | Complexity |
|---|---:|
| Stack `push` | `O(1)` |
| Stack `pop` | `O(1)` |
| Stack `peek` | `O(1)` |
| Circular queue insertion | `O(1)` |
| Circular queue removal | `O(1)` |
| Linked-list insertion at head | `O(1)` |
| Linked-list removal at head | `O(1)` |
| Linked-list search | `O(n)` |
| Linked-list deletion by key | `O(n)` |
| Linked-list insertion at tail | `O(1)` |
| Bubble Sort | `O(n²)` |

---

## Requirements

- **Java JDK 8+**
- Terminal or Java-compatible IDE

---

## Build

Clone the repository and navigate to the project directory.

Compile all source files:

```bash
mkdir -p out
javac -d out src/*.java
```

On Windows PowerShell:

```powershell
mkdir out
javac -d out src/*.java
```

---

## Run

### Stack & Bubble Sort

```bash
java -cp out StivaBubbleSort
```

### String Reversal

```bash
java -cp out InversareSir
```

The application accepts strings through standard input and returns their reversed representation. An empty line terminates the application.

### Circular Queue

```bash
java -cp out CoadaCirculara
```

The application demonstrates queue and stack-style removal modes through console input.

### Singly Linked List

```bash
java -cp out ListaSimpla
```

### Front/Rear Linked List

```bash
java -cp out ListaDouaCapete
```

---

## Implementation Highlights

### Array-Based Structures

The stack and circular queue implementations manage their own internal arrays and indexes instead of delegating storage to Java collection classes.

The circular queue uses modulo arithmetic to reuse available positions after elements are removed.

### Linked Structures

The linked-list implementations use dedicated node objects and `next` references.

The second implementation maintains both:

```text
first → ...
last  → ...
```

allowing constant-time insertion at either end where the corresponding reference is available.

### Sorting

Bubble Sort is implemented directly over the stored sequence and performs in-place element exchanges.

---

## Code Organization

The project separates the data structure implementation from the executable entry point within each example.

For example, the stack implementation contains a dedicated structure class responsible for:

- state management;
- storage;
- validation;
- stack operations;
- sorting.

The corresponding `main` class is responsible for executing the example and presenting its output.

This approach keeps the core operations isolated from the application flow and makes the implementations easier to reuse or extend.

---

## 👤 Autor / Author

**IonutD**
