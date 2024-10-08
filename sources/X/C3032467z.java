package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.67z  reason: invalid class name and case insensitive filesystem */
public final class C3032467z implements 29o {
    public final Integer A00;

    public final Map B3P(UserSession userSession, File file) {
        String str;
        int i;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(file, 1);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36322766056925594L)) {
            if (182.A06(r2, userSession, 36322766056335764L)) {
                File file2 = new File(file, "msys_debug");
                if (file2.exists() || file2.mkdirs()) {
                    int intValue = this.A00.intValue();
                    switch (intValue) {
                        case 1:
                            str = "reverb_db";
                            break;
                        case 2:
                            str = "crypto_db";
                            break;
                        case 3:
                            str = "incoming_db";
                            break;
                        default:
                            str = "encrypted_backups_db";
                            break;
                    }
                    File file3 = new File(file2, 002.A0R(str, ".bin"));
                    1bj r22 = C65291bk.A00;
                    if (r22 == null) {
                        0qQ.A0F("plugin");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    String obj = Uri.fromFile(file3).toString();
                    0qQ.A07(obj);
                    switch (intValue) {
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        default:
                            i = 4;
                            break;
                    }
                    int EB5 = r22.EB5(userSession, obj, i);
                    if (EB5 == 0) {
                        arrayList.add(file3);
                    } else {
                        0KC.A0O("IgMsysBugReportLogAuxDBFileMapProvider", "copyAndRedactDatabase for DB %d failed with error code: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(EB5)});
                    }
                } else {
                    0KC.A0C("IgMsysBugReportLogAuxDBFileMapProvider", "Failed to create msys debug file directory: msys_debug");
                }
            }
            arrayList.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file4 = (File) it.next();
                hashMap.put(file4.getName(), Uri.fromFile(file4));
                file4.getName();
            }
        }
        return hashMap;
    }

    public final boolean CK5(UserSession userSession, String str) {
        return true;
    }

    public final void Epo(long j) {
    }

    public final String getTag() {
        return "IgMsysBugReportLogAuxDBFileMapProvider";
    }

    public C3032467z(Integer num) {
        this.A00 = num;
    }
}
