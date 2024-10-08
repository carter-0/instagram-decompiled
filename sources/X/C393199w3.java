package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9w3  reason: invalid class name and case insensitive filesystem */
public abstract class C393199w3 {
    public static void A00(Context context, C344477rv r16, C344037rD r17, C40140ATg aTg, C7334Q4k q4k, List list, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaEffect mediaEffect = ((SIO) it.next()).A01;
            if (mediaEffect instanceof C40191AVf) {
                r16.B9O().A03(((C40191AVf) mediaEffect).A01);
            } else if (z) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("unsupported media effect received by composite media graph wrapper: ");
                throw AnonymousClass7TE.A15(AnonymousClass7TF.A0i(mediaEffect.getClass(), A1A));
            }
        }
        if (!A1C.isEmpty()) {
            Handler handler = r16.getHandler();
            boolean A0H = q4k.A0H();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it2 = A1C.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AnonymousClass7TE.A11("getEffectRenderer");
            }
            C343897qz r12 = new C343897qz();
            C344037rD r11 = r17;
            AnonymousClass7TF.A1C(context, 1, r11);
            C40140ATg aTg2 = aTg;
            C344767sO A00 = C344787sQ.A00(context, handler, new ARO(aTg2, A1C, A0H), (C344407ro) null, r11, r12, false, true, false, false, false, false, false, false);
            A00.A00 = 1.0f;
            A00.A0M.A00 = 1.0f;
            A00.A07 = A1C2;
            aTg2.A01 = A00;
        }
    }
}
