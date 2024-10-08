package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.Flv  reason: case insensitive filesystem */
public final class C50968Flv implements C295005nO {
    public final /* synthetic */ long A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ IgFrameLayout A03;
    public final /* synthetic */ C2367234v A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C50968Flv(View view, View view2, IgFrameLayout igFrameLayout, C2367234v r4, long j, boolean z, boolean z2) {
        this.A04 = r4;
        this.A02 = view;
        this.A01 = view2;
        this.A06 = z;
        this.A00 = j;
        this.A03 = igFrameLayout;
        this.A05 = z2;
    }

    public final void onFinish() {
        View view;
        C2367234v r8 = this.A04;
        if (r8.A09) {
            view = this.A02.findViewById(R.id.group_story_peek_layout);
        } else {
            view = this.A01;
        }
        if (this.A06 && view != null) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(r8.A03, AnonymousClass7TF.A0d(r8.A04.getResources(), 2131954710));
            A0f.A03(view);
            A0f.A01();
            A0f.A00 = (int) (1000 * this.A00);
            A0f.A0A = true;
            AnonymousClass5Gv A002 = A0f.A00();
            UserSession userSession = r8.A06;
            A002.A07(userSession);
            0xY A0N = AnonymousClass7TF.A0N(userSession);
            A0N.E5T("has_seen_group_stories_peek_nux_tooltip", true);
            A0N.apply();
        }
        View view2 = this.A01;
        IgFrameLayout igFrameLayout = this.A03;
        View view3 = this.A02;
        AnonymousClass0fU.A00(new FOB(1, view2, view3, igFrameLayout, r8, this.A05), view2);
        view3.postDelayed(new C51518FvQ(view2, view3, igFrameLayout, r8), 1000 * this.A00);
    }
}
