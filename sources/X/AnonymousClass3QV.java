package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3QV  reason: invalid class name */
public abstract class AnonymousClass3QV {
    public static AnonymousClass3QG parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass3QG r0 = new AnonymousClass3QG();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("strength".equals(A0q)) {
                    r0.A00 = r4.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    r0.A01 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("timestamps".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                Integer valueOf = Integer.valueOf(r4.A1D());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        r0.A03 = arrayList;
                    } else if ("texture_transforms".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                A4L parseFromJson = C39565A0h.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r0.A02 = arrayList;
                    }
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, AnonymousClass3QG r4) {
        List<A4L> list;
        List<Number> list2;
        r3.A0c();
        r3.A0P("strength", r4.A00);
        r3.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A01);
        List list3 = r4.A03;
        if (!(list3 == null || Collections.unmodifiableList(list3) == null)) {
            16P.A03(r3, "timestamps");
            List list4 = r4.A03;
            if (list4 != null) {
                list2 = Collections.unmodifiableList(list4);
            } else {
                list2 = null;
            }
            for (Number number : list2) {
                if (number != null) {
                    r3.A0g(number.intValue());
                }
            }
            r3.A0Y();
        }
        List list5 = r4.A02;
        if (!(list5 == null || Collections.unmodifiableList(list5) == null)) {
            16P.A03(r3, "texture_transforms");
            List list6 = r4.A02;
            if (list6 != null) {
                list = Collections.unmodifiableList(list6);
            } else {
                list = null;
            }
            for (A4L a4l : list) {
                if (a4l != null) {
                    r3.A0c();
                    16P.A03(r3, "timestamps");
                    for (Number number2 : a4l.A00) {
                        if (number2 != null) {
                            r3.A0f(number2.floatValue());
                        }
                    }
                    r3.A0Y();
                    r3.A0Z();
                }
            }
            r3.A0Y();
        }
        r3.A0Z();
    }
}
