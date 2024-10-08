package X;

import java.util.Map;

/* renamed from: X.HtW  reason: case insensitive filesystem */
public final class C56144HtW {
    public final C54678HOj A00;
    public final XSJ A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Map A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56144HtW) {
                C56144HtW htW = (C56144HtW) obj;
                if (!(this.A00 == htW.A00 && 0qQ.A0K(this.A04, htW.A04) && 0qQ.A0K(this.A03, htW.A03) && this.A02 == htW.A02 && this.A09 == htW.A09 && 0qQ.A0K(this.A07, htW.A07) && 0qQ.A0K(this.A05, htW.A05) && 0qQ.A0K(this.A06, htW.A06) && this.A0A == htW.A0A && this.A08 == htW.A08 && this.A01 == htW.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = (AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0K(this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31;
        Integer num = this.A02;
        int A0B = AnonymousClass7TG.A0B(num, C55225HeG.A00(num), A082);
        return (AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0A, (((((AnonymousClass7TF.A09(this.A09, A0B) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31)) + AnonymousClass7TG.A0C(this.A01)) * 31;
    }

    public C56144HtW(C54678HOj hOj, XSJ xsj, Integer num, String str, String str2, String str3, String str4, Map map, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1P(hOj, str);
        this.A00 = hOj;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = num;
        this.A09 = z;
        this.A07 = map;
        this.A05 = str3;
        this.A06 = str4;
        this.A0A = z2;
        this.A08 = z3;
        this.A01 = xsj;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineMEmuParams(entryPoint=");
        A1A.append(this.A00);
        C51975G9x.A1H(A1A, ", entryPointStringOverride=");
        A1A.append(", surfaceSessionId=");
        A1A.append(this.A04);
        A1A.append(", bottomSheetSessionId=");
        A1A.append(this.A03);
        A1A.append(", skipToScreen=");
        A1A.append(C55225HeG.A00(this.A02));
        A1A.append(", forceDarkMode=");
        A1A.append(this.A09);
        A1A.append(", appContextData=");
        A1A.append(this.A07);
        A1A.append(", threadType=");
        A1A.append(this.A05);
        A1A.append(", triggerMessageId=");
        A1A.append(this.A06);
        A1A.append(", isUploadingAdditionalPhotos=");
        A1A.append(this.A0A);
        A1A.append(", closeBottomSheetOnFailure=");
        A1A.append(this.A08);
        A1A.append(", metaAIIntentsPlatformSurface=");
        A1A.append(this.A01);
        A1A.append(", metaAIIntentsPlatformSurfaceStringOverride=");
        return C51975G9x.A0i((String) null, A1A);
    }
}
