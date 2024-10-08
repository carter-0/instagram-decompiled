package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Map;

/* renamed from: X.UZm  reason: case insensitive filesystem */
public final class C15282UZm extends AnonymousClass4DH implements X95, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromotePreviewV2Fragment";
    public View A00;
    public SpinnerImageView A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final void D7A(boolean z) {
        C13990Tnq.A0h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_back_button", false);
        UYr uYr = new UYr();
        uYr.setArguments(bundle);
        C331127Pr A0f = DbX.A0f(this.A02);
        DbS.A1S(A0f, false);
        DbY.A13(this, uYr, A0f);
    }

    public final String getModuleName() {
        return "promote_story_eligible_preview";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C13991Tnr.A0w(this);
        this.A01 = DbX.A0k(view);
        this.A00 = view.requireViewById(R.id.preview_screen_content_view);
        Dba.A16(getViewLifecycleOwner(), ((C60222Jhf) this.A03.getValue()).A02, new J6O(this, 0), 54);
        C13988Tno.A1J(JTU.A0D(this.A02), C16678UzE.AD_PREVIEW);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C15282UZm() {
        C20690WxM wxM = new C20690WxM(this, 44);
        AnonymousClass0eM A002 = C20690WxM.A00(new C20690WxM(this, 41), 0eO.A02, 42);
        this.A03 = new C227862kA(new C20690WxM(A002, 43), wxM, new C41566AwY(39, (Object) null, A002), new 0Yh(C60222Jhf.class));
    }

    public final void DDh() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            W1Y w1y = W1Y.A00;
            UserSession A0l = AnonymousClass7TE.A0l(this.A02);
            AnonymousClass0eM r1 = this.A03;
            1Xj r6 = ((C60222Jhf) r1.getValue()).A00;
            Map map = ((C60222Jhf) r1.getValue()).A01;
            w1y.A03(activity, ((C60222Jhf) r1.getValue()).A03, A0l, r6, ((C60222Jhf) r1.getValue()).A07, ((C60222Jhf) r1.getValue()).A09, map);
        }
    }

    public final void DF3() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            W1Y w1y = W1Y.A00;
            UserSession A0l = AnonymousClass7TE.A0l(this.A02);
            AnonymousClass0eM r1 = this.A03;
            1Xj r6 = ((C60222Jhf) r1.getValue()).A00;
            Map map = ((C60222Jhf) r1.getValue()).A01;
            w1y.A04(activity, ((C60222Jhf) r1.getValue()).A03, A0l, r6, ((C60222Jhf) r1.getValue()).A07, map, ((C60222Jhf) r1.getValue()).A0A);
        }
    }

    public final void Dc6() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            W1Y w1y = W1Y.A00;
            UserSession A0l = AnonymousClass7TE.A0l(this.A02);
            AnonymousClass0eM r1 = this.A03;
            1Xj r6 = ((C60222Jhf) r1.getValue()).A00;
            Map map = ((C60222Jhf) r1.getValue()).A01;
            String str = ((C60222Jhf) r1.getValue()).A07;
            w1y.A02(activity, ((C60222Jhf) r1.getValue()).A03, A0l, r6, ((C60222Jhf) r1.getValue()).A06, str, ((C60222Jhf) r1.getValue()).A08, map);
        }
    }

    public final void Dnf() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A02);
            Map map = ((C60222Jhf) this.A03.getValue()).A01;
            0qQ.A0B(A0l, 1);
            W1Y.A00(activity, (LME) map.get(AdsAPIInstagramPosition.STORY), A0l);
        }
    }

    public final void Dng() {
        Dbb.A0k(requireActivity(), AnonymousClass7TE.A0l(this.A02), 2EG.A34, AnonymousClass000.A00(1420));
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131970642);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-793286884);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_preview, false);
        AnonymousClass0fD.A09(503513613, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1268872605);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-2131691864, A022);
    }
}
