package X;

import java.io.IOException;

/* renamed from: X.41W  reason: invalid class name */
public abstract class AnonymousClass41W {
    public static AnonymousClass41Y parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            AnonymousClass4hP r3 = null;
            AnonymousClass4hP r4 = null;
            AnonymousClass4hP r5 = null;
            AnonymousClass4hP r6 = null;
            AnonymousClass4hP r7 = null;
            AnonymousClass4hP r8 = null;
            AnonymousClass4hP r9 = null;
            AnonymousClass4hP r10 = null;
            AnonymousClass4hP r11 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("cta".equals(A0q)) {
                    r3 = AnonymousClass41X.parseFromJson(r12);
                } else if ("end_scene".equals(A0q)) {
                    r4 = AnonymousClass41X.parseFromJson(r12);
                } else if ("footer".equals(A0q)) {
                    r5 = AnonymousClass41X.parseFromJson(r12);
                } else if ("glados".equals(A0q)) {
                    r6 = AnonymousClass41X.parseFromJson(r12);
                } else if ("header".equals(A0q)) {
                    r7 = AnonymousClass41X.parseFromJson(r12);
                } else if ("iab".equals(A0q)) {
                    r8 = AnonymousClass41X.parseFromJson(r12);
                } else if ("mid_card".equals(A0q)) {
                    r9 = AnonymousClass41X.parseFromJson(r12);
                } else if ("profile_card".equals(A0q)) {
                    r10 = AnonymousClass41X.parseFromJson(r12);
                } else if ("tool_tip".equals(A0q)) {
                    r11 = AnonymousClass41X.parseFromJson(r12);
                }
                r12.A0z();
            }
            return new AnonymousClass41Y(r3, r4, r5, r6, r7, r8, r9, r10, r11);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
