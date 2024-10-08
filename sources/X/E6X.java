package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class E6X extends AnonymousClass32G implements AnonymousClass4DU, C268594df, C273494mf, AnonymousClass4DS, C66571MXb {
    public static final String __redex_internal_original_name = "PeopleTagListFragment";
    public K99 A00;
    public C49409EvB A01;
    public User A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C = -2;
    public 1Ng A0D;
    public 1iA A0E;
    public C47916EMk A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;
    public final AnonymousClass0eM A0L = C227642jf.A02(this);
    public final FXZ A0M = FXZ.A00(this, 65);
    public final C50186FSs A0N = new C50186FSs(4);
    public final boolean A0O = true;

    public final void A8A(User user) {
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void Cu2(Product product) {
    }

    public final void D6L(User user) {
    }

    public final void D87(Product product) {
    }

    public final void D88(ProductCollection productCollection) {
    }

    public final void DDz(FBUserTag fBUserTag) {
    }

    public final void DJ8(User user, boolean z) {
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final void DdP(User user) {
    }

    public final void DqV() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ce, code lost:
        if (r1.contains(r6.getId()) == true) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DwV(com.instagram.user.model.User r23, int r24) {
        /*
            r22 = this;
            r2 = 0
            r6 = r23
            java.lang.String r1 = r6.getId()
            r4 = r22
            X.0eM r5 = r4.A0L
            java.lang.String r0 = X.DbU.A0u(r5)
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r15 = "mediaId"
            r3 = 0
            if (r0 == 0) goto L_0x0097
            android.os.Bundle r1 = r4.requireArguments()
            r0 = 2594(0xa22, float:3.635E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0097
            X.EvB r0 = r4.A01
            if (r0 == 0) goto L_0x0033
            r4.A02 = r6
            X.7Pu r0 = r0.A00
            r0.A0L(r3)
        L_0x0033:
            X.K99 r0 = r4.A00
            if (r0 == 0) goto L_0x0053
            java.util.List r0 = r0.A0L
            java.util.Iterator r1 = r0.iterator()
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r3 = r1.next()
            com.instagram.model.people.PeopleTag r3 = (com.instagram.model.people.PeopleTag) r3
            com.instagram.user.model.User r0 = r3.A07()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x003d
        L_0x0053:
            java.lang.String r6 = r4.A0H
            java.util.List r1 = r4.A09
            if (r3 == 0) goto L_0x0219
            if (r6 == 0) goto L_0x0219
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0219
            if (r1 == 0) goto L_0x0219
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0219
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r2.addAll(r1)
            java.util.List r1 = r4.A08
            if (r1 == 0) goto L_0x007d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x007d
            r2.addAll(r1)
        L_0x007d:
            X.4H4 r7 = X.AnonymousClass4H4.A00
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r1 = r4.A07
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = r4.A0G
            if (r0 != 0) goto L_0x0211
            java.lang.String r15 = "bottomsheetEntryPoint"
        L_0x008d:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0095:
            r3 = 0
            goto L_0x0053
        L_0x0097:
            X.0wc r8 = X.DbX.A0P(r4, r5)
            X.K99 r0 = r4.A00
            if (r0 == 0) goto L_0x01f6
            java.util.List r0 = r0.A0L
            java.util.Iterator r1 = r0.iterator()
        L_0x00a5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01f3
            java.lang.Object r2 = r1.next()
            com.instagram.model.people.PeopleTag r2 = (com.instagram.model.people.PeopleTag) r2
            com.instagram.user.model.User r0 = r2.A07()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00a5
        L_0x00bb:
            java.lang.String r14 = "Required value was null."
            if (r2 == 0) goto L_0x021f
            X.1E8 r1 = X.DbX.A0d(r5)
            java.lang.String r0 = r4.A07
            if (r0 == 0) goto L_0x008d
            X.1Xj r11 = r1.A02(r0)
            if (r11 == 0) goto L_0x01f0
            X.1iA r10 = r11.BR7()
        L_0x00d1:
            java.lang.String r18 = r4.getModuleName()
            java.lang.String r7 = r4.A07
            if (r7 == 0) goto L_0x008d
            java.lang.String r20 = r6.getId()
            java.lang.String r1 = r6.getUsername()
            boolean r2 = r2.A02
            java.lang.String r0 = "instagram_organic_tagged_profile_tapped"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r8, r0)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x011d
            java.lang.Long r12 = java.lang.Long.valueOf(r20)
            java.lang.String r0 = "entity_id"
            r9.A9F(r0, r12)
            r0 = 276(0x114, float:3.87E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.AAJ(r0, r1)
            java.lang.String r1 = "user"
            java.lang.String r0 = "entity_type"
            r9.AAJ(r0, r1)
            java.lang.String r0 = "m_pk"
            r9.AAJ(r0, r7)
            if (r10 == 0) goto L_0x01ed
            int r0 = r10.A00
            java.lang.Long r1 = X.DbS.A0j(r0)
        L_0x0115:
            java.lang.String r0 = "m_t"
            r9.A9F(r0, r1)
            r9.Cgf()
        L_0x011d:
            X.HOu r17 = X.C54689HOu.A0x
            r16 = r8
            r19 = r7
            r21 = r2
            X.C49156EqN.A00(r16, r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x01e9
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.1Xj r13 = r11.A1e(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            int r10 = r11.A15(r0)
        L_0x013a:
            r9 = -1
            if (r10 != r9) goto L_0x013e
            r10 = 0
        L_0x013e:
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r2 = r6.getId()
            java.lang.String r1 = r4.getModuleName()
            r0 = 177(0xb1, float:2.48E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.Dfc r8 = X.C46548Dgp.A01(r7, r2, r0, r1)
            java.lang.String r0 = r4.A0J
            r8.A0L = r0
            r7 = 1
            if (r11 == 0) goto L_0x01d1
            boolean r0 = r11.A5G()
            if (r0 != r7) goto L_0x01c0
            java.util.List r1 = r11.A3V()
            if (r1 == 0) goto L_0x01c0
            java.lang.String r0 = r6.getId()
            boolean r0 = r1.contains(r0)
            if (r0 != r7) goto L_0x01c0
            X.0lg r12 = X.DbT.A0X(r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328104699902917(0x81103800003bc5, double:3.037377921530303E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = "profile_clips"
        L_0x0184:
            r8.A0O = r0
        L_0x0186:
            if (r13 == 0) goto L_0x0195
            java.lang.String r1 = r13.getId()
            if (r1 == 0) goto L_0x021a
            com.instagram.sponsored.analytics.SourceModelInfoParams r0 = new com.instagram.sponsored.analytics.SourceModelInfoParams
            r0.<init>(r1, r9, r10)
            r8.A04 = r0
        L_0x0195:
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x01f9
            X.0lg r9 = X.DbT.A0X(r5)
            java.lang.Class<com.instagram.modal.ModalActivity> r7 = com.instagram.modal.ModalActivity.class
            X.1a1 r2 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r8.A04()
            android.os.Bundle r2 = r2.A01(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r0 = "profile"
            X.6W8 r0 = X.DbS.A0b(r1, r2, r9, r7, r0)
            r0.A02 = r4
            X.DbT.A1L(r4, r0)
            goto L_0x0033
        L_0x01c0:
            java.util.List r1 = r11.A3V()
            if (r1 == 0) goto L_0x01d1
            java.lang.String r0 = r6.getId()
            boolean r0 = r1.contains(r0)
            if (r0 != r7) goto L_0x01d1
            goto L_0x0186
        L_0x01d1:
            X.0lg r7 = X.DbT.A0X(r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328104700033991(0x81103800023bc7, double:3.0373779216131944E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0186
            r0 = 51
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0184
        L_0x01e9:
            r13 = r11
            r10 = 0
            goto L_0x013a
        L_0x01ed:
            r1 = 0
            goto L_0x0115
        L_0x01f0:
            r10 = r3
            goto L_0x00d1
        L_0x01f3:
            r2 = 0
            goto L_0x00bb
        L_0x01f6:
            r2 = r3
            goto L_0x00bb
        L_0x01f9:
            X.6Yo r2 = X.DbZ.A0P(r4, r5)
            X.1a1 r1 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            androidx.fragment.app.Fragment r0 = X.C46474Dfc.A00(r0, r1, r8)
            r2.A0B(r3, r0)
            r2.A04()
            goto L_0x0033
        L_0x0211:
            r10 = r1
            r11 = r6
            r12 = r0
            r13 = r2
            r9 = r3
            r7.A05(r8, r9, r10, r11, r12, r13)
        L_0x0219:
            return
        L_0x021a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x021f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E6X.DwV(com.instagram.user.model.User, int):void");
    }

    public final void EBX(View view) {
    }

    public final boolean Erf() {
        return true;
    }

    public final boolean EtC(Product product) {
        return false;
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        String string = requireArguments().getString(DialogModule.KEY_TITLE);
        r4.setTitle(string);
        if (string == null || string.length() == 0) {
            r4.C7z().setImportantForAccessibility(2);
        }
        if (!this.A0K) {
            r4.Eu4(true);
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        this.A04.setAdapter(this.A00);
        0S7.A00(this);
        this.A04.setDivider((Drawable) null);
        C47916EMk eMk = this.A0F;
        if (eMk == null) {
            0qQ.A0F("itemImpressionLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        0S7.A00(this);
        ListView listView = this.A04;
        ListView listView2 = eMk.A00;
        if (listView2 != null) {
            listView2.setOnScrollListener((AbsListView.OnScrollListener) null);
            eMk.A00 = null;
        }
        eMk.A00 = listView;
        listView.setOnScrollListener(eMk);
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A0L);
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final int AqL() {
        return this.A0C;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return this.A0O;
    }

    public final void DBl(Context context, User user, String str, int i) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("text/plain");
        intent.addFlags(268435456);
        intent.setData(0cp.A01(this.A0N, "mailto:rubyzhang@meta.com"));
        0kR.A0D(context, intent);
    }

    public final void DDy(FBUserTag fBUserTag) {
        String str;
        String str2 = this.A0H;
        List list = this.A08;
        if (str2 != null && str2.length() != 0 && list != null && !list.isEmpty()) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            List list2 = this.A09;
            if (list2 != null && !list2.isEmpty()) {
                A1C.addAll(list2);
            }
            A1C.addAll(list);
            AnonymousClass4H4 r1 = AnonymousClass4H4.A00;
            UserSession A0l = AnonymousClass7TE.A0l(this.A0L);
            String str3 = this.A07;
            if (str3 == null) {
                str = "mediaId";
            } else {
                String str4 = this.A0G;
                if (str4 == null) {
                    str = "bottomsheetEntryPoint";
                } else {
                    r1.A05(A0l, fBUserTag, str3, str2, str4, A1C);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
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

    public final String getModuleName() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(AnonymousClass000.A00(4083), this.A0I);
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
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

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final FragmentActivity B7r() {
        return getActivity();
    }

    /* renamed from: CMx */
    public final float CoU() {
        return Math.min(1.0f, (((float) 0nA.A08(requireContext())) * 0.8f) / ((float) requireView().getHeight()));
    }

    public final void DRY(User user, int i) {
        1pE A012 = 1pE.A01(requireActivity(), this, AnonymousClass7TE.A0l(this.A0L), "direct_thread");
        Dbc.A0x(A012, user);
        A012.A06();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final boolean isScrolledToTop() {
        ListView A0X = A0X();
        if (A0X == null || !A0X.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0262: MOVE  (r5v13 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r5v7 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onCreate(android.os.Bundle r33) {
        /*
            r32 = this;
            r0 = -1372827899(0xffffffffae2c4f05, float:-3.9178456E-11)
            int r10 = X.AnonymousClass0fD.A02(r0)
            r3 = r32
            r0 = r33
            X.E6X.super.onCreate(r0)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "shopping_session_id"
            java.lang.String r0 = r1.getString(r0)
            r3.A0J = r0
            android.os.Bundle r0 = r3.requireArguments()
            java.lang.String r6 = "media_id"
            java.lang.String r0 = X.DbU.A0l(r0, r6)
            r3.A07 = r0
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "media_type"
            java.io.Serializable r1 = r1.getSerializable(r0)
            r0 = 1635(0x663, float:2.291E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            r1.getClass()
            X.1iA r1 = (X.1iA) r1
            r3.A0E = r1
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "prior_module"
            java.lang.String r0 = r1.getString(r0)
            r3.A0I = r0
            android.os.Bundle r2 = r3.requireArguments()
            java.lang.String r1 = "is_launched_as_bottom_sheet"
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            r3.A0K = r0
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 71
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            r3.A03 = r0
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 263(0x107, float:3.69E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r9 = ""
            java.lang.String r0 = r1.getString(r0, r9)
            r3.A0H = r0
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 528(0x210, float:7.4E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0, r9)
            r3.A0G = r0
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.0eM r8 = r3.A0L
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r8)
            java.lang.String r2 = r3.A07
            if (r2 != 0) goto L_0x00a1
            java.lang.String r0 = "mediaId"
        L_0x0099:
            X.0qQ.A0F(r0)
        L_0x009c:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a1:
            X.1iA r1 = r3.A0E
            if (r1 != 0) goto L_0x00a8
            java.lang.String r0 = "mediaType"
            goto L_0x0099
        L_0x00a8:
            X.EMk r0 = new X.EMk
            r0.<init>(r3, r4, r1, r2)
            r3.A0F = r0
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 1504(0x5e0, float:2.108E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            r3.A0A = r0
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 4929(0x1341, float:6.907E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r2)
            r3.A0B = r0
            X.1E8 r1 = X.DbX.A0d(r8)
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x02d3
            X.1Xj r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x00ea
            com.instagram.user.model.User r0 = r0.A28()
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = r0.getId()
            r3.A06 = r0
        L_0x00ea:
            X.1E8 r1 = X.DbX.A0d(r8)
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x02d3
            X.1Xj r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0108
            X.1Xy r0 = r0.A0C
            X.DUK r0 = r0.ArP()
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r0.Ad1()
            if (r0 == 0) goto L_0x0108
            r3.A04 = r0
        L_0x0108:
            X.1E8 r1 = X.DbX.A0d(r8)
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x02d3
            X.1Xj r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0126
            X.1Xy r0 = r0.A0C
            X.DUK r0 = r0.ArP()
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = r0.Ad9()
            if (r0 == 0) goto L_0x0126
            r3.A05 = r0
        L_0x0126:
            android.content.Context r17 = r3.requireContext()
            com.instagram.common.session.UserSession r19 = X.AnonymousClass7TE.A0l(r8)
            java.lang.Integer r21 = X.AnonymousClass05K.A00
            android.os.Bundle r4 = r3.requireArguments()
            r0 = 1818(0x71a, float:2.548E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1 = 1
            boolean r28 = r4.getBoolean(r0, r1)
            java.lang.String r14 = r3.A06
            java.lang.String r5 = r3.A07
            java.lang.String r15 = "mediaId"
            r0 = 0
            if (r5 == 0) goto L_0x02d5
            java.lang.String r13 = r3.A03
            java.lang.String r12 = r3.A04
            java.lang.String r4 = r3.A05
            android.os.Bundle r11 = r3.mArguments
            if (r11 == 0) goto L_0x02cf
            r7 = 38
            java.lang.String r7 = X.C66579MXk.A00(r7)
            java.lang.String r27 = r11.getString(r7)
        L_0x015c:
            X.K99 r7 = new X.K99
            r20 = r3
            r23 = r5
            r24 = r13
            r25 = r12
            r26 = r4
            r29 = r1
            r30 = r2
            r31 = r2
            r18 = r3
            r22 = r14
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            android.os.Bundle r5 = r3.requireArguments()
            r4 = 4005(0xfa5, float:5.612E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            boolean r5 = r5.getBoolean(r4)
            boolean r4 = r7.A09
            if (r4 == r5) goto L_0x018b
            r7.A09 = r5
        L_0x018b:
            android.os.Bundle r5 = r3.requireArguments()
            r4 = 800(0x320, float:1.121E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            java.util.ArrayList r11 = r5.getParcelableArrayList(r4)
            r3.A09 = r11
            if (r11 == 0) goto L_0x01be
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto L_0x01be
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r8)
            r18 = 0
            r20 = r1
            r21 = r2
            r17 = r11
            X.1OC r5 = X.C320126ro.A04(r16, r17, r18, r20, r21)
            r4 = 40
            X.C47696EDf.A01(r5, r7, r4)
            r3.schedule(r5)
            r7.A0D(r11)
        L_0x01be:
            boolean r4 = r3.A0A
            if (r4 == 0) goto L_0x021f
            X.1Av r12 = X.DbX.A0h(r8)
            X.0s0 r11 = r12.A0k
            X.0YZ[] r5 = X.1Av.A8a
            r4 = 95
            boolean r4 = X.AnonymousClass7TG.A1a(r12, r11, r5, r4)
            if (r4 != 0) goto L_0x021f
            X.0lg r12 = X.AnonymousClass7TF.A0L(r8, r2)
            X.0Tu r11 = X.0Tu.A05
            r4 = 36326382418015988(0x810ea7000036f4, double:3.036288743529936E-306)
            boolean r4 = X.182.A06(r11, r12, r4)
            if (r4 == 0) goto L_0x021f
            X.1Xv r4 = X.1Xj.A0h
            java.lang.String r4 = r3.A07
            if (r4 == 0) goto L_0x02d5
            java.lang.String r4 = X.1Xv.A06(r4)
            X.0qQ.A0B(r4, r2)
            java.lang.Long r12 = X.AnonymousClass7TE.A10(r4)
            r7.A07 = r1
            X.EyO r4 = new X.EyO
            r4.<init>(r3, r7, r12)
            r7.A01 = r4
            if (r12 == 0) goto L_0x021f
            X.0lg r5 = X.DbT.A0X(r8)
            boolean r4 = r3.A0B
            if (r4 == 0) goto L_0x02cb
            java.lang.String r11 = "collaborators_bottomsheet_reels"
        L_0x0209:
            X.0wc r5 = X.DbT.A0Q(r3, r5, r2)
            java.lang.String r4 = "ig_collaborator_bottom_sheet_education_banner_impression"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r4)
            boolean r4 = r5.isSampled()
            if (r4 == 0) goto L_0x021f
            r5.A9F(r6, r12)
            X.DbV.A1I(r5, r11)
        L_0x021f:
            int r12 = android.os.Build.VERSION.SDK_INT
            r4 = 1872(0x750, float:2.623E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r4)
            r4 = 33
            android.os.Bundle r5 = r3.requireArguments()
            if (r12 < r4) goto L_0x02c5
            java.lang.Class<com.instagram.model.fbusertag.FBUserTag> r4 = com.instagram.model.fbusertag.FBUserTag.class
            java.util.ArrayList r5 = r5.getParcelableArrayList(r11, r4)
        L_0x0235:
            r3.A08 = r5
            java.util.List r4 = r7.A0J
            r4.clear()
            if (r5 == 0) goto L_0x0241
            r4.addAll(r5)
        L_0x0241:
            r7.A0C()
            r3.A00 = r7
            boolean r4 = r3.A0A
            if (r4 == 0) goto L_0x02b6
            X.0lg r11 = X.AnonymousClass7TF.A0L(r8, r2)
            X.0Tu r7 = X.0Tu.A05
            r4 = 36326382418147061(0x810ea7000236f5, double:3.0362887436128274E-306)
            boolean r4 = X.182.A06(r7, r11, r4)
            if (r4 == 0) goto L_0x02b6
            androidx.fragment.app.Fragment r5 = r3.mParentFragment
            boolean r4 = r5 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            r13 = 0
            if (r4 == 0) goto L_0x0268
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r5 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r5
            if (r5 == 0) goto L_0x0268
            X.7Pu r0 = r5.A02
        L_0x0268:
            X.1Xv r4 = X.1Xj.A0h
            java.lang.String r4 = r3.A07
            if (r4 == 0) goto L_0x02d5
            java.lang.String r4 = X.1Xv.A06(r4)
            X.0qQ.A0B(r4, r2)
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r4)
            if (r0 == 0) goto L_0x0294
            r5 = 63
            X.FPH r12 = new X.FPH
            r12.<init>((int) r5, (java.lang.Object) r0, (java.lang.Object) r3, (java.lang.Object) r4)
            r15 = 2131238465(0x7f081e41, float:1.809321E38)
            X.7Ps r11 = new X.7Ps
            r14 = r9
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            X.7Pt r5 = r11.A00()
            r0.A0K(r5, r1)
        L_0x0294:
            if (r4 == 0) goto L_0x02b6
            X.0lg r1 = X.DbT.A0X(r8)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x02c2
            java.lang.String r5 = "collaborators_bottomsheet_reels"
        L_0x02a0:
            X.0wc r1 = X.DbT.A0Q(r3, r1, r2)
            java.lang.String r0 = "ig_collaborator_bottom_sheet_education_info_button_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x02b6
            r1.A9F(r6, r4)
            X.DbV.A1I(r1, r5)
        L_0x02b6:
            X.1Ng r2 = X.DbX.A0R(r8)
            r3.A0D = r2
            if (r2 != 0) goto L_0x02da
            java.lang.String r0 = "igEventBus"
            goto L_0x0099
        L_0x02c2:
            java.lang.String r5 = "collaborators_bottomsheet_feed"
            goto L_0x02a0
        L_0x02c5:
            java.util.ArrayList r5 = r5.getParcelableArrayList(r11)
            goto L_0x0235
        L_0x02cb:
            java.lang.String r11 = "collaborators_bottomsheet_feed"
            goto L_0x0209
        L_0x02cf:
            r27 = r0
            goto L_0x015c
        L_0x02d3:
            java.lang.String r15 = "mediaId"
        L_0x02d5:
            X.0qQ.A0F(r15)
            goto L_0x009c
        L_0x02da:
            java.lang.Class<X.3KA> r1 = X.AnonymousClass3KA.class
            X.FXZ r0 = r3.A0M
            r2.A01(r0, r1)
            java.lang.String r2 = "tags_list"
            X.2k1 r1 = r3.A03
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x02eb
            r1.A00 = r2
        L_0x02eb:
            r0 = -931815926(0xffffffffc8759e0a, float:-251512.16)
            X.AnonymousClass0fD.A09(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E6X.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-927443018);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.tag_list, viewGroup, false);
        AnonymousClass0fD.A09(648489333, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-426930072);
        super.onDestroy();
        1Ng r2 = this.A0D;
        if (r2 == null) {
            0qQ.A0F("igEventBus");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A02(this.A0M, AnonymousClass3KA.class);
        AnonymousClass0fD.A09(-91006159, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1968603500);
        super.onDestroyView();
        C47916EMk eMk = this.A0F;
        if (eMk == null) {
            0qQ.A0F("itemImpressionLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        ListView listView = eMk.A00;
        if (listView != null) {
            listView.setOnScrollListener((AbsListView.OnScrollListener) null);
            eMk.A00 = null;
        }
        AnonymousClass0fD.A09(-1808126961, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1694016676);
        super.onResume();
        K99 k99 = this.A00;
        if (k99 != null) {
            0fE.A00(k99, 944304796);
        }
        AnonymousClass0fD.A09(1994515606, A022);
    }
}
