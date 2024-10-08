package X;

import android.content.Context;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.AqT  reason: case insensitive filesystem */
public final class C41231AqT implements Runnable {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ C391869to A01;
    public final /* synthetic */ C3510387i A02;
    public final /* synthetic */ C3511387s A03;
    public final /* synthetic */ C3511187q A04;

    public C41231AqT(AnonymousClass4DH r1, C391869to r2, C3510387i r3, C3511387s r4, C3511187q r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void run() {
        A80 A002 = C394249xm.A00();
        C3510387i r3 = this.A02;
        SimpleVideoLayout simpleVideoLayout = r3.A0T;
        simpleVideoLayout.setLayoutParams(A002.A06);
        C3510387i.A04(r3, A002);
        C3511387s r2 = this.A03;
        C3510387i.A00(this.A00, r3, r2, AnonymousClass7TF.A1P(r2.A0M() ? 1 : 0));
        C3510387i.A05(r3, r2);
        C3511187q r5 = this.A04;
        Context context = r3.A0F;
        1Xj r32 = ((C385119iQ) this.A01).A00;
        boolean A1U = AnonymousClass7TF.A1U(0, context, r32);
        C390159qp r22 = r5.A00;
        if (r22 == null) {
            r22 = new C390159qp(context, r5.A05, new A4Y(r5));
            r5.A00 = r22;
        }
        C14044Tol tol = new C14044Tol(r22.A01, r22.A02, (C252323ov) null, r22, "ClipsTemplateBuilderReferenceMediaPlayer");
        r22.A00 = tol;
        String str = r32.A0M;
        AnonymousClass3WR CEL = r32.CEL();
        C263754Nf r9 = new C263754Nf((Object) r32, 0);
        r9.A00 = A1U;
        tol.A09(simpleVideoLayout, CEL, r9, str, "ClipsTemplateBuilderReferenceMediaPlayer", 1.0f, -1, 0, A1U, A1U);
    }
}
