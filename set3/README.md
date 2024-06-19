# In order to compile an exercice:

```
cd set3
```

```
scalac ExerciceN.scala && scala ExerciceN
```

# Example:
```
scalac Exercice3.scala && scala Exercice3
```

# In order to clean your directory:

```
rm -rf *.tasty *.class
```

# In order to test all the exercices then clean your directory:

```
cd set3; export MAXITEREXERCICES=9; export N=0; for ((N=1; N<=MAXITEREXERCICES; N++)); do scalac Exercice$N.scala && scala Exercice$N; done; rm -rf *.tasty *.class; cd ..
```
