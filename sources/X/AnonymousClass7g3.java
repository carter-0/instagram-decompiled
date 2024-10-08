package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.7g3  reason: invalid class name */
public final class AnonymousClass7g3 extends C251343mx {
    public final AnonymousClass9IQ A00;

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        AnonymousClass3Y5 r8 = r23;
        0qQ.A0B(r8, 0);
        AnonymousClass9IQ r4 = this.A00;
        if (!r4.A02 || !r4.A01) {
            return null;
        }
        C243673Zt A002 = C243633Zp.A00(r8, C41599AxD.A00);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A003 = C244243as.A00(A002, new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A0D, Integer.valueOf(R.id.comment_xar_disclosure_banner), 4)), "comment_xar_disclosure_banner", new C377469Ly(38, (Object) this, (Object) r8));
        2Wb r5 = new 2Wb(r8.A05, new ArrayList());
        2V1 r42 = r5.A00;
        Context context = r42.A0C;
        int A02 = C244013aV.A02(r5, 2Yu.A0H(context, R.attr.igds_color_primary_text));
        int A022 = C244013aV.A02(r5, R.color.fds_transparent);
        Integer num = AnonymousClass05K.A0C;
        Integer num2 = AnonymousClass05K.A00;
        Typeface A03 = 0oh.A03(context, Typeface.DEFAULT, num2);
        2WX r14 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A04, 0, Double.doubleToRawLongBits(32.0d))), new AnonymousClass9JR(AnonymousClass05K.A05, 0, Double.doubleToRawLongBits(12.0d)));
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        C244103ae A004 = 2WW.A00(r42, 0);
        A004.A0V((SpannableStringBuilder) ((0sP) ((AnonymousClass9IV) r4.A00).A00).invoke(C243803a8.A00(r5)));
        A004.A0U((2V5) null);
        A004.A0P(A02);
        A004.A0Q(2Wd.A00(r5.Bnf(), ((long) Float.floatToRawIntBits(14.0f)) | 9221683186994511872L));
        A004.A0R(0);
        A004.A0S(A03);
        A004.A0O(-7829368);
        A004.A0K((float) 2Wd.A00(r5.Bnf(), doubleToRawLongBits));
        A004.A0I((float) 2Wd.A00(r5.Bnf(), doubleToRawLongBits));
        A004.A0J((float) 2Wd.A00(r5.Bnf(), doubleToRawLongBits));
        A004.A0H((float) 2Wd.A00(r5.Bnf(), doubleToRawLongBits));
        A004.A0W(num);
        A004.A0C();
        A004.A0X(num2);
        A004.A0L(1.0f);
        A004.A0a(false);
        A004.A0N(0);
        A004.A0M(Integer.MAX_VALUE);
        A004.A0b(true);
        A004.A0Y(false);
        A004.A0Z(true);
        A004.A05((AnonymousClass2VW) null);
        A004.A01.A08 = A022;
        C244123ag.A00(A004, r14);
        r5.A00(A004.A0A());
        int A0F = 2Yu.A0F(C243803a8.A00(r5), R.attr.dividerColor);
        2WX r1 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(num2, C243573Zh.STRETCH, 3)), new AnonymousClass9JR(AnonymousClass05K.A01, 0, 9221401712017801217L));
        C53616GrV A005 = C54000Gxi.A00(r42);
        A005.A0B(A0F);
        C244123ag.A00(A005, r1);
        r5.A00(A005.A0A());
        return C243563Zg.A06(r5, r8, A003, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, false);
    }

    public AnonymousClass7g3(AnonymousClass9IQ r1) {
        this.A00 = r1;
    }
}
