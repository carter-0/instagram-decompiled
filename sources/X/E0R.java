package X;

import android.os.Bundle;
import com.instagram.registration.model.RegFlowExtras;

public abstract class E0R extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AgeCollectionBaseFragment";
    public AnonymousClass0aP A00;
    public RegFlowExtras A01;
    public EXD A02;

    public final void A02(1P0 r4, int i, int i2, int i3) {
        1NY A0N = DbU.A0N(this.A00);
        A0N.A0A("consent/check_age_eligibility/");
        A0N.A9m("year", Integer.toString(i));
        A0N.A9m("month", Integer.toString(i2));
        A0N.A9m("day", Integer.toString(i3));
        1OC A0S = DbT.A0S(A0N, C47347Dvh.class, F6Y.class);
        A0S.A00 = r4;
        schedule(A0S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0101, code lost:
        if (X.Dbb.A0g(r4).isEmpty() == false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C46634DiE r6) {
        /*
            r5 = this;
            X.EXD r1 = r5.A02
            X.EXD r0 = X.EXD.SAC
            if (r1 != r0) goto L_0x0060
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x004e
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L_0x004e
            com.instagram.registration.model.RegFlowExtras r0 = r5.A01
            boolean r2 = r0.A0t
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0aP r0 = r5.A00
            X.6Yo r3 = X.DbS.A0M(r1, r0)
            if (r2 == 0) goto L_0x004f
            X.DbW.A0X()
            com.instagram.registration.model.RegFlowExtras r1 = r5.A01
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r1)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.DbS.A1A(r2, r0)
            X.E3Y r1 = new X.E3Y
            r1.<init>()
        L_0x0044:
            r1.setArguments(r2)
            r0 = 0
            r3.A0B(r0, r1)
        L_0x004b:
            r3.A04()
        L_0x004e:
            return
        L_0x004f:
            com.instagram.registration.model.RegFlowExtras r1 = r5.A01
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r1)
            X.E5j r1 = new X.E5j
            r1.<init>()
            goto L_0x0044
        L_0x0060:
            com.instagram.registration.model.RegFlowExtras r1 = r5.A01
            java.util.List r0 = r1.A0e
            if (r0 == 0) goto L_0x006c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0076
        L_0x006c:
            java.util.List r0 = X.Dbb.A0g(r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00bb
        L_0x0076:
            com.instagram.registration.model.RegFlowExtras r0 = r5.A01
            java.util.List r1 = X.Dbb.A0g(r0)
            X.0aP r2 = r5.A00
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00bb
            int r0 = r1.size()
            java.util.ArrayList r3 = X.DbS.A0v(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0090:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r1.next()
            X.Ewr r0 = (X.C49512Ewr) r0
            java.lang.String r0 = r0.A00
            r3.add(r0)
            goto L_0x0090
        L_0x00a2:
            X.1Q0 r0 = X.1Q0.A25
            X.FGI r1 = r0.A02(r2)
            r0 = 0
            X.FBm r2 = r1.A06(r0, r6)
            java.lang.String r0 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r0, r3)
            java.lang.String r0 = "prototypes"
            r2.A04(r0, r1)
            r2.A02()
        L_0x00bb:
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0aP r0 = r5.A00
            X.6Yo r3 = X.DbS.A0M(r1, r0)
            com.instagram.registration.model.RegFlowExtras r4 = r5.A01
            java.lang.String r1 = r4.A0X
            java.lang.String r0 = "kr"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ee
            X.DbT.A15()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r4)
            X.DbU.A1C(r2)
            X.E3c r1 = new X.E3c
            r1.<init>()
        L_0x00e5:
            r1.setArguments(r2)
            r0 = 0
            r3.A0B(r0, r1)
            goto L_0x004b
        L_0x00ee:
            java.util.List r0 = r4.A0e
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0103
        L_0x00f8:
            java.util.List r0 = X.Dbb.A0g(r4)
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0104
        L_0x0103:
            r1 = 1
        L_0x0104:
            X.DbT.A15()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r4)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            if (r1 == 0) goto L_0x011d
            X.DbS.A1A(r2, r0)
            X.E3W r1 = new X.E3W
            r1.<init>()
            goto L_0x00e5
        L_0x011d:
            X.DbS.A1A(r2, r0)
            X.E3a r1 = new X.E3a
            r1.<init>()
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0R.A03(X.DiE):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.0Js] */
    public final void A04(String str, int i, int i2, int i3) {
        C49921FEw.A00().A02();
        int intValue = C49921FEw.A00().A01().intValue();
        if (intValue == 1) {
            C358248ab A0X = DbS.A0X(getRootActivity());
            A0X.A09(2131952524);
            A0X.A0E(C50020FJf.A00(this, 57));
            A0X.A0r(false);
            DbT.A1V(A0X);
        } else if (intValue == 2) {
            RegFlowExtras regFlowExtras = this.A01;
            Bundle A0a = AnonymousClass7TE.A0a();
            if (regFlowExtras != null) {
                A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            }
            if (this.A02 == EXD.SAC && str != null) {
                09i.A0A.A0A(new Object(), (0Jv) null, new EyT(i, i2, i3), str);
            }
            C309516Yo A0J = DbY.A0J(requireActivity(), this.A00);
            DbU.A1C(A0a);
            DbX.A18(A0a, new AnonymousClass4DH(), A0J);
        }
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-750012635);
        E0R.super.onCreate(bundle);
        17k.A07(this.mArguments, "Arguments must contain MainSession token and Registration extras");
        this.A00 = 09i.A0A.A02(this.mArguments);
        RegFlowExtras regFlowExtras = (RegFlowExtras) this.mArguments.getParcelable("RegFlowExtras.EXTRA_KEY");
        this.A01 = regFlowExtras;
        17k.A07(regFlowExtras, "Registration extras cannot be null");
        EXD A012 = this.A01.A01();
        this.A02 = A012;
        A012.getClass();
        AnonymousClass0fD.A09(448833657, A022);
    }
}
