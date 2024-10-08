package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.7V0  reason: invalid class name */
public final class AnonymousClass7V0 {
    public final UserSession A00;
    public final AnonymousClass9H7 A01;
    public final C376359Hr A02;
    public final C332347Up A03;
    public final Runnable A04;
    public final Runnable A05;
    public final WeakReference A06;
    public final AnonymousClass0eK A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new C377109Ko(this, 30));
    public final Handler A09;
    public final C61410nE A0A;
    public volatile N3U A0B;
    public volatile AnonymousClass9VE A0C;
    public volatile C376369Hs A0D = C376369Hs.A01;

    public static final void A01(AnonymousClass7V0 r4) {
        r4.A02.A02(new C330877Op(r4), AnonymousClass05K.A00, new C67468MoN[]{C67468MoN.A05});
    }

    private final boolean A02() {
        2Er Api;
        C333517Zg r0 = (C333517Zg) this.A07.get();
        if (r0 == null || (Api = r0.Api()) == null || Api.BHS() != 7) {
            return false;
        }
        return true;
    }

    public final long A03() {
        String str;
        Integer num;
        N3U n3u;
        Long l;
        AnonymousClass9VE r0 = this.A0C;
        C67468MoN moN = null;
        if (r0 != null) {
            str = r0.A06;
        } else {
            str = null;
        }
        if ("IG_SAFETY_EDUCATION_NOTICE_COMPOSER_BLOCK".equalsIgnoreCase(str)) {
            if (182.A06(0Tu.A05, this.A00, 36317182598320969L)) {
                AnonymousClass9VE r2 = this.A0C;
                if (r2 == null || (l = r2.A05) == null) {
                    return 0;
                }
                return l.longValue();
            }
        }
        N3U n3u2 = this.A0B;
        if (n3u2 != null) {
            num = n3u2.A02;
        } else {
            num = null;
        }
        if (num != AnonymousClass05K.A00) {
            return 0;
        }
        N3U n3u3 = this.A0B;
        if (n3u3 != null) {
            moN = n3u3.A01;
        }
        if (moN != C67468MoN.A05 || (n3u = this.A0B) == null) {
            return 0;
        }
        return n3u.A00;
    }

    public final String A04() {
        Integer num;
        C67468MoN moN;
        N3U n3u;
        N3U n3u2 = this.A0B;
        if (n3u2 != null) {
            num = n3u2.A02;
        } else {
            num = null;
        }
        if (num != AnonymousClass05K.A00) {
            return null;
        }
        N3U n3u3 = this.A0B;
        if (n3u3 != null) {
            moN = n3u3.A01;
        } else {
            moN = null;
        }
        if (moN != C67468MoN.A05) {
            return null;
        }
        if (182.A06(0Tu.A05, this.A00, 36317182598320969L) || (n3u = this.A0B) == null) {
            return null;
        }
        return n3u.A03;
    }

    public final boolean A06() {
        if (this.A0D.A00 > System.currentTimeMillis() / 1000) {
            return true;
        }
        return false;
    }

    public final boolean A07() {
        String BMX;
        2Er Api = ((C333517Zg) this.A07.get()).Api();
        if (Api == null || (BMX = Api.BMX()) == null || BMX.length() <= 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass7V0(Handler handler, UserSession userSession, C61410nE r5, AnonymousClass9H7 r6, C376359Hr r7, C332347Up r8, Runnable runnable, Runnable runnable2, WeakReference weakReference, AnonymousClass0eK r12) {
        this.A00 = userSession;
        this.A06 = weakReference;
        this.A09 = handler;
        this.A07 = r12;
        this.A01 = r6;
        this.A04 = runnable;
        this.A05 = runnable2;
        this.A02 = r7;
        this.A03 = r8;
        this.A0A = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        if (r13.A07() != false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass7V0 r13) {
        /*
            boolean r0 = r13.A05()
            if (r0 == 0) goto L_0x007b
            boolean r0 = r13.A02()
            if (r0 != 0) goto L_0x007b
            long r0 = r13.A03()
            java.lang.String r6 = r13.A04()
            com.instagram.common.session.UserSession r5 = r13.A00
            X.0Tu r4 = X.0Tu.A05
            r2 = 36317182598320969(0x81064900041349, double:3.030470740510106E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            r7 = 0
            if (r2 == 0) goto L_0x002e
            X.9VE r2 = r13.A0C
            if (r2 == 0) goto L_0x002e
            X.9VF r2 = r2.A03
            if (r2 == 0) goto L_0x002e
            java.lang.String r7 = r2.A00
        L_0x002e:
            X.0eK r2 = r13.A07
            java.lang.Object r3 = r2.get()
            X.7Zg r3 = (X.C333517Zg) r3
            X.2Er r5 = r3.Api()
            X.7GM r4 = X.AnonymousClass7GM.ENFORCEMENT_NOTICE
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = r3.toMillis(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r0
            r8 = 0
            r10 = 0
            X.7GK r3 = new X.7GK
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x004f:
            java.lang.Object r0 = r2.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7Yy r2 = r0.BCh()
            boolean r0 = r13.A06()
            if (r0 != 0) goto L_0x006c
            boolean r0 = r13.A05()
            if (r0 != 0) goto L_0x006c
            boolean r1 = r13.A07()
            r0 = 0
            if (r1 == 0) goto L_0x006d
        L_0x006c:
            r0 = 1
        L_0x006d:
            r2.DEx(r0)
            android.os.Handler r1 = r13.A09
            X.Any r0 = new X.Any
            r0.<init>(r13, r3)
            r1.post(r0)
        L_0x007a:
            return
        L_0x007b:
            boolean r0 = r13.A06()
            if (r0 == 0) goto L_0x00af
            boolean r0 = r13.A02()
            if (r0 != 0) goto L_0x00af
            X.9Hs r0 = r13.A0D
            long r0 = r0.A00
            X.0eK r2 = r13.A07
            java.lang.Object r3 = r2.get()
            X.7Zg r3 = (X.C333517Zg) r3
            X.2Er r5 = r3.Api()
            X.7GM r4 = X.AnonymousClass7GM.FEATURE_LIMITED
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = r3.toMillis(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r0
            r6 = 0
            r10 = 0
            X.7GK r3 = new X.7GK
            r7 = r6
            r8 = r6
            r9 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x004f
        L_0x00af:
            boolean r0 = r13.A07()
            if (r0 == 0) goto L_0x007a
            boolean r0 = r13.A02()
            if (r0 != 0) goto L_0x007a
            X.0eK r2 = r13.A07
            java.lang.Object r0 = r2.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.2Er r0 = r0.Api()
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = r0.BMX()
        L_0x00cd:
            java.lang.Object r0 = r2.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.2Er r0 = r0.Api()
            X.7GK r3 = X.AnonymousClass7GL.A01(r0, r1)
            goto L_0x004f
        L_0x00dd:
            r1 = 0
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7V0.A00(X.7V0):void");
    }

    public final boolean A05() {
        if (A03() > System.currentTimeMillis() / 1000) {
            return true;
        }
        return false;
    }
}
