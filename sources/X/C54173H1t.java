package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;

/* renamed from: X.H1t  reason: case insensitive filesystem */
public final class C54173H1t extends AnonymousClass32G implements C229122ms, AnonymousClass4DU, AbsListView.OnScrollListener, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromotionPreviewFragment";
    public UserSession A00;
    public C324356z9 A01;
    public C54229H3y A02;
    public String A03;
    public AnonymousClass332 A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C228172ku A0B = new C228172ku();

    public static 1Xj A01(1Xj r10, C54173H1t h1t) {
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        String str3 = null;
        1Xj r3 = r10;
        0qQ.A0B(r10, 1);
        if (h1t.A0A) {
            z2 = true;
        }
        if (h1t.A08) {
            str3 = DbV.A05(h1t).getString(2131965975);
        }
        if (h1t.A09) {
            z = true;
        }
        String str4 = h1t.A05;
        if (str4 != null) {
            str = str4;
            if (r10.A5D()) {
                arrayList = AnonymousClass7TE.A1C();
                for (int i = 0; i < r10.A0o(); i++) {
                    arrayList.add(A01(r10.A1c(i), h1t));
                }
            }
        }
        if (!TextUtils.isEmpty(h1t.A06)) {
            str2 = h1t.A06;
        }
        return C54993HaQ.A00(h1t.A00, (C53352Gmc) null, r3, str, str2, str3, arrayList, z, z2);
    }

    public final boolean CJz() {
        return false;
    }

    public final boolean CKB() {
        return false;
    }

    public final boolean CT5() {
        return false;
    }

    public final boolean CWV() {
        return false;
    }

    public final void CgO() {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(5149);
    }

    public final boolean isLoading() {
        return false;
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A00;
    }

    public final void configureActionBar(2da r2) {
        r2.Eu4(AnonymousClass7TF.A1R(this.mFragmentManager.A0M()));
        r2.setTitle(this.A07);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.4DU, X.0S7, androidx.fragment.app.Fragment, java.lang.Object, X.H1t, X.32G] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r33) {
        /*
            r32 = this;
            r0 = -1895797076(0xffffffff8f006eac, float:-6.332202E-30)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r10 = r32
            r0 = r33
            X.C54173H1t.super.onCreate(r0)
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r10)
            r10.A00 = r0
            android.os.Bundle r5 = r10.requireArguments()
            r0 = 58
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r5.getString(r0)
            X.1L2 r0 = X.AnonymousClass1L1.A01
            X.1L1 r2 = r0.A01(r1)
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 3942(0xf66, float:5.524E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 33
            if (r4 < r0) goto L_0x01a9
            java.lang.Class<com.instagram.music.common.model.AudioOverlayTrack> r0 = com.instagram.music.common.model.AudioOverlayTrack.class
            java.lang.Object r1 = X.2Yc.A01(r5, r0, r1)
        L_0x003a:
            com.instagram.music.common.model.AudioOverlayTrack r1 = (com.instagram.music.common.model.AudioOverlayTrack) r1
            android.content.Context r0 = r10.requireContext()
            android.os.Bundle r6 = r10.requireArguments()
            java.lang.String r5 = "com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_DISPLAY_PROFILE_FEED_TEXT"
            r4 = 0
            boolean r5 = r6.getBoolean(r5, r4)
            r12 = 0
            if (r5 == 0) goto L_0x01a4
            r5 = 5
            X.Fwb r7 = new X.Fwb
            r7.<init>(r10, r5)
            r22 = 2131627085(0x7f0e0c4d, float:1.8881424E38)
        L_0x0057:
            com.instagram.common.session.UserSession r5 = r10.A00
            X.2kR r14 = new X.2kR
            r14.<init>(r0, r5, r10)
            androidx.fragment.app.FragmentActivity r11 = r10.requireActivity()
            com.instagram.common.session.UserSession r5 = r10.A00
            X.6vO r13 = new X.6vO
            r13.<init>(r5)
            X.32Q r6 = X.AnonymousClass32Q.A00
            r5 = 9
            X.0qQ.A0B(r6, r5)
            X.H3y r9 = new X.H3y
            r15 = r12
            r16 = r12
            r17 = r12
            r19 = r10
            r21 = r7
            r23 = r4
            r24 = r4
            r25 = r4
            r26 = r4
            r18 = r6
            r20 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r10.A02 = r9
            int r5 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            com.instagram.common.session.UserSession r6 = r10.A00
            X.2xP r25 = X.C234242xR.A00()
            r5 = 1
            X.2xQ r24 = new X.2xQ
            r26 = r1
            r27 = r5
            r28 = r4
            r29 = r4
            r30 = r4
            r31 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r1 = 2
            X.0qQ.A0B(r6, r1)
            java.lang.Integer r25 = X.AnonymousClass05K.A0u
            X.2xS r8 = new X.2xS
            r15 = r8
            r16 = r0
            r18 = r6
            r19 = r12
            r20 = r10
            r21 = r12
            r22 = r9
            r23 = r12
            r26 = r12
            r27 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.H3y r7 = r10.A02
            X.IRx r6 = new X.IRx
            r6.<init>(r7, r8)
            X.0hq r1 = r10.mFragmentManager
            X.32x r0 = new X.32x
            r0.<init>(r10, r1, r7, r14)
            r0.A0G = r8
            r0.A0A = r6
            r0.A0R = r2
            X.332 r1 = r0.A00()
            r10.A04 = r1
            X.2ku r0 = r10.A0B
            r0.A01(r1)
            X.332 r0 = r10.A04
            r10.registerLifecycleListener(r0)
            android.os.Bundle r1 = r10.requireArguments()
            r0 = 139(0x8b, float:1.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            r10.A03 = r0
            android.os.Bundle r1 = r10.requireArguments()
            java.lang.String r0 = "com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_CTA_TEXT"
            java.lang.String r0 = r1.getString(r0)
            r10.A05 = r0
            android.os.Bundle r1 = r10.requireArguments()
            java.lang.String r0 = "com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_SPONSORED_LABEL"
            boolean r0 = r1.getBoolean(r0)
            r10.A08 = r0
            android.os.Bundle r1 = r10.requireArguments()
            java.lang.String r0 = "com.instgram.android.fragment.ARGUMENTS_KEY_EXTRA_REMOVE_LOCATION"
            boolean r0 = r1.getBoolean(r0)
            r10.A09 = r0
            android.os.Bundle r1 = r10.requireArguments()
            java.lang.String r0 = "com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_RESET_FEEDBACK"
            boolean r0 = r1.getBoolean(r0)
            r10.A0A = r0
            android.os.Bundle r1 = r10.requireArguments()
            java.lang.String r0 = "com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_POLITICAL_CONTEXT"
            java.lang.String r0 = r1.getString(r0, r12)
            r10.A06 = r0
            android.os.Bundle r2 = r10.requireArguments()
            r0 = 2131969733(0x7f1346c5, float:1.9576397E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 555(0x22b, float:7.78E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0, r1)
            r10.A07 = r0
            android.content.Context r1 = r10.getContext()
            com.instagram.common.session.UserSession r0 = r10.A00
            X.6z9 r0 = X.C51970G9q.A0g(r1, r10, r0)
            r10.A01 = r0
            com.instagram.common.session.UserSession r0 = r10.A00
            X.1E8 r1 = X.1E7.A00(r0)
            java.lang.String r0 = r10.A03
            X.1Xj r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0191
            X.1Xj r5 = A01(r0, r10)
            X.H3y r0 = r10.A02
            X.3W1 r1 = r0.BQr(r5)
            X.1sy r0 = X.1sy.A0O
            r1.A0O(r0)
            X.H3y r2 = r10.A02
            java.util.List r1 = java.util.Collections.singletonList(r5)
            X.0qQ.A0B(r1, r4)
            X.4n0 r0 = r2.A04
            r0.A0A(r1)
            X.C54229H3y.A00(r2)
        L_0x0185:
            X.H3y r0 = r10.A02
            r10.A0V(r0)
            r0 = -1737493490(0xffffffff986ff40e, float:-3.1013242E-24)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x0191:
            X.6z9 r2 = r10.A01
            java.lang.String r1 = r10.A03
            com.instagram.common.session.UserSession r0 = r10.A00
            X.1OC r1 = X.C3724090s.A04(r0, r1)
            X.HAt r0 = new X.HAt
            r0.<init>(r10, r5)
            r2.A03(r1, r0)
            goto L_0x0185
        L_0x01a4:
            r7 = r12
            r22 = 0
            goto L_0x0057
        L_0x01a9:
            android.os.Parcelable r1 = r5.getParcelable(r1)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54173H1t.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1432727155);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_feed);
        AnonymousClass0fD.A09(1814448213, A022);
        return A0C;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(-964220611);
        this.A0B.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(165769134, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0fD.A03(-1940918505);
        this.A0B.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(1415374606, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (1E7.A00(this.A00).A02(this.A03) == null) {
            0S7.A00(this);
            ((RefreshableListView) this.A04).setIsLoading(true);
        }
        0S7.A00(this);
        this.A04.setOnScrollListener(this);
    }
}
