package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.ApC  reason: case insensitive filesystem */
public final class C41152ApC implements Runnable {
    public final /* synthetic */ AnonymousClass8ME A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C41152ApC(AnonymousClass8ME r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void run() {
        C347017w8 A012;
        AnonymousClass8ME r2 = this.A00;
        r2.A0F = null;
        C39714A6f a6f = r2.A06;
        if (a6f != null) {
            String str = this.A01;
            String str2 = this.A02;
            UserSession userSession = a6f.A02;
            if (182.A06(0Tu.A05, userSession, 36327748217879204L)) {
                Context context = a6f.A01;
                long A1A = a6f.A03.A1A();
                A012 = new C347017w8(context, userSession, Arrays.asList(new Drawable[]{new C369478up(context, AnonymousClass05K.A00, A1A), new C369478up(context, AnonymousClass05K.A01, A1A)}));
            } else {
                A012 = C369468uo.A0F.A01(a6f.A01, userSession, C317876nz.A17, str, str2, a6f.A03.A1A() * 1000);
            }
            C39890ADo A002 = C39890ADo.A00();
            A002.A0F = true;
            A002.A06 = new AnonymousClass8BG(0.5f, 0.78f);
            r2.A1H(A012, C317876nz.A17, A002);
        }
    }
}
