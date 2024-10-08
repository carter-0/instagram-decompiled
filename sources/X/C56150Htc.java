package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.Htc  reason: case insensitive filesystem */
public final class C56150Htc {
    public final int A00;
    public final HMY A01;
    public final C69416Nky A02;
    public final C56139HtR A03;
    public final AnonymousClass7K7 A04;
    public final C56092Hsf A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56150Htc) {
                C56150Htc htc = (C56150Htc) obj;
                if (!(this.A02 == htc.A02 && 0qQ.A0K(this.A04, htc.A04) && this.A0G == htc.A0G && this.A0I == htc.A0I && this.A0E == htc.A0E && this.A0K == htc.A0K && this.A0J == htc.A0J && this.A0M == htc.A0M && this.A0Q == htc.A0Q && this.A0R == htc.A0R && this.A0F == htc.A0F && this.A06 == htc.A06 && this.A01 == htc.A01 && this.A08 == htc.A08 && this.A07 == htc.A07 && 0qQ.A0K(this.A0B, htc.A0B) && 0qQ.A0K(this.A0A, htc.A0A) && 0qQ.A0K(this.A05, htc.A05) && this.A0H == htc.A0H && this.A0N == htc.A0N && this.A00 == htc.A00 && 0qQ.A0K(this.A03, htc.A03) && this.A0O == htc.A0O && this.A0P == htc.A0P && this.A0L == htc.A0L && 0qQ.A0K(this.A0C, htc.A0C) && this.A09 == htc.A09 && this.A0D == htc.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        int A092 = AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0R, AnonymousClass7TF.A09(this.A0Q, AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A09(this.A0J, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0G, ((AnonymousClass7TE.A0K(this.A02) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31)))))))));
        Integer num = this.A06;
        switch (num.intValue()) {
            case 0:
                str = "APPLY";
                break;
            case 1:
                str = "DONE";
                break;
            default:
                str = "SEND";
                break;
        }
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0B(num, str, A092));
        int intValue = this.A08.intValue();
        switch (intValue) {
            case 1:
                str2 = "EDIT";
                break;
            case 2:
                str2 = "EMU_EDIT";
                break;
            default:
                str2 = "CREATION";
                break;
        }
        int A0F2 = C51971G9r.A0F(str2, intValue, A072);
        Integer num2 = this.A07;
        int A082 = AnonymousClass7TF.A08(this.A0A, ((AnonymousClass7TG.A0B(num2, C55223HeE.A00(num2), A0F2) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31);
        int A002 = C54732HQn.A00();
        int A093 = AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A07(this.A05, (A082 + A002) * 31));
        int A094 = (((AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A09(this.A0P, AnonymousClass7TF.A09(this.A0O, ((((AnonymousClass7TF.A09(this.A0N, A093) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31))) + A002) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31;
        int intValue2 = this.A09.intValue();
        if (1 != intValue2) {
            str3 = "None";
        } else {
            str3 = "MEmuPregen";
        }
        return DbS.A06(this.A0D, C51971G9r.A0F(str3, intValue2, A094) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineCreateParams(source=");
        A1A.append(this.A02);
        C51975G9x.A1H(A1A, ", sourceStringOverride=");
        A1A.append(", promptParams=");
        A1A.append(this.A04);
        A1A.append(", isEditingEnabled=");
        A1A.append(this.A0G);
        A1A.append(", isFlashEnabled=");
        A1A.append(this.A0I);
        A1A.append(", isAnimateEnabled=");
        A1A.append(this.A0E);
        A1A.append(", isMEmuEnabled=");
        A1A.append(this.A0K);
        A1A.append(", isIgPersonalizationEnabled=");
        A1A.append(this.A0J);
        A1A.append(", isMEmuSelectionEnabled=");
        A1A.append(this.A0M);
        A1A.append(", useGridForResults=");
        A1A.append(this.A0Q);
        A1A.append(", useVScrollGridForSuggestions=");
        A1A.append(this.A0R);
        A1A.append(", isDarkModeForced=");
        A1A.append(this.A0F);
        A1A.append(", actionButtonText=");
        switch (this.A06.intValue()) {
            case 0:
                str = "APPLY";
                break;
            case 1:
                str = "DONE";
                break;
            default:
                str = "SEND";
                break;
        }
        A1A.append(str);
        A1A.append(", imageAspectRatio=");
        A1A.append(this.A01);
        A1A.append(", launchWithFeature=");
        switch (this.A08.intValue()) {
            case 1:
                str2 = "EDIT";
                break;
            case 2:
                str2 = "EMU_EDIT";
                break;
            default:
                str2 = "CREATION";
                break;
        }
        A1A.append(str2);
        A1A.append(", imagineIceBreakerType=");
        A1A.append(C55223HeE.A00(this.A07));
        C51975G9x.A1H(A1A, ", appSessionId=");
        A1A.append(", surfaceSessionId=");
        A1A.append(this.A0B);
        A1A.append(", bottomSheetSessionId=");
        A1A.append(this.A0A);
        C51975G9x.A1G(A1A, ", isE2EE=");
        A1A.append(", loggingParams=");
        A1A.append(this.A05);
        A1A.append(", isEmuEditEnabled=");
        A1A.append(this.A0H);
        A1A.append(", isTapToSelectEnabled=");
        A1A.append(this.A0N);
        G9w.A1X(A1A, ", popoverParams=");
        A1A.append(", numberOfImagesToGenerate=");
        A1A.append(this.A00);
        A1A.append(", mediaEditParams=");
        A1A.append(this.A03);
        A1A.append(", persistSession=");
        A1A.append(this.A0O);
        A1A.append(", restoreSession=");
        A1A.append(this.A0P);
        A1A.append(", isMEmuOnlyCreation=");
        A1A.append(this.A0L);
        C51975G9x.A1G(A1A, ", keepBottomSheetOpenOnSuccess=");
        A1A.append(", textInputPlaceholderText=");
        A1A.append(this.A0C);
        A1A.append(", suggestionToResultPassthrough=");
        if (1 - this.A09.intValue() != 0) {
            str3 = "None";
        } else {
            str3 = "MEmuPregen";
        }
        A1A.append(str3);
        G9w.A1X(A1A, ", headerSubtitleText=");
        A1A.append(", enableMEmuSpotlight=");
        return G9t.A1C(A1A, this.A0D);
    }

    public /* synthetic */ C56150Htc(HMY hmy, C69416Nky nky, C56139HtR htR, AnonymousClass7K7 r33, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        String str3;
        Integer num5 = num;
        HMY hmy2 = hmy;
        Integer num6 = num2;
        Integer num7 = num3;
        String str4 = str;
        int i4 = i;
        C56139HtR htR2 = htR;
        String str5 = str2;
        int i5 = i2;
        Integer num8 = num4;
        C56092Hsf hsf = null;
        AnonymousClass7K7 r27 = (i2 & 4) != 0 ? null : r33;
        boolean A1Q = C51966G9m.A1Q(i2 & 8, z);
        boolean A1Q2 = C51966G9m.A1Q(i2 & 16, z2);
        boolean A1Q3 = C51966G9m.A1Q(i2 & 32, z3);
        boolean A1Q4 = C51966G9m.A1Q(i2 & 64, z4);
        boolean A1Q5 = C51966G9m.A1Q(i5 & 128, z5);
        boolean A1R = C51966G9m.A1R(i5 & 256, z6);
        boolean A1Q6 = C51966G9m.A1Q(i5 & 512, z7);
        boolean A1Q7 = C51966G9m.A1Q(i5 & 1024, z8);
        boolean A1Q8 = C51966G9m.A1Q(i5 & C249703kE.FLAG_MOVED, z9);
        num5 = (i5 & 4096) != 0 ? AnonymousClass05K.A01 : num5;
        hmy2 = (i5 & 8192) != 0 ? HMY.PORTRAIT : hmy2;
        num6 = (i5 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? AnonymousClass05K.A00 : num6;
        num7 = (i2 & Constants.LOAD_RESULT_PGO) != 0 ? AnonymousClass05K.A00 : num7;
        str4 = (i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? null : str4;
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            str3 = AnonymousClass7TF.A0c();
        } else {
            str3 = null;
        }
        hsf = (i2 & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0 ? new C56092Hsf(str3, str4) : hsf;
        boolean A1R2 = C51966G9m.A1R(i2 & 2097152, z10);
        boolean A1R3 = C51966G9m.A1R(i2 & 4194304, z11);
        i4 = (i2 & 16777216) != 0 ? 4 : i4;
        htR2 = (i2 & 33554432) != 0 ? null : htR2;
        boolean A1Q9 = C51966G9m.A1Q(i2 & 67108864, z12);
        boolean A1Q10 = C51966G9m.A1Q(i2 & 134217728, z13);
        boolean A1Q11 = C51966G9m.A1Q(i2 & 268435456, z14);
        str5 = (i2 & SN3.MAX_SIGNED_POWER_OF_TWO) != 0 ? null : str5;
        num8 = (i2 & AnonymousClass972.MUTABLE_FLAG_MASK) != 0 ? AnonymousClass05K.A00 : num8;
        boolean A1Q12 = C51966G9m.A1Q(i3 & 2, z15);
        0qQ.A0B(num5, 13);
        C51973G9u.A0v(14, hmy2, num6, num7);
        C51970G9q.A1N(str3, 19, hsf);
        0qQ.A0B(num8, 32);
        this.A02 = nky;
        this.A04 = r27;
        this.A0G = A1Q;
        this.A0I = A1Q2;
        this.A0E = A1Q3;
        this.A0K = A1Q4;
        this.A0J = A1Q5;
        this.A0M = A1R;
        this.A0Q = A1Q6;
        this.A0R = A1Q7;
        this.A0F = A1Q8;
        this.A06 = num5;
        this.A01 = hmy2;
        this.A08 = num6;
        this.A07 = num7;
        this.A0B = str4;
        this.A0A = str3;
        this.A05 = hsf;
        this.A0H = A1R2;
        this.A0N = A1R3;
        this.A00 = i4;
        this.A03 = htR2;
        this.A0O = A1Q9;
        this.A0P = A1Q10;
        this.A0L = A1Q11;
        this.A0C = str5;
        this.A09 = num8;
        this.A0D = A1Q12;
    }
}
