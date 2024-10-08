package com.instagram.partneranalytics.igfamilyappinstallations;

import X.0eS;
import X.0sL;
import X.0xY;
import X.2KM;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.partneranalytics.igfamilyappinstallations.IGFamilyAppInstallationsLogger$maybeLog$1", f = "IGFamilyAppInstallationsLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IGFamilyAppInstallationsLogger$maybeLog$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 2KM A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGFamilyAppInstallationsLogger$maybeLog$1(2KM r2, AnonymousClass4D7 r3, long j) {
        super(2, r3);
        this.A01 = r2;
        this.A00 = j;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.partneranalytics.igfamilyappinstallations.IGFamilyAppInstallationsLogger$maybeLog$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        return new IGFamilyAppInstallationsLogger$maybeLog$1(this.A01, r6, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IGFamilyAppInstallationsLogger$maybeLog$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        0xY AR4 = this.A01.A04.AR4();
        AR4.E5c("last_logging_time", this.A00);
        AR4.apply();
        return C60340gF.A00;
    }
}
