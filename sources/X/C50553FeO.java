package X;

import android.view.View;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.FeO  reason: case insensitive filesystem */
public final class C50553FeO implements G7C {
    public final 0sI A00;

    public final boolean AFM(C48087EVf eVf, C283155Gi r3, int i) {
        0qQ.A0B(eVf, 1);
        return AnonymousClass7TF.A1W(eVf, C48087EVf.LIKE_BUTTON);
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r13, int i) {
        C283155Gi r5 = r13;
        0qQ.A0B(r13, 0);
        if (!(view instanceof IgBouncyUfiButtonImageView)) {
            view = null;
        }
        boolean z = true;
        boolean z2 = !r13.A0F();
        if (view != null) {
            view.setSelected(z2);
        }
        C283165Gj r0 = r13.A04;
        Boolean valueOf = Boolean.valueOf(z2);
        r0.A04 = valueOf;
        0sI r3 = this.A00;
        Integer valueOf2 = Integer.valueOf(i);
        if (view != null) {
            z = false;
        }
        r3.invoke(valueOf, r5, valueOf2, Boolean.valueOf(z), jv7);
    }

    public C50553FeO(0sI r1) {
        this.A00 = r1;
    }
}
