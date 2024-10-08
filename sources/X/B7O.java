package X;

import java.io.IOException;

public abstract class B7O {
    public static C14413Tvi parseFromJson(16F r22) {
        16F r2 = r22;
        0qQ.A0B(r2, 0);
        try {
            Integer num = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str = null;
            Integer num4 = null;
            Integer num5 = null;
            String str2 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("customization_id".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("max_concurrent_buffering".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("max_concurrent_videos".equals(A0q)) {
                    num2 = Integer.valueOf(r2.A1D());
                } else if ("normative_maximum_buffering_ms".equals(A0q)) {
                    num3 = Integer.valueOf(r2.A1D());
                } else if ("normative_minimum_buffering_ms".equals(A0q)) {
                    num4 = Integer.valueOf(r2.A1D());
                } else if ("preview_duration_ms".equals(A0q)) {
                    num5 = Integer.valueOf(r2.A1D());
                } else if ("which_videos".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            if (str == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("customization_id", r2, "AutoplayConfigCustomizationBase");
            } else if (num == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("max_concurrent_buffering", r2, "AutoplayConfigCustomizationBase");
            } else if (num2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("max_concurrent_videos", r2, "AutoplayConfigCustomizationBase");
            } else if (num3 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("normative_maximum_buffering_ms", r2, "AutoplayConfigCustomizationBase");
            } else if (num4 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("normative_minimum_buffering_ms", r2, "AutoplayConfigCustomizationBase");
            } else if (num5 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("preview_duration_ms", r2, "AutoplayConfigCustomizationBase");
            } else if (str2 != null || !(r2 instanceof 0c9)) {
                return new C14413Tvi(str, str2, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue());
            } else {
                AnonymousClass7TF.A1L("which_videos", r2, "AutoplayConfigCustomizationBase");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
