package X;

import android.content.res.Resources;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;

/* renamed from: X.NvM  reason: case insensitive filesystem */
public abstract class C69982NvM {
    public static final String A00(Resources resources, NoteAudienceItem noteAudienceItem) {
        int i;
        int ordinal = noteAudienceItem.A00.ordinal();
        if (ordinal == 1) {
            i = 2131954053;
        } else if (ordinal == 2) {
            i = 2131954051;
        } else if (ordinal != 3) {
            i = 2131954052;
            if (ordinal != 4) {
                i = 2131954056;
            }
        } else {
            i = 2131954055;
        }
        return AnonymousClass7TF.A0d(resources, i);
    }
}
