package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Map;

/* renamed from: X.475  reason: invalid class name */
public abstract class AnonymousClass475 {
    public final String A00;

    public AnonymousClass475(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public int A00() {
        if (this instanceof AnonymousClass4j7) {
            return 3;
        }
        return 1;
    }

    public Map A01() {
        0eP r4;
        0eP r3;
        Object obj;
        String str;
        if (this instanceof AnonymousClass4j7) {
            AnonymousClass4j7 r2 = (AnonymousClass4j7) this;
            r4 = new 0eP("error_message", r2.A03);
            r3 = new 0eP("response_status_code", Integer.valueOf(r2.A01));
            obj = r2.A02;
            str = "request_error_type";
        } else {
            AnonymousClass4j6 r22 = (AnonymousClass4j6) this;
            r4 = new 0eP(AnonymousClass000.A00(1766), r22.A02);
            r3 = new 0eP(TraceFieldType.StatusCode, Integer.valueOf(r22.A00));
            obj = r22.A01;
            str = "error_message";
        }
        return 0Yt.A06(new 0eP[]{r4, r3, new 0eP(str, obj)});
    }

    public void A02(StringBuilder sb) {
        String str;
        if (this instanceof AnonymousClass4j6) {
            AnonymousClass4j6 r2 = (AnonymousClass4j6) this;
            sb.append(r2.A02);
            sb.append("|");
            sb.append(r2.A00);
            sb.append("|");
            str = r2.A01;
        } else {
            AnonymousClass4j7 r22 = (AnonymousClass4j7) this;
            sb.append(r22.A00);
            sb.append("|");
            sb.append(r22.A03);
            sb.append("|");
            sb.append(r22.A01);
            sb.append("|");
            sb.append(r22.A02);
            sb.append("|");
            str = r22.A04;
        }
        sb.append(str);
    }

    public String toString() {
        return this.A00;
    }
}
