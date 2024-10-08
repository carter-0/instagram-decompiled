package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.67w  reason: invalid class name and case insensitive filesystem */
public final class C3032167w implements AnonymousClass0lh {
    public final AnonymousClass6AI A00;

    public final File[] A00(File file) {
        File[] fileArr;
        AnonymousClass6AI r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        OTA ota = r0.A00;
        synchronized (ota) {
            File[] fileArr2 = (File[]) OTA.A00("list temp directory", new C73920Pm0(ota, 34));
            if (fileArr2 != null) {
                List A0A = 03t.A0A(new C41280ArL(), fileArr2);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object next : A0A) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    File file2 = (File) next;
                    StringBuilder sb = new StringBuilder();
                    sb.append("copy file: ");
                    sb.append(file2);
                    File file3 = (File) OTA.A00(sb.toString(), new GL8(i, 12, file, file2));
                    if (file3 != null) {
                        arrayList.add(file3);
                    }
                    i = i2;
                }
                fileArr = (File[]) arrayList.toArray(new File[0]);
            } else {
                fileArr = null;
            }
        }
        return fileArr;
    }

    public final void onSessionWillEnd() {
        AnonymousClass6AI r1 = this.A00;
        if (r1 != null) {
            try {
                r1.A02.interrupt();
            } finally {
                AnonymousClass6AI.A00(r1);
            }
        }
    }

    public C3032167w(AnonymousClass6AI r1) {
        this.A00 = r1;
    }
}
