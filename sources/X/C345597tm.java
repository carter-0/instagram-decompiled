package X;

/* renamed from: X.7tm  reason: invalid class name and case insensitive filesystem */
public abstract class C345597tm extends C344467ru implements C345607tn {
    public int A00;
    public final C3496981j A01 = new C3496981j();

    public C345597tm(C343837qt r2) {
        this.A00 = r2;
    }

    public final C342687p0 A0A() {
        C340607lX Ajm = Ajm();
        if (Ajm == null || !Ajm.isConnected()) {
            return null;
        }
        try {
            return Ajm.AlD();
        } catch (C352928Fp unused) {
            return null;
        }
    }
}
