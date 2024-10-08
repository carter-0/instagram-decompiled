package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.NtQ  reason: case insensitive filesystem */
public abstract class C69862NtQ {
    public static C254773t1 A00(UserSession userSession, AnonymousClass170 r6) {
        String str = null;
        AnonymousClass3U9 B33 = 1bJ.A00(userSession).B33(new DirectThreadKey((String) null, 0sr.A1M(new String[]{r6.getId()})));
        if (B33 != null) {
            str = B33.C6C();
        }
        Parcelable.Creator creator = PendingRecipient.CREATOR;
        return C66662MaV.A00(str, AnonymousClass7TE.A1I(new PendingRecipient(r6.Bh3(), r6.getId(), r6.B8Q())));
    }
}
