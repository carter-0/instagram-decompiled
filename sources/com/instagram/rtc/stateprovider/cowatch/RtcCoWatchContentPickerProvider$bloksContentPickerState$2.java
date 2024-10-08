package com.instagram.rtc.stateprovider.cowatch;

import X.0Tu;
import X.0eS;
import X.0sJ;
import X.182;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C51972G9s;
import X.C60340gF;
import X.C70591OCo;
import X.N94;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.stateprovider.cowatch.RtcCoWatchContentPickerProvider$bloksContentPickerState$2", f = "RtcCoWatchContentPickerProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcCoWatchContentPickerProvider$bloksContentPickerState$2 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ C70591OCo A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCoWatchContentPickerProvider$bloksContentPickerState$2(C70591OCo oCo, String str, AnonymousClass4D7 r4) {
        super(4, r4);
        this.A03 = str;
        this.A02 = oCo;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AnonymousClass7TE.A1a(obj2);
        String str = this.A03;
        RtcCoWatchContentPickerProvider$bloksContentPickerState$2 rtcCoWatchContentPickerProvider$bloksContentPickerState$2 = new RtcCoWatchContentPickerProvider$bloksContentPickerState$2(this.A02, str, (AnonymousClass4D7) obj4);
        rtcCoWatchContentPickerProvider$bloksContentPickerState$2.A01 = A1a;
        rtcCoWatchContentPickerProvider$bloksContentPickerState$2.A00 = obj3;
        return rtcCoWatchContentPickerProvider$bloksContentPickerState$2.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        boolean z = this.A01;
        String str = this.A03;
        boolean A1Z = C51972G9s.A1Z((Boolean) this.A00);
        UserSession userSession = this.A02.A00;
        0Tu r2 = 0Tu.A05;
        return new N94(str, A1Z, z, 182.A06(r2, userSession, 36310327830380563L), 182.A06(r2, userSession, 36317783893546537L));
    }
}
