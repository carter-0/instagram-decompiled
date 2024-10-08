package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;

/* renamed from: X.Mcv  reason: case insensitive filesystem */
public final class C66809Mcv extends AnonymousClass7FV implements AnonymousClass7FF, AnonymousClass7FW {
    public ImageUrl A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final ImageUrl A05;
    public final AnonymousClass77B A06;
    public final AnonymousClass7FT A07;
    public final AnonymousClass7FE A08;
    public final C69605Non A09;
    public final DirectThreadAnalyticsParams A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (0qQ.A0K(getClass(), JTR.A0v(obj))) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.messagethread.media.model.MediaContentViewModel");
                C66809Mcv mcv = (C66809Mcv) obj;
                if (!(this.A02 == mcv.A02 && this.A0G == mcv.A0G && this.A0H == mcv.A0H && this.A01 == mcv.A01 && 0qQ.A0K(this.A0E, mcv.A0E) && 0qQ.A0K(this.A05, mcv.A05) && 0qQ.A0K(this.A0C, mcv.A0C) && 0qQ.A0K(this.A09, mcv.A09) && 0qQ.A0K(this.A0D, mcv.A0D) && this.A0I == mcv.A0I && this.A0J == mcv.A0J && 0qQ.A0K(this.A08, mcv.A08) && 0qQ.A0K(this.A07, mcv.A07) && this.A04 == mcv.A04 && this.A0F == mcv.A0F && 0qQ.A0K(BSG(), mcv.BSG()) && BSP() == mcv.BSP() && CXM() == mcv.CXM() && BCL() == mcv.BCL() && CWG() == mcv.CWG() && 0qQ.A0K(BOV(), mcv.BOV()) && 0qQ.A0K(Atz(), mcv.Atz()) && Aqm() == mcv.Aqm() && CU2() == mcv.CU2() && Cbp() == mcv.Cbp() && 0qQ.A0K(Ar2(), mcv.Ar2()) && this.A03 == mcv.A03 && 0qQ.A0K(this.A0B, mcv.A0B))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CUQ() {
        return this.A08.A00;
    }

    public final boolean CUR() {
        return this.A08.A01;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0G, this.A02 * 31);
        int i = 0;
        C69605Non non = this.A09;
        int A093 = AnonymousClass7TF.A09(CWG(), AnonymousClass7TF.A09(BCL(), AnonymousClass7TF.A09(CXM(), AnonymousClass7TF.A01(BSP(), AnonymousClass7TF.A07(BSG(), AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A01(this.A04, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A09(this.A0J, AnonymousClass7TF.A09(this.A0I, (AnonymousClass7TF.A07(non, (((((AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A0H, A092), this.A01) + JTR.A0G(this.A0E)) * 31) + C51971G9r.A0E(this.A05)) * 31) + JTR.A0G(this.A0C)) * 31) + JTR.A0G(this.A0D)) * 31)))))))))));
        int A094 = (((AnonymousClass7TF.A09(Cbp(), AnonymousClass7TF.A09(CU2(), AnonymousClass7TF.A07(Aqm(), (AnonymousClass7TF.A07(BOV(), A093) + C51971G9r.A0E(Atz())) * 31))) + C51971G9r.A0E(Ar2())) * 31) + this.A03) * 31;
        String str = this.A0B;
        if (str != null) {
            i = str.hashCode();
        }
        return A094 + i;
    }

    public C66809Mcv(ImageUrl imageUrl, AnonymousClass77B r3, AnonymousClass7FT r4, AnonymousClass7FE r5, C69605Non non, DirectThreadAnalyticsParams directThreadAnalyticsParams, String str, String str2, String str3, String str4, float f, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(r4);
        this.A02 = i;
        this.A0G = z;
        this.A0H = z2;
        this.A01 = f;
        this.A0E = str;
        this.A05 = imageUrl;
        this.A0C = str2;
        this.A09 = non;
        this.A06 = r3;
        this.A0D = str3;
        this.A0I = z3;
        this.A0J = z4;
        this.A08 = r5;
        this.A07 = r4;
        this.A04 = j;
        this.A0F = z5;
        this.A03 = i2;
        this.A0B = str4;
        this.A0A = directThreadAnalyticsParams;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
