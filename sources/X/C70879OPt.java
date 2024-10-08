package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OPt  reason: case insensitive filesystem */
public abstract class C70879OPt {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.7FN, java.lang.Object] */
    public static AnonymousClass7FN parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if (C41845B3m.A1A(A17)) {
                    obj.A0A = AnonymousClass7TG.A0l(r5);
                } else if ("media".equals(A17)) {
                    obj.A02 = 1Xj.A00(r5);
                } else if ("mentioned_user_id".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r5);
                } else if ("mentioned_user_ids".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    obj.A0B = arrayList;
                } else if ("sponsor_user_id".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("mentioned_user".equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    obj.A05 = 1aC.A00(r5, false);
                } else if ("mentioned_users".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    obj.A0C = arrayList;
                } else if ("is_reel_persisted".equals(A17)) {
                    obj.A0F = r5.A0d();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    String A1P = r5.A1P();
                    AnonymousClass7Q3 r3 = AnonymousClass7Q3.COUNTDOWN;
                    if (!C273654mx.A00(637).equals(A1P)) {
                        r3 = AnonymousClass7Q3.SMB_SUPPORT;
                        if (!"smb_support".equals(A1P)) {
                            r3 = AnonymousClass7Q3.MENTION;
                            if (!AnonymousClass000.A00(3588).equals(A1P)) {
                                r3 = AnonymousClass7Q3.EMOJI_REACTION;
                                if (!"reaction".equals(A1P)) {
                                    r3 = AnonymousClass7Q3.QUESTION_RESPONSE;
                                    if (!"question_response".equals(A1P)) {
                                        r3 = AnonymousClass7Q3.REPLY_GIF;
                                        if (!"reply_gif".equals(A1P)) {
                                            r3 = AnonymousClass7Q3.INTERACTIVE_STICKER;
                                            if (!AnonymousClass000.A00(3396).equals(A1P)) {
                                                r3 = AnonymousClass7Q3.AVATAR_REACTION;
                                                if (!"avatar_reaction".equals(A1P)) {
                                                    r3 = AnonymousClass7Q3.REPLY;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj.A01 = r3;
                } else if ("reel_owner_id".equals(A17)) {
                    obj.A09 = AnonymousClass7TG.A0l(r5);
                } else if ("reel_id".equals(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r5);
                } else if ("reel_type".equals(A17)) {
                    obj.A04 = AnonymousClass3HS.A00(AnonymousClass7TG.A0l(r5));
                } else if ("animated_media".equals(A17)) {
                    obj.A03 = AnonymousClass53A.parseFromJson(r5);
                } else if ("can_repost".equals(A17)) {
                    obj.A0D = r5.A0d();
                } else if ("is_challenge_nomination".equals(A17)) {
                    obj.A0E = r5.A0d();
                } else if ("interactive_sticker_reply".equals(A17)) {
                    obj.A00 = C70057NwZ.parseFromJson(r5);
                }
                r5.A0z();
            }
            obj.A03();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, AnonymousClass7FN r4) {
        r3.A0c();
        C41846B3n.A0z(r3, r4.A0A);
        if (r4.A02 != null) {
            r3.A0q("media");
            1Xj r1 = r4.A02;
            AtomicBoolean atomicBoolean = 1Xj.A0i;
            1Xv.A07(r3, r1);
        }
        String str = r4.A07;
        if (str != null) {
            r3.A0R("mentioned_user_id", str);
        }
        if (r4.A0B != null) {
            16P.A03(r3, "mentioned_user_ids");
            Iterator it = r4.A0B.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(r3, it);
            }
            r3.A0Y();
        }
        String str2 = r4.A06;
        if (str2 != null) {
            r3.A0R("sponsor_user_id", str2);
        }
        if (r4.A05 != null) {
            r3.A0q("mentioned_user");
            User user = r4.A05;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r3, user);
        }
        if (r4.A0C != null) {
            16P.A03(r3, "mentioned_users");
            Iterator it2 = r4.A0C.iterator();
            while (it2.hasNext()) {
                C41846B3n.A18(r3, it2);
            }
            r3.A0Y();
        }
        r3.A0S("is_reel_persisted", r4.A0F);
        AnonymousClass7Q3 r0 = r4.A01;
        if (r0 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r0.A00);
        }
        String str3 = r4.A09;
        if (str3 != null) {
            r3.A0R("reel_owner_id", str3);
        }
        String str4 = r4.A08;
        if (str4 != null) {
            r3.A0R("reel_id", str4);
        }
        ReelType reelType = r4.A04;
        if (reelType != null) {
            r3.A0R("reel_type", reelType.A00);
        }
        if (r4.A03 != null) {
            r3.A0q("animated_media");
            AnonymousClass53A.A00(r3, r4.A03);
        }
        r3.A0S("can_repost", r4.A0D);
        r3.A0S("is_challenge_nomination", r4.A0E);
        if (r4.A00 != null) {
            r3.A0q("interactive_sticker_reply");
            OFF off = r4.A00;
            r3.A0c();
            String str5 = off.A01;
            if (str5 != null) {
                r3.A0R(AnonymousClass000.A00(663), str5);
            }
            String str6 = off.A02;
            if (str6 != null) {
                r3.A0R("interactive_user_id", str6);
            }
            String str7 = off.A00;
            if (str7 != null) {
                r3.A0R(AnonymousClass000.A00(3050), str7);
            }
            String str8 = off.A03;
            if (str8 != null) {
                r3.A0R("poll_vote_string", str8);
            }
            r3.A0Z();
        }
        r3.A0Z();
    }
}
