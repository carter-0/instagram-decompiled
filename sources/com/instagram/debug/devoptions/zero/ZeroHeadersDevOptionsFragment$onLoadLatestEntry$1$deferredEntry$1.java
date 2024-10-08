package com.instagram.debug.devoptions.zero;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.AnonymousClass00P;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C56378HxX;
import X.C60340gF;
import X.OYZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ String[] $usages;
    public final /* synthetic */ int $which;
    public int label;
    public final /* synthetic */ ZeroHeadersDevOptionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1(ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment, String[] strArr, int i, AnonymousClass4D7 r5) {
        super(2, r5);
        this.this$0 = zeroHeadersDevOptionsFragment;
        this.$usages = strArr;
        this.$which = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        return new ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1(this.this$0, this.$usages, this.$which, r6);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return ((ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.4D7, com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1] */
    public final Object invokeSuspend(Object obj) {
        1Hj r4 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            OYZ oyz = this.this$0.storage;
            if (oyz == null) {
                0qQ.A0F("storage");
                throw AnonymousClass00P.createAndThrow();
            }
            String str = this.$usages[this.$which];
            this.label = 1;
            obj = C56378HxX.A00(oyz, str, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return obj;
    }
}
