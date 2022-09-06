// Marvish Chandra
class livingExpenses{
    fun averageYearly(monthlySalary,basicUtilities = 300,monthlyInternet, monthlyCellular)
        rent = 2,796 * 12 
        carLease = (30,000) / 12 * monthlySalary 
        utilities = basicUtilities + monthlyInternet + monthlyCellular
        groceries = 110 * 12
        menClothing = 326 * 12 + (78.60 * 2) + (100.38) * 4
        femClothing = (35.81 * 7) * 48
        mCarinsurance = 1470 * 12
        fCarinsurance = 1480 * 12
        travelingCost = 30,000
        menHealth = 838
        femHealth = 1,136
        ownpet = 100 * 12
        subscriptions = 300
        ccDebt = 5,300 * 12
        mCost = carLease + groceries + menClothing + menHealth + mCarinsurance + travelingCost + subscriptions + ccDebt 
        fCost = carLease + groceries + femClothing + femHelth + fCarinsurance + travelingCost + subscriptions + ccDebt
        married_mSpouse = mCost + first_child_cost + second_child_cost
        married_fSpouse = fCost + first_child_cost + second_child_cost
        preschoolCost = 1,135 * 12
        primaryschool_cost = 16,102 * 12
        public_secondary_cost = 30,000 * 12
        private_secondary_cost = 60,000 * 12
        first_child_cost = preschoolCost + primaryschool_cost 
        second_child_cost = preschoolCost + primaryschool_cost
        marriedYearly = married_mSpouse + married_fSpouse + rent 
        unmarriedYearly = mspouseCost + fspouseCost + rent
        mIndividual = mCost + rent + ownpet
        fIndividual = fCost + rent + ownpet
}
class overallSavings{
    fun myInvestments(donatedYears)
        investingMoney = monthlySalary * 0.05 * donatedYears
        childrenSavings = investingMoney * 0.10 * 20
        marriedSavings = investingMoney * 2
    fun myRetirement(timeWorked)
        employerSavings = monthlySalary * 0.01 * timeWorked

    fun main()
        print(mIndividual)
        print(fIndividual)
        print(mspouseCost)
        print(fspouseCost)
        print(marriedYearly)
        print(unmarriedYearly)
}
