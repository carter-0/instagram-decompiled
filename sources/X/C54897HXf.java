package X;

import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.domain.uistate.NoteTextContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.HXf  reason: case insensitive filesystem */
public abstract class C54897HXf {
    public static final NotesPogThoughtBubbleUiState A00(NoteTextContent noteTextContent, User user, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str6 = str;
        String str7 = str2;
        AnonymousClass7TF.A1D(str6, 0, str7);
        Integer num3 = num2;
        0qQ.A0B(num3, 9);
        User user2 = user;
        return new NotesPogThoughtBubbleUiState((NoteCustomTheme) null, user2.Bh3(), (ImageUrl) null, noteTextContent, user2, (Integer) null, num, num3, AnonymousClass05K.A00, (Long) null, str6, user2.getId(), "", str7, str3, str4, "", str5, list, 0sn.A00, -1, i, false, false, false, false, z, false, false, false, z2, z3, true, z4, z5, z6);
    }
}
