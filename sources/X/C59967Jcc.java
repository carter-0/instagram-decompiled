package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.Jcc  reason: case insensitive filesystem */
public final class C59967Jcc implements C324256yt, C324246ys {
    public final int A00;
    public final Object A01;

    public C59967Jcc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DUz(AppBarLayout appBarLayout, int i) {
        LCA lca;
        C61411K6i k6i;
        int i2;
        double d;
        String str;
        AppBarLayout appBarLayout2 = appBarLayout;
        int i3 = i;
        switch (this.A00) {
            case 0:
                if (appBarLayout2.getTotalScrollRange() > 0) {
                    if (Math.abs(i3) >= appBarLayout2.getTotalScrollRange()) {
                        ((C61414K6l) this.A01).A07 = false;
                    }
                    if (i == 0) {
                        C61414K6l k6l = (C61414K6l) this.A01;
                        if (!k6l.A07) {
                            k6l.A07 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (appBarLayout2.getTotalScrollRange() > 0) {
                    if (Math.abs(i3) >= appBarLayout2.getTotalScrollRange()) {
                        C61415K6m k6m = (C61415K6m) this.A01;
                        C61415K6m.A04(k6m, "scroll");
                        k6m.A09 = false;
                    }
                    if (i == 0) {
                        C61415K6m k6m2 = (C61415K6m) this.A01;
                        if (!k6m2.A09) {
                            C61415K6m.A01(k6m2);
                            k6m2.A09 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (appBarLayout2.getTotalScrollRange() > 0) {
                    if (Math.abs(i3) >= appBarLayout2.getTotalScrollRange()) {
                        LE4 le4 = (LE4) this.A01;
                        C65324LrN lrN = le4.A00;
                        if (lrN != null) {
                            C65324LrN.A03(lrN, "scroll");
                            le4.A01 = false;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    if (i == 0) {
                        LE4 le42 = (LE4) this.A01;
                        if (!le42.A01) {
                            C65324LrN lrN2 = le42.A00;
                            if (lrN2 != null) {
                                C65324LrN.A02(lrN2);
                                le42.A01 = true;
                                return;
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (appBarLayout != null) {
                    JW7 jw7 = (JW7) this.A01;
                    jw7.A0Q = false;
                    boolean z = true;
                    jw7.A0O = AnonymousClass7TF.A1S(Math.abs(i3), appBarLayout2.getTotalScrollRange());
                    if (i != 0) {
                        z = false;
                    }
                    jw7.A0P = z;
                    if (!jw7.A0X && jw7.A0U) {
                        JW8 jw8 = jw7.A14;
                        int floor = ((int) Math.floor(AnonymousClass37Q.A04((double) i3, -((double) appBarLayout2.getTotalScrollRange()), 0.0d, (double) jw7.A02, (double) jw7.A05))) - jw8.A0A();
                        boolean z2 = jw7.A0P;
                        RecyclerView recyclerView = jw8.A0I.A00;
                        if (z2) {
                            recyclerView.A0u(0, floor);
                            return;
                        } else {
                            recyclerView.scrollBy(0, floor);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                float abs = Math.abs(((float) i3) / ((float) appBarLayout2.getTotalScrollRange()));
                LtB ltB = (LtB) this.A01;
                boolean A1T = C51970G9q.A1T((abs > 0.95f ? 1 : (abs == 0.95f ? 0 : -1)));
                ValueAnimator valueAnimator = ltB.A0I;
                if (!valueAnimator.isRunning()) {
                    TextView textView = ltB.A08;
                    if (textView != null) {
                        if (A1T) {
                            i2 = ltB.A0F;
                        } else {
                            i2 = ltB.A0E;
                        }
                        textView.setTextColor(i2);
                    }
                    float f = ltB.A00;
                    if (Float.compare(f, 1.0f) == 0 && A1T) {
                        valueAnimator.reverse();
                    } else if (Float.compare(f, 0.0f) == 0 && !A1T) {
                        valueAnimator.start();
                    }
                }
                LCA lca2 = ltB.A0D;
                if (!(lca2 == null || (k6i = lca2.A00.A0B) == null)) {
                    k6i.A03();
                }
                if (AnonymousClass7TF.A1W(ltB.A0C, C62466KgG.EDIT) && AnonymousClass7TE.A00(ltB.A01, abs) > 0.0f && (lca = ltB.A0D) != null) {
                    K6H k6h = lca.A00;
                    if (!k6h.A0G) {
                        K6H.A03(k6h);
                    }
                }
                ltB.A01 = abs;
                return;
            case 5:
                if (i != 0) {
                    IO8 io8 = (IO8) this.A01;
                    View view = io8.A01;
                    if (view == null) {
                        AppBarLayout appBarLayout3 = io8.A08;
                        if (appBarLayout3 == null) {
                            str = "appbarLayout";
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        view = appBarLayout3.findViewById(R.id.use_in_camera_header_button);
                        io8.A01 = view;
                    }
                    if (view != null) {
                        IgLinearLayout igLinearLayout = io8.A0A;
                        if (igLinearLayout == null) {
                            str = "actionButtonContainer";
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        int bottom = igLinearLayout.getBottom();
                        int abs2 = Math.abs(i3);
                        2cs r2 = io8.A06;
                        if (r2 != null) {
                            if (abs2 > bottom) {
                                d = 1.0d;
                            } else {
                                d = 0.0d;
                            }
                            r2.A06(d);
                            return;
                        }
                        return;
                    }
                    2cs r0 = io8.A06;
                    if (r0 != null) {
                        r0.A02();
                    }
                    appBarLayout2.A03(io8.A07);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
