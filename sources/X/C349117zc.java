package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* renamed from: X.7zc  reason: invalid class name and case insensitive filesystem */
public final class C349117zc implements C232262tL {
    public final Typeface A00;
    public final Drawable A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C349117zc(Typeface typeface, Drawable drawable, Float f, Float f2, Float f3, String str, String str2, boolean z) {
        0qQ.A0B(str, 1);
        this.A06 = str;
        this.A05 = str2;
        this.A01 = drawable;
        this.A00 = typeface;
        this.A03 = f;
        this.A02 = f2;
        this.A04 = f3;
        this.A07 = z;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C349117zc r3 = (C349117zc) obj;
        0qQ.A0B(r3, 0);
        return 0qQ.A0K(this.A06, r3.A06);
    }
}
