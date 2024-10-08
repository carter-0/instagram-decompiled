package X;

import android.content.Context;
import java.util.Locale;

/* renamed from: X.OTb  reason: case insensitive filesystem */
public final class C70954OTb {
    public static final C11199SEz A04 = new C11199SEz();
    public long A00;
    public boolean A01;
    public final OJK A02;
    public final Locale A03;

    public C70954OTb(Context context, O8J o8j) {
        0qQ.A0B(context, 2);
        Locale locale = C9167RRs.A00(context.getResources().getConfiguration()).A00.A00.get(0);
        if (locale == null && (locale = Locale.getDefault()) == null) {
            locale = Locale.US;
        }
        0qQ.A0A(locale);
        0qQ.A0B(locale, 2);
        this.A03 = locale;
        this.A01 = true;
        this.A02 = new OJK(o8j);
    }
}
