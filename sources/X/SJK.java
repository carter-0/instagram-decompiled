package X;

import com.facebook.common.dextricks.Constants;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;

public final class SJK {
    public 2IV A00;
    public ImmutableList A01;
    public final 2IV A02;
    public final 2IV A03;
    public final OtcInput A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public SJK(2IV r2, 2IV r3, 2IV r4, OtcInput otcInput, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        DbW.A1N(str2, 2, str4);
        this.A0F = str;
        this.A0E = str2;
        this.A0C = str3;
        this.A01 = immutableList;
        this.A0B = str4;
        this.A06 = immutableList2;
        this.A05 = immutableList3;
        this.A02 = r2;
        this.A09 = str5;
        this.A07 = str6;
        this.A0D = str7;
        this.A08 = str8;
        this.A0A = str9;
        this.A04 = otcInput;
        this.A03 = r3;
        this.A00 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SJK) {
                SJK sjk = (SJK) obj;
                if (!0qQ.A0K(this.A0F, sjk.A0F) || !0qQ.A0K(this.A0E, sjk.A0E) || !0qQ.A0K(this.A0C, sjk.A0C) || !0qQ.A0K(this.A01, sjk.A01) || !0qQ.A0K(this.A0B, sjk.A0B) || !0qQ.A0K(this.A06, sjk.A06) || !0qQ.A0K(this.A05, sjk.A05) || !0qQ.A0K(this.A02, sjk.A02) || !0qQ.A0K(this.A09, sjk.A09) || !0qQ.A0K(this.A07, sjk.A07) || !0qQ.A0K(this.A0D, sjk.A0D) || !0qQ.A0K(this.A08, sjk.A08) || !0qQ.A0K(this.A0A, sjk.A0A) || !0qQ.A0K(this.A04, sjk.A04) || !0qQ.A0K(this.A03, sjk.A03) || !0qQ.A0K(this.A00, sjk.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SJK A00(SJK sjk, OtcInput otcInput, ImmutableList immutableList, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        2IV r30;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        2IV r0;
        int i2 = i;
        OtcInput otcInput2 = otcInput;
        ImmutableList immutableList4 = immutableList;
        2IV r12 = null;
        SJK sjk2 = sjk;
        if ((i & 1) != 0) {
            str = sjk2.A0F;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = sjk2.A0E;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = sjk2.A0C;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            immutableList4 = sjk2.A01;
        }
        if ((i & 16) != 0) {
            str4 = sjk2.A0B;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            immutableList2 = sjk2.A06;
        } else {
            immutableList2 = null;
        }
        if ((i & 64) != 0) {
            immutableList3 = sjk2.A05;
        } else {
            immutableList3 = null;
        }
        if ((i2 & 128) != 0) {
            r30 = sjk2.A02;
        } else {
            r30 = null;
        }
        if ((i2 & 256) != 0) {
            str5 = sjk2.A09;
        } else {
            str5 = null;
        }
        if ((i2 & 512) != 0) {
            str6 = sjk2.A07;
        } else {
            str6 = null;
        }
        if ((i2 & 1024) != 0) {
            str7 = sjk2.A0D;
        } else {
            str7 = null;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            str8 = sjk2.A08;
        } else {
            str8 = null;
        }
        if ((i2 & 4096) != 0) {
            str9 = sjk2.A0A;
        } else {
            str9 = null;
        }
        if ((i2 & 8192) != 0) {
            otcInput2 = sjk2.A04;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            r0 = sjk2.A03;
        } else {
            r0 = null;
        }
        if ((i2 & Constants.LOAD_RESULT_PGO) != 0) {
            r12 = sjk2.A00;
        }
        0qQ.A0B(str, 0);
        C51974G9v.A1P(str2, str3, immutableList4, str4);
        AnonymousClass7TG.A1S(immutableList2, immutableList3);
        0qQ.A0B(str5, 8);
        return new SJK(r30, r0, r12, otcInput2, immutableList4, immutableList2, immutableList3, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A08(this.A0B, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A0C, AnonymousClass7TF.A08(this.A0E, AnonymousClass7TE.A0O(this.A0F))))));
        return ((((((((((((AnonymousClass7TF.A08(this.A09, (AnonymousClass7TF.A07(this.A05, A072) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ComponentDataQueryInput(sessionId=");
        A1A.append(this.A0F);
        A1A.append(", requestId=");
        A1A.append(this.A0E);
        A1A.append(", paymentProductId=");
        A1A.append(this.A0C);
        A1A.append(", componentTypes=");
        A1A.append(this.A01);
        A1A.append(", paymentContainerMode=");
        A1A.append(this.A0B);
        A1A.append(", supportedContainerTypes=");
        A1A.append(this.A06);
        A1A.append(", paymentActionTypes=");
        A1A.append(this.A05);
        A1A.append(", chargeAmount=");
        A1A.append(this.A02);
        A1A.append(", fetchType=");
        A1A.append(this.A09);
        A1A.append(", clientReceiverId=");
        A1A.append(this.A07);
        A1A.append(", receiverId=");
        A1A.append(this.A0D);
        A1A.append(", ecpUserExperienceType=");
        A1A.append(this.A08);
        A1A.append(", orderId=");
        A1A.append(this.A0A);
        A1A.append(", otcInput=");
        A1A.append(this.A04);
        A1A.append(", otcComponentInput=");
        A1A.append(this.A03);
        A1A.append(", bloksParams=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
