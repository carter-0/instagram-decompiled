package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5CF  reason: invalid class name */
public final class AnonymousClass5CF {
    public final UserSession A00;
    public final 1L5 A01;
    public final AnonymousClass5CJ A02;

    public final HashMap A00(String str, List list) {
        String str2;
        String str3;
        List list2 = list;
        0qQ.A0B(list2, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list2) {
            if (((AnonymousClass9IV) next).A00 instanceof C52472GTy) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass9IV r1 = (AnonymousClass9IV) it.next();
            this.A01.EGZ(r1, str);
            C253513qu r11 = (C253513qu) r1.A00;
            0qQ.A0C(r11, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ProfileTapSignalData");
            C52472GTy gTy = (C52472GTy) r11;
            String str4 = ((AnonymousClass9J4) r1.A01).A06;
            String str5 = gTy.A05;
            String str6 = gTy.A06;
            String str7 = gTy.A03;
            String str8 = gTy.A07;
            int ordinal = gTy.A01.ordinal();
            List list3 = gTy.A08;
            long j = gTy.A00;
            String str9 = gTy.A04;
            0qQ.A0B(str7, 0);
            16V r12 = (16V) ((AnonymousClass5CI) this.A02).A00.get(str7);
            if (r12 == null || (str3 = r12.A02) == null) {
                str3 = gTy.A02;
            }
            String str10 = str8;
            String str11 = str7;
            String str12 = str6;
            String str13 = str5;
            String str14 = str4;
            arrayList3.add(new C53348GmY(str14, str13, str12, str11, str10, str9, str3, list3, ordinal, j));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            ((AnonymousClass5CI) this.A02).A00.clear();
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                A0A.A0b();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C53348GmY gmY = (C53348GmY) it2.next();
                    A0A.A0c();
                    A0A.A0R("signal_id", gmY.A08);
                    A0A.A0R("container_module", gmY.A05);
                    A0A.A0R("inventory_source", gmY.A06);
                    A0A.A0R("author_id", gmY.A03);
                    A0A.A0R("item_id", gmY.A07);
                    A0A.A0P("item_type", gmY.A00);
                    A0A.A0q("media_ids");
                    A0A.A0b();
                    for (String A0t : gmY.A09) {
                        A0A.A0t(A0t);
                    }
                    A0A.A0Y();
                    A0A.A0Q("click_timestamp", gmY.A01);
                    A0A.A0R("click_media_id", gmY.A04);
                    A0A.A0R("account_type", gmY.A02);
                    A0A.A0Z();
                }
                A0A.A0Y();
                A0A.close();
                str2 = stringWriter.toString();
            } catch (IOException e) {
                0KC.A0H("ProfileTapRealtimeInfo", "Unable to serialize collection.", e);
                str2 = "";
            }
            hashMap.put("profile_visit", str2);
        }
        return hashMap;
    }

    public /* synthetic */ AnonymousClass5CF(UserSession userSession, 1L5 r4) {
        AnonymousClass5CJ A002 = AnonymousClass5CG.A00(userSession);
        0qQ.A0B(A002, 3);
        this.A00 = userSession;
        this.A01 = r4;
        this.A02 = A002;
    }
}
