package X;

import com.instagram.common.gallery.Medium;
import java.util.Comparator;

/* renamed from: X.9UA  reason: invalid class name */
public final class AnonymousClass9UA implements Comparator {
    public static final AnonymousClass9UA A00 = new AnonymousClass9UA();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C365798nh r8 = (C365798nh) obj;
        C365798nh r9 = (C365798nh) obj2;
        AnonymousClass7TG.A1N(r8, r9);
        Medium A002 = r8.A00();
        0qQ.A0A(A002);
        Medium A003 = r9.A00();
        0qQ.A0A(A003);
        return ((A002.A0C * 1000) > (A003.A0C * 1000) ? 1 : ((A002.A0C * 1000) == (A003.A0C * 1000) ? 0 : -1));
    }
}
