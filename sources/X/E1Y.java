package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class E1Y extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ReelDashboardActionsFragment";
    public UserSession A00;
    public C14631Tzd A01;
    public C46829Dm5 A02;
    public User A03;
    public C49533ExF A04;
    public boolean A05;
    public boolean A06;

    public final String getModuleName() {
        return "reel_dashboard_actions_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = -581991182(0xffffffffdd4f84f2, float:-9.3458392E17)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.E1Y.super.onCreate(r8)
            android.os.Bundle r3 = r7.mArguments
            r3.getClass()
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r7)
            r7.A00 = r0
            java.lang.String r0 = "ReelDashboardActionsFragment.VIEWER_USER_ID"
            java.lang.String r1 = X.DbU.A0l(r3, r0)
            com.instagram.common.session.UserSession r0 = r7.A00
            com.instagram.user.model.User r0 = X.DbV.A0j(r0, r1)
            r0.getClass()
            r7.A03 = r0
            java.lang.String r0 = "ReelDashboardActionsFragment.IS_COMMENTS_ACTION"
            boolean r0 = r3.getBoolean(r0)
            r7.A05 = r0
            java.lang.String r0 = "ReelDashboardActionsFragment.IS_COMMENT_LIKES_ACTION"
            boolean r0 = r3.getBoolean(r0)
            r7.A06 = r0
            com.instagram.common.session.UserSession r5 = r7.A00
            com.instagram.user.model.User r4 = r7.A03
            X.Tzd r3 = r7.A01
            X.ExF r1 = r7.A04
            java.lang.String r0 = "delegate is expected to be set after the fragment is created"
            X.17k.A07(r1, r0)
            X.Dm5 r0 = new X.Dm5
            r0.<init>(r5, r3, r4, r1)
            r7.A02 = r0
            com.instagram.user.model.User r0 = r7.A03
            int r0 = r0.BIW()
            r6 = 1
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            if (r0 != r6) goto L_0x0095
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.CPV()
            if (r0 != 0) goto L_0x0064
            X.EVe r0 = X.C48086EVe.BLOCK_FB_STORY_VIEWER
            r1.add(r0)
        L_0x0064:
            com.instagram.user.model.User r0 = r7.A03
            int r0 = r0.BIW()
            if (r0 == r6) goto L_0x0079
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.A1w()
            if (r0 != 0) goto L_0x0092
            X.EVe r0 = X.C48086EVe.HIDE_STORY
        L_0x0076:
            r1.add(r0)
        L_0x0079:
            X.EVe r0 = X.C48086EVe.VIEW_PROFILE
        L_0x007b:
            r1.add(r0)
        L_0x007e:
            X.Dm5 r3 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x008b
            java.util.List r0 = r3.A01
            X.DbW.A0z(r3, r1, r0)
        L_0x008b:
            r0 = -983530908(0xffffffffc5608264, float:-3592.1494)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0092:
            X.EVe r0 = X.C48086EVe.UNHIDE_STORY
            goto L_0x0076
        L_0x0095:
            com.instagram.common.session.UserSession r0 = r7.A00
            X.0Tu r5 = X.0Tu.A05
            r3 = 36326631526119312(0x810ee100003790, double:3.036446280497556E-306)
            boolean r3 = X.DbY.A1Y(r5, r0, r3)
            com.instagram.common.session.UserSession r0 = r7.A00
            if (r3 == 0) goto L_0x0150
            com.instagram.user.model.User r4 = X.DbT.A0j(r0)
            X.EVe r0 = X.C48086EVe.VIEW_PROFILE
            r1.add(r0)
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.A1w()
            if (r0 != 0) goto L_0x014c
            X.EVe r0 = X.C48086EVe.HIDE_STORY
        L_0x00b9:
            r1.add(r0)
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x00d3
            X.EVe r0 = X.C48086EVe.DELETE_COMMENT
            r1.add(r0)
            X.EVe r0 = X.C48086EVe.REPORT_COMMENT
            r1.add(r0)
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x00d3
            X.EVe r0 = X.C48086EVe.VIEW_LIKES
            r1.add(r0)
        L_0x00d3:
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.A2A()
            if (r0 == 0) goto L_0x00e0
            X.EVe r0 = X.C48086EVe.REMOVE_FOLLOWER
            r1.add(r0)
        L_0x00e0:
            com.instagram.common.session.UserSession r0 = r7.A00
            X.0xa r3 = X.AnonymousClass7TE.A0q(r0)
            r0 = 1744(0x6d0, float:2.444E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.DbT.A1a(r3, r0)
            if (r0 == r6) goto L_0x00f7
            X.EVe r0 = X.C48086EVe.NO_STORY_REPLIES
            r1.add(r0)
        L_0x00f7:
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.A2A()
            if (r0 != 0) goto L_0x0114
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.A29()
            if (r0 != 0) goto L_0x0114
            java.lang.Integer r3 = r4.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r3 != r0) goto L_0x0114
            X.EVe r0 = X.C48086EVe.SWITCH_TO_PRIVATE
            r1.add(r0)
        L_0x0114:
            X.Tzd r0 = r7.A01
            if (r0 == 0) goto L_0x012e
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x012e
            com.instagram.common.session.UserSession r0 = r7.A00
            r3 = 36321387371046202(0x810a1c0000253a, double:3.033129855712804E-306)
            boolean r0 = X.DbY.A1Y(r5, r0, r3)
            if (r0 == 0) goto L_0x012e
            X.EVe r0 = X.C48086EVe.UNMARK_SPAM
            r1.add(r0)
        L_0x012e:
            com.instagram.common.session.UserSession r0 = r7.A00
            r3 = 36324376668483636(0x810cd400033034, double:3.035020299449172E-306)
            boolean r0 = X.DbY.A1Y(r5, r0, r3)
            if (r0 == 0) goto L_0x0140
            X.EVe r0 = X.C48086EVe.RESTRICT
            r1.add(r0)
        L_0x0140:
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.CPV()
            if (r0 != 0) goto L_0x007e
            X.EVe r0 = X.C48086EVe.BLOCK
            goto L_0x007b
        L_0x014c:
            X.EVe r0 = X.C48086EVe.UNHIDE_STORY
            goto L_0x00b9
        L_0x0150:
            r3 = 36324376668483636(0x810cd400033034, double:3.035020299449172E-306)
            boolean r0 = X.DbY.A1Y(r5, r0, r3)
            if (r0 == 0) goto L_0x0160
            X.EVe r0 = X.C48086EVe.RESTRICT
            r1.add(r0)
        L_0x0160:
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.CPV()
            if (r0 != 0) goto L_0x016d
            X.EVe r0 = X.C48086EVe.BLOCK
            r1.add(r0)
        L_0x016d:
            X.Tzd r0 = r7.A01
            if (r0 == 0) goto L_0x0187
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0187
            com.instagram.common.session.UserSession r0 = r7.A00
            r3 = 36321387371046202(0x810a1c0000253a, double:3.033129855712804E-306)
            boolean r0 = X.DbY.A1Y(r5, r0, r3)
            if (r0 == 0) goto L_0x0187
            X.EVe r0 = X.C48086EVe.UNMARK_SPAM
            r1.add(r0)
        L_0x0187:
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.A2A()
            if (r0 == 0) goto L_0x0194
            X.EVe r0 = X.C48086EVe.REMOVE_FOLLOWER
            r1.add(r0)
        L_0x0194:
            com.instagram.user.model.User r0 = r7.A03
            boolean r0 = r0.A1w()
            if (r0 != 0) goto L_0x01b7
            X.EVe r0 = X.C48086EVe.HIDE_STORY
        L_0x019e:
            r1.add(r0)
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0079
            X.EVe r0 = X.C48086EVe.DELETE_COMMENT
            r1.add(r0)
            X.EVe r0 = X.C48086EVe.REPORT_COMMENT
            r1.add(r0)
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x0079
            X.EVe r0 = X.C48086EVe.VIEW_LIKES
            goto L_0x0076
        L_0x01b7:
            X.EVe r0 = X.C48086EVe.UNHIDE_STORY
            goto L_0x019e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1Y.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(339511068);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_reel_dashboard_actions);
        AnonymousClass0fD.A09(475722516, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C252063oV A0Z = DbU.A0Z(view, R.id.title_text_view);
        2b1.A01(view.requireViewById(R.id.bottom_sheet_nav_bar_divider), false, false).setVisibility(0);
        DbU.A1H((TextView) A0Z.getView(), this.A03);
        A0Z.setVisibility(0);
        if (DbY.A1Y(0Tu.A05, this.A00, 36324376668352562L)) {
            DbU.A1S(this, DbV.A0T(view, R.id.title_image_view, false).getView(), this.A03);
            ((TextView) A0Z.getView()).setTextAppearance(A0Z.getView().getContext(), R.style.igds_emphasized_body_1);
            DbT.A17(A0Z.getView().getContext(), (TextView) A0Z.getView(), 2Yu.A07(A0Z.getView().getContext()));
        }
        RecyclerView A0K = DbX.A0K(view);
        DbY.A15(this, A0K);
        A0K.setAdapter(this.A02);
    }
}
