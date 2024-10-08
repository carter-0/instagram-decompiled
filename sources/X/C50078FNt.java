package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.FNt  reason: case insensitive filesystem */
public final class C50078FNt implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C314466iJ A02;
    public final /* synthetic */ 2Er A03;

    public C50078FNt(View view, UserSession userSession, C314466iJ r3, 2Er r4) {
        this.A00 = view;
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1575177959);
        View view2 = this.A00;
        0qQ.A0A(view2);
        UserSession userSession = this.A01;
        2Er r4 = this.A03;
        C314466iJ r3 = this.A02;
        View findViewById = view2.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            AnonymousClass7TG.A0g(AnonymousClass7TE.A0q(userSession), C273654mx.A00(3042)).apply();
            C48827Ekp.A00(findViewById);
            r3.DUr();
            String C6C = r4.C6C();
            if (C6C != null) {
                C48954Ems.A00(userSession, C6C, "moderation_controls_dismissed", "impression", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
            }
        }
        AnonymousClass0fD.A0C(2004995575, A05);
    }
}
