package X;

import android.net.Uri;
import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.67y  reason: invalid class name and case insensitive filesystem */
public final class C3032367y implements 29o {
    public final Mailbox A00;

    public final Map B3P(UserSession userSession, File file) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(file, 1);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, userSession, 36322766056860057L)) {
            if (182.A06(r5, userSession, 36322766056860057L) && 182.A06(r5, userSession, 36322766056401301L)) {
                File[] A002 = ((C3032167w) userSession.A01(C3032167w.class, new C73920Pm0(userSession, 35))).A00(file);
                if (A002 == null) {
                    0KC.A0C("igMsysBugReportLogExtensiveLogFilesMapProvider", "Failed to copy Msys logcat log files");
                } else {
                    018.A18(arrayList, A002);
                }
            }
            arrayList.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file2 = (File) it.next();
                hashMap.put(file2.getName(), Uri.fromFile(file2));
                file2.getName();
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
        return "igMsysBugReportLogExtensiveLogFilesMapProvider";
    }

    public C3032367y(Mailbox mailbox) {
        this.A00 = mailbox;
    }
}
