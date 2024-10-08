package X;

import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Wpk  reason: case insensitive filesystem */
public final class C20345Wpk implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C15436Ucm A01;
    public final /* synthetic */ C16387Uu4 A02;
    public final /* synthetic */ UD6 A03;
    public final /* synthetic */ AnonymousClass0iw A04;
    public final /* synthetic */ AnonymousClass4M3 A05;

    public C20345Wpk(C15436Ucm ucm, C16387Uu4 uu4, UD6 ud6, AnonymousClass0iw r4, AnonymousClass4M3 r5, int i) {
        this.A02 = uu4;
        this.A01 = ucm;
        this.A03 = ud6;
        this.A05 = r5;
        this.A04 = r4;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.4Nf, X.Utz] */
    public final void run() {
        C16387Uu4 uu4 = this.A02;
        C15436Ucm ucm = this.A01;
        UD6 ud6 = this.A03;
        1GF A002 = 1GE.A00(uu4.A06);
        boolean z = uu4.A04;
        Boolean bool = A002.A01;
        if (bool != null) {
            z = bool.booleanValue();
        }
        ? r0 = new C263754Nf((Object) null, 0);
        r0.A00 = ucm;
        r0.A01 = ud6;
        r0.A00 = z;
        uu4.A01 = r0;
        if (uu4.A04 && ucm.A02) {
            C16387Uu4.A00(uu4);
        }
        C16382Utz utz = uu4.A01;
        if (utz != null) {
            AnonymousClass4M3 r1 = this.A05;
            AnonymousClass0iw r2 = this.A04;
            int i = this.A00;
            AnonymousClass3WR r7 = ucm.A01;
            MediaFrameLayout mediaFrameLayout = utz.A01.A02;
            float A003 = C51971G9r.A00(ucm.A02 ? 1 : 0);
            String moduleName = r2.getModuleName();
            0qQ.A0B(moduleName, 6);
            r1.E4H(new C263794Nj(mediaFrameLayout, new C263414Lx(false, false, false, false), r7, utz, (String) null, moduleName, A003, -1, i, true));
        }
    }
}
