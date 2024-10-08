package X;

import com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6A0  reason: invalid class name */
public final class AnonymousClass6A0 extends 17P implements C300875y5 {
    public List A00;

    public final List A0q() {
        List list = this.A00;
        if (list == null) {
            return A0o(-1122997398, ImmutablePandoNoteEmojiReactionInfo.class);
        }
        return list;
    }

    public final C300865y4 F6s(1E9 r5) {
        C276104sZ F7P = ((C276114sa) A04(1726143873, AnonymousClass6A1.class)).F7P();
        List<NoteEmojiReactionInfoIntf> A0q = A0q();
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0q, 10));
        for (NoteEmojiReactionInfoIntf F6r : A0q) {
            arrayList.add(F6r.F6r(r5));
        }
        return new C300865y4(F7P, arrayList);
    }
}
