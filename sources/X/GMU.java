package X;

import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.uistate.NoteTextContent;
import com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent;
import com.instagram.contentnotes.domain.uistate.NoteTextStringResourceContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.user.model.User;

public abstract class GMU {
    public static final GPK A00(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        0qQ.A0B(notesPogThoughtBubbleUiState, 0);
        switch (notesPogThoughtBubbleUiState.A08.intValue()) {
            case 0:
                DbT.A1Q(0wj.A01, "Triggered getEventSourceForSelfProductionNote for a non-mimicry note", 817892647);
                return GPK.MEDIA_OVERLAY;
            case 1:
                return GPK.OVERFLOW_SHEET;
            case 2:
                return GPK.COMMENTS_SHEET;
            case 3:
                return GPK.RECS_NUX;
            case 4:
                return GPK.REPLY_SHEET;
            case 5:
                return GPK.DIRECT_INBOX_TRAY_STACK;
            default:
                throw AnonymousClass7TE.A1K();
        }
    }

    public static final C266444Yx A01(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        NoteTextContent noteTextContent = notesPogThoughtBubbleUiState.A05;
        if (noteTextContent instanceof NoteTextStringLiteralContent) {
            return JUH.A00(((NoteTextStringLiteralContent) noteTextContent).A00);
        }
        if (noteTextContent instanceof NoteTextStringResourceContent) {
            return DbS.A0Q(new Object[0], ((NoteTextStringResourceContent) noteTextContent).A00);
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final boolean A04(AnonymousClass4Ji r4, C59492JLq jLq) {
        String str;
        0qQ.A0B(jLq, 1);
        if (r4.BZf().size() != 1) {
            if (r4 instanceof NotesPogThoughtBubbleUiState) {
                str = ((NotesPogThoughtBubbleUiState) r4).A0H;
            } else if (r4 instanceof SocialContextBubbleUiState) {
                str = ((SocialContextBubbleUiState) r4).A09;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            if (jLq instanceof GMT) {
                GMT gmt = (GMT) jLq;
                if (0qQ.A0K(str, gmt.A01) || r4.getIndex() != gmt.A00) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final ContentNoteMetadata A02(AnonymousClass4GS r12, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        Integer num;
        String str = notesPogThoughtBubbleUiState.A0F;
        User user = notesPogThoughtBubbleUiState.A06;
        String str2 = notesPogThoughtBubbleUiState.A0H;
        String str3 = notesPogThoughtBubbleUiState.A0C;
        String str4 = notesPogThoughtBubbleUiState.A0D;
        String str5 = notesPogThoughtBubbleUiState.A0I;
        int i = notesPogThoughtBubbleUiState.A01;
        String str6 = null;
        if (r12 != null) {
            str6 = r12.All();
            num = r12.Als();
        } else {
            num = null;
        }
        return new ContentNoteMetadata(notesPogThoughtBubbleUiState.A04, user, Integer.valueOf(i), num, str, notesPogThoughtBubbleUiState.A0E, str2, str3, str4, str5, str6, notesPogThoughtBubbleUiState.A0R);
    }

    public static final Integer A03(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        int intValue = notesPogThoughtBubbleUiState.A0A.intValue();
        if (intValue != 2) {
            if (intValue != 3) {
                if (intValue == 1) {
                    return AnonymousClass05K.A0C;
                }
                if (intValue == 0) {
                    return AnonymousClass05K.A0N;
                }
                throw new RuntimeException();
            }
        } else if (notesPogThoughtBubbleUiState.A08 != AnonymousClass05K.A0Y) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }

    public static final boolean A05(AnonymousClass4Ji r3, C59492JLq jLq, String str) {
        AnonymousClass7TG.A1O(str, jLq);
        if (jLq.equals(C52296GMm.A00)) {
            return false;
        }
        if (jLq instanceof GMT) {
            GMT gmt = (GMT) jLq;
            if (!str.equals(gmt.A01) || r3.getIndex() != gmt.A00) {
                return true;
            }
            return false;
        } else if (!jLq.equals(C57129IPs.A00)) {
            throw AnonymousClass7TE.A1K();
        }
        return true;
    }
}
