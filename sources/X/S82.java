package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public abstract class S82 {
    static {
        0qQ.A07(AnonymousClass389.A01("DiagnosticsWrkr"));
    }

    /* JADX INFO: finally extract failed */
    public static final void A00(AnonymousClass392 r11, AnonymousClass393 r12, AnonymousClass391 r13, List list) {
        Integer num;
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(002.A0g("\n Id \t Class Name\t ", "Job Id", "\t State\t Unique Name\t Tags\t"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3DG r7 = (AnonymousClass3DG) it.next();
            C255383u2 C3e = r11.C3e(C255363u0.A00(r7));
            if (C3e != null) {
                num = Integer.valueOf(C3e.A01);
            } else {
                num = null;
            }
            String str2 = r7.A0M;
            TreeMap treeMap = 1WY.A08;
            1WY A00 = 1Wa.A00("SELECT name FROM workname WHERE work_spec_id=?", 1);
            A00.ADh(1, str2);
            C251983oI r0 = ((Sg8) r12).A01;
            r0.assertNotSuspendingTransaction();
            Cursor query = r0.query((AnonymousClass1WA) A00, (CancellationSignal) null);
            try {
                ArrayList A0o = AnonymousClass7TF.A0o(query);
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        str = null;
                    } else {
                        str = query.getString(0);
                    }
                    A0o.add(str);
                }
                query.close();
                A00.A00();
                String A0P = 00k.A0P(",", "", "", A0o, (0sP) null);
                String A0P2 = 00k.A0P(",", "", "", r13.C40(str2), (0sP) null);
                StringBuilder A1A2 = AnonymousClass7TE.A1A();
                A1A2.append(10);
                A1A2.append(str2);
                A1A2.append("\t ");
                A1A2.append(r7.A0I);
                A1A2.append("\t ");
                A1A2.append(num);
                A1A2.append("\t ");
                Pxg.A1P(r7.A0E.name(), "\t ", A0P, A1A2);
                A1A2.append("\t ");
                A1A2.append(A0P2);
                A1A2.append(9);
                Pxf.A1O(A1A, A1A2);
            } catch (Throwable th) {
                query.close();
                A00.A00();
                throw th;
            }
        }
        0qQ.A07(A1A.toString());
    }
}
