package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import java.text.DateFormat;
import java.text.DateFormatSymbols;

/* renamed from: X.O2t  reason: case insensitive filesystem */
public abstract class C70341O2t {
    public static final void A00(Context context, Resources resources, View view, View view2, IgTextView igTextView, IgTextView igTextView2, C68184N3z n3z) {
        long j;
        String A0F;
        0qQ.A0B(n3z, 0);
        AnonymousClass7TG.A1S(igTextView, igTextView2);
        C266444Yx r0 = n3z.A02;
        if (r0 != null) {
            igTextView.setText(r0.A00(resources));
        }
        Integer num = n3z.A04;
        if (num != null) {
            igTextView.setHighlightColor(num.intValue());
        }
        if (n3z.A06) {
            DbT.A1H(igTextView);
        }
        boolean z = n3z.A07;
        int i = R.dimen.accent_edge_thickness;
        if (z) {
            i = R.dimen.afi_margin_top;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        0nA.A0Y(igTextView2, dimensionPixelSize);
        boolean z2 = false;
        C244273av.A09(igTextView, 0, dimensionPixelSize, context.getColor(2Yu.A05(context)), z);
        C74276Ps4 ps4 = n3z.A03;
        if (ps4 instanceof PQ6) {
            igTextView2.setVisibility(8);
        } else {
            C74276Ps4 ps42 = ps4;
            boolean z3 = ps4 instanceof C68301N9o;
            if (z3) {
                C68301N9o n9o = (C68301N9o) ps42;
                if (n9o.A00 == 1) {
                    A0F = 1G0.A09(resources, (double) n9o.A01);
                    igTextView2.setText(A0F);
                    igTextView2.setVisibility(0);
                }
            }
            if (z3) {
                C68301N9o n9o2 = (C68301N9o) ps42;
                if (n9o2.A00 == 0) {
                    A0F = DateFormat.getTimeInstance(3).format(C66582MXn.A0l(n9o2.A01));
                    igTextView2.setText(A0F);
                    igTextView2.setVisibility(0);
                }
            }
            if (ps4 instanceof C68302N9p) {
                C68302N9p n9p = (C68302N9p) ps4;
                if (n9p.A02) {
                    j = n9p.A01;
                } else {
                    A0F = DateFormatSymbols.getInstance().getShortWeekdays()[n9p.A00];
                    igTextView2.setText(A0F);
                    igTextView2.setVisibility(0);
                }
            } else {
                if (z3) {
                    C68301N9o n9o3 = (C68301N9o) ps42;
                    int i2 = n9o3.A00;
                    if (i2 == 2) {
                        j = n9o3.A01;
                    } else if (i2 == 3) {
                        A0F = 1G0.A0F("MMMM d", (double) n9o3.A01, (double) AnonymousClass7TG.A0I());
                        igTextView2.setText(A0F);
                        igTextView2.setVisibility(0);
                    }
                }
                throw AnonymousClass7TE.A1K();
            }
            A0F = JZV.A04(context, j);
            igTextView2.setText(A0F);
            igTextView2.setVisibility(0);
        }
        if (!n3z.A05) {
            View.OnClickListener onClickListener = n3z.A00;
            AnonymousClass0fU.A00(onClickListener, view);
            view.setClickable(AnonymousClass7TF.A1V(onClickListener));
            View.OnClickListener onClickListener2 = n3z.A01;
            AnonymousClass0fU.A00(onClickListener2, view2);
            if (onClickListener2 != null) {
                z2 = true;
            }
            view2.setClickable(z2);
        }
    }
}
