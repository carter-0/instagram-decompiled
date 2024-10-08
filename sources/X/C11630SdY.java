package X;

/* renamed from: X.SdY  reason: case insensitive filesystem */
public final class C11630SdY implements AnonymousClass2gO {
    public final /* synthetic */ 2Fk A00;
    public final /* synthetic */ 2Fc A01;

    public C11630SdY(2Fk r1, 2Fc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        SEH seh = (SEH) obj;
        0qQ.A0B(seh, 0);
        Throwable th = seh.A01;
        if (th == null) {
            String str = (String) seh.A00;
            if (str != null) {
                this.A01.A02(str);
            }
        } else {
            th.getMessage();
            2Fc r4 = this.A01;
            C2818059q r3 = r4.A03;
            if (r3 != null) {
                r3.A00(new Exception(th), "FAILURE", "FAILURE", C2818359t.A01((String) null, r4.A00));
                String A04 = 182.A04(0Tu.A06, r4.A03, 36873380867670029L);
                2HH r0 = 2HH.A02;
                r4.A01(r0, r0, A04);
            } else {
                0qQ.A0F("uplLogger");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        this.A00.A05(Pxm.A08);
        this.A01.A04.clear();
    }
}
