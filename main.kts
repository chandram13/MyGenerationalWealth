// Marvish Chandra
class livingExpenses{
    fun averageYearly(monthlySalary,basicUtilities = 300,monthlyInternet, monthlyCellular){
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
        mspouseCost = carLease + groceries + menClothing + menHealth + mCarinsurance + travelingCost + subscriptions + ccDebt 
        fspouseCost = carLease + groceries + femClothing + femHelth + fCarinsurance + travelingCost + subscriptions + ccDebt
        married_mSpouse = mspouseCost + first_child_cost + second_child_cost
        married_fSpouse = fspouseCost + first_child_cost + second_child_cost
        preschoolCost = 1,135 * 12
        primaryschool_cost = 16,102 * 12
        public_secondary_cost = 30,000 * 12
        private_secondary_cost = 60,000 * 12
        first_child_cost = preschoolCost + primaryschool_cost 
        second_child_cost = preschoolCost + primaryschool_cost
        marriedYearly = married_mSpouse + married_fSpouse + rent 
        unmarriedYearly = mspouseCost + fspouseCost + rent
        mIndividual = mspouseCost + rent + ownpet
        fIndividual = fspouseCost + rent + ownpet
    }
    fun main(){
        print(mIndividual)
        print(fIndividual)
        print(mspouseCost)
        print(fspouseCost)
        print(marriedYearly)
        print(unmarriedYearly)
    }
}