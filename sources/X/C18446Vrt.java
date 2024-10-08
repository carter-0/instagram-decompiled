package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Vrt  reason: case insensitive filesystem */
public final class C18446Vrt {
    public static final Map A02;
    public final C18648Vw0 A00;
    public final List A01 = new ArrayList();

    static {
        0eP r2 = new 0eP("alevent:media_metric_event", C51967G9n.A0t(new String[]{"alevent:navigation_event", "alevent:instagram_open_application"}, 0));
        Set singleton = Collections.singleton("alevent:media_metric_event");
        0qQ.A07(singleton);
        0eP r1 = new 0eP("alevent:instagram_open_application", singleton);
        Set singleton2 = Collections.singleton("alevent:media_metric_event");
        0qQ.A07(singleton2);
        A02 = DbY.A0q("alevent:navigation_event", singleton2, r2, r1);
    }

    public C18446Vrt(C18648Vw0 vw0) {
        this.A00 = vw0;
    }
}
