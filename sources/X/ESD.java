package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.login.twofac.model.TotpSeed;
import java.util.ArrayList;
import java.util.Iterator;

public final class ESD extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacMultipleTotpFragment";
    public Bundle A00;
    public PR9 A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131975737);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public static final void A06(ESD esd) {
        Bundle bundle = esd.A00;
        String str = "twoFacResponseBundle";
        if (bundle != null) {
            boolean z = bundle.getBoolean("can_add_additional_totp_seed");
            PR9 pr9 = esd.A01;
            if (pr9 == null) {
                str = "authenticatorAppSwitch";
            } else {
                ArrayList A1M = 0sr.A1M(new Object[]{pr9});
                C70966OTn oTn = new C70966OTn((View.OnClickListener) new C50100FOq(4, (Object) esd, z), 2131975668);
                oTn.A07 = true;
                SpannableStringBuilder A0C = DbS.A0C(esd.getString(2131952258));
                Dba.A0x(A0C, new RBU(Dbb.A06(esd), 4));
                oTn.A03 = A0C;
                A1M.add(oTn);
                FAZ faz = new FAZ((CharSequence) esd.getString(2131975699));
                faz.A05 = new F0T(DbV.A05(esd).getDimensionPixelSize(R.dimen.abc_dialog_padding_material), DbV.A05(esd).getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), Dbb.A07(esd, R.dimen.account_discovery_bottom_gap), Dbb.A07(esd, R.dimen.account_discovery_bottom_gap), DbV.A05(esd).getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), Dbb.A07(esd, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                faz.A03 = R.style.TwoFacRowBodyText;
                A1M.add(faz);
                Bundle bundle2 = esd.A00;
                if (bundle2 != null) {
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList("totp_seeds");
                    if (parcelableArrayList != null) {
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            TotpSeed totpSeed = (TotpSeed) it.next();
                            boolean A1S = AnonymousClass7TF.A1S(parcelableArrayList.size(), 1);
                            String str2 = totpSeed.A01;
                            0qQ.A07(str2);
                            String str3 = totpSeed.A00;
                            0qQ.A07(str3);
                            C71065Oak oak = new C71065Oak((View.OnClickListener) new C50070FNl(2, totpSeed, esd, A1S), (CharSequence) str2, (CharSequence) str3, "");
                            oak.A0C = true;
                            String str4 = totpSeed.A00;
                            if (str4 == null || str4.length() == 0) {
                                oak.A08 = null;
                            }
                            A1M.add(oak);
                        }
                    }
                    esd.setItems(A1M);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.ESD r5, com.instagram.login.twofac.model.TotpSeed r6, boolean r7, boolean r8, boolean r9) {
        /*
            r0 = 430(0x1ae, float:6.03E-43)
            java.lang.String r3 = X.C273654mx.A00(r0)
            java.lang.String r2 = "\n                "
            if (r8 == 0) goto L_0x006f
            if (r7 == 0) goto L_0x006f
            if (r9 == 0) goto L_0x005d
            if (r6 == 0) goto L_0x005d
            r0 = 2131975727(0x7f135e2f, float:1.9588554E38)
            java.lang.String r4 = r5.getString(r0)
            r1 = 2131975726(0x7f135e2e, float:1.9588552E38)
        L_0x001a:
            java.lang.String r0 = r6.A01
            java.lang.String r1 = X.DbV.A0z(r5, r0, r1)
            r0 = 2131975762(0x7f135e52, float:1.9588625E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r0 = X.002.A11(r2, r1, r3, r0, r2)
            java.lang.String r3 = X.0rw.A0t(r0)
        L_0x002f:
            r0 = 2131975787(0x7f135e6b, float:1.9588676E38)
        L_0x0032:
            java.lang.String r1 = r5.getString(r0)
            X.8ab r2 = X.DbW.A0U(r5)
            r2.A05 = r4
            r2.A0q(r3)
            r0 = 21
            X.FJf r0 = X.C50020FJf.A00(r5, r0)
            r2.A0c(r0, r1)
            r1 = 2131954722(0x7f130c22, float:1.9545951E38)
            if (r9 == 0) goto L_0x0050
            r1 = 2131975698(0x7f135e12, float:1.9588496E38)
        L_0x0050:
            r0 = 22
            X.FJf r0 = X.C50020FJf.A00(r5, r0)
            r2.A0H(r0, r1)
            X.DbT.A1V(r2)
            return
        L_0x005d:
            r0 = 2131975613(0x7f135dbd, float:1.9588323E38)
            java.lang.String r4 = r5.getString(r0)
            r0 = 2131975612(0x7f135dbc, float:1.9588321E38)
            java.lang.String r3 = r5.getString(r0)
            r0 = 2131975761(0x7f135e51, float:1.9588623E38)
            goto L_0x0032
        L_0x006f:
            if (r9 == 0) goto L_0x007e
            if (r6 == 0) goto L_0x007e
            r0 = 2131975725(0x7f135e2d, float:1.958855E38)
            java.lang.String r4 = r5.getString(r0)
            r1 = 2131975724(0x7f135e2c, float:1.9588548E38)
            goto L_0x001a
        L_0x007e:
            r0 = 2131975611(0x7f135dbb, float:1.958832E38)
            java.lang.String r4 = r5.getString(r0)
            r0 = 2131975610(0x7f135dba, float:1.9588317E38)
            java.lang.String r3 = r5.getString(r0)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESD.A07(X.ESD, com.instagram.login.twofac.model.TotpSeed, boolean, boolean, boolean):void");
    }

    public final void A08() {
        C47699EDi eDi = new C47699EDi(this, 38);
        1OC A012 = FFP.A01(requireContext(), AnonymousClass7TE.A0l(this.A02));
        A012.A00 = eDi;
        schedule(A012);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-752794386);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments;
        boolean z = requireArguments.getBoolean("is_totp_two_factor_enabled");
        Bundle bundle2 = this.A00;
        if (bundle2 == null) {
            0qQ.A0F("twoFacResponseBundle");
            throw AnonymousClass00P.createAndThrow();
        }
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) FQN.A00, (C358618bC) new FdO(this, 1, bundle2.getBoolean("is_two_factor_enabled"), z), 2131975737, z);
        this.A01 = pr9;
        pr9.A0A = getString(2131975739);
        A08();
        AnonymousClass0fD.A09(724341396, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(325272472);
        super.onResume();
        A08();
        AnonymousClass0fD.A09(-1843027971, A022);
    }
}
