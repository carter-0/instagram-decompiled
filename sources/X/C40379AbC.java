package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.AbC  reason: case insensitive filesystem */
public final class C40379AbC implements MTZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4D6 A02;
    public final /* synthetic */ 1GK A03;
    public final /* synthetic */ L83 A04;
    public final /* synthetic */ FilterGroupModel A05;
    public final /* synthetic */ AnonymousClass3Q2 A06;
    public final /* synthetic */ C352218Cl A07;
    public final /* synthetic */ Runnable A08;
    public final /* synthetic */ boolean A09;

    public C40379AbC(Context context, UserSession userSession, AnonymousClass4D6 r3, 1GK r4, L83 l83, FilterGroupModel filterGroupModel, AnonymousClass3Q2 r7, C352218Cl r8, Runnable runnable, boolean z) {
        this.A01 = userSession;
        this.A06 = r7;
        this.A09 = z;
        this.A00 = context;
        this.A07 = r8;
        this.A05 = filterGroupModel;
        this.A04 = l83;
        this.A02 = r3;
        this.A08 = runnable;
        this.A03 = r4;
    }

    public final void DVt() {
        C59797JYq.A07(this.A00, this.A01, this.A06, "template_overlay_failed_to_save");
    }

    public final void DVu(String str) {
        ShareType shareType = ShareType.STORY_TEMPLATE_ASSET;
        UserSession userSession = this.A01;
        AnonymousClass3Q2 A032 = C59797JYq.A03(userSession, shareType);
        A032.A33 = str;
        AnonymousClass3Q2 r6 = this.A06;
        r6.A0X(A032);
        if (this.A09) {
            Context context = this.A00;
            C352218Cl r7 = this.A07;
            FilterGroupModel filterGroupModel = this.A05;
            L83 l83 = this.A04;
            C59797JYq.A05(context, userSession, this.A02, this.A03, l83, filterGroupModel, r6, r7, this.A08, false);
            return;
        }
        this.A08.run();
    }
}
