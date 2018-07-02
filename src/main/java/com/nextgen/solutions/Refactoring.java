package com.nextgen.solutions;

public class Refactoring {
	
	private String var1;

	private String var2;

	private String var3;

	private String var4;
	/**
	 * @return the var1
	 */
	public String getVar1() {
		return var1;
	}

	/**
	 * @param var1 the var1 to set
	 */
	public void setVar1(String var1) {
		this.var1 = var1;
	}

	/**
	 * @return the var2
	 */
	public String getVar2() {
		return var2;
	}

	/**
	 * @param var2 the var2 to set
	 */
	public void setVar2(String var2) {
		this.var2 = var2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Messages.getString("Refactoring.0") + var1 + Messages.getString("Refactoring.1") + var2 + Messages.getString("Refactoring.2") + getVar1() + Messages.getString("Refactoring.3") + getVar2() //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				+ Messages.getString("Refactoring.4") + hashCode() + Messages.getString("Refactoring.5") + getClass() + Messages.getString("Refactoring.6") + super.toString() //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ Messages.getString("Refactoring.7"); //$NON-NLS-1$
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Refactoring(String var1, String var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}

	public Refactoring() {
		super();
		// TODO Auto-generated constructor stub
	}

}
