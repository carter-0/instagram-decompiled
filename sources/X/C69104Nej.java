package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Nej  reason: case insensitive filesystem */
public final class C69104Nej extends C71135OdY {
    public String A00;
    public String A01;
    public final Context A02;
    public final UserSession A03;
    public final OKY A04;
    public final PMM A05 = PMM.A00;
    public final C71111Ocu A06;
    public final OLF A07;
    public final OHA A08;

    public static final C74274Ps2 A01(C69359Njz njz, C69104Nej nej) {
        String str;
        List list;
        C74274Ps2 n9n;
        boolean z;
        Map map;
        int ordinal;
        List list2;
        if (njz == null || (ordinal = njz.ordinal()) == -1) {
            OHA oha = nej.A08;
            str = AnonymousClass7TE.A16(oha.A03, 2131954514);
            map = oha.A05;
            z = false;
            list = C66580MXl.A13(false, map);
            if (list == null) {
                List A1P = 0sr.A1P(new C69359Njz[]{C69359Njz.AUDIO, C69359Njz.VIDEO});
                if (182.A06(0Tu.A05, oha.A04, 36323659408747884L)) {
                    A1P = 0jo.A1G(A1P);
                }
                list = 00k.A0T(C69359Njz.OTHER, A1P);
                map.put(z, list);
            }
            n9n = new C68300N9n(str, list);
        } else if (ordinal == 28) {
            n9n = new C68299N9m(AnonymousClass7TE.A16(nej.A08.A03, 2131954515));
        } else if (ordinal != 0) {
            OHA oha2 = nej.A08;
            boolean A062 = 182.A06(0Tu.A05, oha2.A04, 36315627819896254L);
            if (ordinal == 1) {
                list2 = oha2.A00;
                if (list2 == null) {
                    list2 = 0sr.A1P(new C69359Njz[]{C69359Njz.AUDIO_NO_AUDIO_TO_OTHERS, C69359Njz.AUDIO_NO_AUDIO_FROM_OTHERS, C69359Njz.AUDIO_VOLUME_LOW_NEW, C69359Njz.AUDIO_ROBOTIC_NEW, C69359Njz.AUDIO_LAGGED, C69359Njz.AUDIO_ECHO, C69359Njz.AUDIO_BACKGROUND_NOISE});
                    oha2.A00 = list2;
                    if (A062) {
                        list2 = 0jo.A1G(list2);
                        oha2.A00 = list2;
                    }
                }
            } else if (ordinal == 2) {
                list2 = oha2.A02;
                if (list2 == null) {
                    list2 = 0sr.A1P(new C69359Njz[]{C69359Njz.VIDEO_BLURRY, C69359Njz.VIDEO_FROZE, C69359Njz.VIDEO_NO_VIDEO_NEW, C69359Njz.VIDEO_AV_SYNC, C69359Njz.VIDEO_NOT_START_NEW, C69359Njz.VIDEO_SCREEN_SHARING_BLURRY, C69359Njz.VIDEO_SCREEN_SHARING_LAGGED, C69359Njz.VIDEO_FILTERS});
                    oha2.A02 = list2;
                    if (A062) {
                        list2 = 0jo.A1G(list2);
                        oha2.A02 = list2;
                    }
                }
            } else if (ordinal != 4) {
                n9n = C72901POl.A00;
            } else {
                list2 = oha2.A01;
                if (list2 == null) {
                    list2 = 0sr.A1P(new C69359Njz[]{C69359Njz.OTHER_DEVICE_TEMP_HOT, C69359Njz.OTHER_DEVICE_BATTERY_DRAINED, C69359Njz.OTHER_SLOW_APP_NEW, C69359Njz.OTHER_UNWANTED_CALL, C69359Njz.OTHER_CALL_DROPPED, C69359Njz.OTHER_CO_WATCH_NOT_PLAYING, C69359Njz.OTHER_ACCESSIBILITY, C69359Njz.OTHER_MESSAGING});
                    oha2.A01 = list2;
                    if (A062) {
                        list2 = 0jo.A1G(list2);
                        oha2.A01 = list2;
                    }
                }
            }
            return new C68300N9n(AnonymousClass7TE.A16(oha2.A03, 2131954517), 00k.A0T(C69359Njz.SOMETHING_ELSE, list2));
        } else {
            OHA oha3 = nej.A08;
            str = AnonymousClass7TE.A16(oha3.A03, 2131954514);
            map = oha3.A05;
            z = true;
            list = C66580MXl.A13(true, map);
            if (list == null) {
                list = 0sr.A1P(new C69359Njz[]{C69359Njz.AUDIO, C69359Njz.OTHER});
                map.put(z, list);
            }
            n9n = new C68300N9n(str, list);
        }
        return n9n;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69104Nej(Context context, UserSession userSession, OKY oky, C71111Ocu ocu, OLF olf) {
        super(DbS.A0z(C72831PLt.class));
        OHA oha = new OHA(context, userSession);
        C51973G9u.A0r(3, ocu, oky, olf);
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = ocu;
        this.A04 = oky;
        this.A07 = olf;
        this.A08 = oha;
    }

    public static final C331127Pr A00(C69104Nej nej) {
        C331127Pr A002 = nej.A07.A00(C66580MXl.A15(nej, 64), 1.0f, 1.0f, true, false, false);
        A002.A1I = false;
        A002.A0Z = true;
        A002.A19 = false;
        A002.A0A = 2Yu.A02(nej.A02);
        return A002;
    }

    public static final void A02(C69104Nej nej, String str) {
        String str2;
        String str3 = nej.A00;
        String str4 = nej.A01;
        if (182.A06(0Tu.A05, nej.A03, 2342156240441968457L)) {
            str2 = 0Uo.A02();
        } else {
            str2 = null;
        }
        if (str3 != null && str4 != null) {
            nej.A04.A00(new PL5(str3, str4, str2, str));
        }
    }
}
