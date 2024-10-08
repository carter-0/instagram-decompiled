package X;

import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.Gpp  reason: case insensitive filesystem */
public final class C53519Gpp extends AnonymousClass0T0 implements AnonymousClass4Jg {
    public final C53372Gmw A00;
    public final NotesPogThoughtBubbleUiState A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53519Gpp) {
                C53519Gpp gpp = (C53519Gpp) obj;
                if (!0qQ.A0K(this.A01, gpp.A01) || !0qQ.A0K(this.A00, gpp.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0C(this.A01) * 31);
    }

    public C53519Gpp(C53372Gmw gmw, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        this.A01 = notesPogThoughtBubbleUiState;
        this.A00 = gmw;
    }
}
