package com.facebook.browser.lite.views;

import X.2cp;
import X.2cs;
import X.2db;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13847TiP;
import X.C15162UTn;
import X.C232922uf;
import X.C340027ka;
import X.C340037kb;
import X.C71392co;
import X.C7845QbT;
import X.JTP;
import X.QLA;
import X.SCX;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;
import com.instagram.android.R;
import java.util.regex.Pattern;

public class BrowserLiteWrapperView extends FrameLayout {
    public static final C71392co A0C = C71392co.A04(50.0d, 5.0d);
    public static final C71392co A0D = C71392co.A04(30.0d, 7.0d);
    public int A00;
    public int A01;
    public ArgbEvaluator A02;
    public View A03;
    public View A04;
    public C340027ka A05;
    public C13847TiP A06;
    public 2cs A07;
    public boolean A08;
    public int A09;
    public C340037kb A0A;
    public final C232922uf A0B = new C7845QbT(this, 1);

    private void A00() {
        int i;
        FragmentActivity activity = this.A05.getActivity();
        Pattern pattern = SCX.A01;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.A09 = displayMetrics.heightPixels;
        if (!this.A05.getIntent().getBooleanExtra("extra_hide_system_status_bar", false)) {
            int i2 = this.A09;
            FragmentActivity activity2 = this.A05.getActivity();
            int identifier = activity2.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = AnonymousClass7TF.A02(activity2, identifier);
            } else {
                i = 0;
            }
            this.A09 = i2 - i;
        }
        ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
        layoutParams.height = -1;
        this.A03.setLayoutParams(layoutParams);
    }

    private void setStatusBarColor(int i) {
        2db.A02(this.A05.getActivity(), i);
    }

    private void setupBackgroundProtectionAlpha(float f) {
        this.A03.setAlpha(f);
    }

    public final void A04(C340027ka r3, C13847TiP tiP, C340037kb r5) {
        this.A0A = r5;
        this.A04 = findViewById(R.id.browser_container);
        this.A05 = r3;
        this.A06 = tiP;
        this.A02 = new ArgbEvaluator();
        this.A01 = this.A05.getActivity().getColor(R.color.fds_transparent);
        this.A00 = 2db.A00(this.A05.getActivity());
        this.A03 = findViewById(R.id.browser_background_protection);
        A00();
        setupBackgroundProtectionAlpha(0.0f);
        2cs A022 = 2cp.A00().A02();
        A022.A09(A0D);
        A022.A06 = true;
        A022.A0A(this.A0B);
        this.A07 = A022;
    }

    public final void A05(Runnable runnable, double d, float f, boolean z) {
        if (!this.A08) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > AnonymousClass7TE.A03(this)) {
                f = AnonymousClass7TE.A03(this);
            }
            2cs r0 = this.A07;
            if (!z) {
                JTP.A1K(r0, f);
            } else {
                r0.A07(d);
                this.A07.A06((double) f);
            }
            setStatusBarColor(AnonymousClass7TE.A0M(this.A02.evaluate(f / AnonymousClass7TE.A03(this), Integer.valueOf(this.A00), Integer.valueOf(this.A01))));
            if (runnable != null) {
                this.A07.A0A(new C15162UTn(0, this, runnable));
            }
        }
    }

    public int getChromeContainerHeight() {
        return this.A06.getHeightPx();
    }

    public int[] getChromeContainerLocationInWindow() {
        View view = ((BrowserLiteFragment) this.A05).A09;
        if (view == null) {
            return null;
        }
        Pattern pattern = SCX.A01;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    public int getUsableScreenHeight() {
        return this.A09;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QcV, android.view.View] */
    public int getWebViewScrollY() {
        QLA C8U = this.A0A.C8U();
        if (C8U == null) {
            return -1;
        }
        return ((SystemWebView) C8U).A04.getScrollY();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QcV, android.view.View] */
    public void setWebViewScrollY(int i) {
        QLA C8U = this.A0A.C8U();
        if (C8U != null) {
            ((SystemWebView) C8U).A04.setScrollY(i);
        }
    }

    public BrowserLiteWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A01() {
        A00();
        this.A08 = false;
        setStatusBarColor(this.A00);
        this.A07.A04();
    }

    public final void A02() {
        A00();
        setupBackgroundProtectionAlpha(0.7f);
    }

    public final void A03() {
        A00();
        setupBackgroundProtectionAlpha(0.7f);
    }

    public BrowserLiteWrapperView(Context context) {
        super(context);
    }
}
