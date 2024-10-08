package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.9Qn  reason: invalid class name and case insensitive filesystem */
public final class C378619Qn extends AnonymousClass0T0 {
    public final C48143EZl A00;
    public final 293 A01;
    public final ClipsCameraCommandAction A02;
    public final AnonymousClass8JL A03;
    public final C270564gw A04;
    public final ImageUrl A05;
    public final C2801950r A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if (r11.length() == 0) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C378619Qn(X.C48143EZl r3, X.293 r4, com.instagram.api.schemas.ClipsCameraCommandAction r5, X.AnonymousClass8JL r6, X.C270564gw r7, com.instagram.common.typedurl.ImageUrl r8, X.C2801950r r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            r2 = this;
            r0 = 2
            X.AnonymousClass7TG.A0w(r0, r9, r6, r10)
            r2.<init>()
            r2.A09 = r11
            r2.A06 = r9
            r2.A03 = r6
            r2.A07 = r10
            r2.A0B = r12
            r2.A0A = r13
            r2.A05 = r8
            r0 = r18
            r2.A0F = r0
            r2.A0C = r14
            r2.A0D = r15
            r0 = r16
            r2.A0E = r0
            r2.A04 = r7
            r0 = r19
            r2.A0H = r0
            r0 = r20
            r2.A0I = r0
            r2.A01 = r4
            r2.A00 = r3
            r0 = r17
            r2.A08 = r0
            r2.A02 = r5
            if (r11 == 0) goto L_0x003e
            int r1 = r11.length()
            r0 = 0
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            r0 = r0 ^ 1
            r2.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378619Qn.<init>(X.EZl, X.293, com.instagram.api.schemas.ClipsCameraCommandAction, X.8JL, X.4gw, com.instagram.common.typedurl.ImageUrl, X.50r, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C378619Qn) {
                C378619Qn r5 = (C378619Qn) obj;
                if (!0qQ.A0K(this.A09, r5.A09) || this.A06 != r5.A06 || this.A03 != r5.A03 || this.A07 != r5.A07 || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A04, r5.A04) || this.A0H != r5.A0H || this.A0I != r5.A0I || this.A01 != r5.A01 || this.A00 != r5.A00 || !0qQ.A0K(this.A08, r5.A08) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A072 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A06, AnonymousClass7TG.A0E(this.A09) * 31));
        int intValue = this.A07.intValue();
        switch (intValue) {
            case 1:
                str = "EFFECT_BROWSER";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = AnonymousClass000.A00(4306);
                break;
        }
        return ((((((AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0H, (((((((((((((((((A072 + str.hashCode() + intValue) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31)) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
