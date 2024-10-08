package com.instagram.archive.data;

import X.0eS;
import X.0sP;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C323026wo;
import X.C60340gF;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.archive.data.HighlightsSettingsRepository$setCardsEnabled$2", f = "HighlightsSettingsRepository.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
public final class HighlightsSettingsRepository$setCardsEnabled$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ HighlightsSettingsRepository A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HighlightsSettingsRepository$setCardsEnabled$2(HighlightsSettingsRepository highlightsSettingsRepository, AnonymousClass4D7 r3, boolean z) {
        super(1, r3);
        this.A01 = highlightsSettingsRepository;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.archive.data.HighlightsSettingsRepository$setCardsEnabled$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r4) {
        return new HighlightsSettingsRepository$setCardsEnabled$2(this.A01, r4, this.A02);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((HighlightsSettingsRepository$setCardsEnabled$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.archive.data.HighlightsSettingsRepository$setCardsEnabled$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r4 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            UserSession userSession = this.A01.A01;
            Boolean valueOf = Boolean.valueOf(this.A02);
            this.A00 = 1;
            obj = C323026wo.A00(userSession, (Boolean) null, valueOf, this);
            if (obj == r4) {
                return r4;
            }
        }
        return obj;
    }
}
