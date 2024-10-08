package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.SmO  reason: case insensitive filesystem */
public final class C12069SmO implements 0LW {
    public final Integer BVJ() {
        return AnonymousClass05K.A0G;
    }

    public final /* synthetic */ boolean CJn(Integer num) {
        return false;
    }

    public final void E34(0AV r10, 0M7 r11) {
        JSONObject jSONObject;
        String str;
        long j;
        long j2;
        S5G s5g;
        ConcurrentLinkedQueue concurrentLinkedQueue = C11339SNv.A04;
        if (!concurrentLinkedQueue.isEmpty()) {
            JSONObject A11 = DbS.A11();
            A11.put("uptimeMillis", SystemClock.uptimeMillis());
            A11.put("currentTimeMillis", System.currentTimeMillis());
            ArrayList A0r = AnonymousClass7TG.A0r(concurrentLinkedQueue);
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                PzN pzN = (PzN) it.next();
                0qQ.A0A(pzN);
                if (pzN instanceof C7846QbU) {
                    C7846QbU qbU = (C7846QbU) pzN;
                    jSONObject = DbS.A11();
                    Map map = qbU.A03;
                    Iterator A0u = AnonymousClass7TF.A0u(map);
                    while (A0u.hasNext()) {
                        C66584MXp.A18(A0u, jSONObject);
                    }
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, qbU.A02);
                    jSONObject.put("thread", qbU.A01);
                    jSONObject.put("renderStateId", qbU.A00);
                    jSONObject.put("timestamp", qbU.A01);
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    str = TraceFieldType.Duration;
                    Object obj = map.get(str);
                    if (!(obj instanceof S5G) || (s5g = (S5G) obj) == null) {
                        j2 = 0;
                    } else {
                        j2 = s5g.A00;
                    }
                    j = timeUnit.toMillis(j2);
                } else if (pzN instanceof PzP) {
                    PzP pzP = (PzP) pzN;
                    jSONObject = DbS.A11();
                    Iterator A0u2 = AnonymousClass7TF.A0u(pzP.A03);
                    while (A0u2.hasNext()) {
                        C66584MXp.A18(A0u2, jSONObject);
                    }
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, pzP.A02);
                    jSONObject.put("thread", pzP.A01);
                    jSONObject.put("renderStateId", pzP.A00);
                    j = pzP.A00;
                    str = "timestamp";
                } else {
                    jSONObject = DbS.A11();
                    A0r.add(jSONObject);
                }
                jSONObject.put(str, j);
                A0r.add(jSONObject);
            }
            A11.put("events", new JSONArray(A0r));
            String obj2 = A11.toString();
            if (obj2 != null && r10 != null) {
                r10.A03(AnonymousClass0LO.A6j, obj2);
            }
        }
    }
}
