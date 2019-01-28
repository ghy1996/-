package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016092300579171";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC8VleIDva9ROfdaMZv8m2t4R35gKJYsqxjJBnC6NLaPgnGWIZH6q/tLEGEFc8J6z7y4ziAoPn3JkTQZWXxgCMA2NZbmS+Myi1+WTayhwmQhFRg7FZ6m16657F/yWQEa+6gcV6oSizKKk0UzvDYrp7l9vD0nbflvmy4BahCD7Xk5bf4sjmK+lyXwUyimYh8P1a/7e3a6XEJXbWtISeVLomVog0KvGDCMJmNNxvF0aQyIcrhg9WERMc9zb4tjPkqt6qd4F8dzQNLsBLdSsHdAmLpDOu9tfppI9do5Ujr+g58cTLIIdLPcxCYvK+yk5EI/tzZZQKDKYAS3oeIMQFS0nJjAgMBAAECggEANzvLJ+fbjN5scY6Mw8ABUoE23TlQY1rjG6A2veayD7cp/rVvjB/TwGa+QBJ1SZ9oMqtYosCTDlx2yfcy0oSVv2XYV7yxKUUR2oAnfmwD7hIg/NvS8NooCgBxGdziLDnLHdqhvBEk2ZVWTcfy8lkj2KV3PQYULJiQIdfm5Jje62XCG1fGvky9N1Na4yk6ORoX2/519tpNcbstmFaKmmnWp2HcQ+ZT38kD3/z/t1dPN+cqprXDnVWdEt3pPC6dSzz6BVeOgG+3XI7WbvsrEZy0GYktlMYpK8RZwIBN2wVaFPsK0FcIIG5QAYNKgxljFztblM2EKPKqhKmjbjrAgdkqwQKBgQDwx8P3OKrcL+5YOj3sYD30vu+5r4pbnwGEukYPdJ8rTTecLviIBhWDp9zfT927SmYhpsYZ6mjdx5N1mrROUUGsuBiWSyfo+XLJTVfLz4ibqZoVFC9uG+bbwEftZg4ScnK8pF327vZHVjZyQVAaFTtM557ysWLUtGVLBhE86x4NWQKBgQDIPfVsfWtRrhcDqjUtlIQB3OSatjW8cOeueklJcyKB6NQYcnQXu/zGZFruxvK0Hgtv7kgrw0r21AKbVukp8hkqP0QjE1kT+j+Xe8no75cBSnXH0zE5bdLwnmlGD6fT1iPCOoscnduPxoDAhwCSYc2lyUSVdfDRvO7fYWHm3iwaGwKBgDneWSvms7Hd1zPfM5jG/L0A0s7W8LLagVvsBQCb79FRaqcf5t2SUMNmqcAGCu2DkQ5Pbdc2rmN3Huqp9uHHx7gCOu6MO5hTs5HMA+jZBSUcWwrr4gZdsFtqWB8nYwRt+0N5YZgCkLBOeSF2rxDFv43ZMSt1FKK4hIvGdogkngFpAoGAZf4RFNppIGiA9m/quDWua1h85ESs6DfF+jv1OkE3sV3LMkyRz0kEPnT9UCPrmUy4XKHNBuVpOIHSdhb1mlTi9n7VENyZAbD0VQ9LT6dBjfnENizfJLZIvCCj1HjC7gZjnlm9Y60QGZJtICNjaiwA2FHE6i/xopMORJ9Qg4xkgEMCgYBON0RqjU+Y8wMWSs1+f0jGmqP/qz3AIgYMa0vrC9FYttz+TI1XM8sq3L3+oXrdK/ZH5NO6n74Df8/t0kXlazjal+D6IqzhuI5/i1bxTkQrGXzbk/9JhnWfhGyjwbsgjLYQwcIEGkvGxtdwFDbKdKCyenpMRIWvVcfviMZ9fm+ELA==";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyUl+vbKyECgh3rMDPhanjePF+AGCjeq0+lWYtp3JnTbYgbE427bi1CVh90otr9vFlliKEwflA++79eehP5iNY9WGTX5o5ycHdZlAzUU0858kEM+1fFHqRDXSrN3S/Gn0kQRCmu+sdt1L1WL5+aAEovncvZUwo+KTwfGEFuoWnclCi5Fy54rPfFDRp9FGjcazuCoWacHxdnLHr9O3K+w1V8wt/mufKQyx2gF635daoq1Y8soLtT2+jhEAZHMoOio7TK1xNXNxO1+6XrKhwvafXmjr0ESy2IbmokJ63IVmV7hKp1DwU1EgP0IZSlByS1uRZp9Z/yTFZTpI7WAaHsibfQIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
