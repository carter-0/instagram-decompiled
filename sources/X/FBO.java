package X;

import android.content.Context;
import java.util.Map;

public final class FBO {
    public Q3B A00;
    public Q3B A01;
    public C51897G6n A02;
    public Map A03;
    public Map A04;
    public final String A05;

    public static FBO A00(C51897G6n g6n, String str, Map map, Map map2) {
        FBO fbo = new FBO(str);
        fbo.A04 = C359608dC.A01(map);
        fbo.A03 = map2;
        fbo.A02 = g6n;
        return fbo;
    }

    public FBO(String str) {
        this.A05 = str;
    }

    public final void A01(Context context, C229392nJ r7) {
        AnonymousClass7TG.A1N(context, r7);
        String str = this.A05;
        Map map = this.A04;
        ExR exR = new ExR(context, this, r7);
        if (r7 instanceof C229382nI) {
            C229382nI r72 = (C229382nI) r7;
            0lg r0 = r72.A06;
            0qQ.A07(r0);
            AnonymousClass4D6 r2 = r72.A07;
            C360678ey A052 = C359988do.A05(r0, str, map);
            E84.A00(A052, exR, 0);
            r2.schedule(A052);
            return;
        }
        throw AnonymousClass7TE.A0w("Host instance must be an instance of IgBloksHost");
    }
}
