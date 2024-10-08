package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class ESF extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AppUpdatesFragment";
    public C11205SFf A00;
    public 1Av A01;
    public FAZ A02;
    public PR9 A03;
    public PR9 A04;
    public PR9 A05;
    public UserSession A06;
    public final List A07 = AnonymousClass7TE.A1C();

    public final String getModuleName() {
        return "app_updates_settings";
    }

    public static void A06(ESF esf) {
        boolean A1x = esf.A01.A1x();
        List list = esf.A07;
        if (A1x) {
            list.remove(esf.A02);
        } else {
            list.add(1, esf.A02);
        }
        esf.setItems(list);
    }

    /* JADX WARNING: type inference failed for: r0v46, types: [X.R9j, X.11X] */
    /* JADX WARNING: type inference failed for: r0v47, types: [X.R9j, X.11X] */
    /* JADX WARNING: type inference failed for: r0v48, types: [X.R9j, X.11X] */
    public static void A07(ESF esf, boolean z) {
        if (esf.A00 != null) {
            boolean A1x = esf.A01.A1x();
            C11205SFf sFf = esf.A00;
            if (A1x != sFf.A02) {
                sFf.A02 = A1x;
                1ES.A03(new C8782R9j(esf, (PR9) null, A1x, false));
            }
            boolean z2 = esf.A01.A01.getBoolean(AnonymousClass000.A00(1665), true);
            C11205SFf sFf2 = esf.A00;
            if (z2 != sFf2.A04) {
                sFf2.A04 = z2;
                1ES.A03(new C8782R9j(esf, (PR9) null, z2, false));
            }
            boolean z3 = esf.A01.A01.getBoolean(Pxd.A00(97), true);
            C11205SFf sFf3 = esf.A00;
            if (z3 != sFf3.A05) {
                sFf3.A05 = z3;
                1ES.A03(new C8782R9j(esf, (PR9) null, z3, false));
            }
        }
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new C11531Sbs(esf, 10), (C358618bC) new FdK(esf, 0), 2131953374, esf.A01.A1x());
        esf.A05 = pr9;
        if (z) {
            pr9.A0E = true;
            pr9.A0D = false;
        }
        List list = esf.A07;
        list.add(pr9);
        list.add(new FGF((CharSequence) esf.getString(2131953370)));
        FAZ faz = new FAZ((CharSequence) esf.getString(2131953378));
        esf.A02 = faz;
        faz.A01 = 16;
        faz.A05 = new F0T(DbV.A05(esf).getDimensionPixelSize(R.dimen.add_account_icon_circle_radius), DbV.A05(esf).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), Dbb.A07(esf, R.dimen.add_account_icon_circle_radius), Dbb.A07(esf, R.dimen.abc_dialog_padding_top_material), Dbb.A07(esf, R.dimen.add_account_icon_circle_radius), Dbb.A07(esf, R.dimen.add_account_icon_circle_radius));
        esf.A02.A04 = new ColorDrawable(esf.getContext().getColor(R.color.row_warning_background));
        esf.A02.A03 = R.style.FullPriceSubtitleStyle;
        A06(esf);
        list.add(C46448DfA.A00(2131953377));
        PR9 pr92 = new PR9((CompoundButton.OnCheckedChangeListener) new C11531Sbs(esf, 12), (C358618bC) new FdK(esf, 1), 2131953367, esf.A01.A01.getBoolean(AnonymousClass000.A00(1665), true));
        esf.A03 = pr92;
        if (z) {
            pr92.A0E = true;
            pr92.A0D = false;
        }
        list.add(pr92);
        list.add(new FGF((CharSequence) esf.getString(2131953366)));
        if (!1AW.A06(0Tu.A05, 18301298029891054L)) {
            PR9 pr93 = new PR9((CompoundButton.OnCheckedChangeListener) new C11531Sbs(esf, 11), (CharSequence) esf.getString(2131953369), esf.A01.A01.getBoolean(Pxd.A00(97), true));
            esf.A04 = pr93;
            if (z) {
                pr93.A0E = true;
                pr93.A0D = false;
            }
            list.add(pr93);
            list.add(new FGF((CharSequence) esf.getString(2131953368)));
        }
        if (z) {
            list.add(0, new Object());
            DbV.A0F(esf).setPadding(0, 0, 0, DbZ.A02(esf));
        }
        esf.setItems(list);
    }

    public final AnonymousClass0wW getSession() {
        return this.A06;
    }

    public final void configureActionBar(2da r2) {
        DbW.A1B(r2, 2131952972);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1906209947);
        super.onCreate(bundle);
        UserSession A0U = DbX.A0U(this);
        this.A06 = A0U;
        this.A01 = 1Au.A00(A0U);
        AnonymousClass0fD.A09(639307350, A022);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.R9k, X.11X] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1962246541);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.appupdate_settings_layout);
        1ES.A03(new C8783R9k(this, 4));
        AnonymousClass0fD.A09(71232756, A022);
        return A0C;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(918940991);
        super.onResume();
        setItems(this.A07);
        AnonymousClass0fD.A09(1716995254, A022);
    }
}
