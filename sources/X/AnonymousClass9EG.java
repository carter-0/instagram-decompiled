package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9EG  reason: invalid class name */
public final class AnonymousClass9EG implements C61110lV {
    public final /* synthetic */ AnonymousClass9EF A00;

    public AnonymousClass9EG(AnonymousClass9EF r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-836549613);
        14i r0 = 14i.A08;
        long currentTimeMillis = System.currentTimeMillis() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        AnonymousClass9EF r6 = this.A00;
        long j = currentTimeMillis - r6.A00;
        UserSession userSession = r6.A05;
        if (j >= ((long) (1000.0d * 182.A00(0Tu.A06, userSession, 37155822207369230L))) && j <= TimeUnit.HOURS.toMillis(24)) {
            C8759R8k r8k = new C8759R8k(r6);
            String BcO = C60510iO.A00(userSession).BcO();
            if (BcO == null || BcO.length() == 0) {
                0wb.A03(Pxd.A00(875), "Pigeon session id is null");
            } else {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = AnonymousClass2yJ.A00;
                for (Map.Entry entry : hashMap.entrySet()) {
                    2IV r4 = new 2IV();
                    r4.A09((String) entry.getKey(), AnonymousClass000.A00(1228));
                    r4.A09((String) entry.getValue(), AnonymousClass000.A00(1229));
                    arrayList.add(r4);
                }
                ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
                0qQ.A07(copyOf);
                hashMap.clear();
                2IS r7 = new 2IS();
                2IS r62 = new 2IS();
                r7.A04(C46326Dbu.A01(9, 10, 45), BcO);
                r7.A04(C273654mx.A00(162), "449092836056930");
                r7.A05("survey_context_data", copyOf);
                AnonymousClass2IY r02 = PandoGraphQLRequest.Companion;
                1vm.A01(userSession).A06(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "SessionSurveyUriQuery", r7.getParamsCopy(), r62.getParamsCopy(), C7779QWq.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_end_session_survey_uri_root_query", new ArrayList()), r8k);
            }
        }
        AnonymousClass0fD.A0A(-480622648, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-1231753962);
        AnonymousClass9EF r6 = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        r6.A00 = currentTimeMillis;
        long j = currentTimeMillis - 1Au.A00(r6.A05).A01.getLong(C66579MXk.A00(346), 0);
        if (r6.A03 && TimeUnit.MILLISECONDS.toMinutes(j) >= 5) {
            1Xz.A00().A03((Runnable) null, C66579MXk.A00(1130), 0);
            r6.A03 = false;
        }
        AnonymousClass0fD.A0A(-1010960715, A03);
    }
}
