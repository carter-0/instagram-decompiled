package com.instagram.perf.userflowpattern;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C73970Pmo;
import com.instagram.preferences.device.AppRestartLoggerPrefs;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.perf.userflowpattern.AppRestartLogger$onNavigation$1", f = "AppRestartLogger.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
public final class AppRestartLogger$onNavigation$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppRestartLogger$onNavigation$1(String str, String str2, String str3, String str4, String str5, AnonymousClass4D7 r7, long j) {
        super(2, r7);
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = j;
        this.A02 = str4;
        this.A03 = str5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.perf.userflowpattern.AppRestartLogger$onNavigation$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        return new AppRestartLogger$onNavigation$1(this.A06, this.A04, this.A05, this.A02, this.A03, r11, this.A01);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.perf.userflowpattern.AppRestartLogger$onNavigation$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            AppRestartLoggerPrefs appRestartLoggerPrefs = AppRestartLoggerPrefs.A00;
            String str = this.A06;
            String str2 = this.A04;
            String str3 = this.A05;
            long j = this.A01;
            C73970Pmo pmo = new C73970Pmo(this.A03, str2, str3, str, this.A02, 0, j);
            this.A00 = 1;
            if (appRestartLoggerPrefs.A02(this, pmo) == r2) {
                return r2;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AppRestartLogger$onNavigation$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
