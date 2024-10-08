package X;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: X.93q  reason: invalid class name and case insensitive filesystem */
public final class C3730193q extends 0Yg implements C62320sa {
    public static final C3730193q A00 = new C3730193q();

    public C3730193q() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ArrayList arrayList;
        AnonymousClass0eM r0 = C3730093p.A00;
        try {
            arrayList = new ArrayList();
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(C3730293r.A00);
            if (listFiles != null) {
                for (File file : listFiles) {
                    String name = file.getName();
                    0qQ.A07(name);
                    Integer.parseInt(00l.A0F("cpu", name));
                    File file2 = new File(file, "cpufreq/cpuinfo_min_freq");
                    File file3 = new File(file, "cpufreq/cpuinfo_max_freq");
                    Charset charset = AnonymousClass15Q.A05;
                    arrayList.add(new C3730393s(00l.A0B(C272134kB.A00(file2, charset)).toString(), 00l.A0B(C272134kB.A00(file3, charset)).toString()));
                }
            }
        } catch (Throwable th) {
            arrayList = new 0eQ(th);
        }
        if (0eR.A00(arrayList) != null) {
            return 0sn.A00;
        }
        return arrayList;
    }
}
