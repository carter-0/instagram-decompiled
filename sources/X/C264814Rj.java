package X;

import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.4Rj  reason: invalid class name and case insensitive filesystem */
public class C264814Rj {
    public static final C264814Rj A0D = new C264814Rj((Layout.Alignment) null, "", -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK, -16777216, AnonymousClass972.MUTABLE_FLAG_MASK);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Layout.Alignment A0B;
    public final CharSequence A0C;

    public C264814Rj(Layout.Alignment alignment, CharSequence charSequence, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3, int i4, int i5, int i6) {
        CharSequence charSequence2;
        Object obj = null;
        if (charSequence == null) {
            obj.getClass();
            throw AnonymousClass00P.createAndThrow();
        }
        if (charSequence instanceof Spanned) {
            charSequence2 = SpannedString.valueOf(charSequence);
        } else {
            charSequence2 = charSequence.toString();
        }
        this.A0C = charSequence2;
        this.A0B = alignment;
        this.A01 = f;
        this.A06 = i;
        this.A05 = i2;
        this.A02 = f2;
        this.A07 = i3;
        this.A03 = f4;
        this.A00 = f5;
        this.A0A = i5;
        this.A08 = i4;
        this.A04 = f3;
        this.A09 = i6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C264814Rj r5 = (C264814Rj) obj;
            if (!(TextUtils.equals(this.A0C, r5.A0C) && this.A0B == r5.A0B && this.A01 == r5.A01 && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A02 == r5.A02 && this.A07 == r5.A07 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A0A == r5.A0A && this.A08 == r5.A08 && this.A04 == r5.A04 && this.A09 == r5.A09)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0C, this.A0B, null, null, Float.valueOf(this.A01), Integer.valueOf(this.A06), Integer.valueOf(this.A05), Float.valueOf(this.A02), Integer.valueOf(this.A07), Float.valueOf(this.A03), Float.valueOf(this.A00), false, Integer.valueOf(this.A0A), Integer.valueOf(this.A08), Float.valueOf(this.A04), Integer.valueOf(this.A09), Float.valueOf(0.0f)});
    }
}
