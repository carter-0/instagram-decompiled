package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.8vd  reason: invalid class name and case insensitive filesystem */
public abstract class C369978vd {
    public static C369988ve parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C369988ve r0 = new C369988ve();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                String str = null;
                if ("draft_id".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    r0.A07 = str;
                } else if ("revision_id".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A08 = str;
                } else if ("composition_id".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A05 = str;
                } else if ("date_created".equals(A0q)) {
                    r0.A00 = r5.A0y();
                } else if ("date_modified".equals(A0q)) {
                    r0.A01 = r5.A0y();
                } else if ("media_info".equals(A0q)) {
                    r0.A02 = C363948kc.parseFromJson(r5);
                } else if ("persisted_media_info".equals(A0q)) {
                    r0.A03 = C363948kc.parseFromJson(r5);
                } else if ("media_edits".equals(A0q)) {
                    r0.A04 = C370008vg.parseFromJson(r5);
                } else if ("cover_file_path".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    r0.A06 = str;
                } else if ("visible".equals(A0q)) {
                    r0.A09 = r5.A0d();
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C369988ve r6) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        String str = r6.A07;
        if (str != null) {
            A0A.A0R("draft_id", str);
        }
        String str2 = r6.A08;
        if (str2 != null) {
            A0A.A0R("revision_id", str2);
        }
        String str3 = r6.A05;
        if (str3 != null) {
            A0A.A0R("composition_id", str3);
        }
        A0A.A0Q("date_created", r6.A00);
        A0A.A0Q("date_modified", r6.A01);
        if (r6.A02 != null) {
            A0A.A0q("media_info");
            C363948kc.A00(A0A, r6.A02);
        }
        if (r6.A03 != null) {
            A0A.A0q("persisted_media_info");
            C363948kc.A00(A0A, r6.A03);
        }
        if (r6.A04 != null) {
            A0A.A0q("media_edits");
            C370008vg.A00(A0A, r6.A04);
        }
        String str4 = r6.A06;
        if (str4 != null) {
            A0A.A0R("cover_file_path", str4);
        }
        A0A.A0S("visible", r6.A09);
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }
}
