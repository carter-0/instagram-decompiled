package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;

public abstract class RSV {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        String str;
        String str2;
        C277014uI A0P = DbW.A0P(r10, 0);
        String str3 = (String) DbW.A0d(r10);
        try {
            switch (str3.hashCode()) {
                case 3134569:
                    str2 = "fb4a";
                    break;
                case 3228747:
                    if (str3.equals("ig4a")) {
                        str = "894032761246-7f5ii0dscmtvqu9lcs7bquii0vb6ddc8.apps.googleusercontent.com";
                        break;
                    }
                    break;
                case 3354638:
                    str2 = "mn4a";
                    break;
                case 1646515095:
                    if (str3.equals("fblite4a")) {
                        str = "37858054444-61gu2sctvhvn7tphd98vjuilkbq2aqvf.apps.googleusercontent.com";
                        break;
                    }
                    break;
            }
            if (str3.equals(str2)) {
                str = "15057814354-80cg059cn49j6kmhhkjam4b00on1gb2n.apps.googleusercontent.com";
                C307786Rm r0 = r9.A03;
                if (r0 != null) {
                    Context context = r0.A00;
                    T0O t0o = new T0O(0, A0P, r9);
                    C258483z9 listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
                    ListenableFuture Eyk = listeningDecorator.Eyk(new TNT(str, context, 4));
                    listeningDecorator.shutdown();
                    0qQ.A0A(Eyk);
                    C255183ti.A04(t0o, Eyk, context.getMainExecutor());
                    return null;
                }
                DbX.A1P(r9, DbS.A0P(), A0P, 0Yt.A0E(), 0);
                return null;
            }
            throw new Exception(002.A0g("This app:", str3, AnonymousClass000.A00(396)));
        } catch (RJO unused) {
            DbX.A1P(r9, DbS.A0P(), A0P, 0Yt.A0E(), 0);
            return null;
        }
    }
}
