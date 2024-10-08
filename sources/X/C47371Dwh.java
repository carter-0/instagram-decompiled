package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Dwh  reason: case insensitive filesystem */
public final class C47371Dwh extends C272124k8 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47371Dwh(UserSession userSession, Object obj, int i) {
        super(userSession);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 4:
                i = AnonymousClass0fD.A03(1430961814);
                AnonymousClass74W r7 = (AnonymousClass74W) obj;
                int A03 = AnonymousClass0fD.A03(-683093703);
                AnonymousClass7TG.A1N(userSession, r7);
                C370538wd r1 = r7.A02;
                if (r1 != null) {
                    1bJ.A00(userSession).FKz(r1);
                }
                AnonymousClass0fD.A0A(1876752732, A03);
                i2 = -221006783;
                break;
            case 6:
                i = AnonymousClass0fD.A03(-1075592245);
                C370538wd r72 = (C370538wd) obj;
                int A032 = AnonymousClass0fD.A03(1109993254);
                0qQ.A0B(r72, 1);
                ((FAV) this.A01).A04.FKy(r72, r72.A0o, r72, true);
                AnonymousClass0fD.A0A(-370694934, A032);
                i2 = 2110848520;
                break;
            default:
                super.A04(userSession, obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void A05(C268654dm r8, UserSession userSession) {
        int i;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-742604517);
                ((C51900G6u) this.A01).D6v(r8.A01());
                i2 = 841059170;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-1174998731);
                E5J e5j = (E5J) this.A01;
                C46445Df7.A00(e5j.mView, false);
                Context context = e5j.A00;
                UserSession userSession2 = e5j.A04;
                0Tu r3 = 0Tu.A05;
                int i4 = 2131959245;
                if (Dbb.A1Y(r3, userSession2)) {
                    i4 = 2131959244;
                }
                if (Dbb.A1Y(r3, e5j.A04)) {
                    i3 = 777;
                } else {
                    i3 = 293;
                }
                C59689JTv.A01(context, C66579MXk.A00(i3), i4, 1);
                E5J.A00(e5j);
                C3265677h.A08(e5j.A02, e5j, e5j.A04);
                i2 = -1186786306;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-289920674);
                E5N e5n = (E5N) this.A01;
                C46445Df7.A00(e5n.mView, false);
                C59689JTv.A01(e5n.getContext(), C66579MXk.A00(293), 2131959245, 1);
                E5N.A02(e5n);
                C3265677h.A08(e5n.A00, e5n, e5n.A01);
                i2 = 849550635;
                break;
            case 4:
                i = DbX.A04(r8, -4685258);
                ((C51905G6z) this.A01).onFail(r8);
                i2 = 2106189615;
                break;
            case 5:
                i = AnonymousClass0fD.A03(135356795);
                C49396Euy euy = (C49396Euy) this.A01;
                if (euy != null) {
                    euy.A00.DED();
                }
                i2 = 2074151113;
                break;
            default:
                super.A05(r8, userSession);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int i;
        int i2;
        boolean z;
        String str;
        boolean z2;
        String str2;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A03(1316867911);
                int A03 = AnonymousClass0fD.A03(-846240298);
                ((C51900G6u) this.A01).D6w(((C300585xS) obj2).A1D);
                AnonymousClass0fD.A0A(2107795316, A03);
                i = 470754505;
                break;
            case 1:
                i2 = AnonymousClass0fD.A03(-890971719);
                C370538wd r2 = (C370538wd) obj2;
                int A032 = AnonymousClass0fD.A03(-736659715);
                C254703su r1 = r2.A00;
                if (r1 == null || (r1.A10 == 2FW.A0G && !r2.CKJ())) {
                    z = true;
                } else {
                    z = false;
                }
                E5J e5j = (E5J) this.A01;
                String str3 = r2.A1D;
                String str4 = r2.A1K;
                boolean z3 = r2.A1d;
                UserSession userSession2 = e5j.A04;
                String str5 = e5j.A09;
                String str6 = e5j.A0A;
                C48140EZi eZi = e5j.A02;
                if (z) {
                    str = "new";
                } else {
                    str = "existing";
                }
                C3265677h.A09(eZi, e5j, userSession2, str5, str6, str3, str);
                if (e5j.getActivity() != null) {
                    DirectShareTarget directShareTarget = new DirectShareTarget(new C254763t0(str3), str4, FFJ.A01(e5j.A0B), z3);
                    0mp.A0B(AnonymousClass7TF.A0f(e5j.A01));
                    Intent putExtra = DbS.A09().putExtra("bundle_extra_share_target", directShareTarget);
                    putExtra.putExtra(AnonymousClass000.A00(531), e5j.A07.A08);
                    if (e5j.A0C) {
                        DbT.A1I(e5j);
                    } else {
                        e5j.getActivity().setResult(-1, putExtra);
                        e5j.getActivity().finish();
                    }
                }
                AnonymousClass0fD.A0A(-671797511, A032);
                i = -1650420296;
                break;
            case 2:
                i2 = AnonymousClass0fD.A03(1472179248);
                C334247ax r22 = (C334247ax) obj2;
                int A04 = DbX.A04(r22, -864645545);
                EEO eeo = (EEO) this.A01;
                eeo.A02 = r22.getItems();
                eeo.A08.A01(EEO.A00(eeo));
                AnonymousClass0fD.A0A(2093277108, A04);
                i = -3581874;
                break;
            case 3:
                i2 = AnonymousClass0fD.A03(1411267350);
                C370538wd r23 = (C370538wd) obj2;
                int A033 = AnonymousClass0fD.A03(307190119);
                C254703su r12 = r23.A00;
                if (r12 == null || (r12.A10 == 2FW.A0G && !r23.CKJ())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                E5N e5n = (E5N) this.A01;
                String str7 = r23.A1D;
                String str8 = r23.A1K;
                boolean z4 = r23.A1d;
                FZ0 fz0 = e5n.A02;
                if (fz0 != null) {
                    UserSession userSession3 = e5n.A01;
                    String str9 = e5n.A08;
                    String str10 = fz0.A07;
                    C48140EZi eZi2 = e5n.A00;
                    if (z2) {
                        str2 = "new";
                    } else {
                        str2 = "existing";
                    }
                    C3265677h.A09(eZi2, e5n, userSession3, str9, str10, str7, str2);
                }
                if (e5n.getActivity() != null) {
                    Intent putExtra2 = DbS.A09().putExtra("bundle_extra_share_target", new DirectShareTarget(new C254763t0(str7), str8, FFJ.A01(e5n.A0E), z4));
                    FZ0 fz02 = e5n.A02;
                    if (fz02 != null) {
                        putExtra2.putExtra(AnonymousClass000.A00(531), fz02.A08);
                    }
                    02m.A0p.markerStart(31787378);
                    e5n.getActivity().setResult(-1, putExtra2);
                    e5n.getActivity().finish();
                }
                AnonymousClass0fD.A0A(-484539337, A033);
                i = 1156734760;
                break;
            case 4:
                i2 = AnonymousClass0fD.A03(908751216);
                int A034 = AnonymousClass0fD.A03(-479585417);
                AnonymousClass7TG.A1N(userSession, obj2);
                super.A06(userSession, obj2);
                ((C51905G6z) this.A01).onSuccess();
                AnonymousClass0fD.A0A(-1862957503, A034);
                i = 2037321020;
                break;
            case 5:
                i2 = AnonymousClass0fD.A03(408700947);
                C47350Dvk dvk = (C47350Dvk) obj2;
                int A035 = AnonymousClass0fD.A03(1568586316);
                AnonymousClass7TG.A1N(userSession, dvk);
                boolean z5 = !dvk.A01;
                boolean z6 = !dvk.A00;
                1Au.A00(userSession).A1b(z5);
                1Av A002 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A002, A002.A62, 1Av.A8a, 200, z6);
                C49396Euy euy = (C49396Euy) this.A01;
                if (euy != null) {
                    euy.A00.Don(z5, z6);
                }
                AnonymousClass0fD.A0A(589067170, A035);
                i = -938960172;
                break;
            default:
                super.A06(userSession, obj2);
                return;
        }
        AnonymousClass0fD.A0A(i, i2);
    }
}
