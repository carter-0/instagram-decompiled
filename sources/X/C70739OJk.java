package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.OJk  reason: case insensitive filesystem */
public final class C70739OJk {
    public final AnonymousClass7GO A00 = new AnonymousClass7GO();

    public final C69655Npd A00(DirectMessageIdentifier directMessageIdentifier) {
        boolean containsKey;
        AnonymousClass7GO r2 = this.A00;
        synchronized (r2) {
            0qQ.A0B(directMessageIdentifier, 0);
            containsKey = r2.A00.containsKey(AnonymousClass7GO.A00(r2, directMessageIdentifier));
        }
        if (containsKey) {
            Object A01 = r2.A01(directMessageIdentifier);
            A01.getClass();
            return (C69655Npd) A01;
        }
        throw DbW.A0c("VideoViewState must exist for: ", directMessageIdentifier.toString());
    }
}
