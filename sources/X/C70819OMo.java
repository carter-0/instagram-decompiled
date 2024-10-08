package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import java.util.Set;

/* renamed from: X.OMo  reason: case insensitive filesystem */
public final class C70819OMo {
    public final int A00;
    public final ImageUrl A01;
    public final C254793t3 A02;
    public final String A03;
    public final String A04;
    public final /* synthetic */ C330957Ox A05;

    public C70819OMo(ImageUrl imageUrl, C330957Ox r2, C254793t3 r3, String str, String str2, int i) {
        this.A05 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A00 = i;
    }

    public final void A00() {
        Set<AnonymousClass7WV> set = this.A05.A03;
        if (C66580MXl.A1b(set)) {
            for (AnonymousClass7WV r1 : set) {
                if (r1 != null) {
                    r1.Cub(this.A00);
                }
            }
        }
    }

    public final void A01(String str, String str2) {
        C330957Ox r6 = this.A05;
        Set<AnonymousClass7WV> set = r6.A03;
        boolean z = false;
        if (C66580MXl.A1b(set)) {
            for (AnonymousClass7WV r3 : set) {
                if (r3 != null) {
                    int i = this.A00;
                    r3.Cua(i, str, str2);
                    if (!z) {
                        if (r3.Etx(this.A02, this.A04, i)) {
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                return;
            }
        }
        C254793t3 r1 = this.A02;
        if (r1 instanceof C254763t0) {
            Context context = r6.A00;
            UserSession userSession = r6.A02;
            String A0x = C66580MXl.A0x(r1);
            String A002 = C330967Oy.A00(context, userSession, this.A04, this.A03, this.A00);
            ImageUrl imageUrl = this.A01;
            0qQ.A0B(context, 0);
            AnonymousClass7TG.A1U(userSession, A0x, A002);
            0nY.A00().ATE(new NSX(context, userSession, (String) null, A002, A0x, (String) null, AnonymousClass7TE.A1I(imageUrl), (List) null));
        }
    }
}
