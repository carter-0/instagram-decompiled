package X;

import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.721  reason: invalid class name */
public final class AnonymousClass721 implements C253043q7 {
    public final /* synthetic */ C318716pP A00;
    public final /* synthetic */ Map A01;

    public final void D2e(ClickableSpan clickableSpan, View view, String str) {
        0qQ.A0B(str, 0);
        C318716pP r2 = this.A00;
        if (r2 != null) {
            String A0D = 002.A0D(str, '#');
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            String lowerCase = A0D.toLowerCase(locale);
            0qQ.A07(lowerCase);
            C255253tp r0 = (C255253tp) this.A01.get(lowerCase);
            if (r0 != null) {
                r2.DCX(r0);
            }
        }
    }

    public AnonymousClass721(C318716pP r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }
}
