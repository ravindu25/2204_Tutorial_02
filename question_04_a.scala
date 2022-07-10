
object Q4a extends App{
def normal_salary(normal_hours:Int):Int=normal_hours*250
def ot_salary(ot_hours:Int):Int=ot_hours*85
def total_salary(n_hrs:Int,ot_hrs:Int):Int=normal_salary(n_hrs)+ot_salary(ot_hrs)
def tax(tot_sal:Int):Double=tot_sal*0.12
def take_home_sal(n_hrs:Int,ot_hrs:Int):Double=total_salary(n_hrs,ot_hrs)-tax(total_salary(n_hrs,ot_hrs))

println("Rs. "+take_home_sal(40,20));

}