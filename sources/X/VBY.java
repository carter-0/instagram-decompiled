package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

public abstract class VBY {
    public static String A00(List list) {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0A.A0h(Long.parseLong(AnonymousClass7TE.A18(it)));
            }
            A0A.A0Y();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return null;
        }
    }
}
