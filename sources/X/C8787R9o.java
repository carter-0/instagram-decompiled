package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.R9o  reason: case insensitive filesystem */
public final class C8787R9o extends 0ng {
    public final /* synthetic */ AnonymousClass9D3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8787R9o(AnonymousClass9D3 r3) {
        super(4, 4, false, false);
        this.A00 = r3;
    }

    public final void run() {
        AnonymousClass9D3 r4;
        try {
            r4 = this.A00;
            AnonymousClass9D6 r6 = r4.A00;
            UserSession userSession = r6.A02;
            if (182.A06(0Tu.A05, userSession, 36310774506848530L)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                ArrayList A1C = AnonymousClass7TE.A1C();
                Context context = r6.A00;
                A1C.add(new C12290Sqo(new C10953S2l(context, userSession)));
                A1C.add(new C12287Sql(context));
                A1C.add(new C12289Sqn(context, C12289Sqn.A02));
                A1C.add(new C12288Sqm(context));
                Iterator it = A1C.iterator();
                while (it.hasNext()) {
                    C13723Tfp tfp = (C13723Tfp) it.next();
                    String CfJ = tfp.CfJ();
                    if (A1E.containsKey(CfJ)) {
                        String A0R = 002.A0R("Provider keys must be unique. Conflict on key: ", CfJ);
                        0I2 r1 = 0I1.A00;
                        if (r1.isLoggable(6)) {
                            r1.wtf("BigFootReporter", A0R);
                        }
                    } else {
                        HashMap E4i = tfp.E4i();
                        if (E4i != null && !E4i.isEmpty()) {
                            A1E.put(CfJ, E4i);
                        }
                    }
                }
                if (!A1E.isEmpty()) {
                    0Aj A0d = C51969G9p.A0d(r6.A01, "big_foot_reporter_event");
                    if (A0d.isSampled()) {
                        JSONObject A11 = DbS.A11();
                        Iterator A0s = AnonymousClass7TF.A0s(A1E);
                        while (A0s.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                            String A13 = DbT.A13(A1J);
                            JSONObject A112 = DbS.A11();
                            Iterator A0u = AnonymousClass7TF.A0u((Map) A1J.getValue());
                            while (A0u.hasNext()) {
                                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u);
                                A112.put(DbT.A13(A1J2), ((C13585TdB) A1J2.getValue()).Ezz());
                            }
                            A11.put(A13, A112);
                        }
                        A0d.AAJ("provider_data", DbT.A10(A11));
                        A0d.A7p(TraceFieldType.IsForeground, false);
                        A0d.Cgf();
                    }
                }
            }
        } catch (JSONException e) {
            0KC.A0J("IG4ABigFootReporter", "Json parsing failed for the big foot event", e);
        } catch (Throwable th) {
            this.A00.A01.A00();
            throw th;
        }
        r4.A01.A00();
    }
}
