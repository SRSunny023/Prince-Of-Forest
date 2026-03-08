# Prince Of Forest 🌲🗡️

**Prince Of Forest** is a text-based RPG adventure game developed in **Java** using **IntelliJ IDEA**.
In this game, you play as Prince, trying to survive the mysterious and dangerous **Forest of Shadows**. There are currently 10 Princes.

---

## 🎮 Gameplay Overview

- Explore a 7x7 grid-based forest map.
- Move in four directions: North, South, East, West.
- Encounter various events:
    - **R**: Rewards (gain HP, ATK, DEF, XP, or potions)
    - **T**: Traps (random damage or stat loss)
    - **O**: Enemies (fight monsters using turn-based combat)
    - **E**: Exit / Boss fight (complete the chapter)
- Monitor and manage your stats:
    - **HP**: Health Points
    - **ATK**: Attack
    - **DEF**: Defense
    - **XP**: Experience
    - **Potions**: Heal, Attack, Defense

---

## 🗺️ Map Example (ASCII)

```markdown
R . O . T . E
. . T R . . O
. O . T . R .
. . . P . . .
. T . O . R .
O . T . R . .
. T . R . O E
```

Legend:

- `P` → Player
- `R` → Reward
- `T` → Trap
- `O` → Enemy
- `E` → Exit / Boss
- `.` → Empty

---

## ⚔️ Features

- **Turn-based combat system** with enemies and boss battles.
- **Random rewards and traps** to increase excitement.
- **Inventory system** with potions and stat boosts.
- **2D ASCII map visualization** of the forest.
- **Chapter-based story progression**.

---

## 💻 Tech Stack

- Language: **Java**
- IDE: **IntelliJ IDEA**
- Tools: Git + GitHub
- Concept: **Text-based RPG, Tile-based map**

---

## 🚀 How to Run

`1` **Go To The Directory Where You Want To Download The Game**

`2` **Open The Terminal / PowerShell There**

`3` **Clone the repository:**

```bash
git clone https://github.com/SRSunny023/Prince-Of-Forest.git
```

`4` **Now Go To The Game Directory By Writing This Command In Terminal / PowerShell**

```bash
cd Prince-Of-Forest
```

`5` **Now Write The Following Command In Terminal / PowerShell**

- **PowerShell**

```bash
Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName } > sources.txt
```

- **Windows Terminal / Command**

```bash
dir /s /b src\*.java > sources.txt
```

- **Ubuntu / MAC Terminal**

```bash
find src -name "*.java" > sources.txt
```

`6` **Now Write The Following Command In Terminal / PowerShell**

- **PowerShell**

```bash
javac -d . "@sources.txt"
```

- **Windows / Ubuntu / MAC / Terminal / Command**

```bash
javac -d . @sources.txt
```

`7` **Now Run The Game By Writing The Following Command In Terminal / PowerShell**

```bash
java MAIN.PrinceOfForest
```

`8` **Now You Can Run The Game Anytime Using The Step-7 Command Just Make Sure You Are Inside The Prince-Of-Forest Directory**

## 📂 Project Structure

```bash
Prince-Of-Forest/
├── src/
│   ├── CHARACTER/      # Player, Enemy, and Princes classes
│   ├── ENEMY/          # Chapter wise Enemy Classes
│   ├── FIGHT/          # Combat system
│   ├── MAIN/           # MAIN Class Where Game Starts
│   ├── MAP/            # Forest maps
│   ├── MATCH/          # Chapter logic
│   ├── MENU/           # Menu Classes
│   ├── STORY/          # Story events
│   └── UTILITY/        # Input, screen clearing, helpers
├── .gitignore
├── PRINCEOFFOREST.iml
└── README.md
```

## 🎯 Future Improvements

`1` Add multiple chapters with branching storylines.

`2` Save/load game progress.

`3` Enhanced combat with skills and special attacks.

`4` Graphical UI using JavaFX or Swing.

`5` Sound effects and music for immersive experience.

## 📝 Author

Siamur Rahman Sunny

Daffodil International University

Bangladesh
