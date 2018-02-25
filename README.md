# iceformat
iceformat

springmvc默认使用时间戳作为Date的显示格式,但是通常希望Date显示为yyyy-MM-dd HH:mm:ss格式.
此时可以使用如下注解:
@JsonSerialize(using=IceDateFormat.class)
@JsonSerialize(using=IceNumFormat.class)
