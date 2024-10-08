package com.instagram.creation.capture.quickcapture.assethub.viewmodel;

import X.05D;
import X.0V2;
import X.0qQ;
import X.10D;
import X.2Nn;
import X.AnonymousClass05K;
import X.C317876nz;
import X.C361478gI;
import X.C61770pa;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

public final class ClipsAssetHubViewModel extends C361478gI {
    public static File A0B;
    public Drawable A00;
    public C317876nz A01;
    public boolean A02;
    public final Context A03;
    public final 0V2 A04;
    public final 0V2 A05;
    public final 0V2 A06;
    public final C61770pa A07;
    public final C61770pa A08;
    public final C61770pa A09;
    public final 2Nn A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsAssetHubViewModel(Application application, 2Nn r5) {
        super(application);
        0qQ.A0B(r5, 2);
        this.A0A = r5;
        Application application2 = this.A00;
        0qQ.A0C(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        this.A03 = application2.getApplicationContext();
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A05 = A012;
        this.A08 = A012;
        05D A013 = 10D.A01(num, 0, 0);
        this.A04 = A013;
        this.A07 = A013;
        05D A014 = 10D.A01(num, 0, 0);
        this.A06 = A014;
        this.A09 = A014;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 38
            boolean r0 = X.C66128MDg.A01(r3, r11)
            if (r0 == 0) goto L_0x0067
            r8 = r11
            X.MDg r8 = (X.C66128MDg) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r8.A02
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r9 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 != r9) goto L_0x006d
            java.lang.Object r5 = r8.A01
            X.0eS.A00(r1)
        L_0x0026:
            return r5
        L_0x0027:
            X.0eS.A00(r1)
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 1335631354(0x4f9c1dfa, float:5.2384205E9)
            r0 = 2
            X.0nV r6 = r2.AOJ(r1, r0)
            X.2Nn r0 = r10.A0A
            java.io.File r1 = r0.C4W()
            java.lang.String r0 = "clips_asset_hub_placeholder_photo.jpg"
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0054
            long r3 = r5.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            A0B = r5
            return r5
        L_0x0054:
            r2 = 0
            r1 = 15
            X.MGa r0 = new X.MGa
            r0.<init>(r5, r10, r2, r1)
            r8.A01 = r5
            r8.A00 = r9
            java.lang.Object r0 = X.1Eo.A00(r8, r6, r0)
            if (r0 != r7) goto L_0x0026
            return r7
        L_0x0067:
            X.MDg r8 = new X.MDg
            r8.<init>(r10, r11, r3)
            goto L_0x0016
        L_0x006d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel.A00(com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel, X.4D7):java.lang.Object");
    }
}
