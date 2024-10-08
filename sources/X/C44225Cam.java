package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cam  reason: case insensitive filesystem */
public abstract class C44225Cam {
    public static C42051BFe parseFromJson(16F r36) {
        16F r3 = r36;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            SimpleImageUrl simpleImageUrl = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str4 = null;
            Integer num = null;
            Integer num2 = null;
            String str5 = null;
            Long l = null;
            Integer num3 = null;
            Boolean bool3 = null;
            ArrayList arrayList2 = null;
            String str6 = null;
            User user = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Boolean bool9 = null;
            Long l2 = null;
            String str11 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("alacorn_session_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("allows_saving".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r3);
                } else if ("artist_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("audio_cluster_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("beats".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r3.A1J() != 16L.A08) {
                            C41847B3o.A1L(r3, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("can_remix_be_shared_to_fb".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r3);
                } else if ("cover_artwork_thumbnail_uri".equals(A17)) {
                    simpleImageUrl = 16h.A00(r3);
                } else if ("cover_artwork_uri".equals(A17)) {
                    simpleImageUrl2 = 16h.A00(r3);
                } else if ("dash_manifest".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(1270).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r3);
                } else if (AnonymousClass000.A00(1271).equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r3);
                } else if ("display_artist".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if (TraceFieldType.Duration.equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r3);
                } else if ("duration_in_ms".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r3);
                } else if ("has_lyrics".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r3);
                } else if ("highlight_start_times_in_ms".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r3.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r3);
                            if (A0X != null) {
                                arrayList2.add(A0X);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("ig_artist".equals(A17)) {
                    user = C41845B3m.A0a(r3, false);
                } else if ("is_bookmarked".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r3);
                } else if ("is_explicit".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r3);
                } else if ("is_local_audio".equals(A17)) {
                    bool6 = AnonymousClass7TF.A0S(r3);
                } else if (AnonymousClass000.A00(1517).equals(A17)) {
                    bool7 = AnonymousClass7TF.A0S(r3);
                } else if ("is_original_sound".equals(A17)) {
                    bool8 = AnonymousClass7TF.A0S(r3);
                } else if (AnonymousClass000.A00(48).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(1662).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(1721).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r3.A1P();
                    }
                } else if ("progressive_download_url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(1801).equals(A17)) {
                    bool9 = AnonymousClass7TF.A0S(r3);
                } else if (AnonymousClass000.A00(790).equals(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r3);
                } else if (C41845B3m.A1E(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r3.A1P();
                    }
                }
                r3.A0z();
            }
            return new C42051BFe(simpleImageUrl, simpleImageUrl2, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, num2, num3, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
