package cn.quartz;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.bill99.ifs.credit.bank.common.DateUtil;
@Component
public class QuarztJobDetailService {

	
	public void printStr(){
		System.out.println("------------cunrrent time :"+DateUtil.convertDate(new Date(), DateUtil.Y_M_DHMS));
	}
}
