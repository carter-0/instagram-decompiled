package X;

import android.view.View;
import android.view.ViewParent;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Apf  reason: case insensitive filesystem */
public final class C41181Apf implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C316876mM A02;

    public C41181Apf(C255783ui r1, C316876mM r2, float f) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = f;
    }

    public final void run() {
        C316876mM r0 = this.A02;
        C255783ui r3 = this.A01;
        float f = this.A00;
        IgSimpleImageView igSimpleImageView = r0.A00;
        if (igSimpleImageView != null) {
            ViewParent parent = igSimpleImageView.getParent();
            if (parent != null) {
                View view = (View) parent;
                C306406Ma.A04(igSimpleImageView, r3, f, view.getWidth(), view.getHeight(), true);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
