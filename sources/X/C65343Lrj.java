package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Lrj  reason: case insensitive filesystem */
public final class C65343Lrj implements C320986tO {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C62928Kog A02;
    public final /* synthetic */ String A03;

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }

    public final /* synthetic */ void DOb(C20997X8u x8u, String str, String str2, String str3) {
    }

    public final void DaG(String str, float f) {
    }

    public final void onError(String str) {
    }

    public C65343Lrj(Context context, UserSession userSession, C62928Kog kog, String str) {
        this.A02 = kog;
        this.A03 = str;
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
        int A06;
        int A05;
        ImageUrl imageUrl;
        String A0R = 002.A0R("canvas_gifs_background__", this.A03);
        C317966o8 A002 = C317966o8.A00(DbS.A0V(str), A0R, A0R, (float) x8u.getWidth(), (float) x8u.getHeight(), 1.0f);
        C62928Kog kog = this.A02;
        Context context = this.A00;
        UserSession userSession = this.A01;
        Resources resources = context.getResources();
        float f = A002.A01;
        float f2 = A002.A00;
        if (C226122ff.A03()) {
            A06 = C226132fh.A01(context).getWidth();
        } else {
            0kD.A07(002.A0R("TargetViewSizeUtil", "#getDisplayWidth"), AnonymousClass000.A00(126), (Throwable) null);
            A06 = 0nA.A06(context);
        }
        if (C226122ff.A03()) {
            A05 = C226132fh.A01(context).getHeight();
        } else {
            0kD.A07(002.A0R("TargetViewSizeUtil", "#getDisplayHeight"), AnonymousClass000.A00(126), (Throwable) null);
            A05 = 0nA.A05(context);
        }
        float f3 = (float) A06;
        float f4 = (float) A05;
        float f5 = f4 / f2;
        float f6 = f2 * (f3 / f);
        if (f6 >= f4) {
            f4 = f6;
        } else {
            f3 = f * f5;
        }
        ImageUrl imageUrl2 = A002.A0H;
        0qQ.A07(imageUrl2);
        String str3 = A002.A0S;
        0qQ.A07(str3);
        C317966o8 r0 = A002.A0I;
        if (r0 != null) {
            imageUrl = r0.A0H;
        } else {
            imageUrl = null;
        }
        Context context2 = context;
        UserSession userSession2 = userSession;
        ImageUrl imageUrl3 = imageUrl2;
        ImageUrl imageUrl4 = imageUrl;
        C321016tR r13 = new C321016tR(context2, userSession2, imageUrl3, imageUrl4, (C41815B1v) null, C321066tW.A00(1.0f, (int) f3, (int) f4, -1), AnonymousClass05K.A01, str3, (float) JTP.A04(resources), context.getColor(R.color.cds_white_a20), context.getColor(R.color.fds_white_alpha60), false);
        kog.A01 = r13;
        L0F l0f = kog.A00;
        C310416b1 r10 = new C310416b1(false, (AnonymousClass8BH) null, false, (String) null, false, true, true, true, true, true, (Integer) null, false, (AnonymousClass8DA) null, false, false, -1.0f, -1.0f, (C3510487j) null, false, AnonymousClass05K.A00, (Integer) null, 0, -1.0f, (List) null, -1.0f, -1.0f, (Object) null, false, false);
        C61738KKd kKd = l0f.A00;
        if (kKd.A03 && kKd.A05) {
            AnonymousClass87H r1 = kKd.A0C;
            r1.A0C(r13, r10, true);
            r1.A09(kKd.A08);
        }
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }
}
