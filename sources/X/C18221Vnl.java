package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: X.Vnl  reason: case insensitive filesystem */
public abstract class C18221Vnl {
    public static C17365VSs parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17365VSs vSs = new C17365VSs();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("operations".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C18011Vjn parseFromJson = C17002VEc.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vSs.A01 = arrayList;
                } else if ("view_state_version".equals(A17)) {
                    vSs.A00 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return vSs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C17365VSs vSs) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        if (vSs.A01 != null) {
            16P.A03(A0K, "operations");
            for (C18011Vjn vjn : vSs.A01) {
                if (vjn != null) {
                    A0K.A0c();
                    C41846B3n.A11(A0K, vjn.A04);
                    String str = vjn.A05;
                    if (str != null) {
                        A0K.A0R("operation_type", str);
                    }
                    A0K.A0Q("timestamp_ms", vjn.A00);
                    String str2 = vjn.A03;
                    if (str2 != null) {
                        A0K.A0R("item_type", str2);
                    }
                    if (vjn.A02 != null) {
                        A0K.A0q("operation_metadata");
                        VOU vou = vjn.A02;
                        A0K.A0c();
                        String str3 = vou.A00;
                        if (str3 != null) {
                            A0K.A0R("after_media_id", str3);
                        }
                        A0K.A0Z();
                    }
                    if (vjn.A01 != null) {
                        A0K.A0q("item_metadata");
                        VOT vot = vjn.A01;
                        A0K.A0c();
                        String str4 = vot.A00;
                        if (str4 != null) {
                            A0K.A0R("source", str4);
                        }
                        A0K.A0Z();
                    }
                    String str5 = vjn.A06;
                    if (str5 != null) {
                        A0K.A0R(C273654mx.A00(174), str5);
                    }
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
        }
        String str6 = vSs.A00;
        if (str6 != null) {
            A0K.A0R("view_state_version", str6);
        }
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }
}
