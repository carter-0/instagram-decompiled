package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vnc  reason: case insensitive filesystem */
public final class C18212Vnc {
    public static UY7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(44).equals(A17)) {
                    r1.A08 = r4.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("next_max_id".equals(A17)) {
                        r1.A03 = AnonymousClass7TG.A0l(r4);
                    } else if ("next_media_ids".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        r1.A05 = arrayList;
                    } else if ("next_page".equals(A17)) {
                        r1.A04 = AnonymousClass7TG.A0l(r4);
                    } else if ("persistent_sections".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C295745oq parseFromJson = C295735op.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r1.A06 = arrayList;
                    } else if ("sections".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C295745oq parseFromJson2 = C295735op.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        r1.A07 = arrayList;
                    } else if ("content_advisory".equals(A17)) {
                        r1.A00 = VBR.parseFromJson(r4);
                    } else if (C66579MXk.A00(1195).equals(A17)) {
                        r1.A01 = C44725Cjt.parseFromJson(r4);
                    } else if ("null_state".equals(A17)) {
                        r1.A02 = C16930VBi.parseFromJson(r4);
                    } else {
                        1XY.A01(r4, r1, A17);
                    }
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
