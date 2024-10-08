package X;

import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.70Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70Q implements Runnable {
    public final /* synthetic */ AnonymousClass70F A00;
    public final /* synthetic */ 2bv A01;
    public final /* synthetic */ C230882qT A02;

    public /* synthetic */ AnonymousClass70Q(AnonymousClass70F r1, 2bv r2, C230882qT r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C230882qT r3 = this.A02;
        2bv r2 = this.A01;
        AnonymousClass70F r0 = this.A00;
        r3.A00(r0.AeY(), QPTooltipAnchor.PROFILE_PICTURE, r2);
    }
}
