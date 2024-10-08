package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.webview.SystemWebView;
import com.instagram.common.session.UserSession;

public final class SlK implements C13906Tl6 {
    public QLA A00;
    public C13789Th4 A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Bundle A09;
    public final View A0A;
    public final FragmentActivity A0B;
    public final AnonymousClass0iw A0C;
    public final UserSession A0D;
    public final 1Xj A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public SlK(Bundle bundle, View view, FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, 1Xj r7, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(userSession, 7);
        this.A0A = view;
        this.A0H = str;
        this.A0G = str2;
        this.A0F = str3;
        this.A0J = str4;
        this.A0E = r7;
        this.A0D = userSession;
        this.A0B = fragmentActivity;
        this.A0C = r5;
        this.A0I = str5;
        this.A09 = bundle;
        this.A02 = str;
    }

    public final void CwH(Fragment fragment) {
    }

    public final void Cz8() {
    }

    public final void DDj(Context context, Intent intent, View view, C340027ka r4, C13847TiP tiP, C340037kb r6) {
    }

    public final boolean DIU() {
        return false;
    }

    public final boolean DIZ(Intent intent, String str) {
        return false;
    }

    public final void DOE(QLA qla, String str) {
    }

    public final void DW4(QLA qla, long j) {
    }

    public final void DWO(boolean z) {
    }

    public final void DjT(String str) {
    }

    public final void DsY(MotionEvent motionEvent, View view) {
    }

    public final boolean EsT(QLA qla, String str) {
        return false;
    }

    public final void FNP(QLA qla) {
    }

    public final void destroy() {
    }

    public final String getUrl() {
        return "";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QcV, android.view.View] */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        QLA qla;
        ? r3;
        C13789Th4 th4;
        View B7F;
        float f = (float) (i - i3);
        float f2 = (float) (i2 - i4);
        if (!this.A08 && !this.A06 && !this.A07 && Math.abs(f) <= Math.abs(f2) && (qla = this.A00) != null && (r3 = ((SystemWebView) qla).A04) != 0 && (th4 = this.A01) != null && (B7F = th4.B7F()) != null) {
            if (f2 < 0.0f) {
                A01(r3, B7F, this, 250);
            } else {
                A00(r3, B7F);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    private final void A00(View view, View view2) {
        if (this.A05) {
            this.A05 = false;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) view2.getHeight());
            translateAnimation.setDuration(250);
            Pxg.A1I(translateAnimation);
            C67682MsK msK = new C67682MsK(view, Pxj.A0L(view), C11520Sbh.A00(view2, translateAnimation, this, 5), 0, 1);
            msK.setDuration(250);
            view.startAnimation(msK);
        }
    }

    public static final void A01(View view, View view2, SlK slK, long j) {
        if (!slK.A05) {
            slK.A05 = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, AnonymousClass7TE.A03(view2), 0.0f);
            translateAnimation.setDuration(j);
            Pxg.A1I(translateAnimation);
            C67682MsK msK = new C67682MsK(view, Pxj.A0L(view), 0, C11520Sbh.A00(view2, translateAnimation, slK, 5), 1);
            msK.setDuration(j);
            view.startAnimation(msK);
        }
    }

    public final void CrW(QLA qla) {
        this.A00 = qla;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QcV, android.view.View] */
    public final void D9l(QLA qla) {
        ? r1 = ((SystemWebView) qla).A04;
        if (r1 != 0) {
            boolean canScrollVertically = r1.canScrollVertically(-1);
            boolean z = true;
            boolean canScrollVertically2 = r1.canScrollVertically(1);
            if (canScrollVertically || canScrollVertically2) {
                z = false;
            }
            this.A08 = z;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QcV, android.view.View] */
    public final void Dll(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        QLA qla;
        ? r3;
        C13789Th4 th4;
        View B7F;
        this.A06 = z2;
        this.A07 = z4;
        if ((z != z2 || z3 != z4) && (qla = this.A00) != null && (r3 = ((SystemWebView) qla).A04) != 0 && (th4 = this.A01) != null && (B7F = th4.B7F()) != null) {
            if (z2 || z4) {
                A00(r3, B7F);
            } else if (z || z3) {
                A01(r3, B7F, this, 0);
            }
        }
    }

    public final void Dvu(String str) {
        if (str != null && !str.equals(this.A02)) {
            this.A02 = str;
            C13789Th4 th4 = this.A01;
            if (th4 != null) {
                th4.DvV("current_url", str);
            }
        }
    }
}
