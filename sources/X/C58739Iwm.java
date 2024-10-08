package X;

/* renamed from: X.Iwm  reason: case insensitive filesystem */
public final class C58739Iwm extends 0Yg implements 0sP {
    public final int A00;
    public final String A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58739Iwm(String str, String str2, int i) {
        super(1);
        this.A00 = i;
        if (i != 0) {
            this.A02 = str;
            this.A01 = str2;
        } else {
            this.A01 = str;
            this.A02 = str2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C70840ONr oNr = (C70840ONr) obj;
            0qQ.A0B(oNr, 0);
            oNr.A03("action", "result_discarded");
            oNr.A03("share_type", this.A02);
            oNr.A03("error_message", this.A01);
        } else {
            C254523sc r5 = (C254523sc) obj;
            0qQ.A0B(r5, 0);
            0jB A0k = C51965G9l.A0k();
            String str = this.A01;
            String str2 = this.A02;
            A0k.A04(C271774jZ.A73, str);
            A0k.A04(C271774jZ.A74, str2);
            r5.A0p = A0k;
        }
        return C60340gF.A00;
    }
}
