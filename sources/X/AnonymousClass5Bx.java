package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Bx  reason: invalid class name */
public final class AnonymousClass5Bx {
    public final 1L5 A00;

    public final HashMap A00(String str, List list) {
        String str2;
        List list2 = list;
        0qQ.A0B(list2, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<AnonymousClass9IV> arrayList2 = new ArrayList<>();
        for (Object next : list2) {
            if (((AnonymousClass9IV) next).A00 instanceof HF5) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(arrayList2, 10));
        for (AnonymousClass9IV r1 : arrayList2) {
            this.A00.EGZ(r1, str);
            C253513qu r5 = (C253513qu) r1.A00;
            0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.CtaClickSignalData");
            HF5 hf5 = (HF5) r5;
            String str3 = ((AnonymousClass9J4) r1.A01).A06;
            String str4 = hf5.A04;
            String str5 = hf5.A05;
            String str6 = hf5.A02;
            String str7 = hf5.A06;
            int ordinal = hf5.A01.ordinal();
            arrayList3.add(new C70730OHz(str3, str4, str5, str6, str7, hf5.A03, hf5.A07, ordinal, hf5.A00));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                A0A.A0b();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C70730OHz oHz = (C70730OHz) it.next();
                    A0A.A0c();
                    A0A.A0R("signal_id", oHz.A07);
                    A0A.A0R("container_module", oHz.A04);
                    A0A.A0R("inventory_source", oHz.A05);
                    A0A.A0R("author_id", oHz.A02);
                    A0A.A0R("item_id", oHz.A06);
                    A0A.A0P("item_type", oHz.A00);
                    A0A.A0q("media_ids");
                    A0A.A0b();
                    for (String A0t : oHz.A08) {
                        A0A.A0t(A0t);
                    }
                    A0A.A0Y();
                    A0A.A0Q("click_timestamp", oHz.A01);
                    A0A.A0R("click_media_id", oHz.A03);
                    A0A.A0Z();
                }
                A0A.A0Y();
                A0A.close();
                str2 = stringWriter.toString();
            } catch (IOException e) {
                0KC.A0H("CtaClickRealtimeInfo", "Unable to serialize collection.", e);
                str2 = "";
            }
            hashMap.put("cta", str2);
        }
        return hashMap;
    }

    public AnonymousClass5Bx(1L5 r1) {
        this.A00 = r1;
    }
}
