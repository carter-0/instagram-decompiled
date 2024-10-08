package X;

import android.view.View;

/* renamed from: X.9fy  reason: invalid class name and case insensitive filesystem */
public final class C383679fy extends C232922uf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C380599Yu A01;

    public final void DmE(2cs r7) {
        0qQ.A0B(r7, 0);
        View view = this.A01.A0B.getView();
        C71412ct r4 = r7.A09;
        view.setRotation(((float) r4.A00) * 10.0f);
        view.setTranslationX(((float) r4.A00) * ((float) this.A00));
        view.setAlpha((float) r4.A00);
    }

    public C383679fy(C380599Yu r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
