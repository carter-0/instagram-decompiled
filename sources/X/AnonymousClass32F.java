package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.32F  reason: invalid class name */
public final class AnonymousClass32F extends AnonymousClass32G implements AnonymousClass0iw, C229122ms, C232682uF, AnonymousClass4DR, C229132mt, AnonymousClass0j6, AbsListView.OnScrollListener, AnonymousClass32I, AnonymousClass4DS, AnonymousClass4DT, C252223ol, AnonymousClass32J, AnonymousClass32K {
    public static final String __redex_internal_original_name = "SingleMediaFeedFragment";
    public int A00;
    public 0jB A01;
    public C324356z9 A02;
    public C293005js A03;
    public 1iA A04;
    public C231002qi A05;
    public C230882qT A06;
    public AnonymousClass3AD A07;
    public C270394gf A08;
    public C54229H3y A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public Handler A0I = new Handler(Looper.getMainLooper());
    public View A0J;
    public C227762js A0K;
    public AnonymousClass3KG A0L;
    public AnonymousClass3KQ A0M;
    public AnonymousClass57N A0N;
    public AnonymousClass36D A0O;
    public AnonymousClass2uE A0P;
    public 1sy A0Q = 1sy.A0U;
    public EmptyStateView A0R;
    public String A0S;
    public String A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final C228172ku A0c = new C228172ku();
    public final Set A0d = new HashSet();
    public final AnonymousClass0eM A0e;
    public final AnonymousClass0eM A0f;
    public final AnonymousClass0eM A0g;
    public final 1wn A0h = new FXS(this);
    public final C14005To7 A0i = new C14005To7();
    public final ArrayList A0j = new ArrayList();
    public final AnonymousClass0eM A0k = C227642jf.A02(this);

    private final void A03(1Xj r14) {
        String str;
        if (!this.A0U) {
            AnonymousClass0eM r2 = this.A0g;
            String str2 = (String) r2.getValue();
            if (str2 != null && str2.length() != 0 && (str = this.A0A) != null && str.length() != 0) {
                1Xj r9 = r14;
                if (r14 != null) {
                    this.A0U = true;
                    I0Q i0q = I0Q.A00;
                    Context requireContext = requireContext();
                    UserSession A012 = A01(this);
                    AnonymousClass33B r8 = (AnonymousClass33B) this.A0e.getValue();
                    String str3 = (String) r2.getValue();
                    if (str3 != null) {
                        UserSession A013 = A01(this);
                        String str4 = this.A0A;
                        if (str4 != null) {
                            C54229H3y h3y = this.A09;
                            if (h3y == null) {
                                0qQ.A0F("adapter");
                                throw AnonymousClass00P.createAndThrow();
                            } else {
                                i0q.A00(requireContext, A012, new AnonymousClass4GR(A013, h3y.BQr(r14), str4), r8, r9, this, str3, false);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0129, code lost:
        r0 = r4.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012b, code lost:
        if (r0 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        r4.A00 = r3.A16(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0136, code lost:
        if (r4.A00 == -1) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0138, code lost:
        r0 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013a, code lost:
        if (r0 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013c, code lost:
        r0.BQr(r3).A0A(r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0145, code lost:
        r0 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0147, code lost:
        if (r0 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0149, code lost:
        r0.BQr(r3).A0O(r4.A0Q);
        r0 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0154, code lost:
        if (r0 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0156, code lost:
        r0.BQr(r3).A2u = r4.A0Z;
        r0 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0160, code lost:
        if (r0 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0162, code lost:
        r0.BQr(r3).A2t = r4.A0Y;
        r0 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016c, code lost:
        if (r0 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016e, code lost:
        r2 = r0.BQr(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0176, code lost:
        if (r4.A08 != X.C270394gf.A04) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0178, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0179, code lost:
        r2.A28 = r5;
        r2 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017d, code lost:
        if (r2 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017f, code lost:
        r1 = java.util.Collections.singletonList(r3);
        X.0qQ.A07(r1);
        r2.A04.A0A(r1);
        X.C54229H3y.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0192, code lost:
        if (r3.A5H() == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0194, code lost:
        r0 = r3.A1b().BR7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019c, code lost:
        r4.A04 = r0;
        r0 = r3.A5B();
        r4.A0X = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a4, code lost:
        if (r0 == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a6, code lost:
        X.VA1.A00(A01(r4)).A03("promotion_media", r4.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b9, code lost:
        if (isResumed() == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bb, code lost:
        X.2dZ.A0t.A03(requireActivity()).A0T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c8, code lost:
        A03(r3);
        A05(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cf, code lost:
        r0 = r3.BR7();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0c(X.1XO r38) {
        /*
            r37 = this;
            r1 = 0
            r3 = r38
            java.util.List r0 = r3.A06
            int r0 = r0.size()
            r5 = 1
            if (r0 == r5) goto L_0x002c
            X.0wj r2 = X.0wj.A01
            r1 = 817899586(0x30c02842, float:1.3981281E-9)
            java.lang.String r0 = "single_media_feed_request"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "Invalid number of items in response for SingleMediaFeedFragment, size::"
            java.util.List r0 = r3.A06
            int r0 = r0.size()
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.String r0 = "message"
            r2.ABQ(r0, r1)
            r2.report()
            return
        L_0x002c:
            java.util.List r0 = r3.A06
            java.lang.Object r3 = r0.get(r1)
            X.1Xj r3 = (X.1Xj) r3
            r4 = r37
            android.os.Bundle r1 = r4.mArguments
            r10 = 0
            if (r1 == 0) goto L_0x01e1
            r0 = 2858(0xb2a, float:4.005E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r7 = r1.getString(r0)
        L_0x0045:
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x01de
            r0 = 2860(0xb2c, float:4.008E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = r1.getString(r0)
        L_0x0053:
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x01db
            r0 = 2861(0xb2d, float:4.009E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r6 = r1.getString(r0)
        L_0x0061:
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x01d8
            r0 = 2859(0xb2b, float:4.006E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r1.getString(r0)
        L_0x006f:
            java.util.List r0 = r3.A3P()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e8
            if (r7 == 0) goto L_0x00e8
            if (r8 == 0) goto L_0x00e8
            if (r6 == 0) goto L_0x00e8
            if (r2 == 0) goto L_0x00e8
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_LEAD_AD
            int r0 = r0.A00
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            com.instagram.model.androidlink.AndroidLinkImpl r9 = new com.instagram.model.androidlink.AndroidLinkImpl
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r24 = r10
            r25 = r10
            r26 = r10
            r27 = r10
            r28 = r6
            r29 = r10
            r30 = r10
            r31 = r10
            r32 = r10
            r33 = r10
            r34 = r10
            r35 = r10
            r36 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            java.util.List r1 = java.util.Collections.singletonList(r9)
            X.0qQ.A07(r1)
            X.1Xy r0 = r3.A0C
            r0.EOd(r1)
            X.1Xy r0 = r3.A0C
            r0.EcC(r8)
            boolean r0 = r3.CcK()
            if (r0 != 0) goto L_0x00e8
            X.3lY r1 = X.C41916B6o.A00()
            X.41a r0 = new X.41a
            r0.<init>(r1)
            r0.A0h = r7
            r0.A0s = r6
            r0.A0y = r2
            X.3lY r0 = r0.A00()
            r3.A45(r0)
        L_0x00e8:
            X.36D r0 = r4.A0O
            if (r0 != 0) goto L_0x00f6
            java.lang.String r7 = "mediaUpdateListener"
        L_0x00ee:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f6:
            r0.A00()
            X.H3y r0 = r4.A09
            java.lang.String r7 = "adapter"
            if (r0 == 0) goto L_0x00ee
            int r6 = r0.getCount()
            r2 = 0
        L_0x0104:
            if (r2 >= r6) goto L_0x0129
            X.H3y r0 = r4.A09
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r1 = r0.getItem(r2)
            boolean r0 = r1 instanceof X.1Xj
            if (r0 == 0) goto L_0x01d4
            boolean r0 = X.0qQ.A0K(r1, r3)
            if (r0 != 0) goto L_0x01d4
            X.H3y r1 = r4.A09
            if (r1 == 0) goto L_0x00ee
            X.4n0 r0 = r1.A04
            r0.A04()
            java.util.Map r0 = r1.A07
            r0.clear()
            X.C54229H3y.A00(r1)
        L_0x0129:
            java.lang.String r0 = r4.A0B
            if (r0 == 0) goto L_0x0133
            int r0 = r3.A16(r0)
            r4.A00 = r0
        L_0x0133:
            int r1 = r4.A00
            r0 = -1
            if (r1 == r0) goto L_0x0145
            X.H3y r0 = r4.A09
            if (r0 == 0) goto L_0x00ee
            X.3W1 r1 = r0.BQr(r3)
            int r0 = r4.A00
            r1.A0A(r0)
        L_0x0145:
            X.H3y r0 = r4.A09
            if (r0 == 0) goto L_0x00ee
            X.3W1 r1 = r0.BQr(r3)
            X.1sy r0 = r4.A0Q
            r1.A0O(r0)
            X.H3y r0 = r4.A09
            if (r0 == 0) goto L_0x00ee
            X.3W1 r1 = r0.BQr(r3)
            boolean r0 = r4.A0Z
            r1.A2u = r0
            X.H3y r0 = r4.A09
            if (r0 == 0) goto L_0x00ee
            X.3W1 r1 = r0.BQr(r3)
            boolean r0 = r4.A0Y
            r1.A2t = r0
            X.H3y r0 = r4.A09
            if (r0 == 0) goto L_0x00ee
            X.3W1 r2 = r0.BQr(r3)
            X.4gf r1 = r4.A08
            X.4gf r0 = X.C270394gf.FEED_MEDIA
            if (r1 != r0) goto L_0x0179
            r5 = 0
        L_0x0179:
            r2.A28 = r5
            X.H3y r2 = r4.A09
            if (r2 == 0) goto L_0x00ee
            java.util.List r1 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r1)
            X.4n0 r0 = r2.A04
            r0.A0A(r1)
            X.C54229H3y.A00(r2)
            boolean r0 = r3.A5H()
            if (r0 == 0) goto L_0x01cf
            X.1Xj r0 = r3.A1b()
            X.1iA r0 = r0.BR7()
        L_0x019c:
            r4.A04 = r0
            boolean r0 = r3.A5B()
            r4.A0X = r0
            if (r0 == 0) goto L_0x01b5
            com.instagram.common.session.UserSession r0 = A01(r4)
            X.VwK r2 = X.VA1.A00(r0)
            java.lang.String r1 = r4.A0A
            java.lang.String r0 = "promotion_media"
            r2.A03(r0, r1)
        L_0x01b5:
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x01c8
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = r0.A03(r1)
            r0.A0T()
        L_0x01c8:
            r4.A03(r3)
            A05(r4)
            return
        L_0x01cf:
            X.1iA r0 = r3.BR7()
            goto L_0x019c
        L_0x01d4:
            int r2 = r2 + 1
            goto L_0x0104
        L_0x01d8:
            r2 = r10
            goto L_0x006f
        L_0x01db:
            r6 = r10
            goto L_0x0061
        L_0x01de:
            r8 = r10
            goto L_0x0053
        L_0x01e1:
            r7 = r10
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32F.A0c(X.1XO):void");
    }

    public final C358248ab ALt(C358248ab r2) {
        0qQ.A0B(r2, 0);
        r2.A0l(this, A01(this));
        return r2;
    }

    public final boolean CKB() {
        return false;
    }

    public final boolean CbJ() {
        return true;
    }

    public final void D33(SparseArray sparseArray, Integer num) {
    }

    public final void D34() {
    }

    public final void D35() {
    }

    public final void D37(SparseArray sparseArray) {
    }

    public final void DIH(View view, 1Xj r5, int i) {
        int i2;
        0qQ.A0B(r5, 0);
        C309516Yo r2 = new C309516Yo(requireActivity(), A01(this));
        IgFragmentFactoryImpl.A00();
        String id = r5.getId();
        if (id != null) {
            F3W f3w = new F3W();
            f3w.A0B = id;
            f3w.A0O = true;
            f3w.A01 = this.A01;
            r2.A0D(f3w.A01());
            if (r5.CeS()) {
                i2 = 823;
            } else {
                i2 = 737;
            }
            r2.A0B = AnonymousClass000.A00(i2);
            r2.A04();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean DII(MotionEvent motionEvent, View view, AnonymousClass1Xq r4, int i) {
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        0qQ.A0B(r4, 2);
        AnonymousClass2uE r0 = this.A0P;
        if (r0 != null) {
            return r0.Dsa(motionEvent, view, r4, i);
        }
        0qQ.A0F("peekMediaController");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (requireArguments().getBoolean(X.AnonymousClass000.A00(2871)) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            r2 = 0
            X.0qQ.A0B(r4, r2)
            X.0hq r0 = r3.mFragmentManager
            if (r0 == 0) goto L_0x000e
            int r0 = r0.A0M()
            if (r0 > 0) goto L_0x001f
        L_0x000e:
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 2871(0xb37, float:4.023E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r1 = r1.getBoolean(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r4.Eu4(r0)
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 2877(0xb3d, float:4.032E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0037
            r4.setTitle(r0)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r3.A0X
            if (r0 == 0) goto L_0x0042
            r1 = 2131970833(0x7f134b11, float:1.9578628E38)
        L_0x003e:
            r4.Eom(r1)
            return
        L_0x0042:
            X.1iA r0 = r3.A04
            if (r0 == 0) goto L_0x0036
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0061
            r0 = 1
            if (r1 == r0) goto L_0x0056
            r0 = 4
            if (r1 != r0) goto L_0x0036
            r1 = 2131969659(0x7f13467b, float:1.9576247E38)
            goto L_0x003e
        L_0x0056:
            boolean r0 = r3.A0W
            r1 = 2131976403(0x7f1360d3, float:1.9589926E38)
            if (r0 == 0) goto L_0x003e
            r1 = 2131955156(0x7f130dd4, float:1.9546832E38)
            goto L_0x003e
        L_0x0061:
            r1 = 2131969399(0x7f134577, float:1.957572E38)
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32F.configureActionBar(X.2da):void");
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.0S7, android.widget.AbsListView$OnScrollListener, X.07g, androidx.fragment.app.Fragment, X.32F, X.32G] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C227762js r3 = this.A0K;
        if (r3 == null) {
            str = "_helper";
        } else {
            C238133Ar scrollingViewProxy = getScrollingViewProxy();
            C54229H3y h3y = this.A09;
            if (h3y == null) {
                str = "adapter";
            } else {
                r3.A06(h3y, scrollingViewProxy, AnonymousClass3D4.A00(requireContext()));
                0S7.A00(this);
                this.A04.setOnScrollListener(this);
                0S7.A00(this);
                View emptyView = this.A04.getEmptyView();
                0qQ.A0C(emptyView, C66579MXk.A00(24));
                EmptyStateView emptyStateView = (EmptyStateView) emptyView;
                this.A0R = emptyStateView;
                if (emptyStateView != null) {
                    emptyStateView.A0N(new C50055FLv(this), C320156rr.ERROR);
                    A05(this);
                    C238833Dp.A00(A01(this)).A05(view, C238863Ds.MEDIA_GENERIC);
                    AnonymousClass1Nd.A00(A01(this)).A01(this.A0h, AnonymousClass3DT.class);
                    AnonymousClass57N r32 = this.A0N;
                    if (r32 != null) {
                        Application application = requireActivity().getApplication();
                        0qQ.A07(application);
                        C56585I2p.A00(this, new 2YN(new C53050Ghi(application, A01(this), r32), this).A00(C60100Jfg.class));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final UserSession A01(AnonymousClass32F r0) {
        return (UserSession) r0.A0k.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a4, code lost:
        if (r2.CcK() != true) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bc, code lost:
        if (r2.A4l() != true) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r2.A5v() != true) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(android.app.Activity r55, X.AnonymousClass5OB r56, X.1Xj r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, boolean r61, boolean r62) {
        /*
            r54 = this;
            r1 = r54
            r28 = r61
            java.lang.String r16 = r1.getModuleName()
            r2 = r57
            if (r57 == 0) goto L_0x0014
            com.instagram.common.session.UserSession r0 = A01(r1)
            boolean r28 = X.2R8.A02(r0, r2)
        L_0x0014:
            r3 = 1
            r30 = 0
            r8 = 0
            int r0 = r1.A00
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r30)
            if (r57 == 0) goto L_0x002c
            boolean r0 = r2.A5v()
            r36 = 1
            if (r0 == r3) goto L_0x00b2
        L_0x002c:
            r36 = 0
            if (r57 != 0) goto L_0x00b2
            r27 = 0
        L_0x0032:
            r45 = 0
        L_0x0034:
            X.GmL r6 = new X.GmL
            r7 = r56
            r14 = r58
            r17 = r59
            r20 = r60
            r47 = r62
            r11 = r8
            r12 = r8
            r13 = r8
            r15 = r8
            r18 = r8
            r19 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r29 = r3
            r31 = r30
            r32 = r30
            r33 = r30
            r34 = r30
            r35 = r30
            r37 = r30
            r38 = r30
            r39 = r30
            r40 = r30
            r41 = r30
            r42 = r30
            r43 = r30
            r44 = r30
            r46 = r30
            r48 = r30
            r49 = r30
            r50 = r30
            r51 = r30
            r52 = r30
            r53 = r30
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            X.1Y4 r0 = X.C3018960m.A00()
            X.Hs6 r9 = r0.A00()
            com.instagram.common.session.UserSession r13 = A01(r1)
            com.instagram.common.session.UserSession r5 = A01(r1)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36318771736287670(0x8107bb000519b6, double:3.0314757177591925E-306)
            boolean r16 = X.182.A06(r4, r5, r0)
            if (r57 == 0) goto L_0x00a6
            boolean r0 = r2.CcK()
            r18 = 1
            if (r0 == r3) goto L_0x00a8
        L_0x00a6:
            r18 = 0
        L_0x00a8:
            r10 = r55
            r12 = r6
            r14 = r8
            r17 = r30
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x00b2:
            int r27 = r2.A0r()
            boolean r0 = r2.A4l()
            r45 = 1
            if (r0 == r3) goto L_0x0034
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32F.A02(android.app.Activity, X.5OB, X.1Xj, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public static final void A04(AnonymousClass32F r5) {
        1OC A042;
        1NY A002;
        String str;
        String str2 = r5.A0A;
        if (str2 != null) {
            C324356z9 r2 = r5.A02;
            if (r2 == null) {
                0qQ.A0F("feedNetworkSource");
                throw AnonymousClass00P.createAndThrow();
            }
            String str3 = r5.A0C;
            if (str3 != null) {
                A002 = C3724090s.A00(A01(r5), AnonymousClass05K.A00, str2);
                A002.A9m("preview_comment_id", str3);
            } else {
                if (r5.A0F) {
                    A002 = C3724090s.A00(A01(r5), AnonymousClass05K.A00, str2);
                    str = "preview_gating_reason";
                } else if (r5.A0E) {
                    A002 = C3724090s.A00(A01(r5), AnonymousClass05K.A00, str2);
                    str = "should_send_only_user_owned_media";
                } else {
                    if (r5.A0H) {
                        A042 = C3724090s.A03(A01(r5), str2);
                    } else {
                        A042 = C3724090s.A04(A01(r5), str2);
                    }
                    r2.A03(A042, new ELF(r5));
                }
                A002.A9m(str, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            A042 = A002.A0M();
            r2.A03(A042, new ELF(r5));
        }
    }

    public static final void A05(AnonymousClass32F r2) {
        EmptyStateView emptyStateView = r2.A0R;
        if (emptyStateView == null) {
            return;
        }
        if (r2.isLoading()) {
            emptyStateView.A0L();
        } else if (r2.CT5()) {
            emptyStateView.A0J();
        }
    }

    public final void ACw() {
        C324356z9 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("feedNetworkSource");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A06()) {
            A04(this);
        }
    }

    public final C227762js BD0() {
        C227762js r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_helper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer BQo() {
        return AnonymousClass05K.A00;
    }

    public final boolean CJz() {
        C54229H3y h3y = this.A09;
        if (h3y != null) {
            return !h3y.A04.A01.isEmpty();
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        C324356z9 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("feedNetworkSource");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A03.A03 == AnonymousClass05K.A01) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean CWV() {
        C54229H3y h3y = this.A09;
        if (h3y != null) {
            return !(!h3y.A04.A01.isEmpty());
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4k() {
        0jB r1 = new 0jB();
        r1.A06(this.A0i.A00);
        return r1;
    }

    public final 0jB E4x() {
        return this.A01;
    }

    public final String getMediaId() {
        return this.A0A;
    }

    public final boolean isLoading() {
        C324356z9 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("feedNetworkSource");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A03.A03 == AnonymousClass05K.A00) {
            return true;
        } else {
            return false;
        }
    }

    public AnonymousClass32F() {
        0eO r2 = 0eO.A02;
        this.A0e = AnonymousClass0eN.A00(r2, new AnonymousClass9LY(this, 24));
        this.A0g = AnonymousClass0eN.A00(r2, new AnonymousClass9LY(this, 26));
        this.A0f = AnonymousClass0eN.A01(new AnonymousClass9LY(this, 25));
    }

    public final String BjP() {
        1Xj A022 = 1E7.A00(A01(this)).A02(this.A0A);
        if (A022 != null) {
            return A022.A0C.BjE();
        }
        return null;
    }

    public final void D36() {
        C309516Yo r1 = new C309516Yo(requireActivity(), A01(this));
        1YF r2 = C46339Dch.A00().A00;
        UserSession A012 = A01(this);
        String str = this.A0D;
        if (str != null) {
            r1.A0B((Bundle) null, r2.CrG(A012, str, (String) null, this.A0j, (HashMap) null, false));
            r1.A04();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final 0jB E4l(1Xj r2) {
        return E4k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        if (X.00l.A0d(r4, r7, false) != false) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getModuleName() {
        /*
            r8 = this;
            android.os.Bundle r1 = r8.requireArguments()
            r0 = 1191(0x4a7, float:1.669E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r7 = r1.getString(r0)
            r0 = 399(0x18f, float:5.59E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r0.equals(r7)
            java.lang.String r2 = "media_view"
            java.lang.String r6 = "photo_view"
            java.lang.String r5 = "video_view"
            if (r0 == 0) goto L_0x004f
            X.1iA r4 = r8.A04
            X.1iA r0 = X.1iA.A0Q
            r3 = 95
            if (r4 != r0) goto L_0x003b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
        L_0x0030:
            r1.append(r3)
        L_0x0033:
            r1.append(r7)
        L_0x0036:
            java.lang.String r7 = r1.toString()
        L_0x003a:
            return r7
        L_0x003b:
            X.1iA r0 = X.1iA.A0a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r4 != r0) goto L_0x0048
            r1.<init>()
            r1.append(r5)
            goto L_0x0030
        L_0x0048:
            r1.<init>()
            r1.append(r2)
            goto L_0x0030
        L_0x004f:
            if (r7 != 0) goto L_0x003a
            X.1iA r1 = r8.A04
            X.1iA r0 = X.1iA.A0Q
            if (r1 != r0) goto L_0x00fd
            r2 = r6
        L_0x0058:
            com.instagram.common.session.UserSession r0 = A01(r8)
            X.2cc r0 = X.C71342cb.A00(r0)
            java.lang.String r4 = r0.A0D
            java.lang.String r3 = "_other"
            if (r4 == 0) goto L_0x00f4
            java.lang.String r0 = "profile"
            r1 = 0
            boolean r0 = X.00l.A0d(r4, r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r0 = 2553(0x9f9, float:3.578E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
        L_0x007d:
            r1.append(r3)
            goto L_0x0036
        L_0x0081:
            java.lang.String r0 = "newsfeed"
            boolean r0 = X.00l.A0d(r4, r0, r1)
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "notifications"
            boolean r0 = X.00p.A0i(r4, r0, r1)
            if (r0 != 0) goto L_0x00e9
            r0 = 4480(0x1180, float:6.278E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.00l.A0d(r4, r0, r1)
            if (r0 == 0) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r3 = "_archive_feed"
            goto L_0x007d
        L_0x00a8:
            r0 = 1682(0x692, float:2.357E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.00l.A0d(r4, r0, r1)
            if (r0 == 0) goto L_0x00bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r3 = "_photos_of_you"
            goto L_0x007d
        L_0x00bf:
            java.lang.String r7 = "_collection_pivots"
            boolean r0 = X.00l.A0d(r4, r7, r1)
            if (r0 != 0) goto L_0x00df
            r0 = 4775(0x12a7, float:6.691E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.00l.A0d(r4, r7, r1)
            if (r0 != 0) goto L_0x00df
            r0 = 2367(0x93f, float:3.317E-42)
            java.lang.String r7 = X.C273654mx.A00(r0)
            boolean r0 = X.00l.A0d(r4, r7, r1)
            if (r0 == 0) goto L_0x00f4
        L_0x00df:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            goto L_0x0033
        L_0x00e9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r3 = "_notifications"
            goto L_0x007d
        L_0x00f4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            goto L_0x007d
        L_0x00fd:
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x0058
            r2 = r5
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32F.getModuleName():java.lang.String");
    }

    public final boolean onBackPressed() {
        1Xj A022 = 1E7.A00(A01(this)).A02(this.A0A);
        if (!this.A0Z || A022 == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra(AnonymousClass000.A00(3124), this.A0A);
        C54229H3y h3y = this.A09;
        if (h3y == null) {
            0qQ.A0F("adapter");
            throw AnonymousClass00P.createAndThrow();
        }
        intent.putExtra(AnonymousClass000.A00(3123), h3y.BQr(A022).A2t);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return false;
        }
        activity.setResult(-1, intent);
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.07Z, X.4DU, X.0S7, X.0iw, androidx.fragment.app.Fragment, X.32F, X.2mt, X.32G] */
    /* JADX WARNING: type inference failed for: r32v0, types: [X.4DU, X.32G] */
    /* JADX WARNING: type inference failed for: r5v5, types: [X.32y, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0461, code lost:
        if (r2.A2A(A01(r0)) != null) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x04c1, code lost:
        if (r2 != null) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x04cb, code lost:
        if (r2.A2A(A01(r0)) == null) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x04d7, code lost:
        if (r1.getBoolean(X.AnonymousClass000.A00(2856)) != false) goto L_0x0463;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x04dd, code lost:
        if (r2.A5a() != false) goto L_0x0463;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x04e3, code lost:
        if (r2.A4c() != false) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x04e9, code lost:
        if (r2.A4K() != false) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x04eb, code lost:
        r6 = new X.EBB(r0);
        r4 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x04f2, code lost:
        if (r4 == null) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x04f4, code lost:
        r2 = X.C3724090s.A02(A01(r0), r4);
        r2.A00 = r6;
        schedule(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x05d1, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01a1, code lost:
        if (X.AnonymousClass2f1.A00(r12).A0N(r11) != com.instagram.user.model.FollowStatus.A06) goto L_0x01a3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r39) {
        /*
            r38 = this;
            r0 = -18404959(0xfffffffffee729a1, float:-1.5363391E38)
            int r7 = X.AnonymousClass0fD.A02(r0)
            r0 = r38
            r1 = r39
            X.AnonymousClass32F.super.onCreate(r1)
            android.os.Bundle r1 = r0.requireArguments()
            com.instagram.common.session.UserSession r3 = A01(r0)
            android.content.Context r2 = r0.requireContext()
            X.3KG r2 = X.AnonymousClass3KF.A00(r2, r3)
            r0.A0L = r2
            X.1L2 r3 = X.AnonymousClass1L1.A01
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_SESSION_ID"
            java.lang.String r2 = r1.getString(r2)
            X.1L1 r6 = r3.A01(r2)
            r2 = 2875(0xb3b, float:4.029E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.io.Serializable r2 = r1.getSerializable(r2)
            X.0jB r2 = (X.0jB) r2
            r0.A01 = r2
            r2 = 2876(0xb3c, float:4.03E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r1.getBoolean(r2)
            r2 = 2848(0xb20, float:3.991E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r11 = r1.getBoolean(r2)
            r2 = 2872(0xb38, float:4.025E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r1.getBoolean(r2)
            r0.A0V = r2
            r2 = 2865(0xb31, float:4.015E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r20 = r1.getBoolean(r2)
            r2 = 2866(0xb32, float:4.016E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r19 = r1.getBoolean(r2)
            r2 = 2847(0xb1f, float:3.99E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.io.Serializable r2 = r1.getSerializable(r2)
            X.4gf r2 = (X.C270394gf) r2
            r0.A08 = r2
            r2 = 2849(0xb21, float:3.992E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r1.getBoolean(r2)
            r0.A0E = r2
            r2 = 2851(0xb23, float:3.995E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r1.getBoolean(r2)
            r0.A0Z = r2
            r2 = 2850(0xb22, float:3.994E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r1.getBoolean(r2)
            r0.A0Y = r2
            r2 = 2854(0xb26, float:4.0E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            android.os.Bundle r3 = r1.getBundle(r2)
            if (r3 == 0) goto L_0x00b0
            X.To7 r2 = r0.A0i
            r2.A00(r3)
        L_0x00b0:
            r2 = 2874(0xb3a, float:4.027E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.io.Serializable r2 = r1.getSerializable(r2)
            X.1sw r2 = (X.1sw) r2
            if (r2 != 0) goto L_0x00c0
            X.1sw r2 = X.1sw.A05
        L_0x00c0:
            com.instagram.common.session.UserSession r16 = A01(r0)
            X.HB3 r15 = new X.HB3
            r17 = r2
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            com.instagram.common.session.UserSession r3 = A01(r0)
            X.5js r2 = new X.5js
            r2.<init>(r0, r3)
            r0.A03 = r2
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.ELR r8 = new X.ELR
            r8.<init>(r3, r2, r0)
            r2 = 2867(0xb33, float:4.018E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r3 = 0
            boolean r9 = r1.getBoolean(r2, r3)
            com.instagram.common.session.UserSession r2 = A01(r0)
            boolean r2 = X.AnonymousClass2o2.A06(r2)
            if (r2 == 0) goto L_0x010d
            com.instagram.common.session.UserSession r10 = A01(r0)
            X.Lip r5 = X.C54975Ha8.A00(r10)
            X.6jB r4 = X.C314986jA.A00(r10)
            com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl r2 = new com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl
            r2.<init>(r0, r10, r5, r4)
            r0.A0N = r2
        L_0x010d:
            r2 = 139(0x8b, float:1.95E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = r1.getString(r2)
            r0.A0A = r2
            r2 = 2855(0xb27, float:4.001E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            int r2 = r1.getInt(r2)
            r0.A00 = r2
            r2 = 2853(0xb25, float:3.998E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = r1.getString(r2)
            r0.A0B = r2
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.1E8 r4 = X.1E7.A00(r2)
            java.lang.String r2 = r0.A0A
            X.1Xj r2 = r4.A02(r2)
            r4 = 2862(0xb2e, float:4.01E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            java.lang.String r4 = r1.getString(r4)
            if (r4 == 0) goto L_0x05b0
            X.1sy r4 = X.1sy.valueOf(r4)
        L_0x014f:
            r0.A0Q = r4
        L_0x0151:
            java.lang.String r4 = r0.A0B
            if (r4 == 0) goto L_0x015d
            if (r2 == 0) goto L_0x05ac
            int r4 = r2.A16(r4)
        L_0x015b:
            r0.A00 = r4
        L_0x015d:
            r4 = 0
            if (r2 == 0) goto L_0x05a8
            com.instagram.common.session.UserSession r5 = A01(r0)
            com.instagram.user.model.User r5 = r2.A2A(r5)
            if (r5 == 0) goto L_0x05a8
            if (r11 == 0) goto L_0x01a3
            com.instagram.common.session.UserSession r12 = A01(r0)
            X.0qQ.A0B(r12, r3)
            com.instagram.user.model.User r11 = r2.A2A(r12)
            if (r11 == 0) goto L_0x05e0
            X.0t1 r5 = X.0eE.A00(r12)
            com.instagram.user.model.User r10 = r5.A00()
            boolean r5 = r11.A2Q()
            if (r5 != 0) goto L_0x01a3
            java.lang.String r10 = r10.getId()
            java.lang.String r5 = r11.getId()
            boolean r5 = X.0qQ.A0K(r10, r5)
            if (r5 != 0) goto L_0x01a3
            X.2f1 r5 = X.AnonymousClass2f1.A00(r12)
            com.instagram.user.model.FollowStatus r10 = r5.A0N(r11)
            com.instagram.user.model.FollowStatus r5 = com.instagram.user.model.FollowStatus.A06
            r27 = 1
            if (r10 == r5) goto L_0x01a5
        L_0x01a3:
            r27 = 0
        L_0x01a5:
            boolean r5 = r2.A5H()
            if (r5 == 0) goto L_0x05a2
            X.1Xj r5 = r2.A1b()
            X.1iA r5 = r5.BR7()
        L_0x01b3:
            r0.A04 = r5
            boolean r5 = r2.A5B()
            r0.A0X = r5
            boolean r5 = r2.A5f()
            r0.A0F = r5
            boolean r5 = r2.A5G()
            r0.A0W = r5
            boolean r5 = r0.A0X
            if (r5 == 0) goto L_0x01da
            com.instagram.common.session.UserSession r5 = A01(r0)
            X.VwK r11 = X.VA1.A00(r5)
            java.lang.String r10 = r0.A0A
            java.lang.String r5 = "promotion_media"
            r11.A03(r5, r10)
        L_0x01da:
            r5 = 2857(0xb29, float:4.004E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            boolean r5 = r1.getBoolean(r5)
            r0.A0H = r5
            com.instagram.common.session.UserSession r11 = A01(r0)
            android.content.Context r10 = r0.requireContext()
            X.2kR r5 = new X.2kR
            r5.<init>(r10, r11, r0)
            com.instagram.common.session.UserSession r10 = A01(r0)
            X.2nI r14 = X.C229382nI.A02(r0, r0, r10, r4)
            androidx.fragment.app.FragmentActivity r13 = r0.requireActivity()
            X.32Q r20 = X.AnonymousClass32Q.A00
            boolean r10 = r0.A0H
            r25 = 1
            X.H3y r11 = new X.H3y
            r17 = r0
            r19 = r8
            r21 = r0
            r22 = r6
            r23 = r4
            r24 = r3
            r26 = r10
            r28 = r9
            r12 = r0
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.A09 = r11
            androidx.fragment.app.FragmentActivity r27 = r0.requireActivity()
            X.0hq r12 = r0.mFragmentManager
            if (r12 == 0) goto L_0x05d2
            com.instagram.common.session.UserSession r30 = A01(r0)
            X.H3y r11 = r0.A09
            java.lang.String r17 = "adapter"
            if (r11 == 0) goto L_0x02e4
            X.57N r10 = r0.A0N
            X.2uE r8 = new X.2uE
            r26 = r8
            r28 = r0
            r29 = r12
            r31 = r10
            r32 = r0
            r33 = r11
            r34 = r4
            r35 = r3
            r36 = r25
            r37 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r0.A0P = r8
            int r8 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            android.content.Context r8 = r0.requireContext()
            X.2js r12 = X.C227752jr.A00(r8, r4, r3)
            r0.A0K = r12
            java.lang.String r16 = "_helper"
            X.H3y r11 = r0.A09
            if (r11 == 0) goto L_0x02e4
            X.2ku r10 = r0.A0c
            X.2xD r8 = new X.2xD
            r8.<init>(r0, r12, r10, r11)
            X.1YN r15 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r14 = A01(r0)
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            com.instagram.quickpromotion.intf.QPTooltipAnchor r12 = com.instagram.quickpromotion.intf.QPTooltipAnchor.MEDIA_OPTIONS_ICON
            X.2qQ r11 = new X.2qQ
            r11.<init>()
            r13.put(r12, r11)
            X.2qT r11 = r15.A04(r14, r13)
            r0.A06 = r11
            X.1YN r31 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r34 = A01(r0)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r36 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A13
            X.AnonymousClass2bO.A00()
            X.IWU r12 = new X.IWU
            r12.<init>(r0)
            X.2qT r11 = r0.A06
            java.lang.String r14 = "quickPromotionTooltipsController"
            if (r11 == 0) goto L_0x03de
            r18 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r4
            r24 = r4
            r25 = r4
            r26 = r12
            r27 = r4
            r28 = r11
            r29 = r4
            r30 = r4
            X.2bW r35 = X.2bV.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r33 = r0
            X.2qi r11 = r31.A02(r32, r33, r34, r35, r36)
            r0.A05 = r11
            X.0hq r13 = r0.mFragmentManager
            X.H3y r11 = r0.A09
            if (r11 == 0) goto L_0x02e4
            X.32x r12 = new X.32x
            r12.<init>(r0, r13, r11, r5)
            r12.A0C = r8
            X.32y r5 = new X.32y
            r5.<init>()
            r12.A0B = r5
            X.4gf r5 = r0.A08
            r12.A0S = r5
            r12.A0b = r9
            com.instagram.common.session.UserSession r11 = A01(r0)
            X.2qi r9 = r0.A05
            if (r9 != 0) goto L_0x02ec
            java.lang.String r17 = "quickPromotionDelegate"
        L_0x02e4:
            X.0qQ.A0F(r17)
        L_0x02e7:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x02ec:
            X.2qT r8 = r0.A06
            if (r8 == 0) goto L_0x03de
            X.30o r5 = new X.30o
            r5.<init>(r11, r9, r8)
            r12.A0F = r5
            X.57N r5 = r0.A0N
            r12.A06 = r5
            r12.A0R = r6
            X.332 r5 = r12.A00()
            if (r2 == 0) goto L_0x0367
            com.instagram.common.session.UserSession r8 = A01(r0)
            com.instagram.user.model.User r8 = r2.A2A(r8)
            if (r8 == 0) goto L_0x0367
            X.H3y r8 = r0.A09
            if (r8 == 0) goto L_0x02e4
            X.3W1 r9 = r8.BQr(r2)
            X.1sy r8 = r0.A0Q
            r9.A0O(r8)
            int r9 = r0.A00
            r8 = -1
            if (r9 == r8) goto L_0x032c
            X.H3y r8 = r0.A09
            if (r8 == 0) goto L_0x02e4
            X.3W1 r9 = r8.BQr(r2)
            int r8 = r0.A00
            r9.A0A(r8)
        L_0x032c:
            X.4gf r9 = r0.A08
            X.4gf r8 = X.C270394gf.FEED_MEDIA
            if (r9 != r8) goto L_0x033c
            X.H3y r8 = r0.A09
            if (r8 == 0) goto L_0x02e4
            X.3W1 r8 = r8.BQr(r2)
            r8.A28 = r3
        L_0x033c:
            X.H3y r8 = r0.A09
            if (r8 == 0) goto L_0x02e4
            X.3W1 r9 = r8.BQr(r2)
            boolean r8 = r0.A0Z
            r9.A2u = r8
            X.H3y r8 = r0.A09
            if (r8 == 0) goto L_0x02e4
            X.3W1 r9 = r8.BQr(r2)
            boolean r8 = r0.A0Y
            r9.A2t = r8
            X.H3y r11 = r0.A09
            if (r11 == 0) goto L_0x02e4
            java.util.List r9 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r9)
            X.4n0 r8 = r11.A04
            r8.A0A(r9)
            X.C54229H3y.A00(r11)
        L_0x0367:
            android.content.Context r12 = r0.requireContext()
            com.instagram.common.session.UserSession r11 = A01(r0)
            X.0gy r9 = X.AnonymousClass07i.A00(r0)
            X.6z9 r8 = new X.6z9
            r8.<init>(r12, r9, r11)
            r0.A02 = r8
            com.instagram.common.session.UserSession r12 = A01(r0)
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r9 = 3
            X.TrU r8 = new X.TrU
            r8.<init>(r12, r0, r11, r9)
            r10.A01(r8)
            X.0qQ.A0A(r5)
            r10.A01(r5)
            X.2js r8 = r0.A0K
            if (r8 != 0) goto L_0x03ec
            X.0qQ.A0F(r16)
            goto L_0x02e7
        L_0x0398:
            java.lang.String r2 = r0.A0A
            if (r2 == 0) goto L_0x0466
            com.instagram.common.session.UserSession r6 = A01(r0)
            r2 = -2
            X.1NY r9 = new X.1NY
            r9.<init>(r6, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r9.A08(r2)
            java.lang.String r2 = r0.A0A
            java.lang.Object[] r8 = new java.lang.Object[]{r2}
            r2 = 3552(0xde0, float:4.977E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r2)
            r9.A0K(r6, r8)
            java.lang.String r2 = r0.A0A
            if (r2 == 0) goto L_0x05c2
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = X.0mp.A06(r6, r2)
            r9.A0A = r2
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r9.A07(r2)
            java.lang.Class<X.1XO> r6 = X.1XO.class
            java.lang.Class<X.1XW> r2 = X.1XW.class
            r9.A0O(r4, r6, r2, r3)
            X.1OC r6 = r9.A0M()
            X.6z9 r4 = r0.A02
            if (r4 != 0) goto L_0x03e3
            java.lang.String r14 = "feedNetworkSource"
        L_0x03de:
            X.0qQ.A0F(r14)
            goto L_0x02e7
        L_0x03e3:
            X.ELG r2 = new X.ELG
            r2.<init>(r0)
            r4.A03(r6, r2)
            goto L_0x0466
        L_0x03ec:
            r10.A01(r8)
            r8 = 2863(0xb2f, float:4.012E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r8)
            boolean r8 = r1.getBoolean(r8, r3)
            r0.A0b = r8
            r8 = 2852(0xb24, float:3.997E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r8)
            boolean r8 = r1.getBoolean(r8, r3)
            r0.A0a = r8
            r8 = 2869(0xb35, float:4.02E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r8)
            java.lang.String r8 = r1.getString(r8)
            r0.A0T = r8
            r8 = 2864(0xb30, float:4.013E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r8)
            boolean r26 = r1.getBoolean(r8, r3)
            java.lang.String r10 = r0.A0T
            if (r10 == 0) goto L_0x0507
            androidx.fragment.app.FragmentActivity r19 = r0.getActivity()
            if (r19 == 0) goto L_0x0444
            java.lang.String r9 = r0.A0A
            if (r9 == 0) goto L_0x0444
            boolean r8 = r0.A0b
            if (r8 == 0) goto L_0x0503
            X.5OB r20 = X.AnonymousClass5OB.NOTIFICATIONS
        L_0x0431:
            java.lang.String r8 = r6.A00
            boolean r6 = r0.A0a
            r18 = r0
            r21 = r2
            r22 = r9
            r23 = r10
            r24 = r8
            r25 = r6
            r18.A02(r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0444:
            r0.A03(r2)
            r6 = 2868(0xb34, float:4.019E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            java.lang.String r6 = r1.getString(r6)
            r0.A0C = r6
            boolean r6 = r0.A0H
            if (r6 == 0) goto L_0x04c1
            if (r2 == 0) goto L_0x0463
            com.instagram.common.session.UserSession r6 = A01(r0)
            com.instagram.user.model.User r6 = r2.A2A(r6)
            if (r6 != 0) goto L_0x04c3
        L_0x0463:
            A04(r0)
        L_0x0466:
            r2 = 2873(0xb39, float:4.026E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = r1.getString(r2)
            r0.A0D = r2
            r2 = 1191(0x4a7, float:1.669E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r2)
            java.lang.String r1 = r1.getString(r9)
            r0.A0S = r1
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.H3y r1 = r0.A09
            if (r1 == 0) goto L_0x02e4
            X.7Q8 r8 = new X.7Q8
            r8.<init>(r4, r2, r1)
            com.instagram.common.session.UserSession r1 = A01(r0)
            X.2wt r6 = new X.2wt
            r6.<init>(r0, r1, r0)
            com.instagram.common.session.UserSession r4 = A01(r0)
            X.ISk r2 = new X.ISk
            r2.<init>(r0)
            X.36D r1 = new X.36D
            r1.<init>(r4, r2, r3, r3)
            r0.A0O = r1
            X.2jd r2 = new X.2jd
            r2.<init>()
            r2.A0E(r1)
            r2.A0E(r8)
            r2.A0E(r6)
            r2.A0E(r5)
            X.2uE r1 = r0.A0P
            if (r1 != 0) goto L_0x052a
            java.lang.String r17 = "peekMediaController"
            goto L_0x02e4
        L_0x04c1:
            if (r2 == 0) goto L_0x0398
        L_0x04c3:
            com.instagram.common.session.UserSession r6 = A01(r0)
            com.instagram.user.model.User r6 = r2.A2A(r6)
            if (r6 == 0) goto L_0x0398
            r4 = 2856(0xb28, float:4.002E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            boolean r4 = r1.getBoolean(r4)
            if (r4 != 0) goto L_0x0463
            boolean r4 = r2.A5a()
            if (r4 != 0) goto L_0x0463
            boolean r4 = r2.A4c()
            if (r4 != 0) goto L_0x0466
            boolean r2 = r2.A4K()
            if (r2 != 0) goto L_0x0466
            X.EBB r6 = new X.EBB
            r6.<init>(r0)
            java.lang.String r4 = r0.A0A
            if (r4 == 0) goto L_0x05ca
            com.instagram.common.session.UserSession r2 = A01(r0)
            X.1OC r2 = X.C3724090s.A02(r2, r4)
            r2.A00 = r6
            r0.schedule(r2)
            goto L_0x0466
        L_0x0503:
            X.5OB r20 = X.AnonymousClass5OB.SHARED_COMMENT_ON_STORY
            goto L_0x0431
        L_0x0507:
            boolean r8 = r0.A0b
            if (r8 == 0) goto L_0x0444
            androidx.fragment.app.FragmentActivity r19 = r0.getActivity()
            if (r19 == 0) goto L_0x0444
            java.lang.String r9 = r0.A0A
            if (r9 == 0) goto L_0x0444
            X.5OB r20 = X.AnonymousClass5OB.NOTIFICATIONS
            java.lang.String r8 = r6.A00
            boolean r6 = r0.A0a
            r18 = r0
            r21 = r2
            r22 = r9
            r24 = r8
            r25 = r6
            r18.A02(r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0444
        L_0x052a:
            r2.A0E(r1)
            r0.A0b(r2)
            X.H3y r1 = r0.A09
            if (r1 == 0) goto L_0x02e4
            r0.A0V(r1)
            android.os.Bundle r1 = r0.requireArguments()
            java.lang.String r10 = r1.getString(r9)
            r1 = 399(0x18f, float:5.59E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r1.equals(r10)
            java.lang.String r9 = "media_view"
            java.lang.String r8 = "photo_view"
            java.lang.String r6 = "video_view"
            if (r1 == 0) goto L_0x0591
            X.1iA r5 = r0.A04
            X.1iA r1 = X.1iA.A0Q
            r4 = 95
            if (r5 != r1) goto L_0x057d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
        L_0x0561:
            r2.append(r4)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
        L_0x056b:
            X.0qQ.A0B(r10, r3)
            X.2k1 r1 = r0.A03
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x0576
            r1.A00 = r10
        L_0x0576:
            r0 = 1844463061(0x6df045d5, float:9.295103E27)
            X.AnonymousClass0fD.A09(r0, r7)
            return
        L_0x057d:
            X.1iA r1 = X.1iA.A0a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            if (r5 != r1) goto L_0x058a
            r2.<init>()
            r2.append(r6)
            goto L_0x0561
        L_0x058a:
            r2.<init>()
            r2.append(r9)
            goto L_0x0561
        L_0x0591:
            if (r10 != 0) goto L_0x056b
            X.1iA r2 = r0.A04
            X.1iA r1 = X.1iA.A0Q
            if (r2 != r1) goto L_0x059c
            r9 = r8
        L_0x059a:
            r10 = r9
            goto L_0x056b
        L_0x059c:
            X.1iA r1 = X.1iA.A0a
            if (r2 != r1) goto L_0x059a
            r9 = r6
            goto L_0x059a
        L_0x05a2:
            X.1iA r5 = r2.BR7()
            goto L_0x01b3
        L_0x05a8:
            r27 = 0
            goto L_0x01da
        L_0x05ac:
            int r4 = r0.A00
            goto L_0x015b
        L_0x05b0:
            java.lang.String r5 = r0.A0S
            r4 = 1142(0x476, float:1.6E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0151
            X.1sy r4 = X.1sy.A0V
            goto L_0x014f
        L_0x05c2:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x05ca:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x05d2:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -1431703496(0xffffffffaaa9f038, float:-3.0187116E-13)
            X.AnonymousClass0fD.A09(r0, r7)
            throw r1
        L_0x05e0:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32F.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1148352055);
        0qQ.A0B(layoutInflater, 0);
        this.A0J = layoutInflater.inflate(R.layout.layout_feed_refresh_options, viewGroup, false);
        A01(this);
        View view = this.A0J;
        if (view != null) {
            C19762Wf3 wf3 = new C19762Wf3(view, new C51000Fmn(this));
            AnonymousClass3D4.A00(requireContext());
            this.A07 = wf3;
            View view2 = this.A0J;
            AnonymousClass0fD.A09(-2071834424, A022);
            return view2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        AnonymousClass0fD.A09(985825258, A022);
        throw illegalStateException;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-947839675);
        super.onDestroy();
        this.A0I = null;
        AnonymousClass0fD.A09(-192455228, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(159590246);
        super.onDestroyView();
        this.A0R = null;
        this.A0J = null;
        Handler handler = this.A0I;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        AnonymousClass1Nd.A00(A01(this)).A02(this.A0h, AnonymousClass3DT.class);
        AnonymousClass0fD.A09(-357769751, A022);
    }

    public final void onPause() {
        String str;
        int A022 = AnonymousClass0fD.A02(1080314887);
        AnonymousClass32F.super.onPause();
        C227762js r2 = this.A0K;
        if (r2 == null) {
            str = "_helper";
        } else {
            C238133Ar scrollingViewProxy = getScrollingViewProxy();
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            r2.A09(scrollingViewProxy);
            AnonymousClass3KG r1 = this.A0L;
            if (r1 != null) {
                str = "screenshotDetector";
                r1.A06(this.A0M);
                AnonymousClass3KG r0 = this.A0L;
                if (r0 != null) {
                    r0.A04();
                    this.A0M = null;
                }
            }
            AnonymousClass0fD.A09(-1155233952, A022);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.3Jo] */
    public final void onResume() {
        String str;
        0hq r0;
        int A022 = AnonymousClass0fD.A02(-1316296566);
        super.onResume();
        C227762js r5 = this.A0K;
        if (r5 == null) {
            str = "_helper";
        } else {
            float A002 = (float) AnonymousClass3D4.A00(requireContext());
            r5.A04(2dZ.A0t.A03(requireActivity()).A0P, new Object(), A002);
            if (this.A0G && (r0 = this.mFragmentManager) != null) {
                r0.A0c();
            }
            FragmentActivity requireActivity = requireActivity();
            1OP r02 = 1OP.$redex_init_class;
            AnonymousClass3K2 A042 = AnonymousClass3K2.A04(requireActivity);
            if (A042 != null && A042.A0Z() && A042.A0H == AnonymousClass3BQ.SINGLE_FEED_ITEM_HEADER) {
                A042.A0X(this);
            }
            AnonymousClass3KG r03 = this.A0L;
            str = "screenshotDetector";
            if (r03 != null) {
                r03.A03();
                if (this.A0L != null) {
                    AnonymousClass3KQ A003 = AnonymousClass3KG.A00(new AnonymousClass3KN(A01(this), this, this, this.A0S));
                    AnonymousClass3KG r04 = this.A0L;
                    if (r04 != null) {
                        r04.A05(A003);
                        this.A0M = A003;
                        AnonymousClass0fD.A09(520820108, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass3AD r0;
        AnonymousClass3AD r02;
        int A032 = AnonymousClass0fD.A03(-715024831);
        0qQ.A0B(absListView, 0);
        if (!AnonymousClass2Rc.A00 || isVisible()) {
            1Xj A022 = 1E7.A00(A01(this)).A02(this.A0A);
            if (A022 != null) {
                C54229H3y h3y = this.A09;
                if (h3y == null) {
                    0qQ.A0F("adapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                AnonymousClass3W1 BQr = h3y.BQr(A022);
                0S7.A00(this);
                ListView listView = this.A04;
                0qQ.A0C(listView, "null cannot be cast to non-null type com.instagram.ui.widget.refresh.RefreshableListView");
                if (((RefreshableListView) listView).A08) {
                    if (BQr.CdP() && (r02 = this.A07) != null) {
                        r02.APL();
                    }
                } else if (!BQr.CdP() && (r0 = this.A07) != null) {
                    r0.ARa();
                }
            }
            this.A0c.onScroll(absListView, i, i2, i3);
        }
        AnonymousClass0fD.A0A(313882293, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0fD.A03(217967744);
        0qQ.A0B(absListView, 0);
        this.A0c.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(1484898509, A032);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(799163283);
        AnonymousClass32F.super.onStart();
        if (this.A0V && (getRootActivity() instanceof AnonymousClass2ZP)) {
            Activity rootActivity = getRootActivity();
            0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) rootActivity).Enj(8);
        }
        AnonymousClass0fD.A09(-2023687670, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1072100185);
        AnonymousClass32F.super.onStop();
        if (this.A0V && (getRootActivity() instanceof AnonymousClass2ZP)) {
            Activity rootActivity = getRootActivity();
            0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) rootActivity).Enj(0);
        }
        AnonymousClass0fD.A09(-701544073, A022);
    }

    public final void CgO() {
        A04(this);
    }
}
