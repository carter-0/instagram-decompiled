package com.instagram.creation.capture.quickcapture.save;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C62320sa;
import X.C65040LmJ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.save.CachingVideoSaver$renderInternal$2", f = "CachingVideoSaver.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
public final class CachingVideoSaver$renderInternal$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CachingVideoSaver A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachingVideoSaver$renderInternal$2(CachingVideoSaver cachingVideoSaver, String str, AnonymousClass4D7 r4, C62320sa r5, int i) {
        super(2, r4);
        this.A02 = cachingVideoSaver;
        this.A04 = r5;
        this.A03 = str;
        this.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.quickcapture.save.CachingVideoSaver$renderInternal$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new CachingVideoSaver$renderInternal$2(this.A02, this.A03, r8, this.A04, this.A01);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.creation.capture.quickcapture.save.CachingVideoSaver$renderInternal$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r6 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            CachingVideoSaver cachingVideoSaver = this.A02;
            C62320sa r3 = this.A04;
            C65040LmJ lmJ = new C65040LmJ(cachingVideoSaver, this.A03, this.A01);
            this.A00 = 1;
            if (CachingVideoSaver.A00(cachingVideoSaver, lmJ, this, r3) == r6) {
                return r6;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CachingVideoSaver$renderInternal$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
