package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class PAB implements C74545Pwe {
    public final 0fA A00;
    public final C331037Pg A01;

    public PAB(0fA r2, C331037Pg r3) {
        0qQ.A0B(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final boolean CR1(DirectMessageIdentifier directMessageIdentifier) {
        return this.A01.A0E(directMessageIdentifier);
    }

    public final void Dz0(AnonymousClass7JP r2, DirectMessageIdentifier directMessageIdentifier) {
        this.A01.A09(r2, directMessageIdentifier);
    }

    public final void Dz1(AnonymousClass7JP r2) {
        this.A01.A06(r2);
    }

    public final void E2r(AnonymousClass7JP r7, DirectMessageIdentifier directMessageIdentifier, String str) {
        try {
            this.A01.A08(r7, (AnonymousClass7JQ) null, directMessageIdentifier, AnonymousClass05K.A00, str);
        } catch (Exception unused) {
            this.A00.AEf("Failed to start music sticker audio playback", 20134884);
        }
    }

    public final void stop() {
        this.A01.A0B("music_sticker_stopped_by_user");
    }
}
