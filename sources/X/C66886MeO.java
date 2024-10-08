package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.MeO  reason: case insensitive filesystem */
public final class C66886MeO {
    public N1Z A00;
    public String A01;
    public final C254703su A02;
    public final 2Eq A03;
    public final DirectThreadKey A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public C66886MeO(DirectThreadKey directThreadKey, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, String str4) {
        this.A08 = str;
        this.A02 = null;
        this.A03 = null;
        this.A04 = directThreadKey;
        this.A0A = str2;
        this.A07 = num;
        this.A06 = bool;
        this.A05 = bool2;
        this.A0B = str3;
        this.A09 = str4;
        this.A01 = str;
    }

    public C66886MeO(N1Z n1z, C254703su r3, 2Eq r4, Integer num, String str) {
        String A0g;
        String str2;
        if (r3.A1S()) {
            A0g = r3.A0f();
        } else {
            A0g = r3.A0g();
        }
        this.A08 = A0g;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r4.BJy();
        this.A0A = str;
        this.A07 = num;
        this.A06 = Boolean.valueOf(r3.A2P);
        this.A05 = Boolean.valueOf(r3.A1T());
        this.A0B = r3.A1u;
        this.A00 = n1z;
        this.A09 = r3.A1h;
        if (r3.A1S()) {
            str2 = r3.A0f();
        } else {
            str2 = r3.A1j;
        }
        this.A01 = str2;
    }

    public C66886MeO(C254703su r3, DirectThreadKey directThreadKey, Integer num, String str) {
        String A0g;
        String str2;
        if (r3.A1S()) {
            A0g = r3.A0f();
        } else {
            A0g = r3.A0g();
        }
        this.A08 = A0g;
        this.A02 = r3;
        this.A03 = null;
        this.A04 = directThreadKey;
        this.A0A = str;
        this.A07 = num;
        this.A06 = Boolean.valueOf(r3.A2P);
        this.A05 = Boolean.valueOf(r3.A1T());
        this.A0B = r3.A1u;
        this.A00 = null;
        this.A09 = r3.A1h;
        if (r3.A1S()) {
            str2 = r3.A0f();
        } else {
            str2 = r3.A1j;
        }
        this.A01 = str2;
    }
}
