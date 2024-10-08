package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Dhb  reason: case insensitive filesystem */
public final class C46595Dhb implements Runnable {
    public final /* synthetic */ AnonymousClass3M3 A00;

    public C46595Dhb(AnonymousClass3M3 r1) {
        this.A00 = r1;
    }

    public final void run() {
        ViewGroup viewGroup;
        AnonymousClass3M3 r2 = this.A00;
        C71662eb r1 = r2.A0F;
        if (r1 == null) {
            G8K g8k = r2.A06;
            if (g8k != null) {
                g8k.CmM("component_missing");
            }
        } else if (r1.A04()) {
            r1.A01().setVisibility(8);
        }
        C71662eb r12 = r2.A0E;
        if (r12 != null && r12.A04()) {
            r12.A01().setVisibility(8);
        }
        View view = r2.A00;
        if (!(view == null || (viewGroup = (ViewGroup) r2.mView) == null)) {
            viewGroup.removeView(view);
        }
        AnonymousClass7TF.A16(r2.A01);
    }
}
