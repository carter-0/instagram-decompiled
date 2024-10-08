package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentHost;
import com.instagram.android.R;

/* renamed from: X.Hpd  reason: case insensitive filesystem */
public final class C55916Hpd {
    public View A00;

    public final void A00(View view) {
        ViewGroup viewGroup;
        View rootView = view.getRootView();
        if ((rootView instanceof ViewGroup) && (viewGroup = (ViewGroup) rootView) != null && !(viewGroup instanceof ComponentHost) && viewGroup.isAttachedToWindow()) {
            C52784Gcb gcb = new C52784Gcb();
            Context context = viewGroup.getContext();
            View view2 = new View(context);
            this.A00 = view2;
            gcb.A00.setColor(context.getColor(R.color.black_50_transparent));
            view2.setBackground(gcb);
            viewGroup.addView(view2, -1, -1);
        }
    }
}
