package com.instagram.nme.contextualpromo;

import X.0qQ;
import X.1Eo;
import X.28K;
import X.AnonymousClass05K;
import X.AnonymousClass07a;
import X.AnonymousClass0xx;
import X.AnonymousClass12T;
import X.AnonymousClass2sT;
import X.AnonymousClass3Q2;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DU;
import X.AnonymousClass9K1;
import X.C252243on;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ClipsUploadPromoHelper implements C252243on, AnonymousClass2sT {
    public AnonymousClass3Q2 A00;
    public final UserSession A01;
    public final Set A02 = new HashSet();
    public final AnonymousClass4DH A03;
    public final AnonymousClass4DU A04;
    public final PendingMediaStore A05;

    public ClipsUploadPromoHelper(AnonymousClass4DH r2, UserSession userSession, AnonymousClass4DU r4) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = r2;
        this.A04 = r4;
        this.A05 = 28K.A00(userSession);
    }

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

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.nme.contextualpromo.ClipsUploadPromoHelper r11, X.AnonymousClass3Q2 r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r3 = 16
            boolean r0 = X.C376739Jd.A00(r3, r14)
            if (r0 == 0) goto L_0x0075
            r10 = r14
            X.9Jd r10 = (X.C376739Jd) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r10.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r10.A00
            r3 = 1
            if (r0 == 0) goto L_0x004c
            if (r0 != r3) goto L_0x007b
            java.lang.Object r2 = r10.A03
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r11 = r10.A01
            com.instagram.nme.contextualpromo.ClipsUploadPromoHelper r11 = (com.instagram.nme.contextualpromo.ClipsUploadPromoHelper) r11
            X.0eS.A00(r5)
        L_0x002c:
            X.FGY r5 = (X.FGY) r5
            X.4Cc r0 = r10.getContext()
            boolean r0 = X.AnonymousClass5H8.A03(r0)
            if (r0 == 0) goto L_0x0049
            if (r5 == 0) goto L_0x0049
            X.4DH r0 = r11.A03
            r0.requireContext()
            com.instagram.common.session.UserSession r1 = r11.A01
            X.4DU r0 = r11.A04
            X.C243473Yx.A08(r1, r0)
            r5.A06(r2)
        L_0x0049:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x004c:
            X.0eS.A00(r5)
            X.4DH r0 = r11.A03
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r11.A01
            X.0xx r0 = X.AnonymousClass07a.A00(r2)
            com.instagram.nme.contextualpromo.ContextualPromoHelper r5 = new com.instagram.nme.contextualpromo.ContextualPromoHelper
            r5.<init>(r1, r0)
            X.Kiz r6 = X.C62628Kiz.BOTTOMSHEET
            r8 = 0
            r10.A01 = r11
            r10.A02 = r12
            r10.A03 = r2
            r10.A00 = r3
            java.lang.String r7 = "IG_REELS_POST_PUBLISHING"
            r9 = r13
            java.lang.Object r5 = r5.A00(r6, r7, r8, r9, r10)
            if (r5 != r4) goto L_0x002c
            return r4
        L_0x0075:
            X.9Jd r10 = new X.9Jd
            r10.<init>(r11, r14, r3)
            goto L_0x0016
        L_0x007b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ClipsUploadPromoHelper.A00(com.instagram.nme.contextualpromo.ClipsUploadPromoHelper, X.3Q2, java.lang.String, X.4D7):java.lang.Object");
    }

    public final void DaJ(AnonymousClass3Q2 r6) {
        AnonymousClass0xx A002 = AnonymousClass07a.A00(this.A03.getViewLifecycleOwner());
        1Eo.A03(AnonymousClass05K.A00, AnonymousClass12T.A00.A04, new AnonymousClass9K1(this, (AnonymousClass4D7) null, 16), A002);
    }

    public final void onPause() {
        AnonymousClass3Q2 r0 = this.A00;
        if (r0 != null) {
            r0.A0Z(this);
            this.A00 = null;
        }
    }

    public final void onResume() {
        List A08 = this.A05.A08();
        if (!A08.isEmpty()) {
            AnonymousClass3Q2 r0 = (AnonymousClass3Q2) A08.get(A08.size() - 1);
            this.A00 = r0;
            if (r0 != null) {
                r0.A0Y(this);
            }
        }
    }
}
