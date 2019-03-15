/*
상위      차Car

하위		택시Taxi 150							버스Bus  110							트럭Truck 100
			요금price								승객수pcount							중량weight, 최대중량maxWeight
			요금계산int calcPrice(int km)		타다int getOn(int pcount)			상차loadUp()
			3800 + km당100원					내리다int getOut(int pcount)		하차loadDown()

1. 요금
	기본요금(basicPrice)
		일반 : 3800
		심야 : 5000
	요금합(totalPrice)
	요금(price)
		일반 : 100/km
		심야 : 150/km
2. 요금계산(calcPrice())
3. 심야할증 : 0 ~ 6시
*/
public class Bus extends Car{
	//실력이 개판이군. 다시하게 영찬군
}
