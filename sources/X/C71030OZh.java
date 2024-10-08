package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.OZh  reason: case insensitive filesystem */
public final class C71030OZh {
    public 1a8 A00;
    public AnonymousClass7ZA A01;
    public C74345PtL A02;
    public C254743sy A03;
    public Boolean A04;
    public String A05;
    public final int A06;
    public final int A07;
    public final Activity A08;
    public final Context A09;
    public final Fragment A0A;
    public final 0hq A0B;
    public final 0wc A0C;
    public final UserSession A0D;
    public final AnonymousClass36V A0E;
    public final O62 A0F;
    public final String A0G;
    public final String A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if ((r8 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C71030OZh(androidx.fragment.app.Fragment r5, X.0wc r6, com.instagram.common.session.UserSession r7, X.C254743sy r8, java.lang.String r9, java.lang.String r10, int r11, int r12) {
        /*
            r4 = this;
            java.lang.String r3 = "thread_details"
            X.0hq r1 = r5.getChildFragmentManager()
            r0 = 0
            r4.<init>()
            r4.A0A = r5
            r4.A08 = r0
            r4.A0B = r1
            android.content.Context r2 = r5.requireContext()
            r4.A09 = r2
            r4.A0D = r7
            r4.A0G = r9
            r4.A0H = r10
            r4.A06 = r11
            r4.A07 = r12
            r4.A0C = r6
            r4.A03 = r8
            r4.A05 = r3
            if (r8 == 0) goto L_0x002d
            boolean r1 = r8 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r0 = 1
            if (r1 != 0) goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A04 = r0
            X.O62 r0 = new X.O62
            r0.<init>(r6)
            r4.A0F = r0
            r1 = 3
            X.FZf r0 = new X.FZf
            r0.<init>(r4, r1)
            X.36U r0 = X.AnonymousClass36R.A00(r2, r7, r0)
            r4.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71030OZh.<init>(androidx.fragment.app.Fragment, X.0wc, com.instagram.common.session.UserSession, X.3sy, java.lang.String, java.lang.String, int, int):void");
    }

    public static void A00(C71030OZh oZh) {
        C358248ab A0Y = DbS.A0Y(oZh.A09);
        A0Y.A09(2131961740);
        int i = 2131960463;
        if (182.A05(0Tu.A05, oZh.A0D)) {
            i = 2131960462;
        }
        A0Y.A08(i);
        Dba.A0t(C71249OgE.A00(oZh, 66), A0Y, 2131960862);
    }

    public final void A01(Uri uri) {
        C74345PtL ptL = this.A02;
        if (ptL != null) {
            new R8F().A0B(this.A0B, ReactProgressBarViewManager.PROP_PROGRESS);
            String A0Z = JTQ.A0Z();
            Context context = this.A09;
            UserSession userSession = this.A0D;
            Dba.A0j(1, context, userSession);
            C290815g0 r1 = new C290815g0(new C13148TNg(context, userSession, uri, A0Z, 2), 679);
            C68439NHz nHz = new C68439NHz(userSession, ptL, this, 5);
            String str = this.A0G;
            r1.A00 = new NQR(nHz, this.A00, userSession, this.A01, new OCI(ptL, this), this.A03, A0Z, str);
            1ES.A03(r1);
        }
    }

    public final void A02(boolean z) {
        int i = this.A07;
        Boolean valueOf = Boolean.valueOf(AnonymousClass7TF.A1S(i, 29));
        C358248ab A0Y = DbS.A0Y(this.A09);
        A0Y.A09(2131960457);
        A0Y.A0I(new C71183Of1(20, this, valueOf), 2131960459);
        A0Y.A0G(new C71183Of1(21, this, valueOf), 2131960576);
        A0Y.A0C(new C71183Of1(22, this, valueOf));
        A0Y.A0r(true);
        A0Y.A0s(true);
        if (z) {
            int i2 = 2131960566;
            if (AnonymousClass7LY.A00(i)) {
                i2 = 2131960567;
            }
            A0Y.A0G(new C71183Of1(23, this, valueOf), i2);
        }
        DbT.A1V(A0Y);
    }

    public C71030OZh(FragmentActivity fragmentActivity, 0wc r5, UserSession userSession, AnonymousClass36V r7, String str, String str2, int i, int i2) {
        0hq supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        this.A0A = null;
        this.A08 = fragmentActivity;
        this.A0B = supportFragmentManager;
        this.A09 = fragmentActivity;
        this.A0D = userSession;
        this.A0G = str;
        this.A0H = str2;
        this.A06 = i;
        this.A07 = i2;
        this.A0C = r5;
        this.A03 = null;
        this.A05 = "message_thread";
        this.A04 = AnonymousClass7TE.A0u();
        this.A0F = new O62(r5);
        this.A0E = r7 == null ? AnonymousClass36R.A00(fragmentActivity, userSession, new C50348FZf(this, 3)) : r7;
    }
}
