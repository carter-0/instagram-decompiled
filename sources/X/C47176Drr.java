package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Drr  reason: case insensitive filesystem */
public final class C47176Drr extends AnonymousClass0T0 {
    public final ImageView.ScaleType A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47176Drr) {
                C47176Drr drr = (C47176Drr) obj;
                if (!(0qQ.A0K(this.A03, drr.A03) && this.A07 == drr.A07 && 0qQ.A0K(this.A02, drr.A02) && 0qQ.A0K(this.A01, drr.A01) && this.A09 == drr.A09 && this.A05 == drr.A05 && this.A0B == drr.A0B && this.A00 == drr.A00 && this.A08 == drr.A08 && this.A0A == drr.A0A && this.A04 == drr.A04 && this.A06 == drr.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A03) * 31;
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A09, (((AnonymousClass7TF.A09(this.A07, A0E) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31))))))));
    }

    public C47176Drr(ImageView.ScaleType scaleType, ImageUrl imageUrl, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A03 = str;
        this.A07 = z;
        this.A02 = str2;
        this.A01 = imageUrl;
        this.A09 = z2;
        this.A05 = z3;
        this.A0B = z4;
        this.A00 = scaleType;
        this.A08 = z5;
        this.A0A = z6;
        this.A04 = z7;
        this.A06 = z8;
    }

    public C47176Drr() {
        this(ImageView.ScaleType.CENTER, (ImageUrl) null, (String) null, (String) null, false, false, true, true, true, true, false, false);
    }
}
