package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E4a  reason: case insensitive filesystem */
public final class C47476E4a extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "UserPasswordRecoveryFragment";
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public AnonymousClass0aP A05;
    public C49922FEx A06 = new C49922FEx();
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public Handler A0F = new Handler();

    public final String getModuleName() {
        return "user_password_recovery";
    }

    public static void A01(C47476E4a e4a, String str) {
        C49944FFx.A00.A02(e4a.A05, "recovery_page", str);
    }

    public static void A02(C47476E4a e4a, String str) {
        0xI A052 = 1Q0.A1G.A02(e4a.A05).A05((EXD) null, C46634DiE.A1J);
        e4a.A06.A00.putString(DbX.A0s(C48071EUp.A0A), str);
        e4a.A06.A03(A052);
        DbU.A1R(A052, e4a.A05);
    }

    public final AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(this.A05, "recovery_page");
        return false;
    }

    public static void A00(C47476E4a e4a) {
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(e4a.A05), "recovery_sms");
        if (A0e.isSampled()) {
            DbY.A1D(A0e, A012, A002);
            DbZ.A1J(A0e, "recovery_page");
            A0e.AAJ("cp_prefill_type", e4a.A06.A00.getString(DbX.A0s(C48071EUp.A04)));
            C49922FEx.A01(A0e, e4a);
            DbT.A1P(A0e);
            DbW.A13(A0e, A012);
            DbY.A1A(A0e);
            A0e.A7p("prefill_given_match", DbU.A0g(e4a.A06.A00, DbX.A0s(C48071EUp.A08)));
            DbW.A12(A0e, A002);
            A0e.A7p("was_from_recovery_flow", DbU.A0g(e4a.A06.A00, DbX.A0s(C48071EUp.A0C)));
            A0e.Cgf();
        }
        02m.A0p.markerPoint(725096125, C66579MXk.A00(364));
        1OC A003 = FHA.A00(e4a.requireContext(), e4a.A05, (Boolean) null, (Boolean) null, e4a.A08, (String) null, true, false);
        A003.A00 = new EMM(e4a, e4a.A05, e4a, C46634DiE.A1J);
        1ES.A03(A003);
    }

    public final void configureActionBar(2da r2) {
        DbW.A1B(r2, 2131952023);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1856280317);
        C47476E4a.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A08 = DbU.A0l(requireArguments, "lookup_user_input");
        this.A0B = requireArguments.getBoolean("can_email_reset");
        this.A0C = requireArguments.getBoolean("can_sms_reset");
        this.A0D = requireArguments.getBoolean("can_wa_reset");
        this.A0E = DbT.A1X(requireArguments, "is_autoconf_test_user");
        this.A07 = DbU.A0l(requireArguments, "lookup_source");
        this.A05 = 09i.A0A.A02(requireArguments);
        C49922FEx A002 = C49922FEx.A00(requireArguments);
        this.A06 = A002;
        ArrayList A0v = DbS.A0v(4);
        if (this.A0B) {
            A0v.add("email");
        }
        if (this.A0C) {
            A0v.add("sms");
        }
        if (this.A0D) {
            A0v.add("whatsapp");
        }
        A0v.add("facebook");
        this.A0A = A0v;
        A002.A00.putInt(DbX.A0s(C48071EUp.A03), A0v.size());
        this.A06.A00.putStringArrayList(DbX.A0s(C48071EUp.A05), AnonymousClass7TE.A1D(this.A0A));
        AnonymousClass0aP r5 = this.A05;
        C49922FEx fEx = this.A06;
        AnonymousClass7TG.A1N(r5, "recovery_page");
        C49938FFr.A00(r5, fEx, (EXD) null, (Integer) null, "recovery_page", (String) null);
        AnonymousClass0fD.A09(764573097, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-791689457);
        View inflate = layoutInflater.inflate(R.layout.fragment_user_password_recovery, viewGroup, false);
        int A0H = 2Yu.A0H(requireContext(), R.attr.glyphColorPrimary);
        C49948FGd.A02(DbU.A0G(inflate, R.id.fragment_user_password_recovery_button_email_reset), A0H);
        C49948FGd.A02(DbU.A0G(inflate, R.id.fragment_user_password_recovery_button_sms_reset), A0H);
        C49948FGd.A02(DbU.A0G(inflate, R.id.fragment_user_password_recovery_button_whatsapp_reset), A0H);
        C49948FGd.A02(DbU.A0G(inflate, R.id.connect_with_facebook_textview), A0H);
        this.A02 = inflate.requireViewById(R.id.sms_spinner);
        if (this.A0C) {
            View requireViewById = inflate.requireViewById(R.id.fragment_user_password_recovery_button_sms_reset_container);
            requireViewById.setVisibility(0);
            FP3.A00(requireViewById, 19, this);
        }
        if (this.A0B) {
            View requireViewById2 = inflate.requireViewById(R.id.fragment_user_password_recovery_button_email_reset_container);
            requireViewById2.setVisibility(0);
            FP3.A00(requireViewById2, 20, this);
        }
        if (this.A0D) {
            View requireViewById3 = inflate.requireViewById(R.id.fragment_user_password_recovery_button_whatsapp_reset_container);
            requireViewById3.setVisibility(0);
            FP3.A00(requireViewById3, 21, this);
        }
        FP3.A00(inflate.requireViewById(R.id.fragment_user_password_recovery_dont_have_access), 22, this);
        IgImageView A0b = DbT.A0b(inflate, R.id.user_profile_picture);
        TextView A0G = DbU.A0G(inflate, R.id.username_textview);
        if (!DcV.A01().equals(this.A07) || (str = this.A08) == null) {
            A0b.setVisibility(8);
            A0G.setVisibility(8);
            DbT.A1F(inflate, R.id.divider_row, 8);
        } else {
            A0G.setText(str);
            Parcelable parcelable = requireArguments().getParcelable("user_profile_pic");
            parcelable.getClass();
            A0b.setUrl((ImageUrl) parcelable, this);
        }
        AnonymousClass0fD.A09(424151089, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-45585454);
        super.onDestroyView();
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(-105329119, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1621545651);
        C47476E4a.super.onStart();
        AnonymousClass0fD.A09(-549734070, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        02m.A0p.markerEnd(725096220, 2);
    }
}
