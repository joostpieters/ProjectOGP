package hillbillies.part3.facade;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import hillbillies.model.Boulder;
import hillbillies.model.Faction;
import hillbillies.model.Log;
import hillbillies.model.Scheduler;
import hillbillies.model.Task;
import hillbillies.model.Unit;
import hillbillies.model.World;
import hillbillies.part2.listener.TerrainChangeListener;
import hillbillies.part3.programs.ITaskFactory;
import hillbillies.task.TaskFactory;
import hillbillies.task.expression.Expression;
import hillbillies.task.statement.Statement;
import hillbillies.task.type.Type;
import ogp.framework.util.ModelException;

public class Facade implements IFacade{

	@Override
	public Unit createUnit(String name, int[] initialPosition, int weight, int agility, int strength, int toughness,
			boolean enableDefaultBehavior) throws ModelException {
		// TODO Auto-generated method stub
		return new Unit(name, initialPosition, weight, agility, strength, toughness, enableDefaultBehavior);
	}

	@Override
	public double[] getPosition(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getPosition();
	}

	@Override
	public int[] getCubeCoordinate(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getCubeCoordinate();
	}

	@Override
	public String getName(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getName();
	}

	@Override
	public void setName(Unit unit, String newName) throws ModelException {
		// TODO Auto-generated method stub
		unit.setName(newName);
	}

	@Override
	public int getWeight(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getWeight();
	}

	@Override
	public void setWeight(Unit unit, int newValue) throws ModelException {
		// TODO Auto-generated method stub
		unit.setWeight(newValue);
	}

	@Override
	public int getStrength(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getStrength();
	}

	@Override
	public void setStrength(Unit unit, int newValue) throws ModelException {
		// TODO Auto-generated method stub
		unit.setStrength(newValue);
	}

	@Override
	public int getAgility(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getAgility();
	}

	@Override
	public void setAgility(Unit unit, int newValue) throws ModelException {
		// TODO Auto-generated method stub
		unit.setAgility(newValue);
	}

	@Override
	public int getToughness(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getToughness();
	}

	@Override
	public void setToughness(Unit unit, int newValue) throws ModelException {
		// TODO Auto-generated method stub
		unit.setToughness(newValue);
	}

	@Override
	public int getMaxHitPoints(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getMaxHitPoints();
	}

	@Override
	public int getCurrentHitPoints(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getCurrentHitPoints();
	}

	@Override
	public int getMaxStaminaPoints(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getMaxStaminaPoints();
	}

	@Override
	public int getCurrentStaminaPoints(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getCurrentStaminaPoint();
	}

	@Override
	public void advanceTime(Unit unit, double dt) throws ModelException {
		// TODO Auto-generated method stub
		unit.advanceTime(dt);
	}

	@Override
	public void moveToAdjacent(Unit unit, int dx, int dy, int dz) throws ModelException {
		// TODO Auto-generated method stub
		unit.moveToAdjacant(dx, dy, dz);
	}

	@Override
	public double getCurrentSpeed(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getCurrentSpeed();
	}

	@Override
	public boolean isMoving(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.isMoving();
	}

	@Override
	public void startSprinting(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		unit.startSprinting();
	}

	@Override
	public void stopSprinting(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		unit.stopSprinting();
	}

	@Override
	public boolean isSprinting(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.isSprinting();
	}

	@Override
	public double getOrientation(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getOrientation();
	}

	@Override
	public void moveTo(Unit unit, int[] cube) throws ModelException {
		// TODO Auto-generated method stub
		unit.moveTo(cube);
	}

	@Override
	public void work(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		unit.work();
	}

	@Override
	public boolean isWorking(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.isWorking();
	}

	@Override
	public void fight(Unit attacker, Unit defender) throws ModelException {
		// TODO Auto-generated method stub
		attacker.attack(defender);
	}

	@Override
	public boolean isAttacking(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.isAttacking();
	}

	@Override
	public void rest(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		unit.rest();
	}

	@Override
	public boolean isResting(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.isResting();
	}

	@Override
	public void setDefaultBehaviorEnabled(Unit unit, boolean value) throws ModelException {
		// TODO Auto-generated method stub
		unit.setDefaultBehaviorEnabled(value);
	}

	@Override
	public boolean isDefaultBehaviorEnabled(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.isDefaultBehaviorEnabled();
	}

	@Override
	public World createWorld(int[][][] terrainTypes, TerrainChangeListener modelListener) throws ModelException {
		// TODO Auto-generated method stub
		return new World(terrainTypes, modelListener);
	}

	@Override
	public int getNbCubesX(World world) throws ModelException {
		// TODO Auto-generated method stub
		return world.getNbCubesX();
	}

	@Override
	public int getNbCubesY(World world) throws ModelException {
		// TODO Auto-generated method stub
		return world.getNbCubesY();
	}

	@Override
	public int getNbCubesZ(World world) throws ModelException {
		// TODO Auto-generated method stub
		return world.getNbCubesZ();
	}

	@Override
	public void advanceTime(World world, double dt) throws ModelException {
		// TODO Auto-generated method stub
		world.advanceTime(dt);
	}

	@Override
	public int getCubeType(World world, int x, int y, int z) throws ModelException {
		// TODO Auto-generated method stub
		return world.getCubeTypeOf(x, y, z);
	}

	@Override
	public void setCubeType(World world, int x, int y, int z, int value) throws ModelException {
		// TODO Auto-generated method stub
		world.setCubeTypeOf(x,y,z, value);
	}

	@Override
	public boolean isSolidConnectedToBorder(World world, int x, int y, int z) throws ModelException {
		// TODO Auto-generated method stub
		return world.isSolidConnectedToBorder(x,y,z);
	}

	@Override
	public Unit spawnUnit(World world, boolean enableDefaultBehavior) throws ModelException {
		// TODO Auto-generated method stub
		Unit RandomUnit = new Unit("Random", world.getRandomSpawnCube().getPosition(), 50,50,50,50, enableDefaultBehavior);
		world.addUnit(RandomUnit);
		return RandomUnit;
	}

	@Override
	public void addUnit(Unit unit, World world) throws ModelException {
		// TODO Auto-generated method stub
		world.addUnit(unit);
	}

	@Override
	public Set<Unit> getUnits(World world) throws ModelException {
		// TODO Auto-generated method stub
		return world.getActiveUnits();
	}

	@Override
	public boolean isCarryingLog(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.isCarryingLog();
	}

	@Override
	public boolean isCarryingBoulder(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.isCarryingBoulder();
	}

	@Override
	public boolean isAlive(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.isAlive;
	}

	@Override
	public int getExperiencePoints(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getExpPoints();
	}

	@Override
	public void workAt(Unit unit, int x, int y, int z) throws ModelException {
		// TODO Auto-generated method stub
		unit.workAt(x,y,z);
	}

	@Override
	public Faction getFaction(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getFaction();
	}

	@Override
	public Set<Unit> getUnitsOfFaction(Faction faction) throws ModelException {
		// TODO Auto-generated method stub
		return faction.getMembers();
	}

	@Override
	public Set<Faction> getActiveFactions(World world) throws ModelException {
		// TODO Auto-generated method stub
		return world.getActiveFactions();
	}

	@Override
	public double[] getPosition(Boulder boulder) throws ModelException {
		// TODO Auto-generated method stub
		return boulder.getPosition();
	}

	@Override
	public Set<Boulder> getBoulders(World world) throws ModelException {
		// TODO Auto-generated method stub
		return world.getBoulders();
	}

	@Override
	public double[] getPosition(Log log) throws ModelException {
		// TODO Auto-generated method stub
		return log.getPosition();
	}

	@Override
	public Set<Log> getLogs(World world) throws ModelException {
		// TODO Auto-generated method stub
		return world.getLogs();
	}


	@Override
	public ITaskFactory<Expression<? extends Type> , Statement , Task> createTaskFactory() {
		// TODO Auto-generated method stub
		return new TaskFactory();
	}

	@Override
	public boolean isWellFormed(Task task) throws ModelException {
		// TODO Auto-generated method stub
		return task.isWellFormed();
	}

	@Override
	public Scheduler getScheduler(Faction faction) throws ModelException {
		// TODO Auto-generated method stub
		return faction.getScheduler();
	}

	@Override
	public void schedule(Scheduler scheduler, Task task) throws ModelException {
		// TODO Auto-generated method stub
		task.addSchedulers(scheduler);
	}

	@Override
	public void replace(Scheduler scheduler, Task original, Task replacement) throws ModelException {
		// TODO Auto-generated method stub
		original.replaceTask(scheduler, replacement);
	}

	@Override
	public boolean areTasksPartOf(Scheduler scheduler, Collection<Task> tasks) throws ModelException {
		// TODO Auto-generated method stub
		for (Task i : tasks){
			System.out.println();
			if (! i.getSchedulers().contains(scheduler))
				return false;
		}
		return true;
	}

	@Override
	public Iterator<Task> getAllTasksIterator(Scheduler scheduler) throws ModelException {
		// TODO Auto-generated method stub
		return scheduler.iterator();
	}

	@Override
	public Set<Scheduler> getSchedulersForTask(Task task) throws ModelException {
		// TODO Auto-generated method stub
		return task.getSchedulers();
	}

	@Override
	public Unit getAssignedUnit(Task task) throws ModelException {
		// TODO Auto-generated method stub
		return task.getAssignedUnit();
	}

	@Override
	public Task getAssignedTask(Unit unit) throws ModelException {
		// TODO Auto-generated method stub
		return unit.getTask();
	}

	@Override
	public String getName(Task task) throws ModelException {
		// TODO Auto-generated method stub
		return task.getName();
	}

	@Override
	public int getPriority(Task task) throws ModelException {
		// TODO Auto-generated method stub
		return task.getPriority();
	}

}
