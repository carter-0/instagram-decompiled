package X;

import java.io.IOException;

public abstract class AAO {
    public static AnonymousClass8J0 parseFromJson(16F r3) {
        IllegalArgumentException illegalArgumentException;
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass8J0 r2 = new AnonymousClass8J0();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("original_media_id".equals(A17)) {
                    r2.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("original_media_duration".equals(A17)) {
                    r2.A00 = r3.A1D();
                } else if ("original_media_is_shared_to_facebook".equals(A17)) {
                    r2.A06 = r3.A0d();
                } else if ("are_remixes_crosspostable".equals(A17)) {
                    r2.A04 = AnonymousClass7TF.A0S(r3);
                } else {
                    if ("source_media_creation_state".equals(A17)) {
                        String A0l = AnonymousClass7TG.A0l(r3);
                        AnonymousClass8JI r0 = (AnonymousClass8JI) AnonymousClass8JI.A02.get(A0l);
                        if (r0 != null) {
                            r2.A03 = r0;
                        } else {
                            illegalArgumentException = AnonymousClass7TF.A0W("Unrecognized value ", A0l);
                        }
                    } else if ("original_media_is_photo".equals(A17)) {
                        r2.A07 = r3.A0d();
                    } else if (AnonymousClass000.A00(1569).equals(A17)) {
                        String A0l2 = AnonymousClass7TG.A0l(r3);
                        C391089sK r02 = (C391089sK) C391089sK.A01.get(A0l2);
                        if (r02 != null) {
                            r2.A02 = r02;
                        } else {
                            illegalArgumentException = AnonymousClass7TF.A0W("Unrecognized value ", A0l2);
                        }
                    } else {
                        continue;
                    }
                    throw illegalArgumentException;
                }
                r3.A0z();
            }
            if (r2.A03 != null) {
                return r2;
            }
            r2.A03 = AnonymousClass8JI.REMIX;
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass8J0 r3) {
        r2.A0c();
        String str = r3.A05;
        if (str != null) {
            r2.A0R("original_media_id", str);
        }
        r2.A0P("original_media_duration", r3.A00);
        r2.A0S("original_media_is_shared_to_facebook", r3.A06);
        Boolean bool = r3.A04;
        if (bool != null) {
            r2.A0S("are_remixes_crosspostable", bool.booleanValue());
        }
        AnonymousClass8JI r0 = r3.A03;
        if (r0 != null) {
            r2.A0R("source_media_creation_state", r0.A00);
        }
        r2.A0S("original_media_is_photo", r3.A07);
        C391089sK r02 = r3.A02;
        if (r02 != null) {
            r2.A0R(AnonymousClass000.A00(1569), r02.A00);
        }
        r2.A0Z();
    }
}
