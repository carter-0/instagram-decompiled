package X;

/* renamed from: X.7Mj  reason: invalid class name and case insensitive filesystem */
public final class C330337Mj implements C74339PtF {
    public final /* synthetic */ C330327Mi A00;

    public C330337Mj(C330327Mi r1) {
        this.A00 = r1;
    }

    public final void DrC(C67292MlR mlR) {
        String str;
        C299305uu r4 = mlR.A01;
        C330327Mi r3 = this.A00;
        2Eq r0 = (2Eq) r3.A02.invoke();
        if (r0 != null) {
            String C6C = r0.C6C();
            String C6k = r0.C6k();
            String str2 = r4.A01;
            if ((str2 != null && str2.equals(C6C)) || ((str = r4.A00) != null && str.equals(C6k))) {
                C330327Mi.A00(r3, mlR);
            }
        }
    }
}
