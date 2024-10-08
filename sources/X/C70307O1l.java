package X;

import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.O1l  reason: case insensitive filesystem */
public abstract class C70307O1l {
    public static final 1OC A00(C61080JwI jwI, UserSession userSession, C69409Nko nko, C69406Nkk nkk, Boolean bool, String str, int i) {
        String str2;
        String str3;
        0qQ.A0B(nko, 3);
        String str4 = null;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("stories/prompt_stickers/trending_prompts/");
        A0b.A0C("count", i);
        A0b.A0C("top_participants_media_count", 0);
        A0b.A9m("caller", nko.toString());
        A0b.A9m("cursor", str);
        if (bool != null) {
            str2 = bool.toString();
        } else {
            str2 = null;
        }
        A0b.A0G("enable_infinite_pagination", str2);
        if (jwI != null) {
            StringWriter A0v = JTO.A0v();
            17W A0K = AnonymousClass7TF.A0K(A0v);
            List list = (List) jwI.A00;
            if (list != null) {
                Iterator A0s = C41845B3m.A0s(A0K, "injected_prompt_infos", list);
                while (A0s.hasNext()) {
                    C61077JwF jwF = (C61077JwF) A0s.next();
                    if (jwF != null) {
                        A0K.A0c();
                        String str5 = jwF.A01;
                        if (str5 != null) {
                            A0K.A0R("prompt_sticker_id", str5);
                        }
                        A0K.A0S("should_be_featured", jwF.A02);
                        List list2 = (List) jwF.A00;
                        if (list2 != null) {
                            Iterator A0s2 = C41845B3m.A0s(A0K, "user_ids", list2);
                            while (A0s2.hasNext()) {
                                Number number = (Number) A0s2.next();
                                if (number != null) {
                                    A0K.A0h(number.longValue());
                                }
                            }
                            A0K.A0Y();
                        }
                        A0K.A0Z();
                    }
                }
                A0K.A0Y();
            }
            str3 = AnonymousClass7TG.A0k(A0K, A0v);
        } else {
            str3 = null;
        }
        A0b.A0G("injected_prompts", str3);
        if (nkk != null) {
            str4 = nkk.toString();
        }
        A0b.A0G("entrypoint", str4);
        return DbU.A0S(A0b, C43813CEf.class, D02.class);
    }
}
