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
import java.util.Map;

public final class SlJ implements C13906Tl6 {
    public QLA A00;
    public C13822Ths A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Bundle A07;
    public final View A08;
    public final FragmentActivity A09;
    public final AnonymousClass0iw A0A;
    public final UserSession A0B;
    public final 1Xj A0C;
    public final C10310Rq8 A0D = new C10310Rq8(this);
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final Map A0J = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L(C8944RGm.BLOKS_CONTENT_ITEM, new Object()), AnonymousClass7TE.A1L(C8944RGm.GEN_AI_REVIEWS_SUMMARY, new Object()), AnonymousClass7TE.A1L(C8944RGm.PROMO_ADS, new Object()), AnonymousClass7TE.A1L(C8944RGm.REMINDER_ADS, new Object()), AnonymousClass7TE.A1L(C8944RGm.PRODUCT_RECOMMENDER, new Object()), AnonymousClass7TE.A1L(C8944RGm.METADATA, new Object())});

    public SlJ(Bundle bundle, View view, FragmentActivity fragmentActivity, AnonymousClass0iw r12, UserSession userSession, 1Xj r14, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(userSession, 6);
        this.A0G = str;
        this.A0F = str2;
        this.A0E = str3;
        this.A0I = str4;
        this.A0C = r14;
        this.A0B = userSession;
        this.A09 = fragmentActivity;
        this.A0A = r12;
        this.A0H = str5;
        this.A08 = view;
        this.A07 = bundle;
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
        C13822Ths ths;
        View B7F;
        float f = (float) (i - i3);
        float f2 = (float) (i2 - i4);
        if (!this.A06 && !this.A04 && !this.A05 && Math.abs(f) <= Math.abs(f2) && (qla = this.A00) != null && (r3 = ((SystemWebView) qla).A04) != 0 && (ths = this.A01) != null && (B7F = ths.B7F()) != null) {
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
        if (this.A03) {
            this.A03 = false;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) view2.getHeight());
            translateAnimation.setDuration(250);
            Pxg.A1I(translateAnimation);
            C67682MsK msK = new C67682MsK(view, Pxj.A0L(view), C11520Sbh.A00(view2, translateAnimation, this, 4), 0, 0);
            msK.setDuration(250);
            view.startAnimation(msK);
        }
    }

    public static final void A01(View view, View view2, SlJ slJ, long j) {
        if (!slJ.A03) {
            slJ.A03 = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, AnonymousClass7TE.A03(view2), 0.0f);
            translateAnimation.setDuration(j);
            Pxg.A1I(translateAnimation);
            int A002 = C11520Sbh.A00(view2, translateAnimation, slJ, 4);
            View view3 = view;
            C67682MsK msK = new C67682MsK(view3, Pxj.A0L(view), 0, A002, 0);
            msK.setDuration(j);
            view3.startAnimation(msK);
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
            this.A06 = z;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QcV, android.view.View] */
    public final void Dll(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        QLA qla;
        ? r3;
        C13822Ths ths;
        View B7F;
        this.A04 = z2;
        this.A05 = z4;
        if ((z != z2 || z3 != z4) && (qla = this.A00) != null && (r3 = ((SystemWebView) qla).A04) != 0 && (ths = this.A01) != null && (B7F = ths.B7F()) != null) {
            if (this.A04 || this.A05) {
                A00(r3, B7F);
            } else if (z || z3) {
                A01(r3, B7F, this, 0);
            }
        }
    }

    public final void Dvu(String str) {
        if (str != null && !str.equals(this.A02)) {
            this.A02 = str;
            C13822Ths ths = this.A01;
            if (ths != null) {
                ths.DvV("current_url", str);
            }
        }
    }
}
