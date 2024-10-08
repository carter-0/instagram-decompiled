package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.2qK  reason: invalid class name and case insensitive filesystem */
public final class C230822qK implements C252243on {
    public AnonymousClass2rI A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C231002qi A05;
    public final AnonymousClass2qU A06 = new Object();
    public final C230882qT A07;
    public final C227872kC A08;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object, X.2qU] */
    public C230822qK(C229382nI r33, AnonymousClass0iw r34, UserSession userSession, C227872kC r36, C227802jw r37) {
        this.A08 = r36;
        AnonymousClass0iw r31 = r34;
        this.A03 = r31;
        UserSession userSession2 = userSession;
        this.A04 = userSession2;
        1YN A002 = AnonymousClass2bO.A00();
        0eP r0 = new 0eP(QPTooltipAnchor.DIRECT_REPLY_TO_AUTHOR_BUTTON, new C230832qM());
        0eP r15 = new 0eP(QPTooltipAnchor.DIRECT_ICON, new C230852qO());
        0eP r14 = new 0eP(QPTooltipAnchor.CREATE_POST_ICON, new C230862qP());
        0eP r13 = new 0eP(QPTooltipAnchor.PROFILE_TAB, new C230872qQ());
        0eP r12 = new 0eP(QPTooltipAnchor.EXPLORE_TAB, new C230872qQ());
        0eP r11 = new 0eP(QPTooltipAnchor.DIRECT_ICON_TAB_BAR, new C230872qQ());
        0eP r10 = new 0eP(QPTooltipAnchor.NEWS_TAB, new C230872qQ());
        0eP r9 = new 0eP(QPTooltipAnchor.SEARCH_ICON, new C230872qQ());
        0eP r8 = new 0eP(QPTooltipAnchor.MEDIA_OPTIONS_ICON, new C230872qQ());
        0eP r7 = new 0eP(QPTooltipAnchor.HOME_HEADER_ACTIVITY_BUTTON, new C230872qQ());
        0eP r25 = r9;
        0eP r26 = r8;
        0eP r27 = r7;
        0eP r22 = r12;
        0eP r23 = r11;
        0eP r24 = r10;
        0eP r19 = r15;
        0eP r20 = r14;
        0eP r21 = r13;
        0eP r18 = r0;
        C230882qT A042 = A002.A04(userSession2, 0Yt.A02(new 0eP[]{r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, new 0eP(QPTooltipAnchor.HOME_HEADER_CREATE_BUTTON, new C230872qQ()), new 0eP(QPTooltipAnchor.PROMOTE_CTA, new AnonymousClass2qR()), new 0eP(QPTooltipAnchor.CLIPS_TAB_ICON, new AnonymousClass2qS())}));
        this.A07 = A042;
        AnonymousClass2bO.A00();
        AnonymousClass2bO.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0e;
        AnonymousClass2bO.A00();
        C230892qV r82 = new C230892qV(this);
        C230912qX r72 = new C230912qX(this);
        AnonymousClass2qZ r6 = new AnonymousClass2qZ(this);
        C227802jw r5 = r37;
        C230932qb r102 = new C230932qb(r5, this);
        C230952qd r2 = new C230952qd(this);
        C230962qe r1 = new C230962qe(this);
        C230892qV r142 = r82;
        C230962qe r16 = r1;
        C230912qX r122 = r72;
        2bW A003 = 2bV.A00(r102, (AnonymousClass574) null, r122, (AnonymousClass2bQ) null, r142, (AnonymousClass573) null, r16, new C230982qg(this), r6, r2, A042, (AnonymousClass575) null, (Boolean) null);
        C230992qh r28 = new C230992qh(r5, r31, userSession2);
        SparseIntArray sparseIntArray = 2bq.A02;
        this.A05 = new C231002qi(r5, r33, r31, userSession2, A003, new 2bq(AnonymousClass1QO.A00(userSession2)), quickPromotionSlot, r28);
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onDestroyView() {
        this.A07.onDestroyView();
    }

    public final void onPause() {
        this.A07.onPause();
    }

    public final void onResume() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
