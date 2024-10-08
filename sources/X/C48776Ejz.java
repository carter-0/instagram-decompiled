package X;

import android.os.Bundle;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ejz  reason: case insensitive filesystem */
public abstract class C48776Ejz {
    public static final E30 A00(C272034jz r7, String str, boolean z) {
        String str2;
        String A12;
        E30 e30 = new E30();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean(AnonymousClass000.A00(254), z);
        A0a.putBoolean("args_caption_is_poll_question", true);
        if (r7 != null) {
            List<C272014jx> C48 = r7.C48();
            ArrayList arrayList = null;
            if (C48 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C272014jx text : C48) {
                    String text2 = text.getText();
                    if (!(text2 == null || (A12 = DbV.A12(text2)) == null || A12.length() == 0)) {
                        arrayList.add(A12);
                    }
                }
            }
            A0a.putStringArrayList("args_poll_options_text_list", AnonymousClass7TE.A1D(arrayList));
            StoryPollColorType Aoy = r7.Aoy();
            if (Aoy != null) {
                str2 = Aoy.A00;
            } else {
                str2 = null;
            }
            A0a.putString("args_selected_poll_type_color", str2);
            A0a.putBoolean("args_should_show_delete_poll_button", true);
        }
        if (str == null) {
            if (r7 != null) {
                str = r7.getQuestion();
            }
            e30.setArguments(A0a);
            return e30;
        }
        A0a.putString("args_poll_question_text", str);
        e30.setArguments(A0a);
        return e30;
    }
}
