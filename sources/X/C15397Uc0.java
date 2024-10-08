package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uc0  reason: case insensitive filesystem */
public final class C15397Uc0 extends AnonymousClass32G implements C229122ms, AnonymousClass4DU, AnonymousClass4DR, C229132mt, C227252iu, AnonymousClass0j6, AbsListView.OnScrollListener, AnonymousClass4DS, JPQ, AnonymousClass57Y {
    public static final String __redex_internal_original_name = "ManageTaggedMediaFragment";
    public 2dZ A00;
    public AnonymousClass0iw A01;
    public 1a8 A02;
    public UserSession A03;
    public C15463UdE A04;
    public F25 A05;
    public EVG A06 = EVG.TAGGED;
    public OVP A07;
    public C21029XAi A08;
    public C18009Vjl A09 = new Object();
    public EmptyStateView A0A;
    public Integer A0B = null;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public 1wn A0F;
    public 1wn A0G;
    public C54722HQb A0H;
    public AnonymousClass3AD A0I;
    public boolean A0J;
    public boolean A0K;
    public final C228172ku A0L = new C228172ku();
    public final List A0M = new ArrayList();
    public final C14005To7 A0N = new C14005To7();

    public final /* synthetic */ void Dit(1Xj r1) {
    }

    public final String getModuleName() {
        return "feed_photos_of_you";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r2 = 4
            X.Wf1 r1 = new X.Wf1
            r1.<init>(r12, r2)
            X.Wf3 r0 = new X.Wf3
            r7 = r13
            r0.<init>(r13, r1)
            r12.A0I = r0
            super.onViewCreated(r13, r14)
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x01fd
            X.EVG r1 = r12.A06
            X.EVG r0 = X.EVG.PENDING
            if (r1 != r0) goto L_0x0213
            com.instagram.ui.emptystaterow.EmptyStateView r5 = X.C13989Tnp.A0d(r12)
            r0 = 2131969332(0x7f134534, float:1.9575584E38)
            X.6rr r3 = X.C320156rr.EMPTY
            r5.A0T(r3, r0)
            r0 = 2131969331(0x7f134533, float:1.9575582E38)
            r5.A0S(r3, r0)
            r0 = 2131969330(0x7f134532, float:1.957558E38)
            r5.A0Q(r3, r0)
            r0 = 2131239153(0x7f0820f1, float:1.8094605E38)
            X.6rr r4 = X.C320156rr.ERROR
            r5.A0R(r4, r0)
            r12.A0A = r5
            r1 = 2
            X.Wdw r0 = new X.Wdw
            r0.<init>(r12, r1)
            r5.A0O(r0, r3)
        L_0x0046:
            com.instagram.ui.emptystaterow.EmptyStateView r3 = r12.A0A
            r1 = 65
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r12, (int) r1)
            r3.A0N(r0, r4)
            com.instagram.ui.emptystaterow.EmptyStateView r0 = r12.A0A
            r0.A0H()
            A03(r12)
            X.EVG r0 = r12.A06
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x01d5
            r0 = 1
            if (r1 == r0) goto L_0x011c
            r0 = 2
            if (r1 != r0) goto L_0x0091
            android.content.Context r1 = r12.requireContext()
            X.Vjl r4 = r12.A09
            r8 = 2131957531(0x7f13171b, float:1.9551649E38)
            int r0 = X.2Yu.A03(r1)
            int r9 = r1.getColor(r0)
            r10 = 2131968525(0x7f13420d, float:1.9573947E38)
            int r11 = X.C51968G9o.A04(r1)
            r0 = 70
            X.WBA r5 = new X.WBA
            r5.<init>((java.lang.Object) r12, (int) r0)
            r0 = 0
            X.WBC r6 = new X.WBC
            r6.<init>(r12, r0)
        L_0x008e:
            r4.A01(r5, r6, r7, r8, r9, r10, r11)
        L_0x0091:
            X.0S7.A00(r12)
            android.widget.ListView r0 = r12.A04
            r0.setOnScrollListener(r12)
            boolean r0 = r12.A0J
            r4 = 0
            if (r0 == 0) goto L_0x00a5
            com.instagram.common.session.UserSession r0 = r12.A03
            X.C49068Eom.A00(r12, r0)
            r12.A0J = r4
        L_0x00a5:
            boolean r0 = r12.A0K
            if (r0 == 0) goto L_0x011b
            com.instagram.common.session.UserSession r7 = r12.A03
            X.F25 r6 = r12.A05
            X.AnonymousClass7TG.A1O(r7, r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36602716318995176(0x8209fa000212e8, double:3.2110434152164817E-306)
            long r8 = X.182.A01(r2, r7, r0)
            X.1Am r0 = X.1Al.A01(r7)
            X.1An r5 = X.1An.A2w
            X.0xa r3 = r0.A03(r5)
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = "spam_tags_education_dialog_impressions"
            int r0 = r3.getInt(r0, r4)
            long r0 = (long) r0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0108
        L_0x00d6:
            X.8ab r3 = X.DbW.A0U(r12)
            r1 = 2131974970(0x7f135b3a, float:1.958702E38)
            X.W5I r0 = X.W5I.A00
            r3.A0I(r0, r1)
            r2 = 2131964884(0x7f1333d4, float:1.9566562E38)
            r1 = 13
            X.W4v r0 = new X.W4v
            r0.<init>(r1, r12, r7)
            r3.A0G(r0, r2)
            r0 = 2131974115(0x7f1357e3, float:1.9585285E38)
            r3.A09(r0)
            r0 = 2131969711(0x7f1346af, float:1.9576353E38)
            r3.A08(r0)
            X.DbT.A1V(r3)
            X.EVG r3 = X.EVG.SPAM
            java.lang.Integer r2 = X.AnonymousClass05K.A03
            X.0sn r1 = X.0sn.A00
            r0 = 0
            r6.A00(r3, r2, r0, r1)
        L_0x0108:
            X.1Am r0 = X.1Al.A01(r7)
            X.0xa r1 = r0.A03(r5)
            java.lang.String r0 = "spam_tags_education_dialog_impressions"
            X.0xY r0 = X.AnonymousClass7TG.A0g(r1, r0)
            r0.apply()
            r12.A0K = r4
        L_0x011b:
            return
        L_0x011c:
            android.content.Context r1 = r12.requireContext()
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x0181
            X.Vjl r3 = r12.A09
            r4 = 2131820787(0x7f1100f3, float:1.9274299E38)
            X.UdE r0 = r12.A04
            java.util.Set r0 = r0.A0G
            int r2 = r0.size()
            android.content.res.Resources r0 = X.DbV.A05(r12)
            java.lang.String r5 = X.DbY.A0d(r0, r2, r4)
            int r4 = X.C51968G9o.A04(r1)
            r0 = 66
            X.WBA r1 = new X.WBA
            r1.<init>((java.lang.Object) r12, (int) r0)
            r2 = 2131965844(0x7f133794, float:1.956851E38)
            r0 = 2131442446(0x7f0b3b0e, float:1.8506932E38)
            android.view.View r0 = r13.findViewById(r0)
            r3.A01 = r0
            r0 = 2131442485(0x7f0b3b35, float:1.8507011E38)
            android.view.View r0 = r13.requireViewById(r0)
            r3.A00 = r0
            X.AnonymousClass0fU.A00(r1, r0)
            r0 = 2131442484(0x7f0b3b34, float:1.850701E38)
            android.widget.TextView r0 = X.DbU.A0G(r13, r0)
            r3.A03 = r0
            r0.setText(r5)
            android.widget.TextView r0 = r3.A03
            r0.setTextColor(r4)
            android.widget.TextView r1 = r3.A03
            r0 = 0
            r1.setAllCaps(r0)
            r0 = 2131442486(0x7f0b3b36, float:1.8507013E38)
            android.widget.TextView r0 = X.DbU.A0G(r13, r0)
            r3.A04 = r0
            r0.setText(r2)
            goto L_0x0091
        L_0x0181:
            X.Vjl r4 = r12.A09
            r8 = 2131952258(0x7f130282, float:1.9540954E38)
            int r9 = X.C51968G9o.A04(r1)
            r10 = 2131971974(0x7f134f86, float:1.9580942E38)
            int r0 = X.2Yu.A03(r1)
            int r11 = r1.getColor(r0)
            r0 = 67
            X.WBA r5 = new X.WBA
            r5.<init>((java.lang.Object) r12, (int) r0)
            r0 = 68
            X.WBA r6 = new X.WBA
            r6.<init>((java.lang.Object) r12, (int) r0)
            r4.A01(r5, r6, r7, r8, r9, r10, r11)
            int r3 = X.C51968G9o.A04(r1)
            r0 = 69
            X.WBA r2 = new X.WBA
            r2.<init>((java.lang.Object) r12, (int) r0)
            r1 = 2131963365(0x7f132de5, float:1.9563481E38)
            r0 = 2131442485(0x7f0b3b35, float:1.8507011E38)
            android.view.View r0 = r13.requireViewById(r0)
            r4.A00 = r0
            r0 = 2131442484(0x7f0b3b34, float:1.850701E38)
            android.widget.TextView r0 = X.DbU.A0G(r13, r0)
            r4.A03 = r0
            r0.setText(r1)
            android.widget.TextView r0 = r4.A03
            r0.setTextColor(r3)
            android.widget.TextView r0 = r4.A03
            X.AnonymousClass0fU.A00(r2, r0)
            goto L_0x0091
        L_0x01d5:
            android.content.Context r1 = r12.getContext()
            if (r1 == 0) goto L_0x0091
            X.Vjl r4 = r12.A09
            r8 = 2131971974(0x7f134f86, float:1.9580942E38)
            int r9 = X.C51968G9o.A04(r1)
            r10 = 2131963365(0x7f132de5, float:1.9563481E38)
            int r0 = X.2Yu.A03(r1)
            int r11 = r1.getColor(r0)
            X.WBC r5 = new X.WBC
            r5.<init>(r12, r2)
            r0 = 63
            X.WBA r6 = new X.WBA
            r6.<init>((java.lang.Object) r12, (int) r0)
            goto L_0x008e
        L_0x01fd:
            com.instagram.ui.emptystaterow.EmptyStateView r3 = X.C13989Tnp.A0d(r12)
            r0 = 2131231751(0x7f080407, float:1.8079592E38)
            X.6rr r1 = X.C320156rr.EMPTY
            r3.A0R(r1, r0)
            r0 = 2131969431(0x7f134597, float:1.9575785E38)
            r3.A0T(r1, r0)
            r0 = 2131969432(0x7f134598, float:1.9575787E38)
            goto L_0x0226
        L_0x0213:
            X.EVG r0 = X.EVG.SPAM
            if (r1 != r0) goto L_0x01fd
            com.instagram.ui.emptystaterow.EmptyStateView r3 = X.C13989Tnp.A0d(r12)
            r0 = 2131974114(0x7f1357e2, float:1.9585283E38)
            X.6rr r1 = X.C320156rr.EMPTY
            r3.A0T(r1, r0)
            r0 = 2131974113(0x7f1357e1, float:1.958528E38)
        L_0x0226:
            r3.A0S(r1, r0)
            r0 = 2131239153(0x7f0820f1, float:1.8094605E38)
            X.6rr r4 = X.C320156rr.ERROR
            r3.A0R(r4, r0)
            r12.A0A = r3
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15397Uc0.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A03(C15397Uc0 uc0) {
        if (uc0.A0A != null) {
            ListView A0X = uc0.A0X();
            C21029XAi xAi = uc0.A08;
            if (xAi.isLoading()) {
                uc0.A0A.A0L();
                if (A0X != null) {
                    ((RefreshableListView) A0X).setIsLoading(true);
                    return;
                }
                return;
            }
            boolean CT5 = xAi.CT5();
            EmptyStateView emptyStateView = uc0.A0A;
            if (CT5) {
                emptyStateView.A0J();
            } else {
                emptyStateView.A0I();
                emptyStateView.A0H();
            }
            AnonymousClass3AD r1 = uc0.A0I;
            if (r1 != null) {
                r1.setIsLoading(false);
            }
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A03;
    }

    public final void ACw() {
        this.A08.ACx(new C15961Uld(2, this, false));
    }

    public final boolean CJz() {
        return !this.A04.isEmpty();
    }

    public final boolean CKB() {
        return this.A08.CKB();
    }

    public final boolean CT5() {
        return this.A08.CT5();
    }

    public final boolean CWV() {
        if (!this.A08.isLoading() || !this.A04.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void CgO() {
        this.A08.Cla(new C15961Uld(2, this, false), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ff A[LOOP:0: B:27:0x00f9->B:29:0x00ff, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DIG(X.1Xj r13) {
        /*
            r12 = this;
            X.UdE r3 = r12.A04
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x009d
            java.util.Set r2 = r3.A0G
            java.lang.String r0 = r13.getId()
            boolean r1 = r2.contains(r0)
            java.lang.String r0 = r13.getId()
            if (r1 == 0) goto L_0x0098
            r2.remove(r0)
        L_0x0019:
            r0 = -444918774(0xffffffffe57b140a, float:-7.4105228E22)
            X.0fE.A00(r3, r0)
            X.2dZ r0 = r12.A00
            r0.A0T()
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x0051
            X.UdE r0 = r12.A04
            java.util.Set r0 = r0.A0G
            r0.size()
            X.EVG r1 = r12.A06
            X.EVG r0 = X.EVG.PENDING
            if (r1 != r0) goto L_0x0052
            X.Vjl r3 = r12.A09
            r2 = 2131820787(0x7f1100f3, float:1.9274299E38)
            X.UdE r0 = r12.A04
            java.util.Set r0 = r0.A0G
            int r1 = r0.size()
            android.content.res.Resources r0 = X.DbV.A05(r12)
            java.lang.String r1 = X.DbY.A0d(r0, r1, r2)
            android.widget.TextView r0 = r3.A03
            if (r0 == 0) goto L_0x0051
            r0.setText(r1)
        L_0x0051:
            return
        L_0x0052:
            X.EVG r0 = X.EVG.SPAM
            if (r1 != r0) goto L_0x0051
            X.Vjl r4 = r12.A09
            r2 = 2131820638(0x7f11005e, float:1.9273997E38)
            X.UdE r0 = r12.A04
            java.util.Set r0 = r0.A0G
            int r1 = r0.size()
            android.content.res.Resources r0 = X.DbV.A05(r12)
            java.lang.String r3 = X.DbY.A0d(r0, r1, r2)
            r2 = 2131820788(0x7f1100f4, float:1.92743E38)
            X.UdE r0 = r12.A04
            java.util.Set r0 = r0.A0G
            int r1 = r0.size()
            android.content.res.Resources r0 = X.DbV.A05(r12)
            java.lang.String r2 = X.DbY.A0d(r0, r1, r2)
            android.widget.TextView r0 = r4.A02
            r1 = 0
            if (r0 == 0) goto L_0x008b
            r0.setText(r3)
            android.widget.TextView r0 = r4.A02
            r0.setAllCaps(r1)
        L_0x008b:
            android.widget.TextView r0 = r4.A05
            if (r0 == 0) goto L_0x0051
            r0.setText(r2)
            android.widget.TextView r0 = r4.A05
            r0.setAllCaps(r1)
            return
        L_0x0098:
            r2.add(r0)
            goto L_0x0019
        L_0x009d:
            java.lang.String r7 = r12.A0C
            r7.getClass()
            java.lang.String r8 = r12.A0D
            r8.getClass()
            X.5mA r5 = X.C294265mA.PHOTOS_OF_YOU
            r0 = 2131969352(0x7f134548, float:1.9575624E38)
            java.lang.String r2 = r12.getString(r0)
            X.F25 r4 = r12.A05
            X.EVG r3 = r12.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r0 = r13.getId()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r9 = 0
            r4.A00(r3, r1, r9, r0)
            X.EVG r1 = r12.A06
            X.EVG r0 = X.EVG.PENDING
            if (r1 != r0) goto L_0x0107
            X.5mA r5 = X.C294265mA.PENDING_PHOTOS_OF_YOU
            r0 = 2131974935(0x7f135b17, float:1.9586948E38)
        L_0x00cd:
            java.lang.String r2 = r12.getString(r0)
        L_0x00d1:
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            com.instagram.common.session.UserSession r0 = r12.A03
            X.6Yo r3 = new X.6Yo
            r3.<init>(r1, r0)
            java.lang.String r0 = "feed_photos_of_you"
            X.Del r4 = X.C49262Es5.A00(r0)
            java.lang.String r0 = "User_Feed"
            r4.A06 = r0
            r4.A07 = r2
            java.lang.String r0 = r13.getId()
            r4.A08 = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r0 = r12.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x00f9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = X.C51971G9r.A0v(r1)
            r2.add(r0)
            goto L_0x00f9
        L_0x0107:
            X.EVG r0 = X.EVG.SPAM
            if (r1 != r0) goto L_0x00d1
            X.5mA r5 = X.C294265mA.SPAM_PHOTOS_OF_YOU
            r0 = 2131974115(0x7f1357e3, float:1.9585285E38)
            goto L_0x00cd
        L_0x0111:
            r4.A09(r2)
            X.XAi r0 = r12.A08
            java.lang.String r6 = r0.getNextMaxId()
            int r11 = r5.A00
            com.instagram.feed.intf.ContextualFeedNetworkConfig r5 = new com.instagram.feed.intf.ContextualFeedNetworkConfig
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.A03 = r5
            X.To7 r0 = r12.A0N
            r4.A08(r0)
            instagram.features.feed.fragment.ContextualFeedFragment r0 = r4.A07()
            r3.A0E(r0)
            r3.A08()
            r3.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15397Uc0.DIG(X.1Xj):void");
    }

    public final 0jB E4x() {
        if (this.A0C == null) {
            return null;
        }
        0jB r2 = new 0jB();
        r2.A0A("ManageTaggedMediaFragment.USERNAME", this.A0D);
        r2.A0A("ManageTaggedMediaFragment.USER_ID", this.A0C);
        return r2;
    }

    public final void EKl() {
        if (this.mView != null) {
            0S7.A00(this);
            C17118VIo.A00(this.A04, this);
        }
    }

    public final void FJw(Uri uri) {
        this.A00.A0T();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        if (r0 == false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r6) {
        /*
            r5 = this;
            X.UdE r0 = r5.A04
            java.util.Set r0 = r0.A0G
            int r4 = r0.size()
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L_0x00c1
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x00c1
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131821034(0x7f1101ea, float:1.92748E38)
            java.lang.String r0 = X.DbY.A0d(r1, r4, r0)
        L_0x001b:
            r6.setTitle(r0)
            r6.Eu4(r3)
            boolean r0 = r5.A0E
            r3 = 8
            X.EVG r1 = r5.A06
            if (r0 == 0) goto L_0x007d
            X.EVG r0 = X.EVG.PENDING
            if (r1 == r0) goto L_0x0031
            X.EVG r0 = X.EVG.SPAM
            if (r1 != r0) goto L_0x007c
        L_0x0031:
            X.UdE r0 = r5.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007c
            X.3JR r2 = new X.3JR
            r2.<init>()
            X.UdE r0 = r5.A04
            boolean r1 = r0.A03
            r0 = 2131973021(0x7f13539d, float:1.9583066E38)
            if (r1 == 0) goto L_0x004a
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
        L_0x004a:
            java.lang.String r0 = r5.getString(r0)
            r2.A0K = r0
            r1 = 2
            X.WBC r0 = new X.WBC
            r0.<init>(r5, r1)
            X.DbX.A19(r0, r2, r6)
            X.Vjl r1 = r5.A09
            X.UdE r0 = r5.A04
            java.util.Set r0 = r0.A0G
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0066
            r3 = 0
        L_0x0066:
            r1.A00(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.F3V r2 = new X.F3V
            r2.<init>(r0)
        L_0x0070:
            r1 = 2131237915(0x7f081c1b, float:1.8092094E38)
        L_0x0073:
            r2.A02 = r1
            X.57Z r0 = r2.A00()
            r6.ErJ(r0)
        L_0x007c:
            return
        L_0x007d:
            X.EVG r0 = X.EVG.PENDING
            if (r1 != r0) goto L_0x00a0
            X.UdE r0 = r5.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a0
            X.3JR r2 = new X.3JR
            r2.<init>()
            r0 = 2131961425(0x7f132651, float:1.9559547E38)
            java.lang.String r0 = r5.getString(r0)
            r2.A0K = r0
            r1 = 3
            X.WBC r0 = new X.WBC
            r0.<init>(r5, r1)
            X.DbX.A19(r0, r2, r6)
        L_0x00a0:
            X.Vjl r1 = r5.A09
            X.UdE r0 = r5.A04
            java.util.Set r0 = r0.A0G
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ad
            r3 = 0
        L_0x00ad:
            r1.A00(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.F3V r2 = new X.F3V
            r2.<init>(r0)
            X.UdE r0 = r5.A04
            boolean r0 = r0.A03
            r1 = 2131239025(0x7f082071, float:1.8094345E38)
            if (r0 != 0) goto L_0x0073
            goto L_0x0070
        L_0x00c1:
            X.EVG r0 = r5.A06
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x00dd
            if (r1 == r3) goto L_0x00d9
            r0 = 2
            if (r1 == r0) goto L_0x00e1
            java.lang.String r1 = "mTaggedMediaMode not set correctly"
            java.lang.String r0 = "mTaggedMediaMode should be of type TAGGED, PENDING, or SPAM"
            X.0wb.A03(r1, r0)
            java.lang.String r0 = ""
            goto L_0x001b
        L_0x00d9:
            r0 = 2131974935(0x7f135b17, float:1.9586948E38)
            goto L_0x00e4
        L_0x00dd:
            r0 = 2131969352(0x7f134548, float:1.9575624E38)
            goto L_0x00e4
        L_0x00e1:
            r0 = 2131974115(0x7f1357e3, float:1.9585285E38)
        L_0x00e4:
            java.lang.String r0 = r5.getString(r0)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15397Uc0.configureActionBar(X.2da):void");
    }

    public final boolean isLoading() {
        return this.A08.isLoading();
    }

    public final boolean onBackPressed() {
        C15463UdE udE = this.A04;
        if (!udE.A03) {
            return false;
        }
        udE.A0C();
        if (!(!this.A04.A03)) {
            this.A09.A00(8);
        }
        this.A00.A0T();
        return true;
    }

    public static void A01(C15397Uc0 uc0) {
        A04(uc0, AnonymousClass05K.A0C, AnonymousClass05K.A00, 2131969317, R.plurals.pending_tag_add_dialog_title, 2131969318, 2131969433);
    }

    public static void A02(C15397Uc0 uc0) {
        A04(uc0, AnonymousClass05K.A01, AnonymousClass05K.A0C, 2131969327, R.plurals.pending_tag_remove_dialog_title, 2131969328, 2131969435);
    }

    public static void A04(C15397Uc0 uc0, Integer num, Integer num2, int i, int i2, int i3, int i4) {
        C15397Uc0 uc02 = uc0;
        Context context = uc0.getContext();
        if (context != null) {
            String string = uc0.getString(i);
            String string2 = uc0.getString(2131969436);
            C358248ab r2 = new C358248ab(context);
            r2.A0r(true);
            r2.A0s(true);
            r2.A05 = DbV.A05(uc02).getQuantityString(i2, uc02.A04.A0G.size(), AnonymousClass7TF.A1b(uc02.A04.A0G.size()));
            r2.A08(i3);
            r2.A0Y(new W51(num, num2, uc02, context, i4, 1), C358278ae.RED_BOLD, string, true);
            r2.A0b((DialogInterface.OnClickListener) null, string2);
            DbT.A1V(r2);
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, X.Uc0, X.4DU, X.0S7, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.2mt, X.32G] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.VFW] */
    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object, X.HQb] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0052, code lost:
        if (r8 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        r0 = (X.EVG) r8.getSerializable("ManageTaggedMediaFragment.MODE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        if (r0 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        r15.A06 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r15.A01 = r15;
        r5 = requireContext();
        r3 = r15.A03;
        r2 = X.AnonymousClass07i.A00(r15);
        r1 = r15.A06.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        if (r1 == 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r1 == 1) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r1 != 2) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        r1 = new X.IWR(r5, r2, new X.C228602lw(r5, r2), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        r15.A08 = r1;
        r5 = r15.A03;
        r3 = X.OVP.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        r1 = new X.IWQ(r5, r2, new X.C228602lw(r5, r2), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r1 = new X.IWS(r5, r2, new X.C228602lw(r5, r2), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = new X.OVP(r5, new java.lang.Object(), X.17h.A00(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b0, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        r15.A07 = r0;
        r15.A02 = X.1a8.A00();
        r3 = r15.A03;
        X.0qQ.A0B(r3, 0);
        r0 = X.182.A06(X.0Tu.A06, r3, 36321241342158014L);
        r15.A0E = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cb, code lost:
        if (r0 == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
        if (r15.A06 != X.EVG.A03) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d4, code lost:
        r15.A0K = r4;
        r10 = X.1wY.A00(r15.A03);
        r0 = r15.A03;
        r4 = X.DbW.A02(1, r0, "feed_photos_of_you");
        r10.A07(new X.AnonymousClass34L(r15.A03, "feed_photos_of_you"), new X.AnonymousClass34R(r0, (X.AnonymousClass34Q) null, "feed_photos_of_you"), "feed_photos_of_you");
        requireContext();
        X.11Z.A00();
        X.11Z.A00();
        r15.A0F = new X.C19221WQb(r15, 27);
        r15.A0G = new X.C19221WQb(r15, 28);
        r15.A05 = new X.F25(r15.A01, r15.A03);
        X.AnonymousClass1Nd.A00(r15.A03).A01(r15.A0F, X.INY.class);
        X.AnonymousClass1Nd.A00(r15.A03).A01(r15.A0G, X.INZ.class);
        r12 = requireContext();
        r14 = new X.C322186vO(r15.A03);
        r0 = null;
        r11 = new X.C15463UdE(r12, r15.A03, r14, r15, r15, r15, r15.A06, X.AnonymousClass32Q.A00, r15, r15.A0E);
        r15.A04 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x015d, code lost:
        if (r11.A03 == r7) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x015f, code lost:
        r11.A03 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0161, code lost:
        if (r7 == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0163, code lost:
        r11.A0G.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0168, code lost:
        X.0fE.A00(r11, -347549398);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016e, code lost:
        r7 = new X.AnonymousClass36D(r15.A03, new X.WWR(r15, 5));
        r2 = new X.C227622jd();
        r2.A0E(r7);
        A0b(r2);
        A0V(r15.A04);
        r11 = new X.C19379WWv();
        r10 = r15.A04;
        r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        r2 = new X.C3251271d(r15, r11, r10, new java.util.HashSet());
        r12 = r15.A0L;
        r12.A01(r2);
        r11 = r15.A03;
        r2 = X.AnonymousClass05K.A01;
        r12.A01(new X.C14190TrU(r11, r15, r2, 6));
        r15.A08.Cla(new X.C15961Uld(r4, r15, true), true);
        r7 = r15.A06;
        r4 = X.EVG.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0041, code lost:
        if (r8.getBoolean("ManageTaggedMediaFragment.IS_EDIT_ONLY_MODE", false) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01be, code lost:
        if (r7 != r4) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c0, code lost:
        r15.A02.A02(X.1aF.A01(new X.C66990MgO(X.OVP.A00(r15.A07))), new X.C19858Wgk(r15, 0));
        r11 = r15.A02;
        r12 = r15.A07;
        r1 = r12.A04;
        r10 = X.DbU.A0O(r1);
        r10.A0K("usertags/%s/get_pending_review_count/", new java.lang.Object[]{r1.A06});
        r11.A02(X.C69818Nsf.A00(X.DbT.A0S(r10, X.CFU.class, X.D26.class)).A0L(new X.C72018Ous(r12, 7)), new X.C19858Wgk(r15, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x020c, code lost:
        r7 = r15.A03;
        r5 = requireContext();
        r1 = new java.lang.Object();
        r1.A00 = r5;
        r1.A01 = r7;
        r1.A02 = "feed_photos_of_you";
        r15.A0H = r1;
        r15.A00 = X.DbT.A0K(getActivity());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0229, code lost:
        if (r8 == null) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x022b, code lost:
        r1 = r8.getString("ManageTaggedMediaFragment.ARGUMENT_ENTRYPOINT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0231, code lost:
        if (r1 == null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0239, code lost:
        if (r1.equals("PENDING_TAGS_NOTIFICATION") == false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x023b, code lost:
        r0 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x023d, code lost:
        r15.A0B = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x023f, code lost:
        r6 = r15.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0241, code lost:
        if (r6 == null) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0243, code lost:
        r5 = r15.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0245, code lost:
        if (r5 != r4) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0247, code lost:
        r2 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0249, code lost:
        X.FCT.A00(r15.A01, r15.A03, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0250, code lost:
        r15.A05.A00(r15.A06, X.AnonymousClass05K.A00, (java.lang.String) null, java.util.Collections.emptyList());
        X.AnonymousClass0fD.A09(-1832871159, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0263, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0266, code lost:
        if (r5 == X.EVG.A02) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0044, code lost:
        if (r8 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x026a, code lost:
        if (r5 != X.EVG.A03) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x026c, code lost:
        r2 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0275, code lost:
        if (r1.equals("TAGGED_POSTS_BLOKS_SETTINGS") == false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0277, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x027f, code lost:
        if (r1.equals("EDIT_TAG_PROFILE") == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0281, code lost:
        r0 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x028a, code lost:
        if (r1.equals("PHOTOS_OF_YOU") == false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x028c, code lost:
        r0 = X.AnonymousClass05K.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0295, code lost:
        if (r1.equals("TAGGED_POSTS_NATIVE_SETTINGS") == false) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0297, code lost:
        r0 = X.AnonymousClass05K.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02a0, code lost:
        if (r1.equals("YOUR_ACTIVITY_TAGS_MENU") == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02a2, code lost:
        r0 = X.AnonymousClass05K.A0j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02a5, code lost:
        r1 = X.C51973G9u.A0g(r5, "Unknown manage tagged media mode: ", new java.lang.StringBuilder());
        X.AnonymousClass0fD.A09(75272837, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02b6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004d, code lost:
        if (r8.getBoolean("ManageTaggedMediaFragment.ARGUMENT_SHOULD_SHOW_PTE_TAGGED_SELLER_NUX", false) != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02bc, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02c7, code lost:
        throw new java.lang.IllegalArgumentException("Can not create TaggedMediaRepository");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        r15.A0J = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = -284673009(0xffffffffef083c0f, float:-4.216257E28)
            int r9 = X.AnonymousClass0fD.A02(r0)
            r15 = r22
            r0 = r23
            X.C15397Uc0.super.onCreate(r0)
            android.os.Bundle r1 = r15.requireArguments()
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r15)
            r15.A03 = r0
            java.lang.String r0 = "ManageTaggedMediaFragment.USER_ID"
            java.lang.String r0 = X.DbU.A0l(r1, r0)
            r15.A0C = r0
            java.lang.String r0 = "ManageTaggedMediaFragment.USERNAME"
            java.lang.String r0 = X.DbU.A0l(r1, r0)
            r15.A0D = r0
            com.instagram.common.session.UserSession r0 = r15.A03
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r15.A0C
            boolean r0 = r1.equals(r0)
            X.17k.A0E(r0)
            android.os.Bundle r8 = r15.mArguments
            r4 = 0
            if (r8 == 0) goto L_0x0043
            java.lang.String r0 = "ManageTaggedMediaFragment.IS_EDIT_ONLY_MODE"
            boolean r0 = r8.getBoolean(r0, r4)
            r7 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0043:
            r7 = 0
            if (r8 == 0) goto L_0x004f
        L_0x0046:
            java.lang.String r0 = "ManageTaggedMediaFragment.ARGUMENT_SHOULD_SHOW_PTE_TAGGED_SELLER_NUX"
            boolean r1 = r8.getBoolean(r0, r4)
            r0 = 1
            if (r1 != 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            r15.A0J = r0
            if (r8 == 0) goto L_0x0060
            java.lang.String r0 = "ManageTaggedMediaFragment.MODE"
            java.io.Serializable r0 = r8.getSerializable(r0)
            X.EVG r0 = (X.EVG) r0
            if (r0 == 0) goto L_0x0060
            r15.A06 = r0
        L_0x0060:
            r15.A01 = r15
            android.content.Context r5 = r15.requireContext()
            com.instagram.common.session.UserSession r3 = r15.A03
            X.0gy r2 = X.AnonymousClass07i.A00(r15)
            X.EVG r0 = r15.A06
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x0097
            r0 = 1
            if (r1 == r0) goto L_0x008c
            r0 = 2
            if (r1 != r0) goto L_0x02c0
            X.2lw r0 = new X.2lw
            r0.<init>(r5, r2)
            X.IWR r1 = new X.IWR
            r1.<init>(r5, r2, r0, r3)
        L_0x0084:
            r15.A08 = r1
            com.instagram.common.session.UserSession r5 = r15.A03
            java.lang.Class<X.OVP> r3 = X.OVP.class
            monitor-enter(r3)
            goto L_0x00a2
        L_0x008c:
            X.2lw r0 = new X.2lw
            r0.<init>(r5, r2)
            X.IWQ r1 = new X.IWQ
            r1.<init>(r5, r2, r0, r3)
            goto L_0x0084
        L_0x0097:
            X.2lw r0 = new X.2lw
            r0.<init>(r5, r2)
            X.IWS r1 = new X.IWS
            r1.<init>(r5, r2, r0, r3)
            goto L_0x0084
        L_0x00a2:
            X.VFW r2 = new X.VFW     // Catch:{ all -> 0x02bd }
            r2.<init>()     // Catch:{ all -> 0x02bd }
            X.17i r1 = X.17h.A00(r5)     // Catch:{ all -> 0x02bd }
            X.OVP r0 = new X.OVP     // Catch:{ all -> 0x02bd }
            r0.<init>(r5, r2, r1)     // Catch:{ all -> 0x02bd }
            monitor-exit(r3)
            r15.A07 = r0
            X.1a8 r0 = X.1a8.A00()
            r15.A02 = r0
            com.instagram.common.session.UserSession r3 = r15.A03
            X.0qQ.A0B(r3, r4)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321241342158014(0x8109fa000024be, double:3.0330375064559027E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r15.A0E = r0
            if (r0 == 0) goto L_0x00d4
            X.EVG r1 = r15.A06
            X.EVG r0 = X.EVG.SPAM
            if (r1 != r0) goto L_0x00d4
            r4 = 1
        L_0x00d4:
            r15.A0K = r4
            com.instagram.common.session.UserSession r0 = r15.A03
            X.1wY r10 = X.1wY.A00(r0)
            com.instagram.common.session.UserSession r0 = r15.A03
            java.lang.String r6 = "feed_photos_of_you"
            r5 = 1
            int r4 = X.DbW.A02(r5, r0, r6)
            r3 = 0
            X.34R r2 = new X.34R
            r2.<init>(r0, r3, r6)
            com.instagram.common.session.UserSession r1 = r15.A03
            X.34L r0 = new X.34L
            r0.<init>(r1, r6)
            r10.A07(r0, r2, r6)
            r15.requireContext()
            X.11Z.A00()
            X.11Z.A00()
            r1 = 27
            X.WQb r0 = new X.WQb
            r0.<init>(r15, r1)
            r15.A0F = r0
            r1 = 28
            X.WQb r0 = new X.WQb
            r0.<init>(r15, r1)
            r15.A0G = r0
            X.0iw r2 = r15.A01
            com.instagram.common.session.UserSession r1 = r15.A03
            X.F25 r0 = new X.F25
            r0.<init>(r2, r1)
            r15.A05 = r0
            com.instagram.common.session.UserSession r0 = r15.A03
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.INY> r1 = X.INY.class
            X.1wn r0 = r15.A0F
            r2.A01(r0, r1)
            com.instagram.common.session.UserSession r0 = r15.A03
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.INZ> r1 = X.INZ.class
            X.1wn r0 = r15.A0G
            r2.A01(r0, r1)
            android.content.Context r12 = r15.requireContext()
            com.instagram.common.session.UserSession r0 = r15.A03
            X.6vO r14 = new X.6vO
            r14.<init>(r0)
            com.instagram.common.session.UserSession r13 = r15.A03
            X.32Q r19 = X.AnonymousClass32Q.A00
            X.EVG r10 = r15.A06
            boolean r2 = r15.A0E
            r1 = 0
            r0 = r3
            X.UdE r11 = new X.UdE
            r16 = r15
            r17 = r15
            r18 = r10
            r20 = r15
            r21 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r15.A04 = r11
            boolean r2 = r11.A03
            if (r2 == r7) goto L_0x016e
            r11.A03 = r7
            if (r7 == 0) goto L_0x0168
            java.util.Set r2 = r11.A0G
            r2.clear()
        L_0x0168:
            r2 = -347549398(0xffffffffeb48d12a, float:-2.4277291E26)
            X.0fE.A00(r11, r2)
        L_0x016e:
            com.instagram.common.session.UserSession r10 = r15.A03
            r7 = 5
            X.WWR r2 = new X.WWR
            r2.<init>(r15, r7)
            X.36D r7 = new X.36D
            r7.<init>(r10, r2)
            X.2jd r2 = new X.2jd
            r2.<init>()
            r2.A0E(r7)
            r15.A0b(r2)
            X.UdE r2 = r15.A04
            r15.A0V(r2)
            X.WWv r11 = new X.WWv
            r11.<init>()
            X.UdE r10 = r15.A04
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            X.71d r2 = new X.71d
            r2.<init>(r15, r11, r10, r7)
            X.2ku r12 = r15.A0L
            r12.A01(r2)
            com.instagram.common.session.UserSession r11 = r15.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r10 = 6
            X.TrU r7 = new X.TrU
            r7.<init>(r11, r15, r2, r10)
            r12.A01(r7)
            X.XAi r10 = r15.A08
            X.Uld r7 = new X.Uld
            r7.<init>(r4, r15, r5)
            r10.Cla(r7, r5)
            X.EVG r7 = r15.A06
            X.EVG r4 = X.EVG.TAGGED
            if (r7 != r4) goto L_0x020c
            X.1a8 r11 = r15.A02
            X.OVP r7 = r15.A07
            X.VT5 r10 = X.OVP.A00(r7)
            X.MgO r7 = new X.MgO
            r7.<init>(r10)
            X.1aS r10 = X.1aF.A01(r7)
            X.Wgk r7 = new X.Wgk
            r7.<init>(r15, r1)
            r11.A02(r10, r7)
            X.1a8 r11 = r15.A02
            X.OVP r12 = r15.A07
            com.instagram.common.session.UserSession r1 = r12.A04
            X.1NY r10 = X.DbU.A0O(r1)
            java.lang.String r1 = r1.A06
            java.lang.Object[] r7 = new java.lang.Object[]{r1}
            java.lang.String r1 = "usertags/%s/get_pending_review_count/"
            r10.A0K(r1, r7)
            java.lang.Class<X.CFU> r7 = X.CFU.class
            java.lang.Class<X.D26> r1 = X.D26.class
            X.1OC r1 = X.DbT.A0S(r10, r7, r1)
            X.1aU r10 = X.C69818Nsf.A00(r1)
            r7 = 7
            X.Ous r1 = new X.Ous
            r1.<init>(r12, r7)
            X.1aU r7 = r10.A0L(r1)
            X.Wgk r1 = new X.Wgk
            r1.<init>(r15, r5)
            r11.A02(r7, r1)
        L_0x020c:
            com.instagram.common.session.UserSession r7 = r15.A03
            android.content.Context r5 = r15.requireContext()
            X.HQb r1 = new X.HQb
            r1.<init>()
            r1.A00 = r5
            r1.A01 = r7
            r1.A02 = r6
            r15.A0H = r1
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()
            X.2dZ r1 = X.DbT.A0K(r1)
            r15.A00 = r1
            if (r8 == 0) goto L_0x023f
            java.lang.String r1 = "ManageTaggedMediaFragment.ARGUMENT_ENTRYPOINT"
            java.lang.String r1 = r8.getString(r1)
            if (r1 == 0) goto L_0x023d
            java.lang.String r0 = "PENDING_TAGS_NOTIFICATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x026f
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x023d:
            r15.A0B = r0
        L_0x023f:
            java.lang.Integer r6 = r15.A0B
            if (r6 == 0) goto L_0x0250
            X.EVG r5 = r15.A06
            if (r5 != r4) goto L_0x0264
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x0249:
            com.instagram.common.session.UserSession r1 = r15.A03
            X.0iw r0 = r15.A01
            X.FCT.A00(r0, r1, r6, r2)
        L_0x0250:
            X.F25 r4 = r15.A05
            X.EVG r2 = r15.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.util.List r0 = java.util.Collections.emptyList()
            r4.A00(r2, r1, r3, r0)
            r0 = -1832871159(0xffffffff92c09b09, float:-1.2155123E-27)
            X.AnonymousClass0fD.A09(r0, r9)
            return
        L_0x0264:
            X.EVG r0 = X.EVG.PENDING
            if (r5 == r0) goto L_0x0249
            X.EVG r0 = X.EVG.SPAM
            if (r5 != r0) goto L_0x02a5
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x0249
        L_0x026f:
            java.lang.String r0 = "TAGGED_POSTS_BLOKS_SETTINGS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0279
            r0 = r2
            goto L_0x023d
        L_0x0279:
            java.lang.String r0 = "EDIT_TAG_PROFILE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0284
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x023d
        L_0x0284:
            java.lang.String r0 = "PHOTOS_OF_YOU"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x028f
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x023d
        L_0x028f:
            java.lang.String r0 = "TAGGED_POSTS_NATIVE_SETTINGS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x029a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x023d
        L_0x029a:
            java.lang.String r0 = "YOUR_ACTIVITY_TAGS_MENU"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b7
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x023d
        L_0x02a5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown manage tagged media mode: "
            java.lang.IllegalArgumentException r1 = X.C51973G9u.A0g(r5, r0, r1)
            r0 = 75272837(0x47c9285, float:2.9689736E-36)
            X.AnonymousClass0fD.A09(r0, r9)
            throw r1
        L_0x02b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02bd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x02c0:
            java.lang.String r1 = "Can not create TaggedMediaRepository"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15397Uc0.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1018868140);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_hide_photos_of_you);
        AnonymousClass0fD.A09(918017503, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(157682158);
        AnonymousClass1Nd.A00(this.A03).A02(this.A0F, INY.class);
        AnonymousClass1Nd.A00(this.A03).A02(this.A0G, INZ.class);
        1wY A002 = 1wY.A00(this.A03);
        11Z.A00();
        11Z.A00();
        A002.A08("feed_photos_of_you");
        this.A02.A01();
        super.onDestroy();
        AnonymousClass0fD.A09(1974054763, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-438223977);
        super.onDestroyView();
        this.A0A = null;
        AnonymousClass0fD.A09(-1673596269, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(649598013);
        super.onResume();
        0fE.A00(this.A04, 456692056);
        2ai.A00(this.A03).A01.E3F(new C239563Gy(0));
        AnonymousClass0fD.A09(242629432, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(-1864918382);
        this.A0L.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(-791549411, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0fD.A03(-2121921386);
        this.A0L.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(1559968210, A032);
    }
}
