package X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9j0  reason: invalid class name and case insensitive filesystem */
public final class C385479j0 extends 1P0 {
    public final int A00;
    public final Object A01;

    public C385479j0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r8) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass7TG.A0D(r8, 1706501563);
                Throwable A012 = r8.A01();
                if (A012 != null) {
                    ((C360678ey) this.A01).A00.A02(new C268664dn(A012));
                }
                i2 = 1357178324;
                break;
            case 2:
                i = AnonymousClass7TG.A0D(r8, 854840106);
                Throwable A013 = r8.A01();
                if (A013 == null) {
                    1XP r1 = (1XP) r8.A00();
                    C360698f0 r5 = ((C360678ey) this.A01).A00;
                    if (r1 == null) {
                        r5.A02(AnonymousClass7BQ.A00());
                        i2 = 902492573;
                        break;
                    } else {
                        r5.A02(new C268674do(new AnonymousClass9JA(Integer.valueOf(r1.mStatusCode), r1.getErrorMessage(), r1.mErrorTitle, r1.isFeedbackRequired())));
                        i2 = -141833607;
                        break;
                    }
                } else {
                    ((C360678ey) this.A01).A00.A02(new C268664dn(A013));
                    i2 = -526193919;
                    break;
                }
            case 3:
                i = AnonymousClass7TG.A0D(r8, -731255276);
                0ki.A00("Flow fail", new GNG(4, this.A01, r8));
                i2 = -966052522;
                break;
            case 4:
                i = AnonymousClass7TG.A0D(r8, -605118451);
                0ki.A00("LoadingFlow fail", new GNG(6, this.A01, r8));
                i2 = -927297389;
                break;
            case 6:
                i = AnonymousClass0fD.A03(1279535713);
                i2 = -1926255905;
                break;
            default:
                C385479j0.super.onFail(r8);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        Reel A0M;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(316281361);
                C360758f6 r0 = ((C360678ey) this.A01).A00.A00;
                if (r0 != null) {
                    r0.A03();
                }
                i2 = -875909234;
                break;
            case 2:
                i = AnonymousClass0fD.A03(295862156);
                C360758f6 r02 = ((C360678ey) this.A01).A00.A00;
                if (r02 != null) {
                    r02.A03();
                }
                i2 = 2031004424;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-1728316142);
                C387519mL r5 = (C387519mL) this.A01;
                r5.A02 = false;
                C40268AYh aYh = r5.A09;
                String str = aYh.A00;
                if (!(str == null || (A0M = aYh.A01.A0M(str)) == null)) {
                    ArrayList A1D = AnonymousClass7TE.A1D(A0M.A0Q());
                    Collections.sort(A1D, new C51563Fw9(0, aYh, A0M.A0K()));
                    C387519mL.A03(r5, A1D, 0);
                }
                i2 = -1781961100;
                break;
            case 6:
                i = AnonymousClass0fD.A03(1765415487);
                i2 = 670160121;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-580529283);
                C387539mN r1 = (C387539mN) this.A01;
                r1.A05 = false;
                C387539mN.A01(r1);
                i2 = -843065056;
                break;
            default:
                C385479j0.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(-1060145335);
                C360758f6 r0 = ((C360678ey) this.A01).A00.A00;
                if (r0 != null) {
                    r0.A02();
                }
                i2 = -2127945693;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1557404489);
                C360758f6 r02 = ((C360678ey) this.A01).A00.A00;
                if (r02 != null) {
                    r02.A02();
                }
                i2 = 1490504830;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1865493261);
                ((C387519mL) this.A01).A02 = true;
                i2 = -170147689;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-1978537242);
                ((C387539mN) this.A01).A05 = true;
                i2 = -151735216;
                break;
            default:
                C385479j0.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 2:
                i = AnonymousClass0fD.A03(-57678267);
                C379749Vd r6 = (C379749Vd) obj;
                int A0D = AnonymousClass7TG.A0D(r6, -1913552427);
                1TZ.A00().A01(new C379759Ve(r6, (C379739Vc) this.A01));
                AnonymousClass0fD.A0A(-1736233308, A0D);
                i2 = 50333933;
                break;
            case 3:
                i = AnonymousClass0fD.A03(1547645607);
                int A0D2 = AnonymousClass7TG.A0D(obj, 105740070);
                0ki.A00("Flow success", new GNG(5, this.A01, obj));
                AnonymousClass0fD.A0A(-296020485, A0D2);
                i2 = 535871952;
                break;
            case 4:
                i = AnonymousClass0fD.A03(202796742);
                int A0D3 = AnonymousClass7TG.A0D(obj, 1507357913);
                0ki.A00("LoadingFlow success", new GNG(7, this.A01, obj));
                AnonymousClass0fD.A0A(1971425972, A0D3);
                i2 = 1582870209;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1240166487);
                int A03 = AnonymousClass0fD.A03(825566725);
                ((C387519mL) this.A01).A00 = ((C384529hT) obj).A00;
                AnonymousClass0fD.A0A(728371074, A03);
                i2 = 896132168;
                break;
            case 6:
                i = AnonymousClass0fD.A03(-1395350852);
                C384619hc r62 = (C384619hc) obj;
                int A0D4 = AnonymousClass7TG.A0D(r62, -935871003);
                C387539mN r1 = (C387539mN) this.A01;
                r1.A0C.A00(r62);
                C387539mN.A02(r1);
                AnonymousClass0fD.A0A(-1478538414, A0D4);
                i2 = -1552810012;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-1445366143);
                C384529hT r63 = (C384529hT) obj;
                int A0D5 = AnonymousClass7TG.A0D(r63, -595437394);
                ((C387539mN) this.A01).A02 = r63.A00;
                AnonymousClass0fD.A0A(-685136069, A0D5);
                i2 = -536263196;
                break;
            case 8:
                i = AnonymousClass0fD.A03(1333361064);
                C3723890q r64 = (C3723890q) obj;
                int A0D6 = AnonymousClass7TG.A0D(r64, -462435767);
                C3722990g r12 = (C3722990g) this.A01;
                List list = r64.A03;
                if (list != null && !list.isEmpty()) {
                    r12.A02(r64);
                }
                AnonymousClass0fD.A0A(931201433, A0D6);
                i2 = 871525265;
                break;
            default:
                C385479j0.super.onSuccess(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        int i3;
        AnonymousClass3FZ A002;
        AnonymousClass3FZ A003;
        AnonymousClass3FZ A004;
        String A05;
        C382959en r0;
        C268654dm A005;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(516884404);
                AnonymousClass3JC r14 = (AnonymousClass3JC) obj;
                int A0D = AnonymousClass7TG.A0D(r14, -644460467);
                Object obj2 = r14.A01;
                if (obj2 == null) {
                    0wb.A03(AnonymousClass000.A00(4311), "Error creating Bloks view query response");
                    i3 = -500653766;
                } else {
                    C10187Ro3 ro3 = (C10187Ro3) this.A01;
                    AnonymousClass3FZ r2 = (AnonymousClass3FZ) obj2;
                    if (!(r2 == null || (A002 = r2.A00(C381369bd.class, "ig_bloks_iab_autofill_payment_usage_soft_keyboard_view")) == null || (A003 = A002.A00(C381359bc.class, "component")) == null || (A004 = A003.A00(C381349bb.class, "bundle")) == null || (A05 = A004.A05("bloks_bundle_tree")) == null)) {
                        ro3.A00.A02 = C360998fV.A00(C307546Qn.A01, A05, "AutofillSoftKeyboardController");
                    }
                    i3 = -362091804;
                }
                AnonymousClass0fD.A0A(i3, A0D);
                i2 = -929442173;
                break;
            case 1:
                i = AnonymousClass0fD.A03(1220722502);
                AnonymousClass3JC r142 = (AnonymousClass3JC) obj;
                int A03 = AnonymousClass0fD.A03(1708710049);
                0qQ.A0B(r142, 0);
                C379809Vj r3 = (C379809Vj) this.A01;
                C250663lr r7 = (C250663lr) r142.A01;
                if (r7 == null) {
                    A005 = new C268664dn(new Exception("No result in IGBloksAsyncActionQuery response"));
                } else {
                    C360658ew r6 = r3.A00;
                    C250663lr optionalTreeField = r7.getOptionalTreeField(0, "bloks_action(bk_context:$bk_context,params:$params)", C382909ei.class, 749888425);
                    if (optionalTreeField != null) {
                        r0 = (C382959en) optionalTreeField.reinterpretRequired(0, C382959en.class, 1583155594);
                    } else {
                        r0 = null;
                    }
                    A005 = r6.A00(r0);
                    if (A005 instanceof C268674do) {
                        A005 = new C268674do(new C379799Vi((C46620Di0) ((C268674do) A005).A00, 1, 0, 0));
                    } else if (!(A005 instanceof C268664dn)) {
                        throw AnonymousClass7TE.A1K();
                    }
                }
                C361098ff r1 = (C361098ff) A005.A00();
                if (r1 != null) {
                    r3.A00.A01(r1);
                }
                1TZ.A00().A01(new C40985AmV(r3, A005));
                AnonymousClass0fD.A0A(-1685942430, A03);
                i2 = 496468668;
                break;
            case 2:
                i = AnonymousClass0fD.A03(101935753);
                C379749Vd r143 = (C379749Vd) obj;
                int A032 = AnonymousClass0fD.A03(664495442);
                0qQ.A0B(r143, 0);
                try {
                    C379739Vc r02 = (C379739Vc) this.A01;
                    r02.A00.A01(r02.A01(r143));
                } catch (C3727292d e) {
                    ((C360678ey) this.A01).A00.A02(new C268674do(new AnonymousClass9JA((Integer) null, e.getMessage(), "ParsingException", false)));
                }
                AnonymousClass0fD.A0A(382566050, A032);
                i2 = 2136081445;
                break;
            default:
                C385479j0.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
