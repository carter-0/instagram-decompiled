package X;

import android.view.View;

/* renamed from: X.9fx  reason: invalid class name and case insensitive filesystem */
public final class C383669fx extends C232922uf {
    public final /* synthetic */ C380389Xz A00;

    public C383669fx(C380389Xz r1) {
        this.A00 = r1;
    }

    public final void DmE(2cs r12) {
        C71412ct r5 = r12.A09;
        float A01 = (float) AnonymousClass37Q.A01((double) ((float) Math.min(Math.max(r5.A00, 0.0d), 1.0d)), 0.800000011920929d);
        C380389Xz r4 = this.A00;
        r4.A00.setAlpha(A01);
        View view = r4.A00;
        int i = 8;
        if (A01 > 0.0f) {
            i = 0;
        }
        view.setVisibility(i);
        float A03 = (float) AnonymousClass37Q.A03(r5.A00, 1.2000000476837158d, 1.0d);
        r4.A00.setScaleX(A03);
        r4.A00.setScaleY(A03);
    }
}
