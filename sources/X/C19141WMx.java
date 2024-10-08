package X;

/* renamed from: X.WMx  reason: case insensitive filesystem */
public final class C19141WMx implements YAE {
    public final /* synthetic */ AnonymousClass5AC A00;
    public final /* synthetic */ C279254yK A01;
    public final /* synthetic */ String A02;

    public C19141WMx(AnonymousClass5AC r1, C279254yK r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void DLp(C17731Vd0 vd0) {
        C279254yK r2 = this.A01;
        r2.A05.put(this.A02, vd0);
        r2.A08.add(vd0);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.Vd0, java.lang.Object] */
    public final void DME() {
        long j;
        28e r2 = 28e.A03;
        try {
            String str = this.A00.A0D;
            if (str != null) {
                r2 = 28e.valueOf(str);
            }
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
        AnonymousClass5AC r1 = this.A00;
        long j2 = r1.A08;
        String str2 = r1.A0B;
        String str3 = r1.A0E;
        String obj = r2.toString();
        long j3 = r1.A05;
        long j4 = j3 + r1.A02;
        boolean A1W = AnonymousClass7TF.A1W(r2, 28e.A02);
        long j5 = j4 - j3;
        C16667Uz3 uz3 = C16667Uz3.VIDEO;
        if (!A1W) {
            j = j2;
        } else {
            j = -1;
        }
        boolean z = !A1W;
        ? obj2 = new Object();
        obj2.A04 = j2;
        obj2.A0B = str2;
        obj2.A0C = null;
        obj2.A03 = j;
        obj2.A05 = j;
        obj2.A0D = str3;
        obj2.A0A = obj;
        obj2.A08 = uz3;
        obj2.A06 = j3;
        obj2.A01 = j4;
        obj2.A00 = z ? 1 : 0;
        obj2.A07 = j5;
        obj2.A09 = null;
        obj2.A0G = z;
        obj2.A0E = null;
        C279254yK.A01(this.A01, obj2, this.A02);
    }
}
