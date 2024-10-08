package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

public final class T5W implements AnonymousClass4HI {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass3OA A02;
    public final /* synthetic */ String A03;

    public T5W(Context context, UserSession userSession, AnonymousClass3OA r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = context;
        this.A01 = userSession;
    }

    public final String AWr() {
        AndroidLink A032;
        AnonymousClass3OA r1 = this.A02;
        String str = this.A03;
        Context context = this.A00;
        UserSession userSession = this.A01;
        ImmutableList A022 = r1.A02(str);
        if (A022 == null || (A032 = AnonymousClass47K.A03(context, userSession, A022, false)) == null) {
            return null;
        }
        return C9759RgH.A00(A032);
    }
}
