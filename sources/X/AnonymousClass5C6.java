package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5C6  reason: invalid class name */
public final class AnonymousClass5C6 {
    public final 1L5 A00;

    public final HashMap A00(String str, List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<AnonymousClass9IV> arrayList2 = new ArrayList<>();
        for (Object next : list2) {
            if (((AnonymousClass9IV) next).A00 instanceof GA8) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(arrayList2, 10));
        for (AnonymousClass9IV r1 : arrayList2) {
            this.A00.EGZ(r1, str);
            C253513qu r5 = (C253513qu) r1.A00;
            0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.LikeClickSignalData");
            GA8 ga8 = (GA8) r5;
            String str2 = ((AnonymousClass9J4) r1.A01).A06;
            String str3 = ga8.A04;
            String str4 = ga8.A05;
            String str5 = ga8.A02;
            String str6 = ga8.A06;
            int ordinal = ga8.A01.ordinal();
            arrayList3.add(new C292715jP(str2, str3, str4, str5, str6, ga8.A03, ga8.A07, ordinal, ga8.A00));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            hashMap.put("like", C292725jQ.A00(arrayList));
        }
        return hashMap;
    }

    public final HashMap A01(String str, List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<AnonymousClass9IV> arrayList2 = new ArrayList<>();
        for (Object next : list2) {
            if (((AnonymousClass9IV) next).A00 instanceof HF7) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(arrayList2, 10));
        for (AnonymousClass9IV r1 : arrayList2) {
            this.A00.EGZ(r1, str);
            C253513qu r5 = (C253513qu) r1.A00;
            0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.UnlikeClickSignalData");
            HF7 hf7 = (HF7) r5;
            String str2 = ((AnonymousClass9J4) r1.A01).A06;
            String str3 = hf7.A04;
            String str4 = hf7.A05;
            String str5 = hf7.A02;
            String str6 = hf7.A06;
            int ordinal = hf7.A01.ordinal();
            arrayList3.add(new C292715jP(str2, str3, str4, str5, str6, hf7.A03, hf7.A07, ordinal, hf7.A00));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            hashMap.put("unlike", C292725jQ.A00(arrayList));
        }
        return hashMap;
    }

    public /* synthetic */ AnonymousClass5C6(1L5 r1) {
        this.A00 = r1;
    }
}
