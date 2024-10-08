package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.List;

/* renamed from: X.6lI  reason: invalid class name and case insensitive filesystem */
public final class C316216lI {
    public static final C316216lI A00 = new Object();

    public static final int A01(Context context) {
        0qQ.A0B(context, 0);
        return (AnonymousClass0nB.A01(context) - ((int) (0.5625f * ((float) AnonymousClass4EQ.A02(context))))) / 2;
    }

    public static final int A04(Context context, C250973mM r5) {
        0qQ.A0B(context, 0);
        if (r5 != null && !A0E(context, r5)) {
            return 0;
        }
        boolean A0B = A0B(context);
        int A02 = AnonymousClass4EQ.A02(context);
        int A01 = (int) (((float) AnonymousClass0nB.A01(context)) / 0.5625f);
        if (A0B) {
            A02 -= A01;
            A01 = A03(context);
        }
        return (A02 - A01) / 2;
    }

    public static final void A05(Context context, C250973mM r6, C316026kz r7) {
        0qQ.A0B(context, 2);
        if (Systrace.A0E(1)) {
            0fS.A01("ReelViewerMediaAspectRatioUtil.maybeAdjustLayoutBasedOnAspectRatio", 1024082962);
        }
        try {
            if (!A0E(context, r6)) {
                A09(r7);
            }
            if (!A0D(context, r6)) {
                A07(r6, r7, AnonymousClass0nB.A01(context));
            }
            if (A0E(context, r6)) {
                A06(context, r7, (int) (((float) AnonymousClass0nB.A01(context)) / 0.5625f), A04(context, r6));
            } else {
                RoundedCornerFrameLayout BQU = r7.BQU();
                if (A0D(context, r6) && BQU != null) {
                    A08(r6, r7, BQU, AnonymousClass4EQ.A02(context), A01(context));
                }
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-2145881162);
            }
        }
    }

    public static final void A08(C250973mM r5, C316026kz r6, RoundedCornerFrameLayout roundedCornerFrameLayout, int i, int i2) {
        int i3;
        View view;
        int i4 = (int) (0.5625f * ((float) i));
        0nA.A0f(roundedCornerFrameLayout, i4);
        0nA.A0V(roundedCornerFrameLayout, i);
        0nA.A0W(roundedCornerFrameLayout, 1);
        View C8B = r6.C8B();
        if (C8B != null) {
            0nA.A0d(C8B, i2);
            0nA.A0U(C8B, i2);
        }
        View findViewById = roundedCornerFrameLayout.findViewById(R.id.reel_viewer_media_container);
        if (r5.A0N && findViewById != null && findViewById.getY() > 0.0f) {
            int width = (int) (((float) i4) / (((float) findViewById.getWidth()) / ((float) findViewById.getHeight())));
            int height = findViewById.getHeight() - width;
            0nA.A0f(findViewById, i4);
            0nA.A0V(findViewById, width);
            if (r5.A04 == null) {
                r5.A04 = Integer.valueOf((int) findViewById.getY());
                C252063oV C46 = r6.C46();
                if (C46 == null || (view = C46.getView()) == null) {
                    i3 = 0;
                } else {
                    i3 = view.getHeight();
                }
                findViewById.setY((float) (((int) findViewById.getY()) + i3 + (height / 2)));
            }
        }
    }

    public static final boolean A0B(Context context) {
        0qQ.A0B(context, 0);
        if (((int) (((float) AnonymousClass0nB.A01(context)) / 0.5625f)) + A03(context) <= AnonymousClass4EQ.A02(context)) {
            return true;
        }
        return false;
    }

    public static final boolean A0C(Context context) {
        0qQ.A0B(context, 0);
        if (!(!A0A(context)) || !2Y9.A00) {
            return false;
        }
        return true;
    }

    public static final boolean A0D(Context context, C250973mM r4) {
        0qQ.A0B(context, 0);
        if (A0F(r4) && r4.A0H.A1a && (!A0A(context))) {
            return true;
        }
        if (!(!A0A(context)) || !2Y9.A00) {
            return false;
        }
        return true;
    }

    public static final boolean A0E(Context context, C250973mM r2) {
        0qQ.A0B(context, 0);
        0qQ.A0B(r2, 1);
        if (!A0F(r2) || !A0A(context)) {
            return false;
        }
        return true;
    }

    public static final boolean A0F(C250973mM r2) {
        List list;
        if (r2.A0H.A0i()) {
            return true;
        }
        List list2 = r2.A05;
        if (list2 != null) {
            00k.A0a(list2);
        }
        List list3 = r2.A05;
        if (list3 != null) {
            list = 00k.A0a(list3);
        } else {
            list = 0sn.A00;
        }
        if (list.size() > 1) {
            return false;
        }
        return true;
    }

    public static final int A00(Context context) {
        if (A0B(context)) {
            return A03(context);
        }
        return context.getResources().getDimensionPixelOffset(R.dimen.asset_picker_redesign_sticker_height);
    }

    public static final int A02(Context context) {
        return Math.min(AnonymousClass4EQ.A02(context), (int) (((float) AnonymousClass0nB.A01(context)) / 0.5625f));
    }

    public static final int A03(Context context) {
        return context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen) + (context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material) * 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r2 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.content.Context r5, X.C316026kz r6, int r7, int r8) {
        /*
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r4 = r6.BQU()
            if (r4 == 0) goto L_0x0034
            X.0nA.A0V(r4, r7)
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x0026
            com.instagram.common.session.UserSession r3 = X.0ob.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327112562522287(0x810f51000138af, double:3.036750489855776E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            if (r0 == 0) goto L_0x0026
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r2 != 0) goto L_0x0029
        L_0x0026:
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
        L_0x0029:
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getDimensionPixelOffset(r1)
            r4.setCornerRadius(r0)
        L_0x0034:
            X.3oV r2 = r6.C46()
            if (r2 == 0) goto L_0x0049
            android.view.View r1 = r2.getView()
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r0 = r2.getView()
            X.0nA.A0V(r0, r8)
        L_0x0049:
            android.view.View r2 = r6.C8B()
            if (r2 == 0) goto L_0x0065
            int r0 = A03(r5)
            r2.setMinimumHeight(r0)
            boolean r0 = r2 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x0062
            r1 = r2
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0 = 80
            r1.setGravity(r0)
        L_0x0062:
            X.0nA.A0T(r2, r8)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316216lI.A06(android.content.Context, X.6kz, int, int):void");
    }

    public static final void A07(C250973mM r4, C316026kz r5, int i) {
        View findViewById;
        RoundedCornerFrameLayout BQU = r5.BQU();
        if (BQU != null) {
            BQU.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            View C8B = r5.C8B();
            if (C8B != null) {
                0nA.A0d(C8B, 0);
                0nA.A0U(C8B, 0);
            }
            Integer num = r4.A04;
            if (num != null && (findViewById = BQU.findViewById(R.id.reel_viewer_media_container)) != null && findViewById.findViewById(R.id.reel_viewer_texture_view) != null) {
                float width = ((float) findViewById.getWidth()) / ((float) findViewById.getHeight());
                0nA.A0f(findViewById, i);
                0nA.A0V(findViewById, (int) (((float) i) / width));
                findViewById.setY((float) num.intValue());
                r4.A04 = null;
            }
        }
    }

    public static final void A09(C316026kz r3) {
        View view;
        RoundedCornerFrameLayout BQU = r3.BQU();
        if (BQU != null) {
            BQU.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        C252063oV C46 = r3.C46();
        if (!(C46 == null || (view = C46.getView()) == null)) {
            view.setVisibility(8);
        }
        RoundedCornerFrameLayout BQU2 = r3.BQU();
        if (BQU2 != null) {
            BQU2.setCornerRadius(0);
        }
        View C8B = r3.C8B();
        if (C8B != null) {
            0nA.A0T(C8B, 0);
        }
    }

    public static final boolean A0A(Context context) {
        if (((float) AnonymousClass0nB.A01(context)) / ((float) AnonymousClass4EQ.A02(context)) < 0.5625f) {
            return true;
        }
        return false;
    }

    public static final boolean A0G(C250973mM r3, int i, int i2) {
        if ((!A0F(r3) || !r3.A0H.A1a || ((float) i2) / ((float) i) < 0.5625f) && (((float) i2) / ((float) i) < 0.5625f || !2Y9.A00)) {
            return false;
        }
        return true;
    }
}
