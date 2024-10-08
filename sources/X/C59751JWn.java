package X;

import com.instagram.common.gallery.Medium;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JWn  reason: case insensitive filesystem */
public final class C59751JWn implements AnonymousClass8XQ {
    public final /* synthetic */ JW8 A00;
    public final /* synthetic */ C59750JWm A01;

    public final void DCx(Exception exc) {
        0qQ.A0B(exc, 0);
        AnonymousClass8ZX r0 = this.A01.A00.A0H;
        if (r0 != null) {
            r0.DCx(exc);
        }
    }

    public C59751JWn(JW8 jw8, C59750JWm jWm) {
        this.A01 = jWm;
        this.A00 = jw8;
    }

    public final void DQY(AnonymousClass8XW r9, List list, List list2, int i) {
        AnonymousClass7TG.A1O(list, list2);
        C59750JWm jWm = this.A01;
        JW8 jw8 = this.A00;
        jw8.A0O.A06().size();
        JW7.A0K(jWm.A00, list, list2);
        if (jw8.A0R && i == 100) {
            Iterator it = list.iterator();
            long j = Long.MAX_VALUE;
            while (it.hasNext()) {
                j = Math.min(j, ((Medium) it.next()).A0C * 1000);
            }
            jw8.A00 = ((int) AnonymousClass7TE.A0P(j)) - 1;
        }
    }
}
