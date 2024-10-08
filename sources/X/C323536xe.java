package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6xe  reason: invalid class name and case insensitive filesystem */
public final class C323536xe implements C252243on {
    public ImageView A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final C323386xP A03;
    public final C323396xQ A04;
    public final 0wc A05;
    public final 1Ng A06;
    public final 1wn A07;
    public final 1wn A08;
    public final UserSession A09;
    public final C323426xT A0A;
    public final C323546xf A0B;
    public final C249713kF A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final C17869VhM A0J;

    public C323536xe(FragmentActivity fragmentActivity, C323386xP r4, C323396xQ r5, 0wc r6, 1Ng r7, UserSession userSession, C323426xT r9, C17869VhM vhM, C249713kF r11, String str, String str2, String str3, String str4, String str5, String str6) {
        0qQ.A0B(r4, 3);
        0qQ.A0B(r7, 14);
        this.A02 = fragmentActivity;
        this.A09 = userSession;
        this.A03 = r4;
        this.A0H = str;
        this.A0F = str2;
        this.A0D = str3;
        this.A0I = str4;
        this.A0E = str5;
        this.A0G = str6;
        this.A04 = r5;
        this.A05 = r6;
        this.A0C = r11;
        this.A06 = r7;
        this.A0A = r9;
        this.A0J = vhM;
        this.A0B = r11.A0R(userSession, this, str, str2);
        this.A07 = new C323556xg(this);
        this.A08 = new C323566xh(this);
        this.A01 = true;
    }

    public final void A01(2da r9) {
        Integer A062 = this.A0A.A06();
        AnonymousClass3JR r2 = new AnonymousClass3JR();
        r2.A05 = 2131973759;
        r2.A0G = new W9g(this, A062);
        FragmentActivity fragmentActivity = this.A02;
        AnonymousClass3JS r0 = new AnonymousClass3JS(fragmentActivity, R.drawable.instagram_shopping_cart_pano_outline_24);
        r0.A01();
        r2.A0F = r0;
        View AA3 = r9.AA3(new AnonymousClass3Jb(r2));
        AA3.setContentDescription(C55148Hcw.A00(fragmentActivity, A062));
        this.A00 = (ImageView) AA3;
        A00(this, HLL.NATIVE, A062);
        C323386xP r6 = this.A03;
        WEA wea = new WEA(this);
        0qQ.A0B(fragmentActivity, 0);
        if (r6.A01.A00()) {
            r6.A00.A06(fragmentActivity, new C41481Auf(new C59101J6j(46, (Object) r6, (Object) wea)));
        }
        1Ng r22 = this.A06;
        r22.A01(this.A07, C323956yN.class);
        r22.A01(this.A08, C323966yO.class);
        C249713kF r3 = this.A0C;
        UserSession userSession = this.A09;
        r3.A0f(fragmentActivity, userSession, (String) null);
        r3.A1I(userSession, A062, this.A0H, this.A0F);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (X.182.A06(X.0Tu.A06, r5, 2342158005673724849L) != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C323536xe r15, X.HLL r16, java.lang.Integer r17) {
        /*
            android.widget.ImageView r3 = r15.A00
            if (r3 == 0) goto L_0x0091
            r2 = 0
            r10 = r17
            if (r17 == 0) goto L_0x0092
            int r0 = r10.intValue()
        L_0x000d:
            r5 = 1
            r13 = 0
            if (r0 <= 0) goto L_0x0012
            r13 = 1
        L_0x0012:
            X.VhM r6 = r15.A0J
            r9 = r16
            if (r6 == 0) goto L_0x0057
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            int r11 = r0.getLevel()
            boolean r12 = r3.isActivated()
            boolean r14 = r15.A01
            X.OHc r8 = new X.OHc
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.facebook.quicklog.reliability.UserFlowLogger r7 = r6.A01
            long r0 = r6.A00
            java.lang.String r4 = "show_nav_bar_cart_count"
            com.facebook.quicklog.PointEditor r7 = r7.markPointWithEditor(r0, r4)
            X.0qQ.A07(r7)
            java.lang.String r4 = ""
            X.C70338O2q.A00(r7, r8, r4)
            r7.markerEditingCompleted()
            int r7 = r8.A01
            java.lang.Integer r4 = r8.A03
            if (r4 == 0) goto L_0x0052
            int r4 = r4.intValue()
            if (r7 != r4) goto L_0x0052
            if (r4 != 0) goto L_0x0057
            boolean r4 = r8.A05
            if (r4 == 0) goto L_0x0057
        L_0x0052:
            X.MSu r4 = r6.A02
            r4.DTu(r8, r0)
        L_0x0057:
            X.0qQ.A0B(r9, r5)
            X.HLL r0 = X.HLL.GRAPHQL
            if (r9 == r0) goto L_0x007d
            X.6xQ r0 = r15.A04
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 2342158005673528238(0x2081044c00020bae, double:4.061343302615258E-152)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 != 0) goto L_0x007d
            X.0Tu r4 = X.0Tu.A06
            r0 = 2342158005673724849(0x2081044c00050bb1, double:4.061343302781967E-152)
            boolean r1 = X.182.A06(r4, r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x007e
        L_0x007d:
            r0 = 1
        L_0x007e:
            r3.isActivated()
            if (r17 == 0) goto L_0x0091
            if (r0 == 0) goto L_0x0091
            r3.setActivated(r13)
            int r0 = r10.intValue()
            r3.setImageLevel(r0)
            r15.A01 = r2
        L_0x0091:
            return
        L_0x0092:
            r0 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323536xe.A00(X.6xe, X.HLL, java.lang.Integer):void");
    }

    public final void onDestroy() {
        1Ng r2 = this.A06;
        r2.A02(this.A07, C323956yN.class);
        r2.A02(this.A08, C323966yO.class);
    }

    public final void onDestroyView() {
        1Ng r2 = this.A06;
        r2.A02(this.A07, C323956yN.class);
        r2.A02(this.A08, C323966yO.class);
        this.A00 = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        1Ng r2 = this.A06;
        r2.A01(this.A07, C323956yN.class);
        r2.A01(this.A08, C323966yO.class);
    }

    public C323536xe() {
    }
}
