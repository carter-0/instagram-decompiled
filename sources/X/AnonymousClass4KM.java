package X;

import com.facebook.stash.core.Stash;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* renamed from: X.4KM  reason: invalid class name */
public final class AnonymousClass4KM {
    public final String A00(String str) {
        String obj;
        UUID A01;
        if (str == null) {
            A01 = AnonymousClass0HM.A00();
        } else {
            Stash stash = AnonymousClass4KL.A00;
            byte[] readResourceToMemory = stash.readResourceToMemory("secure_salt");
            if (readResourceToMemory != null) {
                obj = new String(readResourceToMemory, AnonymousClass15Q.A05);
            } else {
                obj = AnonymousClass0HM.A00().toString();
                0qQ.A07(obj);
                byte[] bytes = obj.getBytes(AnonymousClass15Q.A05);
                0qQ.A07(bytes);
                stash.write("secure_salt", bytes);
            }
            String A0R = 002.A0R(str, obj);
            0qQ.A0B(A0R, 0);
            A01 = AnonymousClass2RJ.A00.A01(A0R, StandardCharsets.UTF_8);
        }
        String obj2 = A01.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
