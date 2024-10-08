package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JUo  reason: case insensitive filesystem */
public abstract class C59706JUo {
    public static Jv8 parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str = null;
            JYK jyk = null;
            KN4 kn4 = null;
            ArrayList arrayList = null;
            C366688pV r8 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            while (r15.A1J() != 16L.A09) {
                String A0q = r15.A0q();
                r15.A1J();
                if ("uuid".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("media_type".equals(A0q)) {
                    jyk = (JYK) JYK.A01.get(Integer.valueOf(r15.A1D()));
                } else if ("photo_segments".equals(A0q)) {
                    kn4 = LIN.parseFromJson(r15);
                } else if ("video_segments".equals(A0q)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r15.A1J() != 16L.A08) {
                            AnonymousClass51M parseFromJson = AnonymousClass51L.parseFromJson(r15);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("video_edits".equals(A0q)) {
                    r8 = C370148vu.parseFromJson(r15);
                } else if ("multiple_audio_tracks".equals(A0q)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r15.A1J() != 16L.A08) {
                            AudioOverlayTrack parseFromJson2 = C59707JUp.parseFromJson(r15);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("stickers".equals(A0q)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r15.A1J() != 16L.A08) {
                            X5I parseFromJson3 = W3F.parseFromJson(r15);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                r15.A0z();
            }
            if (str == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("uuid", r15, "UnschematizedUnifiedComposition");
            } else if (jyk == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_type", r15, "UnschematizedUnifiedComposition");
            } else if (arrayList == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("video_segments", r15, "UnschematizedUnifiedComposition");
            } else if (arrayList2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("multiple_audio_tracks", r15, "UnschematizedUnifiedComposition");
            } else if (arrayList3 != null || !(r15 instanceof 0c9)) {
                return new Jv8(r8, kn4, jyk, str, arrayList, arrayList2, arrayList3);
            } else {
                AnonymousClass7TF.A1L("stickers", r15, "UnschematizedUnifiedComposition");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, Jv8 jv8) {
        r2.A0c();
        String str = jv8.A03;
        if (str != null) {
            r2.A0R("uuid", str);
        }
        JYK jyk = jv8.A02;
        if (jyk != null) {
            r2.A0P("media_type", jyk.A00);
        }
        KN4 kn4 = jv8.A01;
        if (kn4 != null) {
            r2.A0q("photo_segments");
            LIN.A00(r2, kn4);
        }
        List list = jv8.A06;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "video_segments", list);
            while (A0s.hasNext()) {
                AnonymousClass51M A0g = JTO.A0g(A0s);
                if (A0g != null) {
                    AnonymousClass51L.A00(r2, A0g);
                }
            }
            r2.A0Y();
        }
        C366688pV r1 = jv8.A00;
        if (r1 != null) {
            r2.A0q("video_edits");
            C370148vu.A00(r2, r1);
        }
        List list2 = jv8.A04;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r2, "multiple_audio_tracks", list2);
            while (A0s2.hasNext()) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) A0s2.next();
                if (audioOverlayTrack != null) {
                    C59707JUp.A00(r2, audioOverlayTrack);
                }
            }
            r2.A0Y();
        }
        List list3 = jv8.A05;
        if (list3 != null) {
            Iterator A0s3 = C41845B3m.A0s(r2, "stickers", list3);
            while (A0s3.hasNext()) {
                X5I x5i = (X5I) A0s3.next();
                if (x5i != null) {
                    W3F.A05(r2, x5i);
                }
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
