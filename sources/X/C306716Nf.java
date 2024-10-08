package X;

import android.view.ViewTreeObserver;
import java.util.LinkedHashSet;

/* renamed from: X.6Nf  reason: invalid class name and case insensitive filesystem */
public final class C306716Nf implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass6LP A00;
    public final /* synthetic */ C52504GVh A01;
    public final /* synthetic */ boolean A02;

    public C306716Nf(AnonymousClass6LP r1, C52504GVh gVh, boolean z) {
        this.A01 = gVh;
        this.A00 = r1;
        this.A02 = z;
    }

    public final void onGlobalLayout() {
        C273694n2 r3 = this.A01.A03;
        r3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        I0F i0f = C52504GVh.A04;
        LinkedHashSet A012 = i0f.A01(r3, 14);
        LinkedHashSet A013 = i0f.A01(r3, 15);
        AnonymousClass6LP r2 = this.A00;
        r2.A00 = A012.size() + A013.size();
        AnonymousClass6LP.A02(r2, "media_amount_determined");
        r2.A0I(this.A02);
        r2.A06();
    }
}
