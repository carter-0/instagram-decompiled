package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.instagram.android.R;

/* renamed from: X.7fK  reason: invalid class name and case insensitive filesystem */
public abstract class C336877fK {
    public static final 2WW A00(C70832Wc r13, 2WX r14, CharSequence charSequence, Integer num, boolean z) {
        int i;
        0qQ.A0B(r14, 2);
        if (!z) {
            num = AnonymousClass05K.A0C;
        }
        int intValue = num.intValue();
        2V1 Aqq = r13.Aqq();
        Context context = Aqq.A0C;
        if (intValue == 0) {
            i = R.attr.igds_color_primary_text;
        } else if (intValue == 1) {
            i = R.attr.igds_color_secondary_text;
        } else if (intValue != 2) {
            i = R.attr.igds_color_error_or_destructive;
        } else {
            i = R.attr.igds_color_primary_text_disabled;
        }
        int A02 = C244013aV.A02(r13, 2Yu.A0H(context, i));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        long A0C = C244013aV.A0C(r13, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        Integer num2 = AnonymousClass05K.A01;
        Typeface create = Typeface.create("sans-serif-medium", 0);
        0qQ.A07(create);
        Typeface A03 = 0oh.A03(context, create, num2);
        2WX r6 = new 2WX(r14, new AnonymousClass9JS(AnonymousClass05K.A0N, charSequence, 0));
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        Integer num3 = AnonymousClass05K.A00;
        C244103ae A00 = 2WW.A00(Aqq, 0);
        A00.A0V(charSequence);
        A00.A0U((2V5) null);
        A00.A0P(A02);
        A00.A0Q(2Wd.A00(r13.Bnf(), A0C));
        A00.A0R(0);
        A00.A0S(A03);
        A00.A0O(-7829368);
        A00.A0K((float) 2Wd.A00(r13.Bnf(), doubleToRawLongBits));
        A00.A0I((float) 2Wd.A00(r13.Bnf(), doubleToRawLongBits));
        A00.A0J((float) 2Wd.A00(r13.Bnf(), doubleToRawLongBits));
        A00.A0H((float) 2Wd.A00(r13.Bnf(), doubleToRawLongBits));
        A00.A0W(num3);
        A00.A0C();
        A00.A0X(num3);
        A00.A0L(1.33f);
        A00.A0a(false);
        A00.A0N(0);
        A00.A0M(1);
        A00.A0b(true);
        A00.A0Y(false);
        A00.A0Z(true);
        A00.A0T(truncateAt);
        A00.A05((AnonymousClass2VW) null);
        C244123ag.A00(A00, r6);
        return A00.A0A();
    }
}
