package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ada  reason: case insensitive filesystem */
public final class C40527Ada implements C41822B2d {
    public final long A00;
    public final Context A01;
    public final C3501183i A02;

    public final boolean EKL(Bitmap bitmap, Medium medium, C358058aI r11) {
        Context context = this.A01;
        0qg.A01();
        if (0qg.A00(context, false) >= 314572800) {
            if (!medium.A05() && medium.A0C * 1000 >= this.A00 && medium.A03 <= 60000) {
                C3501183i r3 = this.A02;
                C352698Em r6 = r3.A00;
                if (!r6.CaO()) {
                    r3.A01.await(10, TimeUnit.SECONDS);
                    if (!r6.CaO()) {
                        ((C282635Eb) C282635Eb.A03.getValue()).A00(002.A0R("VideoSceneUnderstandingScanner ", "Model not ready yet"));
                        0KC.A0C("VideoSceneUnderstandingScanner", "Model not ready yet");
                    }
                }
                C391749ta A03 = r3.A03(new A9Y(AnonymousClass7TE.A1I("CONCEPT_SCORES")), 0sr.A1P(new C21288XSt[]{new AnonymousClass9ZA(medium.A0X), new AnonymousClass9Z9(TimeUnit.MILLISECONDS.toMicros((long) medium.A03))}), C41681AyY.A00);
                if (A03 instanceof AnonymousClass9ZE) {
                    List list = ((AnonymousClass9ZE) A03).A00;
                    ArrayList<AnonymousClass9ZD> A1C = AnonymousClass7TE.A1C();
                    for (Object next : list) {
                        if (next instanceof AnonymousClass9ZD) {
                            A1C.add(next);
                        }
                    }
                    ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                    for (AnonymousClass9ZD r0 : A1C) {
                        A0r.add(new AHB(C353728Iv.CONCEPT_SCORES, r0.A00, r0.A01, (float[]) null));
                    }
                    AEP.A02(r11, A0r);
                    AEP.A01(r11, A0r);
                }
            }
            return true;
        }
        return false;
    }

    public final String getName() {
        return "VideoSceneUnderstandingScanner";
    }

    public final List ADt() {
        return 0sn.A00;
    }

    public C40527Ada(UserSession userSession, Context context, boolean z) {
        AnonymousClass8Eg r0;
        this.A01 = context;
        this.A00 = System.currentTimeMillis() - (((long) C227382jA.A00(userSession)) * 86400000);
        if (z) {
            r0 = AnonymousClass8Eg.SCENEX_EXECUTORCH;
        } else {
            r0 = AnonymousClass8Eg.SCENE_UNDERSTANDING;
        }
        this.A02 = new C3501183i(new AnonymousClass8CO(userSession, AnonymousClass7TE.A1I(C352658Eh.A00(r0))), z);
    }
}
