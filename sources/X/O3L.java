package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;

public abstract class O3L {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.OD4, java.lang.Object] */
    public static OD4 parseFromJson(16F r8) {
        int i;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(A17)) {
                    int A1D = r8.A1D();
                    Integer[] A00 = AnonymousClass05K.A00(5);
                    int length = A00.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            num = A00[i2];
                            switch (num.intValue()) {
                                case 1:
                                    i = 1;
                                    break;
                                case 2:
                                    i = 2;
                                    break;
                                case 3:
                                    i = 4;
                                    break;
                                case 4:
                                    i = 16;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            if (i != A1D) {
                                i2++;
                            }
                        } else {
                            num = null;
                        }
                    }
                } else if ("2".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            ? obj = new Object();
            if (num != null) {
                obj.A00 = num;
            }
            if (str != null) {
                obj.A01 = str;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
