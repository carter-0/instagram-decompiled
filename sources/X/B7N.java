package X;

import java.io.IOException;

public abstract class B7N {
    public static C14412Tvh parseFromJson(16F r30) {
        16F r3 = r30;
        0qQ.A0B(r3, 0);
        try {
            Integer num = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            Boolean bool = null;
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("buffering_latency_normative_maximum_threshold_ms".equals(A0q)) {
                    num = Integer.valueOf(r3.A1D());
                } else if ("buffering_latency_normative_minimum_threshold_ms".equals(A0q)) {
                    num2 = Integer.valueOf(r3.A1D());
                } else if ("buffering_recency_threshold_ms".equals(A0q)) {
                    num3 = Integer.valueOf(r3.A1D());
                } else if ("green_memory_maximum_conccurent".equals(A0q)) {
                    num4 = Integer.valueOf(r3.A1D());
                } else if ("minimum_time_on_screen".equals(A0q)) {
                    num5 = Integer.valueOf(r3.A1D());
                } else if ("orange_memory_maximum_conccurent".equals(A0q)) {
                    num6 = Integer.valueOf(r3.A1D());
                } else if ("red_memory_level".equals(A0q)) {
                    num7 = Integer.valueOf(r3.A1D());
                } else if ("red_memory_maximum_conccurent".equals(A0q)) {
                    num8 = Integer.valueOf(r3.A1D());
                } else if ("respect_native_autoplay_limitation".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                }
                r3.A0z();
            }
            if (num == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("buffering_latency_normative_maximum_threshold_ms", r3, "AutoplayConfigGlobalConfig");
            } else if (num2 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("buffering_latency_normative_minimum_threshold_ms", r3, "AutoplayConfigGlobalConfig");
            } else if (num3 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("buffering_recency_threshold_ms", r3, "AutoplayConfigGlobalConfig");
            } else if (num4 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("green_memory_maximum_conccurent", r3, "AutoplayConfigGlobalConfig");
            } else if (num5 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("minimum_time_on_screen", r3, "AutoplayConfigGlobalConfig");
            } else if (num6 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("orange_memory_maximum_conccurent", r3, "AutoplayConfigGlobalConfig");
            } else if (num7 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("red_memory_level", r3, "AutoplayConfigGlobalConfig");
            } else if (num8 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("red_memory_maximum_conccurent", r3, "AutoplayConfigGlobalConfig");
            } else if (bool != null || !(r3 instanceof 0c9)) {
                return new C14412Tvh(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), num6.intValue(), num7.intValue(), num8.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("respect_native_autoplay_limitation", r3, "AutoplayConfigGlobalConfig");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
