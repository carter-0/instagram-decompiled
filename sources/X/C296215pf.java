package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5pf  reason: invalid class name and case insensitive filesystem */
public final class C296215pf implements C270594gz, C254533sd {
    public double A00 = -1.0d;
    public double A01 = -1.0d;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A04 = -1.0f;
    public float A05 = -1.0f;
    public float A06 = -1.0f;
    public int A07 = -1;
    public int A08 = -1;
    public int A09 = -1;
    public int A0A = -1;
    public C239623He A0B;
    public C297795sM A0C;
    public Boolean A0D;
    public Integer A0E;
    public String A0F;
    public List A0G;
    public List A0H;
    public List A0I;
    public boolean A0J;
    public final Reel A0K;
    public final int A0L;
    public final int A0M;
    public final UserSession A0N;
    public final String A0O;
    public final String A0P;

    public C296215pf(UserSession userSession, Reel reel, String str, String str2, int i, int i2) {
        0qQ.A0B(userSession, 1);
        this.A0N = userSession;
        this.A0P = str2;
        this.A0O = str;
        this.A0K = reel;
        this.A0L = i;
        this.A0M = i2;
    }

    public final void A8S(C254523sc r14, AnonymousClass4DU r15, String str) {
        int i;
        String AZC;
        C239623He r0;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C254523sc r7 = r14;
        0qQ.A0B(r14, 2);
        Reel reel = this.A0K;
        UserSession userSession = this.A0N;
        if (!reel.A15(userSession) && (i = this.A0L) < reel.A0O(userSession).size()) {
            if ((!C297785sK.A0U(reel) || !str2.equals(002.A0R("instagram_ad_", "hide_response"))) && reel.A0A(userSession, i).CWu()) {
                1Xj r1 = reel.A0A(userSession, i).A0b;
                if (r1 != null) {
                    r14.A0G(userSession, r1);
                }
                r14.A88 = AnonymousClass3PI.A02(reel.A0A(userSession, i).A0b());
                if (r1 != null) {
                    C233822wX.A0A(userSession, r14, r1);
                }
            }
            r14.A6c = reel.getId();
            r14.A6g = this.A0O;
            r14.A7Q = this.A0P;
            Long valueOf = Long.valueOf((long) i);
            r14.A44 = valueOf;
            r14.A24 = Boolean.valueOf(this.A0J);
            r14.A45 = Long.valueOf((long) reel.A0O(userSession).size());
            r14.A12 = this.A0C;
            Integer num = reel.A0g;
            if (num != null) {
                r14.A3U = Long.valueOf((long) num.intValue());
            }
            if (this.A0J) {
                r14.A4A = Long.valueOf((long) this.A0A);
                r14.A0X(this.A0I);
            }
            r14.A0j = reel.A06();
            List list = reel.A0w;
            if (list != null) {
                if (!list.isEmpty()) {
                    r14.A7n = list;
                }
                r14.A4A = valueOf;
                r14.A45 = Long.valueOf((long) C297785sK.A03(list));
                r14.A44 = Long.valueOf((long) C297785sK.A04(list, i));
            }
            boolean CcK = reel.A0A(userSession, i).CcK();
            Long valueOf2 = Long.valueOf((long) this.A0M);
            if (CcK) {
                r14.A3H = valueOf2;
            } else {
                r14.A4G = valueOf2;
            }
            Boolean bool = this.A0D;
            if (bool != null) {
                r14.A13 = bool;
            }
            double d = this.A00;
            if (d != -1.0d) {
                r14.A2X = Double.valueOf(d);
            }
            double d2 = this.A01;
            if (d2 != -1.0d) {
                r14.A2a = Double.valueOf(d2);
            }
            float f = this.A06;
            if (f != -1.0f) {
                float f2 = this.A05;
                if (f2 != -1.0f) {
                    float f3 = this.A04;
                    if (f3 != -1.0f) {
                        float f4 = this.A03;
                        if (f4 != -1.0f) {
                            float f5 = this.A02;
                            if (f5 != -1.0f) {
                                r7.A05(f, f2, f4, f5, f3);
                            }
                        }
                    }
                }
            }
            C239623He r02 = this.A0B;
            if (!(r02 == null || (AZC = r02.AZC()) == null || (r0 = this.A0B) == null)) {
                int BGt = r0.BGt();
                r14.A4P = AZC;
                r14.A3b = Long.valueOf((long) BGt);
            }
            List list2 = this.A0G;
            if (list2 != null) {
                r14.A7u = list2;
            }
            Integer num2 = this.A0E;
            if (num2 != null) {
                r14.A2r = num2;
            }
            AnonymousClass3PI.A04(reel.A0B, r14);
            List list3 = this.A0H;
            if (list3 != null) {
                r14.A7e = new ArrayList(list3);
                r14.A0S = list3.size();
            }
            int i2 = this.A07;
            if (i2 != -1) {
                r14.A0R = i2;
            }
            int i3 = this.A08;
            if (i3 != -1) {
                r14.A0T = i3;
            }
            int i4 = this.A09;
            if (i4 != -1) {
                r14.A48 = Long.valueOf((long) i4);
            }
            String str3 = this.A0F;
            if (str3 != null) {
                r14.A4Q = str3;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object EjI(float f, float f2, float f3, float f4, float f5) {
        this.A06 = f;
        this.A05 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A04 = f5;
        return this;
    }
}
