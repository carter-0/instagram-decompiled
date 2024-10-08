package X;

import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Mly  reason: case insensitive filesystem */
public final class C67322Mly implements C250603lj {
    public C67324Mm0 A00;
    public final WeakReference A01;
    public final UserSession A02;
    public final String A03;
    public final AtomicBoolean A04 = new AtomicBoolean();

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        NotePogVideoDict notePogVideoDict;
        List list;
        boolean A1U = AnonymousClass7TF.A1U(0, r9, r10);
        NoteAvatarView noteAvatarView = (NoteAvatarView) this.A01.get();
        if (noteAvatarView != null) {
            int A0A = C51968G9o.A0A(r9, r10);
            if (A0A != 0) {
                if (A0A != A1U) {
                    C67324Mm0 mm0 = this.A00;
                    if (mm0 != null) {
                        mm0.A02("CFHubVideoPlaybackAction Exit");
                    }
                } else if (r10.CFe(r9) == 1.0f) {
                    AtomicBoolean atomicBoolean = this.A04;
                    if (!atomicBoolean.get() && (notePogVideoDict = ((AnonymousClass4AB) r9.A03).A08) != null && (list = notePogVideoDict.A03) != null && AnonymousClass7TE.A1b(list) == A1U) {
                        C67324Mm0 mm02 = this.A00;
                        if (mm02 == null) {
                            mm02 = new C67324Mm0(AnonymousClass7TE.A0S(noteAvatarView), this.A02, this.A03);
                            mm02.A01 = new C74185PqR(20, (Object) noteAvatarView, (Object) this);
                        }
                        this.A00 = mm02;
                        1Xj A022 = AnonymousClass4A2.A02(notePogVideoDict);
                        if (A022 != null) {
                            C67324Mm0 mm03 = this.A00;
                            if (mm03 != null) {
                                mm03.A01(A022, (C242423Ua) noteAvatarView.A0D.getView());
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                        atomicBoolean.set(A1U);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            this.A04.set(false);
        }
    }

    public C67322Mly(UserSession userSession, NoteAvatarView noteAvatarView, String str) {
        AnonymousClass7TG.A1U(userSession, str, noteAvatarView);
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = C51965G9l.A0v(noteAvatarView);
    }
}
