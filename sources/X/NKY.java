package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

public final class NKY extends AnonymousClass32G implements C273494mf, C243853aD, C74435Pup {
    public static final String __redex_internal_original_name = "ReportingConfirmationV2BottomSheetFragment";
    public LinearLayout A00;
    public UserSession A01;
    public C331157Pu A02;
    public IgdsButton A03;
    public User A04;
    public C49530ExC A05;
    public C71038Oa2 A06;
    public C68505NKy A07;
    public C14068TpH A08;
    public NHU A09;
    public C70633OEe A0A;

    public final void D2Y(FollowStatus followStatus, User user) {
    }

    public final void D2p(User user) {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "reporting_confirmation_v2_bottom_sheet_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    private boolean A01() {
        C14068TpH tpH = this.A08;
        if (tpH != null) {
            switch (tpH.ordinal()) {
                case 6:
                case 20:
                case 27:
                case 37:
                case 52:
                case 53:
                case 67:
                case 68:
                    return DbY.A1Y(0Tu.A05, this.A01, 36326910698993736L);
            }
        }
        return false;
    }

    public final 0lg A0Y() {
        return this.A01;
    }

    public final void Diw(C69313NjE njE) {
        C71038Oa2 oa2 = this.A06;
        if (oa2 != null) {
            oa2.A05(2);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C66582MXn.A15(this.A00, i, i2);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final void Dix(C69313NjE njE) {
        int ordinal = njE.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 && this.A04 != null) {
                FragmentActivity requireActivity = requireActivity();
                UserSession userSession = this.A01;
                User user = this.A04;
                C331157Pu r2 = this.A02;
                AnonymousClass7TG.A1Q(userSession, user);
                String str = "DEFAULT";
                C49936FFp fFp = new C49936FFp((C3263576k) null, (C69445Nlp) null, (Boolean) null, (Boolean) null, "reporting_confirmation_v2_bottom_sheet_fragment", "frx_flow", user.B6o().name(), (String) null, "DEFAULT", str, AnonymousClass7TF.A0b(), user.BIW());
                C51050Fng fng = new C51050Fng(requireActivity, this, (C307896Rx) null, (C277014uI) null, (C277014uI) null, userSession, user, (String) null);
                C331127Pr A0e = DbX.A0e(userSession, true);
                A0e.A0x = true;
                C48887Eln.A00(requireActivity, this, (FragmentActivity) null, userSession, (C49475EwG) null, r2, A0e, user, fFp, (C51922G7q) null, fng);
            }
        } else if (this.A04 != null) {
            FragmentActivity requireActivity2 = requireActivity();
            UserSession userSession2 = this.A01;
            User user2 = this.A04;
            AnonymousClass7TG.A1O(userSession2, user2);
            C49960FGs.A04(requireActivity2, userSession2, this, user2, "reporting_report_confirmation_bottom_sheet", "reporting_confirmation_v2_bottom_sheet_fragment", (JSONObject) null, false);
        }
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: type inference failed for: r4v14, types: [X.Npb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v16, types: [X.OHe, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x022e, code lost:
        if (r5 == 0) goto L_0x0230;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 249128310(0xed96576, float:5.3592333E-30)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r6 = r13
            X.NKY.super.onCreate(r14)
            if (r14 == 0) goto L_0x0017
            X.C66580MXl.A1G(r13)
            r0 = 198907532(0xbdb168c, float:8.4389656E-32)
        L_0x0013:
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x0017:
            android.os.Bundle r0 = r13.requireArguments()
            com.instagram.common.session.UserSession r3 = X.DbX.A0U(r13)
            r13.A01 = r3
            X.OEe r2 = new X.OEe
            r2.<init>(r13, r3)
            r13.A0A = r2
            com.instagram.common.session.UserSession r3 = r13.A01
            java.lang.String r2 = "ReportingConstants.ARG_IS_ENCRYPTED_THREAD"
            boolean r2 = r0.getBoolean(r2)
            X.ExC r2 = X.ORV.A00(r3, r2)
            r13.A05 = r2
            java.lang.String r2 = "ReportingConstants.ARG_CONTENT_ID"
            java.lang.String r2 = r0.getString(r2)
            r2.getClass()
            boolean r2 = r13.A01()
            if (r2 == 0) goto L_0x010b
            android.content.Context r3 = r13.requireContext()
            com.instagram.common.session.UserSession r2 = r13.A01
            X.Nhl r4 = new X.Nhl
            r4.<init>(r3, r2, r13, r13)
        L_0x0050:
            r13.A07 = r4
            r13.A0V(r4)
            X.NKy r3 = r13.A07
            X.NHU r4 = r13.A09
            r4.getClass()
            com.instagram.user.model.User r6 = r13.A04
            boolean r2 = r3 instanceof X.C69231Nhl
            if (r2 == 0) goto L_0x011b
            X.Nhl r3 = (X.C69231Nhl) r3
            r3.A00 = r4
            r7 = 2131972189(0x7f13505d, float:1.9581379E38)
            r2 = 2131972188(0x7f13505c, float:1.9581377E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r2 = 24
            X.JwA r4 = new X.JwA
            r4.<init>((int) r7, (java.lang.Integer) r5, (int) r2)
            X.0gF r9 = X.C60340gF.A00
            X.NLT r2 = r3.A03
            r3.A09(r2, r4, r9)
            if (r6 == 0) goto L_0x0101
            java.lang.String r5 = r6.B8Q()
            android.content.Context r4 = r3.A01
            r2 = 2131972182(0x7f135056, float:1.9581364E38)
            java.lang.String r2 = X.DbW.A0h(r4, r5, r2)
        L_0x008d:
            X.0qQ.A0A(r2)
            r8 = 0
            r7 = 2
            X.N4Q r4 = new X.N4Q
            r4.<init>(r2)
            X.NLU r2 = r3.A04
            r3.A09(r2, r4, r9)
            X.NHU r2 = r3.A00
            if (r2 == 0) goto L_0x0240
            X.OM1 r2 = r2.A00()
            java.util.List r2 = r2.A0C
            if (r2 == 0) goto L_0x0240
            java.util.Iterator r9 = r2.iterator()
        L_0x00ac:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0240
            java.lang.Object r5 = r9.next()
            X.OHB r5 = (X.OHB) r5
            X.Nks r2 = r5.A00
            int r4 = r2.ordinal()
            if (r4 == r7) goto L_0x00ea
            r2 = 4
            if (r4 == r2) goto L_0x00cd
            r2 = 14
            if (r4 != r2) goto L_0x00ac
            X.NLa r2 = r3.A05
            r3.A09(r2, r5, r8)
            goto L_0x00ac
        L_0x00cd:
            if (r6 == 0) goto L_0x00ac
            com.instagram.common.session.UserSession r2 = r3.A02
            X.2f1 r2 = X.AnonymousClass2f1.A00(r2)
            boolean r2 = r2.A0Q(r6)
            if (r2 == 0) goto L_0x00ac
            X.NjT r2 = X.C69328NjT.VIEW_TYPE_ROW_FRX_V3
            X.JwL r5 = new X.JwL
            r5.<init>((com.instagram.user.model.User) r6, (X.C69328NjT) r2)
            X.NjE r4 = X.C69313NjE.UNFOLLOW
            X.NLk r2 = r3.A06
            r3.A09(r2, r5, r4)
            goto L_0x00ac
        L_0x00ea:
            if (r6 == 0) goto L_0x00ac
            boolean r2 = r6.CPV()
            if (r2 != 0) goto L_0x00ac
            X.NjT r2 = X.C69328NjT.VIEW_TYPE_ROW_FRX_V3
            X.JwL r5 = new X.JwL
            r5.<init>((com.instagram.user.model.User) r6, (X.C69328NjT) r2)
            X.NjE r4 = X.C69313NjE.BLOCK
            X.NLk r2 = r3.A06
            r3.A09(r2, r5, r4)
            goto L_0x00ac
        L_0x0101:
            android.content.Context r4 = r3.A01
            r2 = 2131972183(0x7f135057, float:1.9581366E38)
            java.lang.String r2 = r4.getString(r2)
            goto L_0x008d
        L_0x010b:
            android.content.Context r5 = r13.requireContext()
            com.instagram.common.session.UserSession r7 = r13.A01
            X.Nhm r4 = new X.Nhm
            r8 = r13
            r9 = r13
            r10 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0050
        L_0x011b:
            X.Nhm r3 = (X.C69232Nhm) r3
            r3.A01 = r4
            r3.A00 = r6
            r3.A06()
            X.NHU r2 = r3.A01
            r2.getClass()
            X.OM1 r6 = r2.A00()
            X.OKa r5 = r6.A0F
            r10 = 0
            if (r5 == 0) goto L_0x017a
            r2 = 2131238110(0x7f081cde, float:1.809249E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r2 = 2131165214(0x7f07001e, float:1.7944639E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r2 = 2131165184(0x7f070000, float:1.7944578E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r2 = 2131100230(0x7f060246, float:1.7812836E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.OHe r4 = new X.OHe
            r4.<init>()
            r4.A03 = r8
            r4.A00 = r10
            r4.A06 = r7
            r4.A02 = r7
            r4.A05 = r9
            r4.A01 = r9
            r4.A04 = r2
            X.NLh r2 = r3.A05
            r3.A09(r2, r10, r4)
            java.lang.String r4 = r5.A00
            r2 = 2131165230(0x7f07002e, float:1.7944671E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r12 = 1
            X.OGX r7 = new X.OGX
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            X.NLf r2 = r3.A08
            r3.A09(r2, r4, r7)
        L_0x017a:
            X.OKa r2 = r6.A06
            if (r2 == 0) goto L_0x01a5
            android.text.SpannableStringBuilder r4 = r2.A00()
            r2 = 2131165216(0x7f070020, float:1.7944643E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r2 = 2131165230(0x7f07002e, float:1.7944671E38)
            if (r5 != 0) goto L_0x0190
            r2 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x0190:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r2 = 2131165184(0x7f070000, float:1.7944578E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r11 = 1
            X.OGX r6 = new X.OGX
            r6.<init>(r7, r8, r9, r10, r11)
            X.NLi r2 = r3.A07
            r3.A09(r2, r4, r6)
        L_0x01a5:
            X.NHU r2 = r3.A01
            r2.getClass()
            X.OM1 r2 = r2.A00()
            java.util.List r7 = r2.A0C
            r6 = 0
            if (r7 == 0) goto L_0x0230
            r5 = 0
        L_0x01b4:
            int r2 = r7.size()
            if (r6 >= r2) goto L_0x022e
            java.lang.Object r8 = r7.get(r6)
            X.OHB r8 = (X.OHB) r8
            X.Nks r4 = r8.A00
            X.Nks r2 = X.C69413Nks.REPORT_CONTENT
            if (r4 == r2) goto L_0x01df
            X.Nks r2 = X.C69413Nks.PLACE_HOLDER_CONTENT_ACTION
            if (r4 == r2) goto L_0x01df
            X.Nks r2 = X.C69413Nks.PLACE_HOLDER_BULLY_CONTENT_ACTION
            if (r4 == r2) goto L_0x01df
            X.Nks r2 = X.C69413Nks.PLACE_HOLDER_I_JUST_DONT_LIKE_CONTENT_ACTION
            if (r4 == r2) goto L_0x01df
            X.Nks r2 = r8.A00
            int r4 = r2.ordinal()
            r2 = 14
            if (r4 == r2) goto L_0x0205
            switch(r4) {
                case 2: goto L_0x01ef;
                case 3: goto L_0x01e2;
                case 4: goto L_0x0209;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01e2;
                case 7: goto L_0x01df;
                case 8: goto L_0x01df;
                case 9: goto L_0x01df;
                case 10: goto L_0x01e2;
                case 11: goto L_0x01df;
                case 12: goto L_0x01e2;
                default: goto L_0x01df;
            }
        L_0x01df:
            int r6 = r6 + 1
            goto L_0x01b4
        L_0x01e2:
            r2 = 1
            X.Npb r4 = new X.Npb
            r4.<init>()
            r4.A00 = r5
            r4.A01 = r2
            X.NLe r2 = r3.A06
            goto L_0x0228
        L_0x01ef:
            com.instagram.user.model.User r2 = r3.A00
            if (r2 == 0) goto L_0x01df
            boolean r2 = r2.CPV()
            if (r2 != 0) goto L_0x01df
            com.instagram.user.model.User r4 = r3.A00
            X.NjT r2 = X.C69328NjT.VIEW_TYPE_ROW
            X.JwL r8 = new X.JwL
            r8.<init>((com.instagram.user.model.User) r4, (X.C69328NjT) r2)
            X.NjE r4 = X.C69313NjE.BLOCK
            goto L_0x0226
        L_0x0205:
            r4 = 0
            X.NLa r2 = r3.A09
            goto L_0x0228
        L_0x0209:
            com.instagram.user.model.User r2 = r3.A00
            if (r2 == 0) goto L_0x01df
            com.instagram.common.session.UserSession r2 = r3.A04
            X.2f1 r4 = X.AnonymousClass2f1.A00(r2)
            com.instagram.user.model.User r2 = r3.A00
            boolean r2 = r4.A0Q(r2)
            if (r2 == 0) goto L_0x01df
            com.instagram.user.model.User r4 = r3.A00
            X.NjT r2 = X.C69328NjT.VIEW_TYPE_ROW
            X.JwL r8 = new X.JwL
            r8.<init>((com.instagram.user.model.User) r4, (X.C69328NjT) r2)
            X.NjE r4 = X.C69313NjE.UNFOLLOW
        L_0x0226:
            X.NLk r2 = r3.A0A
        L_0x0228:
            r3.A09(r2, r8, r4)
            int r5 = r5 + 1
            goto L_0x01df
        L_0x022e:
            if (r5 != 0) goto L_0x023d
        L_0x0230:
            X.2s2 r4 = r3.A03
            android.content.Context r2 = r3.A02
            int r2 = X.C51972G9s.A08(r2)
            r4.A03 = r2
            r3.A08(r4, r10)
        L_0x023d:
            r3.A07()
        L_0x0240:
            java.lang.String r2 = "ReportingConstants.ARG_IS_INTEROP_THREAD"
            r0.getBoolean(r2)
            java.lang.String r2 = "ReportingConstants.ARG_DIRECT_THREAD_ID"
            r0.getString(r2)
            r0 = -1000254728(0xffffffffc46152f8, float:-901.2964)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKY.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1835594407);
        View A0C = DbT.A0C(DbV.A0E(this), viewGroup, R.layout.frx_report_confirmation_fragment);
        AnonymousClass0fD.A09(-795872490, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-997909196);
        super.onDestroyView();
        C71038Oa2 oa2 = this.A06;
        if (oa2 != null) {
            oa2.A01();
        }
        this.A03 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(-87976973, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C71038Oa2 oa2 = this.A06;
        if (oa2 != null) {
            oa2.A05(2);
        }
        if (A01()) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.frx_report_confirmation_button_wrapper);
            this.A00 = linearLayout;
            AnonymousClass7TF.A16(linearLayout);
            IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.frx_report_confirmation_close_button);
            this.A03 = igdsButton;
            if (igdsButton != null) {
                igdsButton.setText(2131960992);
                AnonymousClass0fU.A00(new C71406Ok5(this, 16), this.A03);
            }
        }
    }
}
