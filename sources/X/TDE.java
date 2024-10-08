package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.util.ArrayList;

public final /* synthetic */ class TDE implements Runnable {
    public final /* synthetic */ C10700Rwe A00;

    public /* synthetic */ TDE(C10700Rwe rwe) {
        this.A00 = rwe;
    }

    public final void run() {
        Cursor rawQuery;
        byte[] bArr;
        C10700Rwe rwe = this.A00;
        C12524SwA swA = (C12524SwA) rwe.A02;
        SQLiteDatabase A03 = swA.A03();
        C12524SwA.A02(A03, swA);
        try {
            SQLiteDatabase A032 = ((C12524SwA) rwe.A01).A03();
            AnonymousClass0fa.A01(A032, -1684447961);
            try {
                rawQuery = A032.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                ArrayList<C9144RQv> A1C = AnonymousClass7TE.A1C();
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(1);
                    if (string != null) {
                        int i = rawQuery.getInt(2);
                        RE0 re0 = (RE0) C11149SCe.A00.get(i);
                        if (re0 != null) {
                            String string2 = rawQuery.getString(3);
                            if (string2 == null) {
                                bArr = null;
                            } else {
                                bArr = Base64.decode(string2, 0);
                            }
                            A1C.add(C9689Rf7.A00(re0, string, bArr));
                        } else {
                            throw DbW.A0a("Unknown Priority for value ", i);
                        }
                    } else {
                        throw AnonymousClass7TE.A11("Null backendName");
                    }
                }
                rawQuery.close();
                A032.setTransactionSuccessful();
                AnonymousClass0fa.A03(A032, 1571926387);
                for (C9144RQv EKM : A1C) {
                    ((Sw9) rwe.A00).EKM(EKM, 1, false);
                }
                A03.setTransactionSuccessful();
            } catch (Throwable th) {
                AnonymousClass0fa.A03(A032, -1029534431);
                throw th;
            }
        } finally {
            AnonymousClass0fa.A03(A03, -274389898);
        }
    }
}
