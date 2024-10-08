package com.instagram.share.facebook.logging;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass818;
import X.AnonymousClass819;
import X.C368278sM;
import X.C60340gF;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.upsell.api.CLNoticeApi;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.share.facebook.logging.CrosspostUpsellsLogger$logEvent$1", f = "CrosspostUpsellsLogger.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class CrosspostUpsellsLogger$logEvent$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ AnonymousClass818 A01;
    public final /* synthetic */ C368278sM A02;
    public final /* synthetic */ AnonymousClass819 A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrosspostUpsellsLogger$logEvent$1(AnonymousClass818 r2, C368278sM r3, AnonymousClass819 r4, UserSession userSession, String str, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A04 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.share.facebook.logging.CrosspostUpsellsLogger$logEvent$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        UserSession userSession = this.A04;
        return new CrosspostUpsellsLogger$logEvent$1(this.A01, this.A02, this.A03, userSession, this.A05, r9);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.share.facebook.logging.CrosspostUpsellsLogger$logEvent$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            CLNoticeApi cLNoticeApi = CLNoticeApi.A00;
            UserSession userSession = this.A04;
            AnonymousClass818 r4 = this.A01;
            AnonymousClass819 r6 = this.A03;
            C368278sM r5 = this.A02;
            String str = this.A05;
            this.A00 = 1;
            if (cLNoticeApi.A00(r4, r5, r6, userSession, str, this) == r2) {
                return r2;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CrosspostUpsellsLogger$logEvent$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
