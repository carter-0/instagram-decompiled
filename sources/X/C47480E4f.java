package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.msc.logging.LoggingData;
import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.LinkedHashMap;

/* renamed from: X.E4f  reason: case insensitive filesystem */
public abstract class C47480E4f extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ProductSettingsFragmentBase";
    public C65482Lu6 A00;
    public C46788DlI A01;
    public boolean A02 = true;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C51793G2c.A00(this, 40);
    public final AnonymousClass0eM A05 = C51793G2c.A00(this, 41);
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = C51793G2c.A00(this, 44);
    public final AnonymousClass0eM A0B = C51793G2c.A00(this, 45);
    public final AnonymousClass0eM A0C = C51793G2c.A00(this, 49);

    public static final void A02(C47480E4f e4f) {
        e4f.A02 = false;
        C50332FYn fYn = (C50332FYn) e4f.A03.getValue();
        String A012 = FCG.A01(e4f.A04());
        String A022 = FCG.A02(e4f.A04());
        String moduleName = e4f.getModuleName();
        C46788DlI dlI = e4f.A01;
        if (dlI != null) {
            String A042 = dlI.A04();
            C46788DlI dlI2 = e4f.A01;
            if (dlI2 != null) {
                String A032 = dlI2.A03();
                0qQ.A0B(moduleName, 3);
                0Aj A033 = Dbc.A03(fYn.A00, "ig_creator_monetization_product_settings_flow", A012, A022, moduleName);
                DbS.A1J(A033, "impression");
                EZV ezv = null;
                if (A042 != null) {
                    try {
                        ezv = EZV.valueOf(A042);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                A033.A8M(ezv, "origin");
                A033.AAJ("client_extra", A032);
                A033.Cgf();
                View view = e4f.mView;
                if (view != null) {
                    e4f.A00(view);
                }
                e4f.A0A();
                e4f.A0D(false);
                return;
            }
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public String A07() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.07Z, X.KUY] */
    public void A09() {
        if (this instanceof KUY) {
            ? r2 = (KUY) this;
            C50139FQw.A00(r2, ((C46771Dky) r2.A00.getValue()).A00, 37);
        } else if (this instanceof EN1) {
        } else {
            if (this instanceof C47922EMz) {
                C47922EMz eMz = (C47922EMz) this;
                C46783DlB dlB = (C46783DlB) eMz.A00.getValue();
                DbV.A1F(eMz.getViewLifecycleOwner(), dlB.A01, new MPA(eMz, 42), 0);
                AnonymousClass7TE.A1Z(new MH0((Object) dlB, (Object) eMz, (AnonymousClass4D7) null, 33), DbV.A0J(eMz));
            } else if (this instanceof EN0) {
                EN0 en0 = (EN0) this;
                Dba.A15(en0.getViewLifecycleOwner(), ((C46739DkS) en0.A01.getValue()).A00, new MPA(en0, 41), 70);
            } else {
                07U r3 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 20), AnonymousClass07a.A00(viewLifecycleOwner));
            }
        }
    }

    public void A0C(String str) {
    }

    public boolean A0E() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent2);
        if (i != 8888) {
            return;
        }
        if (intent == null || !intent2.getBooleanExtra("EXTRA_IS_ONBOARDING_COMPLETE", false)) {
            onBackPressed();
            return;
        }
        String moduleName = getModuleName();
        C50332FYn fYn = (C50332FYn) this.A03.getValue();
        String A012 = FCG.A01(A04());
        String A022 = FCG.A02(A04());
        C46788DlI dlI = this.A01;
        if (dlI == null) {
            str = "productOnboardingViewModel";
        } else {
            fYn.A02(A012, A022, "finished", "payouts_onboarding", moduleName, dlI.A04(), (String) null);
            C48182EaO A062 = A06();
            if (A062 instanceof EN3) {
                A03(this, (EN3) A062);
                return;
            }
            C46788DlI dlI2 = this.A01;
            str = "productOnboardingViewModel";
            if (dlI2 != null) {
                FragmentActivity requireActivity = requireActivity();
                UserSession A0l = AnonymousClass7TE.A0l(this.A0C);
                C46788DlI dlI3 = this.A01;
                if (dlI3 != null) {
                    0qQ.A07(getString(dlI3.A01()));
                    dlI2.A06(this, requireActivity, A0l, getModuleName(), __redex_internal_original_name);
                    FCM.A01(requireContext());
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Dba.A17(DbZ.A0F(view, R.id.product_settings_recycle_view), this.A0B);
        C46788DlI dlI = this.A01;
        if (dlI == null) {
            0qQ.A0F("productOnboardingViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7TE.A1Z(new MH3(this, dlI, (AnonymousClass4D7) null, 23), DbV.A0J(this));
        AnonymousClass0eM r3 = this.A0C;
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r3)).A01((1wn) this.A08.getValue(), FWY.class);
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r3)).A01((1wn) this.A09.getValue(), FWZ.class);
        A09();
        if (!this.A02) {
            A00(view);
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.E4f] */
    private final void A00(View view) {
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.A0C), 36317680814265797L)) {
            Dba.A17(DbT.A0I(view, R.id.notification_banner), this.A06);
            AnonymousClass0eM r5 = this.A07;
            QDO qdo = (QDO) r5.getValue();
            String A072 = A07();
            if (A072 == null) {
                A072 = C2818159r.A01();
            }
            0eP A1L = AnonymousClass7TE.A1L("logging_data", new LoggingData(A072));
            0eP A1L2 = AnonymousClass7TE.A1L(Pxd.A00(830), Pxd.A00(769));
            qdo.A03(DbY.A0C(Pxd.A00(837), AnonymousClass7TE.A1D(AnonymousClass7TE.A1I(FCM.A00(A04(), false).A00)), A1L, A1L2));
            this.mLifecycleRegistry.A09((QDO) r5.getValue());
            DbV.A1F(this, ((QDO) r5.getValue()).A06, new MP7(this, 26), 23);
            DbV.A1F(this, ((QDO) r5.getValue()).A08, new MP7(this, 27), 23);
            ((QDO) r5.getValue()).A04(new 2Fk((Object) null));
        }
    }

    public static final void A01(C47480E4f e4f) {
        C50332FYn fYn = (C50332FYn) e4f.A03.getValue();
        String A012 = FCG.A01(e4f.A04());
        String A022 = FCG.A02(e4f.A04());
        String moduleName = e4f.getModuleName();
        C46788DlI dlI = e4f.A01;
        if (dlI != null) {
            String A042 = dlI.A04();
            C46788DlI dlI2 = e4f.A01;
            if (dlI2 != null) {
                fYn.A02(A012, A022, "start", "onboarding_flow", moduleName, A042, dlI2.A03());
                return;
            }
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public UserMonetizationProductType A04() {
        if (this instanceof KUY) {
            return UserMonetizationProductType.USER_PAY;
        }
        if (this instanceof EN1) {
            return DbV.A0b((EN1) this).A01;
        }
        if ((this instanceof C47922EMz) || (this instanceof EN0)) {
            return UserMonetizationProductType.INCENTIVE_PLATFORM;
        }
        return UserMonetizationProductType.FAN_CLUB_CREATOR;
    }

    public final UserSession A05() {
        return AnonymousClass7TE.A0l(this.A0C);
    }

    public C48182EaO A06() {
        String str;
        if (this instanceof KUY) {
            str = "com.instagram.user_pay.badges.utils.onboarding.navigation_handler";
        } else if ((this instanceof C47922EMz) || (this instanceof EN0)) {
            str = "com.instagram.incentive_platform.screens.onboarding.onboarding_navigation_handler";
        } else if (!(this instanceof EN2)) {
            return EN4.A00;
        } else {
            str = "com.instagram.user_pay.fan_club.utils.creator_onboarding_navigation_handler";
        }
        return new EN3(str);
    }

    public final String A08() {
        return DbS.A0t(this.A05);
    }

    public void A0A() {
        19B r7;
        C318136oS A002;
        0sL mg8;
        Object value;
        String str;
        String str2;
        boolean z;
        if (this instanceof KUY) {
            C46771Dky dky = (C46771Dky) ((KUY) this).A00.getValue();
            1a8 r5 = dky.A02;
            MonetizationRepository monetizationRepository = dky.A03;
            1NY A0b = AnonymousClass7TG.A0b(monetizationRepository.A0A.A00);
            A0b.A0A("creators/user_pay/user_pay_summary/");
            r5.A02(C69818Nsf.A00(DbU.A0S(A0b, Dw5.class, F8L.class)), new C51136Fp8(dky, 2));
            FCM.A02(EXJ.A08, monetizationRepository, new JGX(dky, 7));
        } else if (this instanceof EN1) {
            C46775Dl2 A0b2 = DbV.A0b((EN1) this);
            05G r6 = A0b2.A08;
            do {
                value = r6.getValue();
                C47180Drv drv = (C47180Drv) value;
                str = drv.A01;
                str2 = drv.A02;
                z = drv.A03;
                AnonymousClass7TG.A1N(str, str2);
            } while (!r6.AIY(value, new C47180Drv(str, str2, true, z)));
            A0b2.A04.A01(A0b2.A01, new G4S(A0b2, 1));
        } else {
            if (this instanceof C47922EMz) {
                AnonymousClass0eM r62 = ((C47922EMz) this).A00;
                C46783DlB dlB = (C46783DlB) r62.getValue();
                C318136oS A003 = C318116oQ.A00(dlB);
                MFT mft = new MFT(dlB, (AnonymousClass4D7) null, 4);
                r7 = 19B.A00;
                1Eo.A05(r7, mft, A003);
                FCM.A02(EXJ.A03, dlB.A03, new JJR(dlB, 40));
                2YL A0H = DbS.A0H(r62);
                A002 = C318116oQ.A00(A0H);
                mg8 = new MFT(A0H, (AnonymousClass4D7) null, 3);
            } else if (this instanceof EN0) {
                EN0 en0 = (EN0) this;
                if (en0.isAdded() && !en0.mRemoving) {
                    AnonymousClass7TF.A0D().post(new C51209FqQ(en0));
                    return;
                }
                return;
            } else {
                EN2 en2 = (EN2) this;
                AnonymousClass0eM r52 = en2.A01;
                2YL A0H2 = DbS.A0H(r52);
                C318136oS A004 = C318116oQ.A00(A0H2);
                MG8 mg82 = new MG8(A0H2, (AnonymousClass4D7) null, 8);
                r7 = 19B.A00;
                1Eo.A05(r7, mg82, A004);
                if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(en2.A0C), 36321374486144310L)) {
                    2YL A0H3 = DbS.A0H(r52);
                    A002 = C318116oQ.A00(A0H3);
                    mg8 = new MG8(A0H3, (AnonymousClass4D7) null, 7);
                } else {
                    return;
                }
            }
            1Eo.A05(r7, mg8, A002);
        }
    }

    public final void A0B() {
        C46788DlI dlI = this.A01;
        if (dlI != null) {
            Activity A032 = DbT.A03(this);
            C46788DlI dlI2 = this.A01;
            if (dlI2 != null) {
                String A16 = AnonymousClass7TE.A16(A032, dlI2.A01());
                C48182EaO A062 = A06();
                MP7 mp7 = new MP7(this, 25);
                AnonymousClass7TE.A1Z(new MH6((Object) A062, (Object) dlI, (Object) mp7, A16, (AnonymousClass4D7) null, 14), C318116oQ.A00(dlI));
                return;
            }
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Object, X.Lu3] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r1.A04 != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.KUY
            if (r0 == 0) goto L_0x0023
            r0 = r7
            X.KUY r0 = (X.KUY) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.Dky r0 = (X.C46771Dky) r0
            X.2Fj r1 = r0.A01
            java.lang.Object r0 = r1.A02()
            X.DrZ r0 = (X.C47158DrZ) r0
            if (r0 == 0) goto L_0x001b
            r0.A04 = r8
        L_0x001b:
            java.lang.Object r0 = r1.A02()
            r1.A0A(r0)
        L_0x0022:
            return
        L_0x0023:
            boolean r0 = r7 instanceof X.EN1
            if (r0 == 0) goto L_0x0054
            r0 = r7
            X.EN1 r0 = (X.EN1) r0
            X.Dl2 r0 = X.DbV.A0b(r0)
            X.05G r6 = r0.A08
        L_0x0030:
            java.lang.Object r5 = r6.getValue()
            r1 = r5
            X.Drv r1 = (X.C47180Drv) r1
            if (r8 != 0) goto L_0x003e
            boolean r0 = r1.A04
            r4 = 0
            if (r0 == 0) goto L_0x003f
        L_0x003e:
            r4 = 1
        L_0x003f:
            java.lang.String r3 = r1.A01
            java.lang.String r2 = r1.A02
            boolean r1 = r1.A03
            X.AnonymousClass7TG.A1N(r3, r2)
            X.Drv r0 = new X.Drv
            r0.<init>(r3, r2, r4, r1)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x0030
            return
        L_0x0054:
            boolean r0 = r7 instanceof X.C47922EMz
            if (r0 == 0) goto L_0x0069
            r0 = r7
            X.EMz r0 = (X.C47922EMz) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.DlB r0 = (X.C46783DlB) r0
            X.05G r0 = r0.A09
            X.AnonymousClass7TF.A1O(r0, r8)
            return
        L_0x0069:
            boolean r0 = r7 instanceof X.EN0
            if (r0 == 0) goto L_0x00a3
            r1 = r7
            X.EN0 r1 = (X.EN0) r1
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r1.mRemoving
            if (r0 != 0) goto L_0x0022
            X.0eM r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            X.DkS r0 = (X.C46739DkS) r0
            X.05G r2 = r0.A01
        L_0x0084:
            java.lang.Object r1 = r2.getValue()
            if (r8 == 0) goto L_0x009e
            X.Lu3 r0 = new X.Lu3
            r0.<init>()
            X.Lu3[] r0 = new X.C65479Lu3[]{r0}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
        L_0x0097:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0084
            return
        L_0x009e:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            goto L_0x0097
        L_0x00a3:
            r0 = r7
            X.EN2 r0 = (X.EN2) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.JiU r0 = (X.C60273JiU) r0
            X.05G r0 = r0.A06
            X.AnonymousClass7TF.A1O(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47480E4f.A0D(boolean):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0C);
    }

    public final boolean onBackPressed() {
        C46788DlI dlI = this.A01;
        if (dlI == null) {
            0qQ.A0F("productOnboardingViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        C49004Eng.A00(this, dlI);
        return true;
    }

    public C47480E4f() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51793G2c(new C51793G2c(this, 46), 47));
        0Yh A0z = DbS.A0z(QDO.class);
        this.A07 = DbS.A0I(new C51793G2c(A002, 48), new MMW(36, A002, this), new MMW(35, (Object) null, A002), A0z);
        this.A06 = AnonymousClass1YB.A00(C13330TVd.A00);
        this.A03 = C51793G2c.A00(this, 39);
        this.A08 = AnonymousClass0eN.A01(new C51793G2c(this, 42));
        this.A09 = AnonymousClass0eN.A01(new C51793G2c(this, 43));
    }

    public static final void A03(C47480E4f e4f, EN3 en3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        C46788DlI dlI = e4f.A01;
        if (dlI != null) {
            A1H.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, dlI.A04());
            C46788DlI dlI2 = e4f.A01;
            if (dlI2 != null) {
                Dr0 dr0 = (Dr0) dlI2.A02.A02();
                if (dr0 == null || (str = dr0.A04) == null) {
                    str = "";
                }
                A1H.put("program_type", str);
                String A072 = e4f.A07();
                if (A072 != null) {
                    A1H.put(Dbj.A02(), A072);
                }
                C360678ey A052 = C359988do.A05(AnonymousClass7TE.A0l(e4f.A0C), en3.A00, A1H);
                E84.A00(A052, e4f, 8);
                1ES.A03(A052);
                return;
            }
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.Dr0, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        FAE fae;
        int A022 = AnonymousClass0fD.A02(-92013027);
        C47480E4f.super.onCreate(bundle);
        ((C60424JlH) this.A0B.getValue()).A00 = this;
        C46788DlI A002 = new 2YN(new C47742EFc(AnonymousClass7TE.A0l(this.A0C)), requireActivity()).A00(C46788DlI.class);
        this.A01 = A002;
        if (A002 == null) {
            0qQ.A0F("productOnboardingViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        UserMonetizationProductType A042 = A04();
        String A0t = DbS.A0t(this.A05);
        String A0t2 = DbS.A0t(this.A04);
        String A0t3 = DbS.A0t(this.A0A);
        AnonymousClass7TF.A1H(A042, A0t);
        A002.A00 = A042;
        C49052EoW eoW = FAE.A02;
        UserSession userSession = A002.A04;
        synchronized (eoW) {
            0qQ.A0B(userSession, 0);
            fae = new FAE(userSession);
        }
        A002.A01 = fae;
        AnonymousClass2Fj r2 = A002.A02;
        ? obj = new Object();
        obj.A00 = A042;
        obj.A02 = A0t;
        obj.A01 = A0t2;
        obj.A04 = A0t3;
        obj.A05 = false;
        obj.A03 = null;
        r2.A0B(obj);
        if (A0E()) {
            A0B();
        }
        AnonymousClass0fD.A09(663603077, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1808352647);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_settings_layout, viewGroup, false);
        AnonymousClass0fD.A09(-207034075, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-914213433);
        AnonymousClass0eM r3 = this.A0C;
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r3)).A02((1wn) this.A08.getValue(), FWY.class);
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r3)).A02((1wn) this.A09.getValue(), FWZ.class);
        super.onDestroy();
        AnonymousClass0fD.A09(-1538694829, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1532296315);
        super.onResume();
        if (!A0E()) {
            this.A02 = false;
            A0D(false);
        }
        if (!this.A02) {
            A0A();
        }
        AnonymousClass0fD.A09(-928431541, A022);
    }
}
