package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.util.ArrayList;
import java.util.Set;

public final class K53 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ClipsAdvancedSettingsFragment";
    public C61823KNm A00;
    public ClipsAdvancedSettingsConfig A01;
    public final Set A02 = DbS.A0y();
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    private final void A00(View view) {
        view.setSaveEnabled(false);
        if (view instanceof ViewGroup) {
            0kx r1 = new 0kx((ViewGroup) view);
            while (r1.hasNext()) {
                A00((View) r1.next());
            }
        }
    }

    public final String getModuleName() {
        return "share_reels_advanced_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        27r A0g = C51971G9r.A0g(this.A04);
        Set set = this.A02;
        C697329a r5 = A0g.A0G;
        0Aj A0e = AnonymousClass7TE.A0e(r5.A01, "ig_camera_ui_tool_impression");
        if (A0e.isSampled()) {
            JTO.A1O(AnonymousClass80P.ADVANCE_SETTINGS_LOAD, A0e);
            JTO.A1T(A0e, "IG_CAMERA_CLIPS_ADVANCE_SETTINGS_LOAD");
            AnonymousClass283 r1 = r5.A04;
            JTO.A1S(A0e, JTP.A0p(r1));
            JTP.A1E(A0e);
            JTS.A14(r1.A09, A0e);
            C51965G9l.A1A(C59725JVj.SHARE_SHEET, A0e);
            JTO.A1P(28t.A06, A0e);
            A0e.A8M(C360948fP.CLIPS, "capture_type");
            AnonymousClass7TH.A0U(A0e);
            A0e.A7p("funded_content_available", false);
            A0e.AAe("share_sheet_entity_loaded", AnonymousClass7TE.A1D(set));
            A0e.Cgf();
        }
        A00(view);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public K53() {
        0Yh A0z = DbS.A0z(QD0.class);
        this.A03 = DbS.A0I(C59917Jbg.A00(this, 38), C59917Jbg.A00(this, 39), MMY.A00(this, (Object) null, 2), A0z);
    }

    public final void configureActionBar(2da r3) {
        r3.setTitle(JTT.A0B(this, r3).getString(2131970965));
        r3.Eu5(new LYF((Object) this, 45), true);
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(890653109);
        K53.super.onActivityCreated(bundle);
        IgFragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            requireActivity.registerOnActivityResultListener(new C15681Ugm(this, 0));
        }
        AnonymousClass0fD.A09(-1956812081, A022);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.K53, X.4DH] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1146295559);
        K53.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
            0qQ.A08(bundle2);
        }
        UserSession A0l = AnonymousClass7TE.A0l(this.A04);
        String string = bundle2.getString("ClipsConstants.ARGS_WATERFALL_ID", AnonymousClass7TF.A0b());
        0qQ.A07(string);
        C61823KNm kNm = new C61823KNm(bundle2, this, this, A0l, string);
        this.A00 = kNm;
        kNm.A05();
        setModuleNameV2("share_reels_advanced_settings");
        this.A01 = (ClipsAdvancedSettingsConfig) C320236s2.A00(bundle2, ClipsAdvancedSettingsConfig.class, "ClipsConstants.ARG_CLIPS_ADVANCED_SETTINGS");
        getParentFragmentManager().A0v(new LZW(this, 1), this, "request_key_audience_restrictions");
        AnonymousClass0fD.A09(-684140192, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList<C62779KmH> arrayList;
        C61829KNs kNs;
        int A022 = AnonymousClass0fD.A02(-1248051715);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_advanced_settings, false);
        ViewGroup A0I = DbX.A0I(A0D, R.id.content_view);
        C61823KNm kNm = this.A00;
        if (kNm != null) {
            C60102Jfi A042 = kNm.A04();
            if (!(A042 instanceof C61829KNs) || (kNs = (C61829KNs) A042) == null) {
                arrayList = 0sn.A00;
            } else {
                arrayList = kNs.A0B.A06(PublishScreenCategoryType.MORE, kNs.A01);
            }
            for (C62779KmH kmH : arrayList) {
                if (kmH instanceof C61834KNy) {
                    Integer num = ((C61834KNy) kmH).A00;
                    C61823KNm kNm2 = this.A00;
                    if (kNm2 != null) {
                        MVS A05 = kNm2.A03().A05(new C61834KNy(num));
                        A0I.addView(A05.ANH());
                        A05.CsQ();
                    }
                } else if (kmH instanceof C61833KNw) {
                    Integer num2 = ((C61833KNw) kmH).A00;
                    C61823KNm kNm3 = this.A00;
                    if (kNm3 != null) {
                        MVS A052 = kNm3.A03().A05(new C61833KNw(num2));
                        A0I.addView(A052.ANH());
                        A052.CsQ();
                        C51971G9r.A0g(this.A04).A15(C279294yP.CLIPS, A052.BHl());
                        C62674Kka B1s = A052.B1s();
                        if (B1s != null) {
                            this.A02.add(B1s);
                        }
                    }
                } else {
                    continue;
                }
            }
            AnonymousClass0fD.A09(-1260951880, A022);
            return A0D;
        }
        JTO.A1M();
        throw AnonymousClass00P.createAndThrow();
    }
}
