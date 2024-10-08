package X;

import android.content.Context;
import android.text.SpannableString;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dj3  reason: case insensitive filesystem */
public final class C46674Dj3 extends SpannableString {
    public C46674Dj3(Context context, List list, int i, int i2, int i3) {
        super(DbT.A0z(00p.A0f("\n", i3), list, (0sP) null));
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int A05 = DbX.A05(AnonymousClass7TE.A18(it));
            setSpan(new C56730I9q(context, i, i2), i4, i4 + A05, 33);
            i4 += A05 + i3;
        }
    }
}
