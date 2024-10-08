package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.PDx  reason: case insensitive filesystem */
public final class C72644PDx implements C74340PtG {
    public final /* synthetic */ 0xF A00;
    public final /* synthetic */ C74551Pwk A01;
    public final /* synthetic */ 1OS A02;
    public final /* synthetic */ PD5 A03;
    public final /* synthetic */ DirectThreadKey A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0rk A06;

    public C72644PDx(0xF r1, C74551Pwk pwk, 1OS r3, PD5 pd5, DirectThreadKey directThreadKey, String str, 0rk r7) {
        this.A03 = pd5;
        this.A04 = directThreadKey;
        this.A02 = r3;
        this.A05 = str;
        this.A06 = r7;
        this.A01 = pwk;
        this.A00 = r1;
    }

    public final void Dlb(AnonymousClass7BP r31) {
        C270214gN r15;
        AnonymousClass7BP r8 = r31;
        0qQ.A0B(r8, 0);
        PD5 pd5 = this.A03;
        UserSession userSession = pd5.A00;
        DirectThreadKey directThreadKey = this.A04;
        0qQ.A0A(directThreadKey);
        C65331bq r5 = this.A02;
        AnonymousClass797 A002 = AnonymousClass796.A00(userSession, r5, directThreadKey);
        if (r8.A03) {
            2Dm A0e = C66580MXl.A0e(pd5.A0B);
            0qQ.A0A(directThreadKey);
            AnonymousClass3U9 B33 = A0e.B33(directThreadKey);
            if (B33 != null && B33.AiM() == null && G9t.A1b(pd5.A09)) {
                ((0fA) pd5.A0C.getValue()).AEf(002.A05(B33.C6a(), "BtvEnabledMap is null after thread fetch success, threadSubType = ", ", lifecycleState = ", C293215kM.A00(B33.BMT())), 817904752).report();
            }
            String str = this.A05;
            if (str != null) {
                0rk r1 = this.A06;
                pd5.A07.getValue();
                C282375Cv.A03(str, (List) null, r1.A00, 7037, 0);
            }
            if (A002.A00() && str != null) {
                0rk r9 = this.A06;
                int i = 15;
                if (r5.Aqm() == 2FW.A1g) {
                    i = 13;
                }
                r9.A00 = i;
                pd5.A07.getValue();
                TraceLogger.log((PrivacyContext) null, r9.A00, (String) null, 86, str, (String) null, 0, (List) null);
            }
            int i2 = this.A06.A00;
            if (i2 == 13 || i2 == 1) {
                OYx oYx = O58.A01;
                OYx.A00(userSession, r5.A05.hashCode(), AnonymousClass7TF.A1S(i2, 13), true);
                oYx.A02(userSession, r5, str);
            }
            C70997OVs A003 = C69881Ntj.A00(userSession);
            0qQ.A0A(directThreadKey);
            A003.A02(directThreadKey);
            AnonymousClass436.A00.A00(userSession).A01().post(new C73370PbT(this.A00, this.A01, r5, pd5));
            return;
        }
        String str2 = this.A05;
        if (str2 != null) {
            0rk r12 = this.A06;
            pd5.A07.getValue();
            C282375Cv.A03(str2, (List) null, r12.A00, 7033, 5);
        }
        boolean A004 = A002.A00();
        C270214gN A005 = C71115Od8.A00(r8.A00);
        if (!A004) {
            C69414Nku nku = C69414Nku.A0F;
            String str3 = A005.A03;
            String str4 = A005.A06;
            String str5 = A005.A05;
            boolean z = A005.A0B;
            boolean z2 = A005.A0C;
            String str6 = A005.A07;
            String str7 = A005.A04;
            String str8 = A005.A02;
            boolean z3 = A005.A0A;
            C254403sQ r3 = A005.A00;
            boolean z4 = A005.A09;
            boolean z5 = A005.A08;
            boolean z6 = A005.A0D;
            0qQ.A0B(nku, 0);
            AnonymousClass7TG.A1P(str3, str5);
            String str9 = str8;
            boolean z7 = z;
            String str10 = str6;
            String str11 = str7;
            String str12 = str4;
            String str13 = str5;
            C69414Nku nku2 = nku;
            String str14 = str3;
            C254403sQ r16 = r3;
            r15 = new C270214gN(r16, nku2, str14, str12, str13, str10, str11, str9, z7, z2, z3, z4, z5, z6);
        } else {
            C69414Nku nku3 = C69414Nku.A08;
            String str15 = A005.A03;
            String str16 = A005.A06;
            String str17 = A005.A05;
            boolean z8 = A005.A0B;
            boolean z9 = A005.A0C;
            String str18 = A005.A07;
            String str19 = A005.A04;
            String str20 = A005.A02;
            boolean z10 = A005.A0A;
            C254403sQ r32 = A005.A00;
            boolean z11 = A005.A09;
            boolean z12 = A005.A08;
            boolean z13 = A005.A0D;
            0qQ.A0B(nku3, 0);
            AnonymousClass7TG.A1P(str15, str17);
            String str21 = str20;
            boolean z14 = z8;
            String str22 = str18;
            String str23 = str19;
            String str24 = str16;
            String str25 = str17;
            C69414Nku nku4 = nku3;
            String str26 = str15;
            C254403sQ r162 = r32;
            r15 = new C270214gN(r162, nku4, str26, str24, str25, str22, str23, str21, z14, z9, z10, z11, z12, z13);
        }
        this.A01.DTM(r15, (String) null);
    }
}
