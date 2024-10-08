package com.instagram.creation.ml;

import X.0eS;
import X.0sL;
import X.0sr;
import X.A9Y;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass9Z9;
import X.AnonymousClass9ZA;
import X.C21288XSt;
import X.C3501183i;
import X.C41681AyY;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.ml.VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2", f = "VisualFeatureStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VisualFeatureStore A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2(VisualFeatureStore visualFeatureStore, String str, AnonymousClass4D7 r4, long j) {
        super(2, r4);
        this.A01 = visualFeatureStore;
        this.A02 = str;
        this.A00 = j;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.ml.VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2(this.A01, this.A02, r8, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        VisualFeatureStore visualFeatureStore = this.A01;
        C3501183i r5 = visualFeatureStore.A00;
        if (!(r5 == null && (r5 = VisualFeatureStore.A01(visualFeatureStore)) == null)) {
            String str = this.A02;
            VisualFeatureStore.A02(r5.A03(new A9Y(AnonymousClass7TE.A1I("CONCEPT_SCORES")), 0sr.A1P(new C21288XSt[]{new AnonymousClass9ZA(str), new AnonymousClass9Z9(this.A00)}), C41681AyY.A00), visualFeatureStore, str);
        }
        return C60340gF.A00;
    }
}
