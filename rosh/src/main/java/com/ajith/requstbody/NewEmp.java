package com.ajith.requstbody;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@ResponseBody
public class NewEmp {
	private String name;
	private String pnumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	@Override
	public String toString() {
		return "NewEmp [name=" + name + ", pnumber=" + pnumber + "]";
	}
	

}
