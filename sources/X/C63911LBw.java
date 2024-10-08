package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LBw  reason: case insensitive filesystem */
public final class C63911LBw {
    public final L9Y A00;

    public final void A00(String str, String str2, boolean z) {
        C62651KkD kkD;
        String str3 = str;
        0qQ.A0B(str3, 0);
        L9Y l9y = this.A00;
        if (!00l.A0W(str3)) {
            ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = l9y.A01;
            if (contentNotesImmersiveReplyContent.A0F) {
                List list = contentNotesImmersiveReplyContent.A0B;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0r.add(new PendingRecipient(DbT.A0k(it)));
                }
                if (!A0r.isEmpty()) {
                    DirectShareTarget directShareTarget = new DirectShareTarget(new C291175gg(A0r), (String) null, A0r, true);
                    UserSession userSession = l9y.A00;
                    1E8 A002 = 1E7.A00(userSession);
                    ContentNoteMetadata contentNoteMetadata = contentNotesImmersiveReplyContent.A02;
                    1Xj A02 = A002.A02(contentNoteMetadata.A08);
                    if (A02 != null) {
                        1as.A04.A05((SocialContextType) null, userSession, A02, directShareTarget, contentNoteMetadata.A04, str3, contentNoteMetadata.A05);
                    }
                }
            } else {
                UserSession userSession2 = l9y.A00;
                17i A003 = 17h.A00(userSession2);
                String str4 = contentNotesImmersiveReplyContent.A05;
                User A022 = A003.A02(str4);
                if (A022 != null) {
                    DirectShareTarget directShareTarget2 = new DirectShareTarget(A022);
                    Long A0n = C51971G9r.A0n(0, contentNotesImmersiveReplyContent.A07);
                    if (A0n != null) {
                        1as r9 = 1as.A04;
                        String str5 = contentNotesImmersiveReplyContent.A08;
                        String str6 = contentNotesImmersiveReplyContent.A06;
                        String A0g = 002.A0g(str2, "\n", str3);
                        0qQ.A07(A0g);
                        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(A022.Bh3());
                        ContentNoteMetadata contentNoteMetadata2 = contentNotesImmersiveReplyContent.A02;
                        String str7 = contentNoteMetadata2.A08;
                        String str8 = str6;
                        String str9 = str5;
                        String str10 = str3;
                        r9.A08(userSession2, contentNoteMetadata2.A00, directShareTarget2, extendedImageUrl, contentNoteMetadata2.A01, Boolean.valueOf(1as.A04.A0I(userSession2, directShareTarget2)), A0n, str10, str9, str8, A0g, str7, contentNoteMetadata2.A07, (String) null);
                    }
                    ContentNoteMetadata contentNoteMetadata3 = contentNotesImmersiveReplyContent.A02;
                    String str11 = contentNoteMetadata3.A04;
                    String str12 = contentNoteMetadata3.A06;
                    Integer num = contentNoteMetadata3.A03;
                    String str13 = contentNoteMetadata3.A05;
                    Integer num2 = contentNoteMetadata3.A02;
                    if (z) {
                        kkD = C62651KkD.REACTION;
                    } else {
                        kkD = C62651KkD.TEXT;
                    }
                    GPJ.A01(kkD, userSession2, num, num2, str4, str11, str12, str13);
                }
            }
            l9y.A03.Epw(C62452Kg2.DISMISS_AND_SHOW_SEND_SNACKBAR);
            if (z) {
                l9y.A02.Epw(str3);
            }
        }
    }

    public C63911LBw(L9Y l9y) {
        this.A00 = l9y;
    }
}
