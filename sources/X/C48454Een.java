package X;

import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Een  reason: case insensitive filesystem */
public abstract class C48454Een {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        List list = r11.A00;
        if (list.size() >= 4) {
            Map map = (Map) AnonymousClass7TE.A13(list);
            String str = (String) DbW.A0d(r11);
            C277014uI A00 = C280064zw.A00(r11.A00());
            C277014uI A002 = C280064zw.A00(DbU.A0j(r11));
            C307896Rx r6 = r10;
            C49727F3r f3r = (C49727F3r) C308206Td.A0F(r10, C49727F3r.class, R.id.ixt_event_ended_handler);
            if (!(f3r == null || map == null || A00 == null || A002 == null)) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    builder.add(C308206Td.A0G(AnonymousClass7TE.A1J(A0u).getValue()));
                }
                f3r.A03(r6, A00, A002, str, DbZ.A0K(builder));
            }
        }
        return null;
    }
}
