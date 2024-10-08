package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.EgM  reason: case insensitive filesystem */
public abstract class C48551EgM {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        try {
            F0A parseFromJson = C48768Ejr.parseFromJson(16P.A00(DbY.A0g(r6)));
            if (parseFromJson != null) {
                0lg A0B = C308206Td.A0B(r5);
                if (!(A0B instanceof UserSession)) {
                    1Kn.A02("IGBloksActionChallengeShowCheckpointImpl", "Attempt to render user avatar node outside of logged in user context");
                } else if (!parseFromJson.A04) {
                    FZ1 A00 = F5E.A00(A0B);
                    0qQ.A07(A00);
                    A00.A02(C308206Td.A04(r5), parseFromJson);
                    return null;
                } else if (AnonymousClass1YU.A00 != null) {
                    1xC.A01.A00(new AnonymousClass3EI(A0B, new C49879FBd()));
                    return null;
                }
            }
            return null;
        } catch (IOException unused) {
            1Kn.A02("IGBloksActionChallengeShowCheckpointImpl", "Unable to parse challenge.");
            return null;
        }
    }
}
