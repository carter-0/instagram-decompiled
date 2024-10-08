package X;

/* renamed from: X.65h  reason: invalid class name and case insensitive filesystem */
public final class C3027965h extends C331647Ru implements C13907Tl7 {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final C62320sa A02;
    public final C62320sa A03;
    public final C62320sa A04;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void onResume(AnonymousClass07Z r6) {
        C333317Ym r4 = (C333317Ym) this.A01.getValue();
        if (((AnonymousClass7PG) r4.A07.getValue()).A01 == AnonymousClass7PF.NONE && r4.A00 != null) {
            C318136oS A002 = C318116oQ.A00(r4);
            1Eo.A05(19B.A00, new C58102ImO(r4, (AnonymousClass4D7) null, 23), A002);
        }
    }

    public C3027965h(C331627Rs r6, C62320sa r7, C62320sa r8, C62320sa r9) {
        super(r6);
        this.A02 = r7;
        this.A04 = r8;
        this.A03 = r9;
        this.A01 = new C227862kA(new AnonymousClass9L5(this, 20), new AnonymousClass9L5(r6, 21), C317496nM.A00, new 0Yh(C333317Ym.class));
        this.A00 = AnonymousClass1YB.A00(new AnonymousClass9L5(r6, 19));
    }
}
