package com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass3OC;
import X.AnonymousClass4D7;
import X.C60340gF;
import com.instagram.zero.main.IgZeroMain;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1", f = "BKBloksActionZeroTriggerHeadersPingImpl.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1(String str, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1(this.A01, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1(this.A01, (AnonymousClass4D7) obj2).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        IgZeroMain igZeroMain;
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            String str = this.A01;
            this.A00 = 1;
            if (AnonymousClass3OC.A00 == null || (igZeroMain = IgZeroMain.A08) == null) {
                obj = null;
            } else {
                obj = igZeroMain.A04(str, this);
            }
            if (obj == r2) {
                return r2;
            }
        }
        return obj;
    }
}
