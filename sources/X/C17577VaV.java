package X;

import android.view.View;

/* renamed from: X.VaV  reason: case insensitive filesystem */
public final class C17577VaV {
    public final float A00;
    public final C14090Tph A01;
    public final C14090Tph A02;
    public final C14090Tph A03;
    public final C249703kE A04;
    public final boolean A05;

    public C17577VaV(C249703kE r12, boolean z) {
        this.A05 = z;
        this.A04 = r12;
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        }
        this.A00 = f2;
        View view = r12.itemView;
        C14090Tph tph = new C14090Tph(C14001To3.A0C, view, f2);
        this.A01 = tph;
        C14090Tph tph2 = new C14090Tph(C14001To3.A0G, view, f2);
        this.A02 = tph2;
        C14090Tph tph3 = new C14090Tph(C14001To3.A0H, view, f2);
        this.A03 = tph3;
        C14002To4 to4 = tph.A01;
        to4.A02(400.0f);
        to4.A01(1.0f);
        C14002To4 to42 = tph2.A01;
        to42.A02(400.0f);
        to42.A01(0.9f);
        C14002To4 to43 = tph3.A01;
        to43.A02(400.0f);
        to43.A01(0.9f);
        tph.A03 = f;
        tph.A07 = true;
        tph3.A03 = f;
        tph3.A07 = true;
        tph2.A03 = f;
        tph2.A07 = true;
        if (z) {
            view.setAlpha(0.0f);
        }
    }
}
