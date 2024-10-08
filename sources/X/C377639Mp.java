package X;

/* renamed from: X.9Mp  reason: invalid class name and case insensitive filesystem */
public final class C377639Mp extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377639Mp(Object obj, String str, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            String str = (String) obj;
            0qQ.A0B(str, 0);
            ((C249813kP) this.A02).A04(str, this.A03, this.A01);
        } else {
            AnonymousClass5SW r5 = (AnonymousClass5SW) obj;
            0qQ.A0B(r5, 0);
            C285645Sc.A03(r5, this.A03);
            C285645Sc.A02(r5, 0);
            C285645Sc.A04(r5, (String) null, new MJ3(this.A01, 13, this.A02));
        }
        return C60340gF.A00;
    }
}
