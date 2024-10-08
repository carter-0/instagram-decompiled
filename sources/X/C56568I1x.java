package X;

import java.util.List;

/* renamed from: X.I1x  reason: case insensitive filesystem */
public final class C56568I1x {
    public final int A00;
    public final C56092Hsf A01;
    public final C56131HtJ A02;
    public final C56047Hrw A03;
    public final C56552I1g A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final String A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56568I1x) {
                C56568I1x i1x = (C56568I1x) obj;
                if (!0qQ.A0K(this.A07, i1x.A07) || !0qQ.A0K(this.A0F, i1x.A0F) || this.A00 != i1x.A00 || this.A05 != i1x.A05 || !0qQ.A0K(this.A08, i1x.A08) || !0qQ.A0K(this.A02, i1x.A02) || this.A0E != i1x.A0E || !0qQ.A0K(this.A04, i1x.A04) || this.A0D != i1x.A0D || !0qQ.A0K(this.A06, i1x.A06) || !0qQ.A0K(this.A01, i1x.A01) || this.A0A != i1x.A0A || this.A0B != i1x.A0B || this.A0C != i1x.A0C || !0qQ.A0K(this.A03, i1x.A03) || !0qQ.A0K(this.A09, i1x.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C56568I1x(C56092Hsf hsf, C56131HtJ htJ, C56047Hrw hrw, C56552I1g i1g, Integer num, String str, String str2, String str3, String str4, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(str4, 10);
        this.A07 = str;
        this.A0F = str2;
        this.A00 = i;
        this.A05 = num;
        this.A08 = str3;
        this.A02 = htJ;
        this.A0E = z;
        this.A04 = i1g;
        this.A0D = z2;
        this.A06 = str4;
        this.A01 = hsf;
        this.A0A = z3;
        this.A0B = z4;
        this.A0C = z5;
        this.A03 = hrw;
        this.A09 = list;
    }

    public static /* synthetic */ C56568I1x A00(C56131HtJ htJ, C56568I1x i1x) {
        C56568I1x i1x2 = i1x;
        String str = i1x2.A07;
        String str2 = i1x2.A0F;
        int i = i1x2.A00;
        Integer num = i1x2.A05;
        String str3 = i1x2.A08;
        boolean z = i1x2.A0E;
        C56552I1g i1g = i1x2.A04;
        boolean z2 = i1x2.A0D;
        String str4 = i1x2.A06;
        C56092Hsf hsf = i1x2.A01;
        boolean z3 = i1x2.A0A;
        boolean z4 = i1x2.A0B;
        boolean z5 = i1x2.A0C;
        C56047Hrw hrw = i1x2.A03;
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        boolean z9 = z;
        int i2 = i;
        return new C56568I1x(hsf, htJ, hrw, i1g, num, str, str2, str3, str4, i1x2.A09, i2, z9, z8, z7, z6, z5);
    }

    public final int hashCode() {
        int A0O = (((AnonymousClass7TE.A0O(this.A07) + AnonymousClass7TG.A0E(this.A0F)) * 31) + this.A00) * 31;
        Integer num = this.A05;
        return AnonymousClass7TE.A0N(this.A09, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TG.A0B(num, I3J.A02(num), A0O) + C41845B3m.A00(this.A08)) * 31)))))))))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WriteWithAIParams(surfaceSessionId=");
        A1A.append(this.A07);
        A1A.append(", appSessionId=");
        A1A.append(this.A0F);
        A1A.append(", numberOfOutputs=");
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(C249703kE.FLAG_MOVED));
        A1A.append(I3J.A02(this.A05));
        A1A.append(", surfaceStringOverride=");
        A1A.append(this.A08);
        A1A.append(", writeWithAIContext=");
        A1A.append(this.A02);
        A1A.append(", streamingEnabled=");
        A1A.append(this.A0E);
        A1A.append(", uiConfig=");
        A1A.append(this.A04);
        A1A.append(", plaintextResultEnabled=");
        A1A.append(this.A0D);
        A1A.append(", bottomSheetSessionId=");
        A1A.append(this.A06);
        A1A.append(", loggingParams=");
        A1A.append(this.A01);
        A1A.append(", initialContentEditingEnabled=");
        A1A.append(this.A0A);
        A1A.append(", isAutoFocusTextInputEnabled=");
        A1A.append(this.A0B);
        A1A.append(", isUsingMMLLM=");
        A1A.append(this.A0C);
        A1A.append(", preqParams=");
        A1A.append(this.A03);
        A1A.append(", prefetchedTonePills=");
        return AnonymousClass7TG.A0n(this.A09, A1A);
    }
}
