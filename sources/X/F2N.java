package X;

public final class F2N {
    public long A00 = 0;
    public long A01 = 0;
    public Integer A02;
    public final String A03;

    public F2N(Integer num, String str) {
        this.A03 = str;
        this.A02 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("\n        AfiState(\n            totalDwellTimeInMs=");
        A1A.append(this.A01);
        A1A.append(",\n            lastDwellCheckTime=");
        A1A.append(this.A00);
        A1A.append(",\n            afiIniRenderingStatus=");
        if (this.A02.intValue() != 0) {
            str = "SHOWING";
        } else {
            str = "NOT_SHOWING";
        }
        A1A.append(str);
        A1A.append("),\n            adId=");
        A1A.append(this.A03);
        return AnonymousClass7TF.A0l(",\n    ", A1A);
    }
}
