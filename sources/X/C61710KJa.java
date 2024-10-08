package X;

import com.instagram.creation.base.MediaSession;

/* renamed from: X.KJa  reason: case insensitive filesystem */
public final class C61710KJa extends C62742Klg {
    public final MediaSession A00;

    public C61710KJa(MediaSession mediaSession) {
        0qQ.A0B(mediaSession, 1);
        this.A00 = mediaSession;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61710KJa) && 0qQ.A0K(this.A00, ((C61710KJa) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
