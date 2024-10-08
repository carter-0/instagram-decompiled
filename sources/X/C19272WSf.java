package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;

/* renamed from: X.WSf  reason: case insensitive filesystem */
public final class C19272WSf implements C232262tL {
    public SpannableStringBuilder A00;
    public final Typeface A01;
    public final Drawable A02;
    public final Drawable A03;
    public final View.OnClickListener A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A06;
        if (str == null) {
            return String.valueOf(this.A00);
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19272WSf wSf = (C19272WSf) obj;
        0qQ.A0B(wSf, 0);
        return AnonymousClass7TF.A1P(0qQ.A0K(this.A06, wSf.A06) ? 1 : 0);
    }

    public C19272WSf(Typeface typeface, Drawable drawable, Drawable drawable2, SpannableStringBuilder spannableStringBuilder, View.OnClickListener onClickListener, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A06 = str;
        this.A00 = spannableStringBuilder;
        this.A01 = typeface;
        this.A05 = str2;
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A04 = onClickListener;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
    }
}
