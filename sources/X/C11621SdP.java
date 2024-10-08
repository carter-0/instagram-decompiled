package X;

/* renamed from: X.SdP  reason: case insensitive filesystem */
public final class C11621SdP implements C13907Tl7 {
    public 00Y A00;
    public 00Y A01;
    public boolean A02;
    public final C262224Cq A03;
    public final C249513ju A04;
    public final 00c A05;
    public final C62320sa A06;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.00i] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.00i] */
    public final void onCreate(AnonymousClass07Z r7) {
        0qQ.A0B(r7, 0);
        00c r5 = this.A05;
        String A0R = 002.A0R("googleAuthFlow-", C61887KQc.__redex_internal_original_name);
        this.A00 = r5.A01(new C11536Sbx(this, 2), new Object(), r7, A0R);
        String A0R2 = 002.A0R("googleAuthWithNewClientFlow-", C61887KQc.__redex_internal_original_name);
        this.A01 = r5.A01(new C11536Sbx(this, 3), new Object(), r7, A0R2);
    }

    public final void onDestroy(AnonymousClass07Z r2) {
        this.A02 = true;
        this.A00 = null;
        this.A01 = null;
        this.A06.invoke();
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public C11621SdP(00c r1, C62320sa r2, C262224Cq r3, C249513ju r4) {
        AnonymousClass7TG.A1Q(r1, r4);
        this.A05 = r1;
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = r2;
    }
}
