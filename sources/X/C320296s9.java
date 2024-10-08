package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6s9  reason: invalid class name and case insensitive filesystem */
public final class C320296s9 extends AnonymousClass4DH implements C249763kK, AnonymousClass4DU, AnonymousClass723, AnonymousClass724, C320306sA, C289875eN, C320316sB {
    public static final String __redex_internal_original_name = "ClipsProfileTabFragment";
    public RecyclerView A00;
    public ShimmerFrameLayout A01;
    public C321666uY A02;
    public AnonymousClass72N A03;
    public IgdsEmptyState A04;
    public UserDetailTabController A05;
    public C320516sV A06;
    public C320736sr A07;
    public C320406sK A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public long A0H = -1;
    public 1Ng A0I;
    public 2el A0J;
    public JVO A0K;
    public C229402nK A0L;
    public C322796wQ A0M;
    public C249763kK A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final AnonymousClass0eM A0T = C227642jf.A02(this);
    public final 1wn A0U = new C320376sH(this);
    public final 1wn A0V = new C320386sI(this);
    public final 1wn A0W = new C320366sG(this);

    public final String BhI() {
        return "profile_clips";
    }

    public final /* synthetic */ void D3i(User user) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r0 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D46(X.C267324bN r17, int r18) {
        /*
            r16 = this;
            r15 = 0
            r2 = r17
            X.0qQ.A0B(r2, r15)
            r6 = r16
            X.6uY r1 = r6.A02
            if (r1 != 0) goto L_0x0016
            java.lang.String r0 = "clipsProfileTabPerfLogger"
        L_0x000e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0016:
            java.lang.String r0 = "thumbnail_preview_click_attempt"
            r1.A0E(r0)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x0032
            X.37F r1 = (X.AnonymousClass37F) r1
            boolean r0 = r1.A0g
            if (r0 == 0) goto L_0x0032
            boolean r0 = r1.A0n
            r1 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            X.1Xj r5 = r2.A02
            if (r5 == 0) goto L_0x008d
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.0eM r0 = r6.A0T
            java.lang.Object r4 = r0.getValue()
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r8 = r6.getModuleName()
            boolean r13 = r6.A0F
            java.lang.String r9 = r6.A0B
            if (r9 != 0) goto L_0x0050
            java.lang.String r0 = "profileUserId"
            goto L_0x000e
        L_0x0050:
            java.lang.String r10 = r6.A0A
            if (r10 != 0) goto L_0x0057
            java.lang.String r0 = "gridKey"
            goto L_0x000e
        L_0x0057:
            boolean r0 = r6.A0R
            if (r0 != 0) goto L_0x005e
            r14 = 0
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r14 = 1
        L_0x005f:
            java.lang.String r2 = r6.A09
            r7 = 0
            if (r2 == 0) goto L_0x0086
            r0 = 2814(0xafe, float:3.943E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 == 0) goto L_0x0086
            java.lang.String r1 = r6.A0C
            if (r1 == 0) goto L_0x0086
            X.1Xv r0 = X.1Xj.A0h     // Catch:{ NumberFormatException -> 0x0086 }
            java.lang.String r0 = X.1Xv.A06(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0086 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0086 }
        L_0x0086:
            java.lang.String r11 = r6.A0O
            r12 = r18
            X.I6Y.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320296s9.D46(X.4bN, int):void");
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r6, int i) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(motionEvent, 2);
        C321666uY r1 = this.A02;
        AnonymousClass32J r2 = null;
        if (r1 == null) {
            0qQ.A0F("clipsProfileTabPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A0E("thumbnail_preview_peek_attempt");
        AnonymousClass32J r12 = this.mParentFragment;
        if (r12 instanceof AnonymousClass32J) {
            r2 = r12;
        }
        1Xj r0 = r6.A02;
        if (r2 == null || r0 == null) {
            return false;
        }
        return r2.DII(motionEvent, view, r0, i);
    }

    public final void DWI(int i, ViewGroup viewGroup) {
        int i2;
        0qQ.A0B(viewGroup, 1);
        View requireViewById = viewGroup.requireViewById(R.id.use_in_camera_button_scene_root);
        0qQ.A07(requireViewById);
        View requireViewById2 = viewGroup.requireViewById(R.id.profile_header_container);
        0qQ.A07(requireViewById2);
        requireViewById.measure(0, 0);
        int measuredHeight = requireViewById.getMeasuredHeight();
        Rect rect = new Rect();
        Resources resources = viewGroup.getContext().getResources();
        requireViewById2.getDrawingRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(requireViewById2, rect);
        int i3 = rect.bottom;
        IgdsEmptyState igdsEmptyState = this.A04;
        if (igdsEmptyState != null) {
            i2 = Math.max(igdsEmptyState.getHeight(), 0);
        } else {
            i2 = 0;
        }
        if (!this.A0F || !this.A0E || i3 <= 0 || this.A0D || viewGroup.getHeight() - i3 < i2 + measuredHeight + resources.getDimensionPixelOffset(R.dimen.abc_dialog_padding_material)) {
            requireViewById.setVisibility(8);
            return;
        }
        if (requireViewById.getVisibility() == 8) {
            0wc A022 = AnonymousClass0kN.A02((0lg) this.A0T.getValue());
            0Aj A002 = A022.A00(A022.A00, "ig_camera_clips_tab_camera_button_impression");
            if (A002.isSampled()) {
                A002.A8M(C279294yP.CLIPS, "camera_destination");
                A002.A8k("entity_type", 8);
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.Cgf();
            }
        }
        requireViewById.setVisibility(0);
    }

    public final void DWX() {
    }

    public final void DWZ() {
    }

    public final void Daz(UserDetailTabController userDetailTabController) {
        String str;
        0qQ.A0B(userDetailTabController, 0);
        if (this.A05 == null) {
            this.A05 = userDetailTabController;
            C229352nF A002 = C229342nE.A00((UserSession) this.A0T.getValue());
            String str2 = this.A0A;
            if (str2 == null) {
                str = "gridKey";
            } else {
                C294885nC r1 = (C294885nC) A002.A01.get(str2);
                if (r1 != null) {
                    r1.A07 = true;
                }
                C320406sK r0 = this.A08;
                if (r0 == null) {
                    str = "clipsProfileTabFetcher";
                } else {
                    r0.A01();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DeD(int i) {
    }

    public final void DhR(boolean z) {
    }

    public final void DqM() {
        this.A0E = false;
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        0qQ.A0B(configuration, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("ClipsProfileTabFragment.onConfigurationChanged", -978647287);
        }
        try {
            super.onConfigurationChanged(configuration);
            Configuration configuration2 = requireContext().getResources().getConfiguration();
            0qQ.A07(configuration2);
            if (!(!O3Z.A00(configuration2, configuration) || (recyclerView = this.A00) == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnGlobalLayoutListener(new C56818IDp(this));
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1606711703);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r8 = 0
            r4 = r26
            X.0qQ.A0B(r4, r8)
            r16 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0016
            r1 = 1256633514(0x4ae6b4aa, float:7559765.0)
            java.lang.String r0 = "ClipsProfileTabFragment.onViewCreated"
            X.0fS.A01(r0, r1)
        L_0x0016:
            r6 = r25
            r0 = r27
            super.onViewCreated(r4, r0)     // Catch:{ all -> 0x0226 }
            android.content.Context r5 = r6.requireContext()     // Catch:{ all -> 0x0226 }
            r11 = 3
            com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager r1 = new com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager     // Catch:{ all -> 0x0226 }
            r1.<init>(r5, r11)     // Catch:{ all -> 0x0226 }
            X.6sV r0 = r6.A06     // Catch:{ all -> 0x0226 }
            java.lang.String r18 = "clipsGridAdapter"
            r2 = 0
            if (r0 == 0) goto L_0x0216
            X.0eM r0 = r0.A0N     // Catch:{ all -> 0x0226 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0226 }
            X.6sz r0 = (X.C320806sz) r0     // Catch:{ all -> 0x0226 }
            r1.A01 = r0     // Catch:{ all -> 0x0226 }
            r0 = 2131430116(0x7f0b0ae4, float:1.8481924E38)
            android.view.View r0 = r4.requireViewById(r0)     // Catch:{ all -> 0x0226 }
            com.facebook.shimmer.ShimmerFrameLayout r0 = (com.facebook.shimmer.ShimmerFrameLayout) r0     // Catch:{ all -> 0x0226 }
            r6.A01 = r0     // Catch:{ all -> 0x0226 }
            r0 = 2131430115(0x7f0b0ae3, float:1.8481922E38)
            android.view.View r0 = r4.requireViewById(r0)     // Catch:{ all -> 0x0226 }
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0     // Catch:{ all -> 0x0226 }
            r6.A00 = r0     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x0053
            r0.setLayoutManager(r1)     // Catch:{ all -> 0x0226 }
        L_0x0053:
            androidx.recyclerview.widget.RecyclerView r1 = r6.A00     // Catch:{ all -> 0x0226 }
            if (r1 == 0) goto L_0x0060
            X.6sV r0 = r6.A06     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x0216
            X.2t9 r0 = r0.A0I     // Catch:{ all -> 0x0226 }
            r1.setAdapter(r0)     // Catch:{ all -> 0x0226 }
        L_0x0060:
            X.0eM r7 = r6.A0T     // Catch:{ all -> 0x0226 }
            java.lang.Object r3 = r7.getValue()     // Catch:{ all -> 0x0226 }
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3     // Catch:{ all -> 0x0226 }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x0226 }
            r0 = 36323045228751629(0x810b9e00052b0d, double:3.034178291601373E-306)
            boolean r0 = X.182.A06(r9, r3, r0)     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x007c
            r0.setItemAnimator(r2)     // Catch:{ all -> 0x0226 }
        L_0x007c:
            r0 = 2131430188(0x7f0b0b2c, float:1.848207E38)
            android.view.View r1 = r4.requireViewById(r0)     // Catch:{ all -> 0x0226 }
            com.instagram.igds.components.emptystate.IgdsEmptyState r1 = (com.instagram.igds.components.emptystate.IgdsEmptyState) r1     // Catch:{ all -> 0x0226 }
            r6.A04 = r1     // Catch:{ all -> 0x0226 }
            if (r1 == 0) goto L_0x008f
            r0 = 2131955625(0x7f130fa9, float:1.9547783E38)
            r1.setHeadline((int) r0)     // Catch:{ all -> 0x0226 }
        L_0x008f:
            com.instagram.igds.components.emptystate.IgdsEmptyState r0 = r6.A04     // Catch:{ all -> 0x0226 }
            r4 = 1
            if (r0 == 0) goto L_0x0097
            r0.setIsEmphasized(r4)     // Catch:{ all -> 0x0226 }
        L_0x0097:
            com.instagram.igds.components.emptystate.IgdsEmptyState r3 = r6.A04     // Catch:{ all -> 0x0226 }
            if (r3 == 0) goto L_0x00a6
            r1 = 2131955624(0x7f130fa8, float:1.954778E38)
            X.6t0 r0 = new X.6t0     // Catch:{ all -> 0x0226 }
            r0.<init>(r6)     // Catch:{ all -> 0x0226 }
            r3.ENc(r0, r1)     // Catch:{ all -> 0x0226 }
        L_0x00a6:
            com.instagram.igds.components.emptystate.IgdsEmptyState r10 = r6.A04     // Catch:{ all -> 0x0226 }
            r3 = 0
            if (r10 == 0) goto L_0x00b5
            boolean r1 = r6.A0D     // Catch:{ all -> 0x0226 }
            r0 = 8
            if (r1 == 0) goto L_0x00b2
            r0 = 0
        L_0x00b2:
            r10.setVisibility(r0)     // Catch:{ all -> 0x0226 }
        L_0x00b5:
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x0226 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x0226 }
            X.17i r1 = X.17h.A00(r0)     // Catch:{ all -> 0x0226 }
            java.lang.String r0 = r6.A0B     // Catch:{ all -> 0x0226 }
            java.lang.String r15 = "profileUserId"
            if (r0 == 0) goto L_0x0212
            com.instagram.user.model.User r10 = r1.A02(r0)     // Catch:{ all -> 0x0226 }
            X.6sV r0 = r6.A06     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x0216
            java.util.List r0 = X.C320516sV.A00(r0)     // Catch:{ all -> 0x0226 }
            int r0 = r0.size()     // Catch:{ all -> 0x0226 }
            if (r0 != 0) goto L_0x00df
            if (r10 == 0) goto L_0x00f1
            int r0 = r10.A07()     // Catch:{ all -> 0x0226 }
            if (r0 != 0) goto L_0x00f1
        L_0x00df:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r6.A01     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x00e6
            r0.A05()     // Catch:{ all -> 0x0226 }
        L_0x00e6:
            X.6sK r12 = r6.A08     // Catch:{ all -> 0x0226 }
            if (r12 != 0) goto L_0x0113
            java.lang.String r0 = "clipsProfileTabFetcher"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0226 }
            goto L_0x0219
        L_0x00f1:
            java.lang.Object r12 = r7.getValue()     // Catch:{ all -> 0x0226 }
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12     // Catch:{ all -> 0x0226 }
            r0 = 36324737447375164(0x810d28001c313c, double:3.035248457472914E-306)
            boolean r0 = X.182.A06(r9, r12, r0)     // Catch:{ all -> 0x0226 }
            if (r0 != 0) goto L_0x010b
            X.6sV r1 = r6.A06     // Catch:{ all -> 0x0226 }
            if (r1 == 0) goto L_0x0216
            r0 = 9
            r1.A04(r0)     // Catch:{ all -> 0x0226 }
        L_0x010b:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r6.A01     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x00e6
            r0.A02()     // Catch:{ all -> 0x0226 }
            goto L_0x00e6
        L_0x0113:
            X.71i r22 = X.C3251771i.A06     // Catch:{ all -> 0x0226 }
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x021e
            X.3pI r0 = r0.A0D     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x021e
            X.71j r1 = new X.71j     // Catch:{ all -> 0x0226 }
            r20 = r0
            r21 = r12
            r23 = r4
            r24 = r8
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0226 }
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION     // Catch:{ all -> 0x0226 }
            androidx.fragment.app.FragmentActivity r14 = r6.requireActivity()     // Catch:{ all -> 0x0226 }
            java.lang.Object r13 = r7.getValue()     // Catch:{ all -> 0x0226 }
            com.instagram.common.session.UserSession r13 = (com.instagram.common.session.UserSession) r13     // Catch:{ all -> 0x0226 }
            r0 = 23608081(0x1683b11, float:4.2654048E-38)
            X.2nK r12 = new X.2nK     // Catch:{ all -> 0x0226 }
            r12.<init>(r14, r6, r13, r0)     // Catch:{ all -> 0x0226 }
            r6.A0L = r12     // Catch:{ all -> 0x0226 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0226 }
            r12.A03 = r0     // Catch:{ all -> 0x0226 }
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x014d
            r0.A15(r12)     // Catch:{ all -> 0x0226 }
        L_0x014d:
            r6.registerLifecycleListener(r12)     // Catch:{ all -> 0x0226 }
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x0157
            r0.A15(r1)     // Catch:{ all -> 0x0226 }
        L_0x0157:
            boolean r0 = r6.A0F     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x0178
            X.07V r0 = r6.getLifecycle()     // Catch:{ all -> 0x0226 }
            X.0xx r12 = X.C71772f0.A00(r0)     // Catch:{ all -> 0x0226 }
            X.12T r1 = X.AnonymousClass12T.A00     // Catch:{ all -> 0x0226 }
            r0 = 480314591(0x1ca104df, float:1.0655345E-21)
            X.0nV r11 = r1.CO6(r0, r11)     // Catch:{ all -> 0x0226 }
            r0 = 38
            X.9Jr r1 = new X.9Jr     // Catch:{ all -> 0x0226 }
            r1.<init>(r6, r2, r0)     // Catch:{ all -> 0x0226 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0226 }
            X.1Eo.A03(r0, r11, r1, r12)     // Catch:{ all -> 0x0226 }
        L_0x0178:
            X.2el r11 = r6.A0J     // Catch:{ all -> 0x0226 }
            if (r11 != 0) goto L_0x0183
            java.lang.String r0 = "viewpointManager"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0226 }
            goto L_0x0219
        L_0x0183:
            X.3DZ r2 = X.AnonymousClass3DZ.A00(r6)     // Catch:{ all -> 0x0226 }
            androidx.recyclerview.widget.RecyclerView r1 = r6.A00     // Catch:{ all -> 0x0226 }
            X.2eo[] r0 = new X.AnonymousClass2eo[r8]     // Catch:{ all -> 0x0226 }
            r11.A08(r1, r2, r0)     // Catch:{ all -> 0x0226 }
            boolean r0 = r6.A0F     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x01b1
            X.72N r0 = r6.A03     // Catch:{ all -> 0x0226 }
            if (r0 != 0) goto L_0x019c
            java.lang.String r0 = "clipsDraftListViewModel"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0226 }
            goto L_0x0219
        L_0x019c:
            X.2Fk r11 = r0.A01     // Catch:{ all -> 0x0226 }
            X.07Z r2 = r6.getViewLifecycleOwner()     // Catch:{ all -> 0x0226 }
            r0 = 13
            X.9LR r1 = new X.9LR     // Catch:{ all -> 0x0226 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x0226 }
            X.6qo r0 = new X.6qo     // Catch:{ all -> 0x0226 }
            r0.<init>(r1)     // Catch:{ all -> 0x0226 }
            r11.A06(r2, r0)     // Catch:{ all -> 0x0226 }
        L_0x01b1:
            if (r10 == 0) goto L_0x01fa
            X.4Cl r0 = r10.A03     // Catch:{ all -> 0x0226 }
            java.lang.Boolean r0 = r0.BBM()     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x01fa
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0226 }
            if (r0 != r4) goto L_0x01fa
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x0226 }
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2     // Catch:{ all -> 0x0226 }
            X.0qQ.A0B(r2, r8)     // Catch:{ all -> 0x0226 }
            r0 = 36323612164107575(0x810c2200002d37, double:3.034536823803339E-306)
            boolean r0 = X.182.A06(r9, r2, r0)     // Catch:{ all -> 0x0226 }
            if (r0 != 0) goto L_0x01fa
            X.6sV r1 = r6.A06     // Catch:{ all -> 0x0226 }
            if (r1 == 0) goto L_0x0216
            boolean r0 = r1.A08     // Catch:{ all -> 0x0226 }
            if (r0 == r4) goto L_0x01df
            r1.A06 = r8     // Catch:{ all -> 0x0226 }
        L_0x01df:
            r1.A08 = r4     // Catch:{ all -> 0x0226 }
            r1.update()     // Catch:{ all -> 0x0226 }
            java.lang.Object r3 = r7.getValue()     // Catch:{ all -> 0x0226 }
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3     // Catch:{ all -> 0x0226 }
            java.lang.String r2 = r6.A0B     // Catch:{ all -> 0x0226 }
            if (r2 == 0) goto L_0x0212
            X.07Z r1 = r6.getViewLifecycleOwner()     // Catch:{ all -> 0x0226 }
            X.JVO r0 = new X.JVO     // Catch:{ all -> 0x0226 }
            r0.<init>(r1, r3, r6, r2)     // Catch:{ all -> 0x0226 }
            r6.A0K = r0     // Catch:{ all -> 0x0226 }
            r3 = 1
        L_0x01fa:
            androidx.recyclerview.widget.RecyclerView r1 = r6.A00     // Catch:{ all -> 0x0226 }
            if (r1 == 0) goto L_0x0205
            X.6t2 r0 = X.C320826t1.A00(r5, r3, r4)     // Catch:{ all -> 0x0226 }
            r1.A11(r0)     // Catch:{ all -> 0x0226 }
        L_0x0205:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0211
            r0 = 1320532527(0x4eb5ba2f, float:1.52443891E9)
            X.0fS.A00(r0)
        L_0x0211:
            return
        L_0x0212:
            X.0qQ.A0F(r15)     // Catch:{ all -> 0x0226 }
            goto L_0x0219
        L_0x0216:
            X.0qQ.A0F(r18)     // Catch:{ all -> 0x0226 }
        L_0x0219:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0225
        L_0x021e:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0226 }
            r1.<init>(r0)     // Catch:{ all -> 0x0226 }
        L_0x0225:
            throw r1     // Catch:{ all -> 0x0226 }
        L_0x0226:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0233
            r0 = 708552364(0x2a3ba6ac, float:1.6666762E-13)
            X.0fS.A00(r0)
        L_0x0233:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320296s9.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        if (r1 != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C320296s9 r7, boolean r8) {
        /*
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r6 = r7.A0T
            java.lang.Object r0 = r6.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.user.model.User r5 = r1.A01(r0)
            r4 = 0
            if (r8 == 0) goto L_0x005d
            java.lang.Object r2 = r6.getValue()
            X.0lg r2 = (X.0lg) r2
            X.0qQ.A0B(r2, r4)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318136080930691(0x81072700021783, double:3.03107372675186E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x0048
            java.lang.Object r2 = r6.getValue()
            X.0lg r2 = (X.0lg) r2
            boolean r0 = r5.A1a()
            X.0qQ.A0B(r2, r4)
            if (r0 != 0) goto L_0x005d
            r0 = 36318136081586060(0x810727000c178c, double:3.031073727166318E-306)
            boolean r1 = X.182.A06(r3, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x005d
        L_0x0048:
            r2 = 1
        L_0x0049:
            r7.A0D = r2
            com.instagram.igds.components.emptystate.IgdsEmptyState r1 = r7.A04
            if (r1 == 0) goto L_0x005c
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x0057
            if (r8 == 0) goto L_0x0057
            if (r2 != 0) goto L_0x0059
        L_0x0057:
            r4 = 8
        L_0x0059:
            r1.setVisibility(r4)
        L_0x005c:
            return
        L_0x005d:
            r2 = 0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320296s9.A01(X.6s9, boolean):void");
    }

    private final void A02(boolean z) {
        Integer num;
        if (Systrace.A0E(1)) {
            0fS.A01("ClipsProfileTabFragment.maybeFetch", -745797197);
        }
        try {
            if (!this.A0P || this.A0G) {
                C321666uY r6 = this.A02;
                if (r6 == null) {
                    0qQ.A0F("clipsProfileTabPerfLogger");
                } else {
                    Context requireContext = requireContext();
                    String str = this.A0B;
                    if (str == null) {
                        0qQ.A0F("profileUserId");
                    } else {
                        if (!r6.A01) {
                            r6.A01 = true;
                            r6.A0Q(requireContext, C71342cb.A00(r6.A02), this, true);
                            r6.A0N();
                            r6.A0U(str);
                            if ("profile_clips".length() != 0) {
                                r6.A01 = "profile_clips";
                            }
                        }
                        if (this.A0G) {
                            C320406sK r0 = this.A08;
                            if (r0 != null) {
                                r0.A01();
                                this.A0G = false;
                            }
                        } else {
                            AnonymousClass0eM r5 = this.A0T;
                            UserSession userSession = (UserSession) r5.getValue();
                            0qQ.A0B(userSession, 0);
                            0Tu r7 = 0Tu.A05;
                            if (182.A06(r7, userSession, 36323809732734496L)) {
                                if (z) {
                                    UserSession userSession2 = (UserSession) r5.getValue();
                                    0qQ.A0B(userSession2, 0);
                                    if (182.A06(r7, userSession2, 36323809733389865L)) {
                                        C320406sK r1 = this.A08;
                                        if (r1 != null) {
                                            r1.A04((Long) null, (String) null, 0sn.A00, false);
                                        }
                                    }
                                }
                                C320406sK r02 = this.A08;
                                if (r02 != null) {
                                    C320396sJ r03 = r02.A01;
                                    if (r03 != null) {
                                        num = r03.A00;
                                    } else {
                                        num = null;
                                    }
                                    Integer num2 = AnonymousClass05K.A00;
                                    if (num != num2) {
                                        UserSession userSession3 = (UserSession) r5.getValue();
                                        0qQ.A0B(userSession3, 0);
                                        if (!182.A06(r7, userSession3, 36323809733389865L)) {
                                            C320406sK r12 = this.A08;
                                            if (r12 != null) {
                                                C320396sJ r04 = r12.A01;
                                                if (r04 != null) {
                                                    r04.A00 = num2;
                                                }
                                                r12.A04((Long) null, (String) null, 0sn.A00, false);
                                            }
                                        }
                                    }
                                }
                            } else {
                                C320406sK r13 = this.A08;
                                if (r13 != null) {
                                    r13.A04((Long) null, (String) null, 0sn.A00, false);
                                }
                            }
                            this.A0P = true;
                        }
                        0qQ.A0F("clipsProfileTabFetcher");
                    }
                }
                throw AnonymousClass00P.createAndThrow();
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1471114068);
            }
        }
    }

    public final Fragment ACU() {
        return this;
    }

    public final List Any() {
        List singletonList = Collections.singletonList(new C320786sw(this));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public final /* bridge */ /* synthetic */ C320416sL Ao3() {
        C320406sK r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("clipsProfileTabFetcher");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String B9m() {
        String str = this.A0A;
        if (str != null) {
            return str;
        }
        0qQ.A0F("gridKey");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ViewGroup BqB() {
        return this.A00;
    }

    public final void D3f(View view) {
        AnonymousClass0eM r4 = this.A0T;
        AnonymousClass9PJ.A00((UserSession) r4.getValue()).A07(28D.A0z, true);
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, (0lg) r4.getValue(), 36323470430252201L)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("args_clips_drafts_fragment_should_use_dark_mode", 182.A06(r5, (0lg) r4.getValue(), 36323470430186664L));
            bundle.putBoolean("args_is_from_profile", true);
            AnonymousClass6W8 r42 = new AnonymousClass6W8(getActivity(), bundle, (0lg) r4.getValue(), ModalActivity.class, "clips_drafts");
            r42.A08();
            r42.A0C(getActivity());
            return;
        }
        C309516Yo r2 = new C309516Yo(requireActivity(), (0lg) r4.getValue());
        r2.A0F = true;
        r2.A0B((Bundle) null, C55243HeY.A00((C59725JVj) null, (UserSession) r4.getValue(), true));
        r2.A04();
    }

    public final void DqG(boolean z) {
        if (this.A0S) {
            A02(z);
        }
    }

    public final void DqL(boolean z) {
        String str;
        if (!this.A0S) {
            A02(z);
        }
        if (this.A0F) {
            AnonymousClass72N r0 = this.A03;
            if (r0 == null) {
                str = "clipsDraftListViewModel";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            r0.A0E();
        }
        C322796wQ r02 = this.A0M;
        if (r02 == null) {
            str = "dataProvider";
        } else {
            C322696wG r2 = r02.A09;
            C320516sV r1 = this.A06;
            if (r1 == null) {
                str = "clipsGridAdapter";
            } else {
                r2.A00 = new WeakReference(r1);
                this.A0E = true;
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DyE() {
        JVO jvo = this.A0K;
        if (jvo != null) {
            FragmentActivity requireActivity = requireActivity();
            0qQ.A07(requireActivity.getSupportFragmentManager());
            C63861L9q l9q = new C63861L9q(jvo.A02);
            l9q.A02 = new C46448DfA(2131964070);
            Resources resources = requireActivity.getResources();
            0qQ.A07(resources);
            l9q.A00 = (resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen) * 3) + (resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) * 2);
            l9q.A01 = new C65737Lyr(jvo);
            C63779L6l l6l = new C63779L6l(l9q, l9q.A04);
            C331157Pu r0 = l6l.A00;
            K4V k4v = l6l.A02;
            r0.A03(requireActivity, k4v);
            C63861L9q l9q2 = l6l.A01;
            C46448DfA dfA = l9q2.A02;
            if (dfA != null) {
                C60411Jl4 jl4 = k4v.A07;
                jl4.A01 = dfA;
                jl4.notifyDataSetChanged();
            }
            List list = l9q2.A05;
            0qQ.A0B(list, 0);
            C60411Jl4 jl42 = k4v.A07;
            jl42.A02 = list;
            jl42.notifyDataSetChanged();
            jvo.A00 = l6l;
            JVO.A00(jvo);
        }
    }

    public final String getModuleName() {
        ClipsViewerSource clipsViewerSource;
        if (this.A0F) {
            clipsViewerSource = ClipsViewerSource.SELF_PROFILE;
        } else if (this.A0Q) {
            clipsViewerSource = ClipsViewerSource.GROUP_PROFILE;
        } else {
            clipsViewerSource = ClipsViewerSource.PROFILE;
        }
        return clipsViewerSource.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A0T.getValue();
    }

    public final String getSessionId() {
        C249763kK r0 = this.A0N;
        if (r0 != null) {
            return r0.getSessionId();
        }
        0qQ.A0F("sessionIdProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C320296s9 r32, List list) {
        SimpleImageUrl simpleImageUrl;
        String str;
        AnonymousClass51R r0;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                simpleImageUrl = null;
                break;
            }
            C369968vc r1 = (C369968vc) it.next();
            str = r1.A08;
            if (str != null || ((r0 = r1.A05) != null && (str = r0.A0E) != null)) {
                Uri fromFile = Uri.fromFile(new File(str));
                0qQ.A07(fromFile);
                simpleImageUrl = C253833rU.A00(fromFile, -1, -1);
            }
        }
        Uri fromFile2 = Uri.fromFile(new File(str));
        0qQ.A07(fromFile2);
        simpleImageUrl = C253833rU.A00(fromFile2, -1, -1);
        C320296s9 r9 = r32;
        C320516sV r02 = r9.A06;
        if (r02 != null) {
            r02.A02();
            ShimmerFrameLayout shimmerFrameLayout = r9.A01;
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.A05();
            }
            AnonymousClass0eM r4 = r9.A0T;
            boolean A062 = 182.A06(0Tu.A05, (0lg) r4.getValue(), 36324174804823900L);
            C320516sV r2 = r9.A06;
            if (r2 != null) {
                if (A062) {
                    r2.A03 = new C49455Evw(simpleImageUrl, list.size());
                } else {
                    r2.A04 = new C378189Ov(simpleImageUrl);
                }
                r2.A06 = false;
                r2.update();
                C319976rX.A02((C3263576k) null, (C69445Nlp) null, r9, (UserSession) r4.getValue(), C319986rY.SELF, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, (Long) null, "impression_drafts_entry_point", ((UserSession) r4.getValue()).A06, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
                return;
            }
        }
        0qQ.A0F("clipsGridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D04() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A0H > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
            AnonymousClass0eM r1 = this.A0T;
            r1.getValue();
            AnonymousClass6W8 A022 = AnonymousClass6W8.A02(requireActivity(), C250563lf.A0C(28D.A3t).A00(), (0lg) r1.getValue(), TransparentModalActivity.class, "clips_camera");
            A022.A07();
            A022.A0C(requireActivity());
            this.A0H = currentTimeMillis;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: X.0iw} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a1, code lost:
        if (r0 == false) goto L_0x00a3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r0 = -511132816(0xffffffffe188bb70, float:-3.1528294E20)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r9 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x0017
            r1 = -276075132(0xffffffffef8b6d84, float:-8.6301625E28)
            java.lang.String r0 = "ClipsProfileTabFragment.onCreate"
            X.0fS.A01(r0, r1)
        L_0x0017:
            r15 = r24
            r0 = r25
            X.C320296s9.super.onCreate(r0)     // Catch:{ all -> 0x0202 }
            android.content.Context r12 = r15.requireContext()     // Catch:{ all -> 0x0202 }
            android.os.Bundle r1 = r15.mArguments     // Catch:{ all -> 0x0202 }
            if (r1 == 0) goto L_0x01f4
            java.lang.String r3 = "ClipsProfileTabFragment.ARGS_PROFILE_USER_ID"
            java.lang.String r0 = r1.getString(r3)     // Catch:{ all -> 0x0202 }
            X.C320236s2.A03(r1, r0, r3)     // Catch:{ all -> 0x0202 }
            r15.A0B = r0     // Catch:{ all -> 0x0202 }
            X.0eM r5 = r15.A0T     // Catch:{ all -> 0x0202 }
            java.lang.Object r3 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r15.A0B     // Catch:{ all -> 0x0202 }
            java.lang.String r11 = "profileUserId"
            if (r0 == 0) goto L_0x01ec
            boolean r0 = X.2R8.A05(r3, r0)     // Catch:{ all -> 0x0202 }
            r15.A0F = r0     // Catch:{ all -> 0x0202 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0202 }
            r15.A0A = r0     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "source_media_id"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0202 }
            r15.A0C = r0     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "source_ranking_info_token"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0202 }
            r15.A0O = r0     // Catch:{ all -> 0x0202 }
            X.1L1 r0 = X.1L2.A00()     // Catch:{ all -> 0x0202 }
            r15.A0N = r0     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "is_profile_side_panel"
            r6 = 0
            boolean r0 = r1.getBoolean(r0, r6)     // Catch:{ all -> 0x0202 }
            r15.A0R = r0     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "is_group_profile"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ all -> 0x0202 }
            r15.A0Q = r0     // Catch:{ all -> 0x0202 }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x0202 }
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)     // Catch:{ all -> 0x0202 }
            r15.A0I = r0     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "from_module"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0202 }
            r15.A09 = r0     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "profile_starting_tab"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ all -> 0x0202 }
            java.lang.Object r4 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4     // Catch:{ all -> 0x0202 }
            boolean r3 = r15.A0F     // Catch:{ all -> 0x0202 }
            if (r1 == 0) goto L_0x00a3
            java.lang.String r0 = "profile_clips"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0202 }
            r1 = 1
            if (r0 != 0) goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            X.6uY r0 = new X.6uY     // Catch:{ all -> 0x0202 }
            r0.<init>(r4, r3, r1)     // Catch:{ all -> 0x0202 }
            r15.A02 = r0     // Catch:{ all -> 0x0202 }
            boolean r0 = r15.A0F     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x00b0
            r6 = 1
        L_0x00b0:
            r15.A0S = r6     // Catch:{ all -> 0x0202 }
            java.lang.Object r8 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8     // Catch:{ all -> 0x0202 }
            java.lang.String r6 = r15.A0B     // Catch:{ all -> 0x0202 }
            if (r6 == 0) goto L_0x01ec
            X.0gy r0 = X.AnonymousClass07i.A00(r15)     // Catch:{ all -> 0x0202 }
            r3 = 0
            X.2lw r4 = new X.2lw     // Catch:{ all -> 0x0202 }
            r4.<init>(r12, r0, r3)     // Catch:{ all -> 0x0202 }
            X.6sJ r22 = X.C320396sJ.A01     // Catch:{ all -> 0x0202 }
            if (r22 != 0) goto L_0x00d1
            X.6sJ r22 = new X.6sJ     // Catch:{ all -> 0x0202 }
            r22.<init>()     // Catch:{ all -> 0x0202 }
            X.C320396sJ.A01 = r22     // Catch:{ all -> 0x0202 }
        L_0x00d1:
            X.6uY r0 = r15.A02     // Catch:{ all -> 0x0202 }
            java.lang.String r7 = "clipsProfileTabPerfLogger"
            if (r0 == 0) goto L_0x0112
            X.6sK r1 = new X.6sK     // Catch:{ all -> 0x0202 }
            r17 = r12
            r18 = r0
            r19 = r15
            r20 = r8
            r21 = r4
            r23 = r6
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0202 }
            r15.A08 = r1     // Catch:{ all -> 0x0202 }
            X.6sR r0 = new X.6sR     // Catch:{ all -> 0x0202 }
            r0.<init>(r15)     // Catch:{ all -> 0x0202 }
            r1.A03(r0)     // Catch:{ all -> 0x0202 }
            r0 = 1058013184(0x3f100000, float:0.5625)
            r4 = 0
            X.6sS r14 = new X.6sS     // Catch:{ all -> 0x0202 }
            r14.<init>(r0, r4, r4)     // Catch:{ all -> 0x0202 }
            X.2el r0 = X.2el.A00()     // Catch:{ all -> 0x0202 }
            r15.A0J = r0     // Catch:{ all -> 0x0202 }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6     // Catch:{ all -> 0x0202 }
            X.6uY r13 = r15.A02     // Catch:{ all -> 0x0202 }
            if (r13 == 0) goto L_0x0112
            X.2el r7 = r15.A0J     // Catch:{ all -> 0x0202 }
            if (r7 != 0) goto L_0x0117
            java.lang.String r7 = "viewpointManager"
        L_0x0112:
            X.0qQ.A0F(r7)     // Catch:{ all -> 0x0202 }
            goto L_0x01ef
        L_0x0117:
            java.lang.Object r1 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r15.A0C     // Catch:{ all -> 0x0202 }
            X.6sT r16 = new X.6sT     // Catch:{ all -> 0x0202 }
            r18 = r1
            r19 = r7
            r20 = r15
            r21 = r0
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0202 }
            java.lang.Object r8 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8     // Catch:{ all -> 0x0202 }
            X.0qQ.A0B(r8, r4)     // Catch:{ all -> 0x0202 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0202 }
            r0 = 36314270610557434(0x8103a3000509fa, double:3.028629187722813E-306)
            boolean r22 = X.182.A06(r7, r8, r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r1 = r15.A0C     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r15.A0B     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01ec
            X.6sV r11 = new X.6sV     // Catch:{ all -> 0x0202 }
            r17 = r15
            r18 = r6
            r19 = r3
            r20 = r1
            r21 = r0
            r23 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0202 }
            r15.A06 = r11     // Catch:{ all -> 0x0202 }
            androidx.fragment.app.FragmentActivity r6 = r15.requireActivity()     // Catch:{ all -> 0x0202 }
            androidx.fragment.app.FragmentActivity r3 = r15.requireActivity()     // Catch:{ all -> 0x0202 }
            java.lang.Object r1 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ all -> 0x0202 }
            r0 = 1
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x0202 }
            X.72M r0 = new X.72M     // Catch:{ all -> 0x0202 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0202 }
            X.2YN r1 = new X.2YN     // Catch:{ all -> 0x0202 }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x0202 }
            java.lang.Class<X.72N> r0 = X.AnonymousClass72N.class
            X.2YL r0 = r1.A00(r0)     // Catch:{ all -> 0x0202 }
            X.72N r0 = (X.AnonymousClass72N) r0     // Catch:{ all -> 0x0202 }
            r15.A03 = r0     // Catch:{ all -> 0x0202 }
            X.2jd r7 = new X.2jd     // Catch:{ all -> 0x0202 }
            r7.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6     // Catch:{ all -> 0x0202 }
            java.lang.String r3 = r15.getModuleName()     // Catch:{ all -> 0x0202 }
            X.5nD r1 = X.C294895nD.GRAPHQL     // Catch:{ all -> 0x0202 }
            X.6sr r0 = new X.6sr     // Catch:{ all -> 0x0202 }
            r0.<init>(r15, r1, r6, r3)     // Catch:{ all -> 0x0202 }
            r15.A07 = r0     // Catch:{ all -> 0x0202 }
            r7.A0E(r0)     // Catch:{ all -> 0x0202 }
            java.lang.Object r3 = r5.getValue()     // Catch:{ all -> 0x0202 }
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3     // Catch:{ all -> 0x0202 }
            X.6ss r1 = new X.6ss     // Catch:{ all -> 0x0202 }
            r1.<init>(r15)     // Catch:{ all -> 0x0202 }
            X.36D r0 = new X.36D     // Catch:{ all -> 0x0202 }
            r0.<init>(r3, r1, r4, r4)     // Catch:{ all -> 0x0202 }
            r7.A0E(r0)     // Catch:{ all -> 0x0202 }
            r15.registerLifecycleListenerSet(r7)     // Catch:{ all -> 0x0202 }
            X.1Ng r3 = r15.A0I     // Catch:{ all -> 0x0202 }
            java.lang.String r4 = "igEventBus"
            if (r3 == 0) goto L_0x01e8
            java.lang.Class<X.6st> r1 = X.C320756st.class
            X.1wn r0 = r15.A0V     // Catch:{ all -> 0x0202 }
            r3.A01(r0, r1)     // Catch:{ all -> 0x0202 }
            X.1Ng r3 = r15.A0I     // Catch:{ all -> 0x0202 }
            if (r3 == 0) goto L_0x01e8
            java.lang.Class<X.6su> r1 = X.C320766su.class
            X.1wn r0 = r15.A0W     // Catch:{ all -> 0x0202 }
            r3.A01(r0, r1)     // Catch:{ all -> 0x0202 }
            X.1Ng r3 = r15.A0I     // Catch:{ all -> 0x0202 }
            if (r3 == 0) goto L_0x01e8
            java.lang.Class<X.6sv> r1 = X.C320776sv.class
            X.1wn r0 = r15.A0U     // Catch:{ all -> 0x0202 }
            r3.A01(r0, r1)     // Catch:{ all -> 0x0202 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x01e1
            r0 = 1900335431(0x7144d147, float:9.74593E29)
            X.0fS.A00(r0)
        L_0x01e1:
            r0 = 1900802903(0x714bf357, float:1.0099142E30)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x01e8:
            X.0qQ.A0F(r4)     // Catch:{ all -> 0x0202 }
            goto L_0x01ef
        L_0x01ec:
            X.0qQ.A0F(r11)     // Catch:{ all -> 0x0202 }
        L_0x01ef:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0201
        L_0x01f4:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0202 }
            r1.<init>(r0)     // Catch:{ all -> 0x0202 }
            r0 = -612599276(0xffffffffdb7c7a14, float:-7.106592E16)
            X.AnonymousClass0fD.A09(r0, r2)     // Catch:{ all -> 0x0202 }
        L_0x0201:
            throw r1     // Catch:{ all -> 0x0202 }
        L_0x0202:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x020f
            r0 = 314713879(0x12c22717, float:1.2252758E-27)
            X.0fS.A00(r0)
        L_0x020f:
            r0 = -654512058(0xffffffffd8fcf046, float:-2.22487117E15)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320296s9.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int i;
        int A022 = AnonymousClass0fD.A02(-1907740637);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("ClipsProfileTabFragment.onCreateView", -466480879);
        }
        try {
            C267654by requireParentFragment = requireParentFragment();
            0qQ.A0C(requireParentFragment, "null cannot be cast to non-null type com.instagram.profile.fragment.ProfileTabDataProviders.ProvidesMediaTabDataProvider");
            this.A0M = requireParentFragment.AvN();
            ViewGroup viewGroup2 = viewGroup;
            if (182.A06(0Tu.A05, (UserSession) this.A0T.getValue(), 36323474730724531L)) {
                view = 2Su.A01(layoutInflater2, (ViewGroup.LayoutParams) null, viewGroup2, R.layout.layout_profile_tab_fragment, false, true);
                if (Systrace.A0E(1)) {
                    0fS.A00(2030263494);
                }
                i = 141158940;
            } else {
                view = layoutInflater.inflate(R.layout.layout_profile_tab_fragment, viewGroup, false);
                if (Systrace.A0E(1)) {
                    0fS.A00(-162437903);
                }
                i = -964359552;
            }
            AnonymousClass0fD.A09(i, A022);
            return view;
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-535780366);
            }
            AnonymousClass0fD.A09(-1172408133, A022);
            throw th;
        }
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1833987941);
        if (Systrace.A0E(1)) {
            0fS.A01("ClipsProfileTabFragment.onDestroy", -89352492);
        }
        try {
            super.onDestroy();
            1Ng r2 = this.A0I;
            if (r2 != null) {
                r2.A02(this.A0W, C320766su.class);
                1Ng r22 = this.A0I;
                if (r22 != null) {
                    r22.A02(this.A0V, C320756st.class);
                    1Ng r23 = this.A0I;
                    if (r23 != null) {
                        r23.A02(this.A0U, C320776sv.class);
                        return;
                    }
                }
            }
            0qQ.A0F("igEventBus");
            throw AnonymousClass00P.createAndThrow();
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1979131662);
            }
            AnonymousClass0fD.A09(442145982, A022);
        }
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-453201612);
        if (Systrace.A0E(1)) {
            0fS.A01("ClipsProfileTabFragment.onDestroyView", -144517091);
        }
        try {
            super.onDestroyView();
            unregisterLifecycleListener(this.A0L);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.A0b();
            }
            C320516sV r0 = this.A06;
            if (r0 == null) {
                0qQ.A0F("clipsGridAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            r0.A02();
            this.A01 = null;
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter((2Rw) null);
            }
            this.A00 = null;
            this.A04 = null;
            this.A0L = null;
            this.A0E = false;
            this.A0P = false;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-796369341);
            }
            AnonymousClass0fD.A09(1921179349, A022);
        }
    }

    public final void onResume() {
        C252553pI r1;
        C323756y3 r0;
        int A022 = AnonymousClass0fD.A02(411210325);
        if (Systrace.A0E(1)) {
            0fS.A01("ClipsProfileTabFragment.onResume", 1354766968);
        }
        try {
            super.onResume();
            if (this.A0D) {
                IgdsEmptyState igdsEmptyState = this.A04;
                if (igdsEmptyState != null) {
                    C320516sV r02 = this.A06;
                    if (r02 != null) {
                        int size = C320516sV.A00(r02).size();
                        int i = 8;
                        if (size == 0) {
                            i = 0;
                        }
                        igdsEmptyState.setVisibility(i);
                    }
                    0qQ.A0F("clipsGridAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            AnonymousClass0eM r3 = this.A0T;
            C229352nF A002 = C229342nE.A00((UserSession) r3.getValue());
            String str = this.A0A;
            if (str == null) {
                0qQ.A0F("gridKey");
                throw AnonymousClass00P.createAndThrow();
            }
            C294885nC r12 = (C294885nC) A002.A01.get(str);
            if (r12 != null) {
                int i2 = r12.A00;
                r12.A00 = -1;
                if (i2 > 2) {
                    C320516sV r03 = this.A06;
                    if (r03 != null) {
                        if (C320516sV.A00(r03).size() >= i2) {
                            if (182.A06(0Tu.A05, (UserSession) r3.getValue(), 36326854864418856L)) {
                                UserDetailFragment userDetailFragment = this.mParentFragment;
                                0qQ.A0C(userDetailFragment, "null cannot be cast to non-null type com.instagram.profile.intf.tabs.PinContentToTopFragment");
                                UserDetailFragment userDetailFragment2 = userDetailFragment;
                                if (!(userDetailFragment2.mView == null || (r0 = userDetailFragment2.A0z.mViewHolder) == null)) {
                                    r0.A0B.setExpanded(false);
                                }
                                RecyclerView recyclerView = this.A00;
                                if (!(recyclerView == null || (r1 = recyclerView.A0D) == null)) {
                                    r1.A1O(i2 - 3);
                                }
                            }
                        }
                    }
                    0qQ.A0F("clipsGridAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1384482298);
            }
            AnonymousClass0fD.A09(-784523884, A022);
        }
    }
}
