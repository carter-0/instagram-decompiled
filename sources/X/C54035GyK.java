package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: X.GyK  reason: case insensitive filesystem */
public abstract class C54035GyK extends GCG {
    public Long A00;
    public String A01;
    public final Long A02;
    public final long A03;
    public final AnonymousClass0iw A04;
    public final 0wc A05;
    public final UserSession A06;
    public final 1Xj A07;
    public final C228232l0 A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public C54035GyK(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, C228232l0 r6, String str, String str2) {
        long j;
        Long A10;
        0qQ.A0B(str2, 5);
        this.A06 = userSession;
        this.A0C = str;
        this.A04 = r3;
        this.A07 = r5;
        this.A0B = str2;
        this.A08 = r6;
        String A2T = r5.A2T();
        this.A09 = A2T == null ? "" : A2T;
        String A072 = C231122qu.A07(userSession, r5);
        if (A072 == null || (A10 = AnonymousClass7TE.A10(A072)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        this.A03 = j;
        this.A0A = C231122qu.A0F(userSession, r5);
        this.A02 = DbZ.A0c(C231122qu.A05(userSession, r5));
        this.A05 = C51972G9s.A0a(r3, userSession);
    }

    public final void Ck7(String str) {
        long longValue;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "instagram_ads_feedback_interface_response");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A03);
            GCG.A03(A0e, this, Long.parseLong(this.A06.A06));
            A0e.AAJ("afi_type", this.A0B);
            String str2 = this.A0A;
            if (str2 == null) {
                str2 = "";
            }
            A0e.AAJ("ad_tracking_token", str2);
            A0e.A9H("extra_data", AnonymousClass7TF.A0w("ads_category", this.A09));
            A0e.AAJ("trigger_source", "ads_overflow_menu");
            C51971G9r.A19(A0e, "main_question", str);
            Long l = this.A02;
            if (l == null && (l = this.A00) == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            C51970G9q.A1B(A0e, longValue);
            C51969G9p.A1C(A0e, this.A0C);
            A00(str, AnonymousClass05K.A00);
        }
    }

    public final void Ckv(long j) {
    }

    public final void Cl2(String str) {
        long longValue;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "instagram_ads_feedback_interface_undo");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A03);
            GCG.A03(A0e, this, Long.parseLong(this.A06.A06));
            A0e.AAJ("afi_type", this.A0B);
            String str2 = this.A0A;
            if (str2 == null) {
                str2 = "";
            }
            A0e.AAJ("ad_tracking_token", str2);
            A0e.A9H("extra_data", AnonymousClass7TF.A0w("ads_category", this.A09));
            A0e.AAJ("trigger_source", "ads_overflow_menu");
            C51971G9r.A19(A0e, "main_question", str);
            Long l = this.A02;
            if (l == null && (l = this.A00) == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            C51970G9q.A1B(A0e, longValue);
            C51969G9p.A1C(A0e, this.A0C);
            A00(str, AnonymousClass05K.A01);
        }
    }

    private final void A00(String str, Integer num) {
        Object obj;
        long longValue;
        1Xj A042;
        Object A012;
        String str2;
        C228232l0 r0 = this.A08;
        if (r0 != null) {
            try {
                Class<?> cls = r0.getClass();
                int i = 5;
                while (cls != null) {
                    int i2 = i - 1;
                    if (i > 0) {
                        Object[] genericInterfaces = cls.getGenericInterfaces();
                        0qQ.A07(genericInterfaces);
                        int length = genericInterfaces.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                obj = null;
                                break;
                            }
                            obj = genericInterfaces[i3];
                            if (00l.A0d(obj.toString(), "RealtimeSignalProvider", false)) {
                                break;
                            }
                            i3++;
                        }
                        if (obj instanceof ParameterizedType) {
                            Type[] actualTypeArguments = ((ParameterizedType) obj).getActualTypeArguments();
                            if (actualTypeArguments != null && actualTypeArguments.length == 2) {
                                Long l = this.A02;
                                if (l == null && (l = this.A00) == null) {
                                    longValue = -1;
                                } else {
                                    longValue = l.longValue();
                                }
                                Map A0w = AnonymousClass7TF.A0w("ads_category", this.A09);
                                String str3 = this.A00;
                                String str4 = this.A0A;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                C301165yf r3 = new C301165yf((C376459Ib) null, new C53251Gkz(num, str3, str4, this.A0B, "main_question", "ads_overflow_menu", str, A0w, longValue), "", "");
                                if (0qQ.A0K(actualTypeArguments[0], 1Xj.class) && 0qQ.A0K(actualTypeArguments[1], AnonymousClass3W1.class)) {
                                    A042 = this.A07;
                                    A012 = G9t.A18(A042);
                                } else if (0qQ.A0K(actualTypeArguments[0], C255773uh.class) && 0qQ.A0K(actualTypeArguments[1], C250973mM.class)) {
                                    1Xj r1 = this.A07;
                                    User A11 = C51966G9m.A11(r1);
                                    if (A11 != null && (str2 = this.A01) != null) {
                                        A042 = new C255773uh(r1, A11, str2);
                                        A012 = new C250973mM(this.A06, new Reel(new 1Nr(A11), str2, false), false, (String) null, (String) null, 0sl.A00, -1, System.currentTimeMillis(), false);
                                    } else {
                                        return;
                                    }
                                } else if (0qQ.A0K(actualTypeArguments[0], C267324bN.class) && 0qQ.A0K(actualTypeArguments[1], C52058GDe.class)) {
                                    A042 = C267324bN.A0d.A04(this.A07);
                                    UserSession userSession = this.A06;
                                    A012 = C52057GDd.A01(A042, userSession, 1sd.A00(userSession), (AnonymousClass3W1) null, (C52054GDa) null);
                                } else {
                                    return;
                                }
                                r0.DUE(r3, C233162v9.AFI, A042, A012);
                                return;
                            }
                            return;
                        } else if (obj instanceof Class) {
                            cls = (Class) obj;
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } catch (RuntimeException e) {
                0KC.A0F("AdsOverflowMenuAfiLogger", "Failed to get type arguments", e);
            }
        }
    }

    public final void Cis() {
        long longValue;
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "instagram_ads_feedback_interface_impression");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, this.A03);
            GCG.A03(A0e, this, Long.parseLong(this.A06.A06));
            A0e.AAJ("afi_type", this.A0B);
            String str = this.A0A;
            if (str == null) {
                str = "";
            }
            A0e.AAJ("ad_tracking_token", str);
            A0e.A9H("extra_data", AnonymousClass7TF.A0w("ads_category", this.A09));
            A0e.AAJ("trigger_source", "ads_overflow_menu");
            A0e.AAJ("question_id", "main_question");
            Long l = this.A02;
            if (l == null && (l = this.A00) == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            C51970G9q.A1B(A0e, longValue);
            C51969G9p.A1C(A0e, this.A0C);
        }
    }
}
