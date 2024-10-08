package X;

import android.graphics.Typeface;
import com.instagram.android.R;
import java.util.ArrayList;

public final class GH0 extends C251343mx {
    public final C267324bN A00;

    public final C251263mp A0X(AnonymousClass3Y5 r28) {
        String[] strArr;
        C245923dh B2s;
        String B2v;
        AnonymousClass3Y5 r11 = r28;
        0qQ.A0B(r11, 0);
        if (!C52208GIz.A00.get()) {
            return null;
        }
        1Xj r0 = this.A00.A02;
        if (r0 == null || (B2s = r0.A0C.B2s()) == null || (B2v = B2s.B2v()) == null) {
            strArr = null;
        } else {
            strArr = DbU.A1b(DbW.A0o(B2v, "\n"), 0);
        }
        2V1 r6 = r11.A05;
        int A08 = C51969G9p.A08(r11, 2Yu.A07(r6.A0C));
        AnonymousClass3XV r02 = 2WX.A02;
        2WX A002 = AnonymousClass9JR.A00(C51973G9u.A0P(C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), 48.0d), AnonymousClass05K.A06, 0, C51970G9q.A0I());
        int A082 = C51969G9p.A08(r11, R.color.igds_debug_overlay_background);
        Integer num = AnonymousClass05K.A00;
        2WX A10 = G9t.A10(A002, num, C51965G9l.A0Y(A082));
        ArrayList A1C = AnonymousClass7TE.A1C();
        2WX A0Y = C51971G9r.A0Y((2WX) null, num, C243573Zh.CENTER, 3);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        C244103ae A13 = G9t.A13(r6, "Recommender Debug Overlay", A08);
        AnonymousClass2V4 r2 = r6.A0D;
        0qQ.A07(r2);
        C51971G9r.A1J(A13, r2, 0, ((long) Float.floatToRawIntBits(18.0f)) | 9221683186994511872L);
        A13.A0S(typeface);
        G9w.A1G(A13, r2, num, A0D);
        A13.A0a(false);
        A13.A0N(0);
        A13.A0E();
        C51973G9u.A19(A0Y, A13, false);
        A1C.add(A13.A0A());
        String str = "No data to show; allowlist yourself in \nig_gl_discover_explanation_debug_mode GK \nto see the debug logs.";
        if (strArr != null && strArr.length > 3) {
            String A003 = C66579MXk.A00(184);
            str = 0rw.A0t(002.A15(A003, strArr[1], A003, strArr[2], A003, strArr[3], "\n          "));
        }
        C244103ae A132 = G9t.A13(r6, str, A08);
        C51971G9r.A1J(A132, r2, 0, ((long) Float.floatToRawIntBits(16.0f)) | 9221683186994511872L);
        A132.A0S(typeface);
        G9w.A1G(A132, r2, num, A0D);
        A132.A0a(false);
        A132.A0N(0);
        A132.A0E();
        C51969G9p.A1J(A132);
        A132.A05((AnonymousClass2VW) null);
        A1C.add(A132.A0A());
        2Tl r19 = new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A1C, false);
        A10.A01(r19.A0Z(), r11.Aqq());
        return r19;
    }

    public GH0(C267324bN r1) {
        this.A00 = r1;
    }
}
