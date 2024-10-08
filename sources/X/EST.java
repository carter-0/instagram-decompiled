package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class EST extends C47518E6c implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "NotificationOptionsRedesignFragment";
    public UserSession A00;
    public C49882FBg A01;
    public boolean A02;
    public final C49398Ev0 A03 = new C49398Ev0(this);

    public final String getModuleName() {
        return "notifications";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void configureActionBar(2da r2) {
        C47518E6c.A04(this, r2, 2131968673);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1300027173);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A02 = Boolean.TRUE.equals(DbU.A0g(requireArguments, "only_show_push"));
        this.A01 = new C49882FBg(this.A00, this);
        AnonymousClass0fD.A09(-1498048344, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-927070838);
        super.onResume();
        new F3U(this, this.A00, this.A01, this.A02).A00(this.A03);
        AnonymousClass0fD.A09(-563196915, A022);
    }
}
