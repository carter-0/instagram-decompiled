package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class I0Q {
    public static final I0Q A00 = new Object();

    public final void A00(Context context, UserSession userSession, AnonymousClass4GS r31, AnonymousClass33B r32, 1Xj r33, AnonymousClass4DU r34, String str, boolean z) {
        int i;
        String str2;
        Object obj;
        String str3;
        Integer num;
        String str4;
        Integer num2;
        ImageUrl imageUrl;
        ArrayList arrayList;
        String str5;
        Integer num3;
        UserSession userSession2 = userSession;
        AnonymousClass33B r2 = r32;
        AnonymousClass4DU r1 = r34;
        C51974G9v.A1L(userSession2, r1, r2);
        List A3b = r33.A3b();
        if (A3b != null) {
            Iterator it = A3b.iterator();
            while (true) {
                str2 = str;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((C2809354u) obj).getId(), str2)) {
                    break;
                }
            }
            C2809354u r0 = (C2809354u) obj;
            if (r0 != null) {
                boolean z2 = false;
                if (2R8.A05(userSession2, r0.getUserId())) {
                    String userId = r0.getUserId();
                    if (userId == null) {
                        userId = "";
                    }
                    String text = r0.getText();
                    if (text == null) {
                        text = "";
                    }
                    User CCd = r0.CCd();
                    if (CCd != null) {
                        imageUrl = CCd.Bh3();
                    } else {
                        imageUrl = null;
                    }
                    String id = r33.getId();
                    if (id == null) {
                        id = "";
                    }
                    String A2Z = r33.A2Z();
                    Integer AdI = r0.AdI();
                    String moduleName = r1.getModuleName();
                    List<NoteEmojiReactionInfoIntf> Bjr = r0.Bjr();
                    if (Bjr != null) {
                        arrayList = AnonymousClass7TE.A1C();
                        for (NoteEmojiReactionInfoIntf CCd2 : Bjr) {
                            User CCd3 = CCd2.CCd();
                            if (CCd3 != null) {
                                arrayList.add(CCd3);
                            }
                        }
                    } else {
                        arrayList = 0sn.A00;
                    }
                    String A0t = C51965G9l.A0t(r33);
                    String A0x = DbT.A0x(r33);
                    if (r31 != null) {
                        str5 = r31.All();
                        num3 = r31.Als();
                    } else {
                        str5 = null;
                        num3 = null;
                    }
                    r2.Diu((View) null, C48783Ek6.A00(userSession2, imageUrl, r33.A1Q(), AdI, 0, num3, userId, text, str2, id, A2Z, moduleName, A0t, A0x, str5, arrayList), (ContentNoteMetadata) null, (NotesPogThoughtBubbleUiState) null, (AnonymousClass4DU) null, AnonymousClass05K.A00);
                    return;
                }
                User CCd4 = r0.CCd();
                if (CCd4 == null) {
                    i = 2131956651;
                    String A16 = AnonymousClass7TE.A16(context, i);
                    1xC r22 = 1xC.A01;
                    C310336ap A0X = DbV.A0X();
                    A0X.A0H = "content_note_detail_launcher_error";
                    A0X.A0D = A16;
                    DbY.A1K(r22, A0X);
                }
                GPJ gpj = GPJ.A00;
                String moduleName2 = r1.getModuleName();
                String A0t2 = C51965G9l.A0t(r33);
                String A0x2 = DbT.A0x(r33);
                String id2 = r0.getId();
                if (id2 == null) {
                    id2 = "";
                }
                if (r31 != null) {
                    str3 = r31.All();
                    num = r31.Als();
                } else {
                    str3 = null;
                    num = null;
                }
                gpj.A06(userSession2, num, moduleName2, A0t2, A0x2, id2, str3);
                String id3 = r33.getId();
                if (id3 == null) {
                    id3 = "";
                }
                String A2Z2 = r33.A2Z();
                String id4 = r0.getId();
                String moduleName3 = r1.getModuleName();
                String A0t3 = C51965G9l.A0t(r33);
                String A0x3 = DbT.A0x(r33);
                if (r31 != null) {
                    str4 = r31.All();
                    num2 = r31.Als();
                } else {
                    str4 = null;
                    num2 = null;
                }
                ContentNoteMetadata contentNoteMetadata = new ContentNoteMetadata(r33.A1Q(), CCd4, 0, num2, id3, A2Z2, id4, moduleName3, A0t3, A0x3, str4, r33.CeS());
                Integer num4 = AnonymousClass05K.A00;
                String text2 = r0.getText();
                if (text2 == null) {
                    text2 = "";
                }
                Integer AdI2 = r0.AdI();
                Boolean BCJ = r0.BCJ();
                if (BCJ != null) {
                    z2 = BCJ.booleanValue();
                }
                AnonymousClass33B r17 = r2;
                ContentNoteMetadata contentNoteMetadata2 = contentNoteMetadata;
                AnonymousClass4DU r21 = r1;
                r17.DVf((View) null, r0.Auz(), contentNoteMetadata2, r21, num4, AdI2, r0.AsC(), text2, z, z2);
                return;
            }
        }
        i = 2131956652;
        String A162 = AnonymousClass7TE.A16(context, i);
        1xC r222 = 1xC.A01;
        C310336ap A0X2 = DbV.A0X();
        A0X2.A0H = "content_note_detail_launcher_error";
        A0X2.A0D = A162;
        DbY.A1K(r222, A0X2);
    }
}
