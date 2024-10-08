package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.3Sl  reason: invalid class name and case insensitive filesystem */
public final class C242053Sl implements C61110lV, AnonymousClass0lh {
    public AnonymousClass6UF A00;
    public UserSession A01;
    public String A02;
    public boolean A03;
    public final String A04;
    public final String A05;
    public final int A06;
    public final 1wn A07;
    public final C242073Sn A08;

    public static synchronized void A00(Context context, UserSession userSession) {
        Class<C242053Sl> cls = C242053Sl.class;
        synchronized (cls) {
            if (((C242053Sl) userSession.A00(cls)) == null) {
                C242053Sl r2 = new C242053Sl(context, userSession);
                if (Build.VERSION.SDK_INT >= 29) {
                    14i.A08.A0B(r2);
                } else {
                    14i.A08.A0A(r2);
                }
                userSession.A04(cls, r2);
            }
        }
    }

    public static synchronized void A01(C242053Sl r18, String str, String str2, int i) {
        String str3;
        C242053Sl r7 = r18;
        synchronized (r7) {
            String str4 = str;
            if (str4.equals(r7.A02)) {
                int i2 = i;
                if (i2 < r7.A06) {
                    if ((Build.VERSION.SDK_INT < 29 || !14i.A09()) && !14i.A08()) {
                        C242073Sn r6 = r7.A08;
                        if (C270924hc.A00(r6.A02(), AnonymousClass05K.A0C, (Set) null, (Set) null, false) == AnonymousClass05K.A0N) {
                            AnonymousClass6UF r1 = r7.A00;
                            if (r1 != null && !r1.isDone()) {
                                r1.cancel(true);
                            }
                            AnonymousClass6UF A062 = r6.A06();
                            r7.A00 = A062;
                            String str5 = str2;
                            if (i == 0) {
                                if (str2 == null) {
                                    str3 = "ig_place_tagging";
                                } else {
                                    str3 = 002.A0R("ig_place_tagging", str5);
                                }
                            } else if (str2 == null) {
                                str3 = "ig_place_tagging_extra";
                            } else {
                                str3 = 002.A0R(str5, "ig_place_tagging_extra");
                            }
                            C10941S1x s1x = null;
                            if (i != 0) {
                                s1x = new C10941S1x(10000, 1800000);
                                s1x.A00 = true;
                            }
                            A062.A04(new C11202SFc((S0D) null, (C10815Ryb) null, (C276224ss) null, s1x, str, true, false), str3);
                            C255183ti.A04(new T0T(r7, str4, str5, i2), r7.A00, r6.A09());
                        }
                    } else {
                        14i.A08();
                    }
                }
                r7.A02 = null;
            }
        }
    }

    public final void onSessionWillEnd() {
        AnonymousClass1Nd.A00(this.A01).A02(this.A07, C242133St.class);
        if (Build.VERSION.SDK_INT >= 29) {
            14i.A07(this);
        } else {
            14i.A06(this);
        }
        this.A01 = null;
    }

    public C242053Sl(Context context, UserSession userSession) {
        String str;
        C242063Sm r2 = new C242063Sm(this);
        this.A07 = r2;
        this.A01 = userSession;
        this.A08 = C242073Sn.A00(context, userSession);
        this.A04 = 0qv.A02.A05(context);
        19i A012 = 0jh.A04.A01(userSession).A01(19f.A1t);
        if (A012 == null) {
            str = "Not initiated";
        } else {
            str = A012.A01;
        }
        this.A05 = str;
        AnonymousClass1Nd.A00(this.A01).A01(r2, C242133St.class);
        0Tu r22 = 0Tu.A05;
        this.A03 = 182.A06(r22, userSession, 2342155518887396496L);
        int intValue = Long.valueOf(182.A01(r22, userSession, 36593984650544678L)).intValue();
        this.A06 = intValue < 0 ? 1 : intValue;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(576731480);
        if (this.A03) {
            synchronized (this) {
                AnonymousClass6UF r1 = this.A00;
                if (r1 != null && !r1.isDone()) {
                    r1.cancel(true);
                }
                this.A02 = null;
            }
        }
        AnonymousClass0fD.A0A(-1120207662, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-2050953189, AnonymousClass0fD.A03(-1286867608));
    }
}
