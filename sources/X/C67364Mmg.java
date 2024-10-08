package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Mmg  reason: case insensitive filesystem */
public abstract class C67364Mmg {
    public static C67365Mmh parseFromJson(16F r5) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        0qQ.A0B(r5, 0);
        try {
            C67365Mmh mmh = new C67365Mmh();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    mmh.A07 = 1aC.A00(r5, false);
                } else if ("place".equals(A0q)) {
                    mmh.A06 = C18226Vnq.parseFromJson(r5);
                } else if ("hashtag".equals(A0q)) {
                    mmh.A03 = C279594yt.parseFromJson(r5);
                } else if ("keyword".equals(A0q)) {
                    mmh.A04 = C67385Mn1.parseFromJson(r5);
                } else if ("category".equals(A0q)) {
                    mmh.A05 = C70896OQo.parseFromJson(r5);
                } else if ("licensed_music".equals(A0q)) {
                    mmh.A01 = AnonymousClass3UP.parseFromJson(r5);
                } else if ("track_metadata".equals(A0q)) {
                    mmh.A02 = D0F.parseFromJson(r5);
                } else if ("original_audio".equals(A0q)) {
                    mmh.A00 = 1dk.parseFromJson(r5);
                } else {
                    C66941Mfa.A01(r5, mmh, A0q);
                }
                r5.A0z();
            }
            User user = mmh.A07;
            String str8 = "";
            if (user != null) {
                mmh.A01 = 0;
                0qQ.A0C(user, "null cannot be cast to non-null type com.instagram.user.model.User");
                mmh.A09 = user;
                mmh.A08 = AnonymousClass05K.A0N;
                User user2 = mmh.A07;
                if (user2 != null) {
                    str7 = user2.getId();
                } else {
                    str7 = str8;
                }
                mmh.A0A = str7;
                User user3 = mmh.A07;
                if (user3 != null) {
                    str8 = user3.getUsername();
                }
                mmh.A0B = str8;
                return mmh;
            }
            C18072Vl0 vl0 = mmh.A06;
            if (vl0 != null) {
                mmh.A01 = 2;
                0qQ.A0C(vl0, "null cannot be cast to non-null type com.instagram.model.place.Place");
                mmh.A09 = vl0;
                C18072Vl0 vl02 = mmh.A06;
                if (vl02 != null) {
                    str6 = vl02.A00().A05();
                    0qQ.A07(str6);
                } else {
                    str6 = str8;
                }
                mmh.A0A = str6;
                C18072Vl0 vl03 = mmh.A06;
                if (vl03 != null) {
                    str8 = vl03.A01();
                }
                mmh.A0B = str8;
                num = AnonymousClass05K.A0u;
            } else {
                HashtagImpl hashtagImpl = mmh.A03;
                if (hashtagImpl != null) {
                    mmh.A01 = 1;
                    0qQ.A0C(hashtagImpl, "null cannot be cast to non-null type com.instagram.model.hashtag.Hashtag");
                    mmh.A09 = hashtagImpl;
                    String str9 = hashtagImpl.A0C;
                    if (str9 == null) {
                        str9 = str8;
                    }
                    mmh.A0A = str9;
                    String str10 = hashtagImpl.A0D;
                    if (str10 != null) {
                        str8 = str10;
                    }
                    mmh.A0B = str8;
                    num = AnonymousClass05K.A0C;
                } else {
                    Keyword keyword = mmh.A04;
                    if (keyword != null) {
                        mmh.A01 = 4;
                        0qQ.A0C(keyword, "null cannot be cast to non-null type com.instagram.model.keyword.Keyword");
                        mmh.A09 = keyword;
                        Keyword keyword2 = mmh.A04;
                        if (keyword2 == null || (str4 = keyword2.A03) == null) {
                            str4 = str8;
                        }
                        mmh.A0A = str4;
                        if (!(keyword2 == null || (str5 = keyword2.A04) == null)) {
                            str8 = str5;
                        }
                        mmh.A0B = str8;
                        num = AnonymousClass05K.A15;
                    } else {
                        MapQuery mapQuery = mmh.A05;
                        if (mapQuery != null) {
                            mmh.A01 = 6;
                            0qQ.A0C(mapQuery, "null cannot be cast to non-null type com.instagram.model.mapquery.MapQuery");
                            mmh.A09 = mapQuery;
                            MapQuery mapQuery2 = mmh.A05;
                            if (mapQuery2 != null) {
                                str3 = mapQuery2.A00;
                            } else {
                                str3 = str8;
                            }
                            mmh.A0A = str3;
                            if (mapQuery2 != null) {
                                str8 = mapQuery2.A01;
                            }
                            mmh.A0B = str8;
                            num = AnonymousClass05K.A06;
                        } else {
                            TrackDataImpl trackDataImpl = mmh.A01;
                            if (trackDataImpl == null || mmh.A02 == null) {
                                OriginalSoundData originalSoundData = mmh.A00;
                                if (originalSoundData != null) {
                                    mmh.A01 = 7;
                                    mmh.A09 = originalSoundData;
                                    str = originalSoundData.A0I;
                                    String str11 = str;
                                    if (str == null) {
                                        str11 = str8;
                                    }
                                    mmh.A0A = str11;
                                } else {
                                    throw AnonymousClass7TE.A0w("Type for BlendedSearchEntry is unknown");
                                }
                            } else {
                                mmh.A01 = 7;
                                0qQ.A0C(trackDataImpl, "null cannot be cast to non-null type com.instagram.api.schemas.TrackData");
                                mmh.A09 = trackDataImpl;
                                TrackDataImpl trackDataImpl2 = mmh.A01;
                                if (trackDataImpl2 == null || (str2 = trackDataImpl2.A0E) == null) {
                                    str2 = str8;
                                }
                                mmh.A0A = str2;
                                if (trackDataImpl2 != null) {
                                    str = trackDataImpl2.A0E;
                                }
                                mmh.A0B = str8;
                                num = AnonymousClass05K.A1I;
                            }
                            if (str != null) {
                                str8 = str;
                            }
                            mmh.A0B = str8;
                            num = AnonymousClass05K.A1I;
                        }
                    }
                }
            }
            mmh.A08 = num;
            return mmh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
