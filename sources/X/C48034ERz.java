package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.ERz  reason: case insensitive filesystem */
public final class C48034ERz extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "VerifiedUserCallingAllowlistTypeSelectionFragment";
    public int A00;
    public String A01 = AnonymousClass000.A00(2750);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131954540);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.E6c, X.0iw, androidx.fragment.app.Fragment, X.ERz, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        AnonymousClass0eM r2 = this.A02;
        1OC A003 = C64028LJp.A00(AnonymousClass7TE.A0l(r2));
        C47696EDf.A01(A003, this, 36);
        1ES.A00(requireContext, A002, A003);
        Dba.A1I(DbX.A0P(this, r2), "call_settings_page_impression");
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2085719142);
        super.onCreate(bundle);
        String A0o = DbX.A0o(this);
        if (A0o != null) {
            this.A01 = A0o;
        }
        AnonymousClass0fD.A09(-56241520, A022);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.2jx, androidx.fragment.app.Fragment, X.ERz, java.lang.Object] */
    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(597955744);
        super.onResume();
        Context requireContext = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        1OC A003 = C64028LJp.A00(AnonymousClass7TE.A0l(this.A02));
        C47696EDf.A01(A003, this, 36);
        1ES.A00(requireContext, A002, A003);
        AnonymousClass0fD.A09(-892804855, A022);
    }
}
