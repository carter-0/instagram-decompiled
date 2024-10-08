package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class VI3 {
    public static void A00(UserSession userSession, Integer num, String str, String str2, String str3, List list) {
        if (list == null) {
            list = new ArrayList();
        }
        String A00 = VI6.A00(num);
        long A0I = AnonymousClass7TG.A0I();
        String A0j = AnonymousClass7TG.A0j();
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0q("input");
            A0K.A0c();
            A0K.A0R(C273654mx.A00(162), str);
            A0K.A0R("survey_id", str2);
            A0K.A0R("impression_event", A00);
            A0K.A0R("session_blob", str3);
            Iterator A0s = C41845B3m.A0s(A0K, "context", list);
            while (A0s.hasNext()) {
                C17394VTv vTv = (C17394VTv) A0s.next();
                if (vTv != null) {
                    A0K.A0c();
                    String str4 = vTv.A00;
                    if (str4 != null) {
                        A0K.A0R(AnonymousClass000.A00(1228), str4);
                    }
                    String str5 = vTv.A01;
                    if (str5 != null) {
                        A0K.A0R(AnonymousClass000.A00(1229), str5);
                    }
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
            A0K.A0Q("device_time", A0I);
            A0K.A0R("client_mutation_id", A0j);
            A0K.A0R("actor_id", "0");
            A0K.A0Z();
            1ES.A05(C13989Tnp.A0T(new C15622Ufo(num, 15), new C239133Fc(D1L.class, "StructuredSurveyEventLoggingMutation", AnonymousClass7TG.A0k(A0K, stringWriter), false), C46479Dfi.A01(userSession)), 224, 4, false, false);
        } catch (IOException e) {
            0KC.A0G("RapidFeedbackAnalyticsUtil", AnonymousClass000.A00(444), e);
        }
    }
}
