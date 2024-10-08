package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ScrollView;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.android.R;
import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IABScreenshotTransitionTime;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGAdsIABScreenshotVariant;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Timer;

/* renamed from: X.QKw  reason: case insensitive filesystem */
public final class C7581QKw extends C11364SPc implements B3J, C13923TlR, C13922TlQ, B3K {
    public View A00;
    public ScrollView A01;
    public C10997S4r A02;
    public C226692hh A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final long A09;
    public final IGAdsIABScreenshotDataDict A0A;
    public final UserSession A0B;
    public final Integer A0C;
    public final String A0D;
    public final Timer A0E;
    public final boolean A0F;

    public C7581QKw(IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict, UserSession userSession, String str) {
        Integer num;
        IABScreenshotTransitionTime Bpz = iGAdsIABScreenshotDataDict.Bpz();
        if (Bpz != null) {
            int ordinal = Bpz.ordinal();
            if (ordinal == 2) {
                num = AnonymousClass05K.A0C;
            } else if (ordinal == 3) {
                num = AnonymousClass05K.A01;
            }
            0Tu r3 = 0Tu.A05;
            long A012 = 182.A01(r3, userSession, 36605215990224080L);
            0qQ.A0B(num, 2);
            this.A0D = str;
            this.A0C = num;
            this.A09 = A012;
            this.A0A = iGAdsIABScreenshotDataDict;
            this.A0B = userSession;
            this.A0E = new Timer("IABScreenshotPreviewTimeout");
            this.A0F = 182.A06(r3, userSession, 36323741013454275L);
        }
        num = AnonymousClass05K.A00;
        0Tu r32 = 0Tu.A05;
        long A0122 = 182.A01(r32, userSession, 36605215990224080L);
        0qQ.A0B(num, 2);
        this.A0D = str;
        this.A0C = num;
        this.A09 = A0122;
        this.A0A = iGAdsIABScreenshotDataDict;
        this.A0B = userSession;
        this.A0E = new Timer("IABScreenshotPreviewTimeout");
        this.A0F = 182.A06(r32, userSession, 36323741013454275L);
    }

    public static final C268764dx A00(Context context, IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction, IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant, Float f) {
        if (f == null) {
            return null;
        }
        float floatValue = f.floatValue();
        if (floatValue == 0.0f) {
            return null;
        }
        if (IGAdsIABScreenshotVariant.SHOW_BLUR == iGAdsIABScreenshotVariant || IABScreenshotEffectOnUserAction.BLUR == iABScreenshotEffectOnUserAction) {
            return new QOP(context, (int) (floatValue * AnonymousClass7TF.A0E(context).density));
        }
        if (IGAdsIABScreenshotVariant.SHOW_BRIGHTNESS != iGAdsIABScreenshotVariant && IABScreenshotEffectOnUserAction.BRIGHT != iABScreenshotEffectOnUserAction) {
            return null;
        }
        int i = -16777216;
        if (floatValue > 0.0f) {
            i = -1;
        }
        return new QOO(i, Float.valueOf(Math.abs(floatValue)));
    }

    public final synchronized void A02() {
        ViewPropertyAnimator animate;
        if (this.A08) {
            this.A08 = false;
            C10997S4r s4r = this.A02;
            if (s4r == null) {
                0qQ.A0F("logger");
                throw AnonymousClass00P.createAndThrow();
            }
            if (!s4r.A00) {
                s4r.A00 = true;
                A9z a9z = s4r.A03;
                if (a9z != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean z = a9z.A0p;
                    if (z) {
                        a9z.A0U = Long.valueOf(currentTimeMillis);
                    }
                    if (z) {
                        a9z.A0S = false;
                    }
                }
            }
            Timer timer = this.A0E;
            timer.cancel();
            timer.purge();
            C13347TVu tVu = new C13347TVu((Object) this, 47);
            long j = this.A09;
            if (j > 0) {
                View view = this.A00;
                if (!(view == null || (animate = view.animate()) == null)) {
                    animate.setInterpolator(new LinearInterpolator());
                    animate.setDuration(j);
                    animate.alpha(0.0f);
                    animate.setStartDelay(0);
                    animate.withEndAction(new TBP(tVu));
                    animate.start();
                }
            } else {
                tVu.invoke();
            }
        }
    }

    public final void DDj(Context context, Intent intent, View view, C340027ka r10, C13847TiP tiP, C340037kb r12) {
        0qQ.A0B(context, 0);
        C51974G9v.A1P(intent, view, r10, r12);
        this.A02 = new C10997S4r(r10);
        super.DDj(context, intent, view, r10, tiP, r12);
        this.A03 = new QNE(this, new QND(this));
        View view2 = ((BrowserLiteFragment) r10).A0A;
        if (view2 != null) {
            View A0H = JTP.A0H(JTR.A0X(view2, R.id.screenshot_preview_overlay), R.layout.iab_screenshot_imageview);
            0qQ.A0C(A0H, "null cannot be cast to non-null type android.widget.ScrollView");
            ScrollView scrollView = (ScrollView) A0H;
            View A0G = AnonymousClass7TF.A0G(scrollView, R.id.iab_screenshot_image_view);
            this.A00 = A0G;
            this.A01 = scrollView;
            IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict = this.A0A;
            A03(A0G, A00(context, (IABScreenshotEffectOnUserAction) null, iGAdsIABScreenshotDataDict.Bq1(), iGAdsIABScreenshotDataDict.Bpx()));
            this.A08 = true;
            C11497SbK.A01(A0G, 14, this);
            Float BPL = iGAdsIABScreenshotDataDict.BPL();
            if (BPL != null) {
                this.A0E.schedule(new TSZ(this), Pxf.A0E((int) BPL.floatValue()));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static void A01(C7581QKw qKw, C240493Lc r4) {
        int width;
        View view = qKw.A00;
        if (view != null) {
            int width2 = r4.getWidth();
            Integer valueOf = Integer.valueOf(width2);
            if (width2 != 0 && valueOf != null && view.getMinimumHeight() != (width = (view.getWidth() * r4.getHeight()) / width2)) {
                view.setMinimumHeight(width);
            }
        }
    }

    public final void A03(View view, C268764dx r6) {
        AnonymousClass1U3 A002 = AnonymousClass1UL.A00(1U1.A0b);
        A002.A0O = r6;
        1U1 r3 = new 1U1(A002);
        C226662he A003 = AnonymousClass6QK.A00(Uri.parse(this.A0D), (Map) null);
        C226692hh r0 = this.A03;
        if (r0 != null) {
            C226712hj.A00(view, r0, r3, A003, "IABScreenshotPreviewController");
        } else {
            0qQ.A0F("imageRequestListener");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
