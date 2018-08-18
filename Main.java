public class Main {

    public static void main(String[] args) {
        GeneticAlgorithms geneticAlgorithms = new GeneticAlgorithms();

        Population population = new Population(100);
        population.init();

        int generationCounter = 0;

        while (population.getFittestIndividual().getFitness() != Constants.MAX_FITNESS) {
            System.out.println("Generation " + generationCounter + " the fittest individual is: " + population.getFittestIndividual().getFitness() + "\n");
            System.out.println(population.getFittestIndividual());
            population = geneticAlgorithms.evolvePopulation(population);
            generationCounter++;

        }

        System.out.println("\n\n"+population.getFittestIndividual());

    }

}
