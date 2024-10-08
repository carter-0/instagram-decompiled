package com.facebook.browser.lite.chrome.container;

import X.0Tu;
import X.0qQ;
import X.17h;
import X.182;
import X.1Xj;
import X.1Xl;
import X.2Yu;
import X.AnonymousClass0fU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11477Sag;
import X.C11481Sb4;
import X.C11483Sb6;
import X.C11499SbM;
import X.C13414TZu;
import X.C20125Wll;
import X.C20404Wqo;
import X.C20572Wup;
import X.C273654mx;
import X.C324666zh;
import X.C327927Ct;
import X.C340027ka;
import X.C340037kb;
import X.C41803B1i;
import X.C7572QKn;
import X.DbS;
import X.DbT;
import X.DbU;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.QA3;
import X.QLA;
import X.RUE;
import X.SDT;
import X.X9X;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.browser.lite.webview.SystemWebView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public class DefaultBrowserLiteChrome extends RelativeLayout implements X9X {
    public Intent A00;
    public Bundle A01;
    public ImageView A02;
    public TextView A03;
    public QA3 A04;
    public C340027ka A05;
    public C340037kb A06;
    public UserSession A07;
    public 1Xj A08;
    public User A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public View A0E;
    public View A0F;
    public ImageView A0G;
    public TextView A0H;
    public BrowserLiteProgressBar A0I;
    public boolean A0J;
    public boolean A0K;

    public final /* synthetic */ void AJB(boolean z, int i, int i2, int i3, int i4) {
    }

    public final /* synthetic */ void Cnb() {
    }

    public final void EuU(int i) {
        Resources resources;
        int i2;
        if (i == -8 || i == -1) {
            resources = getResources();
            i2 = 2131964361;
        } else {
            resources = getResources();
            i2 = 2131964360;
        }
        String string = resources.getString(i2);
        this.A0B = string;
        this.A03.setText(string);
        this.A0E.setVisibility(8);
    }

    public final boolean EvO() {
        return false;
    }

    public void setHeaderLeftStaticAction(C13414TZu tZu) {
    }

    public void setHeaderRightStaticAction(C13414TZu tZu) {
    }

    public void setLogger(C41803B1i b1i) {
    }

    public /* synthetic */ void setMenuButtonVisibility(int i) {
    }

    public void setSecureConnectionStaticActions(List list) {
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.QcV, android.webkit.WebView] */
    private void setChromeSubsection(String str) {
        String str2;
        QLA C8U = this.A06.C8U();
        if (C8U != null && C8U.A0b && !TextUtils.isEmpty(C8U.A0M)) {
            if (C8U.A0b) {
                str2 = C8U.A0M;
            } else {
                str2 = null;
            }
            this.A0E.setVisibility(0);
            TextView textView = this.A0H;
            if (str2 == null) {
                str2 = "";
            }
            textView.setText(RUE.A00(str2));
            this.A0G.setVisibility(0);
            this.A0G.setImageResource(R.drawable.instagram_warning_pano_filled_24);
            this.A0G.setColorFilter(getContext().getColor(R.color.igds_error_or_destructive));
        } else if (!TextUtils.isEmpty(str)) {
            this.A0E.setVisibility(0);
            if (!str.equals(this.A0C)) {
                Uri A0L = Pxg.A0L(str);
                if (A0L != null) {
                    this.A0H.setText(RUE.A00(A0L.toString()));
                }
                this.A0C = str;
            }
            if (this.A0D) {
                this.A0H.setTextSize(12.0f);
                this.A0H.setEllipsize(TextUtils.TruncateAt.END);
            }
            boolean z = false;
            if (!(this.A06.C8U() == null || ((SystemWebView) this.A06.C8U()).A04.getCertificate() == null)) {
                z = true;
            }
            this.A0G.setVisibility(0);
            ImageView imageView = this.A0G;
            int i = R.drawable.instagram_error_pano_outline_24;
            if (z) {
                i = R.drawable.instagram_lock_pano_filled_24;
            }
            imageView.setImageResource(i);
            this.A0E.setOnClickListener(new C11483Sb6(0, this, z));
            if (this.A0G.getDrawable() != null) {
                this.A0G.getDrawable().clearColorFilter();
            }
        } else {
            this.A0E.setVisibility(8);
        }
    }

    public final void Dvv(String str) {
        TextView textView;
        int i;
        if (this.A05.C8U().A0b) {
            textView = this.A03;
            i = 2131975984;
        } else {
            String str2 = ((BrowserLiteFragment) this.A06).A0k;
            if (this.A0D) {
                String string = getResources().getString(2131963547);
                this.A03.setText(string);
                this.A03.setTextSize(12.0f);
                this.A0B = string;
            } else if (TextUtils.isEmpty(str2)) {
                textView = this.A03;
                i = 2131963548;
            } else if (!str2.equals(this.A0B)) {
                this.A03.setText(str2);
                this.A0B = str2;
            }
            setChromeSubsection(str);
        }
        textView.setText(i);
        setChromeSubsection(str);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0K;
    }

    public void setControllers(C340027ka r1, C340037kb r2) {
        this.A05 = r1;
        this.A06 = r2;
    }

    public void setIntent(Intent intent) {
        String A002;
        this.A00 = intent;
        Bundle bundleExtra = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        this.A01 = bundleExtra;
        if (bundleExtra == null) {
            A002 = "";
        } else {
            A002 = SDT.A00(new C7572QKn(bundleExtra));
        }
        this.A0A = A002;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.A07 = DbS.A0U(extras);
        }
        UserSession userSession = this.A07;
        if (userSession != null) {
            0Tu r3 = 0Tu.A05;
            this.A0D = 182.A06(r3, userSession, 36316843295642286L);
            UserSession userSession2 = this.A07;
            0qQ.A0B(userSession2, 0);
            this.A0J = 182.A06(r3, userSession2, 36324118970707779L);
        }
    }

    public void setProgress(int i) {
        this.A0I.setProgress(i);
        BrowserLiteProgressBar browserLiteProgressBar = this.A0I;
        int i2 = 0;
        if (i == 100) {
            i2 = 8;
        }
        browserLiteProgressBar.setVisibility(i2);
    }

    public void setProgressBarVisibility(int i) {
        BrowserLiteProgressBar browserLiteProgressBar = this.A0I;
        if (browserLiteProgressBar != null) {
            browserLiteProgressBar.setVisibility(i);
        }
    }

    public void setShouldInterceptTouchEvents(boolean z) {
        this.A0K = z;
    }

    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setupTooltip(String str) {
        this.A02.postDelayed(new C20125Wll(this, AnonymousClass7TF.A0e(getResources(), str, 2131966188)), 500);
    }

    public final void CMp() {
        View view;
        ArrayList parcelableArrayListExtra;
        Bundle bundle;
        1Xj r0;
        String B8Q;
        User user;
        UserSession userSession;
        Bundle bundle2;
        1Xl A002;
        FragmentActivity activity;
        UserSession userSession2;
        Context context = getContext();
        DbT.A16(context, this, 2Yu.A0H(context, R.attr.iabChromeBackgroundColor));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Resources resources = getResources();
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        boolean z = this.A0J;
        LayoutInflater from = LayoutInflater.from(context);
        int i = R.layout.ig_browser_chrome;
        if (z) {
            i = R.layout.ig_browser_chrome_nav_optimization_prominent_lock;
        }
        from.inflate(i, this);
        this.A0F = findViewById(R.id.ig_browser_text);
        this.A03 = AnonymousClass7TE.A0d(this, R.id.ig_browser_text_title);
        this.A0H = AnonymousClass7TE.A0d(this, R.id.ig_browser_text_subtitle);
        this.A0G = DbS.A0G(this, R.id.ig_secure_connection_icon);
        this.A0E = findViewById(R.id.ig_chrome_subsection);
        ImageView A0F2 = DbU.A0F(this, R.id.ig_browser_close_button);
        DbT.A1A(resources, A0F2, R.string.f0nameremoved);
        A0F2.setClickable(true);
        Pxe.A1M(context.getResources(), A0F2, R.drawable.browser_close_button);
        A0F2.setOnClickListener(new C11477Sag(this));
        Intent intent = this.A00;
        Bundle bundle3 = this.A01;
        if (intent != null && bundle3 != null && intent.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_LINK_HISTORY_HEADER_ICON_ENABLED", false) && bundle3.getBoolean("Tracking.ENABLED")) {
            ImageView A0F3 = DbU.A0F(this, R.id.ig_browser_link_history_button);
            Bundle bundle4 = this.A01;
            0qQ.A0B(A0F3, 0);
            A0F3.setVisibility(0);
            DbU.A13(context, A0F3, R.drawable.instagram_clock_dotted_pano_outline_24);
            AnonymousClass0fU.A00(new C11481Sb4(bundle4, 1), A0F3);
        }
        Intent intent2 = this.A00;
        if (!(intent2 == null || (parcelableArrayListExtra = intent2.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS")) == null || parcelableArrayListExtra.isEmpty())) {
            ImageView A0F4 = DbU.A0F(this, R.id.ig_browser_menu_button);
            this.A02 = A0F4;
            A0F4.setVisibility(0);
            DbU.A12(context, this.A02, R.string.f0nameremoved);
            Pxe.A1M(context.getResources(), this.A02, R.drawable.browser_more_button);
            this.A02.setOnClickListener(C11499SbM.A00(this, parcelableArrayListExtra, 2));
            C340027ka r02 = this.A05;
            if (!(r02 == null || (activity = r02.getActivity()) == null || (userSession2 = this.A07) == null)) {
                C327927Ct.A00(activity, this.A02, userSession2, "IAB MCs", new C20572Wup(this), new C20404Wqo(0));
            }
            if (!(!this.A00.getBooleanExtra("BrowserLiteIntent.InstagramExtras.ORGANIC_IAB_MESSAGE_EXT_IS_ENABLED", false) || this.A07 == null || (bundle = this.A01) == null)) {
                User A022 = 17h.A00(this.A07).A02(bundle.getString("TrackingInfo.ARG_USER_ID", ""));
                String str = this.A0A;
                if (!(str == null || (userSession = this.A07) == null || (bundle2 = this.A01) == null || (A002 = C324666zh.A00(userSession, bundle2.getString(C273654mx.A00(2394)), str)) == null)) {
                    1Xj BPf = A002.BPf();
                    this.A08 = BPf;
                    this.A09 = BPf.A2A(this.A07);
                }
                1Xj r03 = this.A08;
                if (r03 != null && !r03.CcK() && !this.A08.A54() && (user = this.A09) != null) {
                    B8Q = user.B8Q();
                } else if (A022 != null && (((r0 = this.A08) == null || (!r0.CcK() && !this.A08.A54())) && A022.getId() != this.A07.A06)) {
                    B8Q = A022.B8Q();
                }
                if (B8Q != "") {
                    setupTooltip(B8Q);
                }
            }
        }
        if (this.A0D && (view = this.A0F) != null) {
            view.setPaddingRelative(0, 0, (int) resources.getDimension(R.dimen.account_discovery_bottom_gap), 0);
        }
        View findViewById = getRootView().findViewById(16908335);
        View findViewById2 = getRootView().findViewById(R.id.browser_container);
        View findViewById3 = getRootView().findViewById(R.id.layout_container_right);
        if (findViewById != null && findViewById2 != null && findViewById3 != null && findViewById3.getTop() < findViewById.getBottom()) {
            findViewById2.setPadding(0, findViewById.getHeight(), 0, 0);
            Pxf.A1B(findViewById2, -1);
        }
    }

    public final void CMu() {
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) requireViewById(R.id.ig_browser_chrome_progress_bar);
        this.A0I = browserLiteProgressBar;
        browserLiteProgressBar.setVisibility(0);
        this.A0I.setProgress(0);
    }

    public int getHeightPx() {
        int height = getHeight();
        if (height <= 0) {
            return (int) getResources().getDimension(R.dimen.abc_alert_dialog_button_dimen);
        }
        return height;
    }

    public DefaultBrowserLiteChrome(Context context) {
        super(context, (AttributeSet) null);
    }
}
