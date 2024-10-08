package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.I0l  reason: case insensitive filesystem */
public final class C56536I0l {
    public C56140HtS A00;
    public String A01;
    public final Context A02;
    public final FoaUserSession A03;
    public final C62320sa A04;
    public final 0sP A05;
    public final 0sP A06;
    public final AnonymousClass0Ud A07;

    public C56536I0l(Context context, FoaUserSession foaUserSession, C62320sa r4, 0sP r5, 0sP r6, AnonymousClass0Ud r7) {
        0qQ.A0B(r7, 3);
        this.A02 = context;
        this.A03 = foaUserSession;
        this.A07 = r7;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
    }

    public static final C56140HtS A00(C56536I0l i0l) {
        C56140HtS htS = i0l.A00;
        if (htS != null) {
            return htS;
        }
        throw AnonymousClass7TE.A0z("Bottom sheet container is null. Please call show() first");
    }

    public final G9A A01() {
        G9A g9a = A00(this).A02.A00;
        if (g9a != null) {
            return g9a;
        }
        throw AnonymousClass7TE.A0z(AnonymousClass000.A00(2387));
    }
}
