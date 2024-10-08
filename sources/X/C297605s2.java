package X;

import android.view.View;

/* renamed from: X.5s2  reason: invalid class name and case insensitive filesystem */
public final class C297605s2 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass49Q A00;
    public final /* synthetic */ C297595s1 A01;
    public final /* synthetic */ boolean A02;

    public C297605s2(AnonymousClass49Q r1, C297595s1 r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(676744300);
        AnonymousClass49Q r2 = this.A00;
        if (r2 instanceof C294575mg) {
            ((C294575mg) r2).A01 = this.A01.A03;
        }
        C297595s1 r1 = this.A01;
        C267324bN r0 = r1.A01;
        if (r0 != null) {
            r2.D1A(r0, r1);
            if (this.A02) {
                view.setAlpha(0.7f);
            }
            AnonymousClass0fD.A0C(698950269, A05);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        AnonymousClass0fD.A0C(923102244, A05);
        throw illegalStateException;
    }
}
