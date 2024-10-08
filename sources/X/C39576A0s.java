package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.A0s  reason: case insensitive filesystem */
public abstract class C39576A0s {
    public static final C347017w8 A00(Context context, UserSession userSession, C387339m3 r7, String str) {
        ArrayList A0q = AnonymousClass7TF.A0q(r7, 3);
        if (r7.A00.A01 != null) {
            A0q.add(new C389639px(context, r7, str, "group_mention_sticker_bundle_id"));
        }
        C387339m3 A01 = r7.A01();
        A01.A03((String) null);
        Integer num = A01.A01;
        do {
            A0q.add(new C389639px(context, A01, str, "group_mention_sticker_bundle_id"));
            A01 = A01.A01();
            A01.A02(ABA.A01(A01.A01));
        } while (A01.A01 != num);
        C347017w8 r2 = new C347017w8(context, userSession, A0q);
        r2.A03 = r7;
        A9P a9p = r2.A01;
        if (a9p instanceof C387219lr) {
            ((C387219lr) a9p).A00 = true;
        } else if (a9p instanceof AnonymousClass9UZ) {
            ((AnonymousClass9UZ) a9p).A00 = true;
            return r2;
        }
        return r2;
    }
}
