package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.NKf  reason: case insensitive filesystem */
public final class C68487NKf extends C273374mT implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "UnifiedIdentitySettingsFragment";
    public 1aU A00;
    public 17i A01;
    public final 1a8 A02 = C66580MXl.A0O();

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static 1aU A00(C68487NKf nKf) {
        UserSession session = nKf.getSession();
        AnonymousClass61K r1 = AnonymousClass61K.DEV_OPTIONS;
        0qQ.A0B(session, 0);
        return AnonymousClass6AN.A02(session, r1, AnonymousClass45R.A00(session)).A00();
    }

    public static void A01(IgTextView igTextView, C68487NKf nKf) {
        String string = C70089Nx5.A00(nKf.getSession()).A01.getString("msys_linked_thread_igid", (String) null);
        if (!0mp.A0B(string)) {
            DbX.A1F(igTextView, nKf, string, 2131957663);
        } else {
            igTextView.setText(2131957664);
        }
    }

    public final void configureActionBar(2da r2) {
        r2.Eom(2131975816);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1957698888);
        C68487NKf.super.onCreate(bundle);
        this.A00 = 1aD.A01(getSession(), __redex_internal_original_name).A02;
        this.A01 = 17h.A00(getSession());
        AnonymousClass0fD.A09(1523234590, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x007e, code lost:
        if (r0 != null) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = 2090408604(0x7c991a9c, float:6.359689E36)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131627494(0x7f0e0de6, float:1.8882254E38)
            r1 = 0
            android.view.View r4 = r10.inflate(r0, r11, r1)
            r0 = 2131436558(0x7f0b240e, float:1.849499E38)
            android.view.View r5 = r4.requireViewById(r0)
            X.1a8 r7 = r9.A02
            X.1aU r2 = r9.A00
            r0 = 33
            X.1aU r2 = X.C72118Owd.A00(r2, r0)
            r0 = 24
            X.PU9.A00(r2, r7, r9, r5, r0)
            r0 = 2131429796(0x7f0b09a4, float:1.8481275E38)
            android.view.View r2 = r4.requireViewById(r0)
            r0 = 36
            X.C71399Ojy.A00(r2, r4, r5, r9, r0)
            r0 = 2131436559(0x7f0b240f, float:1.8494992E38)
            com.instagram.common.ui.base.IgTextView r5 = X.DbT.A0a(r4, r0)
            A01(r5, r9)
            r0 = 2131429797(0x7f0b09a5, float:1.8481277E38)
            android.view.View r2 = r4.requireViewById(r0)
            r0 = 37
            X.C71399Ojy.A00(r2, r4, r5, r9, r0)
            r0 = 2131441346(0x7f0b36c2, float:1.8504701E38)
            android.view.View r5 = r4.requireViewById(r0)
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            r2 = 34
            X.OlD r0 = new X.OlD
            r0.<init>(r9, r2)
            r5.setOnCheckedChangeListener(r0)
            r0 = 2131431271(0x7f0b0f67, float:1.8484266E38)
            android.view.View r8 = r4.requireViewById(r0)
            android.widget.CompoundButton r8 = (android.widget.CompoundButton) r8
            com.instagram.common.session.UserSession r0 = r9.getSession()
            X.OBq r6 = X.C70089Nx5.A00(r0)
            java.lang.Boolean r0 = r6.A00
            r5 = 0
            if (r0 != 0) goto L_0x0080
            X.0xa r2 = r6.A01
            java.lang.String r0 = "cutover_thread_deduplication"
            boolean r0 = r2.getBoolean(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A00 = r0
            if (r0 == 0) goto L_0x0084
        L_0x0080:
            boolean r5 = r0.booleanValue()
        L_0x0084:
            r8.setChecked(r5)
            r2 = 35
            X.OlD r0 = new X.OlD
            r0.<init>(r9, r2)
            r8.setOnCheckedChangeListener(r0)
            r0 = 2131436556(0x7f0b240c, float:1.8494986E38)
            android.view.View r8 = r4.requireViewById(r0)
            java.lang.String r6 = "msys_db"
            r5 = 5
            X.Oib r0 = new X.Oib
            r0.<init>(r6, r9, r5)
            X.AnonymousClass0fU.A00(r0, r8)
            r0 = 2131436554(0x7f0b240a, float:1.8494982E38)
            android.view.View r8 = r4.requireViewById(r0)
            java.lang.String r6 = "crypto_db"
            X.Oib r0 = new X.Oib
            r0.<init>(r6, r9, r5)
            X.AnonymousClass0fU.A00(r0, r8)
            r0 = 2131436557(0x7f0b240d, float:1.8494988E38)
            android.view.View r8 = r4.requireViewById(r0)
            java.lang.String r6 = "reverb_db"
            X.Oib r0 = new X.Oib
            r0.<init>(r6, r9, r5)
            X.AnonymousClass0fU.A00(r0, r8)
            r0 = 2131436555(0x7f0b240b, float:1.8494984E38)
            android.view.View r8 = r4.requireViewById(r0)
            r0 = 2311(0x907, float:3.238E-42)
            java.lang.String r6 = X.C273654mx.A00(r0)
            X.Oib r0 = new X.Oib
            r0.<init>(r6, r9, r5)
            X.AnonymousClass0fU.A00(r0, r8)
            r0 = 2131436553(0x7f0b2409, float:1.849498E38)
            android.view.View r8 = r4.requireViewById(r0)
            r6 = 10
            X.Ok5 r0 = new X.Ok5
            r0.<init>((X.C68487NKf) r9, (int) r6)
            X.AnonymousClass0fU.A00(r0, r8)
            r0 = 2131428142(0x7f0b032e, float:1.847792E38)
            android.widget.TextView r6 = X.DbU.A0G(r4, r0)
            r0 = 2131428138(0x7f0b032a, float:1.8477912E38)
            android.view.View r8 = r4.requireViewById(r0)
            com.instagram.common.session.UserSession r0 = r9.getSession()
            X.2HN r0 = X.2HM.A00(r0)
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x017b
            r8.setVisibility(r1)
            r1 = 9
            X.Ok5 r0 = new X.Ok5
            r0.<init>((X.C68487NKf) r9, (int) r1)
            X.AnonymousClass0fU.A00(r0, r8)
            android.content.res.Resources r1 = r6.getResources()
            android.content.Context r0 = r9.requireContext()
            int r0 = X.2Yu.A03(r0)
            int r0 = r1.getColor(r0)
            r6.setTextColor(r0)
            r0 = 2131953173(0x7f130615, float:1.954281E38)
            r6.setText(r0)
            X.1aU r0 = A00(r9)
            X.PU7.A00(r0, r7, r4, r2)
        L_0x0134:
            r0 = 2131437224(0x7f0b26a8, float:1.849634E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.Ok5 r0 = new X.Ok5
            r0.<init>((X.C68487NKf) r9, (int) r5)
            X.AnonymousClass0fU.A00(r0, r1)
            r0 = 2131432152(0x7f0b12d8, float:1.8486053E38)
            android.view.View r2 = r4.requireViewById(r0)
            r1 = 6
            X.Ok5 r0 = new X.Ok5
            r0.<init>((X.C68487NKf) r9, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r0 = 2131432154(0x7f0b12da, float:1.8486057E38)
            android.view.View r2 = r4.requireViewById(r0)
            r1 = 7
            X.Ok5 r0 = new X.Ok5
            r0.<init>((X.C68487NKf) r9, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r0 = 2131432153(0x7f0b12d9, float:1.8486055E38)
            android.view.View r2 = r4.requireViewById(r0)
            r1 = 8
            X.Ok5 r0 = new X.Ok5
            r0.<init>((X.C68487NKf) r9, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r0 = 608998426(0x244c941a, float:4.4360896E-17)
            X.AnonymousClass0fD.A09(r0, r3)
            return r4
        L_0x017b:
            r0 = 8
            r8.setVisibility(r0)
            android.content.res.Resources r2 = r6.getResources()
            android.content.Context r1 = r9.requireContext()
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r2.getColor(r0)
            r6.setTextColor(r0)
            r0 = 2131953172(0x7f130614, float:1.9542807E38)
            r6.setText(r0)
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68487NKf.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1985976517);
        super.onDestroyView();
        this.A02.A01();
        AnonymousClass0fD.A09(-762899052, A022);
    }
}
