package com.instagram.creation.capture.quickcapture.thirdpartymedia;

import X.07U;
import X.AnonymousClass07Z;
import X.AnonymousClass07a;
import X.AnonymousClass3AS;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C252243on;
import X.C60306Jj5;
import X.C60393Jkm;
import X.C60468Jm0;
import X.C63612L0a;
import X.DbT;
import X.DbV;
import X.MHJ;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class GiphyClipsBrowserCategoriesViewController implements C252243on {
    public C60393Jkm A00;
    public ValueAnimator A01;
    public Integer A02;
    public final C60306Jj5 A03;
    public final AnonymousClass4DH A04;
    public RecyclerView categoryRecyclerView;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final void onDestroy() {
        this.categoryRecyclerView = null;
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r1 != true) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r0.getVisibility() != 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(int r8, boolean r9) {
        /*
            r7 = this;
            java.lang.Integer r0 = r7.A02
            if (r0 == 0) goto L_0x000b
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x000b
            return
        L_0x000b:
            androidx.recyclerview.widget.RecyclerView r0 = r7.categoryRecyclerView
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getVisibility()
            r4 = 1
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            boolean r3 = X.AnonymousClass7TF.A1Q(r8)
            android.animation.ValueAnimator r0 = r7.A01
            if (r0 == 0) goto L_0x0028
            boolean r1 = r0.isRunning()
            r0 = 1
            if (r1 == r5) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0063
            if (r9 == 0) goto L_0x0063
            androidx.recyclerview.widget.RecyclerView r0 = r7.categoryRecyclerView
            if (r0 == 0) goto L_0x0036
            r0.setVisibility(r6)
        L_0x0036:
            float[] r1 = X.C51965G9l.A1b()
            r0 = 0
            if (r4 == 0) goto L_0x003f
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x003f:
            r1[r6] = r0
            if (r3 != 0) goto L_0x0044
            r2 = 0
        L_0x0044:
            r1[r5] = r2
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r1)
            X.LTo r0 = new X.LTo
            r0.<init>(r5, r7, r3)
            r2.addUpdateListener(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r7.A01 = r2
            r2.start()
        L_0x005c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r7.A02 = r0
            return
        L_0x0063:
            android.animation.ValueAnimator r0 = r7.A01
            if (r0 == 0) goto L_0x006a
            r0.cancel()
        L_0x006a:
            androidx.recyclerview.widget.RecyclerView r1 = r7.categoryRecyclerView
            if (r1 == 0) goto L_0x0076
            r0 = 0
            if (r3 == 0) goto L_0x0073
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0073:
            r1.setAlpha(r0)
        L_0x0076:
            androidx.recyclerview.widget.RecyclerView r0 = r7.categoryRecyclerView
            if (r0 == 0) goto L_0x0080
            if (r3 != 0) goto L_0x007d
            r2 = 0
        L_0x007d:
            r0.setScaleY(r2)
        L_0x0080:
            androidx.recyclerview.widget.RecyclerView r0 = r7.categoryRecyclerView
            if (r0 == 0) goto L_0x005c
            r0.setVisibility(r8)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserCategoriesViewController.A00(int, boolean):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (view != null) {
            Context A0S = AnonymousClass7TE.A0S(view);
            C60393Jkm jkm = new C60393Jkm(A0S);
            this.A00 = jkm;
            jkm.A00 = new C63612L0a(this);
            RecyclerView A0I = DbT.A0I(view, R.id.giphy_clips_tabs_recyclerview);
            this.categoryRecyclerView = A0I;
            if (A0I != null) {
                DbV.A1A(A0S, A0I);
            }
            RecyclerView recyclerView = this.categoryRecyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.A00);
            }
            RecyclerView recyclerView2 = this.categoryRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.A11(new C60468Jm0(0, this, view));
            }
            RecyclerView recyclerView3 = this.categoryRecyclerView;
            if (recyclerView3 != null) {
                recyclerView3.setItemAnimator((AnonymousClass3AS) null);
            }
            AnonymousClass4DH r0 = this.A04;
            07U r3 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 33), AnonymousClass07a.A00(viewLifecycleOwner));
        }
    }

    public GiphyClipsBrowserCategoriesViewController(AnonymousClass4DH r1, C60306Jj5 jj5) {
        this.A04 = r1;
        this.A03 = jj5;
    }
}
