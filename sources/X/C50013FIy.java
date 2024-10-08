package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;

/* renamed from: X.FIy  reason: case insensitive filesystem */
public final class C50013FIy implements DialogInterface.OnClickListener {
    public final /* synthetic */ 0xF A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ SearchContext A04;
    public final /* synthetic */ C243853aD A05;
    public final /* synthetic */ C267064at A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ C249763kK A08;
    public final /* synthetic */ Double A09;
    public final /* synthetic */ String A0A;

    public C50013FIy(0xF r1, UserSession userSession, 1Xj r3, AnonymousClass3W1 r4, SearchContext searchContext, C243853aD r6, C267064at r7, User user, C249763kK r9, Double d, String str) {
        this.A07 = user;
        this.A01 = userSession;
        this.A06 = r7;
        this.A05 = r6;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A08 = r9;
        this.A0A = str;
        this.A04 = searchContext;
        this.A09 = d;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        User user = this.A07;
        UserSession userSession = this.A01;
        C49173Eqe.A00(userSession, user, "user_selected_continue_on_dialog");
        C267064at r6 = this.A06;
        C243853aD r5 = this.A05;
        1Xj r2 = this.A02;
        AnonymousClass3W1 r3 = this.A03;
        C267064at.A01(this.A00, userSession, r2, r3, this.A04, r5, r6, user, this.A09, this.A0A);
    }
}
