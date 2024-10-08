package androidx.paging;

import X.0eS;
import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C63752L5k;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class MulticastedPagingData$asPagingData$2 extends AnonymousClass1Ek implements 0sK {
    public final /* synthetic */ C63752L5k A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MulticastedPagingData$asPagingData$2(C63752L5k l5k) {
        super(3, (AnonymousClass4D7) null);
        this.A00 = l5k;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass4D7 r4 = (AnonymousClass4D7) obj3;
        if (r4 != null) {
            r4.getContext();
        }
        C60340gF r0 = C60340gF.A00;
        0eS.A00(r0);
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        return C60340gF.A00;
    }
}
