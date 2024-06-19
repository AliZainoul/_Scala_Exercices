# In order to compile an exercice:

```
cd set2
```

```
scalac ExerciceN.scala && scala ExerciceN
```

# Example:
```
scalac Exercice14.scala && scala Exercice14
```

# In order to clean your directory:

```
rm -rf *.tasty *.class
```

# In order to test all the exercices then clean your directory:

```
cd set2; export MAXITEREXERCICES=17; export N=0; for ((N=1; N<=MAXITEREXERCICES; N++)); do scalac Exercice$N.scala && scala Exercice$N; done; rm -rf *.tasty *.class; cd ..
```
