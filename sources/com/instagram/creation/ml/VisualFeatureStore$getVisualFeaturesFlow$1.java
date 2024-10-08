package com.instagram.creation.ml;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.ml.VisualFeatureStore$getVisualFeaturesFlow$1", f = "VisualFeatureStore.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
public final class VisualFeatureStore$getVisualFeaturesFlow$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ VisualFeatureStore A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VisualFeatureStore$getVisualFeaturesFlow$1(VisualFeatureStore visualFeatureStore, Long l, String str, AnonymousClass4D7 r5, boolean z, boolean z2) {
        super(2, r5);
        this.A01 = visualFeatureStore;
        this.A03 = str;
        this.A05 = z;
        this.A02 = l;
        this.A04 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.ml.VisualFeatureStore$getVisualFeaturesFlow$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        return new VisualFeatureStore$getVisualFeaturesFlow$1(this.A01, this.A02, this.A03, r9, this.A05, this.A04);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1Hj r2 = X.1Hj.A02
            r6 = r9
            int r1 = r9.A00
            r0 = 1
            if (r1 == 0) goto L_0x000e
            X.0eS.A00(r10)
        L_0x000b:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x000e:
            X.0eS.A00(r10)
            com.instagram.creation.ml.VisualFeatureStore r3 = r9.A01
            java.lang.String r5 = r9.A03
            boolean r7 = r9.A05
            java.lang.Long r4 = r9.A02
            boolean r8 = r9.A04
            r9.A00 = r0
            java.lang.Object r0 = r3.A03(r4, r5, r6, r7, r8)
            if (r0 != r2) goto L_0x000b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.ml.VisualFeatureStore$getVisualFeaturesFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VisualFeatureStore$getVisualFeaturesFlow$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
