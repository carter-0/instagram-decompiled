package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8Kh  reason: invalid class name and case insensitive filesystem */
public final class C354008Kh {
    public static final C354018Ki A04;
    public static final String A05;
    public final 28t A00;
    public final UserSession A01;
    public final AnonymousClass80W A02;
    public final List A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.8Ki] */
    static {
        ? obj = new Object();
        A04 = obj;
        A05 = obj.getClass().getSimpleName();
    }

    public final void A00(int i) {
        int i2;
        AnonymousClass80W r3 = this.A02;
        if (r3.A00.first != AnonymousClass80X.POST_CAPTURE) {
            StringBuilder sb = new StringBuilder();
            sb.append(A05);
            sb.append('_');
            sb.append(this.A00);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Post-capture color filters being used in ");
            sb2.append(r3.A00.first);
            0kD.A07(obj, sb2.toString(), (Throwable) null);
        }
        27r A012 = 27p.A01(this.A01);
        Number number = (Number) 00k.A0O(this.A03, i);
        if (number != null) {
            i2 = number.intValue();
        } else {
            i2 = 0;
        }
        A012.A1A(this.A00, C59725JVj.POST_CAPTURE, i2, i);
    }

    public C354008Kh(28t r1, UserSession userSession, AnonymousClass80W r3, List list) {
        this.A01 = userSession;
        this.A03 = list;
        this.A02 = r3;
        this.A00 = r1;
    }
}
