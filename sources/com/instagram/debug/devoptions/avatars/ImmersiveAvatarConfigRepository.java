package com.instagram.debug.devoptions.avatars;

import X.1NY;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.C61272K0h;
import X.DbU;
import X.LH2;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ImmersiveAvatarConfigRepository {
    public static final Companion Companion = new Object();
    public static final String IMMERSIVE_AVATAR_HOME_CONFIG_ENDPOINT = "creatives/immersive_avatar_home_config/";

    public final Object createImmersiveAvatarHomeConfigRequest(UserSession userSession, AnonymousClass4D7 r5) {
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A(IMMERSIVE_AVATAR_HOME_CONFIG_ENDPOINT);
        return DbU.A0S(A0b, C61272K0h.class, LH2.class).A00(1925716449, r5);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
