package X;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.GbF  reason: case insensitive filesystem */
public final class C52703GbF extends AnonymousClass0T0 {
    public final Rect A00;
    public final Typeface A01;
    public final TextView.OnEditorActionListener A02;
    public final C52710GbN A03;
    public final C52715GbS A04;
    public final C52734Gbl A05;
    public final C52701GbD A06;
    public final C52705GbH A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final Float A0A;
    public final Float A0B;
    public final Float A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final String A0K;
    public final String A0L;
    public final C62320sa A0M;
    public final C62320sa A0N;
    public final C62320sa A0O;
    public final 0sL A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;

    public C52703GbF(Rect rect, Typeface typeface, TextView.OnEditorActionListener onEditorActionListener, C52710GbN gbN, C52715GbS gbS, C52734Gbl gbl, C52701GbD gbD, C52705GbH gbH, CharSequence charSequence, CharSequence charSequence2, Float f, Float f2, Float f3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, String str2, C62320sa r24, C62320sa r25, C62320sa r26, 0sL r27, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(charSequence, 1);
        0qQ.A0B(gbS, 18);
        this.A09 = charSequence;
        this.A07 = gbH;
        this.A0I = num;
        this.A0J = num2;
        this.A0C = f;
        this.A08 = charSequence2;
        this.A0G = num3;
        this.A0F = num4;
        this.A00 = rect;
        this.A03 = gbN;
        this.A0B = f2;
        this.A0A = f3;
        this.A0D = num5;
        this.A0E = num6;
        this.A05 = gbl;
        this.A06 = gbD;
        this.A04 = gbS;
        this.A0R = z;
        this.A0H = num7;
        this.A0K = str;
        this.A0Q = z2;
        this.A0T = z3;
        this.A01 = typeface;
        this.A0M = r24;
        this.A0N = r25;
        this.A02 = onEditorActionListener;
        this.A0P = r27;
        this.A0S = z4;
        this.A0L = str2;
        this.A0O = r26;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52703GbF) {
                C52703GbF gbF = (C52703GbF) obj;
                if (!0qQ.A0K(this.A09, gbF.A09) || !0qQ.A0K(this.A07, gbF.A07) || !0qQ.A0K(this.A0I, gbF.A0I) || !0qQ.A0K(this.A0J, gbF.A0J) || !0qQ.A0K(this.A0C, gbF.A0C) || !0qQ.A0K(this.A08, gbF.A08) || !0qQ.A0K(this.A0G, gbF.A0G) || !0qQ.A0K(this.A0F, gbF.A0F) || !0qQ.A0K(this.A00, gbF.A00) || !0qQ.A0K(this.A03, gbF.A03) || !0qQ.A0K(this.A0B, gbF.A0B) || !0qQ.A0K(this.A0A, gbF.A0A) || !0qQ.A0K(this.A0D, gbF.A0D) || !0qQ.A0K(this.A0E, gbF.A0E) || this.A05 != gbF.A05 || this.A06 != gbF.A06 || this.A04 != gbF.A04 || this.A0R != gbF.A0R || !0qQ.A0K(this.A0H, gbF.A0H) || !0qQ.A0K(this.A0K, gbF.A0K) || this.A0Q != gbF.A0Q || this.A0T != gbF.A0T || !0qQ.A0K(this.A01, gbF.A01) || !0qQ.A0K(this.A0M, gbF.A0M) || !0qQ.A0K(this.A0N, gbF.A0N) || !0qQ.A0K(this.A02, gbF.A02) || !0qQ.A0K(this.A0P, gbF.A0P) || this.A0S != gbF.A0S || !0qQ.A0K(this.A0L, gbF.A0L) || !0qQ.A0K(this.A0O, gbF.A0O)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A04, (((((((((((((((((((((((((((((AnonymousClass7TE.A0K(this.A09) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A0I)) * 31) + AnonymousClass7TG.A0C(this.A0J)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31 * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31);
        int A092 = AnonymousClass7TF.A09(this.A0Q, (((AnonymousClass7TF.A09(this.A0R, A072) + AnonymousClass7TG.A0C(this.A0H)) * 31) + AnonymousClass7TG.A0E(this.A0K)) * 31);
        return (((AnonymousClass7TF.A09(this.A0S, (((((((((AnonymousClass7TF.A09(this.A0T, A092) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A0M)) * 31) + AnonymousClass7TG.A0C(this.A0N)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A0P)) * 31) + AnonymousClass7TG.A0E(this.A0L)) * 31) + AnonymousClass7TG.A0C(this.A0O)) * 31;
    }
}
