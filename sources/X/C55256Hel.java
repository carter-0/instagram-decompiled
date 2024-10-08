package X;

import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import com.instagram.user.model.User;

/* renamed from: X.Hel  reason: case insensitive filesystem */
public abstract class C55256Hel {
    public static final boolean A00(UserSession userSession, 1Xj r8, GIN gin) {
        C267284bJ BZ6;
        AudioType audioType;
        String BYx;
        int i;
        C310346aq r2;
        String str;
        Integer num;
        User BEv;
        boolean A1b = C51973G9u.A1b(r8, gin, userSession);
        if (!AnonymousClass3ZJ.A0D(userSession, r8)) {
            C67231sQ A0n = C51966G9m.A0n(r8);
            if (A0n != null) {
                OriginalSoundDataIntf BZB = A0n.BZB();
                if (BZB == null || !AnonymousClass7TF.A1Y(BZB.Caw(), A1b)) {
                    if (A0n.BZB() != null) {
                        OriginalSoundDataIntf BZB2 = A0n.BZB();
                        if (BZB2 == null || (BEv = BZB2.BEv()) == null) {
                            num = null;
                        } else {
                            num = BEv.A0N();
                        }
                        if (num != AnonymousClass05K.A01) {
                            i = 2131955613;
                            if (C291335gz.A00(A0n) == OriginalAudioSubtype.A06) {
                                i = 2131955612;
                            }
                        }
                    }
                    if (!AnonymousClass3ZJ.A0F(userSession, r8, r8.A1t())) {
                        i = 2131955640;
                        if (r8.A1t() == AnonymousClass3QO.CLOSE_FRIENDS) {
                            i = 2131955314;
                        }
                    } else {
                        C67161s9 A1N = r8.A1N();
                        C2606046i A01 = C291335gz.A01(A0n);
                        if (!(A1N == null || (BZ6 = A1N.BZ6()) == null || HWO.A00(BZ6) != A1b)) {
                            String str2 = null;
                            if (A01 != null) {
                                audioType = A01.Adv();
                            } else {
                                audioType = null;
                            }
                            if (audioType == AudioType.ORIGINAL_AUDIO && (BYx = A01.BYx()) != null) {
                                C267284bJ BZ62 = A1N.BZ6();
                                if (BZ62 != null) {
                                    str2 = BZ62.getPk();
                                }
                                if (BYx.equals(str2)) {
                                    i = 2131955465;
                                    r2 = C310346aq.ERROR;
                                    str = "clips_feed_remix_original_audio_notice";
                                    C310336ap A0a = DbS.A0a();
                                    A0a.A0C = r2;
                                    A0a.A0H = str;
                                    DbS.A19(gin.A02, A0a, i);
                                    A0a.A06();
                                    DbY.A1N(A0a);
                                }
                            }
                        }
                    }
                } else {
                    i = 2131955894;
                }
                r2 = C310346aq.DEFAULT;
                str = "";
                C310336ap A0a2 = DbS.A0a();
                A0a2.A0C = r2;
                A0a2.A0H = str;
                DbS.A19(gin.A02, A0a2, i);
                A0a2.A06();
                DbY.A1N(A0a2);
            }
            return false;
        }
        return A1b;
    }
}
