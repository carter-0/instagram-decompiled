package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.5JN  reason: invalid class name */
public final class AnonymousClass5JN extends AnonymousClass0T0 implements AnonymousClass5JO {
    public static final 1OW A02 = new AnonymousClass5JP();
    public String A00 = null;
    public String A01 = null;

    public final boolean CWR(Context context, UserSession userSession, String str) {
        if (!0qQ.A0K(this.A01, userSession.A06)) {
            return true;
        }
        PendingMediaStore A002 = 28K.A00(userSession);
        if (!A002.A0E() || A002.A03(this.A00) != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5JN) {
                AnonymousClass5JN r5 = (AnonymousClass5JN) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getTypeName() {
        return "PendingMediaFileOwner";
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
