package com.instagram.bugreporter;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.GQ2;
import com.instagram.preferences.device.AppRestartLoggerPrefs;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bugreporter.BugReporterUploader$logSuccess$1", f = "BugReporterUploader.kt", i = {}, l = {725}, m = "invokeSuspend", n = {}, s = {})
public final class BugReporterUploader$logSuccess$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BugReporterUploader$logSuccess$1(AnonymousClass4D7 r2, long j) {
        super(2, r2);
        this.A01 = j;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.bugreporter.BugReporterUploader$logSuccess$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new BugReporterUploader$logSuccess$1(r5, this.A01);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BugReporterUploader$logSuccess$1((AnonymousClass4D7) obj2, this.A01).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.bugreporter.BugReporterUploader$logSuccess$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r6 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            AppRestartLoggerPrefs appRestartLoggerPrefs = AppRestartLoggerPrefs.A00;
            GQ2 gq2 = new GQ2(this.A01, 4);
            this.A00 = 1;
            if (appRestartLoggerPrefs.A02(this, gq2) == r6) {
                return r6;
            }
        }
        return C60340gF.A00;
    }
}
