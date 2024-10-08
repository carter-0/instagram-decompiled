package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.registration.model.RegFlowExtras;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class E55 extends AnonymousClass4DH implements AnonymousClass4DR, G69, AnonymousClass4DS, C51874G5l {
    public static final String __redex_internal_original_name = "BaseConsentFragment";
    public AnonymousClass0wW A00;
    public RegFlowExtras A01;
    public boolean A02;
    public final 1wn A03 = FXZ.A00(this, 20);
    public final 1wn A04 = FXZ.A00(this, 21);

    /* JADX WARNING: type inference failed for: r3v3, types: [X.E55, androidx.fragment.app.Fragment, X.ELa] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.E55, X.ELZ, X.0iw, X.G5l, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.ELZ
            if (r0 == 0) goto L_0x0055
            r3 = r10
            X.ELZ r3 = (X.ELZ) r3
            X.FFw r2 = X.C49943FFw.A00()
            X.0wW r4 = r3.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Integer r6 = r3.B8m()
            r7 = 0
            r2.A02(r3, r4, r5, r6, r7)
            X.EEA r0 = r3.A01
            if (r0 == 0) goto L_0x0022
            r0.A00()
        L_0x0022:
            android.content.Context r4 = r3.requireContext()
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r8 = r0.A04
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r7 = r0.A02
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.String r9 = r0.A07
            X.0wW r6 = r3.A00
            X.1NY r5 = new X.1NY
            r5.<init>(r6)
            X.F3L r0 = r3.A00
            A00(r5, r0)
            X.EEA r0 = r3.A01
        L_0x0046:
            X.ECv r1 = new X.ECv
            r1.<init>(r3, r0)
            X.1OC r0 = X.C49764F5x.A00(r4, r5, r6, r7, r8, r9)
            r0.A00 = r1
            X.1ES.A03(r0)
            return
        L_0x0055:
            boolean r0 = r10 instanceof X.C47880ELa
            if (r0 == 0) goto L_0x00a0
            r3 = r10
            X.ELa r3 = (X.C47880ELa) r3
            X.EEA r0 = r3.A01
            r0.getClass()
            r0.A00()
            android.content.Context r2 = r3.getContext()
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r1 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x007b
            if (r2 != 0) goto L_0x007b
            java.lang.String r0 = "Context cannot be null if UserState is NEW_USER"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x007b:
            android.content.Context r4 = r3.getContext()
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r8 = r0.A04
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r7 = r0.A02
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.String r9 = r0.A07
            X.0wW r6 = r3.A00
            X.1NY r5 = new X.1NY
            r5.<init>(r6)
            X.F3L r0 = r3.A00
            A00(r5, r0)
            X.EEA r0 = r3.A01
            goto L_0x0046
        L_0x00a0:
            r3 = r10
            X.ELb r3 = (X.C47881ELb) r3
            X.FFw r2 = X.C49943FFw.A00()
            X.0wW r4 = r3.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Integer r6 = r3.B8m()
            r7 = 0
            r2.A02(r3, r4, r5, r6, r7)
            X.EEA r0 = r3.A04
            r0.A00()
            android.content.Context r2 = r3.getContext()
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r1 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00d3
            if (r2 != 0) goto L_0x00d3
            java.lang.String r0 = "Context cannot be null if UserState is NEW_USER"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00d3:
            android.content.Context r4 = r3.getContext()
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r8 = r0.A04
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r7 = r0.A02
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.String r9 = r0.A07
            X.0wW r6 = r3.A00
            X.1NY r5 = new X.1NY
            r5.<init>(r6)
            X.FEr r0 = X.C49917FEr.A00()
            X.F0y r0 = r0.A00
            X.F3L r0 = r0.A02
            A00(r5, r0)
            X.EEA r0 = r3.A04
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E55.A01():void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.F0y, java.lang.Object] */
    public final void A02() {
        synchronized (C49917FEr.class) {
            C49917FEr.A00().A02(new Object(), AnonymousClass05K.A1F, "", "");
            C49917FEr A002 = C49917FEr.A00();
            C46634DiE diE = C46634DiE.A0z;
            synchronized (A002) {
                C49917FEr fEr = C49917FEr.A0B;
                fEr.A0A = "";
                fEr.A09 = "";
                fEr.A01 = diE;
            }
        }
        AnonymousClass0wW r4 = this.A00;
        String str = C49917FEr.A00().A06;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, str);
        if ("blocking".equals(str) || "direct_blocking".equals(str)) {
            FZ1 A003 = F5E.A00(r4);
            synchronized (A003) {
                A003.A05 = false;
            }
        }
        if (this.A02) {
            0hq r1 = this.mFragmentManager;
            if (r1 != null) {
                r1.A0y("GDPR.Fragment.Entrance", A1U ? 1 : 0);
                r1.A0a();
                return;
            }
            return;
        }
        DbT.A1K(this);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.1xE, java.lang.Object] */
    public final void A03() {
        String str;
        if (isResumed()) {
            C49943FFw A002 = C49943FFw.A00();
            0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(this, this.A00, 0), "instagram_gdpr_consent_flow_finished");
            if (A0e.isSampled()) {
                String str2 = A002.A02;
                if (str2 != null) {
                    A0e.AAJ(Dbq.A01(), str2);
                    Integer num = A002.A00;
                    if (num != null) {
                        A0e.AAJ("user_state", C49766F5z.A01(num));
                        if (C49917FEr.A00().A04 == AnonymousClass05K.A00) {
                            str = DbV.A0t();
                        } else {
                            str = null;
                        }
                        A0e.AAJ("guid", str);
                        DbW.A15(A0e, this);
                        A0e.AAJ("waterfall_id", C49917FEr.A01());
                        A0e.Cgf();
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            if (C49917FEr.A00().A04 == AnonymousClass05K.A00) {
                RegFlowExtras regFlowExtras = this.A01;
                if (regFlowExtras != null) {
                    C49917FEr.A00();
                    String str3 = C49917FEr.A00().A0A;
                    regFlowExtras.A0C = C49917FEr.A00().A07;
                    C50144FRb.A02(new Handler(), this, this, (AnonymousClass0aP) this.A00, (G67) null, this, regFlowExtras, (EEK) null, C49917FEr.A00().A01, str3, C49917FEr.A00().A09, false);
                    return;
                }
                0wb.A03("GDPR consent flow", "No reg extra found");
                return;
            }
            1xC r3 = 1xC.A01;
            C310336ap A0a = DbS.A0a();
            DbT.A1D(DbV.A05(this), A0a, 2131975431);
            A0a.A04 = requireContext().getDrawable(R.drawable.circle_checked);
            A0a.A04();
            DbY.A1K(r3, A0a);
            r3.A01(new Object());
            A02();
        }
    }

    public final boolean A04() {
        C309516Yo r1;
        Fragment eLb;
        if (isResumed()) {
            Integer num = C49917FEr.A00().A04;
            Integer num2 = AnonymousClass05K.A00;
            if (num == num2 && C49917FEr.A00().A02 == AnonymousClass05K.A15) {
                Context requireContext = requireContext();
                AnonymousClass0wW r13 = this.A00;
                0hq parentFragmentManager = getParentFragmentManager();
                RegFlowExtras regFlowExtras = this.A01;
                FragmentActivity activity = getActivity();
                0qQ.A0B(r13, 1);
                C49917FEr A002 = C49917FEr.A00();
                synchronized (A002) {
                    Integer num3 = A002.A05;
                    if (num3 == num2) {
                        A002.A05 = AnonymousClass05K.A01;
                    } else if (num3 == AnonymousClass05K.A01) {
                        A002.A05 = AnonymousClass05K.A0C;
                    }
                }
                Integer num4 = C49917FEr.A00().A05;
                0qQ.A07(num4);
                int intValue = num4.intValue();
                if (intValue != 1) {
                    if (intValue == 2) {
                        Bundle A0a = AnonymousClass7TE.A0a();
                        if (regFlowExtras != null) {
                            A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                        }
                        0qQ.A0A(A0a);
                        AnonymousClass0Dg.A00(A0a, r13);
                        if (activity != null) {
                            r1 = DbY.A0J(activity, r13);
                            DbW.A0w(A0a, r13);
                            AnonymousClass4DH r0 = new AnonymousClass4DH();
                            r0.setArguments(A0a);
                            r1.A0D(r0);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    return true;
                }
                C358248ab A0Y = DbS.A0Y(requireContext);
                DbT.A19(requireContext, A0Y, 2131953916);
                DbU.A17(requireContext, A0Y, 2131953915);
                A0Y.A0E(new C50024FJj(5, (Object) activity, (Object) r13, (Object) parentFragmentManager, (Object) this));
                A0Y.A0r(false);
                DbT.A1V(A0Y);
                C49943FFw A003 = C49943FFw.A04.A00();
                Integer num5 = AnonymousClass05K.A1I;
                0qQ.A0B(num5, 1);
                C49943FFw.A01(this, r13, A003, num5, (Integer) null);
                return true;
            } else if (C49917FEr.A00().A04 == num2 && C49917FEr.A00().A02 == AnonymousClass05K.A0N) {
                RegFlowExtras regFlowExtras2 = this.A01;
                if (regFlowExtras2 != null) {
                    C49917FEr.A00();
                    String str = C49917FEr.A00().A0A;
                    regFlowExtras2.A0C = C49917FEr.A00().A07;
                    Handler handler = new Handler();
                    String str2 = C49917FEr.A00().A09;
                    C50144FRb.A02(handler, this, this, (AnonymousClass0aP) this.A00, (G67) null, (G69) null, regFlowExtras2, (EEK) null, C49917FEr.A00().A01, str, str2, true);
                    return true;
                }
                0wb.A03("GDPR consent flow", "No reg extra found");
                return true;
            } else {
                Integer num6 = C49917FEr.A00().A02;
                Bundle bundle = this.mArguments;
                if (num6 != null) {
                    int intValue2 = num6.intValue();
                    if (intValue2 == 0) {
                        C49765F5y.A01();
                        eLb = new C47881ELb();
                    } else if (intValue2 == 1) {
                        C49765F5y.A01();
                        eLb = new E55();
                    } else if (intValue2 == 4) {
                        C49765F5y.A01();
                        eLb = new C47880ELa();
                    }
                    r1 = DbS.A0M(DbU.A0I(bundle, eLb, this), this.A00);
                    r1.A0B((Bundle) null, eLb);
                }
            }
            r1.A04();
            return true;
        }
        return false;
    }

    public final Integer B8m() {
        if (this instanceof ELZ) {
            return AnonymousClass05K.A01;
        }
        if (this instanceof C47881ELb) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A09;
    }

    public final void configureActionBar(2da r3) {
        if (this instanceof C47880ELa) {
            r3.ErN(DbV.A05(this).getString(2131972389));
        } else if (C49917FEr.A00().A04 == AnonymousClass05K.A00 || "blocking".equals(C49917FEr.A00().A06) || "direct_blocking".equals(C49917FEr.A00().A06)) {
            r3.Etr(false);
        } else {
            r3.Eom(2131972389);
            AnonymousClass3JR A0M = DbX.A0M();
            A0M.A0G = FP1.A00(this, 15);
            A0M.A05 = 2131954723;
            r3.ErG(new AnonymousClass3Jb(A0M));
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        if ("blocking".equals(C49917FEr.A00().A06)) {
            return true;
        }
        FFM.A01(requireContext(), C50023FJi.A00(this, 63), new C50026FJl(24, (Object) this, (Object) this, (Object) this));
        return true;
    }

    public static void A00(1Fa r2, F3L f3l) {
        r2.A9m("updates", C49764F5x.A01(Arrays.asList(new F3L[]{f3l}), Arrays.asList(new EW2[]{EW2.CONSENT})));
    }

    public final void EuV(String str, Integer num) {
        C358248ab A0V = DbW.A0V(this);
        A0V.A0q(str);
        A0V.A0H(C50023FJi.A00(this, 64), 2131971912);
        DbT.A1V(A0V);
    }

    public void onCreate(Bundle bundle) {
        EE8 ee8;
        int A022 = AnonymousClass0fD.A02(1108862559);
        E55.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        17k.A07(bundle2, "Fragment arguments cannot be null in GDPR flow!");
        this.A00 = DbX.A0T(this);
        this.A01 = (RegFlowExtras) bundle2.getParcelable("RegFlowExtras.EXTRA_KEY");
        this.A02 = requireArguments().getBoolean("GDPR.Fragment.Entrance.Enabled");
        Dbb.A1M(this);
        FragmentActivity activity = getActivity();
        FXZ A002 = FXZ.A00(this, 22);
        AtomicBoolean atomicBoolean = C238713Dd.A00;
        if (activity == null) {
            ee8 = null;
        } else {
            ee8 = new EE8(new C50295FXa(2, (Object) activity.getSupportFragmentManager(), (Object) A002));
        }
        registerLifecycleListener(ee8);
        1xC r2 = 1xC.A01;
        r2.A02(this.A03, C50260FVr.class);
        r2.A02(this.A04, C50258FVp.class);
        0Tu r5 = 0Tu.A05;
        if (!Dba.A0Z(r5).contains(__redex_internal_original_name)) {
            if (1AW.A06(r5, 2324147266476448102L)) {
                C49130Ept.A00().A00(requireContext(), this.A00, (B2F) null);
            }
            if (1AW.A06(r5, 2324147266476513639L)) {
                C49130Ept.A00().A01(requireContext(), this.A00, (B2F) null);
            }
        }
        AnonymousClass0fD.A09(-1407679633, A022);
    }

    public void onDestroy() {
        int A022 = AnonymousClass0fD.A02(700874526);
        super.onDestroy();
        1xC r2 = 1xC.A01;
        r2.A03(this.A03, C50260FVr.class);
        r2.A03(this.A04, C50258FVp.class);
        AnonymousClass0fD.A09(754691089, A022);
    }
}
