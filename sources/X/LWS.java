package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;

public final class LWS implements TextWatcher {
    public boolean A00;
    public final UserSession A01;
    public final ContentNotesImmersiveReplyContent A02;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A00) {
            ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = this.A02;
            ContentNoteMetadata contentNoteMetadata = contentNotesImmersiveReplyContent.A02;
            GPJ.A00.A07(this.A01, contentNoteMetadata.A02, contentNoteMetadata.A04, contentNoteMetadata.A06, contentNoteMetadata.A05, contentNoteMetadata.A0A, contentNotesImmersiveReplyContent.A07);
            this.A00 = true;
        }
    }

    public LWS(UserSession userSession, ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent) {
        AnonymousClass7TG.A1O(contentNotesImmersiveReplyContent, userSession);
        this.A02 = contentNotesImmersiveReplyContent;
        this.A01 = userSession;
    }
}
