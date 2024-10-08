package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5pX  reason: invalid class name and case insensitive filesystem */
public final class C296135pX {
    public final 1L5 A00;

    public final HashMap A00(String str, List list) {
        String str2;
        List list2 = list;
        0qQ.A0B(list2, 0);
        HashMap hashMap = new HashMap();
        ArrayList<AnonymousClass9IV> arrayList = new ArrayList<>();
        for (Object next : list2) {
            if (((AnonymousClass9IV) next).A00 instanceof HFA) {
                arrayList.add(next);
            }
        }
        ArrayList<AnonymousClass9JP> arrayList2 = new ArrayList<>(0Yv.A1E(arrayList, 10));
        for (AnonymousClass9IV r1 : arrayList) {
            this.A00.EGZ(r1, str);
            C253513qu r5 = (C253513qu) r1.A00;
            0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.IABNoBounceSignalData");
            HFA hfa = (HFA) r5;
            String str3 = ((AnonymousClass9J4) r1.A01).A06;
            boolean z = hfa.A08;
            String str4 = hfa.A03;
            String str5 = hfa.A04;
            String str6 = hfa.A05;
            int ordinal = hfa.A01.ordinal();
            List list3 = hfa.A07;
            arrayList2.add(new AnonymousClass9JP(str3, str4, str5, str6, hfa.A02, hfa.A06, list3, ordinal, 1, hfa.A00, z));
        }
        if (!arrayList2.isEmpty()) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                A0A.A0b();
                for (AnonymousClass9JP r7 : arrayList2) {
                    A0A.A0c();
                    A0A.A0S("is_no_bounce_client_logging", r7.A0A);
                    A0A.A0R("signal_id", r7.A08);
                    A0A.A0R("container_module", r7.A05);
                    A0A.A0R("inventory_source", r7.A06);
                    A0A.A0R("tracking_token", r7.A09);
                    A0A.A0R("item_id", r7.A07);
                    A0A.A0P("item_type", r7.A01);
                    A0A.A0q("media_ids");
                    A0A.A0b();
                    for (String A0t : (List) r7.A03) {
                        A0A.A0t(A0t);
                    }
                    A0A.A0Y();
                    A0A.A0Q("click_timestamp", r7.A02);
                    A0A.A0R("click_media_id", r7.A04);
                    A0A.A0Z();
                }
                A0A.A0Y();
                A0A.close();
                str2 = stringWriter.toString();
            } catch (IOException e) {
                0KC.A0H("IABNoBounceRealTimeInfo", "Unable to serialize collection.", e);
                str2 = "";
            }
            hashMap.put("iab_no_bounce", str2);
        }
        return hashMap;
    }

    public C296135pX(1L5 r1) {
        this.A00 = r1;
    }
}
