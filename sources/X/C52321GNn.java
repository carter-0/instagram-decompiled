package X;

import android.view.View;

/* renamed from: X.GNn  reason: case insensitive filesystem */
public final class C52321GNn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GCC A01;

    public C52321GNn(GCC gcc, int i) {
        this.A01 = gcc;
        this.A00 = i;
    }

    public final void run() {
        View A0A;
        View findViewWithTag;
        GCC gcc = this.A01;
        C52012GBj gBj = gcc.A02;
        if (gBj != null && (A0A = gBj.A0A(gcc.A00)) != null && (findViewWithTag = A0A.findViewWithTag("clips_attached_scrubber_view_tag")) != null) {
            findViewWithTag.setVisibility(this.A00);
        }
    }
}
