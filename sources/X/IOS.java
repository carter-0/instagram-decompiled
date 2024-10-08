package X;

public final class IOS implements C232262tL {
    public final C319156q8 A00;

    public IOS(C319156q8 r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        IOS ios = (IOS) obj;
        0qQ.A0B(ios, 0);
        C319156q8 r3 = this.A00;
        String str = r3.A03;
        C319156q8 r2 = ios.A00;
        if (!0qQ.A0K(str, r2.A03) || !0qQ.A0K(r3.A01(), r2.A01())) {
            return false;
        }
        return true;
    }
}
