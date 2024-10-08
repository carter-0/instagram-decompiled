package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.Mp5  reason: case insensitive filesystem */
public final class C67510Mp5 extends 0ng {
    public final /* synthetic */ C67502Mow A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67510Mp5(C67502Mow mow, boolean z) {
        super(1927605572, 3, false, true);
        this.A01 = z;
        this.A00 = mow;
    }

    public final void run() {
        1WY r14;
        Cursor cursor;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String str4;
        try {
            C67508Mp3 mp3 = C67508Mp3.A00;
            C67509Mp4 mp4 = C67509Mp4.A00;
            List<C69567NoB> A1P = 0sr.A1P(new C68684NSq[]{mp3, mp4});
            C67502Mow mow = this.A00;
            for (C69567NoB noB : A1P) {
                if (0qQ.A0K(noB, mp4)) {
                    C67514Mp9 A002 = mow.A05.A00();
                    TreeMap treeMap = 1WY.A08;
                    r14 = 1Wa.A00("SELECT * FROM bff_ranked_user_model", 0);
                    C251983oI r0 = A002.A01;
                    r0.assertNotSuspendingTransaction();
                    cursor = r0.query((AnonymousClass1WA) r14, (CancellationSignal) null);
                    try {
                        int A012 = 1Wd.A01(cursor, "igid");
                        int A013 = 1Wd.A01(cursor, "entity_type");
                        int A014 = 1Wd.A01(cursor, "score");
                        int A015 = 1Wd.A01(cursor, MYM.A00(61, 8, 3));
                        int A016 = 1Wd.A01(cursor, "profile_picture_url");
                        arrayList = new ArrayList(cursor.getCount());
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(A012);
                            String string2 = cursor.getString(A013);
                            double d = cursor.getDouble(A014);
                            if (cursor.isNull(A015)) {
                                str3 = null;
                            } else {
                                str3 = cursor.getString(A015);
                            }
                            if (cursor.isNull(A016)) {
                                str4 = null;
                            } else {
                                str4 = cursor.getString(A016);
                            }
                            arrayList.add(new C67515MpA(new N49(str3, str4, 21), string, string2, d));
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor.close();
                        r14.A00();
                    }
                } else if (0qQ.A0K(noB, mp3)) {
                    C67511Mp6 A017 = mow.A05.A01();
                    TreeMap treeMap2 = 1WY.A08;
                    r14 = 1Wa.A00("SELECT * FROM call_recipients_ranked_user_model", 0);
                    C251983oI r02 = A017.A01;
                    r02.assertNotSuspendingTransaction();
                    cursor = r02.query((AnonymousClass1WA) r14, (CancellationSignal) null);
                    int A018 = 1Wd.A01(cursor, "igid");
                    int A019 = 1Wd.A01(cursor, "entity_type");
                    int A0110 = 1Wd.A01(cursor, "score");
                    int A0111 = 1Wd.A01(cursor, MYM.A00(61, 8, 3));
                    int A0112 = 1Wd.A01(cursor, "profile_picture_url");
                    arrayList = new ArrayList(cursor.getCount());
                    while (cursor.moveToNext()) {
                        String string3 = cursor.getString(A018);
                        String string4 = cursor.getString(A019);
                        double d2 = cursor.getDouble(A0110);
                        if (cursor.isNull(A0111)) {
                            str = null;
                        } else {
                            str = cursor.getString(A0111);
                        }
                        if (cursor.isNull(A0112)) {
                            str2 = null;
                        } else {
                            str2 = cursor.getString(A0112);
                        }
                        arrayList.add(new C67513Mp8(new N49(str, str2, 21), string3, string4, d2));
                    }
                } else {
                    th = AnonymousClass7TE.A1K();
                    throw th;
                }
                cursor.close();
                r14.A00();
                00k.A0g(arrayList, new C73429PcU(1));
                List A0d = 00k.A0d(C67502Mow.A00(mow, arrayList), Math.min(100, arrayList.size()));
                mow.A07.put(noB, A0d);
                mow.A02.accept(new C67512Mp7(noB, A0d));
            }
            if (this.A01) {
                C67502Mow.A01(mow);
            }
        } catch (SQLiteDiskIOException | SQLiteException e) {
            0wj.A01.AEf(AnonymousClass7TF.A0m("Error retrieving Ranking Models: ", e), 20134288);
        }
    }
}
