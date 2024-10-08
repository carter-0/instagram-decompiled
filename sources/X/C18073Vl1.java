package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Vl1  reason: case insensitive filesystem */
public final class C18073Vl1 {
    public final int A00;
    public final int A01;

    public final void A03(String str, Object obj) {
        0qQ.A0B(obj, 1);
        int i = this.A01;
        int i2 = this.A00;
        QuickPerformanceLogger quickPerformanceLogger = VJT.A00;
        if (quickPerformanceLogger != null) {
            String str2 = str;
            if (obj instanceof Integer) {
                quickPerformanceLogger.markerAnnotate(i, i2, str, AnonymousClass7TE.A0M(obj));
            } else if (obj instanceof String) {
                quickPerformanceLogger.markerAnnotate(i, i2, str, (String) obj);
            } else if (obj instanceof Long) {
                quickPerformanceLogger.markerAnnotate(i, i2, str2, AnonymousClass7TE.A0R(obj));
            } else if (obj instanceof Double) {
                quickPerformanceLogger.markerAnnotate(i, i2, str2, JTO.A00(obj));
            } else if (obj instanceof Boolean) {
                quickPerformanceLogger.markerAnnotate(i, i2, str, AnonymousClass7TE.A1a(obj));
            }
        } else {
            throw new C16686V1p();
        }
    }

    public final void A00(String str) {
        VJT.A00(this.A01, this.A00, str);
    }

    public final void A01(String str) {
        VJT.A00(this.A01, this.A00, 002.A0R(str, "_END"));
    }

    public final void A02(String str) {
        VJT.A00(this.A01, this.A00, 002.A0R(str, "_START"));
    }

    public final void A04(String str, short s) {
        int i = this.A01;
        int i2 = this.A00;
        VJT.A00(i, i2, str);
        QuickPerformanceLogger quickPerformanceLogger = VJT.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(i, i2, s);
            return;
        }
        throw new C16686V1p();
    }

    public final void A05(short s) {
        int i = this.A01;
        int i2 = this.A00;
        QuickPerformanceLogger quickPerformanceLogger = VJT.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(i, i2, s);
            return;
        }
        throw new C16686V1p();
    }

    public C18073Vl1(C61072JwA jwA, QuickPerformanceLogger quickPerformanceLogger) {
        int hashCode;
        VJT.A00 = quickPerformanceLogger;
        Number number = (Number) jwA.A02;
        if (number != null) {
            hashCode = number.intValue();
        } else {
            hashCode = C16772V5f.A00().toString().hashCode();
        }
        this.A00 = hashCode;
        int i = jwA.A01;
        this.A01 = i;
        QuickPerformanceLogger quickPerformanceLogger2 = VJT.A00;
        if (quickPerformanceLogger2 != null) {
            quickPerformanceLogger2.markerStart(i, hashCode);
            return;
        }
        throw new C16686V1p();
    }
}
