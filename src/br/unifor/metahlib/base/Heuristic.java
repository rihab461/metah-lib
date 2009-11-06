package br.unifor.metahlib.base;

/**
 * This class groups the commons characteristics of heuristics.
 */
public abstract class Heuristic {

	/**
	 * Stores the iteration where the best solution was found.
	 * Should be set inside the "execute" method of the child class. 
	 */
	protected int lastBestFoundOn = 0;
	
	/**
	 * The problem to be optimized by this heuristic.
	 */
	protected Problem problem;
	
	/**
	 * Construct a new heuristic for optimize the informed problem.
	 * @param problem The problem to be optimized.
	 */
	public Heuristic(Problem problem){
		this.problem = problem;
	}
	
	/**
	 * The method which initiates the optimization.
	 * @return Best solution found during execution.
	 */
	public abstract Solution execute();
	
	/**
	 * Retrieves the problem to be optimized by the heuristic.
	 * @return The problem to be optimized.
	 */
	public Problem getProblem(){
		return problem;
	}
	
	/**
	 * Set the problem to be optimized by the heuristic.
	 * @param problem The problem to be optimized.
	 */
	public void setProblem(Problem problem){
		this.problem = problem;
	}
	
	/**
	 * Iteration where the best solution was found.
	 */
	public int getLastBestFoundOn() {
		return lastBestFoundOn;
	}
}
