package X;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.2nI  reason: invalid class name and case insensitive filesystem */
public final class C229382nI implements C229392nJ {
    public boolean A00;
    public final SparseArray A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final AnonymousClass0iw A04;
    public final C229702nt A05;
    public final 0lg A06;
    public final AnonymousClass4D6 A07;
    public final SparseArray A08;
    public final 0hq A09;
    public final 2el A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C229382nI(android.util.SparseArray r12, androidx.fragment.app.Fragment r13, X.C229162mw r14, X.AnonymousClass0iw r15, X.0lg r16, X.2el r17) {
        /*
            r11 = this;
            r3 = r13
            androidx.fragment.app.FragmentActivity r4 = r13.requireActivity()
            X.0Tu r2 = X.0Tu.A05
            r0 = 18297539933700933(0x41018400030345, double:1.8919714473026774E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 == 0) goto L_0x0037
            androidx.fragment.app.FragmentActivity r1 = r13.requireActivity()
            boolean r0 = r1 instanceof X.AnonymousClass2ZY
            if (r0 == 0) goto L_0x0032
            r0 = r1
            X.2ZY r0 = (X.AnonymousClass2ZY) r0
            X.0hq r5 = r0.AuV()
            if (r5 == 0) goto L_0x0032
        L_0x0023:
            r9 = r3
            X.4D6 r9 = (X.AnonymousClass4D6) r9
            r1 = r11
            r2 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0032:
            X.0hq r5 = r1.getSupportFragmentManager()
            goto L_0x0023
        L_0x0037:
            X.0hq r5 = r13.getParentFragmentManager()
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229382nI.<init>(android.util.SparseArray, androidx.fragment.app.Fragment, X.2mw, X.0iw, X.0lg, X.2el):void");
    }

    public static C229382nI A00(SparseArray sparseArray, Fragment fragment, AnonymousClass0iw r6, 0lg r7, 2el r8) {
        return new C229382nI(sparseArray, fragment, (C229162mw) null, r6, r7, r8);
    }

    public static C229382nI A01(SparseArray sparseArray, FragmentActivity fragmentActivity, AnonymousClass0iw r9, 0lg r10) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        return new C229382nI(sparseArray, (Fragment) null, fragmentActivity2, fragmentActivity.getSupportFragmentManager(), (C229162mw) null, r9, r10, new C228602lw(fragmentActivity2, AnonymousClass07i.A00(fragmentActivity)), (2el) null);
    }

    public static C229382nI A02(Fragment fragment, AnonymousClass0iw r4, 0lg r5, 2el r6) {
        return new C229382nI((SparseArray) null, fragment, (C229162mw) null, r4, r5, r6);
    }

    public static C229382nI A03(Fragment fragment, 0lg r5, 2el r6) {
        Fragment fragment2 = fragment;
        return new C229382nI((SparseArray) null, fragment2, (C229162mw) null, (AnonymousClass0iw) fragment2, r5, r6);
    }

    public static C229382nI A04(FragmentActivity fragmentActivity, AnonymousClass0iw r2, 0lg r3) {
        return A01((SparseArray) null, fragmentActivity, r2, r3);
    }

    public final void A05(C252243on r2) {
        AnonymousClass4DJ r0 = this.A02;
        r0.getClass();
        r0.registerLifecycleListener(r2);
    }

    public final void A06(C252243on r2) {
        AnonymousClass4DJ r0 = this.A02;
        r0.getClass();
        r0.unregisterLifecycleListener(r2);
    }

    public final SparseArray AMV() {
        SparseArray sparseArray = new SparseArray();
        0lg r2 = this.A06;
        AnonymousClass6RB A002 = C307516Qk.A00(C307496Qi.A00(r2));
        sparseArray.put(R.id.bk_context_key_async_component_store, A002);
        sparseArray.put(R.id.bk_context_key_legacy_data_modules, new C307686Rb(this, (AnonymousClass6RW) r2.A01(AnonymousClass6RW.class, new MMG(r2, 5))));
        sparseArray.put(R.id.bk_context_key_data_modules, new C307726Rf((AnonymousClass6RR) r2.A01(AnonymousClass6RR.class, new AnonymousClass6RS(r2)), this, A002));
        sparseArray.put(R.id.bloks_viewpoint_manager, this.A0A);
        Fragment fragment = this.A02;
        sparseArray.put(R.id.bloks_ig_fragment, fragment);
        sparseArray.put(R.id.bloks_ig_session, r2);
        sparseArray.put(R.id.bloks_ig_fragment_activity, this.A03);
        sparseArray.put(R.id.bloks_reel_tray_session_id, UUID.randomUUID().toString());
        sparseArray.put(R.id.bloks_ig_analytics_module, this.A04);
        sparseArray.put(R.id.bloks_ig_precompile_async_actions, false);
        sparseArray.put(R.id.bk_context_key_bloks_config, this.A05);
        sparseArray.put(R.id.bloks_ig_scheduler, this.A07);
        sparseArray.put(R.id.bloks_ig_fragment_manager, this.A09);
        sparseArray.put(R.id.bloks_ig_object_store_deprecated, this.A01);
        if (!(fragment == null || fragment.getContext() == null)) {
            sparseArray.put(R.id.bloks_ig_scrollable_navigation_helper, new C307756Ri(fragment.getContext()));
        }
        sparseArray.put(R.id.bloks_ig_use_prelogin_json_parser, Boolean.valueOf(this.A00));
        sparseArray.put(R.id.bk_context_key_performance_logger, C307546Qn.A01);
        SparseArray sparseArray2 = this.A08;
        if (sparseArray2 != null) {
            for (int i = 0; i < sparseArray2.size(); i++) {
                if (sparseArray.indexOfKey(sparseArray2.keyAt(i)) < 0) {
                    sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
                }
            }
        }
        return sparseArray;
    }

    public final C229702nt AgE() {
        return this.A05;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.2np, java.lang.Object] */
    public C229382nI(SparseArray sparseArray, Fragment fragment, FragmentActivity fragmentActivity, 0hq r11, C229162mw r12, AnonymousClass0iw r13, 0lg r14, AnonymousClass4D6 r15, 2el r16) {
        C229402nK r4;
        this.A00 = false;
        this.A01 = new SparseArray(0);
        this.A06 = r14;
        this.A03 = fragmentActivity;
        this.A09 = r11;
        this.A0A = r16;
        this.A02 = fragment;
        this.A07 = r15;
        this.A04 = r13;
        this.A08 = sparseArray;
        if (r14 instanceof UserSession) {
            r4 = new C229402nK(fragmentActivity, r13, (UserSession) r14, 23607787);
        } else {
            r4 = null;
        }
        C229612nk r6 = new C229612nk(fragmentActivity, 02m.A0p);
        C229652no r5 = C229652no.A00;
        1Sw.A00();
        this.A05 = new C229692ns(new Object(), r12, new C229672nq(r14), r4, r5, r6);
    }
}
