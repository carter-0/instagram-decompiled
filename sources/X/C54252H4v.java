package X;

import android.os.Handler;

/* renamed from: X.H4v  reason: case insensitive filesystem */
public final class C54252H4v extends 1P0 {
    public AnonymousClass1XV A00;
    public boolean A01;
    public C268654dm A02;
    public boolean A03;
    public final long A04 = 3600000;
    public final Handler A05;
    public final AnonymousClass4D6 A06;
    public final C324596za A07;
    public final C324366zA A08;

    public final void A00() {
        AnonymousClass1XV r2 = this.A00;
        if (r2 != null) {
            C324366zA r1 = this.A08;
            r1.A00(AnonymousClass05K.A0C);
            r1.A07 = r2.getNextMaxId();
            r1.A0A = r2.CP6();
            C324596za r0 = this.A07;
            r0.onFinish();
            r0.onSuccess(r2);
            this.A00 = null;
            return;
        }
        C268654dm r22 = this.A02;
        if (r22 != null) {
            this.A08.A00(AnonymousClass05K.A01);
            C324596za r02 = this.A07;
            r02.onFinish();
            r02.onFail(r22);
            this.A02 = null;
            return;
        }
        this.A01 = AnonymousClass7TF.A1Q(this.A03 ? 1 : 0);
    }

    public C54252H4v(Handler handler, AnonymousClass4D6 r5, C324596za r6, C324366zA r7) {
        0qQ.A0B(r7, 1);
        this.A08 = r7;
        this.A06 = r5;
        this.A05 = handler;
        this.A07 = r6;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -349823877);
        this.A02 = r3;
        if (this.A01) {
            A00();
        }
        AnonymousClass0fD.A0A(-1111472528, A0D);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-499831656);
        this.A03 = true;
        AnonymousClass0fD.A0A(-175050117, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(-2113648707);
        1XU r9 = (AnonymousClass1XV) obj;
        int A0D = AnonymousClass7TG.A0D(r9, -1216451432);
        this.A00 = r9;
        long j = this.A04;
        if (j <= 0 || System.currentTimeMillis() - r9.AjP() <= j) {
            A00();
            i = -1649110953;
        } else {
            i = -1169860509;
        }
        AnonymousClass0fD.A0A(i, A0D);
        AnonymousClass0fD.A0A(-1648133388, A032);
    }
}
