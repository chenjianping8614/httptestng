package com.httptest.httpinterface;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.httptest.httpinterface.mobilephones.MobilePhone;
import com.httptest.httpinterface.mobilephones.Os;
import org.springframework.stereotype.Component;

/***
 * 用HashMap模拟数据库存储数据
 * 
 * @author httptest
 *
 */
@Component
public class MobilePhoneRepository {

	private static final Map<String, MobilePhone> mobilePhones = new HashMap<>();

	@PostConstruct
	public void init() {
		MobilePhone iPhone6S = new MobilePhone();
		iPhone6S.setBrand("Apple");
		iPhone6S.setModel("iPhone 6S");
		iPhone6S.setOs(Os.IOS);
		mobilePhones.put(iPhone6S.getModel(), iPhone6S);
		MobilePhone motoZ = new MobilePhone();
		motoZ.setBrand("Motorola");
		motoZ.setModel("moto Z");
		motoZ.setOs(Os.ANDROID);
		mobilePhones.put(motoZ.getModel(), motoZ);
		MobilePhone p30 = new MobilePhone();
		p30.setBrand("HUAWEI");
		p30.setModel("P30");
		p30.setOs(Os.ANDROID);
		mobilePhones.put(p30.getModel(), p30);
	}

	public MobilePhone getMobilePhone(String model) {
		return mobilePhones.get(model);
	}

}
