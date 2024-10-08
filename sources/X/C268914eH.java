package X;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.4eH  reason: invalid class name and case insensitive filesystem */
public final class C268914eH implements Serializable {
    public final AnonymousClass4eE A00;

    public static final IllegalArgumentException A00(C51639FxX fxX, String str) {
        String str2 = fxX.A02;
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", new Object[]{str2, str2.substring(fxX.A00), str}));
    }

    public C268914eH(AnonymousClass4eE r1) {
        this.A00 = r1;
    }

    public final C268894eF A01(C51639FxX fxX) {
        String str;
        C268924eI r0;
        C268894eF[] r02;
        if (fxX.hasMoreTokens()) {
            String nextToken = fxX.nextToken();
            try {
                AnonymousClass4eE r4 = this.A00;
                Class A0D = r4.A0D(nextToken);
                if (fxX.hasMoreTokens()) {
                    String nextToken2 = fxX.nextToken();
                    if ("<".equals(nextToken2)) {
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            if (!fxX.hasMoreTokens()) {
                                break;
                            }
                            arrayList.add(A01(fxX));
                            if (!fxX.hasMoreTokens()) {
                                break;
                            }
                            String nextToken3 = fxX.nextToken();
                            if (!">".equals(nextToken3)) {
                                if (!",".equals(nextToken3)) {
                                    str = 002.A0g("Unexpected token '", nextToken3, "', expected ',' or '>')");
                                    break;
                                }
                            } else {
                                if (arrayList.isEmpty()) {
                                    r02 = C268924eI.A05;
                                } else {
                                    r02 = (C268894eF[]) arrayList.toArray(C268924eI.A05);
                                }
                                r0 = C268924eI.A02(A0D, r02);
                            }
                        }
                    } else {
                        fxX.A01 = nextToken2;
                    }
                }
                r0 = C268924eI.A04;
                return r4.A06((C269754fd) null, r0, A0D);
            } catch (Exception e) {
                C269574fL.A0F(e);
                throw A00(fxX, 002.A0u("Cannot locate class '", nextToken, "', problem: ", e.getMessage()));
            }
        }
        str = "Unexpected end-of-string";
        throw A00(fxX, str);
    }
}
