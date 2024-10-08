package X;

import android.content.Context;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.HSg  reason: case insensitive filesystem */
public abstract class C54774HSg {
    public static final void A00(Context context, C229382nI r7, boolean z) {
        boolean A1X = DbW.A1X(r7);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        new BitSet(A1X ? 1 : 0);
        A1E.put(AnonymousClass000.A00(3446), Boolean.valueOf(z));
        INE ine = new INE(A1X);
        FBO fbo = new FBO("com.bloks.www.bloks.genai.mifu.update_onboarded_state");
        fbo.A04 = C359608dC.A01(A1E);
        fbo.A03 = A1E2;
        fbo.A02 = ine;
        fbo.A01(context, r7);
    }
}
