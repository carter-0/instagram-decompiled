package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5pe  reason: invalid class name and case insensitive filesystem */
public final class C296205pe {
    public final 1L5 A00;

    public final HashMap A00(String str, List list) {
        String str2;
        List list2 = list;
        0qQ.A0B(list2, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<AnonymousClass9IV> arrayList2 = new ArrayList<>();
        for (Object next : list2) {
            if (((AnonymousClass9IV) next).A00 instanceof HFB) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(arrayList2, 10));
        for (AnonymousClass9IV r1 : arrayList2) {
            this.A00.EGZ(r1, str);
            C253513qu r5 = (C253513qu) r1.A00;
            0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.XoutSignalData");
            HFB hfb = (HFB) r5;
            String str3 = ((AnonymousClass9J4) r1.A01).A06;
            String str4 = hfb.A03;
            String str5 = hfb.A04;
            String str6 = hfb.A02;
            String str7 = hfb.A05;
            int ordinal = hfb.A01.ordinal();
            arrayList3.add(new C53349GmZ(str3, str4, str5, str6, str7, hfb.A07, hfb.A06, hfb.A08, ordinal, hfb.A00));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                A0A.A0b();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C53349GmZ gmZ = (C53349GmZ) it.next();
                    A0A.A0c();
                    A0A.A0R("signal_id", gmZ.A07);
                    A0A.A0R("container_module", gmZ.A03);
                    A0A.A0R("inventory_source", gmZ.A04);
                    A0A.A0R("author_id", gmZ.A02);
                    A0A.A0R("item_id", gmZ.A05);
                    A0A.A0P("item_type", gmZ.A00);
                    A0A.A0q("media_ids");
                    A0A.A0b();
                    for (String A0t : gmZ.A09) {
                        A0A.A0t(A0t);
                    }
                    A0A.A0Y();
                    A0A.A0Q("click_timestamp", gmZ.A01);
                    A0A.A0R("click_media_id", gmZ.A08);
                    A0A.A0R("reason", gmZ.A06);
                    A0A.A0Z();
                }
                A0A.A0Y();
                A0A.close();
                str2 = stringWriter.toString();
            } catch (IOException e) {
                0KC.A0H("XoutRealtimeInfo", "Unable to serialize collection.", e);
                str2 = "";
            }
            hashMap.put("xout", str2);
        }
        return hashMap;
    }

    public C296205pe(1L5 r1) {
        this.A00 = r1;
    }
}
