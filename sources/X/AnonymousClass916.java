package X;

import com.instagram.direct.inbox.notes.models.NoteAudience;

/* renamed from: X.916  reason: invalid class name */
public abstract class AnonymousClass916 {
    public static final NoteAudience A00(Integer num) {
        NoteAudience noteAudience = (NoteAudience) NoteAudience.A01.get(num);
        if (noteAudience == null) {
            return NoteAudience.UNKNOWN;
        }
        return noteAudience;
    }
}
