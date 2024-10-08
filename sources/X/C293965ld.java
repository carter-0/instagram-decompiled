package X;

import android.view.View;

/* renamed from: X.5ld  reason: invalid class name and case insensitive filesystem */
public final class C293965ld implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass419 A00;
    public final /* synthetic */ AnonymousClass417 A01;
    public final /* synthetic */ C247733gp A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass3W1 A04;

    public C293965ld(AnonymousClass419 r1, AnonymousClass417 r2, C247733gp r3, 1Xj r4, AnonymousClass3W1 r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1184560097);
        C300835xz r2 = this.A00.A07;
        if (r2 != null) {
            C247733gp r3 = this.A02;
            r2.A02(r3.A0O, false, false);
            AnonymousClass416 r22 = this.A01.A02;
            if (r22 != null) {
                r22.D4o(r3, this.A03, this.A04);
            }
            AnonymousClass0fD.A0C(-2108751402, A05);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        AnonymousClass0fD.A0C(136942028, A05);
        throw illegalStateException;
    }
}
