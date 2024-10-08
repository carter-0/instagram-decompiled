package X;

import java.util.Map;

public abstract class RS5 {
    public static C10968S3a A00(C10968S3a s3a, Map map, String[] strArr) {
        int i;
        int i2 = 0;
        if (s3a == null) {
            if (strArr == null) {
                return null;
            }
            i = strArr.length;
            if (i == 1) {
                return (C10968S3a) map.get(strArr[0]);
            }
            if (i <= 1) {
                return s3a;
            }
            s3a = new C10968S3a();
        } else if (strArr == null) {
            return s3a;
        } else {
            i = strArr.length;
            if (i == 1) {
                s3a.A00((C10968S3a) map.get(strArr[0]));
                return s3a;
            } else if (i <= 1) {
                return s3a;
            }
        }
        do {
            s3a.A00((C10968S3a) map.get(strArr[i2]));
            i2++;
        } while (i2 < i);
        return s3a;
    }
}
