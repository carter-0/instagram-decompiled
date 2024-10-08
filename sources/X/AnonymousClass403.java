package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.Example;
import com.facebook.odin.model.ExampleContext;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.FeatureData$$serializer;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.403  reason: invalid class name */
public final class AnonymousClass403 implements AnonymousClass404 {
    public final AnonymousClass0JP A00;
    public final C258743zZ A01;
    public final AnonymousClass402 A02;

    public AnonymousClass403(AnonymousClass0JP r2, AnonymousClass402 r3, C258743zZ r4) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 2);
        0qQ.A0B(r2, 3);
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = r2;
    }

    /* JADX INFO: finally extract failed */
    public final List Aao() {
        ExampleContext exampleContext;
        AnonymousClass402 r5 = this.A02;
        C258743zZ r0 = this.A01;
        String CCP = r0.CCP();
        String CCS = r0.CCS();
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("\n        SELECT * FROM examples\n        WHERE use_case = ?\n        AND use_case_version = ?\n        ", 2);
        A002.ADh(1, CCP);
        A002.ADh(2, CCS);
        C251983oI r02 = r5.A01;
        r02.assertNotSuspendingTransaction();
        Cursor query = r02.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(query, "example_id");
            int A014 = 1Wd.A01(query, "use_case");
            int A015 = 1Wd.A01(query, "use_case_version");
            int A016 = 1Wd.A01(query, "model_version");
            int A017 = 1Wd.A01(query, "label");
            int A018 = 1Wd.A01(query, "features");
            int A019 = 1Wd.A01(query, "timestamp");
            int A0110 = 1Wd.A01(query, "label_timestamp");
            int A0111 = 1Wd.A01(query, "context");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i = query.getInt(A012);
                String string = query.getString(A013);
                String string2 = query.getString(A014);
                String string3 = query.getString(A015);
                long j = query.getLong(A016);
                long j2 = query.getLong(A017);
                arrayList.add(new AnonymousClass48E(string, string2, string3, query.getString(A018), query.getString(A0111), i, j, j2, query.getLong(A019), query.getLong(A0110)));
            }
            query.close();
            A002.A00();
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass48E r6 = (AnonymousClass48E) it.next();
                String str = r6.A06;
                String str2 = r6.A05;
                if (str2.length() == 0) {
                    exampleContext = ExampleContext.A05;
                } else {
                    exampleContext = new ExampleContext((Type) null, str2, 30);
                }
                C250873mC r8 = C250863mB.A03;
                String str3 = r6.A07;
                C255453u9 r2 = C255453u9.A01;
                C255463uA[] r03 = FeatureData.A0E;
                HashMap hashMap = (HashMap) r8.A00(str3, new AnonymousClass40T(r2, FeatureData$$serializer.INSTANCE));
                long j3 = r6.A00;
                Type type = Type.LONG;
                hashMap.put("2474", new FeatureData(type, "2474", (String) null, (List) null, 0.0d, 16376, j3));
                hashMap.put("100001", new FeatureData(type, "100001", (String) null, (List) null, 0.0d, 16376, r6.A03));
                hashMap.put("100002", new FeatureData(type, "100002", (String) null, (List) null, 0.0d, 16376, r6.A01));
                arrayList2.add(new Example(exampleContext, str, hashMap));
            }
            return arrayList2;
        } catch (Throwable th) {
            query.close();
            A002.A00();
            throw th;
        }
    }

    public final void EDD() {
        AnonymousClass402 r1 = this.A02;
        C258743zZ r0 = this.A01;
        String CCP = r0.CCP();
        String CCS = r0.CCS();
        C251983oI r3 = r1.A01;
        r3.assertNotSuspendingTransaction();
        1Vg r2 = r1.A02;
        AnonymousClass1WV acquire = r2.acquire();
        acquire.ADh(1, CCP);
        acquire.ADh(2, CCS);
        try {
            r3.beginTransaction();
            acquire.ATQ();
            r3.setTransactionSuccessful();
            r3.endTransaction();
            r2.release(acquire);
        } catch (Throwable th) {
            r2.release(acquire);
            throw th;
        }
    }

    public final void EyW(List list) {
        AnonymousClass402 r1 = this.A02;
        List<Example> list2 = list;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
        for (Example example : list2) {
            String str = example.A01;
            C258743zZ r3 = this.A01;
            String CCP = r3.CCP();
            String CCS = r3.CCS();
            long BTh = r3.BTh();
            C250873mC r8 = C250863mB.A03;
            HashMap hashMap = example.A02;
            C255453u9 r6 = C255453u9.A01;
            C255463uA[] r32 = FeatureData.A0E;
            arrayList.add(new AnonymousClass48E(str, CCP, CCS, r8.A02(hashMap, new AnonymousClass40T(r6, FeatureData$$serializer.INSTANCE)), example.A00.A01, 0, BTh, -1, this.A00.now(), 0));
        }
        C251983oI r2 = r1.A01;
        r2.assertNotSuspendingTransaction();
        r2.beginTransaction();
        try {
            r1.A00.insert(arrayList);
            r2.setTransactionSuccessful();
        } finally {
            r2.endTransaction();
        }
    }
}
