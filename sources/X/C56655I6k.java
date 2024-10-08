package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.Arrays;

/* renamed from: X.I6k  reason: case insensitive filesystem */
public final class C56655I6k {
    public static UserSession A00;
    public static final C56655I6k A01 = new Object();

    public static final View A01(Context context, ViewGroup viewGroup, UserSession userSession) {
        AnonymousClass7TF.A1B(context, 0, userSession);
        A00 = userSession;
        View A09 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.row_feed_media_overlay_cta, false);
        A09.setTag(new C53149GjL(A09));
        return A09;
    }

    public static final void A03(C61082JwK jwK, AnonymousClass0iw r10, C53149GjL gjL, C317176mq r12) {
        0qQ.A0B(jwK, 0);
        AnonymousClass7TG.A1U(gjL, r12, r10);
        C53400GnX gnX = (C53400GnX) jwK.A00;
        C277994w4 r5 = (C277994w4) DbT.A0r(gnX.A00);
        ID0 id0 = null;
        if (r5 != null) {
            C278014w6 A02 = C52501GVd.A02(r5);
            C278014w6 Af8 = r5.Af8();
            if (A02 != null) {
                boolean A1b = C51971G9r.A1b((C62320sa) gnX.A03);
                RoundedCornerFrameLayout roundedCornerFrameLayout = gjL.A08;
                roundedCornerFrameLayout.setVisibility(DbW.A00(A1b ? 1 : 0));
                if (C51971G9r.A1b((C62320sa) gnX.A04) && !A1b) {
                    C51965G9l.A1W(gnX.A02, r10);
                }
                if (Af8 != null && jwK.A01) {
                    A02 = Af8;
                }
                r5.getOverlayType();
                A04(A02, gjL, false, false);
                if (I2I.A01(A02) != AnonymousClass05K.A01) {
                    id0 = new ID0(9, (Object) r12, (Object) A02, (Object) jwK);
                }
                AnonymousClass0fU.A00(id0, roundedCornerFrameLayout);
                return;
            }
        }
        0wb.A03("MediaOverlayCTAViewBinder", "Media has no overlay banner!");
    }

    public static final void A04(C278014w6 r8, C53149GjL gjL, boolean z, boolean z2) {
        int A002;
        int color;
        int i;
        int A003;
        String light;
        int i2;
        int color2;
        int color3;
        String light2;
        Context A0S = AnonymousClass7TE.A0S(gjL.A08);
        if (z) {
            if (z2) {
                int A0A = 2Yu.A0A(A0S);
                C46269DSy C53 = r8.C53();
                if (C53 != null) {
                    A002 = Color.parseColor(C53.getDark());
                } else {
                    A002 = A0S.getColor(A0A);
                }
                int A0A2 = 2Yu.A0A(A0S);
                C46269DSy Bqj = r8.Bqj();
                if (Bqj != null) {
                    i = Color.parseColor(Bqj.getDark());
                } else {
                    i = A0S.getColor(A0A2);
                }
                i2 = R.color.canvas_bottom_sheet_description_text_color;
                C46269DSy C532 = r8.C53();
                if (C532 != null) {
                    light2 = C532.getDark();
                }
                A003 = A0S.getColor(i2);
            } else {
                int A07 = 2Yu.A07(A0S);
                C46269DSy C533 = r8.C53();
                if (C533 != null) {
                    color2 = Color.parseColor(C533.getLight());
                } else {
                    color2 = A0S.getColor(A07);
                }
                int A0H = 2Yu.A0H(A0S, R.attr.igds_color_creation_tools_grey_05);
                C46269DSy Bqj2 = r8.Bqj();
                if (Bqj2 != null) {
                    color3 = Color.parseColor(Bqj2.getLight());
                } else {
                    color3 = A0S.getColor(A0H);
                }
                i2 = 2Yu.A0H(A0S, R.attr.igds_color_creation_tools_grey_03);
                C46269DSy C534 = r8.C53();
                if (C534 != null) {
                    light2 = C534.getLight();
                }
                A003 = A0S.getColor(i2);
            }
            A003 = Color.parseColor(light2);
        } else {
            A002 = I2I.A00(A0S, r8, 2Yu.A07(A0S));
            int A08 = 2Yu.A08(A0S);
            C46269DSy Bqj3 = r8.Bqj();
            if (Bqj3 != null) {
                if (AnonymousClass3HA.A00(A0S)) {
                    light = Bqj3.getDark();
                } else {
                    light = Bqj3.getLight();
                }
                color = Color.parseColor(light);
            } else {
                color = A0S.getColor(A08);
            }
            A003 = I2I.A00(AnonymousClass7TE.A0S(gjL.A06), r8, 2Yu.A0H(A0S, R.attr.igds_color_creation_tools_grey_03));
        }
        IgSimpleImageView igSimpleImageView = gjL.A06;
        Boolean A0v = AnonymousClass7TE.A0v();
        int i3 = 8;
        igSimpleImageView.setVisibility(DbW.A01(A0v.equals(r8.BAn()) ? 1 : 0));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        igSimpleImageView.setColorFilter(new PorterDuffColorFilter(A003, mode));
        IgSimpleImageView igSimpleImageView2 = gjL.A07;
        int i4 = 8;
        if (r8.BE7() != null) {
            i4 = 0;
        }
        igSimpleImageView2.setVisibility(i4);
        if (r8.BE7() != null) {
            igSimpleImageView2.setImageResource(C69760Nrj.A00(r8.BE7()));
            igSimpleImageView2.setColorFilter(new PorterDuffColorFilter(A002, mode));
        }
        String text = r8.getText();
        r8.getActionUrl();
        TextView textView = gjL.A03;
        textView.setText(text);
        textView.setTextColor(A002);
        TextView textView2 = gjL.A04;
        String secondaryText = r8.getSecondaryText();
        if (!(secondaryText == null || secondaryText.length() == 0)) {
            i3 = 0;
        }
        textView2.setVisibility(i3);
        textView2.setTextColor(i);
        String secondaryText2 = r8.getSecondaryText();
        if (!(secondaryText2 == null || secondaryText2.length() == 0)) {
            textView2.setText(r8.getSecondaryText());
        }
        A02(textView, A0v.equals(r8.Cd6()));
        Boolean Cd6 = r8.Cd6();
        if (Cd6 != null) {
            A02(textView2, Cd6.booleanValue());
        }
    }

    public static final int A00(1Xj r3) {
        return Arrays.hashCode(new Object[]{r3.getId(), Boolean.valueOf(r3.A6M()), Boolean.valueOf(r3.A5f())});
    }

    public static final void A02(TextView textView, boolean z) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        int i = 17;
        if (layoutParams != null) {
            int i2 = 8388627;
            if (z) {
                i2 = 17;
            }
            layoutParams.gravity = i2;
        }
        textView.setLayoutParams(layoutParams);
        if (!z) {
            i = 8388627;
        }
        textView.setGravity(i);
    }
}
