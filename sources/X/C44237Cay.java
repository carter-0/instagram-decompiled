package X;

import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cay  reason: case insensitive filesystem */
public abstract class C44237Cay {
    public static C300875y5 A00(C300875y5 r5, C276114sa r6, List list) {
        Object obj;
        new 1E9(new 1hu((UserSession) null), 6, false);
        if (r5 instanceof AnonymousClass6A0) {
            0eP A1L = AnonymousClass7TE.A1L("paging_info", r6.FHC());
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf = (NoteEmojiReactionInfoIntf) it.next();
                if (noteEmojiReactionInfoIntf != null) {
                    A1C.add(noteEmojiReactionInfoIntf.FHC());
                }
            }
            obj = C41847B3o.A0o(r5, new 0eP[]{A1L, AnonymousClass7TE.A1L("reactions", A1C)});
        } else {
            1E9 r4 = new 1E9(new 1hu((UserSession) null), 6, false);
            C276104sZ F7P = r6.F7P();
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0r.add(((NoteEmojiReactionInfoIntf) it2.next()).F6r(r4));
            }
            obj = new C300865y4(F7P, A0r);
        }
        return (C300875y5) obj;
    }
}
