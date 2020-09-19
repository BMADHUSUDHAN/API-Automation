package resources;

import Pojo.AdminLogin;

public class TestDataBuild {

	public AdminLogin adminLoginpayLoad()

	{
		AdminLogin a = new AdminLogin();
		
		
		a.setUsername(username);
		a.setPasssword(passsword);
		a.setCategory("Tenant");
		a.setChannel("AdminPortal");
		a.setTenantCode("bot");
		a.setLoginExchangekey("2c9083a8740166cc017438d228e11dfa");
		a.setFormData("{\\r\\n  \\\"userName\\\": \\\"frbadmin\\\","
				+ "\\r\\n  \\\"password\\\": \\\"6ee1a1130dadc59987be7d7affe25750c9ba79502bfb1707549568e6e1e1dd5fd293c779ba838f0b934765b7b63feebe5325221ce56c5cd7ffc67336e03e855a3df9e31fc739c433f2c67576d0f6acca2519e92757e81d44c0b327f792a5d69e5ca9e904cb2b8737da5150ba79b41c5200767a85fd495c3e9a710acf27192265ca2674c8767410c6e6312765263e7367e810532b0471bfbdc8a3f361511b83c9a0b98084eaf9d54230bcd9c7ad71531cb544813bf03ba98bd17fc43f1c83e5dafc8cdcfa0e2484808e5b84d27a2eba6fa9fc8125517a87741d0d1b3abe275348aba74f01a707850722f4bfc2118b65b20a497f6b9ad3e83502cc80ac31926e5e\\\","
				+ "\\r\\n  \\\"category\\\": \\\"Tenant\\\",\\r\\n " + " \\\"tenantCode\\\": \\\"bot\\\"\\r\\n}");
		
		
		return a;
	}

}
