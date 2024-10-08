package X;

/* renamed from: X.4UB  reason: invalid class name */
public final class AnonymousClass4UB extends 0ng {
    public final /* synthetic */ AnonymousClass4OI A00;
    public final /* synthetic */ AnonymousClass4U9 A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4UB(AnonymousClass4OI r4, AnonymousClass4U9 r5, boolean z) {
        super(207, 3, false, false);
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = z;
    }

    public final void run() {
        Integer num;
        AnonymousClass4U9 r4 = this.A01;
        if (r4.A09) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        C291295gv r5 = new C291295gv(this.A00, num, r4.A0A, this.A02);
        274 r42 = 1wS.A01(r4.A02).A00;
        C255653uU r3 = r5.A00.A0K;
        r3.A01();
        if (r3.A0G == null) {
            27B.A02("HeroManager", "Skip warmup request because of nul video id. Video type: %s, url %s", new Object[]{r3.A07, r3.A05});
        } else {
            274.A00(r42).post(new C291305gw(r42, r5));
        }
    }
}
