package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Map;

public final class P27 implements C333517Zg {
    public PAS A00;
    public final 1a8 A01 = C66580MXl.A0O();
    public final UserSession A02;
    public final C40486Acv A03;
    public final C331507Rg A04;
    public final PCQ A05;
    public final AnonymousClass7ZA A06;
    public final 1aV A07;
    public final C333547Zj A08;
    public final AnonymousClass7Z7 A09;

    public final boolean AH1(C376179Gx r2) {
        0qQ.A0B(r2, 0);
        return this.A04.A0B.A00(r2);
    }

    public final boolean CXI(String str) {
        return false;
    }

    public final void Clq(C254793t3 r7, int i) {
        C254763t0 r5 = (C254763t0) this.A05.A04.A0X();
        if (r5 != null) {
            AnonymousClass3U9 A0a = C66581MXm.A0a(1bJ.A00(this.A02), r5.A00);
            C376509Ig r4 = null;
            if (A0a != null) {
                C254703su BLG = A0a.BLG();
                C254703su BLT = A0a.BLT();
                if (BLG == null) {
                    if (BLT != null) {
                        BLG = BLT;
                    }
                }
                if (BLG.A0g() == null) {
                    0wb.A04("mark_message_seen_without_id", 002.A0R("The received message to be marked seen does not have an ID. authorId = ", BLG.A1u), 1);
                } else {
                    r4 = new C376509Ig(BLG, BLT);
                }
            }
            this.A06.Cm2(r4, new C69042Ndc(r5, C300965yF.A03(r7)), false);
            return;
        }
        this.A06.Cm2((C376509Ig) null, r7, false);
    }

    public final void FKo(OG0 og0, String str) {
        0qQ.A0B(str, 0);
        C330437Mt r0 = this.A05.A09;
        if (r0 != null) {
            r0.A06 = str;
            r0.A04 = og0;
        }
    }

    public final void A8Y(Map map) {
        map.put("direct_thread_view_infra_type", "msys");
        if (C308556Us.A08(this.A02, this.A04.C6Q())) {
            map.put("is_dmm_enabled", "yes");
        }
    }

    public final C333457Za AkC() {
        return this.A00;
    }

    public final 2Er Api() {
        C254743sy AfV;
        C331507Rg r3 = this.A04;
        if (!r3.CdE() || (AfV = r3.AfV()) == null) {
            return null;
        }
        AnonymousClass7SD C6Q = r3.C6Q();
        0qQ.A0B(C6Q, 0);
        return new C72584PBp(C6Q, AfV);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7S9 AvL() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ C333437Yy BCh() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7ZY BSN() {
        return this.A00;
    }

    public final AnonymousClass7LQ Bjv(String str) {
        AnonymousClass7LQ BSO = this.A05.BSO(str);
        if (BSO != null) {
            return BSO;
        }
        return null;
    }

    public final C333547Zj BsD() {
        return this.A08;
    }

    public final AnonymousClass7Z7 BsE() {
        return this.A09;
    }

    public final AnonymousClass7ZA C62() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7S7 C6l() {
        return this.A04;
    }

    public final void CLb(String str) {
        C331547Rk r0;
        C232262tL r1 = (C232262tL) this.A00.A0D.get(str);
        if ((r1 instanceof C328627Fn) && (r0 = ((C328627Fn) r1).ApX().A0G) != null && r0.A07) {
            PCQ pcq = this.A05;
            C46539Dgg dgg = new C46539Dgg((String) null, (String) null, 3, 3, pcq.A0G);
            ON0 on0 = pcq.A0D;
            AnonymousClass7L2 r02 = (AnonymousClass7L2) pcq.A05.A0X();
            if (r02 == null) {
                r02 = PCQ.A00(AnonymousClass6BI.A0D, pcq);
            }
            on0.A01(dgg, r02);
            PCQ.A02(pcq);
        }
    }

    public final boolean CXH(String str) {
        AnonymousClass7LQ BSO = this.A05.BSO(str);
        if (BSO == null || !BSO.A0e.A1S()) {
            return false;
        }
        return true;
    }

    public final boolean CXK(String str) {
        return AnonymousClass7TF.A1V(this.A05.BSO(str));
    }

    public final 1aU E48(MessageIdentifier messageIdentifier) {
        1aU A092;
        C61063Jw1 jw1;
        1iA r4;
        1iA r42;
        1aU A022;
        int i;
        String str = messageIdentifier.A01;
        AnonymousClass7LQ Bjv = Bjv(str);
        if (Bjv != null) {
            C254703su r3 = Bjv.A0e;
            0qQ.A07(r3);
            2FW r2 = r3.A10;
            0qQ.A07(r2);
            return 1aU.A09(new PAP(r3, r2, r3.A0W()));
        }
        PAS pas = this.A00;
        C232262tL A012 = pas.A01(messageIdentifier);
        if (A012 instanceof C328627Fn) {
            AnonymousClass7FW Aqp = ((C328627Fn) A012).Aqp();
            if (Aqp instanceof C66809Mcv) {
                C66809Mcv mcv = (C66809Mcv) Aqp;
                AnonymousClass77B r1 = mcv.A06;
                r1.A00();
                if (mcv.A0H) {
                    r42 = 1iA.A0a;
                } else {
                    r42 = 1iA.A0Q;
                }
                A022 = r1.A00();
                i = 37;
            } else if ((Aqp instanceof C68819NYd) && (jw1 = ((C68819NYd) Aqp).A01.A01) != null) {
                C74552Pwl pwl = (C74552Pwl) jw1.A03;
                int i2 = jw1.A01;
                Long Acs = pwl.Acs(i2);
                String Acp = pwl.Acp(i2);
                Integer Acu = pwl.Acu(i2);
                if (!(Acs == null || Acp == null || Acu == null)) {
                    Uri A002 = OXF.A00(Acp, (String) null, Acs.longValue());
                    if (Acu.intValue() == 4) {
                        r4 = 1iA.A0a;
                    } else {
                        r4 = 1iA.A0Q;
                    }
                    A022 = C66594MYg.A03.A02(pas.A07, AnonymousClass61K.MESSAGE_STORE).A01.A02(A002.toString());
                    i = 38;
                }
            }
            A092 = C72120Owf.A00(A022, r42, i);
            return A092.A0L(C72081Ovu.A00);
        }
        A092 = 1aU.A09(C72176Oxl.A01(002.A0u("can not find media content by id ", str, " ", messageIdentifier.A00())));
        return A092.A0L(C72081Ovu.A00);
    }

    public final String EJL(String str) {
        C331547Rk r0;
        String str2 = str;
        C232262tL r1 = (C232262tL) this.A00.A0D.get(str);
        if (!(r1 instanceof C328627Fn) || (r0 = ((C328627Fn) r1).ApX().A0G) == null || !r0.A07) {
            return null;
        }
        PCQ pcq = this.A05;
        C46539Dgg dgg = new C46539Dgg((String) null, str2, 1, 3, pcq.A0G);
        ON0 on0 = pcq.A0D;
        AnonymousClass7L2 r02 = (AnonymousClass7L2) pcq.A05.A0X();
        if (r02 == null) {
            r02 = PCQ.A00(AnonymousClass6BI.A0D, pcq);
        }
        on0.A01(dgg, r02);
        PCQ.A02(pcq);
        return null;
    }

    public final void onCreate() {
        C331507Rg r5 = this.A04;
        1aU A032 = this.A05.A03();
        1a8 r4 = r5.A0A;
        r4.A02(C66581MXm.A0L(C72086Ovz.A00, A032), r5.A02);
        r4.A02(C66581MXm.A0L(C72087Ow0.A00, A032), r5.A01);
        1aU A0L = A032.A0L(C72088Ow1.A00);
        0eP A1L = AnonymousClass7TE.A1L(0sn.A00, new OKP());
        OuU ouU = new OuU((0sL) C74199Pqf.A00, 1);
        PU8.A00(C72120Owf.A03(new 1aU(new XQN(new C21099XEn(ouU), A0L.A00, new C73439Pch(A1L))), C74047PoC.A00, 22), r4, r5, 23);
        1aU A0L2 = C66581MXm.A0L(C72089Ow2.A00, C66789Mca.A00(A032, C74048PoD.A00, 1));
        AnonymousClass1aS r7 = r5.A07;
        r4.A02(A0L2, r7);
        PU8.A00(C66789Mca.A00(A032, C74049PoE.A00, 1).A0L(C72082Ovv.A00), r4, r5, 20);
        1aU A0L3 = C66581MXm.A0L(C72083Ovw.A00, r7);
        AnonymousClass1aS r2 = r5.A08;
        r4.A02(A0L3, r2);
        r4.A02(C66581MXm.A0L(C72084Ovx.A00, r7), r5.A06);
        PU8.A00(r2, r4, r5, 21);
        r4.A02(C66581MXm.A0L(C72085Ovy.A00, C66789Mca.A00(r2, C74046PoB.A00, 1)), r5.A09);
        PU8.A00(r2, r4, r5, 22);
    }

    public final void onDestroy() {
        this.A04.A0A.A01();
    }

    public P27(UserSession userSession, C40486Acv acv, C331507Rg r4, PAS pas, PCQ pcq, AnonymousClass7ZA r7, C333547Zj r8, AnonymousClass7Z7 r9, 1aV r10) {
        C51972G9s.A1D(r8, r9);
        0qQ.A0B(r10, 9);
        this.A02 = userSession;
        this.A05 = pcq;
        this.A08 = r8;
        this.A09 = r9;
        this.A04 = r4;
        this.A06 = r7;
        this.A00 = pas;
        this.A03 = acv;
        this.A07 = r10;
    }

    public final boolean CYZ(String str) {
        return AnonymousClass7TF.A1V(Bjv(str));
    }

    public final C69668Npq E4G(String str) {
        C254743sy A052;
        AnonymousClass7LQ Bjv = Bjv(str);
        if (Bjv != null) {
            C254793t3 r0 = Bjv.A0G.A0P;
            if (r0 == null || (A052 = C300965yF.A05(r0)) == null) {
                return null;
            }
            C254703su r02 = Bjv.A0e;
            0qQ.A07(r02);
            return new C68965Nbs(r02, A052);
        }
        Long A10 = AnonymousClass7TE.A10(str);
        if (A10 != null) {
            long longValue = A10.longValue();
            C254743sy AfV = this.A04.AfV();
            if (AfV != null) {
                return new C68964Nbr(AfV, longValue);
            }
            return null;
        }
        0wb.A03("MsysClientInfra", 002.A0R("msys unsend message failed with ", str));
        return null;
    }
}
