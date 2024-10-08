package com.facebook.browser.lite.chrome.container.defaultchrome;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass9Y2;
import X.C11429STt;
import X.C11484Sb7;
import X.C11497SbK;
import X.C11499SbM;
import X.C340027ka;
import X.C340037kb;
import X.C51972G9s;
import X.DbS;
import X.DbW;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.QA3;
import X.QLA;
import X.S4Q;
import X.SRY;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public class DefaultBrowserLiteChrome extends AnonymousClass9Y2 {
    public Context A00;
    public Intent A01;
    public Bundle A02;
    public View.OnClickListener A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public SRY A0B;
    public QA3 A0C;
    public C340027ka A0D;
    public C340037kb A0E;
    public S4Q A0F;
    public QLA A0G;
    public String A0H;
    public boolean A0I;
    public final HashMap A0J;

    private void setDomain(String str) {
        Uri A0L;
        boolean equals;
        boolean z;
        Bundle bundleExtra;
        String string;
        String str2 = null;
        if (str == null) {
            A0L = null;
        } else {
            A0L = Pxg.A0L(str);
        }
        boolean z2 = false;
        if (!(A0L == null || A0L.getHost() == null || (bundleExtra = this.A01.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON")) == null || (string = bundleExtra.getString("KEY_BLOCKLIST_DOMAIN")) == null || !C11429STt.A07(A0L.getHost(), string))) {
            z2 = true;
        }
        TextView textView = this.A08;
        int i = 0;
        if (z2) {
            i = 8;
        }
        textView.setVisibility(i);
        if (A0L == null) {
            equals = false;
        } else {
            str2 = A0L.getHost();
            equals = A0L.getScheme().equals("https");
        }
        A01(str2, equals);
        QLA C8U = ((BrowserLiteFragment) this.A0E).C8U();
        if (C8U == null) {
            z = false;
        } else {
            z = C8U.A0b;
        }
        int i2 = 8;
        if (!z && C11429STt.A04(A0L)) {
            i2 = 0;
        }
        textView.setVisibility(i2);
    }

    public final void A01(String str, boolean z) {
        TextView textView;
        if (str == null || !this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_SUBTITLE", true)) {
            textView = this.A09;
            textView.setVisibility(8);
        } else {
            textView = this.A09;
            textView.setVisibility(0);
            textView.setText(str);
        }
        if (z) {
            this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_SUBTITLE", true);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (this.A0I) {
            textView.setTextColor(this.A00.getResources().getColor(0, (Resources.Theme) null));
        }
    }

    private void setCloseButtonVisibility(boolean z) {
        this.A05.setVisibility(DbW.A01(z ? 1 : 0));
    }

    private void setMenuButtonVisibility(boolean z) {
        this.A06.setVisibility(DbW.A01(z ? 1 : 0));
    }

    public HashMap getMenuItemActionLog() {
        return this.A0J;
    }

    public void setControllers(C340037kb r1, C340027ka r2) {
        this.A0E = r1;
        this.A0D = r2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.QcV, android.webkit.WebView] */
    public void setTextZoom(int i) {
        WebSettings settings = ((SystemWebView) this.A0G).A04.getSettings();
        settings.setTextZoom(i);
        WebSettings.LayoutAlgorithm layoutAlgorithm = settings.getLayoutAlgorithm();
        WebSettings.LayoutAlgorithm layoutAlgorithm2 = WebSettings.LayoutAlgorithm.NORMAL;
        if (layoutAlgorithm != layoutAlgorithm2) {
            settings.setLayoutAlgorithm(layoutAlgorithm2);
        }
    }

    public void setTitle(String str) {
        if ((!this.A0I || this.A0H == null) && !TextUtils.isEmpty(str) && this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_TITLE", true)) {
            TextView textView = this.A0A;
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0J = AnonymousClass7TE.A1E();
        this.A00 = context;
        Intent intent = ((Activity) context).getIntent();
        this.A01 = intent;
        this.A02 = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        S4Q s4q = S4Q.A02;
        if (s4q == null) {
            s4q = new S4Q();
            S4Q.A02 = s4q;
        }
        this.A0F = s4q;
        this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_REPORT_SHOULD_INCLUDE_CLOAKING_DATA", false);
        this.A0I = this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_FBLITE_IAB_IN_FB4A_MODE", false);
        this.A0H = this.A01.getStringExtra("BrowserLiteIntent.EXTRA_STATIC_TITLE_TEXT");
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(R.layout.browser_lite_chrome, this);
        this.A0A = AnonymousClass7TE.A0d(this, R.id.text_title);
        this.A09 = AnonymousClass7TE.A0d(this, R.id.text_subtitle);
        this.A03 = new C11497SbK(this, 3);
        ImageView A0G2 = DbS.A0G(this, R.id.close_button);
        this.A05 = A0G2;
        A0G2.setClickable(true);
        this.A05.setBackground(getResources().getDrawable(R.drawable.clickable_item_bg));
        this.A05.setOnClickListener(this.A03);
        ImageView imageView = this.A05;
        Context context3 = this.A00;
        0qQ.A0B(context3, 0);
        imageView.setContentDescription(AnonymousClass7TE.A16(context3, R.string.f0nameremoved));
        this.A08 = AnonymousClass7TE.A0d(this, R.id.browser_action_button);
        this.A06 = DbS.A0G(this, R.id.browser_menu_button);
        this.A04 = findViewById(R.id.layout_title_and_subtitle);
        this.A07 = Pxe.A0M(this, R.id.layout_title_container);
        if (this.A0I && this.A0H != null) {
            this.A0A.setVisibility(0);
            this.A0A.setText(this.A0H);
        }
        Bundle bundleExtra = this.A01.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON");
        if (bundleExtra != null) {
            String string = bundleExtra.getString("KEY_LABEL");
            String string2 = bundleExtra.getString("action");
            if (!TextUtils.isEmpty(string) && string2 != null) {
                this.A08.setText(string);
                this.A08.setVisibility(0);
                this.A08.setOnClickListener(new C11484Sb7(string2, this, 0));
            }
        }
        ArrayList parcelableArrayListExtra = this.A01.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            ImageView imageView2 = this.A06;
            0qQ.A0B(context2, 0);
            imageView2.setContentDescription(AnonymousClass7TE.A16(context2, R.string.f0nameremoved));
            int intExtra = this.A01.getIntExtra("extra_menu_button_icon", R.drawable.browser_more_button);
            Pxe.A1M(this.A00.getResources(), this.A06, intExtra);
            this.A06.setOnClickListener(C11499SbM.A00(this, parcelableArrayListExtra, 4));
            setMenuButtonVisibility(this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_MENU_ITEM", true));
        }
        if (this.A06.getVisibility() == 8 && this.A08.getVisibility() != 8) {
            TextView textView = this.A08;
            textView.setPadding(textView.getPaddingLeft(), this.A08.getPaddingTop(), C51972G9s.A08(this.A00), this.A08.getPaddingBottom());
        }
        setCloseButtonVisibility(this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_CLOSE_BUTTON", true));
        String stringExtra = this.A01.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
        if ("THEME_MESSENGER_IAB".equals(stringExtra)) {
            this.A01.getDoubleExtra("BrowserLiteIntent.DISPLAY_HEIGHT_RATIO", 1.0d);
            Pxe.A1M(this.A00.getResources(), this.A05, 0);
        } else {
            ImageView imageView3 = this.A05;
            Context context4 = this.A00;
            Pxe.A1M(context4.getResources(), imageView3, R.drawable.browser_close_button);
            if ("THEME_MESSENGER_FB4A".equals(stringExtra) || "THEME_WORK_CHAT".equals(stringExtra)) {
                Context context5 = this.A00;
                Pxf.A1B(this, context5.getResources().getColor(0, (Resources.Theme) null));
                this.A0A.setTextColor(context5.getResources().getColor(0, (Resources.Theme) null));
                this.A05.setColorFilter(context5.getResources().getColor(0, (Resources.Theme) null));
            } else if ("THEME_INSTAGRAM".equals(stringExtra)) {
                this.A09.getLayoutParams().height = -1;
                this.A09.setTextSize(0, this.A0A.getTextSize());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A04.getLayoutParams();
                marginLayoutParams.setMargins(context4.getResources().getDimensionPixelOffset(R.dimen.action_bar_item_spacing_right), marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
            }
        }
        this.A0B = SRY.A00();
    }

    public final void A00(String str) {
        setDomain(str);
        TextUtils.isEmpty(str);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(126264480);
        super.onAttachedToWindow();
        AnonymousClass0fD.A0D(-2080620137, A062);
    }

    public DefaultBrowserLiteChrome(Context context) {
        this(context, (AttributeSet) null);
    }
}
