package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.TNj  reason: case insensitive filesystem */
public final class C13151TNj implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;

    public C13151TNj(Context context, Uri uri, UserSession userSession, String str, int i) {
        this.A01 = context;
        this.A03 = userSession;
        this.A00 = i;
        this.A02 = uri;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            Context context = this.A01;
            UserSession userSession = this.A03;
            int i = this.A00;
            Bitmap A002 = C64366Lai.A00(context, this.A02, userSession, i);
            if (A002 != null) {
                int width = A002.getWidth();
                File A042 = 0mb.A04(context);
                1MF.A0M(A002, A042);
                A002.recycle();
                if (0mb.A03(A042.getPath()) < 1024) {
                    0wb.A03("profile_image_too_small", 002.A04(i, " : ", this.A04));
                }
                C64134LPj.A01(userSession, this.A04, JTP.A0u(A042), width);
                return null;
            }
            throw AnonymousClass7TE.A0z("failed to load avatar bitmap");
        } catch (Exception e) {
            return e;
        }
    }
}
