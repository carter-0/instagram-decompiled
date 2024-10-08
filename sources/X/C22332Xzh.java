package X;

import android.content.Context;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Xzh  reason: case insensitive filesystem */
public final class C22332Xzh implements C299665vd {
    public final Context A00;
    public final C299665vd A01;
    public final C55600HkK A02;
    public final C53008Ggz A03;

    public C22332Xzh(Context context, C299635va r10, C55798Hne hne, C55600HkK hkK, C53008Ggz ggz, UserSession userSession, AnonymousClass4DU r15, 0sP r16, boolean z) {
        0qQ.A0B(hkK, 4);
        C51974G9v.A1N(hne, context, userSession);
        0qQ.A0B(r15, 8);
        this.A01 = new ILM(context, r10, hne, userSession, r15, r16, z);
        this.A03 = ggz;
        this.A02 = hkK;
        this.A00 = context;
    }

    public static C299665vd A00(C22332Xzh xzh, Object obj) {
        0qQ.A0B(obj, 0);
        return xzh.A01;
    }

    public final void CtP(AnonymousClass6CS r10, AnonymousClass6CT r11, String str, String str2, String str3, String str4, int i, boolean z) {
        0qQ.A0B(str, 0);
        C51974G9v.A1N(r10, r11, str4);
        C299665vd r0 = this.A01;
        r0.CtP(r10, r11, str, str2, str3, str4, i, z);
    }

    public final void D4P(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        DbY.A1S(str, str3);
        this.A01.D4P(str, str2, str3, str4, str5, i, z);
    }

    public final void D4j(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.D4j(str, str2, str3, str4, str5, z, str6);
    }

    public final void D6d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        AnonymousClass7TG.A1T(str, str10, str11);
        boolean z6 = z;
        if (!z) {
            C55600HkK hkK = this.A02;
            Context context = this.A00;
            C262224Cq r3 = hkK.A01;
            1Eo.A05(19B.A00, new MHC((Object) context, (Object) hkK, (AnonymousClass4D7) null, 24), r3);
            return;
        }
        this.A01.D6d(str9, str10, str11, str4, str5, str6, str7, str8, z6, z2, z3, z4, z5);
    }

    public final void DDe(String str) {
        0qQ.A0B(str, 0);
        C55896HpH hpH = this.A03.A03;
        String A0u = C51965G9l.A0u(str);
        0qQ.A0B(A0u, 0);
        Long A10 = AnonymousClass7TE.A10(A0u);
        if (A10 != null) {
            String str2 = AnonymousClass1QI.A00.A02.A00;
            UserSession userSession = hpH.A0A;
            AnonymousClass4DU r2 = hpH.A0C;
            if (str2 == null) {
                str2 = "";
            }
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "barcelona_inline_reply_expand_tap");
            if (A0e.isSampled()) {
                C51965G9l.A1E(A0e, A10);
                C51969G9p.A19(A0e, r2);
                A0e.AAJ("nav_chain", str2);
                A0e.Cgf();
            }
        }
        C262224Cq r3 = hpH.A0F;
        1Eo.A05(19B.A00, new MGE(hpH, str, (AnonymousClass4D7) null, 17), r3);
    }

    public final void DF2(boolean z) {
        this.A01.DF2(z);
    }

    public final void DGU(0xF r9, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DGU(r9, str, str2, str3, str4, z, z2);
    }

    public final void DJE(String str) {
        0qQ.A0B(str, 0);
    }

    public final void DLT() {
        this.A01.DLT();
    }

    public final void DNV(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        A00(this, str).DNV(bool, str, str2, str3, str4, str5, str6, str7, z);
    }

    public final void DPs(C66920MfE mfE, Integer num, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DPs(mfE, num, str, str2, str3, str4);
    }

    public final void DYP(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        DbY.A1S(str, str3);
        this.A01.DYP(str, str2, str3, str4, str5, str6, list);
    }

    public final void Da2(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.Da2(str, str2, str3, str4, str5);
    }

    public final void DbQ(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        DbZ.A0t(0, str, str3, str4);
        this.A01.DbQ(str, str2, str3, str4, str5, str6, str7, i);
    }

    public final void DeB(RepostRestrictedReason repostRestrictedReason, String str, String str2, String str3, boolean z, boolean z2) {
        A00(this, str).DeB(repostRestrictedReason, str, str2, str3, z, z2);
    }

    public final void Dfr(String str) {
        0qQ.A0B(str, 0);
    }

    public final void Dhy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.Dhy(str, str2, str3, str4, str5, str6, str7);
    }

    public final void Dug(String str) {
        0qQ.A0B(str, 0);
    }

    public final void Dvo() {
        this.A01.Dvo();
    }

    public final void Ctr(C53310Glw glw) {
        A00(this, glw).Ctr(glw);
    }

    public final void D6N(String str, String str2, long j) {
        A00(this, str).D6N(str, str2, j);
    }

    public final void D8K(String str) {
        A00(this, str).D8K(str);
    }

    public final void DBO(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DBO(str, str2);
    }

    public final void DHd(String str) {
        A00(this, str).DHd(str);
    }

    public final void DHe(String str) {
        A00(this, str).DHe(str);
    }

    public final void DKy(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DKy(str, str2);
    }

    public final void DKz(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DKz(str, str2);
    }

    public final void DL0(String str) {
        A00(this, str).DL0(str);
    }

    public final void DOq(String str) {
        A00(this, str).DOq(str);
    }

    public final void DOr(String str, String str2, String str3) {
        AnonymousClass7TG.A1T(str, str2, str3);
        this.A01.DOr(str, str2, str3);
    }

    public final void DRC(String str, boolean z, String str2) {
        DbY.A1S(str, str2);
        this.A01.DRC(str, z, str2);
    }

    public final void DY5(String str, String str2, int i) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DY5(str, str2, i);
    }

    public final void DZ5(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DZ5(str, str2);
    }

    public final void DZT(String str, boolean z) {
        A00(this, str).DZT(str, z);
    }

    public final void DbO(String str) {
        A00(this, str).DbO(str);
    }

    public final void DbP(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DbP(str, str2);
    }

    public final void DeC(RepostRestrictedReason repostRestrictedReason, String str, String str2, boolean z) {
        A00(this, str).DeC(repostRestrictedReason, str, str2, z);
    }

    public final void Dfl(String str) {
        A00(this, str).Dfl(str);
    }

    public final void DhC(String str, long j) {
        A00(this, str).DhC(str, j);
    }

    public final void Dhn(String str, String str2, String str3) {
        AnonymousClass7TG.A1T(str, str2, str3);
        this.A01.Dhn(str, str2, str3);
    }

    public final void DiK(String str) {
        A00(this, str).DiK(str);
    }

    public final void Djw(String str, String str2, String str3) {
        A00(this, str).Djw(str, str2, str3);
    }

    public final void Dk0(String str, String str2, String str3) {
        A00(this, str).Dk0(str, str2, str3);
    }

    public final void DqO(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DqO(str, str2);
    }

    public final void DqP(String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.DqP(str, str2, str3, str4);
    }

    public final void Ds1(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.Ds1(str, str2);
    }

    public final void Duf(String str, String str2, String str3) {
        A00(this, str).Duf(str, str2, str3);
    }

    public final void DvU(C299585vR r2, String str, int i) {
        DbY.A1S(str, r2);
        this.A01.DvU(r2, str, i);
    }

    public final void Dvh(String str) {
        A00(this, str).Dvh(str);
    }

    public final void E19(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.E19(str, str2);
    }
}
