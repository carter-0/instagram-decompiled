package X;

import com.instagram.user.model.User;
import java.util.Map;

public final class U91 extends 2YL {
    public boolean A00;
    public boolean A01;
    public final C52369GPq A02;
    public final C311716d8 A03;
    public final VX8 A04;
    public final L8S A05;
    public final C17970Vj6 A06;
    public final L5D A07;
    public final C17648Vbe A08;
    public final C18513VtC A09;
    public final C17278VPf A0A;
    public final C17805VgI A0B;
    public final C262224Cq A0C = 19E.A02(C318116oQ.A00(this).A00);
    public final 0V2 A0D;
    public final 05G A0E;
    public final C61770pa A0F;
    public final AnonymousClass0Ud A0G;

    public static final void A05(U91 u91, boolean z, boolean z2) {
        String str;
        String str2;
        UOK uok;
        if (z2) {
            Object value = u91.A0G.getValue();
            if (!(value instanceof UOK) || (uok = (UOK) value) == null || (str2 = uok.A03) == null || 00l.A0W(str2)) {
                str2 = null;
            }
            String A012 = A01(u91);
            if (A012 != null) {
                Map map = u91.A09.A04.A00;
                if (str2 != null) {
                    map.put(A012, str2);
                } else {
                    map.remove(A012);
                }
            }
        }
        05G r2 = u91.A0E;
        W2B w2b = W2B.A00;
        C20851X1d x1d = (C20851X1d) u91.A04.A02.getValue();
        C17278VPf vPf = u91.A0A;
        C311716d8 r5 = u91.A03;
        C17805VgI vgI = u91.A0B;
        C18513VtC vtC = u91.A09;
        String A013 = A01(u91);
        if (A013 != null) {
            str = DbT.A11(A013, vtC.A04.A00);
        } else {
            str = null;
        }
        r2.Epw(w2b.A03(r5, x1d, vtC, vPf, vgI, str));
        AnonymousClass7TE.A1Z(new MGB(u91, (AnonymousClass4D7) null, 4, z), C318116oQ.A00(u91));
    }

    public static final UOF A00(U91 u91) {
        C20851X1d x1d = (C20851X1d) u91.A04.A02.getValue();
        if (x1d instanceof UOF) {
            return (UOF) x1d;
        }
        return null;
    }

    public static final String A01(U91 u91) {
        UOF uof;
        C255773uh r0;
        1Xj r02;
        C20851X1d x1d = (C20851X1d) u91.A04.A02.getValue();
        if (!(x1d instanceof UOF) || (uof = (UOF) x1d) == null || (r0 = uof.A01) == null || (r02 = r0.A0b) == null) {
            return null;
        }
        return r02.getId();
    }

    public static final void A02(U91 u91) {
        String str;
        Integer num;
        User user;
        UOK uok;
        UOF A002;
        User A003;
        UOF A004;
        1Xj r3;
        String A012;
        U91 u912 = u91;
        C17805VgI vgI = u912.A0B;
        String str2 = "";
        if (!vgI.A00() || (A012 = A01(u912)) == null || (str = DbT.A11(A012, u912.A09.A04.A00)) == null) {
            str = str2;
        }
        05G r5 = u912.A0E;
        C20851X1d x1d = (C20851X1d) u912.A04.A02.getValue();
        if (!(x1d instanceof UOF)) {
            num = AnonymousClass05K.A00;
        } else {
            if (W2B.A02(u912.A09, u912.A0A, C17103VHz.A00((UOF) x1d))) {
                num = AnonymousClass05K.A0C;
            } else {
                if (182.A06(0Tu.A05, vgI.A00, 36320725946082081L)) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A01;
                }
            }
        }
        UOF A005 = A00(u912);
        if (A005 != null) {
            user = C17103VHz.A00(A005);
        } else {
            user = null;
        }
        boolean z = true;
        r5.Epw(new UOK(W2B.A00(u912.A03, u912.A0A, user, (String) null, false, false), C19664WdS.A00, num, str, !00l.A0W(str)));
        C17970Vj6 vj6 = u912.A06;
        if (str.length() != 0) {
            z = false;
        }
        vj6.A00(z);
        vj6.A01(false);
        C318136oS A006 = C318116oQ.A00(u912);
        MG5 mg5 = new MG5(u912, (AnonymousClass4D7) null, 36);
        19B r6 = 19B.A00;
        1Eo.A05(r6, mg5, A006);
        Object value = u912.A0G.getValue();
        String str3 = null;
        if ((value instanceof UOK) && (uok = (UOK) value) != null && (A002 = A00(u912)) != null && (A003 = C17103VHz.A00(A002)) != null) {
            C317986oA r10 = vgI.A01;
            if (A003.CQp(r10)) {
                C52369GPq.A03(u912.A02, C51972G9s.A0h(A003), AnonymousClass000.A00(4058));
            }
            if (A003.CQp(r10)) {
                if (182.A06(0Tu.A05, vgI.A00, 36323736718683578L)) {
                    u912.A00 = true;
                    User A007 = C17103VHz.A00(A002);
                    if (A007 != null) {
                        str2 = A007.B8Q();
                    }
                    User A008 = C17103VHz.A00(A002);
                    if (A008 != null) {
                        str3 = A008.getId();
                    }
                    UOI uoi = new UOI(str2, str3);
                    C20852X1e x1e = uok.A00;
                    String str4 = uok.A03;
                    Integer num2 = uok.A02;
                    boolean z2 = uok.A04;
                    AnonymousClass7TG.A1T(x1e, str4, num2);
                    r5.Epw(new UOK(x1e, uoi, num2, str4, z2));
                    return;
                }
            }
            if (182.A06(0Tu.A05, vgI.A00, 36323758193389006L) && (A004 = A00(u912)) != null && (r3 = A004.A01.A0b) != null) {
                1Eo.A05(r6, new MGD(r3, u912, (AnonymousClass4D7) null, 3), C318116oQ.A00(u912));
            }
        }
    }

    public static final void A03(U91 u91) {
        UOJ uoj;
        Object value = u91.A0G.getValue();
        if ((value instanceof UOJ) && (uoj = (UOJ) value) != null) {
            05G r1 = u91.A0E;
            UOK uok = uoj.A00;
            r1.Epw(uok);
            u91.A06.A00(AnonymousClass7TF.A1Q(uok.A03.length()));
            C13991Tnr.A1K(u91, C318116oQ.A00(u91), 37);
        }
    }

    public static final void A04(U91 u91) {
        UOK uok;
        Object value = u91.A0G.getValue();
        if ((value instanceof UOK) && (uok = (UOK) value) != null) {
            u91.A0E.Epw(new UOJ(uok));
        }
    }

    public U91(C52369GPq gPq, C311716d8 r8, VX8 vx8, L8S l8s, C17970Vj6 vj6, L5D l5d, C17648Vbe vbe, C18513VtC vtC, C17278VPf vPf, C17805VgI vgI) {
        AnonymousClass7TG.A1U(vx8, l8s, vj6);
        0qQ.A0B(l5d, 5);
        this.A04 = vx8;
        this.A05 = l8s;
        this.A06 = vj6;
        this.A0A = vPf;
        this.A07 = l5d;
        this.A09 = vtC;
        this.A0B = vgI;
        this.A03 = r8;
        this.A08 = vbe;
        this.A02 = gPq;
        C19662WdQ wdQ = C19662WdQ.A00;
        Integer num = AnonymousClass05K.A00;
        02z r0 = new 02z(new UOL(wdQ, num, false));
        this.A0E = r0;
        this.A0G = 10b.A03(r0);
        05D A012 = 10D.A01(num, 0, 0);
        this.A0D = A012;
        this.A0F = new 0V1((C262204Co) null, A012);
        C318136oS A002 = C318116oQ.A00(this);
        MG5 mg5 = new MG5(this, (AnonymousClass4D7) null, 32);
        19B r3 = 19B.A00;
        1Eo.A03(num, r3, mg5, A002);
        1Eo.A03(num, r3, new MG5(this, (AnonymousClass4D7) null, 33), C318116oQ.A00(this));
        1Eo.A03(num, r3, new MG5(this, (AnonymousClass4D7) null, 34), C318116oQ.A00(this));
    }
}
