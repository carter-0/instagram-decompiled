package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.JdO  reason: case insensitive filesystem */
public final class C60015JdO extends ClickableSpan {
    public final Context A00;
    public final L06 A01;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        Context context = this.A00;
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A0H(context, R.attr.igds_color_creation_tools_blue));
        textPaint.setUnderlineText(false);
        textPaint.setTextSize(AnonymousClass7TE.A01(context.getResources(), R.dimen.add_payment_bottom_sheet_row_subtitle_size));
    }

    public final void onClick(View view) {
        C64963Ll2 ll2 = this.A01.A00;
        if (!ll2.A02) {
            String A002 = C64963Ll2.A00(ll2);
            if (A002 == null || A002.length() == 0) {
                DbU.A0z(ll2.A04, 2131965074);
                return;
            }
            String A012 = LIL.A01(A002);
            0qQ.A07(A012);
            AnonymousClass1O8 r0 = ll2.A00;
            if (r0 != null) {
                r0.A00();
            }
            AnonymousClass1O8 r02 = new AnonymousClass1O8();
            ll2.A00 = r02;
            1OC A003 = 1NP.A00(r02.A00, ll2.A06, A012);
            A003.A00 = new C15612Ufe(A012, ll2, 1);
            1ES.A03(A003);
        }
    }

    public C60015JdO(Context context, L06 l06) {
        this.A00 = context;
        this.A01 = l06;
    }
}
