package X;

import com.instagram.android.R;

/* renamed from: X.Mmd  reason: case insensitive filesystem */
public final class C67361Mmd extends AnonymousClass0T0 {
    public static final C67360Mmc A08 = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C71492dQ A04;
    public final C71492dQ A05;
    public final C71492dQ A06;
    public final C71492dQ A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C67361Mmd) {
                C67361Mmd mmd = (C67361Mmd) obj;
                if (this.A02 != mmd.A02 || this.A01 != mmd.A01 || this.A00 != mmd.A00 || this.A03 != mmd.A03 || !0qQ.A0K(this.A04, mmd.A04) || !0qQ.A0K(this.A05, mmd.A05) || !0qQ.A0K(this.A07, mmd.A07) || !0qQ.A0K(this.A06, mmd.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A04, ((((((this.A02 * 31) + this.A01) * 31) + this.A00) * 31) + this.A03) * 31))));
    }

    public C67361Mmd(C71492dQ r2, C71492dQ r3, C71492dQ r4, C71492dQ r5, int i, int i2, int i3, int i4) {
        C51974G9v.A1N(r2, r3, r4);
        0qQ.A0B(r5, 8);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A04 = r2;
        this.A05 = r3;
        this.A07 = r4;
        this.A06 = r5;
    }

    public C67361Mmd() {
        this(new C71492dQ(-2, -2), new C71492dQ(-2, -2), new C71492dQ(-2, -2), new C71492dQ(-2, -2), 0, 0, R.drawable.instagram_reels_pano_filled_24, R.style.igds_emphasized_title);
    }
}
