package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3UP  reason: invalid class name */
public abstract class AnonymousClass3UP {
    public static TrackDataImpl parseFromJson(16F r35) {
        16F r1 = r35;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ImageUrl imageUrl = null;
            ImageUrl imageUrl2 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Integer num = null;
            String str7 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            String str8 = null;
            String str9 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Lyrics lyrics = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                r1.A1J();
                if ("allows_saving".equals(A0q)) {
                    bool = Boolean.valueOf(r1.A0d());
                } else if ("artist_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                } else if ("audio_asset_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if ("audio_cluster_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("cover_artwork_thumbnail_uri".equals(A0q)) {
                    imageUrl = 16h.A00(r1);
                } else if ("cover_artwork_uri".equals(A0q)) {
                    imageUrl2 = 16h.A00(r1);
                } else if ("dark_message".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("dash_manifest".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("display_artist".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("duration_in_ms".equals(A0q)) {
                    num = Integer.valueOf(r1.A1D());
                } else if ("fast_start_progressive_download_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("has_lyrics".equals(A0q)) {
                    bool3 = Boolean.valueOf(r1.A0d());
                } else if ("highlight_start_times_in_ms".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            Integer valueOf = Integer.valueOf(r1.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("ig_username".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if ("is_eligible_for_audio_effects".equals(A0q)) {
                    bool4 = Boolean.valueOf(r1.A0d());
                } else if ("is_eligible_for_vinyl_sticker".equals(A0q)) {
                    bool5 = Boolean.valueOf(r1.A0d());
                } else if ("is_explicit".equals(A0q)) {
                    bool2 = Boolean.valueOf(r1.A0d());
                } else if ("lyrics".equals(A0q)) {
                    lyrics = AnonymousClass4DC.parseFromJson(r1);
                } else if ("progressive_download_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                } else if ("reactive_audio_download_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r1.A1P();
                    }
                } else if ("sanitized_title".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r1.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r1.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r1.A1P();
                    }
                } else if ("web_30s_preview_download_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r1.A1P();
                    }
                }
                r1.A0z();
            }
            if (bool == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("allows_saving", "TrackDataImpl");
            } else if (imageUrl2 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("cover_artwork_uri", "TrackDataImpl");
            } else if (str8 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TrackDataImpl");
            } else if (bool2 != null || !(r1 instanceof 0c9)) {
                return new TrackDataImpl(lyrics, imageUrl, imageUrl2, bool3, bool4, bool5, num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, arrayList, bool.booleanValue(), bool2.booleanValue());
            } else {
                ((0c9) r1).A03.A00("is_explicit", "TrackDataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, TrackDataImpl trackDataImpl) {
        r2.A0c();
        r2.A0S("allows_saving", trackDataImpl.A0N);
        String str = trackDataImpl.A07;
        if (str != null) {
            r2.A0R("artist_id", str);
        }
        String str2 = trackDataImpl.A08;
        if (str2 != null) {
            r2.A0R("audio_asset_id", str2);
        }
        String str3 = trackDataImpl.A09;
        if (str3 != null) {
            r2.A0R("audio_cluster_id", str3);
        }
        ImageUrl imageUrl = trackDataImpl.A01;
        if (imageUrl != null) {
            r2.A0q("cover_artwork_thumbnail_uri");
            16h.A01(r2, imageUrl);
        }
        ImageUrl imageUrl2 = trackDataImpl.A02;
        if (imageUrl2 != null) {
            r2.A0q("cover_artwork_uri");
            16h.A01(r2, imageUrl2);
        }
        String str4 = trackDataImpl.A0A;
        if (str4 != null) {
            r2.A0R("dark_message", str4);
        }
        String str5 = trackDataImpl.A0B;
        if (str5 != null) {
            r2.A0R("dash_manifest", str5);
        }
        String str6 = trackDataImpl.A0C;
        if (str6 != null) {
            r2.A0R("display_artist", str6);
        }
        Integer num = trackDataImpl.A06;
        if (num != null) {
            r2.A0P("duration_in_ms", num.intValue());
        }
        String str7 = trackDataImpl.A0D;
        if (str7 != null) {
            r2.A0R("fast_start_progressive_download_url", str7);
        }
        Boolean bool = trackDataImpl.A03;
        if (bool != null) {
            r2.A0S("has_lyrics", bool.booleanValue());
        }
        List<Number> list = trackDataImpl.A0M;
        if (list != null) {
            16P.A03(r2, "highlight_start_times_in_ms");
            for (Number number : list) {
                if (number != null) {
                    r2.A0g(number.intValue());
                }
            }
            r2.A0Y();
        }
        String str8 = trackDataImpl.A0E;
        if (str8 != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
        }
        String str9 = trackDataImpl.A0F;
        if (str9 != null) {
            r2.A0R("ig_username", str9);
        }
        Boolean bool2 = trackDataImpl.A04;
        if (bool2 != null) {
            r2.A0S("is_eligible_for_audio_effects", bool2.booleanValue());
        }
        Boolean bool3 = trackDataImpl.A05;
        if (bool3 != null) {
            r2.A0S("is_eligible_for_vinyl_sticker", bool3.booleanValue());
        }
        r2.A0S("is_explicit", trackDataImpl.A0O);
        Lyrics lyrics = trackDataImpl.A00;
        if (lyrics != null) {
            r2.A0q("lyrics");
            AnonymousClass4DC.A00(r2, lyrics);
        }
        String str10 = trackDataImpl.A0G;
        if (str10 != null) {
            r2.A0R("progressive_download_url", str10);
        }
        String str11 = trackDataImpl.A0H;
        if (str11 != null) {
            r2.A0R("reactive_audio_download_url", str11);
        }
        String str12 = trackDataImpl.A0I;
        if (str12 != null) {
            r2.A0R("sanitized_title", str12);
        }
        String str13 = trackDataImpl.A0J;
        if (str13 != null) {
            r2.A0R("subtitle", str13);
        }
        String str14 = trackDataImpl.A0K;
        if (str14 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str14);
        }
        String str15 = trackDataImpl.A0L;
        if (str15 != null) {
            r2.A0R("web_30s_preview_download_url", str15);
        }
        r2.A0Z();
    }
}
