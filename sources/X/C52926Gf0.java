package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.Gf0  reason: case insensitive filesystem */
public final class C52926Gf0 extends AnonymousClass2DO {
    public final C3018260f A00;

    public C52926Gf0(C3018260f r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void A04(AnonymousClass5Q3 r6) {
        0qQ.A0B(r6, 0);
        Paint A0V = AnonymousClass7TE.A0V(7);
        Bitmap A002 = C298615tk.A00(this.A00);
        Shader.TileMode A003 = C52417GRu.A00(1);
        A0V.setShader(new BitmapShader(A002, A003, A003));
        A0V.setAntiAlias(true);
        AnonymousClass5R4.A00(G9t.A0r(r6)).drawPaint(A0V);
    }

    public final long A03() {
        return 9205357640488583168L;
    }
}
