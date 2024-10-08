package X;

import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.AsV  reason: case insensitive filesystem */
public final /* synthetic */ class C41348AsV implements Callable {
    public final /* synthetic */ C39735A7b A00;
    public final /* synthetic */ AnonymousClass8HG A01;
    public final /* synthetic */ FilmstripTimelineView A02;

    public /* synthetic */ C41348AsV(C39735A7b a7b, AnonymousClass8HG r2, FilmstripTimelineView filmstripTimelineView) {
        this.A01 = r2;
        this.A00 = a7b;
        this.A02 = filmstripTimelineView;
    }

    public final Object call() {
        C39735A7b a7b;
        AnonymousClass8HG r5 = this.A01;
        C39735A7b a7b2 = this.A00;
        FilmstripTimelineView filmstripTimelineView = this.A02;
        Map map = r5.A0L;
        boolean containsKey = map.containsKey(r5.A0T);
        Boolean A0v = AnonymousClass7TE.A0v();
        if (!(!containsKey || map.get(r5.A0T) == null || (a7b = (C39735A7b) map.get(r5.A0T)) == null || a7b2 == null)) {
            filmstripTimelineView.A01(a7b2.A00, a7b.A01);
        }
        return A0v;
    }
}
