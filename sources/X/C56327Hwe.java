package X;

import com.instagram.api.schemas.SoundPlatformProduct;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hwe  reason: case insensitive filesystem */
public abstract class C56327Hwe {
    public static final boolean A01(SoundPlatformProduct soundPlatformProduct, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        List<JSA> Ade = DbX.A0m(userSession).Ade();
        if (Ade != null) {
            for (JSA Bg6 : Ade) {
                List<JSF> Bg62 = Bg6.Bg6();
                if (!(Bg62 instanceof Collection) || !Bg62.isEmpty()) {
                    for (JSF Bxd : Bg62) {
                        if (Bxd.Bxd() == soundPlatformProduct) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public static final String A00(SoundPlatformProduct soundPlatformProduct, UserSession userSession) {
        Object obj;
        List<JSA> Ade = DbV.A0k(userSession).Ade();
        if (Ade == null) {
            return null;
        }
        JSF jsf = null;
        for (JSA Bg6 : Ade) {
            Iterator it = Bg6.Bg6().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((JSF) obj).Bxd() == soundPlatformProduct) {
                    break;
                }
            }
            jsf = (JSF) obj;
        }
        if (jsf != null) {
            return jsf.Ago();
        }
        return null;
    }
}
