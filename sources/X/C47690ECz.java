package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.ECz  reason: case insensitive filesystem */
public final class C47690ECz extends 1P0 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C47690ECz(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onFail(C268654dm r12) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1134734777);
                C47690ECz.super.onFail(r12);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A01;
                C59689JTv.A05(supportServiceEditUrlFragment.getContext());
                supportServiceEditUrlFragment.A00.setDisplayedChild(0);
                String A0b = Dbb.A0b(r12);
                C49935FFo fFo = supportServiceEditUrlFragment.A02;
                String str2 = supportServiceEditUrlFragment.A07;
                boolean z = supportServiceEditUrlFragment.A0C;
                String str3 = supportServiceEditUrlFragment.A05;
                String str4 = supportServiceEditUrlFragment.A0B;
                String str5 = this.A02;
                DbZ.A0t(0, str2, str3, str4);
                0Aj A002 = C49935FFo.A00(fFo);
                DbS.A1H(A002, "validate_url");
                DbS.A1J(A002, "error");
                C49935FFo.A01(A002, fFo, str2, str3, z);
                Dba.A1A(A002, str4, str5);
                A002.AAJ("error_message", A0b);
                A002.Cgf();
                i2 = 1065790835;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-456097780);
                C47690ECz.super.onFail(r12);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment2 = (SupportServiceEditUrlFragment) this.A01;
                supportServiceEditUrlFragment2.A04.dismiss();
                C59689JTv.A05(supportServiceEditUrlFragment2.getContext());
                String A0b2 = Dbb.A0b(r12);
                C49935FFo fFo2 = supportServiceEditUrlFragment2.A02;
                String str6 = supportServiceEditUrlFragment2.A07;
                boolean z2 = supportServiceEditUrlFragment2.A0C;
                String str7 = supportServiceEditUrlFragment2.A05;
                String str8 = supportServiceEditUrlFragment2.A0B;
                String str9 = this.A02;
                0qQ.A0B(str6, 0);
                AnonymousClass7TG.A0w(2, str7, str8, str9);
                0Aj A003 = C49935FFo.A00(fFo2);
                DbS.A1H(A003, "flow_update_info");
                DbS.A1J(A003, "error");
                C49935FFo.A01(A003, fFo2, str6, str7, z2);
                Dba.A1A(A003, str8, str9);
                A003.AAJ("error_message", A0b2);
                A003.Cgf();
                i2 = 1666279192;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1502546608);
                C47690ECz.super.onFail(r12);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment3 = (SupportServiceEditUrlFragment) this.A01;
                C59689JTv.A05(supportServiceEditUrlFragment3.getContext());
                String A0b3 = Dbb.A0b(r12);
                C49935FFo fFo3 = supportServiceEditUrlFragment3.A02;
                String str10 = supportServiceEditUrlFragment3.A07;
                String str11 = supportServiceEditUrlFragment3.A05;
                String str12 = supportServiceEditUrlFragment3.A0B;
                String str13 = this.A02;
                DbZ.A0t(1, str11, str12, str13);
                0Aj A004 = C49935FFo.A00(fFo3);
                DbS.A1H(A004, "update_action_button");
                DbS.A1J(A004, "error");
                C49935FFo.A01(A004, fFo3, str10, str11, true);
                Dba.A1A(A004, str12, str13);
                A004.AAJ("error_message", A0b3);
                A004.AAJ("button_label", (String) null);
                A004.Cgf();
                i2 = -53834350;
                break;
            case 3:
                int A03 = AnonymousClass0fD.A03(-46868211);
                C47528E6o e6o = (C47528E6o) this.A01;
                E9N e9n = e6o.A03;
                if (e9n == null) {
                    0qQ.A0F("userListAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                e9n.A0C = false;
                e9n.A04 = new C50988Fmb(e6o, (User) null, (List) null);
                e9n.A0A = true;
                e9n.A03();
                AnonymousClass0fD.A0A(733234876, A03);
                return;
            case 4:
                i = AnonymousClass0fD.A03(-2049585601);
                C59689JTv.A01(DbT.A07(((FPG) this.A01).A01), "save_gender_failed", 2131972232, 1);
                i2 = -1436725543;
                break;
            case 5:
                i = AnonymousClass7TG.A0D(r12, -904967511);
                E31 e31 = (E31) this.A01;
                FragmentActivity activity = e31.getActivity();
                if (activity != null) {
                    E31.A00(C310346aq.ERROR, AnonymousClass7TE.A16(activity, 2131974093), "multiple_links_create_or_edit_bio_link_request_failed");
                }
                AnonymousClass0eM r2 = e31.A07;
                C322326ve r1 = (C322326ve) r2.getValue();
                Throwable A012 = r12.A01();
                if (A012 == null || (str = A012.getMessage()) == null) {
                    str = "";
                }
                r1.A02(str);
                Dbb.A1W(r2);
                i2 = 114658835;
                break;
            case 6:
                i = AnonymousClass7TG.A0D(r12, 129477012);
                C49952FGh.A02(((C50882Fk0) this.A01).A00, r12);
                i2 = -332978526;
                break;
            case 7:
                i = AnonymousClass7TG.A0D(r12, 753976865);
                C49952FGh.A02(((C50882Fk0) this.A01).A00, r12);
                i2 = -78980553;
                break;
            case 8:
                i = AnonymousClass7TG.A0D(r12, 1836055457);
                Throwable A013 = r12.A01();
                0qQ.A0C(A013, C273654mx.A00(853));
                ((C365498nD) this.A01).A00((Exception) A013);
                i2 = 1259258072;
                break;
            case 9:
                i = AnonymousClass7TG.A0D(r12, -1900276150);
                C47690ECz.super.onFail(r12);
                ESH esh = (ESH) this.A01;
                ESH.A08(esh, new C58694Iw3(this.A02, esh, 14));
                i2 = -11498267;
                break;
            default:
                C47690ECz.super.onFail(r12);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 2:
                i = AnonymousClass0fD.A03(-1861450274);
                ((SupportServiceEditUrlFragment) this.A01).A04.dismiss();
                i2 = -177346414;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-218139780);
                FPG fpg = (FPG) this.A01;
                ((2da) fpg.A02).EVS(true);
                Dbb.A0x((Fragment) fpg.A01);
                i2 = 83152566;
                break;
            case 5:
                i = AnonymousClass0fD.A03(450148298);
                FragmentActivity A0E = DbZ.A0E(this.A01);
                if (A0E != null) {
                    Dba.A0m(A0E, 2dZ.A0t);
                }
                i2 = 1286582868;
                break;
            default:
                C47690ECz.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1390452464);
                AnonymousClass0fN.A00(((SupportServiceEditUrlFragment) this.A01).A04);
                i2 = 416770329;
                break;
            case 3:
                int A03 = AnonymousClass0fD.A03(-194906214);
                E9N e9n = ((C47528E6o) this.A01).A03;
                if (e9n == null) {
                    0qQ.A0F("userListAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                e9n.A0C = true;
                e9n.A03();
                AnonymousClass0fD.A0A(660876699, A03);
                return;
            case 4:
                i = AnonymousClass0fD.A03(-1879180014);
                FPG fpg = (FPG) this.A01;
                ((2da) fpg.A02).EVS(false);
                Dbb.A0y((Fragment) fpg.A01);
                i2 = 816742932;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1670785859);
                FragmentActivity A0E = DbZ.A0E(this.A01);
                if (A0E != null) {
                    Dba.A0n(A0E, 2dZ.A0t);
                }
                i2 = 1535595782;
                break;
            case 10:
                i = AnonymousClass0fD.A03(-85546160);
                1Au.A00((UserSession) this.A01).A15(this.A02, false, true, false);
                i2 = 1215443295;
                break;
            default:
                C47690ECz.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x045b, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x045e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0305, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0308, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x03d6;
                case 1: goto L_0x0247;
                case 2: goto L_0x0476;
                case 3: goto L_0x00c9;
                case 4: goto L_0x01be;
                case 5: goto L_0x0169;
                case 6: goto L_0x011e;
                case 7: goto L_0x0099;
                case 8: goto L_0x0078;
                case 9: goto L_0x0035;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 252670805(0xf0f7355, float:7.0726565E-30)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = -631911693(0xffffffffda55caf3, float:-1.50443288E16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r14, r3)
            X.C47690ECz.super.onSuccess(r14)
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r2 = X.1Au.A00(r0)
            java.lang.String r1 = r13.A02
            r0 = 1
            r2.A15(r1, r0, r3, r3)
            r0 = 1753775374(0x68887d0e, float:5.1563895E24)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -819526653(0xffffffffcf270403, float:-2.80205798E9)
        L_0x0031:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0035:
            r0 = -795007798(0xffffffffd09d24ca, float:-2.10914714E10)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.371 r14 = (X.AnonymousClass371) r14
            r0 = -1868929561(0xffffffff909a65e7, float:-6.0899295E-29)
            int r3 = X.AnonymousClass7TG.A0D(r14, r0)
            X.C47690ECz.super.onSuccess(r14)
            java.lang.Object r1 = r13.A01
            X.ESH r1 = (X.ESH) r1
            X.Dc2 r0 = r1.A00
            if (r0 == 0) goto L_0x0056
            X.DbX.A1R(r0)
            r0 = 0
            r1.A00 = r0
        L_0x0056:
            java.lang.Object r0 = r14.FH3()
            X.EtB r0 = (X.EtB) r0
            com.instagram.user.model.User r2 = r0.A00
            X.0eM r1 = r1.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.DbT.A1S(r0, r2)
            X.0lg r0 = X.DbT.A0X(r1)
            r2.A0d(r0)
            r0 = -1694506337(0xffffffff9affe29f, float:-1.05831654E-22)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1717448012(0xffffffff99a1d2b4, float:-1.6732112E-23)
            goto L_0x0031
        L_0x0078:
            r0 = -1432569202(0xffffffffaa9cba8e, float:-2.7840615E-13)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = 1082155825(0x40806331, float:4.0121083)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            X.8nD r1 = (X.C365498nD) r1
            java.lang.String r0 = r13.A02
            r1.A01(r0)
            r0 = 263668290(0xfb74242, float:1.8070715E-29)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -965380257(0xffffffffc675775f, float:-15709.843)
            goto L_0x0031
        L_0x0099:
            r0 = -2012840003(0xffffffff88067fbd, float:-4.0474314E-34)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.DwW r14 = (X.DwW) r14
            r0 = -1516800837(0xffffffffa59774bb, float:-2.6273424E-16)
            int r6 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r4 = r13.A01
            X.Fk0 r4 = (X.C50882Fk0) r4
            java.lang.String r3 = r13.A02
            X.FBN r2 = r14.A00
            X.0qQ.A07(r2)
            android.os.Handler r1 = r4.A01
            X.Fup r0 = new X.Fup
            r0.<init>(r2, r4, r3)
            r1.post(r0)
            r0 = 1541088746(0x5bdb25ea, float:1.23369414E17)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1327868882(0x4f25abd2, float:2.77950106E9)
            goto L_0x0031
        L_0x00c9:
            r0 = 1992256396(0x76bf6b8c, float:1.9412305E33)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Nfd r14 = (X.C69154Nfd) r14
            r0 = -1056287927(0xffffffffc10a5349, float:-8.645333)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r14, r3)
            java.lang.Object r2 = r13.A01
            X.E6o r2 = (X.C47528E6o) r2
            X.E9N r1 = r2.A03
            java.lang.String r0 = "userListAdapter"
            if (r1 == 0) goto L_0x00ef
            r1.A0C = r3
            X.Fku r0 = r2.A01
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "searchBarController"
        L_0x00ef:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f7:
            java.lang.String r0 = r0.A01
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0113
            java.util.List r0 = r14.A01
            if (r0 != 0) goto L_0x0105
            X.0sn r0 = X.0sn.A00
        L_0x0105:
            r1.A05(r0)
            X.3Ar r0 = r2.getScrollingViewProxy()
            r0.EKn(r3)
            java.lang.String r0 = r13.A02
            r2.A04 = r0
        L_0x0113:
            r0 = 1834194077(0x6d53949d, float:4.0925625E27)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -454151018(0xffffffffe4ee3496, float:-3.5152914E22)
            goto L_0x0031
        L_0x011e:
            r0 = -1047059502(0xffffffffc19723d2, float:-18.89249)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dvd r14 = (X.C47343Dvd) r14
            r0 = 803765465(0x2fe87cd9, float:4.2289264E-10)
            int r6 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Integer r1 = r14.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x014f
            java.lang.Object r0 = r13.A01
            X.Fk0 r0 = (X.C50882Fk0) r0
            android.content.Context r1 = r0.A00
            r0 = 2131969392(0x7f134570, float:1.9575706E38)
            java.lang.String r0 = r1.getString(r0)
            X.Dba.A0r(r1, r0)
        L_0x0144:
            r0 = -1892232673(0xffffffff8f36d21f, float:-9.013761E-30)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -985474177(0xffffffffc542db7f, float:-3117.7185)
            goto L_0x0305
        L_0x014f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0144
            java.lang.Object r5 = r13.A01
            X.Fk0 r5 = (X.C50882Fk0) r5
            java.lang.String r3 = r13.A02
            X.FBN r2 = r14.A00
            X.0qQ.A07(r2)
            android.os.Handler r1 = r5.A01
            X.Fup r0 = new X.Fup
            r0.<init>(r2, r5, r3)
            r1.post(r0)
            goto L_0x0144
        L_0x0169:
            r0 = -1709734960(0xffffffff9a1783d0, float:-3.1332545E-23)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DvQ r14 = (X.DvQ) r14
            r0 = 1748117801(0x68322929, float:3.365362E24)
            int r3 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r6 = r13.A01
            X.E31 r6 = (X.E31) r6
            androidx.fragment.app.FragmentActivity r5 = r6.getActivity()
            if (r5 == 0) goto L_0x019b
            java.lang.String r1 = r13.A02
            r0 = 2131970020(0x7f1347e4, float:1.957698E38)
            if (r1 != 0) goto L_0x018d
            r0 = 2131970016(0x7f1347e0, float:1.9576971E38)
        L_0x018d:
            java.lang.String r2 = X.AnonymousClass7TE.A16(r5, r0)
            X.6aq r1 = X.C310346aq.DEFAULT
            java.lang.String r0 = ""
            X.E31.A00(r1, r2, r0)
            r5.onBackPressed()
        L_0x019b:
            X.0eM r0 = r6.A08
            java.lang.Object r2 = r0.getValue()
            X.1Ng r2 = (X.1Ng) r2
            X.0eM r0 = r6.A09
            java.lang.String r1 = X.DbU.A0u(r0)
            com.instagram.user.model.User r0 = r14.A00
            X.C50278FWj.A00(r2, r0, r1)
            X.0eM r0 = r6.A07
            X.Dbb.A1W(r0)
            r0 = 619828742(0x24f1d606, float:1.0487966E-16)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1164319350(0xffffffffba99e58a, float:-0.0011741382)
            goto L_0x0305
        L_0x01be:
            r0 = -537451969(0xffffffffdff7223f, float:-3.561573E19)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -69968416(0xfffffffffbd45de0, float:-2.2053419E36)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            X.FPG r0 = (X.FPG) r0
            java.lang.Object r6 = r0.A01
            X.E70 r6 = (X.E70) r6
            com.instagram.common.session.UserSession r5 = r6.getSession()
            X.0Tu r4 = X.0Tu.A05
            r0 = 36327417505135011(0x810f98000039a3, double:3.036943336791968E-306)
            boolean r1 = X.182.A06(r4, r5, r0)
            com.instagram.common.session.UserSession r0 = r6.getSession()
            X.0eE r5 = X.AnonymousClass0t1.A01
            X.4Cl r0 = X.DbS.A0h(r0, r5)
            java.lang.Boolean r0 = r0.CYd()
            boolean r4 = X.AnonymousClass7TG.A1X(r0)
            if (r1 == 0) goto L_0x022c
            java.lang.Integer r1 = r6.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x022c
            if (r4 != 0) goto L_0x022c
            java.lang.String r0 = r13.A02
            r1 = 0
            X.Du1 r7 = new X.Du1
            r7.<init>(r0, r6, r1)
            com.instagram.common.session.UserSession r0 = r6.getSession()
            X.0qQ.A0B(r0, r1)
            X.OJO r5 = X.C69714Nqa.A00(r0)
            androidx.fragment.app.FragmentActivity r6 = r6.requireActivity()
            java.lang.String r8 = "custom_gender_consent"
            java.lang.String r9 = "edit_profile"
            r10 = 0
            java.lang.String r12 = "{}"
            r11 = r10
            r5.A00(r6, r7, r8, r9, r10, r11, r12)
        L_0x0221:
            r0 = -780113499(0xffffffffd18069a5, float:-6.8941029E10)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 420502102(0x19105a56, float:7.462869E-24)
            goto L_0x045b
        L_0x022c:
            java.lang.String r0 = r13.A02
            X.E70.A01(r6, r0)
            X.DbX.A1J(r6)
            com.instagram.common.session.UserSession r0 = r6.getSession()
            com.instagram.user.model.User r1 = r5.A01(r0)
            r0 = 0
            X.4Cl r1 = r1.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Eep(r0)
            goto L_0x0221
        L_0x0247:
            r0 = -90128840(0xfffffffffaa0be38, float:-4.173128E35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dv2 r14 = (X.C47335Dv2) r14
            r0 = -667071555(0xffffffffd83d4bbd, float:-8.3253196E14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47690ECz.super.onSuccess(r14)
            java.lang.Object r2 = r13.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r2 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r2
            X.4or r0 = r14.A00
            com.instagram.business.fragment.SupportServiceEditUrlFragment.A00(r0, r2)
            java.lang.String r5 = r2.A08
            if (r5 != 0) goto L_0x032e
            java.lang.String r1 = r2.A0A
            java.lang.String r0 = "business_hub"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x032e
            java.lang.String r7 = r13.A02
            X.8ab r5 = X.DbW.A0V(r2)
            r9 = 2131952134(0x7f130206, float:1.9540702E38)
            r6 = 1
            r0 = 6
            com.instagram.api.schemas.SMBPartnerType r8 = r2.A01
            int r1 = r8.ordinal()
            if (r1 == r0) goto L_0x0329
            r0 = 3
            if (r1 == r0) goto L_0x0324
            r0 = 2
            if (r1 != r0) goto L_0x03cc
            r0 = 2131960991(0x7f13249f, float:1.9558666E38)
        L_0x028d:
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r0 = X.DbV.A0z(r2, r0, r9)
            r5.A05 = r0
            com.instagram.api.schemas.SMBPartnerType r1 = r2.A01
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.GIFT_CARD
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0309
            r1 = 2131963078(0x7f132cc6, float:1.95629E38)
            java.lang.String r0 = r2.A0B
            java.lang.String r0 = X.DbV.A0z(r2, r0, r1)
            r5.A0q(r0)
        L_0x02ad:
            r0 = 2131952304(0x7f1302b0, float:1.9541047E38)
            java.lang.String r1 = r2.getString(r0)
            X.FJh r0 = new X.FJh
            r0.<init>((java.lang.String) r7, (java.lang.Object) r2, (int) r6)
            r5.A0d(r0, r1)
            r0 = 2131968514(0x7f134202, float:1.9573925E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 20
            X.FJi r0 = X.C50023FJi.A00(r2, r0)
            r5.A0a(r0, r1)
            android.app.Dialog r0 = r5.A02()
        L_0x02d0:
            X.AnonymousClass0fN.A00(r0)
        L_0x02d3:
            X.FFo r9 = r2.A02
            java.lang.String r8 = r2.A07
            java.lang.String r7 = r2.A05
            java.lang.String r6 = r2.A0B
            java.lang.String r5 = r13.A02
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r2 = 1
            X.DbZ.A0t(r2, r7, r6, r5)
            X.0Aj r1 = X.C49935FFo.A00(r9)
            java.lang.String r0 = "flow_update_info"
            X.DbS.A1H(r1, r0)
            java.lang.String r0 = "success"
            X.DbS.A1J(r1, r0)
            X.C49935FFo.A01(r1, r9, r8, r7, r2)
            X.Dba.A1A(r1, r6, r5)
            r1.Cgf()
            r0 = -1510183621(0xffffffffa5fc6d3b, float:-4.378905E-16)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -857819075(0xffffffffccdeb83d, float:-1.16769256E8)
        L_0x0305:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0309:
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.FOOD_DELIVERY
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0318
            r0 = 2131969068(0x7f13442c, float:1.9575048E38)
        L_0x0314:
            r5.A08(r0)
            goto L_0x02ad
        L_0x0318:
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.DONATION
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02ad
            r0 = 2131960989(0x7f13249d, float:1.9558662E38)
            goto L_0x0314
        L_0x0324:
            r0 = 2131957624(0x7f131778, float:1.9551837E38)
            goto L_0x028d
        L_0x0329:
            r0 = 2131963077(0x7f132cc5, float:1.9562897E38)
            goto L_0x028d
        L_0x032e:
            java.lang.String r1 = "sticker"
            if (r5 != 0) goto L_0x034e
            java.lang.String r0 = r2.A0A
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x034e
            java.lang.String r7 = r13.A02
            com.instagram.common.session.UserSession r6 = r2.A03
            com.instagram.api.schemas.SMBPartnerType r0 = r2.A01
            java.lang.String r5 = r0.toString()
            r1 = 2
            X.ECz r0 = new X.ECz
            r0.<init>(r7, r2, r1)
            X.C48757Ejg.A00(r0, r6, r2, r5)
            goto L_0x02d3
        L_0x034e:
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x03bb
            if (r5 == 0) goto L_0x03bb
            java.lang.String r0 = r2.A0A
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03bb
            java.lang.String r7 = r13.A02
            X.8ab r5 = X.DbW.A0V(r2)
            r0 = 2131969116(0x7f13445c, float:1.9575146E38)
            r5.A09(r0)
            r9 = 2131969115(0x7f13445b, float:1.9575144E38)
            r6 = 2
            com.instagram.api.schemas.SMBPartnerType r8 = r2.A01
            int r1 = r8.ordinal()
            r0 = 6
            if (r1 == r0) goto L_0x03b7
            r0 = 3
            if (r1 == r0) goto L_0x03b3
            if (r1 != r6) goto L_0x03d1
            r0 = 2131960991(0x7f13249f, float:1.9558666E38)
        L_0x037d:
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = r2.A09
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = r2.getString(r9, r0)
            r5.A0q(r0)
            r0 = 2131952304(0x7f1302b0, float:1.9541047E38)
            java.lang.String r1 = r2.getString(r0)
            X.FJh r0 = new X.FJh
            r0.<init>((java.lang.String) r7, (java.lang.Object) r2, (int) r6)
            r5.A0d(r0, r1)
            r0 = 2131968514(0x7f134202, float:1.9573925E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 21
            X.FJi r0 = X.C50023FJi.A00(r2, r0)
            r5.A0a(r0, r1)
            android.app.Dialog r0 = r5.A02()
            goto L_0x02d0
        L_0x03b3:
            r0 = 2131957624(0x7f131778, float:1.9551837E38)
            goto L_0x037d
        L_0x03b7:
            r0 = 2131963077(0x7f132cc5, float:1.9562897E38)
            goto L_0x037d
        L_0x03bb:
            X.6ST r0 = r2.A04
            r0.dismiss()
            android.os.Handler r1 = r2.A0G
            X.Fpq r0 = new X.Fpq
            r0.<init>(r13)
            r1.post(r0)
            goto L_0x02d3
        L_0x03cc:
            java.lang.UnsupportedOperationException r0 = X.DbZ.A0p(r8)
            throw r0
        L_0x03d1:
            java.lang.UnsupportedOperationException r0 = X.DbZ.A0p(r8)
            throw r0
        L_0x03d6:
            r0 = -1953877841(0xffffffff8b8a30af, float:-5.322892E-32)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.DwM r14 = (X.DwM) r14
            r0 = 1542921563(0x5bf71d5b, float:1.39113192E17)
            int r8 = X.AnonymousClass0fD.A03(r0)
            X.C47690ECz.super.onSuccess(r14)
            boolean r10 = r14.A01
            java.lang.Object r3 = r13.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r3 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r3
            r0 = 2131976200(0x7f136008, float:1.9589514E38)
            java.lang.String r1 = r3.getString(r0)
            if (r10 == 0) goto L_0x0466
            X.DbS.A1D(r3)
            boolean r4 = r3.A0C
            java.lang.String r0 = r13.A02
            if (r4 == 0) goto L_0x0462
            com.instagram.business.fragment.SupportServiceEditUrlFragment.A03(r3, r0)
        L_0x0404:
            com.instagram.actionbar.ActionButton r0 = r3.A00
            r11 = 0
            r0.setDisplayedChild(r11)
            r6 = r10 ^ 1
            android.widget.TextView r0 = r3.mURLTitleTextView
            r0.setText(r1)
            android.widget.TextView r5 = r3.mURLTitleTextView
            android.content.Context r4 = r3.requireContext()
            android.content.Context r1 = r3.requireContext()
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r6 == 0) goto L_0x0423
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
        L_0x0423:
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A17(r4, r5, r0)
            X.FFo r9 = r3.A02
            java.lang.String r7 = r3.A07
            boolean r6 = r3.A0C
            java.lang.String r5 = r3.A05
            java.lang.String r4 = r3.A0B
            java.lang.String r3 = r13.A02
            X.DbZ.A0t(r11, r7, r5, r4)
            X.0Aj r1 = X.C49935FFo.A00(r9)
            java.lang.String r0 = "validate_url"
            X.DbS.A1H(r1, r0)
            if (r10 == 0) goto L_0x045f
            java.lang.String r0 = "url_valid"
        L_0x0446:
            X.DbS.A1J(r1, r0)
            X.C49935FFo.A01(r1, r9, r7, r5, r6)
            X.Dba.A1A(r1, r4, r3)
            r1.Cgf()
            r0 = -1486752700(0xffffffffa761f444, float:-3.135744E-15)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -1137586621(0xffffffffbc31ce43, float:-0.010852399)
        L_0x045b:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x045f:
            java.lang.String r0 = "url_invalid"
            goto L_0x0446
        L_0x0462:
            com.instagram.business.fragment.SupportServiceEditUrlFragment.A02(r3, r0)
            goto L_0x0404
        L_0x0466:
            java.lang.String r1 = r14.A00
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0404
            r0 = 2131964474(0x7f13323a, float:1.956573E38)
            java.lang.String r1 = r3.getString(r0)
            goto L_0x0404
        L_0x0476:
            r0 = -1905794726(0xffffffff8e67e15a, float:-2.8581451E-30)
            X.AnonymousClass0fD.A03(r0)
            X.DwN r14 = (X.DwN) r14
            r0 = 1287113569(0x4cb7cb61, float:9.6361224E7)
            X.AnonymousClass0fD.A03(r0)
            X.C47690ECz.super.onSuccess(r14)
            java.lang.Object r0 = r13.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r0 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            com.instagram.api.schemas.SMBPartnerType r1 = r14.A01
            X.4Cl r0 = r0.A03
            r0.EUR(r1)
            r14.A00()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47690ECz.onSuccess(java.lang.Object):void");
    }
}
