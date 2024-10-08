package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5jQ  reason: invalid class name and case insensitive filesystem */
public abstract class C292725jQ {
    public static final String A00(Collection collection) {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0b();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C292715jP r5 = (C292715jP) it.next();
                A0A.A0c();
                A0A.A0R("signal_id", r5.A07);
                A0A.A0R("container_module", r5.A04);
                A0A.A0R("inventory_source", r5.A05);
                A0A.A0R("author_id", r5.A02);
                A0A.A0R("item_id", r5.A06);
                A0A.A0P("item_type", r5.A00);
                A0A.A0q("media_ids");
                A0A.A0b();
                for (String A0t : r5.A08) {
                    A0A.A0t(A0t);
                }
                A0A.A0Y();
                A0A.A0Q("click_timestamp", r5.A01);
                A0A.A0R("click_media_id", r5.A03);
                A0A.A0Z();
            }
            A0A.A0Y();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            0KC.A0H("LikeUnlikeClickRealtimeInfo", "Unable to serialize collection.", e);
            return "";
        }
    }
}
