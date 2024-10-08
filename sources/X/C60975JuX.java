package X;

import com.instagram.api.schemas.CameraTool;

/* renamed from: X.JuX  reason: case insensitive filesystem */
public final class C60975JuX extends AnonymousClass0T0 {
    public final CameraTool A00;
    public final C63968LFv A01;
    public final LG4 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final Integer A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60975JuX) {
                C60975JuX juX = (C60975JuX) obj;
                if (this.A00 != juX.A00 || !0qQ.A0K(this.A08, juX.A08) || !0qQ.A0K(this.A01, juX.A01) || !0qQ.A0K(this.A09, juX.A09) || !0qQ.A0K(this.A06, juX.A06) || !0qQ.A0K(this.A07, juX.A07) || !0qQ.A0K(this.A03, juX.A03) || !0qQ.A0K(this.A04, juX.A04) || !0qQ.A0K(this.A05, juX.A05) || this.A0B != juX.A0B || !0qQ.A0K(this.A0A, juX.A0A) || !0qQ.A0K(this.A02, juX.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = (((((((((((((((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31;
        int intValue = this.A0B.intValue();
        switch (intValue) {
            case 1:
                str = "CONTEXTUAL_BACKGROUND";
                break;
            case 2:
                str = "META_INTENTS";
                break;
            default:
                str = "IMAGINE_NATIVE";
                break;
        }
        return ((C51971G9r.A0F(str, intValue, A0K) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C60975JuX(CameraTool cameraTool, C63968LFv lFv, LG4 lg4, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = cameraTool;
        this.A08 = str;
        this.A01 = lFv;
        this.A09 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A05 = str7;
        this.A0B = num;
        this.A0A = str8;
        this.A02 = lg4;
    }
}
