package X;

/* renamed from: X.9Ms  reason: invalid class name and case insensitive filesystem */
public final class C377669Ms extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377669Ms(Object obj, String str, int i, int i2, boolean z) {
        super(1);
        this.A00 = i2;
        this.A03 = str;
        this.A01 = i;
        this.A02 = obj;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        switch (this.A00) {
            case 0:
                C251243mn r5 = (C251243mn) obj;
                0qQ.A0B(r5, 0);
                z = r5.AFt(this.A02, this.A03, this.A01, this.A04);
                break;
            case 1:
                C251243mn r52 = (C251243mn) obj;
                0qQ.A0B(r52, 0);
                z = r52.AFu(this.A03, (0sP) this.A02, this.A01, this.A04);
                break;
            default:
                C251243mn r53 = (C251243mn) obj;
                0qQ.A0B(r53, 0);
                return r53.AjT(this.A02, this.A03, this.A01, this.A04);
        }
        return Boolean.valueOf(z);
    }
}
