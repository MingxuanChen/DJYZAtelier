package com.djyz.config;
public class AlipayConfig {
	public static String app_id = "2016102300744435";
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDKmxMBDKlnTK3D6gr3LBOdhSd6nyA2sowbB+7HnI32vhBqcS32m00TNNaGhA4TXKSXPkmWd8DU9kzA1HMoDh5BqhyJrMZuqP7GItSIYFZKw4gi1026QwlSb5HVYgWf03GLQQXjNbK9KXpxwTCRRfwsXOpztawWiTTnJM8ssdNgtYtwZMdxRiwq1IN3606qT7ht7ZwxCMdx7ddtHKOCGDqMNOeO5y9+msvSI8Kk8APLhANGb/l6+TT6YUwM5W/YZHiNiAj5AQ2RHv8oj3jGZaKNXmUgq1L13Q7r9eHOCm2YbX90zwknZxMMw1IA2MnjYMlPJ87VyuJgIzRdc648ssltAgMBAAECggEAMMlYsScAX8x6BzQDQfOOIZ8fm4pXsnQaAqRNXimXkbPAtjDctYY98AMIKUoBLa5gP78S7zWU7HMGlmRR+nIz3PH+fzRob9snxkQ600AHZ2dgD6uynshnpT8SacR5wDulGrgkl8qlaKFlR6ESddjZWUFif0xezOprH8GgVY3YbW+78VXE+Wlatf8hQRaufL2+eQQrF5nQ73MmI4QF211dTKrHWLqMMvm0Un719+YKft98eSwPFdPxQscSeyB5y4YMuz26Lb9cWkRXwy0GQcMAxbHNrztXx+DBQjY0LE6q9tbTRQlLEtKiOB9RF1XiZJSsqzGMCbLUCHvd8syASewNLQKBgQDxDeawc/lvrDI13l66MrUk+CRsegIWiIxfH0KhuqvA5x2OymMcLTzX+JAmjRvmlS1ZWo7wmJj2knKbl3191N8ce2vNLh14NtwvGs8Lvciubw9+//yhAUkHPn1JUZPlizR8HaQToaOIbkMcrsVHhSHYDrG7qI1SvL0Xn/an3nvEuwKBgQDXKud+31k5rKiTtTmYSes2WXfQm9820fy4tgbjJT+YICZ7T/ZYPJ7eSZ4dNOHQugup5P4E8bSQgqDiWrizL5D4ckyulpSUmJ+aMCl9MbtULIq0FQSwHmPVBEivi66O1yh2/Vp85L+lwzgESXqazqW0eE9p/jsuSOXSRS2udDTb9wKBgQCMYjMiOjhfL+KB+sIiIBvcruLPhfKnWtidISB1/be+/Rn6qaU0qKfRg0G4Id/I1sH1UscCGWyj1MAIGx6LZKiW9s3eTWf+NbzfdfZ0eQ9hfu6AYOaogY4dOOhQBcFjIkHrsnt2r2EEuGo/Tw03TLJcGJqrlkrPj3l0Q8WrF+futwKBgQDWR/khpebjBCsiZuHD4yGnD7S+AO1sV/W6MjVrsyXBJ4uLVNf9iemhcGlRpt+Ykh+Zg97iJ6BuJll482ZrtNxIQPRTDs1Lqy+PS5WWA5gOvQkpTKFNkAZWFx0YDiC6SlYXIjsilGC0AVXhFxhN4ayurP5RjYl8j8apAJH84efegwKBgHN2kYlqcHnoMu+ale2KEcEnmxoyVTvUz2HzI67QduuxIHGOst5iq2ytdhJ8t7N93ois6pDJ++Trqascp6srrlPOlPkV9wF1Fy8zJo+qok0+q3BySpYZYqMD42uq0mPWYWLD22MA31X7Ds2u0qXOGRYK5rkHVPvqmjkZ0KbguUsC";
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk564A/94eHtA/1h0GxIeIP3kL9IkI1PzgwBb8FIwoREX7DMzuz5VEU5S2ZA5Ebq5gnnemQ3F9DsTwkqvczwF6QmAeeWGznfi2/E5JDh55SUI1m/4VfJSXfas34SmNTdItUzz7AIIu1HCdEuBxMWcAZXE6l5vBHdmtheTlYpQpePDsTxIuiU4BQ96bvZ2DGjIM7D3joiJ3Gn+y9RLscFXHZ1dFMD0BtbxHhufd3GAwryasIlx/6rAxWwIdNTi+Rm6++7s0RLcs/JHUlaYvo7NOGSgZoxbNcj3u8G/5RKhBVzkIgcptzai9NwYep7uFNhGI/EZihcN7mNynTrbPdp13QIDAQAB";
	public static String notify_url = "http://efvya2.natappfree.cc/alipay.trade.page.pay-JAVA-UTF-8/payNotify";
	public static String return_url = "http://efvya2.natappfree.cc/alipay.trade.page.pay-JAVA-UTF-8/payReturn";
	public static String sign_type = "RSA2";
	public static String charset = "utf-8";
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}