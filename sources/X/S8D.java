package X;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public abstract class S8D {
    public static final Pair A00(SHI shi) {
        String A00 = RU8.A00(shi.A01.A06);
        boolean z = false;
        String str = "";
        if (!AnonymousClass7TF.A1Q(A00.length())) {
            z = true;
            str = Pxf.A0b(DbT.A09(A00).buildUpon().clearQuery());
        }
        return Pxe.A0K(z, str);
    }

    public static final void A01(Context context, SHI shi) {
        String str;
        0qQ.A0B(shi, 1);
        Pair A00 = A00(shi);
        if (AnonymousClass7TE.A1a(A00.first)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            ArrayList A1C = AnonymousClass7TE.A1C();
            C13800ThJ thJ = shi.A00;
            String str2 = "";
            if (str2.length() > 0) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                String str3 = shi.A01.A04;
                A1A.append(str2);
                A1A.append("=");
                A1A.append(str3);
                A1A.append(";");
                Pxj.A1M("Domain", "=", thJ.ArJ(), ";", A1A);
                Pxj.A1M("Path", "=", "/", ";", A1A);
                A1A.append("Secure");
                A1A.append(";");
                A1A.append("HttpOnly");
                A1A.append(";");
                A1A.append("Max-Age");
                A1A.append("=");
                A1A.append(0);
                str = AnonymousClass7TF.A0l(";", A1A);
                0qQ.A07(str);
            } else {
                str = str2;
            }
            if (str.length() > 0) {
                A1C.add(str);
            }
            String AXj = thJ.AXj();
            boolean z = false;
            boolean A1R = AnonymousClass7TF.A1R(AXj.length());
            String str4 = shi.A02.A02;
            if (str4 == null || str4.length() == 0) {
                z = true;
            }
            if (A1R && (!z)) {
                StringBuilder A0n = AnonymousClass7TF.A0n(AXj);
                A0n.append("=");
                A0n.append(str4);
                A0n.append(";");
                Pxj.A1M("Domain", "=", thJ.ArJ(), ";", A0n);
                Pxj.A1M("Path", "=", "/", ";", A0n);
                A0n.append("Secure");
                A0n.append(";");
                str2 = Pxg.A0s("HttpOnly", ";", A0n);
                0qQ.A07(str2);
            }
            if (str2.length() > 0) {
                A1C.add(str2);
            }
            A1E.put(A00.second, A1C);
            SQO.A03("For url %s, setting bwi cookies- %s", new Object[]{A00.second, A1E.toString()});
            Pattern pattern = SCX.A01;
            SB5.A00(new TJZ(context, (A9z) null, A1E, true));
        }
    }
}
