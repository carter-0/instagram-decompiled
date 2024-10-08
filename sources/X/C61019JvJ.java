package X;

/* renamed from: X.JvJ  reason: case insensitive filesystem */
public final class C61019JvJ extends AnonymousClass0T0 {
    public final C61042Jvg A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C61019JvJ(C61042Jvg jvg, Integer num, Integer num2, Integer num3, Integer num4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        0qQ.A0B(num, 5);
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A04 = num;
        this.A09 = z5;
        this.A0A = z6;
        this.A0F = z7;
        this.A0B = z8;
        this.A0C = z9;
        this.A0E = z10;
        this.A01 = num2;
        this.A02 = num3;
        this.A00 = jvg;
        this.A03 = num4;
        this.A0D = z11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61019JvJ) {
                C61019JvJ jvJ = (C61019JvJ) obj;
                if (!(this.A05 == jvJ.A05 && this.A06 == jvJ.A06 && this.A07 == jvJ.A07 && this.A08 == jvJ.A08 && this.A04 == jvJ.A04 && this.A09 == jvJ.A09 && this.A0A == jvJ.A0A && this.A0F == jvJ.A0F && this.A0B == jvJ.A0B && this.A0C == jvJ.A0C && this.A0E == jvJ.A0E && this.A01 == jvJ.A01 && 0qQ.A0K(this.A02, jvJ.A02) && 0qQ.A0K(this.A00, jvJ.A00) && this.A03 == jvJ.A03 && this.A0D == jvJ.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D2;
        String str2;
        int A092 = AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, C51965G9l.A05(this.A05))));
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "Group";
                break;
            case 2:
                str = "Opal";
                break;
            default:
                str = "Individual";
                break;
        }
        int A093 = AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, C51971G9r.A0F(str, intValue, A092)))))));
        Integer num = this.A01;
        int i = 0;
        if (num == null) {
            A0D2 = 0;
        } else {
            A0D2 = C51971G9r.A0D(num, C63426Kwm.A00(num));
        }
        int A0C2 = (((((A093 + A0D2) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31;
        Integer num2 = this.A03;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            switch (intValue2) {
                case 1:
                    str2 = "CAN_SHARE_TO_FACEBOOK";
                    break;
                case 2:
                    str2 = "DEPEND_ON_OA_EXPANSION";
                    break;
                default:
                    str2 = "NO_XPOST";
                    break;
            }
            i = C51966G9m.A04(str2, intValue2);
        }
        return DbS.A06(this.A0D, (A0C2 + i) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ReelXpostFeatureState(hasAddYoursSticker=");
        A1A.append(this.A05);
        A1A.append(", hasBrandedContent=");
        A1A.append(this.A06);
        A1A.append(", hasCollaboration=");
        A1A.append(this.A07);
        A1A.append(", hasEmojiSliderSticker=");
        A1A.append(this.A08);
        A1A.append(", targetProfileType=");
        Integer num = this.A04;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "Group";
                    break;
                case 2:
                    str = "Opal";
                    break;
                default:
                    str = "Individual";
                    break;
            }
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", hasMixMediaAudio=");
        A1A.append(this.A09);
        A1A.append(", hasPollSticker=");
        A1A.append(this.A0A);
        A1A.append(", shouldBlockCommentPollCrossPosting=");
        A1A.append(this.A0F);
        A1A.append(AnonymousClass000.A00(2018));
        A1A.append(this.A0B);
        A1A.append(", hasQuizSticker=");
        A1A.append(this.A0C);
        A1A.append(", hasVisualComment=");
        A1A.append(this.A0E);
        A1A.append(C273654mx.A00(437));
        Integer num2 = this.A01;
        if (num2 != null) {
            str2 = C63426Kwm.A00(num2);
        } else {
            str2 = "null";
        }
        A1A.append(str2);
        A1A.append(Pxd.A00(114));
        A1A.append(this.A02);
        A1A.append(", remix=");
        A1A.append(this.A00);
        A1A.append(", oaRemix=");
        Integer num3 = this.A03;
        if (num3 != null) {
            switch (num3.intValue()) {
                case 1:
                    str3 = "CAN_SHARE_TO_FACEBOOK";
                    break;
                case 2:
                    str3 = "DEPEND_ON_OA_EXPANSION";
                    break;
                default:
                    str3 = "NO_XPOST";
                    break;
            }
        } else {
            str3 = "null";
        }
        A1A.append(str3);
        A1A.append(", hasScheduledContent=");
        return G9t.A1C(A1A, this.A0D);
    }

    public C61019JvJ() {
        this((C61042Jvg) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Integer) null, false, false, false, false, false, false, false, false, false, false, false);
    }
}
