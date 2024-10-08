package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5sz  reason: invalid class name and case insensitive filesystem */
public final class C298165sz implements C298175t0 {
    public final C298195t2 A00;
    public final 1Kv A01;
    public final C282125Bt A02;

    public final HashMap AUQ(String str) {
        String str2;
        1Kv r1 = this.A01;
        List ELB = r1.ELB(this.A02);
        r1.EEd(ELB);
        C298195t2 r9 = this.A00;
        0qQ.A0B(ELB, 0);
        HashMap hashMap = new HashMap();
        ArrayList<AnonymousClass9IV> arrayList = new ArrayList<>();
        for (Object next : ELB) {
            if (((AnonymousClass9IV) next).A00 instanceof HF9) {
                arrayList.add(next);
            }
        }
        ArrayList<AnonymousClass9JP> arrayList2 = new ArrayList<>(0Yv.A1E(arrayList, 10));
        for (AnonymousClass9IV r12 : arrayList) {
            r9.A00.EGZ(r12, str);
            C253513qu r4 = (C253513qu) r12.A00;
            0qQ.A0C(r4, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.AdClickSignalData");
            HF9 hf9 = (HF9) r4;
            String str3 = ((AnonymousClass9J4) r12.A01).A06;
            boolean z = hf9.A08;
            String str4 = hf9.A03;
            String str5 = hf9.A04;
            String str6 = hf9.A05;
            int ordinal = hf9.A01.ordinal();
            List list = hf9.A07;
            String str7 = hf9.A06;
            long j = hf9.A00;
            String str8 = str7;
            String str9 = hf9.A02;
            arrayList2.add(new AnonymousClass9JP(str3, str4, str5, str6, str9, str8, list, ordinal, 0, j, z));
        }
        if (!arrayList2.isEmpty()) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                A0A.A0b();
                for (AnonymousClass9JP r7 : arrayList2) {
                    A0A.A0c();
                    A0A.A0S("is_ad_click", r7.A0A);
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
                0KC.A0H("AdClickRealTimeInfo", "Unable to serialize collection.", e);
                str2 = "";
            }
            hashMap.put("ad_click", str2);
        }
        return hashMap;
    }

    public /* synthetic */ C298165sz(UserSession userSession, 1L5 r6, C230432pc r7) {
        1Kv A002 = 1Kt.A00(userSession);
        C298185t1 r2 = new C298185t1(r7);
        C298195t2 r1 = new C298195t2(r6);
        0qQ.A0B(A002, 4);
        this.A01 = A002;
        this.A02 = r2;
        this.A00 = r1;
    }
}
