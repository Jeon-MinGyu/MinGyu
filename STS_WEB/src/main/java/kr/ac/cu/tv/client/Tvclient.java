package kr.ac.cu.tv.client;

import kr.ac.cu.tv.model.vo.LGTV;
import kr.ac.cu.tv.util.*;

public class Tvclient {

	public static void main(String[] args) {
		TV tv= new LGTV;
		tv.powerOn();
		tv.powerOff();

	}

}
