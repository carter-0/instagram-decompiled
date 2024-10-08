package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class AIr {
    public int A00 = R.dimen.contextual_sticker_tray_text_size;
    public int A01 = R.dimen.abc_edit_text_inset_top_material;
    public Drawable A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public float A0E;
    public int[] A0F;
    public final Context A0G;
    public final Resources A0H;
    public final UserSession A0I;

    public AIr(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A0I = userSession;
        this.A0G = context;
        Resources A0A2 = AnonymousClass7TF.A0A(context);
        this.A0H = A0A2;
        int color = context.getColor(R.color.fds_transparent);
        this.A0E = AnonymousClass7TE.A01(A0A2, R.dimen.abc_dialog_padding_top_material);
        this.A0F = new int[]{color, color};
        this.A0D = new int[]{color, color};
        this.A05 = "";
    }

    public final void A0A(int[] iArr) {
        0qQ.A0B(iArr, 0);
        this.A0F = iArr;
    }

    private final SpannableStringBuilder A00() {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        Drawable drawable = this.A02;
        if (drawable != null) {
            if (!this.A09) {
                if (this.A0A) {
                    str = "  ";
                } else {
                    str = " ";
                }
                spannableStringBuilder.insert(0, str);
            }
            Integer num = this.A04;
            if (num != null) {
                drawable = AnonymousClass3JT.A01(this.A0G, drawable, num.intValue());
            } else if (this.A08) {
                int[] iArr = this.A0F;
                int length = iArr.length;
                Context context = this.A0G;
                if (length == 1) {
                    drawable = AnonymousClass3JT.A01(context, drawable, iArr[0]);
                } else {
                    drawable = AnonymousClass3JT.A02(context, drawable, iArr[0], iArr[1]);
                }
            }
            float f = this.A0E;
            drawable.setBounds(0, 0, (int) f, (int) ((f / ((float) drawable.getIntrinsicWidth())) * ((float) drawable.getIntrinsicHeight())));
            if (this.A06) {
                C263324Kh.A02(drawable, spannableStringBuilder, 0, 0, 0);
            } else {
                ImageSpan imageSpan = new ImageSpan(drawable, 1);
                spannableStringBuilder.insert(0, " ");
                spannableStringBuilder.setSpan(imageSpan, 0, 1, 33);
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static AIr A01(Context context, UserSession userSession) {
        return new AIr(userSession, context);
    }

    public static final C306386Ly A02(AIr aIr, double d, float f, float f2) {
        C306386Ly A0s;
        0qm r0;
        boolean z = aIr.A07;
        Resources resources = aIr.A0H;
        int i = R.dimen.abc_dialog_padding_material;
        if (z) {
            i = R.dimen.abc_dropdownitem_icon_width;
        }
        aIr.A0E = (float) (((double) resources.getDimensionPixelSize(i)) * d);
        aIr.A06 = true;
        UserSession userSession = aIr.A0I;
        if (182.A06(0Tu.A05, userSession, 36322100336011212L)) {
            aIr.A0F = aIr.A0D;
        }
        Context context = aIr.A0G;
        int A012 = AnonymousClass8XF.A01(context);
        if (aIr.A07) {
            A0s = new C389979qX(context, aIr.A02, A012, true);
        } else {
            A0s = AnonymousClass7TE.A0s(context, A012);
        }
        A0s.A0L(aIr.A00());
        float dimensionPixelSize = (float) ((int) (((double) resources.getDimensionPixelSize(aIr.A00)) * d));
        boolean A013 = C346897vw.A01(userSession);
        AnonymousClass0qq A002 = AnonymousClass0qo.A00(context);
        if (A013) {
            r0 = 0qm.A0Y;
        } else {
            r0 = 0qm.A0V;
        }
        AnonymousClass7TE.A1X(r0, A002, A0s);
        AJB.A0B(A0s, dimensionPixelSize, f, f2);
        return A0s;
    }

    public final C306386Ly A04() {
        C306386Ly A0s;
        Spannable spannable;
        Object r12;
        int i;
        Context context = this.A0G;
        int A012 = AnonymousClass8XF.A01(context);
        if (this.A07) {
            A0s = new C389979qX(context, this.A02, A012, false);
        } else {
            A0s = AnonymousClass7TE.A0s(context, A012);
        }
        A0s.A0L(A00());
        Resources resources = this.A0H;
        int A0E2 = AnonymousClass7TE.A0E(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(this.A01);
        AJB.A05(context, this.A0I, A0s, (float) resources.getDimensionPixelSize(this.A00), (float) A0E2, (float) dimensionPixelSize);
        if (this.A0B) {
            spannable = A0s.A0F;
            0qQ.A07(spannable);
            int[] iArr = this.A0F;
            0qQ.A0B(iArr, 4);
            r12 = new C39966ALi(iArr, AnonymousClass7TE.A0C(resources), A0E2, dimensionPixelSize);
        } else if (this.A0F.length == 1) {
            Integer num = this.A03;
            if (num != null) {
                i = num.intValue();
            } else if (this.A0C) {
                i = context.getColor(R.color.primary_text_disabled_material_dark);
            } else {
                i = -1;
            }
            Spannable spannable2 = A0s.A0F;
            0qQ.A07(spannable2);
            AnonymousClass7TG.A18(spannable2, new C379489Uc(i, AnonymousClass7TE.A0C(resources), A0E2, false, dimensionPixelSize, dimensionPixelSize), this.A0F[0]);
            return A0s;
        } else {
            spannable = A0s.A0F;
            0qQ.A07(spannable);
            int[] iArr2 = this.A0F;
            0qQ.A0B(iArr2, 4);
            r12 = new C389919qR(iArr2, AnonymousClass7TE.A0C(resources), A0E2, dimensionPixelSize, dimensionPixelSize);
        }
        AnonymousClass7TG.A17(spannable, r12);
        return A0s;
    }

    public final C306386Ly A05() {
        UserSession userSession = this.A0I;
        double A002 = C346897vw.A00(userSession);
        Resources resources = this.A0H;
        int A0F2 = (int) (((double) AnonymousClass7TE.A0F(resources)) * A002);
        int A0G2 = (int) (((double) AnonymousClass7TE.A0G(resources)) * A002);
        int A0F3 = (int) (((double) AnonymousClass7TE.A0F(resources)) * A002);
        C306386Ly A022 = A02(this, A002, (float) A0G2, (float) A0F3);
        Rect A0W = AnonymousClass7TE.A0W();
        A022.A0b.getTextBounds(A022.A0F.toString(), 0, A022.A0F.length(), A0W);
        int i = A0F3 - A0W.bottom;
        Spannable spannable = A022.A0F;
        0qQ.A07(spannable);
        int[] iArr = this.A0F;
        0qQ.A0B(iArr, 6);
        if (182.A06(0Tu.A05, userSession, 36322100336011212L)) {
            AnonymousClass7TG.A17(spannable, new C389919qR(iArr, A0F2, A0G2, A0F3, i));
            return A022;
        }
        AnonymousClass7TG.A18(spannable, new C379489Uc(-1, A0F2, A0G2, false, A0F3, i), -16777216);
        return A022;
    }

    public final void A06(int i) {
        this.A02 = this.A0G.getDrawable(i);
    }

    public final void A07(int i) {
        this.A0E = AnonymousClass7TE.A01(this.A0H, i);
    }

    public final void A08(int i) {
        int color = this.A0G.getColor(i);
        this.A0F = new int[]{color, color};
    }

    public final void A09(int i) {
        this.A05 = AnonymousClass7TF.A0d(this.A0G.getResources(), i);
    }

    public static void A03(Context context, AIr aIr, int i) {
        aIr.A0A(new int[]{context.getColor(2Yu.A0H(context, i))});
    }
}
