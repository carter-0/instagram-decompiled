package com.instagram.realtimeclient.regionhint;

import X.02o;
import X.0Yk;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass0eL;
import X.AnonymousClass0r6;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.C262224Cq;
import X.C60340gF;
import X.C61910qF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.realtimeclient.regionhint.RegionHintController$fetchRegionHintAndPersist$1", f = "RegionHintController.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
public final class RegionHintController$fetchRegionHintAndPersist$1 extends AnonymousClass1Ek implements 0sL {
    public int label;
    public final /* synthetic */ RegionHintController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegionHintController$fetchRegionHintAndPersist$1(RegionHintController regionHintController, AnonymousClass4D7 r3) {
        super(2, r3);
        this.this$0 = regionHintController;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.realtimeclient.regionhint.RegionHintController$fetchRegionHintAndPersist$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new RegionHintController$fetchRegionHintAndPersist$1(this.this$0, r4);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return new RegionHintController$fetchRegionHintAndPersist$1(this.this$0, r4).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.4D7, com.instagram.realtimeclient.regionhint.RegionHintController$fetchRegionHintAndPersist$1] */
    public final Object invokeSuspend(Object obj) {
        1Hj r4 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            AnonymousClass0r6 access$regionHintFlow = RegionHintController.access$regionHintFlow(this.this$0);
            final RegionHintController regionHintController = this.this$0;
            AnonymousClass1 r0 = new Object() {
                public final AnonymousClass0eL getFunctionDelegate() {
                    return new 0Yk(2, regionHintController, RegionHintControllerKt.TAG, "handleRegionHint", "handleRegionHint(Ljava/lang/String;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r3) {
                    RegionHintController.access$handleRegionHint(regionHintController, (String) obj);
                    return C60340gF.A00;
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof 02o) || !(obj instanceof C61910qF)) {
                        return false;
                    }
                    return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
                }

                public final Object emit(String str, AnonymousClass4D7 r3) {
                    RegionHintController.access$handleRegionHint(regionHintController, str);
                    return C60340gF.A00;
                }
            };
            this.label = 1;
            if (access$regionHintFlow.collect(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C60340gF.A00;
    }
}
