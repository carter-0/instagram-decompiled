package X;

/* renamed from: X.WMz  reason: case insensitive filesystem */
public final class C19143WMz implements YAE {
    public final /* synthetic */ AnonymousClass5AC A00;
    public final /* synthetic */ C279254yK A01;
    public final /* synthetic */ String A02;

    public final void DME() {
    }

    public C19143WMz(AnonymousClass5AC r1, C279254yK r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void DLp(C17731Vd0 vd0) {
        AnonymousClass5AC r0 = this.A00;
        long j = r0.A08;
        String str = r0.A0A;
        vd0.A02 = j;
        vd0.A09 = str;
        C279254yK r3 = this.A01;
        String str2 = this.A02;
        Object remove = r3.A05.remove(str2);
        if (remove != null) {
            r3.A08.remove(remove);
        }
        r3.A07.remove(str2);
        r3.A04.A04(str2);
    }
}
