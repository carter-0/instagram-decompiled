package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Ua4  reason: case insensitive filesystem */
public final class C15298Ua4 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenCreateFormAdvancedSettingsFragmentV2";
    public C262204Co A00;
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        C13992Tns.A0r(r2, 2131964753);
    }

    public final String getModuleName() {
        return "organic_lead_gen_create_form_advanced_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A01;
        U8W u8w = (U8W) r4.getValue();
        VOH voh = u8w.A01;
        String str = u8w.A03;
        0qQ.A0B(str, 0);
        XB6.A02(voh.A00, str, "lead_gen_advanced_setting", "advanced_setting_screen_impression");
        WBA.A00(view.requireViewById(R.id.form_name_clickable_area), 27, this);
        DbU.A0G(view, R.id.form_name_text).setText(((U8W) r4.getValue()).A04);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((U8W) this.A01.getValue()).A00;
    }

    public final boolean onBackPressed() {
        U8W u8w = (U8W) this.A01.getValue();
        VOH voh = u8w.A01;
        String str = u8w.A03;
        0qQ.A0B(str, 0);
        XB6.A01(voh.A00, str, "lead_gen_advanced_setting", "cancel");
        return false;
    }

    public C15298Ua4() {
        C20691WxN wxN = new C20691WxN(this, 36);
        AnonymousClass0eM A002 = C20691WxN.A00(new C20691WxN(this, 33), 0eO.A02, 34);
        this.A01 = new C227862kA(new C20691WxN(A002, 35), wxN, new C20612Wvt(13, (Object) null, A002), new 0Yh(U8W.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-678312465);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_advanced_settings, viewGroup, false);
        AnonymousClass0fD.A09(-1814502427, A02);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.Ua4] */
    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(1246408787);
        C15298Ua4.super.onStart();
        this.A00 = C20592WvV.A00(this, ((U8W) this.A01.getValue()).A06, 29);
        AnonymousClass0fD.A09(1237995314, A02);
    }

    public final void onStop() {
        int A02 = AnonymousClass0fD.A02(-277202676);
        C15298Ua4.super.onStop();
        this.A00 = JTQ.A0n(this.A00);
        AnonymousClass0fD.A09(-1965800881, A02);
    }
}
