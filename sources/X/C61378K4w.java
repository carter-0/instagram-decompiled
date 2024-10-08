package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.K4w  reason: case insensitive filesystem */
public final class C61378K4w extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenConsumerInitializationFragment";
    public C262204Co A00;
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.setTitle("");
        Dbc.A0k(r2);
    }

    public final String getModuleName() {
        return "organic_lead_gen_consumer_initialization";
    }

    public final AnonymousClass0wW getSession() {
        return ((C60215JhY) this.A01.getValue()).A02;
    }

    public C61378K4w() {
        C20691WxN wxN = new C20691WxN(this, 28);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20691WxN(new C20691WxN(this, 25), 26));
        this.A01 = DbS.A0I(new C20691WxN(A002, 27), wxN, new C20612Wvt(11, (Object) null, A002), DbS.A0z(C60215JhY.class));
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1502182577);
        C61378K4w.super.onCreate(bundle);
        registerLifecycleListener(new EE7(requireActivity()));
        C60215JhY jhY = (C60215JhY) this.A01.getValue();
        C18059Vki vki = jhY.A04;
        String str = jhY.A06;
        String str2 = jhY.A08;
        AnonymousClass7TF.A1H(str, str2);
        1NY A0a = AnonymousClass7TG.A0a(vki.A00);
        A0a.A0A("lead_gen/get_lead_form_v2/");
        A0a.A9m(C273654mx.A00(586), str);
        A0a.A9m("entrypoint", str2);
        DbY.A19(jhY, new MH3(jhY, (AnonymousClass4D7) null, 2), JUM.A01(new C66161MFy(26, (AnonymousClass4D7) null), JUM.A00(new C66161MFy(25, (AnonymousClass4D7) null), DbT.A0R((15p) null, A0a, CE5.class, D1Q.class, false).A03(2079920282))));
        AnonymousClass0fD.A09(-1041856321, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1329447045);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_consumer_initialization_view, viewGroup, false);
        AnonymousClass0fD.A09(-790884051, A02);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.K4w, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(596728286);
        C61378K4w.super.onStart();
        this.A00 = AnonymousClass11O.A03(DbW.A0E(this), JTO.A1I(new C20592WvV(this, (AnonymousClass4D7) null, 28), ((C60215JhY) this.A01.getValue()).A0A));
        AnonymousClass0fD.A09(-267229381, A02);
    }

    public final void onStop() {
        int A02 = AnonymousClass0fD.A02(1291840910);
        C61378K4w.super.onStop();
        this.A00 = JTQ.A0n(this.A00);
        AnonymousClass0fD.A09(1285364171, A02);
    }
}
