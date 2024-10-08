package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kwe  reason: case insensitive filesystem */
public abstract class C63418Kwe {
    public static final ImmutableList A00(UserSession userSession) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (!C46508DgB.A00(userSession)) {
            builder.add(C48153EZv.A05);
        }
        ImmutableList build = builder.build();
        0qQ.A07(build);
        return build;
    }
}
