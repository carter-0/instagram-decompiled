package com.instagram.realtimeclient.clientconfig;

import X.0Tu;
import X.0lg;
import X.0tM;
import X.182;
import X.AnonymousClass0yP;
import X.AnonymousClass7TF;

public class L {

    public class ig_android_realtime_subscription_log {

        public class is_enabled {
            public static Boolean getAndExpose(0lg r3) {
                return Boolean.valueOf(182.A06(0Tu.A05, r3, 2342154818807661328L));
            }

            public static Boolean peekWithoutExposure(0lg r3) {
                return Boolean.valueOf(182.A06(0Tu.A06, r3, 2342154818807661328L));
            }

            public static 0tM getParameter() {
                return AnonymousClass0yP.A00(2342154818807661328L);
            }
        }

        public class is_gqls_debug_log_enabled {
            public static Boolean getAndExpose(0lg r3) {
                return AnonymousClass7TF.A0R(0Tu.A05, r3, 36311809594032913L);
            }

            public static Boolean peekWithoutExposure(0lg r3) {
                return AnonymousClass7TF.A0R(0Tu.A06, r3, 36311809594032913L);
            }

            public static 0tM getParameter() {
                return AnonymousClass0yP.A00(36311809594032913L);
            }
        }

        public class sampling_weight {
            public static Long getAndExpose(0lg r3) {
                return AnonymousClass7TF.A0Y(0Tu.A05, r3, 36593284570809421L);
            }

            public static Long peekWithoutExposure(0lg r3) {
                return AnonymousClass7TF.A0Y(0Tu.A06, r3, 36593284570809421L);
            }

            public static 0tM getParameter() {
                return AnonymousClass0yP.A00(36593284570809421L);
            }
        }
    }
}
