package com.instagram.debug.devoptions.sandboxselector;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C268654dm;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.DevServerApi$checkServerConnectionHealth$3", f = "DevServerApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DevServerApi$checkServerConnectionHealth$3 extends AnonymousClass1Ek implements 0sL {
    public int label;

    public DevServerApi$checkServerConnectionHealth$3(AnonymousClass4D7 r2) {
        super(2, r2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.sandboxselector.DevServerApi$checkServerConnectionHealth$3] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r3) {
        return new DevServerApi$checkServerConnectionHealth$3(r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 r3 = (AnonymousClass4D7) obj2;
        if (r3 != null) {
            r3.getContext();
        }
        C60340gF r0 = C60340gF.A00;
        0eS.A00(r0);
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            0eS.A00(obj);
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0x();
    }

    public final Object invoke(C268654dm r2, AnonymousClass4D7 r3) {
        if (r3 != null) {
            r3.getContext();
        }
        C60340gF r0 = C60340gF.A00;
        0eS.A00(r0);
        return r0;
    }
}
