package X;

import android.graphics.PointF;

public class SIR {
    public C11388SRb A00;
    public Object A01;
    public final C10788RyA A02;

    public Object A00(C10788RyA ryA) {
        Object obj;
        if (this instanceof C7497QGo) {
            C7497QGo qGo = (C7497QGo) this;
            C10788RyA ryA2 = qGo.A02;
            float f = ryA.A04;
            float f2 = ryA.A00;
            String str = ((S3U) ryA.A06).A0B;
            String str2 = ((S3U) ryA.A05).A0B;
            float f3 = ryA.A02;
            float f4 = ryA.A01;
            float f5 = ryA.A03;
            ryA2.A04 = f;
            ryA2.A00 = f2;
            ryA2.A06 = str;
            ryA2.A05 = str2;
            ryA2.A02 = f3;
            ryA2.A01 = f4;
            ryA2.A03 = f5;
            String str3 = (String) qGo.A03.A00(ryA2);
            if (ryA.A01 == 1.0f) {
                obj = ryA.A05;
            } else {
                obj = ryA.A06;
            }
            S3U s3u = (S3U) obj;
            S3U s3u2 = qGo.A01;
            String str4 = s3u.A0A;
            float f6 = s3u.A02;
            Integer num = s3u.A09;
            int i = s3u.A06;
            float f7 = s3u.A01;
            float f8 = s3u.A00;
            int i2 = s3u.A04;
            int i3 = s3u.A05;
            float f9 = s3u.A03;
            boolean z = s3u.A0C;
            PointF pointF = s3u.A07;
            PointF pointF2 = s3u.A08;
            s3u2.A0B = str3;
            s3u2.A0A = str4;
            s3u2.A02 = f6;
            s3u2.A09 = num;
            s3u2.A06 = i;
            s3u2.A01 = f7;
            s3u2.A00 = f8;
            s3u2.A04 = i2;
            s3u2.A05 = i3;
            s3u2.A03 = f9;
            s3u2.A0C = z;
            s3u2.A07 = pointF;
            s3u2.A08 = pointF2;
            return s3u2;
        } else if (!(this instanceof C7496QGn)) {
            return this.A01;
        } else {
            Number number = (Number) ((C7496QGn) this).A01.A00(ryA);
            if (number == null) {
                return null;
            }
            return Float.valueOf(number.floatValue() * 2.55f);
        }
    }

    public final Object A01(Object obj, Object obj2, float f, float f2, float f3, float f4, float f5) {
        C10788RyA ryA = this.A02;
        ryA.A04 = f;
        ryA.A00 = f2;
        ryA.A06 = obj;
        ryA.A05 = obj2;
        ryA.A02 = f3;
        ryA.A01 = f4;
        ryA.A03 = f5;
        return A00(ryA);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.RyA] */
    public SIR(Object obj) {
        this.A02 = new Object();
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.RyA] */
    public SIR() {
        this.A02 = new Object();
        this.A01 = null;
    }
}
