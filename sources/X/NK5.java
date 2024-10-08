package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;

public final class NK5 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "DisappearingMessagesChangeDurationBottomSheet";
    public boolean A00;
    public RecyclerView A01;
    public C68504NKx A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final String A08 = "direct_disappearing_messages_change_duration_bottom_sheet";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e5, code lost:
        if (r6 != null) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d3 A[LOOP:0: B:26:0x00cd->B:28:0x00d3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r4 = 0
            r1 = r25
            X.0qQ.A0B(r1, r4)
            r9 = r24
            r0 = r26
            super.onViewCreated(r1, r0)
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbZ.A0F(r1, r0)
            r9.A01 = r0
            android.content.Context r15 = r9.requireContext()
            r0 = 0
            X.NKx r1 = new X.NKx
            r1.<init>(r15, r0, r0)
            r9.A02 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r9.A01
            if (r0 == 0) goto L_0x0029
            r0.setAdapter(r1)
        L_0x0029:
            androidx.recyclerview.widget.RecyclerView r0 = r9.A01
            r3 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0032
            X.DbU.A15(r15, r0, r8, r4)
        L_0x0032:
            X.0eM r2 = r9.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.2Dm r6 = X.1bJ.A00(r0)
            android.os.Bundle r5 = r9.requireArguments()
            java.lang.String r0 = "DisappearingMessagesChangeDurationBottomSheet.ARGUMENT_THREAD_TARGET"
            X.3t2 r0 = X.AnonymousClass9H0.A00(r5, r0)
            if (r0 == 0) goto L_0x0128
            X.3t1 r1 = X.AnonymousClass6W3.A02(r0)
            if (r1 == 0) goto L_0x0128
            java.lang.String r0 = "dm_transport_type_for_logging"
            java.lang.String r0 = r5.getString(r0)
            r9.A06 = r0
            com.instagram.model.direct.DirectThreadKey r0 = X.AnonymousClass6W4.A01(r1)
            X.3U9 r10 = r6.B33(r0)
            if (r10 == 0) goto L_0x0128
            java.lang.String r7 = r10.C6C()
            if (r7 == 0) goto L_0x0128
            X.7Lc r5 = X.C330017Lc.A00
            com.instagram.common.session.UserSession r1 = X.DbW.A0S(r2, r8)
            X.7Kc r0 = X.C329737Ka.A03(r1, r10)
            boolean r22 = r0.COW(r1, r10)
            r9.A05 = r7
            java.lang.Long r0 = X.C330007Lb.A01(r10)
            r9.A03 = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            java.lang.Long r0 = r5.A01(r0, r10)
            r9.A04 = r0
            X.4li r6 = r10.Axk()
            r5 = -1
            if (r6 == 0) goto L_0x00e4
            java.lang.Integer r0 = r6.A02
            if (r0 == 0) goto L_0x00e4
            int r1 = r0.intValue()
        L_0x0095:
            java.lang.Integer r0 = r6.A03
            if (r0 == 0) goto L_0x00e8
            int r0 = r0.intValue()
        L_0x009d:
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r2)
            X.3Tu r19 = r10.AiM()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r1 <= r5) goto L_0x00ac
            r3 = 1
        L_0x00ac:
            X.ODT r13 = new X.ODT
            r13.<init>(r0, r1, r3)
            com.instagram.common.session.UserSession r12 = X.DbW.A0S(r2, r4)
            boolean r11 = r10.CUG()
            boolean r5 = r10.CVr()
            boolean r4 = r10.COb()
            java.util.List r0 = r10.BRZ()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r0.iterator()
        L_0x00cd:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r2 = r14.next()
            r0 = r2
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            java.lang.String r0 = r12.A06
            X.DbY.A1T(r1, r0, r2, r3)
            goto L_0x00cd
        L_0x00e4:
            r1 = -1
            if (r6 == 0) goto L_0x00e8
            goto L_0x0095
        L_0x00e8:
            r0 = -1
            goto L_0x009d
        L_0x00ea:
            boolean r2 = r10.isPending()
            boolean r1 = r10.CUG()
            java.util.List r0 = r10.BRZ()
            boolean r0 = X.C66640Ma9.A06(r0, r2, r1)
            boolean r23 = X.C308556Us.A0W(r3, r11, r5, r4, r0)
            X.P0n r0 = new X.P0n
            r0.<init>(r15, r9, r10, r7)
            X.ONj r14 = new X.ONj
            r20 = r6
            r21 = r7
            r17 = r0
            r18 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r22 == 0) goto L_0x0118
            r0 = 2131960944(0x7f132470, float:1.955857E38)
            r14.A01(r15, r0)
        L_0x0118:
            r14.A02(r8, r8)
            java.util.List r0 = r14.A09
            java.util.List r1 = X.00k.A0a(r0)
            X.NKx r0 = r9.A02
            if (r0 == 0) goto L_0x0128
            r0.setItems(r1)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NK5.onViewCreated(android.view.View, android.os.Bundle):void");
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
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
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

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2081294069);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_disappearing_messages_change_duration_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1704605424, A022);
        return inflate;
    }

    public final void onDestroyView() {
        C69452Nlw nlw;
        int A022 = AnonymousClass0fD.A02(1047453670);
        super.onDestroyView();
        String str = this.A05;
        if (str != null && !this.A00) {
            0lg A0X = DbT.A0X(this.A07);
            Long l = this.A03;
            Long l2 = this.A04;
            String str2 = this.A06;
            0Aj A0H = C66582MXn.A0H(DbX.A0Q(A0X), "direct_disappearing_messages_toggle_on_cancel", str);
            A0H.A9F("ephemeral_lifetime_ms", l);
            A0H.A9F("after_view_lifetime_ms", l2);
            if (str2 != null) {
                nlw = C69882Ntk.A00(str2);
            } else {
                nlw = null;
            }
            A0H.A8M(nlw, TraceFieldType.TransportType);
            A0H.Cgf();
        }
        this.A01 = null;
        this.A02 = null;
        this.A00 = false;
        AnonymousClass0fD.A09(-801734598, A022);
    }
}
