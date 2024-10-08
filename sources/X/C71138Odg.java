package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.ui.widget.pulsingbutton.PulsingPillButton;

/* renamed from: X.Odg  reason: case insensitive filesystem */
public final class C71138Odg {
    public static final C71138Odg A00 = new Object();

    public static final View A00(Context context, View.OnClickListener onClickListener, 2da r6, float f, int i, boolean z) {
        C67694MsY msY = new C67694MsY(context);
        int i2 = R.drawable.instagram_icons_exceptions_blend_pano_outline_24;
        if (z) {
            i2 = R.drawable.instagram_blend_add_pano_outline_24;
        }
        msY.setButtonResource(i2);
        msY.setColorFilter(AnonymousClass37O.A00(i));
        msY.setAlpha(f);
        AnonymousClass3JR A0K = DbS.A0K();
        msY.setClipToPadding(false);
        A0K.A0I = msY;
        A0K.A05 = 2131953831;
        A0K.A0L = AnonymousClass05K.A15;
        A0K.A0G = onClickListener;
        return r6.AA4(new AnonymousClass3Jb(A0K));
    }

    public static final ImageView A01(Context context, 2da r3, C330047Lf r4) {
        0qQ.A0B(context, 0);
        int i = R.drawable.instagram_info_pano_outline_24;
        int A0H = 2Yu.A0H(context, R.attr.infoButtonIcon);
        if (A0H != 0) {
            i = A0H;
        }
        AnonymousClass3JS r0 = new AnonymousClass3JS(context, i);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0F = r0;
        A0K.A05 = 2131964339;
        A0K.A0G = new LYE((Object) r4, 9);
        View A0P = C51970G9q.A0P(A0K, r3);
        0qQ.A0C(A0P, "null cannot be cast to non-null type android.widget.ImageView");
        return (ImageView) A0P;
    }

    public static final void A03(Context context, 2da r5, int i, int i2, boolean z) {
        F3V f3v = new F3V(AnonymousClass05K.A00);
        f3v.A01(i);
        f3v.A03 = i2;
        f3v.A05 = context.getTheme();
        if (z) {
            f3v.A04 = 0;
            f3v.A0B = 2Yu.A0L(context, 16844000, true);
        }
        r5.ErJ(f3v.A00());
    }

    public static final void A04(2da r2, C330057Lg r3, int i, boolean z) {
        0qQ.A0B(r3, 1);
        r2.Eu5(new C71287Ohj(r3), !z);
        ((2dZ) r2).A0Q().setColorFilter(AnonymousClass37O.A00(i));
    }

    public static final void A02(Context context, View.OnClickListener onClickListener, 2da r10, int i, int i2) {
        PulsingPillButton pulsingPillButton = new PulsingPillButton(context, (AttributeSet) null, 0);
        pulsingPillButton.setButtonResource(i);
        pulsingPillButton.setButtonText(2131959524);
        pulsingPillButton.A00(context.getColor(R.color.igds_active_badge), context.getColor(R.color.igds_join_call_button_background_gradient_end));
        if (i2 != 0) {
            pulsingPillButton.setIconColor(context.getColor(i2));
            pulsingPillButton.setButtonTextColor(context.getColor(i2));
        }
        pulsingPillButton.setPulsingEnabled(true);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0I = pulsingPillButton;
        A0K.A05 = 2131960537;
        A0K.A0G = onClickListener;
        A0K.A0O = false;
        A0K.A09 = 17;
        r10.AA4(new AnonymousClass3Jb(A0K));
    }

    public static final void A05(2da r2, C330047Lf r3, boolean z) {
        AnonymousClass3JR A0K = DbS.A0K();
        int i = R.drawable.instagram_alert_new_pano_outline_24;
        if (z) {
            i = R.drawable.instagram_alert_off_new_pano_outline_24;
        }
        A0K.A06 = i;
        int i2 = 2131958992;
        if (z) {
            i2 = 2131959039;
        }
        A0K.A05 = i2;
        DbX.A19(new C71307OiD(r3, z), A0K, r2);
    }
}
