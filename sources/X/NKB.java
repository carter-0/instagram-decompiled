package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

public final class NKB extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "DirectNotificationMessagesUserControllerFragment";
    public NL5 A00;
    public OHK A01;
    public O71 A02;
    public C74449Pv4 A03;
    public N4P A04;
    public C254793t3 A05;
    public String A06;
    public String A07;
    public RecyclerView A08;
    public Capabilities A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final 1a8 A0B = C66580MXl.A0O();
    public final String A0C = "direct_recurring_notifications";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A08 = DbZ.A0F(view, R.id.notification_messages_bottom_sheeet);
        NL5 nl5 = new NL5(requireContext());
        this.A00 = nl5;
        RecyclerView recyclerView = this.A08;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setAdapter(nl5);
            RecyclerView recyclerView2 = this.A08;
            if (recyclerView2 != null) {
                DbU.A15(getContext(), recyclerView2, 1, false);
                1a8 r2 = this.A0B;
                C74449Pv4 pv4 = this.A03;
                if (pv4 != null) {
                    PU8.A00(pv4.BNa().APA(), r2, this, 24);
                    C74449Pv4 pv42 = this.A03;
                    if (pv42 != null) {
                        C74550Pwj.A00(pv42);
                        return;
                    }
                }
                str = "clientInfra";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
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

    public final String getModuleName() {
        return this.A0C;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
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

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.NKB r13, java.lang.Integer r14, java.lang.Integer r15) {
        /*
            int r2 = r15.intValue()
            r0 = 3
            if (r2 == r0) goto L_0x0090
            r0 = 2
            if (r2 == r0) goto L_0x0061
            r3 = 0
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r13.getActivity()
            if (r2 == r3) goto L_0x005b
            X.DbX.A10(r0, r1)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
        L_0x0018:
            X.N4P r0 = r13.A04
            if (r0 == 0) goto L_0x00ca
            com.instagram.user.model.User r0 = X.N4P.A01(r0)
            java.lang.String r8 = r0.getId()
            X.0eM r7 = r13.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            java.lang.Class<X.1kn> r0 = X.AnonymousClass1kn.class
            X.MaY r6 = X.C66669Mac.A08(r1, r0)
            java.lang.String r5 = r13.A06
            if (r5 == 0) goto L_0x0150
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r3 == r0) goto L_0x003e
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 == r0) goto L_0x003e
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x003e:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0055;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r4 = "UNKNOWN"
        L_0x0047:
            X.3t3 r0 = r13.A05
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "threadId"
        L_0x004d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0055:
            java.lang.String r4 = "RESUME_MESSAGES"
            goto L_0x0047
        L_0x0058:
            java.lang.String r4 = "STOP_MESSAGES"
            goto L_0x0047
        L_0x005b:
            X.DbX.A10(r0, r1)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x0018
        L_0x0061:
            X.OHK r4 = r13.A01
            if (r4 == 0) goto L_0x00ca
            com.instagram.common.session.UserSession r7 = r4.A01
            android.app.Activity r5 = r4.A00
            X.NKB r6 = r4.A02
            java.lang.String r10 = r4.A05
            X.TpH r8 = X.C14068TpH.NOTIFICATION_MESSAGES_ADMIN_TEXT
            X.UzD r9 = X.C16677UzD.DIRECT_MESSAGE_THREAD
            X.OcF r3 = X.ORV.A01(r5, r6, r7, r8, r9, r10)
            X.17i r1 = r4.A04
            java.lang.String r0 = r4.A06
            com.instagram.user.model.User r0 = r1.A02(r0)
            r3.A01 = r0
            r1 = 0
            X.Uu8 r0 = new X.Uu8
            r0.<init>(r5, r1)
            r3.A07(r0)
            r3.A05 = r10
            X.7Pu r0 = r4.A03
            X.C71093OcF.A00(r0, r3)
            goto L_0x00ca
        L_0x0090:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r13.getActivity()
            X.DbX.A10(r0, r1)
            X.N4P r3 = r13.A04
            if (r3 == 0) goto L_0x00ca
            X.Pv4 r0 = r13.A03
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "clientInfra"
            goto L_0x004d
        L_0x00a4:
            X.7ZA r1 = r0.C62()
            X.3t3 r0 = r3.A0L
            r1.Cp4(r13, r0)
            goto L_0x00ca
        L_0x00ae:
            java.lang.String r3 = X.C66580MXl.A0x(r0)
            r0 = 1
            X.DbW.A1N(r6, r0, r3)
            X.1kn r1 = new X.1kn
            r1.<init>(r6)
            r1.A02 = r5
            r1.A01 = r8
            r1.A03 = r4
            r1.A00 = r3
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.C66580MXl.A1P(r0, r1)
        L_0x00ca:
            X.N4P r0 = r13.A04
            if (r0 == 0) goto L_0x0139
            X.0eM r0 = r0.A0c
            java.util.List r0 = X.JTO.A15(r0)
            r10 = 0
            java.lang.Object r0 = r0.get(r10)
            X.N9q r0 = (X.C68303N9q) r0
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r8 = r0.getId()
            X.O71 r0 = r13.A02
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "logger"
            goto L_0x004d
        L_0x00e9:
            long r11 = java.lang.Long.parseLong(r8)
            java.lang.String r7 = r13.A06
            if (r7 == 0) goto L_0x0150
            r9 = 1
            r6 = 3
            X.0qQ.A0B(r14, r6)
            X.0wc r1 = r0.A00
            java.lang.String r0 = "ig_notification_messages_manage_notification_click"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r14 != r0) goto L_0x0148
            r4 = 1
        L_0x0103:
            r3 = 1
            if (r2 == r9) goto L_0x010f
            r3 = 2
            if (r2 == r10) goto L_0x0146
            if (r2 == r6) goto L_0x0144
            if (r2 == r3) goto L_0x010f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x010f:
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x0139
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            java.lang.String r0 = "business_id"
            r5.A9F(r0, r1)
            X.C66580MXl.A1J(r5, r8)
            java.lang.String r0 = "token_ent_fbid"
            r5.AAJ(r0, r7)
            java.lang.String r1 = "entry_point"
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r2) goto L_0x013f
            X.AnonymousClass7TE.A1W(r5, r1, r4)
        L_0x012f:
            java.lang.String r1 = "action_type"
            if (r3 == r2) goto L_0x013a
            X.AnonymousClass7TE.A1W(r5, r1, r3)
        L_0x0136:
            r5.Cgf()
        L_0x0139:
            return
        L_0x013a:
            r0 = 0
            r5.AAJ(r1, r0)
            goto L_0x0136
        L_0x013f:
            r0 = 0
            r5.AAJ(r1, r0)
            goto L_0x012f
        L_0x0144:
            r3 = 3
            goto L_0x010f
        L_0x0146:
            r3 = 0
            goto L_0x010f
        L_0x0148:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 != r0) goto L_0x0103
            r4 = 0
            goto L_0x0103
        L_0x0150:
            java.lang.String r0 = "tokenEntId"
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKB.A00(X.NKB, java.lang.Integer, java.lang.Integer):void");
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1618190805);
        NKB.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A07 = C320236s2.A01(requireArguments, "DirectFragment.DIRECT_FRAGMENT_USER_ACTION_TYPE");
        this.A06 = C320236s2.A01(requireArguments, "DirectFragment.DIRECT_FRAGMENT_TOKEN_ENT_ID");
        this.A09 = (Capabilities) C320236s2.A00(requireArguments, Capabilities.class, "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        C254793t3 A002 = OXL.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A002 != null) {
            this.A05 = A002;
            Context requireContext = requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
            C254793t3 r1 = this.A05;
            if (r1 == null) {
                str = "threadId";
            } else {
                Capabilities capabilities = this.A09;
                if (capabilities == null) {
                    str = "threadCapabilities";
                } else {
                    C74449Pv4 A012 = C330397Mp.A01(requireContext, A0l, capabilities, r1);
                    this.A03 = A012;
                    if (A012 == null) {
                        str = "clientInfra";
                    } else {
                        C74550Pwj.A01(A012);
                        AnonymousClass0fD.A09(1321810711, A022);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("threadId can't be null");
        AnonymousClass0fD.A09(-2053759111, A022);
        throw A0z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2076381165);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_thread_notification_message_bottom_sheet, false);
        AnonymousClass0fD.A09(-1390177779, A022);
        return A0D;
    }
}
