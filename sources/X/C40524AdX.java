package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AdX  reason: case insensitive filesystem */
public final class C40524AdX implements C41822B2d {
    public final Context A00;
    public final C352688El A01;

    public final String getName() {
        return "ImageSceneUnderstandingScanner";
    }

    public final List ADt() {
        return 0sr.A1P(new C392049u7[]{new C389169p0(224), new C389159oz()});
    }

    public final boolean EKL(Bitmap bitmap, Medium medium, C358058aI r10) {
        String str;
        Context context = this.A00;
        boolean z = false;
        0qg.A01();
        if (0qg.A00(context, false) < 314572800) {
            z = true;
        }
        if (!z) {
            if (bitmap == null) {
                str = "Bitmap is null";
            } else {
                C391749ta E3V = this.A01.E3V(new A9Y(AnonymousClass7TE.A1I("CONCEPTS")), AnonymousClass7TE.A1I(new XH4(bitmap)), C41684Ayb.A00);
                if (E3V instanceof AnonymousClass9ZE) {
                    List list = ((AnonymousClass9ZE) E3V).A00;
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
                    AEP.A02(r10, A0r);
                    return true;
                }
                str = "Failed to predict scene recognition output";
            }
            0KC.A0C("ImageSceneUnderstandingScanner", str);
        }
        return false;
    }

    public C40524AdX(Context context, AnonymousClass8CN r3) {
        this.A00 = context;
        C352688El r0 = new C352688El(r3);
        r0.CgM();
        this.A01 = r0;
    }
}
