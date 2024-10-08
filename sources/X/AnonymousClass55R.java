package X;

import java.io.IOException;

/* renamed from: X.55R  reason: invalid class name */
public abstract class AnonymousClass55R {
    public static AnonymousClass55U parseFromJson(16F r14) {
        String str;
        AnonymousClass55S r8;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Integer num = null;
            AnonymousClass55S r82 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r14.A1J() != 16L.A09) {
                String A0q = r14.A0q();
                r14.A1J();
                if ("error_type".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    0qQ.A0B(str, 0);
                    try {
                        r8 = AnonymousClass55S.valueOf(str);
                    } catch (Throwable th) {
                        r8 = new 0eQ(th);
                    }
                    AnonymousClass55S r1 = AnonymousClass55S.A0M;
                    if (r8 instanceof 0eQ) {
                        r8 = r1;
                    }
                    r82 = r8;
                } else if ("input_error_message".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("server_error_type".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("response_code".equals(A0q)) {
                    num = Integer.valueOf(r14.A1D());
                } else if (!"cause".equals(A0q)) {
                    if ("localized_error_message".equals(A0q)) {
                        if (r14.A11() == 16L.A0G) {
                            str4 = null;
                        } else {
                            str4 = r14.A1P();
                        }
                    } else if ("reason".equals(A0q)) {
                        if (r14.A11() == 16L.A0G) {
                            str5 = null;
                        } else {
                            str5 = r14.A1P();
                        }
                    }
                }
                r14.A0z();
            }
            if (r82 == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("error_type", "FailureInterpreter");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("input_error_message", "FailureInterpreter");
            } else if (num != null || !(r14 instanceof 0c9)) {
                return new AnonymousClass55U(r82, str2, str3, str4, str5, (Throwable) null, num.intValue());
            } else {
                ((0c9) r14).A03.A00("response_code", "FailureInterpreter");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
