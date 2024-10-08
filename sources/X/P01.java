package X;

import com.instagram.common.ui.base.IgEditText;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.music.common.model.AudioOverlayTrack;

public final class P01 implements C3515489h {
    public final /* synthetic */ C68449NIn A00;
    public final /* synthetic */ 0r1 A01;
    public final /* synthetic */ 0r1 A02;
    public final /* synthetic */ 0rm A03;

    public final /* synthetic */ void Cxu() {
    }

    public final /* synthetic */ void DT4() {
    }

    public final /* synthetic */ void DT5() {
    }

    public final /* synthetic */ void DT7(C66569MWx mWx) {
    }

    public P01(C68449NIn nIn, 0r1 r2, 0r1 r3, 0rm r4) {
        this.A02 = r2;
        this.A03 = r4;
        this.A00 = nIn;
        this.A01 = r3;
    }

    public final void DT6() {
        Object obj;
        if (!this.A02.A00 || (obj = this.A03.A00) == null) {
            IgEditText igEditText = this.A00.A0H;
            if (igEditText == null) {
                0qQ.A0F("noteEditText");
                throw AnonymousClass00P.createAndThrow();
            } else {
                C69979NvJ.A00(igEditText);
            }
        } else {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) obj;
            if (audioOverlayTrack != null) {
                C68449NIn.A0O(this.A00, audioOverlayTrack, this.A01.A00);
            }
        }
    }

    public final void Djx() {
        NotesRepository notesRepository = C68449NIn.A02(this.A00).A0O;
        C73565Pfm.A02(notesRepository, notesRepository.A01, 22);
    }
}
