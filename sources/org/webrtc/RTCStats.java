package org.webrtc;

import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.Pxe;
import X.Pxg;
import java.util.Iterator;
import java.util.Map;

public class RTCStats {
    public final String id;
    public final Map members;
    public final long timestampUs;
    public final String type;

    public static void appendValue(StringBuilder sb, Object obj) {
        char c;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    Pxe.A1Y(sb);
                }
                appendValue(sb, objArr[i]);
            }
            c = ']';
        } else if (obj instanceof String) {
            c = '\"';
            sb.append('\"');
            sb.append(obj);
        } else {
            sb.append(obj);
            return;
        }
        sb.append(c);
    }

    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return (double) this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public RTCStats(long j, String str, String str2, Map map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("{ timestampUs: ");
        A1A.append(this.timestampUs);
        A1A.append(AnonymousClass000.A00(2051));
        A1A.append(this.type);
        A1A.append(", id: ");
        A1A.append(this.id);
        Iterator A0u = AnonymousClass7TF.A0u(this.members);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Pxe.A1Y(A1A);
            Pxg.A1S(A1A, A1J);
            A1A.append(": ");
            appendValue(A1A, A1J.getValue());
        }
        return AnonymousClass7TF.A0l(" }", A1A);
    }
}
