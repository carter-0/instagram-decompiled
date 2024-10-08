package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class M5I implements Runnable {
    public final /* synthetic */ C62423KfY A00;

    public M5I(C62423KfY kfY) {
        this.A00 = kfY;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.07Z, X.4DH] */
    public final void run() {
        SpannableStringBuilder A08;
        0sP r0;
        C62423KfY kfY = this.A00;
        String str = kfY.A03;
        if (str != null) {
            C65816M0i m0i = kfY.A0E;
            if (m0i != null) {
                XPM xpm = kfY.A0D;
                String str2 = kfY.A0c.A0C;
                boolean A1Z = AnonymousClass7TG.A1Z(xpm, str);
                m0i.A04 = xpm;
                if (xpm.A0K) {
                    LRP lrp = m0i.A0U;
                    lrp.A06 = xpm.A0C;
                    lrp.A00 = -1;
                    lrp.A01 = AnonymousClass05K.A01;
                    0xF r7 = new 0xF();
                    0xF.A00(r7, lrp.A02.A06, "u");
                    0xF.A00(r7, AnonymousClass000.A00(94), "appID");
                    0xF.A00(r7, lrp.A03, "v");
                    LRP.A00(r7, lrp, "CREATE", "INFO", "BROADCASTER");
                }
                if (!m0i.A05.A01()) {
                    String str3 = xpm.A0C;
                    m0i.A09 = str3;
                    m0i.A01 = AnonymousClass7TG.A0I();
                    UserSession userSession = m0i.A0R;
                    C313816h4 r02 = LKG.A01(userSession).A03;
                    long j = m0i.A01;
                    r02.A01.A02 = Long.valueOf(j);
                    m0i.A0A = str;
                    m0i.A0D = str2;
                    LKG.A01(userSession).A03.A01.A03 = str2;
                    M0Y m0y = m0i.A08;
                    if (m0y != null) {
                        long j2 = xpm.A0B;
                        m0i.A0O.CPy();
                        m0y.A02 = str3;
                        m0y.A0J.invoke(str3, Long.valueOf(j2));
                        C313886hJ r9 = m0y.A0B;
                        r9.A04(str3);
                        r9.A03(m0y.A08, str3);
                        if (182.A06(0Tu.A05, m0y.A06, 2342166277780548649L)) {
                            AnonymousClass7TE.A1Z(new MGB(r9, (AnonymousClass4D7) null, 14, A1Z), C318116oQ.A00(r9));
                        }
                        C64514LdG ldG = m0y.A07;
                        ldG.A00.EhZ(new M0L(m0y, str3));
                        AnonymousClass2Fj r2 = r9.A01;
                        ? r5 = m0y.A05;
                        C64321LZw.A00(r5, r2, new MPC(m0y, 25), 4);
                        C64321LZw.A00(r5, r9.A03, new MPC(m0y, 26), 4);
                        m0y.A0F.A03(str3);
                        LEK lek = m0y.A00;
                        if (lek != null) {
                            C61038Jvc jvc = new C61038Jvc();
                            Context context = lek.A08;
                            String str4 = jvc.A01;
                            String str5 = jvc.A02;
                            AnonymousClass7TF.A1B(str4, A1Z ? 1 : 0, str5);
                            Integer A0l = 00y.A0l(str5);
                            if (A0l == null || A0l.intValue() == 0) {
                                A08 = DbW.A08(context, 2131965428);
                            } else {
                                SpannableStringBuilder append = C51965G9l.A0E().append(DbY.A0c(context, str4, 2131965423)).append(" • ");
                                String A0d = DbY.A0d(context.getResources(), AnonymousClass7TG.A0A(00y.A0l(str5)), R.plurals.live_user_pay_badges_lowercase);
                                0qQ.A07(A0d);
                                A08 = append.append(A0d);
                                0qQ.A0A(A08);
                            }
                            if (!String.valueOf((Object) null).contentEquals(DbT.A10(A08)) && (r0 = lek.A0B) != null) {
                                r0.invoke(jvc);
                            }
                        }
                    }
                    LES A02 = m0i.A0W.A02();
                    A02.A0U.Epw(C62515Kh5.STARTED);
                    ((02m) AnonymousClass7TE.A14(((L5N) m0i.A0V.A01.getValue()).A01)).markerEnd(29241390, 2);
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Broadcast must have an associated mediaId.");
    }
}
