package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ju  reason: invalid class name and case insensitive filesystem */
public abstract class C271984ju {
    public static C272024jy parseFromJson(16F r21) {
        String str;
        String str2;
        16F r4 = r21;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            StoryPollColorType storyPollColorType = null;
            Integer num = null;
            Boolean bool = null;
            String str3 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str4 = null;
            PollType pollType = null;
            ArrayList arrayList = null;
            String str5 = null;
            C258213ye r7 = null;
            ArrayList arrayList2 = null;
            Integer num2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Integer num3 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("color".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                    storyPollColorType = (StoryPollColorType) StoryPollColorType.A01.get(str2);
                    if (storyPollColorType == null) {
                        storyPollColorType = StoryPollColorType.UNRECOGNIZED;
                    }
                } else if ("expires_at".equals(A0q)) {
                    num = Integer.valueOf(r4.A1D());
                } else if ("finished".equals(A0q)) {
                    bool = Boolean.valueOf(r4.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("is_multi_option_poll".equals(A0q)) {
                    bool2 = Boolean.valueOf(r4.A0d());
                } else if ("is_shared_result".equals(A0q)) {
                    bool3 = Boolean.valueOf(r4.A0d());
                } else if ("poll_id".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("poll_type".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    pollType = (PollType) PollType.A01.get(str);
                    if (pollType == null) {
                        pollType = PollType.UNRECOGNIZED;
                    }
                } else if ("promotion_tallies".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C272004jw parseFromJson = C271994jv.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("question".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("social_context".equals(A0q)) {
                    r7 = C258173ya.parseFromJson(r4);
                } else if ("tallies".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C272004jw parseFromJson2 = C271994jv.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("total_votes".equals(A0q)) {
                    num2 = Integer.valueOf(r4.A1D());
                } else if ("viewer_can_vote".equals(A0q)) {
                    bool4 = Boolean.valueOf(r4.A0d());
                } else if ("viewer_is_owner".equals(A0q)) {
                    bool5 = Boolean.valueOf(r4.A0d());
                } else if ("viewer_vote".equals(A0q)) {
                    num3 = Integer.valueOf(r4.A1D());
                }
                r4.A0z();
            }
            return new C272024jy(pollType, r7, storyPollColorType, bool, bool2, bool3, bool4, bool5, num, num2, num3, str3, str4, str5, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C272024jy r3, boolean z) {
        if (z) {
            r2.A0c();
        }
        StoryPollColorType storyPollColorType = r3.A02;
        if (storyPollColorType != null) {
            r2.A0R("color", storyPollColorType.A00);
        }
        Integer num = r3.A08;
        if (num != null) {
            r2.A0P("expires_at", num.intValue());
        }
        Boolean bool = r3.A03;
        if (bool != null) {
            r2.A0S("finished", bool.booleanValue());
        }
        String str = r3.A0B;
        if (str != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        Boolean bool2 = r3.A04;
        if (bool2 != null) {
            r2.A0S("is_multi_option_poll", bool2.booleanValue());
        }
        Boolean bool3 = r3.A05;
        if (bool3 != null) {
            r2.A0S("is_shared_result", bool3.booleanValue());
        }
        String str2 = r3.A0C;
        if (str2 != null) {
            r2.A0R("poll_id", str2);
        }
        PollType pollType = r3.A00;
        if (pollType != null) {
            r2.A0R("poll_type", pollType.A00);
        }
        List<C272004jw> list = r3.A0E;
        if (list != null) {
            16P.A03(r2, "promotion_tallies");
            for (C272004jw r0 : list) {
                if (r0 != null) {
                    C271994jv.A00(r2, r0);
                }
            }
            r2.A0Y();
        }
        String str3 = r3.A0D;
        if (str3 != null) {
            r2.A0R("question", str3);
        }
        C258213ye r1 = r3.A01;
        if (r1 != null) {
            r2.A0q("social_context");
            C258173ya.A00(r2, r1);
        }
        List<C272004jw> list2 = r3.A0F;
        if (list2 != null) {
            16P.A03(r2, "tallies");
            for (C272004jw r02 : list2) {
                if (r02 != null) {
                    C271994jv.A00(r2, r02);
                }
            }
            r2.A0Y();
        }
        Integer num2 = r3.A09;
        if (num2 != null) {
            r2.A0P("total_votes", num2.intValue());
        }
        Boolean bool4 = r3.A06;
        if (bool4 != null) {
            r2.A0S("viewer_can_vote", bool4.booleanValue());
        }
        Boolean bool5 = r3.A07;
        if (bool5 != null) {
            r2.A0S("viewer_is_owner", bool5.booleanValue());
        }
        Integer num3 = r3.A0A;
        if (num3 != null) {
            r2.A0P("viewer_vote", num3.intValue());
        }
        if (z) {
            r2.A0Z();
        }
    }
}
