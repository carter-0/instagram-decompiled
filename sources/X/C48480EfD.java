package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EfD  reason: case insensitive filesystem */
public abstract class C48480EfD {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        FPE fpe;
        Object A03 = r11.A03(0);
        String A0p = DbS.A0p(A03);
        String str = (String) A03;
        String str2 = (String) DbT.A0q(r11, A0p, 1);
        C277014uI A0S = DbX.A0S(r11, 2);
        if (A0S != null) {
            fpe = new FPE(9, (Object) r10, (Object) A0S);
        } else {
            fpe = null;
        }
        AnonymousClass3M3 A0H = DbU.A0H(r10);
        if (A0H instanceof AnonymousClass3M3) {
            AnonymousClass3M3 r7 = A0H;
            0qQ.A0B(r7, 0);
            0qQ.A0B(str, 1);
            0qQ.A0B(str2, 2);
            2dY r6 = 2dZ.A0t;
            View findViewById = r6.A03(r7.getActivity()).C7z().findViewById(R.id.timeframe_header_container);
            boolean z = true;
            if (findViewById == null) {
                z = false;
                findViewById = LayoutInflater.from(r7.getRootActivity()).inflate(R.layout.insights_timeframe_header, (ViewGroup) null);
            }
            AnonymousClass7TG.A0R(findViewById, R.id.timeframe_header_title).setText(str);
            TextView A0R = AnonymousClass7TG.A0R(findViewById, R.id.timeframe_header_subtitle);
            A0R.setText(str2);
            if (!(fpe == null || r7.getContext() == null)) {
                AnonymousClass0fU.A00(fpe, findViewById);
                Context context = r7.getContext();
                if (context != null) {
                    A0R.setCompoundDrawables((Drawable) null, (Drawable) null, context.getDrawable(R.drawable.instagram_chevron_down_pano_outline_12), (Drawable) null);
                    A0R.setCompoundDrawablePadding(4);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            if (!z) {
                int A0G = 2Yu.A0G(r7.getRootActivity(), R.attr.actionBarButtonWidth);
                AnonymousClass6NS r0 = r7.A0C;
                if (r0 != null) {
                    r0.A03();
                    r7.A0C = null;
                }
                FrameLayout frameLayout = r7.A02;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    r7.A02 = null;
                    r7.A08 = null;
                    r7.A07 = null;
                }
                r6.A03(r7.A03).ETi(findViewById, 0, A0G, false);
            }
        }
        return null;
    }
}
