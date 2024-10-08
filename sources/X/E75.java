package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;

public final class E75 extends C273374mT implements AnonymousClass0iw, AnonymousClass4DR, AnonymousClass4DS, CallerContextable, AnonymousClass08W {
    public static final String __redex_internal_original_name = "ChangePasswordV2Fragment";
    public IgFormField A00;
    public IgFormField A01;
    public IgFormField A02;
    public C49690F2a A03;
    public FBX A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public View A0A;
    public TextView A0B;
    public boolean A0C;
    public final Handler A0D = new Handler();

    public final String getModuleName() {
        return "change_password";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r5.A06 != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.E75 r5) {
        /*
            com.instagram.igds.components.form.IgFormField r4 = r5.A00
            android.view.View r3 = r5.A0A
            if (r3 == 0) goto L_0x003d
            if (r4 == 0) goto L_0x003d
            X.F2a r1 = r5.A03
            com.instagram.igds.components.form.IgFormField r0 = r1.A04
            java.lang.String r2 = X.DbU.A0o(r0)
            com.instagram.igds.components.form.IgFormField r0 = r1.A03
            java.lang.String r1 = X.DbU.A0o(r0)
            if (r2 == 0) goto L_0x0039
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0039
            java.lang.CharSequence r0 = r4.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0039
            boolean r0 = r5.A06
            r1 = 1
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            r3.setEnabled(r1)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E75.A01(X.E75):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Jbl, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r2 == X.AnonymousClass05K.A0C) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r6) {
        /*
            r5 = this;
            X.Jbl r4 = new X.Jbl
            r4.<init>()
            android.content.res.Resources r3 = X.DbV.A05(r5)
            java.lang.Integer r2 = r5.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 == r0) goto L_0x001a
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 == r0) goto L_0x001a
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 2131969195(0x7f1344ab, float:1.9575306E38)
            if (r2 != r1) goto L_0x001d
        L_0x001a:
            r0 = 2131954978(0x7f130d22, float:1.954647E38)
        L_0x001d:
            X.C59922Jbl.A02(r3, r4, r0)
            r1 = 2
            X.FP3 r0 = new X.FP3
            r0.<init>((X.E75) r5, (int) r1)
            com.instagram.actionbar.ActionButton r0 = X.C59904JbT.A00(r0, r6, r4)
            r5.A0A = r0
            boolean r0 = r5.A07
            r6.setIsLoading(r0)
            A01(r5)
            java.lang.Integer r1 = r5.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0047
            X.3JR r2 = X.DbX.A0M()
            r1 = 3
            X.FP3 r0 = new X.FP3
            r0.<init>((X.E75) r5, (int) r1)
            X.DbX.A1A(r0, r2, r6)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E75.configureActionBar(X.2da):void");
    }

    public final boolean onBackPressed() {
        if (!this.A08) {
            return false;
        }
        C59689JTv.A03(getContext(), getString(2131969199), (String) null, 1);
        return false;
    }

    public static void A00(E75 e75) {
        Intent intent;
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(e75.getSession()), "instagram_change_password_success");
        if (A0e.isSampled()) {
            if (e75.A05 == AnonymousClass05K.A01) {
                str = "inauthentic_engagement";
            } else {
                str = null;
            }
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A0e.Cgf();
        }
        e75.A08 = false;
        if (e75.getTargetFragment() != null) {
            Fragment targetFragment = e75.getTargetFragment();
            07M.A02(e75);
            int i = e75.mTargetRequestCode;
            Bundle bundle = e75.mArguments;
            if (bundle != null) {
                intent = DbS.A09();
                String A002 = C66579MXk.A00(702);
                intent.putExtra(A002, bundle.getString(A002));
            } else {
                intent = null;
            }
            targetFragment.onActivityResult(i, -1, intent);
        }
        e75.A0D.post(new C51212FqT(e75));
        C59689JTv.A03(e75.getContext(), e75.getString(2131954982), (String) null, 1);
    }

    public static void A02(E75 e75, String str) {
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(e75.getSession()), "instagram_change_password_failure");
        if (A0e.isSampled()) {
            if (str == null) {
                str = "";
            }
            A0e.AAJ("reason", str);
            if (e75.A05 == AnonymousClass05K.A01) {
                str2 = "inauthentic_engagement";
            } else {
                str2 = null;
            }
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
            A0e.Cgf();
        }
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        String str;
        int A022 = AnonymousClass0fD.A02(20520812);
        E75.super.onCreate(bundle);
        this.A04 = new FBX(getSession());
        String string = requireArguments().getString(C66579MXk.A00(268));
        Integer[] A002 = AnonymousClass05K.A00(5);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A002[i];
                switch (num.intValue()) {
                    case 1:
                        str = "inauthentic";
                        break;
                    case 2:
                        str = "two_fac_trusted_notification";
                        break;
                    case 3:
                        str = "activity_center";
                        break;
                    case 4:
                        str = NetInfoModule.CONNECTION_TYPE_NONE;
                        break;
                    default:
                        str = "suspicious";
                        break;
                }
                if (!str.equals(string)) {
                    i++;
                }
            } else {
                num = AnonymousClass05K.A0Y;
            }
        }
        this.A05 = num;
        AnonymousClass0fD.A09(-545924551, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(1315054174);
        View inflate = layoutInflater.inflate(R.layout.fragment_change_password_v2, viewGroup, false);
        TextView A0G = DbU.A0G(inflate, R.id.change_password_inauthenticate_title);
        TextView A0G2 = DbU.A0G(inflate, R.id.change_password_inauthenticate_content);
        View requireViewById = inflate.requireViewById(R.id.change_password_requirement);
        int intValue = this.A05.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                A0G.setVisibility(0);
                A0G.setText(2131954980);
                A0G2.setVisibility(0);
                i = 2131954983;
            } else if (intValue != 2) {
                requireViewById.setVisibility(0);
            } else {
                A0G.setVisibility(0);
                A0G.setText(2131954980);
                A0G2.setVisibility(0);
                i = 2131954984;
            }
            A0G2.setText(i);
        } else {
            A0G.setVisibility(0);
            A0G.setText(2131954980);
            A0G2.setVisibility(0);
            i = 2131954979;
            A0G2.setText(i);
        }
        this.A00 = DbT.A0d(inflate, R.id.current_password);
        this.A02 = DbT.A0d(inflate, R.id.new_password);
        this.A01 = DbT.A0d(inflate, R.id.confirm_new_password);
        this.A00.setInputType(129);
        this.A02.setInputType(129);
        this.A01.setInputType(129);
        TextView A0G3 = DbU.A0G(inflate, R.id.reset_password);
        this.A0B = A0G3;
        AnonymousClass0fU.A00(new FP3(this, 4), A0G3);
        this.A0B.setVisibility(0);
        C49690F2a f2a = new C49690F2a(requireContext(), this.A02, this.A01);
        this.A03 = f2a;
        f2a.A00 = new C49346EuA(this);
        this.A00.A0G(new FKk(this, 9));
        AnonymousClass4v0 A002 = AnonymousClass4v0.A00(getSession());
        this.A00.getMEditText().addTextChangedListener(A002);
        this.A02.getMEditText().addTextChangedListener(A002);
        this.A01.getMEditText().addTextChangedListener(A002);
        this.A04.A00.markerEnd(857808781, 2);
        AnonymousClass0fD.A09(-1378706872, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1329229455);
        super.onDestroyView();
        AnonymousClass4v0 A002 = AnonymousClass4v0.A00(getSession());
        DbU.A1E(A002, this.A00);
        DbU.A1E(A002, this.A02);
        DbU.A1E(A002, this.A01);
        C49690F2a f2a = this.A03;
        f2a.A00 = null;
        f2a.A04.setRuleChecker((X4E) null);
        f2a.A03.setRuleChecker((X4E) null);
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A0A = null;
        this.A0B = null;
        AnonymousClass0fD.A09(-1684310981, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(87142180);
        E75.super.onPause();
        C2594141p.A00(requireActivity(), this.A09);
        Window window = getRootActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        DbS.A1D(this);
        AnonymousClass0fD.A09(2012067815, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1578526936);
        super.onResume();
        this.A09 = requireActivity().getRequestedOrientation();
        C2594141p.A00(requireActivity(), -1);
        Window window = getRootActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        if (!this.A0C) {
            this.A00.requestFocus();
            0nA.A0Q(this.A00);
            this.A0C = true;
        }
        AnonymousClass0fD.A09(-1614652809, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-2002635071);
        E75.super.onStart();
        DbZ.A1P(this, 8);
        UserSession session = getSession();
        0qQ.A0B(session, 0);
        1NY A0b = AnonymousClass7TG.A0b(session);
        A0b.A02();
        A0b.A0A("api/v1/accounts/last_password_change_timestamp/");
        1OC A0S = DbU.A0S(A0b, C47309Duc.class, F4S.class);
        0qQ.A0C(A0S, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.LastPasswordChangeTimestampResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.LastPasswordChangeTimestampResponse>>");
        C48001EQk.A00(getParentFragmentManager(), this, A0S, 0);
        AnonymousClass0fD.A09(1054738976, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1638807173);
        E75.super.onStop();
        DbZ.A1P(this, 0);
        AnonymousClass0fD.A09(-2043463736, A022);
    }
}
