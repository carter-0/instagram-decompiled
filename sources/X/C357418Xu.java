package X;

import android.view.View;

/* renamed from: X.8Xu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C357418Xu implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass85X A00;
    public final /* synthetic */ AnonymousClass8WX A01;
    public final /* synthetic */ C355898Ru A02;

    public /* synthetic */ C357418Xu(AnonymousClass85X r1, AnonymousClass8WX r2, C355898Ru r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        C355898Ru r1 = this.A02;
        AnonymousClass8WX r4 = this.A01;
        AnonymousClass85X r3 = this.A00;
        if (((Boolean) obj).booleanValue()) {
            r1.A0H.CNi((View.OnTouchListener) null);
            r4.A00().A0M(false);
            r3.A0H = true;
        } else {
            r3.A0H = false;
        }
        AnonymousClass85X.A06(r3);
    }
}
