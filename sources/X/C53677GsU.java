package X;

import android.graphics.Typeface;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.GsU  reason: case insensitive filesystem */
public final class C53677GsU extends C251343mx {
    public final C62320sa A00;
    public final String A01;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        0qQ.A0B(r13, 0);
        TypedValue typedValue = new TypedValue();
        2V1 r7 = r13.A05;
        r7.A0C.getResources().getValue(R.dimen.clips_viewer_social_context_shadow_radius, typedValue, true);
        long A08 = C244013aV.A08(r13);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        int A04 = C51975G9x.A04(r13);
        String str = this.A01;
        long A0D = C51969G9p.A0D();
        Integer num = AnonymousClass05K.A00;
        C244103ae A002 = 2WW.A00(r7, 0);
        A002.A0V(str);
        A002.A0U((2V5) null);
        C51973G9u.A16(r13, A002, A04, A08);
        A002.A0R(0);
        G9w.A11(create, r13, A002, A0D);
        C51974G9v.A17(A002, num, false);
        A002.A0M(1);
        A002.A0b(false);
        G9t.A1N(A002, false);
        2WW A0A = A002.A0A();
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0X = C51971G9r.A0X((2WX) null, num, 47.0f, 0);
        Integer num2 = AnonymousClass05K.A01;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0X(A0X, num2, 75.0f, 0), num, C244013aV.A0D(r13, R.drawable.clips_viewer_footer_button_background), 4);
        long A0D2 = C51970G9q.A0D();
        long A0I = C51970G9q.A0I();
        2WX A0G = C51974G9v.A0G(A0Y, C51965G9l.A0c(AnonymousClass05K.A0u, 0, A0I), 0, A0D2);
        Integer num3 = AnonymousClass05K.A1F;
        return C243563Zg.A0E(G9t.A0v(A0A, r7), r13, C51971G9r.A0Y(C51973G9u.A0Y(AnonymousClass9JR.A00(C51974G9v.A0E(A0G, C51965G9l.A0c(num3, 0, A0I), 0, A0D2), AnonymousClass05K.A0A, 0, A0D2), num2, true), num3, J6F.A00(this, 47), 4));
    }

    public C53677GsU(String str, C62320sa r2) {
        this.A01 = str;
        this.A00 = r2;
    }
}
