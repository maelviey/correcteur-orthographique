# Correcteur Orthographique & Analyse de Complexité

## 1. Présentation du projet
> **Contexte :** Projet réalisé dans le cadre du cours d'**Algorithmique et Complexité Expérimentale (ACE)** enseigné par **Thomas Genet**, en **L1 ISTN** à l'**ISTIC - Université de Rennes**.
> **Auteur :** VIEY Maël

Ce projet a pour double objectif de réaliser un **correcteur orthographique** fonctionnel et d'analyser **expérimentalement** la complexité temporelle des algorithmes utilisés.

Il compare concrètement l'efficacité d'une recherche naïve (linéaire) face à une recherche dichotomique pour la vérification de mots dans un dictionnaire volumineux.

## 2. Fonctionnalités & Algorithmes
Le cœur du projet (`Main.java`) implémente plusieurs algorithmes fondamentaux :

* **Vérification Orthographique :**
    * `recherche` : Recherche séquentielle naïve **O(n)**.
    * `rechercheDichoStr` : Recherche dichotomique optimisée **O(log n)** (nécessite un dictionnaire trié).
* **Tri de Données :**
    * `triParInsertion` : Implémentation du tri par insertion pour préparer les données **O(n²)**.
* **Suggestion de Correction :**
    * `distanceHamming` : Calcul de la distance entre deux mots.
    * `proposerCorrection` : Suggère des corrections pour les mots malorthographiés en trouvant les termes proches (Distance de Hamming = 1).