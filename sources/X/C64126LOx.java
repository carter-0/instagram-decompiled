package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.blur.BlurUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LOx  reason: case insensitive filesystem */
public final class C64126LOx {
    public Bitmap A00;
    public Bitmap A01;
    public Integer A02;
    public final Context A03;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final 1ua A06;

    public C64126LOx(Context context, AnonymousClass4DH r3, UserSession userSession) {
        0qQ.A0B(userSession, 3);
        this.A03 = context;
        this.A04 = r3;
        this.A05 = userSession;
        this.A06 = JTO.A0n(context, userSession);
    }

    public static final String A00(C64126LOx lOx) {
        ArrayList A052 = 28K.A00(lOx.A05).A05(AnonymousClass05K.A15);
        01V.A1D(A052, MAT.A00);
        Iterator it = A052.iterator();
        while (it.hasNext()) {
            String str = JTO.A0m(it).A33;
            if (!(str == null || str.length() == 0)) {
                File A0t = AnonymousClass7TE.A0t(str);
                if (A0t.exists() && A0t.canRead()) {
                    return str;
                }
            }
        }
        return null;
    }

    public final void A01(Bitmap bitmap) {
        this.A00 = bitmap;
        if (bitmap != null) {
            this.A01 = BlurUtil.blur(bitmap, 0.3f, 25);
        }
        A02((KB6) null);
        ArrayList A052 = 28K.A00(this.A05).A05(AnonymousClass05K.A15);
        01V.A1D(A052, MAT.A00);
        Iterator it = A052.iterator();
        while (it.hasNext()) {
            AnonymousClass3Q2 A0m = JTO.A0m(it);
            if (A0m.A1f != AnonymousClass3QD.CONFIGURED) {
                this.A06.A07(this.A04, A0m.A35, false);
            }
        }
        0nY.A00().ATE(new KIf(bitmap, this));
    }

    public final void A02(KB6 kb6) {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            C14120TqF tqF = new C14120TqF(bitmap);
            new C60008JdH(tqF, new C64335LaA(kb6, this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{tqF.A02});
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean A03() {
        ImageUrl imageUrl;
        if (this.A00 != null) {
            return true;
        }
        AnonymousClass16l BVO = DbS.A0h(this.A05, AnonymousClass0t1.A01).BVO();
        if (BVO != null) {
            imageUrl = BVO.Aen();
        } else {
            imageUrl = null;
        }
        if (!C253833rU.A02(imageUrl)) {
            return true;
        }
        String A002 = A00(this);
        if (A002 == null || A002.length() == 0) {
            return false;
        }
        return true;
    }
}
