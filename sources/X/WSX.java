package X;

public final class WSX implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C255773uh A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        WSX wsx = (WSX) obj;
        if (!2PP.A00(this.A04, wsx.A04) || this.A00 != wsx.A00) {
            return false;
        }
        return true;
    }

    public WSX(DTP dtp, C255773uh r3, int i) {
        this.A03 = r3;
        this.A01 = dtp.getName().hashCode();
        this.A04 = dtp.getValue();
        this.A00 = dtp.getCount();
        this.A02 = i;
    }
}
