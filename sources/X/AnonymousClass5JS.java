package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.5JS  reason: invalid class name */
public final class AnonymousClass5JS implements AnonymousClass5JO {
    public static final 1OW A02 = new AnonymousClass5JT();
    public final String A00;
    public final String A01;

    public AnonymousClass5JS(String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public final boolean CWR(Context context, UserSession userSession, String str) {
        0qQ.A0B(context, 0);
        if (!2PP.A00(this.A01, userSession.A06)) {
            return true;
        }
        return ((Boolean) C67351tA.A00(19B.A00, new AnonymousClass9K3((Object) this, (Object) 2MV.A00(context, userSession), (AnonymousClass4D7) null, 42))).booleanValue();
    }

    public final String getTypeName() {
        return "ClipsDraftFileOwner";
    }
}
