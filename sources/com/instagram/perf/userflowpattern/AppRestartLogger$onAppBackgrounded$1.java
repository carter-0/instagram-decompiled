package com.instagram.perf.userflowpattern;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C73941PmL;
import com.instagram.preferences.device.AppRestartLoggerPrefs;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.perf.userflowpattern.AppRestartLogger$onAppBackgrounded$1", f = "AppRestartLogger.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
public final class AppRestartLogger$onAppBackgrounded$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppRestartLogger$onAppBackgrounded$1(AnonymousClass4D7 r2, long j, long j2) {
        super(2, r2);
        this.A01 = j;
        this.A02 = j2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.perf.userflowpattern.AppRestartLogger$onAppBackgrounded$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new AppRestartLogger$onAppBackgrounded$1(r8, this.A01, this.A02);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.perf.userflowpattern.AppRestartLogger$onAppBackgrounded$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            AppRestartLoggerPrefs appRestartLoggerPrefs = AppRestartLoggerPrefs.A00;
            C73941PmL pmL = new C73941PmL(this.A01, this.A02, 0);
            this.A00 = 1;
            if (appRestartLoggerPrefs.A02(this, pmL) == r2) {
                return r2;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AppRestartLogger$onAppBackgrounded$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
