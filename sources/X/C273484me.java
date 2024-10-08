package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4me  reason: invalid class name and case insensitive filesystem */
public final class C273484me extends AnonymousClass4DH implements AnonymousClass4DR, C249453jo, C273494mf {
    public static final String __redex_internal_original_name = "DirectThreadToggleFragment";
    public AnonymousClass9H7 A00;
    public C67089Mi7 A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final boolean A03 = true;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "direct_thread_toggle";
    }

    public final void onAttachFragment(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        AnonymousClass9H7 r3 = this.A00;
        if (r3 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (AnonymousClass000.A00(2239).equals(fragment.mTag)) {
            r3.A0F = (C273474md) fragment;
            Integer num = r3.A0c;
            if (num != null) {
                AnonymousClass9H7.A01(r3).A0T(num.intValue(), 0, 0, false);
            }
        } else {
            if (C273654mx.A00(1239).equals(fragment.mTag)) {
                NIE nie = (NIE) fragment;
                r3.A0L = nie;
                float f = r3.A00;
                boolean z = false;
                if (nie.A02 == null) {
                    z = true;
                }
                17k.A0F(z);
                nie.A00 = f;
                nie.A0C.add(new C70442O6t(r3));
            }
        }
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r1.CXf() == true) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConfigurationChanged(android.content.res.Configuration r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            super.onConfigurationChanged(r7)
            X.9H7 r5 = r6.A00
            if (r5 == 0) goto L_0x0065
            X.7Hl r1 = r5.A0R
            if (r1 == 0) goto L_0x0027
            boolean r0 = X.2Y9.A00
            if (r0 == 0) goto L_0x0027
            X.7JI r2 = r1.A0u
            if (r2 == 0) goto L_0x0027
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r1.A0I
            X.7JE r0 = r2.A0R
            r0.A00 = r1
            if (r1 == 0) goto L_0x0027
            X.7JS r0 = new X.7JS
            r0.<init>(r2)
            r1.setOnTouchListener(r0)
        L_0x0027:
            android.app.Activity r0 = X.AnonymousClass9H7.A00(r5)
            android.view.Window r4 = r0.getWindow()
            if (r4 == 0) goto L_0x0064
            android.app.Activity r3 = X.AnonymousClass9H7.A00(r5)
            r0 = 2131435220(0x7f0b1ed4, float:1.8492276E38)
            android.view.View r2 = r3.findViewById(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getHitRect(r1)
            if (r2 == 0) goto L_0x0064
            boolean r0 = r2.getLocalVisibleRect(r1)
            if (r0 == 0) goto L_0x0064
            android.view.View r0 = r4.getDecorView()
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.Okk r0 = new X.Okk
            r0.<init>(r4, r5)
            r1.addOnGlobalLayoutListener(r0)
        L_0x0064:
            return
        L_0x0065:
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            if (r1 == 0) goto L_0x0064
            boolean r0 = r1 instanceof X.AnonymousClass2ZV
            if (r0 == 0) goto L_0x009e
            X.2ZV r1 = (X.AnonymousClass2ZV) r1
            r3 = 1
            if (r1 == 0) goto L_0x009e
            boolean r0 = r1.CXf()
            if (r0 != r3) goto L_0x009e
        L_0x007a:
            X.0wj r2 = X.0wj.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "DirectThreadToggleFragment - onConfigurationChanged controller null"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r0 = "isModalActive"
            r2.ABR(r0, r3)
            boolean r1 = r6.isAdded()
            java.lang.String r0 = "isFragmentAdded"
            r2.ABR(r0, r1)
            boolean r1 = r6.mDetached
            java.lang.String r0 = "isFragmentDetached"
            r2.ABR(r0, r1)
            r2.report()
            return
        L_0x009e:
            r3 = 0
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273484me.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        ArrayList arrayList;
        C388699oF r1;
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        AnonymousClass9H7 r3 = this.A00;
        if (r3 != null) {
            bundle.putBoolean("BUNDLE_KEY_IS_AUTOMESSAGE_SENT", r3.A0h);
            String str = r3.A0e;
            if (str != null) {
                C394279xp.A00(r3.A10).A02(str);
                r3.A0e = null;
            }
            C329067Hl r0 = r3.A0R;
            if (r0 != null) {
                C328757Gc r02 = r0.A0b.A08;
                if (r02 != null) {
                    List<AnonymousClass9SZ> list = r02.A00.A02;
                    arrayList = new ArrayList();
                    for (AnonymousClass9SZ r12 : list) {
                        if ((r12 instanceof C388699oF) && (r1 = (C388699oF) r12) != null) {
                            arrayList.add(r1.A00);
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                }
                if (!arrayList.isEmpty()) {
                    String valueOf = String.valueOf(AnonymousClass0HN.A00());
                    r3.A0e = valueOf;
                    if (valueOf != null) {
                        bundle.putString(AnonymousClass000.A00(2109), valueOf);
                        C394279xp.A00(r3.A10).A01(30000, valueOf, arrayList, false);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass9H7 r0 = this.A00;
        if (r0 != null) {
            r0.A0H(view, bundle);
            Activity rootActivity = getRootActivity();
            if (rootActivity != null) {
                C66732Mbd.A01(rootActivity, (View) null, (UserSession) this.A02.getValue());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final 2dZ AYJ() {
        AnonymousClass9H7 r0 = this.A00;
        if (r0 != null) {
            return r0.A04;
        }
        throw new IllegalStateException("Required value was null.");
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

    public final AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A02.getValue();
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

    public final boolean isContainerFragment() {
        return this.A03;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        AnonymousClass9H7 r0 = this.A00;
        if (r0 == null) {
            return false;
        }
        MessageListLayoutManager messageListLayoutManager = AnonymousClass9H7.A01(r0).A0B;
        if (messageListLayoutManager == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (messageListLayoutManager.A1b() == messageListLayoutManager.A0U() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass9H7 r0 = this.A00;
        if (r0 == null || !r0.onBackPressed()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x010e A[Catch:{ all -> 0x01d9, all -> 0x01ec }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = 147030177(0x8c380a1, float:1.1766376E-33)
            int r2 = X.AnonymousClass0fD.A02(r0)
            java.lang.String r1 = "DirectThreadToggleFragment.onCreate"
            r0 = -1565317391(0xffffffffa2b326f1, float:-4.855928E-18)
            X.0fh.A01(r1, r0)
            r6 = r21
            android.os.Bundle r1 = r6.requireArguments()     // Catch:{ all -> 0x01f4 }
            X.0eM r0 = r6.A02     // Catch:{ all -> 0x01f4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01f4 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f4 }
            r8 = 0
            X.9H7 r7 = X.AnonymousClass9H2.A00(r1, r6, r0, r8)     // Catch:{ all -> 0x01f4 }
            r6.A00 = r7     // Catch:{ all -> 0x01f4 }
            X.Mi7 r0 = r6.A01     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x002a
            r7.A0Q = r0     // Catch:{ all -> 0x01f4 }
        L_0x002a:
            java.lang.String r1 = "DirectThreadToggleController.onCreate"
            r0 = 1408345798(0x53f1a6c6, float:2.07577022E12)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x01f4 }
            X.9HS r12 = r7.A1J     // Catch:{ all -> 0x01ec }
            X.34p r5 = r12.A05     // Catch:{ all -> 0x01ec }
            r4 = 0
            r5.A08(r4)     // Catch:{ all -> 0x01ec }
            X.9H3 r10 = r7.A1M     // Catch:{ all -> 0x01ec }
            X.9H4 r3 = r10.A05     // Catch:{ all -> 0x01ec }
            r3.A01(r4)     // Catch:{ all -> 0x01ec }
            int r1 = r7.A0q     // Catch:{ all -> 0x01ec }
            if (r1 == 0) goto L_0x00f4
            X.4DH r9 = r7.A0u     // Catch:{ all -> 0x01ec }
            android.content.Context r0 = r9.requireContext()     // Catch:{ all -> 0x01ec }
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper     // Catch:{ all -> 0x01ec }
            r13.<init>(r0, r1)     // Catch:{ all -> 0x01ec }
        L_0x0050:
            r7.A02 = r13     // Catch:{ all -> 0x01ec }
            com.instagram.common.session.UserSession r15 = r7.A10     // Catch:{ all -> 0x01ec }
            X.4DU r11 = r7.A1Q     // Catch:{ all -> 0x01ec }
            java.lang.String r1 = r7.A1W     // Catch:{ all -> 0x01ec }
            X.7Pg r0 = new X.7Pg     // Catch:{ all -> 0x01ec }
            r0.<init>(r13, r15, r11, r1)     // Catch:{ all -> 0x01ec }
            r7.A0W = r0     // Catch:{ all -> 0x01ec }
            X.3t2 r0 = r7.A1S     // Catch:{ all -> 0x01ec }
            X.3tH r0 = X.AnonymousClass6W3.A00(r0)     // Catch:{ all -> 0x01ec }
            X.0i1 r1 = X.AnonymousClass0LO.A9y     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x01ec }
            X.0LA.A05(r1, r0)     // Catch:{ all -> 0x01ec }
            android.app.Activity r0 = X.AnonymousClass9H7.A00(r7)     // Catch:{ all -> 0x01ec }
            android.view.Window r1 = r0.getWindow()     // Catch:{ all -> 0x01ec }
            if (r1 == 0) goto L_0x01e4
            r0 = 16
            r1.setSoftInputMode(r0)     // Catch:{ all -> 0x01ec }
            X.34p r11 = r12.A04     // Catch:{ all -> 0x01ec }
            r11.A08(r4)     // Catch:{ all -> 0x01ec }
            X.7Sh r13 = new X.7Sh     // Catch:{ all -> 0x01ec }
            r13.<init>(r12, r10)     // Catch:{ all -> 0x01ec }
            X.7Rr r12 = r7.A1L     // Catch:{ all -> 0x01ec }
            X.9HC r10 = r7.A1H     // Catch:{ all -> 0x01ec }
            X.7SG r1 = r7.A0K     // Catch:{ all -> 0x01ec }
            X.9HO r0 = r7.A1F     // Catch:{ all -> 0x01ec }
            X.7Si r14 = new X.7Si     // Catch:{ all -> 0x01ec }
            r18 = r1
            r19 = r12
            r20 = r13
            r17 = r10
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01ec }
            X.2YN r1 = new X.2YN     // Catch:{ all -> 0x01ec }
            r1.<init>(r14, r9)     // Catch:{ all -> 0x01ec }
            java.lang.Class<X.7Sj> r0 = X.C331787Sj.class
            X.2YL r0 = r1.A00(r0)     // Catch:{ all -> 0x01ec }
            X.7Sj r0 = (X.C331787Sj) r0     // Catch:{ all -> 0x01ec }
            r7.A0J = r0     // Catch:{ all -> 0x01ec }
            r11.A05()     // Catch:{ all -> 0x01ec }
            X.3U9 r11 = X.AnonymousClass9H7.A05(r7)     // Catch:{ all -> 0x01ec }
            if (r11 == 0) goto L_0x0115
            X.0Tu r12 = X.0Tu.A05     // Catch:{ all -> 0x01ec }
            r0 = 36318058772633403(0x8107150013173b, double:3.03102483667336E-306)
            boolean r0 = X.182.A06(r12, r15, r0)     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x0115
            r0 = 36318058774402892(0x810715002e174c, double:3.031024837792392E-306)
            boolean r0 = X.182.A06(r12, r15, r0)     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x0115
            X.7Sj r0 = r7.A0J     // Catch:{ all -> 0x01ec }
            java.lang.String r14 = "directThreadDataViewModel"
            if (r0 == 0) goto L_0x01dc
            android.os.Bundle r1 = r7.A0r     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = "DirectThreadFragment.ARGUMENT_SHOW_PERMISSIONS"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ all -> 0x01ec }
            if (r0 != 0) goto L_0x00fc
            boolean r13 = r11.isPending()     // Catch:{ all -> 0x01ec }
            boolean r12 = r11.CUG()     // Catch:{ all -> 0x01ec }
            int r1 = r11.BSK()     // Catch:{ all -> 0x01ec }
            java.util.List r0 = r11.BRZ()     // Catch:{ all -> 0x01ec }
            boolean r0 = X.C66640Ma9.A04(r0, r1, r13, r12)     // Catch:{ all -> 0x01ec }
            r12 = 0
            if (r0 == 0) goto L_0x00fd
            goto L_0x00fc
        L_0x00f4:
            X.4DH r9 = r7.A0u     // Catch:{ all -> 0x01ec }
            android.content.Context r13 = r9.requireContext()     // Catch:{ all -> 0x01ec }
            goto L_0x0050
        L_0x00fc:
            r12 = 1
        L_0x00fd:
            X.7S4 r1 = new X.7S4     // Catch:{ all -> 0x01ec }
            r1.<init>(r15, r10)     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r11.C6C()     // Catch:{ all -> 0x01ec }
            X.7SD r10 = r1.A00(r11, r0, r12)     // Catch:{ all -> 0x01ec }
            X.7Sj r1 = r7.A0J     // Catch:{ all -> 0x01ec }
            if (r1 == 0) goto L_0x01dc
            com.instagram.model.direct.DirectThreadKey r0 = r11.BJz()     // Catch:{ all -> 0x01ec }
            r1.A03(r10, r0)     // Catch:{ all -> 0x01ec }
        L_0x0115:
            r0 = 40
            X.9Ko r10 = new X.9Ko     // Catch:{ all -> 0x01ec }
            r10.<init>(r7, r0)     // Catch:{ all -> 0x01ec }
            r1 = 41
            X.9Ko r0 = new X.9Ko     // Catch:{ all -> 0x01ec }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x01ec }
            X.7GT r1 = new X.7GT     // Catch:{ all -> 0x01ec }
            r1.<init>(r10, r15, r0)     // Catch:{ all -> 0x01ec }
            r7.A0H = r1     // Catch:{ all -> 0x01ec }
            X.4DJ r0 = r7.A0y     // Catch:{ all -> 0x01ec }
            r0.registerLifecycleListener(r1)     // Catch:{ all -> 0x01ec }
            androidx.fragment.app.FragmentActivity r10 = r9.requireActivity()     // Catch:{ all -> 0x01ec }
            X.7GU r0 = new X.7GU     // Catch:{ all -> 0x01ec }
            r0.<init>(r15)     // Catch:{ all -> 0x01ec }
            X.2YN r1 = new X.2YN     // Catch:{ all -> 0x01ec }
            r1.<init>(r0, r10)     // Catch:{ all -> 0x01ec }
            java.lang.Class<X.7GV> r0 = X.AnonymousClass7GV.class
            X.2YL r0 = r1.A00(r0)     // Catch:{ all -> 0x01ec }
            X.7GV r0 = (X.AnonymousClass7GV) r0     // Catch:{ all -> 0x01ec }
            r7.A0B = r0     // Catch:{ all -> 0x01ec }
            androidx.fragment.app.FragmentActivity r10 = r9.requireActivity()     // Catch:{ all -> 0x01ec }
            X.7GZ r0 = new X.7GZ     // Catch:{ all -> 0x01ec }
            r0.<init>(r15)     // Catch:{ all -> 0x01ec }
            X.2YN r1 = new X.2YN     // Catch:{ all -> 0x01ec }
            r1.<init>(r0, r10)     // Catch:{ all -> 0x01ec }
            java.lang.Class<X.7Ga> r0 = X.C328737Ga.class
            X.2YL r0 = r1.A00(r0)     // Catch:{ all -> 0x01ec }
            X.7Ga r0 = (X.C328737Ga) r0     // Catch:{ all -> 0x01ec }
            r7.A0a = r0     // Catch:{ all -> 0x01ec }
            androidx.fragment.app.FragmentActivity r10 = r9.requireActivity()     // Catch:{ all -> 0x01ec }
            X.7Gb r0 = new X.7Gb     // Catch:{ all -> 0x01ec }
            r0.<init>(r15)     // Catch:{ all -> 0x01ec }
            X.2YN r1 = new X.2YN     // Catch:{ all -> 0x01ec }
            r1.<init>(r0, r10)     // Catch:{ all -> 0x01ec }
            java.lang.Class<X.7Gc> r0 = X.C328757Gc.class
            X.2YL r0 = r1.A00(r0)     // Catch:{ all -> 0x01ec }
            X.7Gc r0 = (X.C328757Gc) r0     // Catch:{ all -> 0x01ec }
            r7.A0T = r0     // Catch:{ all -> 0x01ec }
            X.0hq r1 = r9.getChildFragmentManager()     // Catch:{ all -> 0x01ec }
            X.7Gg r0 = new X.7Gg     // Catch:{ all -> 0x01ec }
            r0.<init>(r7)     // Catch:{ all -> 0x01ec }
            r1.A09 = r0     // Catch:{ all -> 0x01ec }
            X.7S2 r0 = r7.A1I     // Catch:{ all -> 0x01ec }
            X.0h9 r9 = r9.mLifecycleRegistry     // Catch:{ all -> 0x01ec }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x01ec }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x01ec }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01ec }
        L_0x018f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x019f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01ec }
            X.7Ru r0 = (X.C331647Ru) r0     // Catch:{ all -> 0x01ec }
            r0.A06(r9)     // Catch:{ all -> 0x01ec }
            goto L_0x018f
        L_0x019f:
            X.1bT r0 = X.C2598343g.A00(r15)     // Catch:{ all -> 0x01ec }
            X.42w r9 = r7.A1K     // Catch:{ all -> 0x01ec }
            X.0qQ.A0B(r9, r8)     // Catch:{ all -> 0x01ec }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x01ec }
            monitor-enter(r1)     // Catch:{ all -> 0x01ec }
            java.util.List r0 = r0.A03     // Catch:{ all -> 0x01d9 }
            r0.add(r9)     // Catch:{ all -> 0x01d9 }
            monitor-exit(r1)     // Catch:{ all -> 0x01ec }
            r1 = r22
            if (r22 == 0) goto L_0x01bd
            java.lang.String r0 = "BUNDLE_KEY_IS_AUTOMESSAGE_SENT"
            boolean r0 = r1.getBoolean(r0, r8)     // Catch:{ all -> 0x01ec }
            r7.A0h = r0     // Catch:{ all -> 0x01ec }
        L_0x01bd:
            r5.A05()     // Catch:{ all -> 0x01ec }
            r3.A02(r4)     // Catch:{ all -> 0x01ec }
            r0 = 1295172546(0x4d32c3c2, float:1.87448352E8)
            X.0fh.A00(r0)     // Catch:{ all -> 0x01f4 }
            X.C273484me.super.onCreate(r1)     // Catch:{ all -> 0x01f4 }
            r0 = 1296354763(0x4d44cdcb, float:2.06363824E8)
            X.0fh.A00(r0)
            r0 = 1822320008(0x6c9e6588, float:1.531918E27)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ec }
            goto L_0x01eb
        L_0x01dc:
            X.0qQ.A0F(r14)     // Catch:{ all -> 0x01ec }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x01eb
        L_0x01e4:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01ec }
            r0.<init>(r1)     // Catch:{ all -> 0x01ec }
        L_0x01eb:
            throw r0     // Catch:{ all -> 0x01ec }
        L_0x01ec:
            r1 = move-exception
            r0 = -56712911(0xfffffffffc9ea131, float:-6.589218E36)
            X.0fh.A00(r0)     // Catch:{ all -> 0x01f4 }
            throw r1     // Catch:{ all -> 0x01f4 }
        L_0x01f4:
            r1 = move-exception
            r0 = 1223090347(0x48e6e0ab, float:472837.34)
            X.0fh.A00(r0)
            r0 = -749907758(0xffffffffd34d50d2, float:-8.8182424E11)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273484me.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r0 == null) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r15, android.view.ViewGroup r16, android.os.Bundle r17) {
        /*
            r14 = this;
            r0 = 413738276(0x18a92524, float:4.372298E-24)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r12 = 0
            X.0qQ.A0B(r15, r12)
            X.9H7 r5 = r14.A00
            if (r5 == 0) goto L_0x00cf
            java.lang.String r1 = "DirectThreadToggleController.onCreateView"
            r0 = -208041779(0xfffffffff39988cd, float:-2.4328493E31)
            X.0fh.A01(r1, r0)
            X.9HS r0 = r5.A1J     // Catch:{ all -> 0x00c7 }
            X.34p r4 = r0.A06     // Catch:{ all -> 0x00c7 }
            r9 = 1
            r3 = 0
            r4.A08(r3)     // Catch:{ all -> 0x00c7 }
            X.9HB r0 = r5.A1T     // Catch:{ all -> 0x00c7 }
            r10 = r16
            r0.A02(r10)     // Catch:{ all -> 0x00c7 }
            android.app.Activity r0 = X.AnonymousClass9H7.A00(r5)     // Catch:{ all -> 0x00c7 }
            com.instagram.common.session.UserSession r7 = r5.A10     // Catch:{ all -> 0x00c7 }
            boolean r0 = X.C66732Mbd.A03(r0, r7)     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x0038
            r0 = 8
            X.AnonymousClass9H7.A0B(r5, r0)     // Catch:{ all -> 0x00c7 }
        L_0x0038:
            X.2ia r6 = X.AnonymousClass2iW.A00(r7)     // Catch:{ all -> 0x00c7 }
            int r0 = r6.A02     // Catch:{ all -> 0x00c7 }
            if (r0 > 0) goto L_0x0041
            r9 = 0
        L_0x0041:
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            java.lang.String r8 = "context"
            if (r9 == 0) goto L_0x0048
            goto L_0x0088
        L_0x0048:
            android.content.Context r0 = r5.A02     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0080
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r0)     // Catch:{ all -> 0x00c7 }
            r0 = 2131625657(0x7f0e06b9, float:1.8878528E38)
            android.view.View r6 = r6.inflate(r0, r10, r12)     // Catch:{ all -> 0x00c7 }
            X.0qQ.A0C(r6, r1)     // Catch:{ all -> 0x00c7 }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x00c7 }
        L_0x005c:
            boolean r0 = X.AnonymousClass7S3.A00(r7)     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x006e
            r0 = 2131431817(0x7f0b1189, float:1.8485374E38)
            android.view.View r0 = r6.requireViewById(r0)     // Catch:{ all -> 0x00c7 }
            android.view.ViewStub r0 = (android.view.ViewStub) r0     // Catch:{ all -> 0x00c7 }
            r0.inflate()     // Catch:{ all -> 0x00c7 }
        L_0x006e:
            X.4DH r0 = r5.A0u     // Catch:{ all -> 0x00c7 }
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()     // Catch:{ all -> 0x00c7 }
            boolean r0 = r1 instanceof com.instagram.base.activity.IgFragmentActivity     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00b0
            r3 = r1
            com.instagram.base.activity.IgFragmentActivity r3 = (com.instagram.base.activity.IgFragmentActivity) r3     // Catch:{ all -> 0x00c7 }
            goto L_0x00b0
        L_0x007c:
            android.content.Context r0 = r5.A02     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x0094
        L_0x0080:
            X.0qQ.A0F(r8)     // Catch:{ all -> 0x00c7 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x0088:
            boolean r0 = r6.A06     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x007c
            android.content.Context r0 = r5.A02     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0080
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x00c7 }
        L_0x0094:
            r11 = 2131625657(0x7f0e06b9, float:1.8878528E38)
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r0)     // Catch:{ all -> 0x00c7 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x00c7 }
            r0 = -1
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x00c7 }
            r9.<init>(r0, r0)     // Catch:{ all -> 0x00c7 }
            boolean r13 = r6.A05     // Catch:{ all -> 0x00c7 }
            android.view.View r6 = X.2Su.A01(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00c7 }
            X.0qQ.A0C(r6, r1)     // Catch:{ all -> 0x00c7 }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x00c7 }
            goto L_0x005c
        L_0x00b0:
            if (r3 == 0) goto L_0x00b7
            X.3on r0 = r5.A0z     // Catch:{ all -> 0x00c7 }
            r3.registerOnActivityResultListener(r0)     // Catch:{ all -> 0x00c7 }
        L_0x00b7:
            r4.A05()     // Catch:{ all -> 0x00c7 }
            r0 = 1521824074(0x5ab5314a, float:2.55005823E16)
            X.0fh.A00(r0)
            r0 = 1419838618(0x54a1049a, float:5.5325355E12)
            X.AnonymousClass0fD.A09(r0, r2)
            return r6
        L_0x00c7:
            r1 = move-exception
            r0 = -902752985(0xffffffffca311527, float:-2901321.8)
            X.0fh.A00(r0)
            throw r1
        L_0x00cf:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 2110165596(0x7dc6925c, float:3.2993386E37)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273484me.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.06E, java.lang.Object] */
    public final void onDestroy() {
        AnonymousClass7H6 r3;
        06N r1;
        2Er r32;
        Integer num;
        String C6C;
        AnonymousClass7JI r0;
        int A022 = AnonymousClass0fD.A02(-1309604518);
        super.onDestroy();
        AnonymousClass9H7 r4 = this.A00;
        if (r4 != null) {
            0fh.A01("DirectThreadToggleController.onDestroy", 1202134614);
            try {
                UserSession userSession = r4.A10;
                1bT A002 = C2598343g.A00(userSession);
                C2597342w r33 = r4.A1K;
                0qQ.A0B(r33, 0);
                synchronized (A002.A02) {
                    try {
                        A002.A03.remove(r33);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                AnonymousClass4DH r34 = r4.A0u;
                0hq childFragmentManager = r34.getChildFragmentManager();
                childFragmentManager.A0F.remove(r4.A0s);
                r34.getChildFragmentManager().A09 = new Object();
                AnonymousClass7S2 r02 = r4.A1I;
                0h9 r35 = r34.mLifecycleRegistry;
                0qQ.A07(r35);
                for (C331647Ru A07 : r02.A00) {
                    A07.A07(r35);
                }
                C329067Hl r7 = r4.A0R;
                if (r7 != null) {
                    OKT okt = r7.A0p;
                    if (okt != null) {
                        okt.A01.EaQ(false);
                    }
                    OZO ozo = r7.A0s;
                    if (ozo != null) {
                        ozo.A05.Er5(AnonymousClass05K.A00);
                    }
                    DirectStickerSuggestionsController directStickerSuggestionsController = r7.A0K;
                    if (directStickerSuggestionsController != null && !DirectStickerSuggestionsController.A02(directStickerSuggestionsController)) {
                        0sn r36 = 0sn.A00;
                        directStickerSuggestionsController.A0S = new AnonymousClass9JF("", "", r36, r36);
                    }
                    UserSession userSession2 = r7.A1Z;
                    0qQ.A0B(userSession2, 0);
                    0Tu r9 = 0Tu.A05;
                    if (!182.A06(r9, userSession2, 36330836299301665L) && (r0 = r7.A0u) != null) {
                        r0.A0E();
                    }
                    if (r7.A14) {
                        C339737k5 A003 = C339717k3.A00(userSession2);
                        A003.A03 = null;
                        A003.A00 = 0;
                        A003.A01 = null;
                        A003.A02 = null;
                    }
                    C329907Kr r03 = r7.A0Q;
                    if (!(r03 == null || (r32 = r7.A0W) == null || (num = r03.A00) == null || num.intValue() != 11 || !C3269378s.A06(userSession2, r32) || (C6C = r32.C6C()) == null)) {
                        1Av A004 = 1Au.A00(userSession2);
                        String C6C2 = r32.C6C();
                        if (C6C2 == null) {
                            C6C2 = "";
                        }
                        0xa r37 = A004.A01;
                        0xY AR4 = r37.AR4();
                        AR4.E5T(002.A0R(C273654mx.A00(2109), C6C2), true);
                        AR4.apply();
                        if (182.A06(r9, userSession2, 36319407399312774L)) {
                            String A005 = C273654mx.A00(2111);
                            int i = r37.getInt(002.A0R(A005, C6C), 0);
                            if (i < 3) {
                                0xY AR42 = r37.AR4();
                                AR42.E5Z(002.A0R(A005, C6C), i + 1);
                                AR42.apply();
                            }
                        }
                    }
                    FragmentActivity fragmentActivity = (FragmentActivity) 0mE.A00(r7.A1R, FragmentActivity.class);
                    if (!(fragmentActivity == null || (r1 = r7.A09) == null)) {
                        fragmentActivity.getSupportFragmentManager().A0q(r1);
                    }
                }
                r4.A0R = null;
                if (r4.A1H.A1T) {
                    C67542Mpc A006 = C67539MpY.A00(userSession);
                    synchronized (A006) {
                        A006.A02.clear();
                    }
                }
                if (JVU.A00(userSession) && (r3 = r4.A0D) != null) {
                    r4.A0y.unregisterLifecycleListener(r3);
                    AnonymousClass7H6 r04 = r4.A0D;
                    if (r04 == null) {
                        0qQ.A0F("directAggregatedMediaViewerController");
                        th = AnonymousClass00P.createAndThrow();
                        throw th;
                    }
                    r04.onDestroy();
                }
                2B7 r05 = r4.A1N;
                r05.A00 = null;
                r05.A01.A03(2B7.class);
                C305926Kc.A00(r4);
                0LA.A04(AnonymousClass0LO.A9y);
                0fh.A00(2030690203);
                this.A00 = null;
                AnonymousClass0fD.A09(1224072752, A022);
            } catch (Throwable th2) {
                0fh.A00(795495558);
                throw th2;
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
            AnonymousClass0fD.A09(1531204676, A022);
            throw illegalStateException;
        }
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0185: MOVE  (r1v9 com.instagram.base.activity.IgFragmentActivity) = (r1v8 com.instagram.base.activity.IgFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onDestroyView() {
        /*
            r12 = this;
            r0 = 1030193657(0x3d6781f9, float:0.056520436)
            int r3 = X.AnonymousClass0fD.A02(r0)
            super.onDestroyView()
            X.9H7 r4 = r12.A00
            if (r4 == 0) goto L_0x01a3
            java.lang.String r1 = "DirectThreadToggleController.onDestroyView"
            r0 = 2038189842(0x797c4f12, float:8.187891E34)
            X.0fh.A01(r1, r0)
            X.38U r0 = r4.A0P     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x001d
            r0.A01()     // Catch:{ all -> 0x019b }
        L_0x001d:
            r6 = 0
            r4.A0P = r6     // Catch:{ all -> 0x019b }
            android.widget.FrameLayout r0 = r4.A03     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x002f
            android.view.View r1 = r0.getRootView()     // Catch:{ all -> 0x019b }
        L_0x0028:
            boolean r0 = r1 instanceof android.view.ViewGroup     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0038
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ all -> 0x019b }
            goto L_0x0031
        L_0x002f:
            r1 = r6
            goto L_0x0028
        L_0x0031:
            if (r1 == 0) goto L_0x0038
            android.widget.FrameLayout r0 = r4.A03     // Catch:{ all -> 0x019b }
            r1.removeView(r0)     // Catch:{ all -> 0x019b }
        L_0x0038:
            r9 = 0
            X.AnonymousClass9H7.A0B(r4, r9)     // Catch:{ all -> 0x019b }
            r4.A0Z = r6     // Catch:{ all -> 0x019b }
            r4.A0Y = r6     // Catch:{ all -> 0x019b }
            r4.A0N = r6     // Catch:{ all -> 0x019b }
            X.A9F r0 = r4.A08     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0049
            r0.A00()     // Catch:{ all -> 0x019b }
        L_0x0049:
            r4.A08 = r6     // Catch:{ all -> 0x019b }
            X.LF1 r0 = r4.A09     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0052
            r0.A00()     // Catch:{ all -> 0x019b }
        L_0x0052:
            r4.A09 = r6     // Catch:{ all -> 0x019b }
            X.LRE r5 = r4.A0A     // Catch:{ all -> 0x019b }
            if (r5 == 0) goto L_0x007f
            com.instagram.common.session.UserSession r0 = r5.A0E     // Catch:{ all -> 0x019b }
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)     // Catch:{ all -> 0x019b }
            java.lang.Class<X.AY0> r1 = X.AY0.class
            X.1wn r0 = r5.A0D     // Catch:{ all -> 0x019b }
            r2.A02(r0, r1)     // Catch:{ all -> 0x019b }
            androidx.fragment.app.FragmentActivity r2 = r5.A0C     // Catch:{ all -> 0x019b }
            android.content.Context r1 = r5.A03     // Catch:{ all -> 0x019b }
            if (r1 != 0) goto L_0x0075
            java.lang.String r0 = "context"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x019b }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x019b }
            throw r0     // Catch:{ all -> 0x019b }
        L_0x0075:
            r0 = 2130970340(0x7f0406e4, float:1.7549387E38)
            int r0 = X.2Yu.A0F(r1, r0)     // Catch:{ all -> 0x019b }
            X.AnonymousClass2uJ.A04(r2, r0)     // Catch:{ all -> 0x019b }
        L_0x007f:
            r4.A0A = r6     // Catch:{ all -> 0x019b }
            X.A72 r0 = r4.A05     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x008e
            X.AE5 r0 = r0.A03     // Catch:{ all -> 0x019b }
            X.B2v r0 = r0.A07     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x008e
            r0.D9U()     // Catch:{ all -> 0x019b }
        L_0x008e:
            r4.A05 = r6     // Catch:{ all -> 0x019b }
            r4.A0O = r6     // Catch:{ all -> 0x019b }
            r4.A0S = r6     // Catch:{ all -> 0x019b }
            r4.A03 = r6     // Catch:{ all -> 0x019b }
            X.7Hl r5 = r4.A0R     // Catch:{ all -> 0x019b }
            if (r5 == 0) goto L_0x0148
            r2 = 0
            r5.A0O = r2     // Catch:{ all -> 0x019b }
            X.7Ij r0 = r5.A0b     // Catch:{ all -> 0x019b }
            X.7Gr r1 = r5.A20     // Catch:{ all -> 0x019b }
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0S     // Catch:{ all -> 0x019b }
            r0.A02(r1)     // Catch:{ all -> 0x019b }
            X.7Ij r11 = r5.A0b     // Catch:{ all -> 0x019b }
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r10 = r11.A0S     // Catch:{ all -> 0x019b }
            r10.setOnFocusChangeListener(r2)     // Catch:{ all -> 0x019b }
            r11.A03()     // Catch:{ all -> 0x019b }
            android.database.DataSetObserver r1 = r11.A03     // Catch:{ all -> 0x019b }
            android.widget.Adapter r0 = r11.A04     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x00bb
            if (r1 == 0) goto L_0x00bb
            r0.unregisterDataSetObserver(r1)     // Catch:{ all -> 0x019b }
        L_0x00bb:
            X.7Gq r0 = r11.A09     // Catch:{ all -> 0x019b }
            r10.A02(r0)     // Catch:{ all -> 0x019b }
            com.instagram.common.session.UserSession r7 = r11.A0K     // Catch:{ all -> 0x019b }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x019b }
            r0 = 36318058774861651(0x81071500351753, double:3.031024838082513E-306)
            boolean r0 = X.182.A06(r8, r7, r0)     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x00dd
            X.7Qp r1 = r11.A0A     // Catch:{ all -> 0x019b }
            if (r1 == 0) goto L_0x00d8
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r11.A0R     // Catch:{ all -> 0x019b }
            r0.removeTextChangedListener(r1)     // Catch:{ all -> 0x019b }
        L_0x00d8:
            android.text.TextWatcher r0 = r11.A0H     // Catch:{ all -> 0x019b }
            r10.removeTextChangedListener(r0)     // Catch:{ all -> 0x019b }
        L_0x00dd:
            r10.A00 = r2     // Catch:{ all -> 0x019b }
            X.7Ij r0 = r5.A0b     // Catch:{ all -> 0x019b }
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0R     // Catch:{ all -> 0x019b }
            r0.setInputContentInfoListener(r2, r2)     // Catch:{ all -> 0x019b }
            X.3E6 r1 = r5.A1b     // Catch:{ all -> 0x019b }
            X.3ok r0 = r5.A1a     // Catch:{ all -> 0x019b }
            r1.EEH(r0)     // Catch:{ all -> 0x019b }
            X.7Kl r0 = r5.A0t     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x00fa
            X.OVJ r0 = r0.A05     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x00fa
            X.1a8 r0 = r0.A01     // Catch:{ all -> 0x019b }
            r0.A01()     // Catch:{ all -> 0x019b }
        L_0x00fa:
            com.instagram.common.session.UserSession r7 = r5.A1Z     // Catch:{ all -> 0x019b }
            X.0qQ.A0B(r7, r9)     // Catch:{ all -> 0x019b }
            r0 = 36330836299301665(0x8112b400034321, double:3.039105395989339E-306)
            boolean r0 = X.182.A06(r8, r7, r0)     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0111
            X.7JI r0 = r5.A0u     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0111
            r0.A0E()     // Catch:{ all -> 0x019b }
        L_0x0111:
            r5.A0P = r2     // Catch:{ all -> 0x019b }
            r5.A0t = r2     // Catch:{ all -> 0x019b }
            X.1a8 r0 = r5.A1Y     // Catch:{ all -> 0x019b }
            r0.A01()     // Catch:{ all -> 0x019b }
            X.1wn r0 = r5.A0F     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0129
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r7)     // Catch:{ all -> 0x019b }
            java.lang.Class<X.AY0> r1 = X.AY0.class
            X.1wn r0 = r5.A0F     // Catch:{ all -> 0x019b }
            r2.A02(r0, r1)     // Catch:{ all -> 0x019b }
        L_0x0129:
            X.1wn r2 = r5.A0E     // Catch:{ all -> 0x019b }
            if (r2 == 0) goto L_0x0136
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r7)     // Catch:{ all -> 0x019b }
            java.lang.Class<X.Osi> r0 = X.C71900Osi.class
            r1.A02(r2, r0)     // Catch:{ all -> 0x019b }
        L_0x0136:
            X.1wn r0 = r5.A0B     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0145
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r7)     // Catch:{ all -> 0x019b }
            java.lang.Class<X.AY4> r1 = X.AY4.class
            X.1wn r0 = r5.A0B     // Catch:{ all -> 0x019b }
            r2.A02(r0, r1)     // Catch:{ all -> 0x019b }
        L_0x0145:
            X.C329067Hl.A0a(r5)     // Catch:{ all -> 0x019b }
        L_0x0148:
            r4.A0U = r6     // Catch:{ all -> 0x019b }
            r4.A07 = r6     // Catch:{ all -> 0x019b }
            X.9HB r0 = r4.A1T     // Catch:{ all -> 0x019b }
            r0.A01()     // Catch:{ all -> 0x019b }
            X.3E6 r1 = r4.A06     // Catch:{ all -> 0x019b }
            if (r1 == 0) goto L_0x015a
            X.3ok r0 = r4.A12     // Catch:{ all -> 0x019b }
            r1.EEH(r0)     // Catch:{ all -> 0x019b }
        L_0x015a:
            com.instagram.common.session.UserSession r0 = r4.A10     // Catch:{ all -> 0x019b }
            boolean r0 = X.JVU.A00(r0)     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x016b
            X.7H6 r1 = r4.A0D     // Catch:{ all -> 0x019b }
            if (r1 == 0) goto L_0x016b
            X.4DJ r0 = r4.A0y     // Catch:{ all -> 0x019b }
            r0.unregisterLifecycleListener(r1)     // Catch:{ all -> 0x019b }
        L_0x016b:
            X.1Ng r2 = r4.A0v     // Catch:{ all -> 0x019b }
            java.lang.Class<X.7Pj> r1 = X.C331067Pj.class
            X.1wn r0 = r4.A0x     // Catch:{ all -> 0x019b }
            r2.A02(r0, r1)     // Catch:{ all -> 0x019b }
            java.lang.Class<X.7Ks> r1 = X.C329917Ks.class
            X.1wn r0 = r4.A0w     // Catch:{ all -> 0x019b }
            r2.A02(r0, r1)     // Catch:{ all -> 0x019b }
            X.4DH r0 = r4.A0u     // Catch:{ all -> 0x019b }
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()     // Catch:{ all -> 0x019b }
            boolean r0 = r1 instanceof com.instagram.base.activity.IgFragmentActivity     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x018e
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1     // Catch:{ all -> 0x019b }
            if (r1 == 0) goto L_0x018e
            X.3on r0 = r4.A0z     // Catch:{ all -> 0x019b }
            r1.unregisterOnActivityResultListener(r0)     // Catch:{ all -> 0x019b }
        L_0x018e:
            r0 = 2112529273(0x7deaa379, float:3.8986019E37)
            X.0fh.A00(r0)
            r0 = -1902163653(0xffffffff8e9f493b, float:-3.9267045E-30)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x019b:
            r1 = move-exception
            r0 = 1317681875(0x4e8a3ad3, float:1.15955546E9)
            X.0fh.A00(r0)
            throw r1
        L_0x01a3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -620647596(0xffffffffdb01ab54, float:-3.6498649E16)
            X.AnonymousClass0fD.A09(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273484me.onDestroyView():void");
    }

    /* JADX INFO: finally extract failed */
    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1812148158);
        C273484me.super.onPause();
        AnonymousClass9H7 r2 = this.A00;
        if (r2 != null) {
            0fh.A01("DirectThreadToggleController.onPause", -706899908);
            try {
                AnonymousClass38U r0 = r2.A0P;
                if (r0 != null) {
                    r0.A01();
                }
                AnonymousClass9H7.A06(r2).A19();
                AnonymousClass9H7.A0D(r2, false);
                AnonymousClass3E6 r02 = r2.A06;
                if (r02 != null) {
                    r02.onStop();
                }
                r2.A0l = false;
                r2.A0I = null;
                0fh.A00(751270583);
                AnonymousClass0fD.A09(-1030472613, A022);
            } catch (Throwable th) {
                0fh.A00(-1667314239);
                throw th;
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
            AnonymousClass0fD.A09(-451968309, A022);
            throw illegalStateException;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onResume() {
        2dZ r1;
        int A022 = AnonymousClass0fD.A02(833653553);
        super.onResume();
        AnonymousClass9H7 r6 = this.A00;
        if (r6 != null) {
            0fh.A01("DirectThreadToggleController.onResume", 973709640);
            try {
                if (!((C328807Gh) r6.A1Z.getValue()).A09) {
                    if (182.A06(0Tu.A05, r6.A10, 36324677317439727L) && (r1 = r6.A04) != null) {
                        AnonymousClass4DS r2 = r6.A0t;
                        0qQ.A0B(r2, 0);
                        r1.A0W.put(r2, (Object) null);
                    }
                    2dZ r12 = r6.A04;
                    if (r12 != null) {
                        r12.A0X(r6.A0t);
                    }
                }
                r6.A1J.A05.A08((String) null);
                AnonymousClass9H7.A06(r6).A1A();
                UserSession userSession = r6.A10;
                AnonymousClass3K7.A00(userSession).A00(r6.A1Q);
                AnonymousClass3E6 r13 = r6.A06;
                if (r13 != null) {
                    r13.DmJ(r6.A0u.requireActivity());
                }
                r6.A0l = true;
                AnonymousClass38U r0 = r6.A0P;
                if (r0 != null) {
                    r0.A02();
                }
                AnonymousClass9H7.A0A(r6);
                AnonymousClass9H7.A09(r6);
                String str = r6.A0e;
                if (str != null) {
                    C394279xp.A00(userSession).A02(str);
                    r6.A0e = null;
                }
                0fh.A00(-2146290546);
                AnonymousClass0fD.A09(-1259060686, A022);
            } catch (Throwable th) {
                0fh.A00(1063804840);
                throw th;
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
            AnonymousClass0fD.A09(-1510456451, A022);
            throw illegalStateException;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-272883288);
        C273484me.super.onStart();
        AnonymousClass9H7 r3 = this.A00;
        if (r3 != null) {
            0fh.A01("DirectThreadToggleController.onStart", 1625673167);
            try {
                if (r3.A01 > 0) {
                    C638918c.A01(C61170le.A00).A0S(r3.A1M);
                    View view = r3.A0u.mView;
                    if (view != null) {
                        view.post(new C40874Aki(r3));
                    }
                }
                Window window = AnonymousClass9H7.A00(r3).getWindow();
                if (window != null) {
                    window.setSoftInputMode(48);
                    0fh.A00(1579814788);
                    AnonymousClass0fD.A09(-816523804, A022);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Throwable th) {
                0fh.A00(-1932500443);
                throw th;
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
            AnonymousClass0fD.A09(-1799205538, A022);
            throw illegalStateException;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1943184973);
        C273484me.super.onStop();
        AnonymousClass9H7 r2 = this.A00;
        if (r2 != null) {
            0fh.A01("DirectThreadToggleController.onStop", 56165399);
            r2.A01++;
            AnonymousClass9H7.A0C(r2, true);
            try {
                Window window = AnonymousClass9H7.A00(r2).getWindow();
                if (window != null) {
                    window.setSoftInputMode(48);
                    0fh.A00(-1158606905);
                    AnonymousClass0fD.A09(-352702058, A022);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Throwable th) {
                0fh.A00(-1173626127);
                throw th;
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
            AnonymousClass0fD.A09(1095243848, A022);
            throw illegalStateException;
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1325369390);
        super.onViewStateRestored(bundle);
        AnonymousClass9H7 r0 = this.A00;
        if (r0 != null) {
            AnonymousClass9H7.A06(r0).A1C();
            AnonymousClass0fD.A09(1978853213, A022);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        AnonymousClass0fD.A09(-1250697934, A022);
        throw illegalStateException;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
