package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5pu  reason: invalid class name and case insensitive filesystem */
public final class C296345pu {
    public final 1L5 A00;

    public final HashMap A00(String str, String str2, List list) {
        String str3;
        List list2 = list;
        0qQ.A0B(list2, 1);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<AnonymousClass9IV> arrayList2 = new ArrayList<>();
        for (Object next : list2) {
            if (((AnonymousClass9IV) next).A00 instanceof GA9) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(arrayList2, 10));
        for (AnonymousClass9IV r1 : arrayList2) {
            this.A00.EGZ(r1, str2);
            C253513qu r5 = (C253513qu) r1.A00;
            0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.GeneralSignalData");
            GA9 ga9 = (GA9) r5;
            String str4 = ((AnonymousClass9J4) r1.A01).A06;
            String str5 = ga9.A03;
            String str6 = ga9.A04;
            String str7 = ga9.A02;
            String str8 = ga9.A05;
            int ordinal = ga9.A01.ordinal();
            arrayList3.add(new C292505j4(str4, str5, str6, str7, str8, ga9.A06, ga9.A07, ordinal, ga9.A00));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                A0A.A0b();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C292505j4 r6 = (C292505j4) it.next();
                    A0A.A0c();
                    A0A.A0R("signal_id", r6.A07);
                    A0A.A0R("container_module", r6.A04);
                    A0A.A0R("inventory_source", r6.A05);
                    A0A.A0R("author_id", r6.A02);
                    A0A.A0R("item_id", r6.A06);
                    A0A.A0P("item_type", r6.A00);
                    A0A.A0q("media_ids");
                    A0A.A0b();
                    for (String A0t : r6.A08) {
                        A0A.A0t(A0t);
                    }
                    A0A.A0Y();
                    A0A.A0Q("click_timestamp", r6.A01);
                    A0A.A0R("click_media_id", r6.A03);
                    A0A.A0Z();
                }
                A0A.A0Y();
                A0A.close();
                str3 = stringWriter.toString();
            } catch (IOException e) {
                0KC.A0H("GeneralSignalRealtimeInfo", "Unable to serialize collection.", e);
                str3 = "";
            }
            hashMap.put(str, str3);
        }
        return hashMap;
    }

    public C296345pu(1L5 r1) {
        this.A00 = r1;
    }
}
