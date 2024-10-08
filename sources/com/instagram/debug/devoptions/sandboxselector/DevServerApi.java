package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.1NY;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.JUM;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class DevServerApi {
    public static final Companion Companion = new Object();
    public static final String IG_HEALTH_CHECK_ENDPOINT_PATH = "bfad3e85bc/";

    public final AnonymousClass0r6 checkServerConnectionHealth(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A02();
        A0b.A0A(IG_HEALTH_CHECK_ENDPOINT_PATH);
        A0b.A0P(DevServerApi$checkServerConnectionHealth$1.INSTANCE);
        return JUM.A01(new DevServerApi$checkServerConnectionHealth$3((AnonymousClass4D7) null), JUM.A00(new DevServerApi$checkServerConnectionHealth$2((AnonymousClass4D7) null), A0b.A0M().A03(685)));
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
