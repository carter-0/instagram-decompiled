package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class D2L {
    public static C42141BIw parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, "templates")) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C42140BIv parseFromJson = C45007Cok.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new C42141BIw(arrayList);
            }
            AnonymousClass7TF.A1L("templates", r6, "TemplateInfoCollection");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, C42141BIw bIw) {
        r4.A0c();
        List list = bIw.A00;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "templates", list);
            while (A0s.hasNext()) {
                DUJ duj = (DUJ) A0s.next();
                if (duj != null) {
                    C42140BIv FGX = duj.FGX(new 1hu((UserSession) null));
                    r4.A0c();
                    String str = FGX.A01;
                    if (str != null) {
                        r4.A0R("image_url", str);
                    }
                    User user = FGX.A00;
                    if (user != null) {
                        C41845B3m.A0w(r4, user, "template_author");
                    }
                    String str2 = FGX.A02;
                    if (str2 != null) {
                        r4.A0R("template_id", str2);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}
