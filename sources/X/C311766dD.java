package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

/* renamed from: X.6dD  reason: invalid class name and case insensitive filesystem */
public abstract class C311766dD {
    public static final EffectCollectionService A00(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        return (EffectCollectionService) userSession.A01(EffectCollectionService.class, new AnonymousClass9M0(28, context, userSession));
    }
}
