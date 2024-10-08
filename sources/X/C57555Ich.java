package X;

import android.content.Context;

/* renamed from: X.Ich  reason: case insensitive filesystem */
public final class C57555Ich implements C59582JPc {
    public final int A00;
    public final 2WX A01;
    public final HNN A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final C62320sa A06;
    public final boolean A07;
    public final Integer A08;

    public C57555Ich(2WX r2, HNN hnn, Integer num, Integer num2, Integer num3, String str, C62320sa r8, int i, boolean z) {
        AnonymousClass7TF.A1E(hnn, 1, num3);
        this.A02 = hnn;
        this.A00 = i;
        this.A06 = r8;
        this.A05 = str;
        this.A03 = num;
        this.A04 = num2;
        this.A08 = num3;
        this.A01 = r2;
        this.A07 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57555Ich) {
                C57555Ich ich = (C57555Ich) obj;
                if (this.A02 != ich.A02 || this.A00 != ich.A00 || !0qQ.A0K(this.A06, ich.A06) || !0qQ.A0K(this.A05, ich.A05) || !0qQ.A0K(this.A03, ich.A03) || !0qQ.A0K(this.A04, ich.A04) || this.A08 != ich.A08 || !0qQ.A0K(this.A01, ich.A01) || this.A07 != ich.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer CFZ() {
        int intValue = this.A08.intValue();
        if (intValue == 0) {
            return AnonymousClass05K.A00;
        }
        if (intValue == 1) {
            return AnonymousClass05K.A01;
        }
        if (intValue != 2) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A0C;
    }

    public final int hashCode() {
        int A082 = (((AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A07(this.A06, (AnonymousClass7TE.A0K(this.A02) + this.A00) * 31)) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31;
        Integer num = this.A08;
        return DbS.A06(this.A07, AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0B(num, C55235HeQ.A00(num), A082)));
    }

    public final /* bridge */ /* synthetic */ Object CGU(Context context, C59535JNh jNh, C59562JOi jOi) {
        AnonymousClass7TG.A1O(jNh, jOi);
        HNN hnn = this.A02;
        String str = this.A05;
        Integer num = this.A04;
        Integer num2 = this.A03;
        int i = this.A00;
        return new C53854GvL(this.A01, hnn, (HNN) null, num2, num, str, this.A06, i, this.A07);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiFilledIconButtonTextInputAddOn(iconName=");
        A1A.append(this.A02);
        A1A.append(", cornerRadiusDp=");
        A1A.append(this.A00);
        A1A.append(", onClick=");
        A1A.append(this.A06);
        A1A.append(", accessibilityLabel=");
        A1A.append(this.A05);
        A1A.append(", buttonBackgroundColor=");
        A1A.append(this.A03);
        A1A.append(", iconTintColor=");
        A1A.append(this.A04);
        A1A.append(", visibilityRule=");
        A1A.append(C55235HeQ.A00(this.A08));
        A1A.append(", style=");
        A1A.append(this.A01);
        A1A.append(", isEnabled=");
        return G9t.A1C(A1A, this.A07);
    }
}
