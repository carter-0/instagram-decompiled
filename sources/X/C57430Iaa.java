package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.Iaa  reason: case insensitive filesystem */
public final class C57430Iaa implements C227182im {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass07V A01;
    public final /* synthetic */ C227762js A02;
    public final /* synthetic */ IgView A03;
    public final /* synthetic */ C228152ks A04;
    public final /* synthetic */ AnonymousClass365 A05;
    public final /* synthetic */ boolean A06;

    public C57430Iaa(Activity activity, AnonymousClass07V r2, C227762js r3, IgView igView, C228152ks r5, AnonymousClass365 r6, boolean z) {
        this.A05 = r6;
        this.A00 = activity;
        this.A03 = igView;
        this.A02 = r3;
        this.A06 = z;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void DmH(int i, int i2) {
        int i3;
        AnonymousClass365 r2 = this.A05;
        int i4 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        UserSession userSession = r2.A01;
        Activity activity = this.A00;
        IgView igView = this.A03;
        C227762js r5 = this.A02;
        int A0G = 2Yu.A0G(activity, R.attr.actionBarButtonWidth);
        if (C226122ff.A03()) {
            i3 = C226122ff.A01();
        } else {
            i3 = 0;
        }
        boolean z = this.A06;
        0qQ.A0B(igView, 3);
        HCA hca = new HCA(activity, r5, userSession, AnonymousClass7TE.A1I(igView), A0G + i3, z);
        r2.A00 = hca;
        C228152ks r1 = this.A04;
        AnonymousClass07V r0 = this.A01;
        r1.EBt(hca);
        r0.A09(hca);
    }
}
