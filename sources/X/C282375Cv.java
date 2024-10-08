package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TraceLogger;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.5Cv  reason: invalid class name and case insensitive filesystem */
public final class C282375Cv implements 0lm {
    public static final int A01;
    public static final int A02;
    public final UserSession A00;

    private void A01(int i) {
        UserSession userSession;
        0Tu r2;
        long j;
        int intValue;
        UserSession userSession2;
        0Tu r22;
        long j2;
        int intValue2;
        int i2;
        if (i != 1) {
            if (i == 4) {
                userSession = this.A00;
                r2 = 0Tu.A05;
                j = 36602119318737448L;
            } else if (i == 17) {
                userSession = this.A00;
                r2 = 0Tu.A05;
                j = 36602119318868521L;
            } else if (i == 19) {
                userSession = this.A00;
                r2 = 0Tu.A05;
                j = 36602119319130669L;
            } else if (i == 74) {
                userSession = this.A00;
                r2 = 0Tu.A05;
                j = 36598752064507154L;
            } else if (i != 406) {
                switch (i) {
                    case 13:
                        userSession = this.A00;
                        r2 = 0Tu.A05;
                        j = 36602119318999595L;
                        break;
                    case 14:
                        userSession = this.A00;
                        r2 = 0Tu.A05;
                        j = 36602119318606374L;
                        break;
                    case 15:
                        userSession = this.A00;
                        r2 = 0Tu.A05;
                        j = 36602119318934058L;
                        break;
                    default:
                        switch (i) {
                            case ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI:
                                userSession = this.A00;
                                r2 = 0Tu.A05;
                                j = 36598752064179469L;
                                break;
                            case 401:
                                userSession = this.A00;
                                r2 = 0Tu.A05;
                                j = 36598752064245006L;
                                break;
                            case 402:
                                userSession = this.A00;
                                r2 = 0Tu.A05;
                                j = 36598752064310543L;
                                break;
                            case 403:
                                userSession = this.A00;
                                r2 = 0Tu.A05;
                                j = 36598752064376080L;
                                break;
                            default:
                                intValue = 0;
                                break;
                        }
                }
            } else {
                userSession = this.A00;
                r2 = 0Tu.A05;
                j = 36598752064441617L;
            }
            intValue = Long.valueOf(182.A01(r2, userSession, j)).intValue();
        } else {
            userSession = this.A00;
            r2 = 0Tu.A05;
            j = 36602119319327280L;
            intValue = Long.valueOf(182.A01(r2, userSession, j)).intValue();
        }
        if (i != 1) {
            if (i == 4) {
                userSession2 = this.A00;
                r22 = 0Tu.A05;
                j2 = 36602119318540837L;
            } else if (i == 17) {
                userSession2 = this.A00;
                r22 = 0Tu.A05;
                j2 = 36602119318475300L;
            } else if (i != 19) {
                if (!(i == 74 || i == 406)) {
                    switch (i) {
                        case 13:
                            userSession2 = this.A00;
                            r22 = 0Tu.A05;
                            j2 = 36602119319196206L;
                            break;
                        case 14:
                            userSession2 = this.A00;
                            r22 = 0Tu.A05;
                            j2 = 36602119318671911L;
                            break;
                        case 15:
                            userSession2 = this.A00;
                            r22 = 0Tu.A05;
                            j2 = 36602119318409763L;
                            break;
                        default:
                            switch (i) {
                                case ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI:
                                case 401:
                                case 402:
                                case 403:
                                    break;
                                default:
                                    intValue2 = 0;
                                    break;
                            }
                    }
                }
                userSession2 = this.A00;
                r22 = 0Tu.A05;
                j2 = 36598752064113932L;
            } else {
                userSession2 = this.A00;
                r22 = 0Tu.A05;
                j2 = 36602119319261743L;
            }
            intValue2 = Long.valueOf(182.A01(r22, userSession2, j2)).intValue();
        } else {
            userSession2 = this.A00;
            r22 = 0Tu.A05;
            j2 = 36602119319065132L;
            intValue2 = Long.valueOf(182.A01(r22, userSession2, j2)).intValue();
        }
        if (!(i == 4 || i == 5)) {
            switch (i) {
                case 14:
                    i2 = Math.max(Long.valueOf(182.A01(0Tu.A05, this.A00, 36602119319392817L)).intValue(), A01);
                    break;
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    i2 = A01;
                    break;
            }
        }
        i2 = A02;
        TraceLogger.addConfig(i, intValue, intValue2, i2);
    }

    public static final void A02(int i, String str, String str2) {
        TraceLogger.log((PrivacyContext) null, i, (String) null, 83, str, str2, 0, (List) null);
    }

    public static final void A03(String str, List list, int i, int i2, int i3) {
        TraceLogger.log((PrivacyContext) null, i, (String) null, i2, str, (String) null, i3, list);
    }

    public final void onUserSessionWillEnd(boolean z) {
        TraceLogger.removeConfig(1);
        TraceLogger.removeConfig(4);
        TraceLogger.removeConfig(13);
        TraceLogger.removeConfig(15);
        TraceLogger.removeConfig(17);
        TraceLogger.removeConfig(14);
        TraceLogger.removeConfig(19);
        TraceLogger.removeConfig(74);
        TraceLogger.removeConfig(0);
        TraceLogger.removeConfig(403);
        TraceLogger.removeConfig(401);
        TraceLogger.removeConfig(406);
        TraceLogger.removeConfig(402);
        TraceLogger.removeConfig(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A01 = (int) timeUnit.toMillis(2);
        A02 = (int) timeUnit.toMillis(10);
    }

    public static C282375Cv A00(UserSession userSession) {
        return (C282375Cv) userSession.A01(C282375Cv.class, new C282385Cw(userSession));
    }

    public final void A04(List list, int i, String str) {
        PrivacyContext privacyContext;
        String A002 = AnonymousClass000.A00(2265);
        String A003 = AnonymousClass000.A00(867);
        int i2 = i;
        if (i == 10 || i == 13 || i == 15) {
            privacyContext = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative((SqliteHolder) null, A003);
        } else if (i == 4 || i == 5) {
            privacyContext = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative((SqliteHolder) null, A002);
        } else {
            throw new UnsupportedOperationException("no privacy context defined for trace type");
        }
        TraceLogger.log(privacyContext, i2, (String) null, 80, str, (String) null, 0, list);
    }

    public C282375Cv(UserSession userSession) {
        this.A00 = userSession;
        A01(1);
        A01(4);
        A01(13);
        A01(15);
        A01(17);
        A01(14);
        A01(19);
        A01(0);
        A01(74);
        A01(403);
        A01(401);
        A01(406);
        A01(402);
        A01(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
    }
}
