package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class AJB {
    public static final SpannedString A01(Resources resources, String str, int[] iArr, int i) {
        int A0F = AnonymousClass7TE.A0F(resources);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C379489Uc(-1, A0F, i, false, i, i), 0, spannableString.length(), 33);
        spannableString.setSpan(new C380229Xd(spannableString, (float[]) null, iArr), 0, 1, 33);
        return new SpannedString(spannableString);
    }

    public static final SpannedString A02(Resources resources, String str, int[] iArr, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        int i3 = i2;
        int i4 = i3;
        int i5 = i3;
        spannableString.setSpan(new C379489Uc(-1, AnonymousClass7TE.A0C(resources), i3, false, i4, i5), 0, spannableString.length(), 33);
        int length = spannableString.length();
        int A0F = AnonymousClass7TE.A0F(resources);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new C379489Uc(i, A0F, i3, false, i4, i5), 0, spannableString2.length(), 33);
        spannableString2.setSpan(new C380229Xd(spannableString2, (float[]) null, iArr), 0, length, 33);
        return new SpannedString(spannableString2);
    }

    public static final void A06(Context context, C306386Ly r4, float f, float f2) {
        AnonymousClass7TG.A1N(context, r4);
        AnonymousClass7TE.A1X(0qm.A0W, AnonymousClass0qo.A00(context), r4);
        A0B(r4, f, 0.0f, f2);
    }

    public static final void A07(Context context, C306386Ly r5, float f, float f2) {
        0qQ.A0B(context, 0);
        r5.A0D(0nA.A03(context, 1.0f), 0.0f, 0nA.A03(context, 1.0f), context.getColor(R.color.black_25_transparent));
        AnonymousClass7TE.A1X(0qm.A0z, AnonymousClass0qo.A00(context), r5);
        A0B(r5, f, f2, 0.0f);
    }

    public static final void A09(Resources resources, Spannable spannable, int i, int i2, int i3) {
        0qQ.A0B(resources, 1);
        AnonymousClass7TG.A18(spannable, new C379489Uc(i2, AnonymousClass7TE.A0C(resources), i, false, i, i), i3);
    }

    public static final void A0A(Resources resources, Spannable spannable, int[] iArr, int i) {
        AnonymousClass7TG.A1P(resources, iArr);
        AnonymousClass7TG.A17(spannable, new C389919qR(iArr, AnonymousClass7TE.A0C(resources), i, i, i));
    }

    public static final SpannableStringBuilder A00(Resources resources, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        int[] iArr = {i, i, i, i, i};
        int[] iArr2 = {i2, i2};
        spannableStringBuilder.setSpan(new C389929qS((float[]) null, iArr, iArr2, -1, AnonymousClass7TE.A0F(resources), AnonymousClass7TE.A0E(resources)), 0, spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }

    public static final void A03(Context context, Resources resources, Spannable spannable, int i) {
        int A0C = AnonymousClass7TE.A0C(resources);
        AnonymousClass7TG.A17(spannable, new C389929qS(ABP.A00(), ABP.A01(context), new int[]{AnonymousClass7TF.A03(context, R.attr.igds_color_text_on_white), AnonymousClass7TF.A03(context, R.attr.igds_color_text_on_white)}, -1, A0C, i));
    }

    public static final void A04(Context context, Spannable spannable, int i) {
        A09(AnonymousClass7TF.A0A(context), spannable, i, context.getColor(R.color.sticker_subtle_light_background), -1);
    }

    public static final void A05(Context context, UserSession userSession, C306386Ly r2, float f, float f2, float f3) {
        AnonymousClass7TG.A1N(userSession, context);
        r2.A0I(AnonymousClass7TG.A0O(context));
        A0B(r2, f, f2, f3);
    }

    public static final void A08(Context context, C306386Ly r1, float f, float f2, float f3) {
        r1.A0I(AnonymousClass7TG.A0O(context));
        A0B(r1, f, f2, f3);
    }

    public static final void A0B(C306386Ly r0, float f, float f2, float f3) {
        r0.A09();
        r0.A0A(f);
        r0.A0C(f2, f3);
    }
}
