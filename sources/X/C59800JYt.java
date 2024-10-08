package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.JYt  reason: case insensitive filesystem */
public final class C59800JYt implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Medium A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C357038Wf A03;
    public final /* synthetic */ List A04;

    public C59800JYt(Context context, Medium medium, UserSession userSession, C357038Wf r4, List list) {
        this.A04 = list;
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = medium;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        List<Medium> A0X = 00k.A0X(this.A04);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Medium medium : A0X) {
            if (medium.CeS()) {
                A1C2.add(medium);
            } else if (medium.A05()) {
                A1C.add(medium);
            }
        }
        boolean z = !A1C2.isEmpty();
        if (!A1C.isEmpty()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C65018Llv llv = new C65018Llv(context, userSession, this.A03, A1C2, z);
            C290815g0 r1 = new C290815g0(new C13146TNe(1, A1C, userSession, context), 465);
            KH1.A01(r1, llv, 6);
            1ES.A02(r1);
            return null;
        } else if (z) {
            Context context2 = this.A00;
            UserSession userSession2 = this.A02;
            C65019Llw llw = new C65019Llw(this.A03, (List) null);
            C290815g0 r12 = new C290815g0(new C66091MAy(context2, userSession2, A1C2, true), 468);
            r12.A00 = new C61671KGv(llw);
            1ES.A03(r12);
            return null;
        } else {
            Medium medium2 = this.A01;
            if (medium2 != null) {
                BackgroundGradientColors backgroundGradientColors = medium2.A0H;
                if (backgroundGradientColors != null) {
                    UserSession userSession3 = this.A02;
                    Context context3 = this.A00;
                    LI5.A01(context3, new C65020Llx(context3, medium2, userSession3, this.A03), AnonymousClass05K.A00, new int[]{backgroundGradientColors.A01, backgroundGradientColors.A00});
                    return null;
                }
                throw AnonymousClass7TE.A0y();
            }
            this.A03.A00(AnonymousClass7TE.A0z("No valid media or stickers"));
            return null;
        }
    }
}
