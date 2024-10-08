package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Map;

/* renamed from: X.MdZ  reason: case insensitive filesystem */
public final class C66841MdZ extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    public static AnonymousClass7LE A01(Object obj, C66841MdZ mdZ) {
        0qQ.A0B(obj, 0);
        return (AnonymousClass7LE) mdZ.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66841MdZ(AnonymousClass7LE r2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7AO r12;
        AnonymousClass7AM r9;
        LayoutInflater layoutInflater;
        AnonymousClass7L2 r7;
        UserSession userSession;
        C232232tF r5;
        ViewGroup viewGroup = (ViewGroup) obj;
        switch (this.A00) {
            case 0:
                AnonymousClass7LE A012 = A01(viewGroup, this);
                AnonymousClass7AM A002 = AnonymousClass7LE.A00(A012);
                C232232tF A0L = C66583MXo.A0L(AnonymousClass7LE.A02(A012).A2D);
                LayoutInflater layoutInflater2 = A012.A02.A00;
                AnonymousClass7L2 A0V = C66583MXo.A0V(A012, A0L);
                C327367Am r4 = A002.A01;
                P62 p62 = new P62();
                P5S p5s = new P5S();
                AnonymousClass7AO A0T = C66583MXo.A0T(new C66836MdU(r4, 0), new C72399P4m(r4), p5s, p62);
                UserSession userSession2 = A002.A00;
                C332807Wl r2 = A002.A02;
                AnonymousClass9HC r1 = A002.A03;
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new AnonymousClass7AU(A0L.createViewHolder(viewGroup, layoutInflater2), A0L, userSession2, A0T, r2, r1, A0V);
            case 1:
                AnonymousClass7LE A013 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A013);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A013).A1J);
                layoutInflater = A013.A02.A00;
                r7 = C66583MXo.A0V(A013, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0Y();
                break;
            case 2:
                AnonymousClass7LE A014 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A014);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A014).A1N);
                layoutInflater = A014.A02.A00;
                r7 = C66583MXo.A0V(A014, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0c();
                break;
            case 3:
                AnonymousClass7LE A015 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A015);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A015).A1L);
                layoutInflater = A015.A02.A00;
                r7 = C66583MXo.A0V(A015, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0a();
                break;
            case 4:
                AnonymousClass7LE A016 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A016);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A016).A1M);
                layoutInflater = A016.A02.A00;
                r7 = C66583MXo.A0V(A016, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0b();
                break;
            case 5:
                AnonymousClass7LE A017 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A017);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A017).A1I);
                layoutInflater = A017.A02.A00;
                r7 = C66583MXo.A0V(A017, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0X();
                break;
            case 6:
                AnonymousClass7LE A018 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A018);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A018).A1H);
                layoutInflater = A018.A02.A00;
                r7 = C66583MXo.A0V(A018, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0W();
                break;
            case 7:
                AnonymousClass7LE A019 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A019);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A019).A2b);
                layoutInflater = A019.A02.A00;
                r7 = C66583MXo.A0V(A019, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0n();
                break;
            case 8:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r72 = (AnonymousClass7LE) this.A01;
                UserSession userSession3 = r72.A07;
                C68810NXu nXu = (C68810NXu) AnonymousClass7LE.A02(r72).A0M.getValue();
                C332807Wl r42 = r72.A0C;
                LayoutInflater layoutInflater3 = r72.A02.A00;
                AnonymousClass9HC r22 = r72.A03;
                AnonymousClass7L2 r13 = r72.A04;
                return new NX2(userSession3, nXu, r72.A0A, C66584MXp.A0L(layoutInflater3, viewGroup, nXu), r42, r22, r13);
            case 9:
                AnonymousClass7LE A0110 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0110);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0110).A2Z);
                layoutInflater = A0110.A02.A00;
                r7 = C66583MXo.A0V(A0110, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0m();
                break;
            case 10:
                AnonymousClass7LE A0111 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0111);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0111).A2e);
                layoutInflater = A0111.A02.A00;
                r7 = C66583MXo.A0V(A0111, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0q();
                break;
            case 11:
                AnonymousClass7LE A0112 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0112);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0112).A2Y);
                layoutInflater = A0112.A02.A00;
                r7 = C66583MXo.A0V(A0112, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0l();
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass7LE A0113 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0113);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0113).A2X);
                layoutInflater = A0113.A02.A00;
                r7 = C66583MXo.A0V(A0113, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0k();
                break;
            case 13:
                AnonymousClass7LE A0114 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0114);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0114).A2j);
                layoutInflater = A0114.A02.A00;
                r7 = C66583MXo.A0V(A0114, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0u();
                break;
            case 14:
                AnonymousClass7LE A0115 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0115);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0115).A2i);
                layoutInflater = A0115.A02.A00;
                r7 = C66583MXo.A0V(A0115, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0t();
                break;
            case 15:
                AnonymousClass7LE A0116 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0116);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0116).A2m);
                layoutInflater = A0116.A02.A00;
                r7 = C66583MXo.A0V(A0116, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0x();
                break;
            case 16:
                AnonymousClass7LE A0117 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0117);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0117).A2h);
                layoutInflater = A0117.A02.A00;
                r7 = C66583MXo.A0V(A0117, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0s();
                break;
            case 17:
                AnonymousClass7LE A0118 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0118);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0118).A2g);
                layoutInflater = A0118.A02.A00;
                r7 = C66583MXo.A0V(A0118, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0r();
                break;
            case 19:
                0qQ.A0B(viewGroup, 0);
                Md6 md6 = Md8.A05;
                AnonymousClass7LE r52 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater4 = r52.A02.A00;
                C332807Wl r3 = r52.A0C;
                return new Md8(layoutInflater4, viewGroup, r52.A07, r3, r52.A03, (AnonymousClass77Q) AnonymousClass7LE.A02(r52).A1G.getValue(), r52.A04);
            case 20:
                boolean A1Y = C66580MXl.A1Y(viewGroup);
                AnonymousClass7LE r14 = (AnonymousClass7LE) this.A01;
                C232232tF A0L2 = C66583MXo.A0L(AnonymousClass7LE.A02(r14).A1U);
                LayoutInflater layoutInflater5 = r14.A02.A00;
                0qQ.A0B(A0L2, A1Y ? 1 : 0);
                return new AnonymousClass7PK(new C67908Mwq(DbU.A0A(layoutInflater5, viewGroup, R.layout.thread_message_action_log, A1Y)), A0L2);
            case 21:
                AnonymousClass7LE A0119 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0119);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0119).A2k);
                layoutInflater = A0119.A02.A00;
                r7 = C66583MXo.A0V(A0119, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0v();
                break;
            case 22:
                AnonymousClass7LE A0120 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0120);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0120).A2l);
                layoutInflater = A0120.A02.A00;
                r7 = C66583MXo.A0V(A0120, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0w();
                break;
            case 23:
                AnonymousClass7LE A0121 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0121);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0121).A2d);
                layoutInflater = A0121.A02.A00;
                r7 = C66583MXo.A0V(A0121, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0p();
                break;
            case 24:
                AnonymousClass7LE A0122 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0122);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0122).A2c);
                layoutInflater = A0122.A02.A00;
                r7 = C66583MXo.A0V(A0122, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0o();
                break;
            case 25:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r15 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater6 = r15.A02.A00;
                C332807Wl r53 = r15.A0C;
                UserSession userSession4 = r15.A07;
                AnonymousClass7L2 r32 = r15.A04;
                return new NXO(layoutInflater6, viewGroup, C229382nI.A03(r15.A06, userSession4, (2el) null), userSession4, (AnonymousClass7RL) AnonymousClass7LE.A02(r15).A0N.getValue(), r53, r15.A03, r32);
            case 26:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r16 = (AnonymousClass7LE) this.A01;
                AnonymousClass7RU r23 = (AnonymousClass7RU) AnonymousClass7LE.A02(r16).A15.getValue();
                LayoutInflater layoutInflater7 = r16.A02.A00;
                0qQ.A0B(r23, 1);
                return new AnonymousClass7PK(r23.createViewHolder(layoutInflater7, viewGroup), r23);
            case 27:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r54 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater8 = r54.A02.A00;
                C332807Wl r33 = r54.A0C;
                return new NXW(layoutInflater8, viewGroup, r54.A07, r33, r54.A03, (NYA) AnonymousClass7LE.A02(r54).A0j.getValue(), r54.A04);
            case 28:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r55 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater9 = r55.A02.A00;
                C332807Wl r34 = r55.A0C;
                return new NX4(layoutInflater9, viewGroup, r55.A07, r34, r55.A03, (AnonymousClass7RH) AnonymousClass7LE.A02(r55).A0Q.getValue(), r55.A04);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r56 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater10 = r56.A02.A00;
                C332807Wl r35 = r56.A0C;
                return new NXM(layoutInflater10, viewGroup, r56.A07, r35, r56.A03, r56.A04, (AnonymousClass7RK) AnonymousClass7LE.A02(r56).A2T.getValue());
            case 30:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r6 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater11 = r6.A02.A00;
                C332807Wl r43 = r6.A0C;
                UserSession userSession5 = r6.A07;
                AnonymousClass7L2 r24 = r6.A04;
                return new NXC(layoutInflater11, viewGroup, userSession5, r43, r6.A03, (C68813NXx) AnonymousClass7LE.A02(r6).A1C.getValue(), r24, r6.A08.A00);
            case 31:
                AnonymousClass7LE A0123 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0123);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0123).A2B);
                layoutInflater = A0123.A02.A00;
                r7 = C66583MXo.A0V(A0123, r5);
                userSession = r9.A00;
                C327367Am r0 = r9.A01;
                P63 p63 = new P63();
                C3257674b A0U = C66583MXo.A0U(r0);
                r12 = C66583MXo.A0T(r0.A03, new C72400P4n(r0), A0U, p63);
                break;
            case 32:
                boolean A1Y2 = C66580MXl.A1Y(viewGroup);
                AnonymousClass7LE r25 = (AnonymousClass7LE) this.A01;
                AnonymousClass7RT r17 = (AnonymousClass7RT) AnonymousClass7LE.A02(r25).A1V.getValue();
                LayoutInflater layoutInflater12 = r25.A02.A00;
                0qQ.A0B(r17, A1Y2 ? 1 : 0);
                return new AnonymousClass7PK(r17.createViewHolder(layoutInflater12, viewGroup), r17);
            case 33:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r57 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater13 = r57.A02.A00;
                C332807Wl r36 = r57.A0C;
                return new NXE(layoutInflater13, viewGroup, r57.A07, r36, r57.A03, (NY0) AnonymousClass7LE.A02(r57).A1R.getValue(), r57.A04);
            case 34:
                AnonymousClass7LE A0124 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0124);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0124).A23);
                layoutInflater = A0124.A02.A00;
                r7 = C66583MXo.A0V(A0124, r5);
                userSession = r9.A00;
                r12 = r9.A01.A0d();
                break;
            case 35:
                AnonymousClass7LE A0125 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0125);
                r5 = (C232232tF) AnonymousClass7LE.A02(A0125).A1D.getValue();
                layoutInflater = A0125.A02.A00;
                Map map = A0125.A08.A00;
                r7 = A0125.A04;
                AnonymousClass7TF.A1C(r5, 0, map);
                userSession = r9.A00;
                C327367Am r44 = r9.A01;
                C72440P6b p6b = new C72440P6b();
                P5Y p5y = new P5Y();
                r12 = C66583MXo.A0T(new P4S(r44), new P53(map), p5y, p6b);
                break;
            case 36:
                AnonymousClass7LE A0126 = A01(viewGroup, this);
                return A00(A0126.A02.A00, viewGroup, A0126, AnonymousClass7LE.A02(A0126).A1c);
            case 37:
                AnonymousClass7LE A0127 = A01(viewGroup, this);
                return A00(A0127.A02.A00, viewGroup, A0127, AnonymousClass7LE.A02(A0127).A18);
            case 38:
                AnonymousClass7PO r18 = (AnonymousClass7PO) AnonymousClass7LE.A02(A01(viewGroup, this)).A1E.getValue();
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new AnonymousClass7PK(r18.A00(viewGroup), r18);
            case 39:
                AnonymousClass7LE A0128 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0128);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0128).A1o);
                layoutInflater = A0128.A02.A00;
                r7 = C66583MXo.A0V(A0128, r5);
                userSession = r9.A00;
                C327367Am r45 = r9.A01;
                P6L p6l = new P6L();
                AnonymousClass7B2 r26 = r45.A0B;
                r12 = C66583MXo.A0T(new P4Q(r45), new C72387P4a(), r26, p6l);
                break;
            case 40:
                AnonymousClass7LE A0129 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0129);
                r5 = C66583MXo.A0L(AnonymousClass7LE.A02(A0129).A1d);
                layoutInflater = A0129.A02.A00;
                r7 = C66583MXo.A0V(A0129, r5);
                userSession = r9.A00;
                C327367Am r46 = r9.A01;
                P6R p6r = new P6R();
                P5X p5x = new P5X();
                r12 = C66583MXo.A0T(new P4P(r46), new C72388P4b(), p5x, p6r);
                break;
            case Seq.NULL_REFNUM:
                AnonymousClass7LE A0130 = A01(viewGroup, this);
                r9 = AnonymousClass7LE.A00(A0130);
                r5 = (C232232tF) AnonymousClass7LE.A02(A0130).A1B.getValue();
                layoutInflater = A0130.A02.A00;
                Map map2 = A0130.A08.A00;
                r7 = A0130.A04;
                AnonymousClass7TF.A1C(r5, 0, map2);
                userSession = r9.A00;
                C327367Am r47 = r9.A01;
                P67 p67 = new P67();
                P5U p5u = new P5U();
                r12 = C66583MXo.A0T(new P4M(r47), new C72402P4p(map2), p5u, p67);
                break;
            case Seq.RefTracker.REF_OFFSET:
                AnonymousClass7LE A0131 = A01(viewGroup, this);
                LayoutInflater layoutInflater14 = A0131.A02.A00;
                AnonymousClass75O r132 = (AnonymousClass75O) AnonymousClass7LE.A02(A0131).A1e.getValue();
                C332807Wl r11 = A0131.A0C;
                UserSession userSession6 = A0131.A07;
                AnonymousClass7L2 r142 = A0131.A04;
                AnonymousClass9HC r122 = A0131.A03;
                Integer num = AnonymousClass05K.A0C;
                Map map3 = A0131.A08.A00;
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return new AnonymousClass75P(userSession6, r132.createViewHolder(layoutInflater14, viewGroup), r11, r122, r132, r142, 17h.A00(userSession6), num, map3);
            case 43:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r58 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater15 = r58.A02.A00;
                C332807Wl r37 = r58.A0C;
                return new NXT(layoutInflater15, viewGroup, r58.A07, r37, r58.A03, (NYD) AnonymousClass7LE.A02(r58).A1O.getValue(), r58.A04);
            case 44:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r62 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater16 = r62.A02.A00;
                C332807Wl r48 = r62.A0C;
                UserSession userSession7 = r62.A07;
                AnonymousClass7L2 r27 = r62.A04;
                return new NXU(layoutInflater16, viewGroup, userSession7, r62.A0A, r48, r62.A03, (NYE) AnonymousClass7LE.A02(r62).A1P.getValue(), r27);
            case 45:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r59 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater17 = r59.A02.A00;
                C332807Wl r38 = r59.A0C;
                return new NXS(layoutInflater17, viewGroup, r59.A07, r38, r59.A03, (AnonymousClass7RN) AnonymousClass7LE.A02(r59).A1h.getValue(), r59.A04);
            case 46:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r510 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater18 = r510.A02.A00;
                C332807Wl r39 = r510.A0C;
                return new NX9(layoutInflater18, viewGroup, r510.A07, r39, r510.A03, (AnonymousClass7RE) AnonymousClass7LE.A02(r510).A0v.getValue(), r510.A04);
            case 47:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r511 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater19 = r511.A02.A00;
                C332807Wl r310 = r511.A0C;
                return new NX1(layoutInflater19, viewGroup, r511.A07, (C3262375y) AnonymousClass7LE.A02(r511).A0C.getValue(), r310, r511.A03, r511.A04);
            case 48:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r512 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater20 = r512.A02.A00;
                C332807Wl r311 = r512.A0C;
                return new NXL(layoutInflater20, viewGroup, r512.A07, r311, r512.A03, (AnonymousClass7RJ) AnonymousClass7LE.A02(r512).A22.getValue(), r512.A04);
            default:
                DbS.A1W(viewGroup);
                AnonymousClass7LE r63 = (AnonymousClass7LE) this.A01;
                LayoutInflater layoutInflater21 = r63.A02.A00;
                C332807Wl r49 = r63.A0C;
                UserSession userSession8 = r63.A07;
                AnonymousClass7L2 r28 = r63.A04;
                return new NXF(layoutInflater21, viewGroup, userSession8, r63.A0A, r49, r63.A03, (C388849oU) AnonymousClass7LE.A02(r63).A1W.getValue(), r28);
        }
        C332807Wl r29 = r9.A02;
        AnonymousClass9HC r19 = r9.A03;
        int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new AnonymousClass7AU(r5.createViewHolder(viewGroup, layoutInflater), r5, userSession, r12, r29, r19, r7);
    }

    public static AnonymousClass75P A00(LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass7LE r12, AnonymousClass0eM r13) {
        AnonymousClass75O r5 = (AnonymousClass75O) r13.getValue();
        C332807Wl r3 = r12.A0C;
        UserSession userSession = r12.A07;
        AnonymousClass7L2 r6 = r12.A04;
        AnonymousClass9HC r4 = r12.A03;
        Integer num = AnonymousClass05K.A00;
        Map map = r12.A08.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new AnonymousClass75P(userSession, r5.createViewHolder(layoutInflater, viewGroup), r3, r4, r5, r6, 17h.A00(userSession), num, map);
    }
}
