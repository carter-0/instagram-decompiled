package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.HZj  reason: case insensitive filesystem */
public abstract class C54953HZj {
    public static final String A00(UserSession userSession, C53148GjK gjK, IOZ ioz) {
        Context context;
        int i;
        SavedCollection savedCollection = ioz.A00;
        if (savedCollection == null || !savedCollection.A06() || !I31.A01(userSession)) {
            context = gjK.A00;
            i = 2131969768;
            if (I31.A01(userSession)) {
                i = 2131969769;
            }
        } else {
            Integer A0N = AnonymousClass7TF.A0Q(userSession).A0N();
            Integer num = AnonymousClass05K.A0C;
            context = gjK.A00;
            i = 2131968266;
            if (A0N == num) {
                i = 2131968270;
            }
        }
        return AnonymousClass7TE.A16(context, i);
    }
}
