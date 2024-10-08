package X;

import android.view.animation.AnticipateInterpolator;

/* renamed from: X.IfW  reason: case insensitive filesystem */
public final class C57729IfW implements Runnable {
    public final /* synthetic */ C256043v8 A00;

    public C57729IfW(C256043v8 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C51972G9s.A0I(this.A00.A01()).scaleX(0.8f).scaleY(0.8f).setStartDelay(400).setDuration(200).setInterpolator(new AnticipateInterpolator()).start();
    }
}
