package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class A91 {
    public final HashMap A00 = AnonymousClass7TE.A1E();
    public final Context A01;
    public final UserSession A02;
    public final String A03;

    public final Drawable A00(C282745Eo r14) {
        C2802350v A002;
        C279284yO r6;
        0qQ.A0B(r14, 0);
        HashMap hashMap = this.A00;
        Drawable drawable = (Drawable) hashMap.get(r14);
        if (drawable != null) {
            return drawable;
        }
        Context context = this.A01;
        UserSession userSession = this.A02;
        String str = this.A03;
        AnonymousClass513 r0 = r14.A04;
        if (r0 == null || (A002 = r0.A00()) == null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(r14.A03);
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(" sticker model shouldn't be null.", A1A));
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3138974) {
                if (hashCode != 3496474) {
                    if (hashCode == 94750499 && str.equals("clips")) {
                        r6 = AnonymousClass80N.A00;
                        Drawable A003 = C39900AIi.A00(context, userSession, r6, (C321086tY) null, A002, (Integer) null, (Integer) null, "RegionTrackingFilter", true);
                        AnonymousClass7TG.A13(A003);
                        hashMap.put(r14, A003);
                        return A003;
                    }
                } else if (str.equals("reel")) {
                    r6 = AnonymousClass9QA.A00;
                    Drawable A0032 = C39900AIi.A00(context, userSession, r6, (C321086tY) null, A002, (Integer) null, (Integer) null, "RegionTrackingFilter", true);
                    AnonymousClass7TG.A13(A0032);
                    hashMap.put(r14, A0032);
                    return A0032;
                }
            } else if (str.equals("feed")) {
                r6 = C363138jC.A00;
                Drawable A00322 = C39900AIi.A00(context, userSession, r6, (C321086tY) null, A002, (Integer) null, (Integer) null, "RegionTrackingFilter", true);
                AnonymousClass7TG.A13(A00322);
                hashMap.put(r14, A00322);
                return A00322;
            }
        }
        r6 = null;
        Drawable A003222 = C39900AIi.A00(context, userSession, r6, (C321086tY) null, A002, (Integer) null, (Integer) null, "RegionTrackingFilter", true);
        AnonymousClass7TG.A13(A003222);
        hashMap.put(r14, A003222);
        return A003222;
    }

    public A91(Context context, UserSession userSession, String str) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = str;
    }
}
