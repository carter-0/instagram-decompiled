package X;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* renamed from: X.9Cz  reason: invalid class name and case insensitive filesystem */
public final class C375289Cz implements 1NU {
    public static final C375289Cz A00 = new C375289Cz();

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        2ZL r5 = (2ZL) obj;
        0qQ.A0B(r5, 0);
        1Qb A002 = r5.A00();
        if (A002 != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(A002.AjD()));
            StringBuilder sb = new StringBuilder();
            1r9.A01(bufferedReader, new C377189Kw(sb, 36));
            String obj2 = sb.toString();
            0qQ.A07(obj2);
            C295315nw r1 = new C295315nw(obj2);
            r1.mStatusCode = r5.A02;
            return r1;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
