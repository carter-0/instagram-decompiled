package X;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.45D  reason: invalid class name */
public abstract class AnonymousClass45D {
    public static final AnonymousClass0eM A00 = AnonymousClass0eN.A01(AnonymousClass4IU.A00);
    public static final AnonymousClass0eM A01 = AnonymousClass0eN.A01(AnonymousClass45E.A00);
    public static volatile Map A02 = 0Yt.A0E();

    public static final void A00() {
        C60340gF r0;
        long nanoTime = System.nanoTime() - AnonymousClass49C.A00;
        try {
            File[] listFiles = new File(((File) A00.getValue()).getCanonicalPath()).listFiles(C283625Io.A00);
            0qQ.A07(listFiles);
            ArrayList<File> arrayList = new ArrayList<>();
            for (File file : listFiles) {
                0qQ.A0A(file);
                if (file.exists() && file.isFile() && file.length() >= 50000) {
                    arrayList.add(file);
                }
            }
            int A0L = 0se.A0L(0Yv.A1E(arrayList, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
            for (File file2 : arrayList) {
                String name = file2.getName();
                0qQ.A07(name);
                linkedHashMap.put(00l.A0L(name, ".", name), file2.getCanonicalPath());
            }
            A02 = linkedHashMap;
            r0 = C60340gF.A00;
        } catch (Throwable th) {
            r0 = new 0eQ(th);
        }
        Throwable A002 = 0eR.A00(r0);
        if (A002 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("err in local video scan, ");
            sb.append(A002);
            0KC.A0C("VideoOutputLocalFileUtil", sb.toString());
        }
        AnonymousClass30M.A07(AnonymousClass49C.A01.A00(nanoTime));
    }

    static {
        if (0yU.A07(AnonymousClass0yP.A00(36331115472044960L)) || 0yU.A07(AnonymousClass0yP.A00(36331115472110497L))) {
            0nY.A00().ATE(new C2801850q());
        }
    }
}
