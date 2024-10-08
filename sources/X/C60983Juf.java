package X;

import android.graphics.RectF;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;

/* renamed from: X.Juf  reason: case insensitive filesystem */
public final class C60983Juf extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final RectF A02;
    public final RectF A03;
    public final C53368Gms A04;
    public final C60990Jum A05;
    public final C61017JvH A06;
    public final C60994Juq A07;
    public final C60993Jup A08;
    public final IGTVShoppingMetadata A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60983Juf) {
                C60983Juf juf = (C60983Juf) obj;
                if (this.A00 != juf.A00 || this.A01 != juf.A01 || !0qQ.A0K(this.A08, juf.A08) || !0qQ.A0K(this.A0D, juf.A0D) || !0qQ.A0K(this.A0A, juf.A0A) || !0qQ.A0K(this.A04, juf.A04) || !0qQ.A0K(this.A05, juf.A05) || !0qQ.A0K(this.A07, juf.A07) || this.A0F != juf.A0F || !0qQ.A0K(this.A02, juf.A02) || !0qQ.A0K(this.A03, juf.A03) || this.A0E != juf.A0E || !0qQ.A0K(this.A0B, juf.A0B) || this.A0H != juf.A0H || !0qQ.A0K(this.A06, juf.A06) || !0qQ.A0K(this.A0C, juf.A0C) || !0qQ.A0K(this.A09, juf.A09) || this.A0G != juf.A0G) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A08(this.A0D, AnonymousClass7TF.A07(this.A08, C51972G9s.A07(this.A01, this.A00 * 31)))))));
        boolean z = this.A0E;
        int A092 = AnonymousClass7TF.A09(this.A0H, (AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A09(this.A0F, A072) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31);
        return DbS.A06(this.A0G, (((AnonymousClass7TF.A07(this.A06, A092) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TE.A0L(this.A09)) * 31);
    }

    public C60983Juf(RectF rectF, RectF rectF2, C53368Gms gms, C60990Jum jum, C61017JvH jvH, C60994Juq juq, C60993Jup jup, IGTVShoppingMetadata iGTVShoppingMetadata, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1R(str, str2);
        this.A00 = i;
        this.A01 = j;
        this.A08 = jup;
        this.A0D = str;
        this.A0A = str2;
        this.A04 = gms;
        this.A05 = jum;
        this.A07 = juq;
        this.A0F = z;
        this.A02 = rectF;
        this.A03 = rectF2;
        this.A0E = z2;
        this.A0B = str3;
        this.A0H = z3;
        this.A06 = jvH;
        this.A0C = str4;
        this.A09 = iGTVShoppingMetadata;
        this.A0G = z4;
    }
}
