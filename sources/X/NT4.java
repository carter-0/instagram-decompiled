package X;

public final class NT4 extends C70759OKf {
    public final long A00;
    public final long A01;
    public final long A02;
    public final Integer A03;
    public final String A04;

    public NT4(Integer num, Integer num2, String str, String str2, long j, long j2, long j3) {
        super(num, str2);
        this.A01 = j;
        this.A00 = j2;
        this.A04 = str;
        this.A02 = j3;
        this.A03 = num2;
    }

    public final String A00() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("threadJid=");
        A1A.append(this.A01);
        A1A.append(" senderEimuId=");
        A1A.append(this.A00);
        A1A.append(" messageId=");
        A1A.append(this.A04);
        A1A.append(" wa_timestamp=");
        A1A.append(String.valueOf(this.A02));
        Integer num = this.A03;
        if (num != null) {
            int intValue = num.intValue();
            A1A.append(" placeholderType=");
            A1A.append(intValue);
        }
        String str = this.A02;
        if (str != null) {
            A1A.append(" oneTraceId=");
            A1A.append(str);
        }
        return DbT.A10(A1A);
    }
}
