package X;

import android.content.Context;
import android.view.TextureView;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.A7f  reason: case insensitive filesystem */
public final class C39739A7f {
    public final int A00;
    public final int A01;
    public final STU A02;
    public final C312136ds A03;
    public final C343967r6 A04;
    public final SJN A05;
    public final UserSession A06;

    /* JADX WARNING: type inference failed for: r13v1, types: [X.Tfu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v1, types: [X.Q1d, java.lang.Object] */
    public C39739A7f(Context context, TextureView textureView, UserSession userSession, String str, int i, int i2) {
        ATW atw;
        C343947r4 r7;
        C10425Rs1 rs1;
        TextureView textureView2 = textureView;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1Q(userSession2, textureView2);
        this.A06 = userSession2;
        this.A01 = i;
        this.A00 = i2;
        0Tu r6 = 0Tu.A05;
        Context context2 = context;
        if (182.A06(r6, userSession2, 36330106154664404L)) {
            atw = new ATW(0, userSession2, context2);
        } else {
            atw = null;
        }
        this.A03 = atw;
        if (182.A06(r6, userSession2, 36330106154795478L)) {
            r7 = new C343947r4(userSession2);
        } else {
            r7 = null;
        }
        this.A04 = r7;
        boolean A062 = 182.A06(r6, userSession2, 36330106154729941L);
        SJN A012 = C64152LQr.A00.A01(userSession2, 182.A06(r6, userSession2, 36316040137346943L), false, false, false);
        this.A05 = A012;
        C8775R9b r9b = new C8775R9b(textureView2, C64152LQr.A00(userSession2), C64152LQr.A00(userSession2));
        C40201AVr A002 = C392569v1.A00(context2, atw, r7, A062);
        Q1Q q1q = new Q1Q(userSession2);
        if (A012.A0q) {
            rs1 = AnonymousClass7TG.A0Z();
        } else {
            rs1 = null;
        }
        ? obj = new Object();
        LinkedHashMap A003 = C63220KtR.A00("reels_sound_sync", (String) null);
        this.A02 = new STU(context2, q1q, obj, new Object(), C64443Lby.A00, rs1, (AnonymousClass8MA) null, A002, A012, r9b, str, (String) null, (String) null, A003, 59008);
    }
}
