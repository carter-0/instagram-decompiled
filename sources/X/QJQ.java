package X;

import android.os.Process;
import java.io.File;
import java.util.List;
import java.util.Set;

public final class QJQ extends C275004pR {
    public final List A00 = Pxe.A1A();
    public final Set A01 = AnonymousClass7TE.A1F();

    public static void A00(QJQ qjq) {
        File[] listFiles;
        File A0t = AnonymousClass7TE.A0t(002.A0c("/proc/", "/task/", Process.myPid()));
        if (A0t.exists() && A0t.canRead() && (listFiles = A0t.listFiles()) != null) {
            for (File name : listFiles) {
                try {
                    int parseInt = Integer.parseInt(name.getName());
                    if (parseInt != -1) {
                        Set set = qjq.A01;
                        Integer valueOf = Integer.valueOf(parseInt);
                        if (!set.contains(valueOf)) {
                            set.add(valueOf);
                            qjq.A00.add(new C274994pQ(parseInt));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
