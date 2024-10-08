package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Sq3  reason: case insensitive filesystem */
public abstract class C12249Sq3 implements C13440TaT {
    public final String A00;
    public final HashMap A01 = AnonymousClass7TE.A1E();

    public final synchronized Object A01(C13718Tfj tfj) {
        HashMap hashMap;
        try {
            hashMap = this.A01;
            if (!hashMap.containsKey(tfj)) {
                hashMap.put(tfj, tfj.CDV().newInstance());
            }
        } catch (Exception e) {
            throw Pxe.A0u(String.format("Incorrect usage for %s type %s", new Object[]{tfj.BK1(), tfj.CDV()}), e);
        }
        return hashMap.get(tfj);
    }

    public final synchronized JSONObject A02(boolean z) {
        JSONObject jSONObject;
        boolean z2 = this instanceof C7865Qbp;
        synchronized (this) {
            if (z2) {
                jSONObject = DbS.A11();
                Iterator A0s = AnonymousClass7TF.A0s(this.A01);
                long j = 0;
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    switch (((RJ2) A1J.getKey()).ordinal()) {
                        case 0:
                        case 1:
                            j += ((AtomicLong) A1J.getValue()).longValue();
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        case 13:
                            if (!z) {
                                jSONObject.putOpt(((C13718Tfj) A1J.getKey()).BK1(), A1J.getValue());
                                break;
                            } else {
                                jSONObject.putOpt(((C13718Tfj) A1J.getKey()).BK1(), Long.valueOf(((AtomicLong) A1J.getValue()).getAndSet(0)));
                                continue;
                            }
                    }
                    jSONObject.putOpt(((C13718Tfj) A1J.getKey()).BK1(), A1J.getValue());
                }
                jSONObject.putOpt("mt", Long.valueOf(j));
            } else {
                jSONObject = DbS.A11();
                Iterator A0s2 = AnonymousClass7TF.A0s(this.A01);
                while (A0s2.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
                    jSONObject.putOpt(((C13718Tfj) A1J2.getKey()).BK1(), A1J2.getValue());
                }
            }
        }
        return jSONObject;
    }

    public final synchronized void A03(C13718Tfj tfj, Object obj) {
        this.A01.put(tfj, obj);
    }

    public final String toString() {
        try {
            return A02(false).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public C12249Sq3(String str) {
        this.A00 = str;
    }

    public static void A00(C13718Tfj tfj, C12249Sq3 sq3) {
        ((AtomicLong) sq3.A01(tfj)).incrementAndGet();
    }
}
