package X;

import com.facebook.common.dextricks.Constants;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GnI  reason: case insensitive filesystem */
public final class C53386GnI extends AnonymousClass0T0 {
    public final C53375Gn5 A00;
    public final ImageUrl A01;
    public final C54617HLa A02;
    public final HNK A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final AnonymousClass62P A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final C255943uy A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53386GnI) {
                C53386GnI gnI = (C53386GnI) obj;
                if (!(this.A0A == gnI.A0A && this.A0C == gnI.A0C && this.A0B == gnI.A0B && this.A02 == gnI.A02 && this.A09 == gnI.A09 && this.A08 == gnI.A08 && 0qQ.A0K(this.A04, gnI.A04) && this.A03 == gnI.A03 && this.A0E == gnI.A0E && 0qQ.A0K(this.A05, gnI.A05) && 0qQ.A0K(this.A06, gnI.A06) && 0qQ.A0K(this.A01, gnI.A01) && 0qQ.A0K(this.A07, gnI.A07) && this.A0D == gnI.A0D && 0qQ.A0K(this.A00, gnI.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C53386GnI A00(ImageUrl imageUrl, C54617HLa hLa, C53386GnI gnI, C255943uy r21, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        Integer num;
        HNK hnk;
        AnonymousClass62P r0;
        boolean z7 = z4;
        ImageUrl imageUrl2 = imageUrl;
        String str3 = str2;
        String str4 = str;
        C255943uy r10 = r21;
        boolean z8 = z3;
        C54617HLa hLa2 = hLa;
        boolean z9 = z2;
        boolean z10 = z;
        C53375Gn5 gn5 = null;
        int i2 = i;
        C53386GnI gnI2 = gnI;
        if ((i & 1) != 0) {
            z10 = gnI2.A0A;
        }
        if ((i & 2) != 0) {
            z5 = gnI2.A0C;
        } else {
            z5 = false;
        }
        if ((i & 4) != 0) {
            z9 = gnI2.A0B;
        }
        if ((i & 8) != 0) {
            hLa2 = gnI2.A02;
        }
        if ((i & 16) != 0) {
            z8 = gnI2.A09;
        }
        if ((i & 32) != 0) {
            z6 = gnI2.A08;
        } else {
            z6 = false;
        }
        if ((i & 64) != 0) {
            num = gnI2.A04;
        } else {
            num = null;
        }
        if ((i2 & 128) != 0) {
            hnk = gnI2.A03;
        } else {
            hnk = null;
        }
        if ((i2 & 256) != 0) {
            r10 = gnI2.A0E;
        }
        if ((i2 & 512) != 0) {
            str4 = gnI2.A05;
        }
        if ((i2 & 1024) != 0) {
            str3 = gnI2.A06;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            imageUrl2 = gnI2.A01;
        }
        if ((i2 & 4096) != 0) {
            r0 = gnI2.A07;
        } else {
            r0 = null;
        }
        if ((i2 & 8192) != 0) {
            z7 = gnI2.A0D;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            gn5 = gnI2.A00;
        }
        C51973G9u.A0t(3, hLa2, r10, str4);
        0qQ.A0B(str3, 10);
        DbW.A1P(imageUrl2, 11, r0);
        return new C53386GnI(gn5, imageUrl2, hLa2, hnk, r10, num, str4, str3, r0, z10, z5, z9, z8, z6, z7);
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0C, C51965G9l.A05(this.A0A)))));
        return AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A07(this.A0E, (((AnonymousClass7TF.A09(this.A08, A092) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31)))))) + AnonymousClass7TE.A0L(this.A00);
    }

    public C53386GnI(C53375Gn5 gn5, ImageUrl imageUrl, C54617HLa hLa, HNK hnk, C255943uy r5, Integer num, String str, String str2, AnonymousClass62P r9, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0A = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A02 = hLa;
        this.A09 = z4;
        this.A08 = z5;
        this.A04 = num;
        this.A03 = hnk;
        this.A0E = r5;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = imageUrl;
        this.A07 = r9;
        this.A0D = z6;
        this.A00 = gn5;
    }

    public C53386GnI() {
        this((C53375Gn5) null, DbS.A0V(""), C54617HLa.LOADING, (HNK) null, C255943uy.SUCCESS, (Integer) null, "", "", AnonymousClass62M.A01, false, false, true, false, false, false);
    }
}
