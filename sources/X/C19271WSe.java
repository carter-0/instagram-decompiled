package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;

/* renamed from: X.WSe  reason: case insensitive filesystem */
public final class C19271WSe implements C232262tL {
    public SpannableStringBuilder A00;
    public final Drawable A01;
    public final View.OnClickListener A02;
    public final C358618bC A03;
    public final C69349Njo A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A08;
        if (str == null) {
            return String.valueOf(this.A00);
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19271WSe wSe = (C19271WSe) obj;
        0qQ.A0B(wSe, 0);
        return AnonymousClass7TF.A1P(0qQ.A0K(this.A08, wSe.A08) ? 1 : 0);
    }

    public C19271WSe(Drawable drawable, SpannableStringBuilder spannableStringBuilder, View.OnClickListener onClickListener, C358618bC r4, C69349Njo njo, Integer num, Integer num2, String str, String str2) {
        this.A08 = str;
        this.A00 = spannableStringBuilder;
        this.A07 = str2;
        this.A01 = drawable;
        this.A06 = num;
        this.A04 = njo;
        this.A02 = onClickListener;
        this.A03 = r4;
        this.A05 = num2;
    }
}
