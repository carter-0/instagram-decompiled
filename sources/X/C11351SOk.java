package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;

/* renamed from: X.SOk  reason: case insensitive filesystem */
public final class C11351SOk {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final DialogInterface.OnClickListener A07;
    public final DialogInterface.OnClickListener A08;
    public final DialogInterface.OnClickListener A09;
    public final Drawable A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    public C11351SOk(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A0B = null;
        this.A00 = i;
        this.A0A = null;
        this.A0F = true;
        this.A07 = onClickListener;
        this.A0C = null;
        this.A01 = i2;
        this.A08 = null;
        this.A02 = 0;
        this.A09 = onClickListener2;
        this.A03 = i3;
        this.A04 = i4;
        this.A0D = null;
        this.A05 = i5;
        this.A0E = null;
        this.A06 = i6;
    }

    public C11351SOk(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, Drawable drawable, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A0B = str;
        this.A00 = i;
        this.A0A = drawable;
        this.A0F = z;
        this.A07 = onClickListener;
        this.A0C = str2;
        this.A01 = i2;
        this.A08 = onClickListener2;
        this.A02 = i3;
        this.A09 = onClickListener3;
        this.A03 = i4;
        this.A04 = i5;
        this.A0D = str3;
        this.A05 = i6;
        this.A0E = str4;
        this.A06 = i7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11351SOk) {
                C11351SOk sOk = (C11351SOk) obj;
                if (!0qQ.A0K(this.A0B, sOk.A0B) || this.A00 != sOk.A00 || !0qQ.A0K(this.A0A, sOk.A0A) || this.A0F != sOk.A0F || !0qQ.A0K(this.A07, sOk.A07) || !0qQ.A0K(this.A0C, sOk.A0C) || this.A01 != sOk.A01 || !0qQ.A0K(this.A08, sOk.A08) || this.A02 != sOk.A02 || !0qQ.A0K(this.A09, sOk.A09) || this.A03 != sOk.A03 || this.A04 != sOk.A04 || !0qQ.A0K(this.A0D, sOk.A0D) || this.A05 != sOk.A05 || !0qQ.A0K(this.A0E, sOk.A0E) || this.A06 != sOk.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((C11367SPk.A00((((((C11367SPk.A01(this.A0B) * 31) + this.A00) * 31) + C51971G9r.A0E((Object) null)) * 31) + C51971G9r.A0E(this.A0A), this.A0F) * 31) + C51971G9r.A0E((Object) null)) * 31) + C51971G9r.A0E((Object) null)) * 31) + C51971G9r.A0E(this.A07)) * 31 * 31) + 1) * 31) + C51971G9r.A0E(this.A0C)) * 31) + this.A01) * 31) + C51971G9r.A0E(this.A08)) * 31 * 31) + 1) * 31 * 31) + this.A02) * 31) + C51971G9r.A0E(this.A09)) * 31) + this.A03) * 31) + this.A04) * 31) + C51971G9r.A0E(this.A0D)) * 31) + this.A05) * 31) + C51971G9r.A0E(this.A0E)) * 31) + this.A06;
    }

    public C11351SOk(C10752RxW rxW) {
        this.A0B = rxW.A03;
        this.A00 = 0;
        this.A0A = null;
        this.A0F = true;
        this.A07 = null;
        this.A0C = null;
        this.A01 = 0;
        this.A08 = null;
        this.A02 = 0;
        this.A09 = rxW.A02;
        this.A03 = 0;
        this.A04 = 1;
        this.A0D = null;
        this.A05 = rxW.A01;
        this.A0E = rxW.A04;
        this.A06 = 0;
    }
}
