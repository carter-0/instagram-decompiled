package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import java.util.List;

/* renamed from: X.Ek6  reason: case insensitive filesystem */
public abstract class C48783Ek6 {
    public static final E1H A00(UserSession userSession, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        int i;
        String str10 = str;
        String str11 = str2;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1T(userSession2, str10, str11);
        String str12 = str4;
        0qQ.A0B(str12, 5);
        List list2 = list;
        String str13 = str6;
        AnonymousClass7TF.A1G(str13, 8, list2);
        0eP A1L = AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession2.A05);
        0eP A1L2 = AnonymousClass7TE.A1L("USER_ID_ARGUMENT", str10);
        0eP A1L3 = AnonymousClass7TE.A1L("PROFILE_PIC_URL_ARGUMENT", imageUrl);
        0eP A1L4 = AnonymousClass7TE.A1L("TEXT_ARGUMENT", str11);
        0eP A1L5 = AnonymousClass7TE.A1L("NOTE_ID_ARGUMENT", str3);
        0eP A1L6 = AnonymousClass7TE.A1L("MEDIA_ID_ARGUMENT", str12);
        0eP A1L7 = AnonymousClass7TE.A1L("MEDIA_CODE_ARGUMENT", str5);
        if (num != null) {
            i = num.intValue();
        } else {
            i = NoteAudience.UNKNOWN.A00;
        }
        Bundle A00 = Q21.A00(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, AnonymousClass7TE.A1L("AUDIENCE_ARGUMENT", Integer.valueOf(i)), AnonymousClass7TE.A1L("MODULE_NAME_ARGUMENT", str13), AnonymousClass7TE.A1L("INVENTORY_SOURCE_ARGUMENT", str7), AnonymousClass7TE.A1L("RANKING_INFO_TOKEN_ARGUMENT", str8), AnonymousClass7TE.A1L("MEDIA_POSITION_ARGUMENT", num2), AnonymousClass7TE.A1L("CAROUSEL_CHILD_ID_ARGUMENT", str9), AnonymousClass7TE.A1L("CAROUSEL_CHILD_INDEX_ARGUMENT", num3), AnonymousClass7TE.A1L("PREVIEW_URL_ARGUMENT", imageUrl2));
        A00.putParcelableArrayList("LIKERS_LIST_ARGUMENT", AnonymousClass7TE.A1D(list2));
        E1H e1h = new E1H();
        e1h.setArguments(A00);
        return e1h;
    }
}
