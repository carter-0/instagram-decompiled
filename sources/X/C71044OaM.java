package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.Set;

/* renamed from: X.OaM  reason: case insensitive filesystem */
public abstract class C71044OaM {
    public static final void A00(Context context, AnonymousClass0iw r14, UserSession userSession, AnonymousClass4D6 r16, GifUrlImpl gifUrlImpl, Integer num, Integer num2, String str, String str2, String str3, C62320sa r23, C62320sa r24) {
        C69480NmO nmO;
        String str4;
        UserSession userSession2 = userSession;
        String str5 = str;
        DbY.A1S(userSession, str5);
        Integer num3 = num2;
        AnonymousClass7TF.A1G(num3, 4, r14);
        if (str5.length() == 0) {
            str4 = "saveSticker - stickerId is empty";
        } else {
            Integer num4 = AnonymousClass05K.A00;
            boolean A1W = AnonymousClass7TF.A1W(num, num4);
            Context context2 = context;
            C62320sa r11 = r24;
            if (num3 == num4) {
                GifUrlImpl gifUrlImpl2 = gifUrlImpl;
                if (gifUrlImpl != null) {
                    AnonymousClass4D6 r2 = r16;
                    if (r16 != null) {
                        C68137N2b A00 = O1A.A00(gifUrlImpl2, str5, str2);
                        C71151OeJ.A0D(new NM7(0, context2, userSession2, A00, r11, A1W), userSession, r2, A00);
                        return;
                    }
                }
                str4 = "saveGif - url unexpected null pointer ";
            } else {
                Boolean bool = (Boolean) r23.invoke();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r14, userSession), "direct_save_favorite_sticker");
                    if (A0e.isSampled()) {
                        C66581MXm.A1H(A0e, false);
                        int intValue = num3.intValue();
                        if (intValue == 4) {
                            nmO = C69480NmO.AVATAR;
                        } else if (intValue == 3) {
                            nmO = C69480NmO.PAIR_AI_GENERATED;
                        } else if (intValue != 1) {
                            nmO = C69480NmO.CUSTOM;
                        } else {
                            nmO = C69480NmO.REGULAR;
                        }
                        A0e.A8M(nmO, "sticker_type");
                        A0e.AAJ("bottom_sheet_session_id", str3);
                        A0e.Cgf();
                    }
                    if (booleanValue) {
                        A01(context, r11, A1W);
                        C72188Oxx oxx = (C72188Oxx) userSession.A01(C72188Oxx.class, C73751PjC.A00);
                        synchronized (oxx) {
                            Set set = oxx.A01;
                            if (set.size() < 100) {
                                set.add(str5);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        DbT.A1Q(0wj.A01, str4, 20134884);
    }

    public static final void A01(Context context, C62320sa r3, boolean z) {
        C310336ap A0a = DbS.A0a();
        DbS.A19(context, A0a, 2131960268);
        if (z && r3 != null) {
            DbW.A0q(context, A0a, 2131960269);
            C72737PHr.A00(A0a, r3, 5);
            A0a.A0L = true;
        }
        Dbb.A1Q(A0a);
    }

    public static final void A02(AnonymousClass0iw r5, UserSession userSession, AnonymousClass4D6 r7, GifUrlImpl gifUrlImpl, Integer num, String str, String str2, String str3, C62320sa r13) {
        C69480NmO nmO;
        String str4;
        AnonymousClass7TG.A1N(userSession, str);
        0qQ.A0B(r5, 6);
        if (str.length() == 0) {
            str4 = "unsaveSticker - stickerId is empty";
        } else if (num != AnonymousClass05K.A00) {
            Boolean bool = (Boolean) r13.invoke();
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "direct_unsave_favorite_sticker");
                if (A0e.isSampled()) {
                    C66581MXm.A1H(A0e, false);
                    int intValue = num.intValue();
                    if (intValue == 4) {
                        nmO = C69480NmO.AVATAR;
                    } else if (intValue == 3) {
                        nmO = C69480NmO.PAIR_AI_GENERATED;
                    } else if (intValue != 1) {
                        nmO = C69480NmO.CUSTOM;
                    } else {
                        nmO = C69480NmO.REGULAR;
                    }
                    A0e.A8M(nmO, "sticker_type");
                    A0e.AAJ("bottom_sheet_session_id", str3);
                    A0e.Cgf();
                }
                if (booleanValue) {
                    C72188Oxx oxx = (C72188Oxx) userSession.A01(C72188Oxx.class, C73751PjC.A00);
                    synchronized (oxx) {
                        oxx.A01.remove(str);
                    }
                    return;
                }
                return;
            }
            return;
        } else if (gifUrlImpl == null || r7 == null) {
            str4 = "unsaveGif - url unexpected null pointer";
        } else {
            C68137N2b A00 = O1A.A00(gifUrlImpl, str, str2);
            C71151OeJ.A0E(new NMH(5, A00, userSession), userSession, r7, A00);
            return;
        }
        DbT.A1Q(0wj.A01, str4, 20134884);
    }

    public static final boolean A03(UserSession userSession, String str) {
        boolean z;
        boolean contains;
        AnonymousClass7TG.A1N(userSession, str);
        Object A01 = userSession.A01(C72188Oxx.class, C73751PjC.A00);
        C72188Oxx oxx = (C72188Oxx) A01;
        synchronized (A01) {
            z = oxx.A00;
        }
        if (z) {
            synchronized (A01) {
                contains = oxx.A01.contains(str);
            }
            if (!contains) {
                return false;
            }
            return true;
        }
        return false;
    }
}
