package X;

import com.instagram.model.keyword.Keyword;
import com.instagram.user.model.User;

/* renamed from: X.MnT  reason: case insensitive filesystem */
public final class C67412MnT implements C250603lj {
    public boolean A00;
    public final C14480Tx2 A01;
    public final C74366Ptg A02;
    public final C67410MnR A03;
    public final C67405MnM A04;

    public final void ATF(AnonymousClass30Y r15, C252093oY r16) {
        String A042;
        String A012;
        String A022;
        Integer valueOf;
        User user;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        Integer num2;
        0qQ.A0B(r15, 0);
        C252093oY r0 = r16;
        0qQ.A0B(r0, 1);
        if (r0.CEk(r15) != AnonymousClass05K.A0C && this.A00) {
            C67405MnM mnM = this.A04;
            Object obj = r15.A03;
            C66942Mfb mfb = (C66942Mfb) obj;
            if (mnM.AH0(mfb.A01())) {
                Object obj2 = r15.A04;
                0qQ.A06(obj2);
                C66967Mg0 mg0 = (C66967Mg0) obj2;
                C67410MnR mnR = this.A03;
                0qQ.A06(obj);
                String Bxi = this.A02.Bxi();
                0qQ.A0B(mg0, 1);
                mnR.A00 = Bxi;
                if (mfb instanceof C67387Mn4) {
                    C67387Mn4 mn4 = (C67387Mn4) mfb;
                    if (!mn4.A03) {
                        Keyword keyword = mn4.A01;
                        0qQ.A0C(keyword, "null cannot be cast to non-null type com.instagram.model.keyword.Keyword");
                        if (!keyword.A0A || mg0.A0F) {
                            str4 = mn4.A04();
                            str3 = mn4.A01();
                            str2 = mn4.A01.A04;
                            num = Integer.valueOf(mfb.A00);
                            num2 = AnonymousClass05K.A01;
                        } else {
                            str4 = mn4.A04();
                            str3 = mn4.A01();
                            str2 = mn4.A01.A04;
                            num = Integer.valueOf(mfb.A00);
                            num2 = AnonymousClass05K.A00;
                        }
                        if (num2.intValue() != 0) {
                            str5 = "NORMAL";
                        } else {
                            str5 = "POPULAR";
                        }
                        user = null;
                        str = null;
                    } else {
                        return;
                    }
                } else {
                    if (mfb instanceof C69160Nfj) {
                        C69160Nfj nfj = (C69160Nfj) mfb;
                        if (!nfj.A01) {
                            A042 = "HASHTAG";
                            A012 = nfj.A01();
                            A022 = nfj.A02();
                            valueOf = Integer.valueOf(mfb.A00);
                            str = mfb.A03;
                            user = null;
                        } else {
                            return;
                        }
                    } else if (mfb instanceof C66632Ma1) {
                        C66632Ma1 ma1 = (C66632Ma1) mfb;
                        if (!ma1.A01) {
                            A042 = "USER";
                            A012 = ma1.A01();
                            A022 = ma1.A02();
                            valueOf = Integer.valueOf(mfb.A00);
                            str = mfb.A03;
                            user = ma1.A06();
                        } else {
                            return;
                        }
                    } else {
                        A042 = mfb.A04();
                        A012 = mfb.A01();
                        A022 = mfb.A02();
                        valueOf = Integer.valueOf(mfb.A00);
                        user = null;
                        str = mfb.A03;
                    }
                    str5 = "";
                }
                mnR.A00(mg0, user, num, str4, str3, str2, str5, str);
            }
        }
    }

    public C67412MnT(C14480Tx2 tx2, C74366Ptg ptg, C67410MnR mnR, C67405MnM mnM) {
        this.A03 = mnR;
        this.A04 = mnM;
        this.A01 = tx2;
        this.A02 = ptg;
    }
}
