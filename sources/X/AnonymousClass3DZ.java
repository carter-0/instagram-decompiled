package X;

/* renamed from: X.3DZ  reason: invalid class name */
public final class AnonymousClass3DZ extends C71642eY {
    public final AnonymousClass4DJ A00;
    public final AnonymousClass4DL A01;
    public final C238693Db A02;
    public final C252233om A03;
    public final AnonymousClass4DQ A04;

    public static AnonymousClass3DZ A00(AnonymousClass4DQ r3) {
        return new AnonymousClass3DZ((AnonymousClass4DJ) r3, (AnonymousClass4DL) r3, r3);
    }

    public AnonymousClass3DZ(AnonymousClass4DJ r3, AnonymousClass4DL r4, AnonymousClass4DQ r5) {
        AnonymousClass3Da r1 = new AnonymousClass3Da(this);
        this.A02 = r1;
        C238703Dc r0 = new C238703Dc(this);
        this.A03 = r0;
        this.A04 = r5;
        this.A00 = r3;
        this.A01 = r4;
        r3.registerLifecycleListener(r0);
        r4.addFragmentVisibilityListener(r1);
    }
}
