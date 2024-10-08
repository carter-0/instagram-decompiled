package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.instagram.android.R;
import java.util.Collection;

public final class Q5J extends Dialog {
    public ProgressDialog A00;
    public WebView A01;
    public FrameLayout A02;
    public ImageView A03;
    public C13556TcU A04;
    public String A05;
    public boolean A06 = false;
    public boolean A07 = false;

    public static int A00(float f, int i, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            d = 0.5d + ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d);
        }
        return (int) (((double) i) * d);
    }

    public final void onAttachedToWindow() {
        this.A06 = false;
        super.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        this.A06 = true;
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void A02(C10179Rnu rnu) {
        C13556TcU tcU = this.A04;
        if (tcU != null && !this.A07) {
            this.A07 = true;
            tcU.D50((Bundle) null, rnu);
            dismiss();
        }
    }

    public final void cancel() {
        if (this.A04 != null && !this.A07) {
            A02(new C10179Rnu(AnonymousClass05K.A01));
        }
    }

    public final void dismiss() {
        WebView webView = this.A01;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.A06 && this.A00.isShowing()) {
            this.A00.dismiss();
        }
        super.dismiss();
    }

    public Q5J(Context context, Bundle bundle, C13556TcU tcU, String str) {
        super(context, 16973840);
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("display", "touch");
        Collection collection = C10070Rm7.A01;
        this.A05 = C11406SSd.A00(bundle, String.format("m.%s", new Object[]{IGPixelRequestBuffer.URL_PREFIX}), 002.A0u("v2.3", "/", "dialog/", str)).toString();
        this.A04 = tcU;
    }

    public final void A01() {
        Object systemService = getContext().getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = i;
        int i3 = displayMetrics.heightPixels;
        int i4 = i3;
        if (i >= i3) {
            i = i3;
        }
        if (i2 >= i3) {
            i3 = i2;
        }
        float f = displayMetrics.density;
        int min = Math.min(A00(f, i, 480, 800), i2);
        int min2 = Math.min(A00(f, i3, 800, 1280), i4);
        Window window = getWindow();
        window.getClass();
        window.setLayout(min, min2);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.A00 = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.A00.setMessage(getContext().getString(R.string.f0nameremoved));
        this.A00.setOnCancelListener(new C11437SUw(this, 1));
        requestWindowFeature(1);
        this.A02 = new FrameLayout(getContext());
        A01();
        Window window = getWindow();
        window.getClass();
        window.setGravity(17);
        Window window2 = getWindow();
        window2.getClass();
        window2.setSoftInputMode(16);
        ImageView imageView = new ImageView(getContext());
        this.A03 = imageView;
        C11497SbK.A01(imageView, 19, this);
        this.A03.setImageDrawable(getContext().getDrawable(R.drawable.com_facebook_close));
        this.A03.setVisibility(4);
        Drawable drawable = this.A03.getDrawable();
        drawable.getClass();
        int intrinsicWidth = (drawable.getIntrinsicWidth() / 2) + 1;
        LinearLayout linearLayout = new LinearLayout(getContext());
        Q8w q8w = new Q8w(getContext(), this);
        this.A01 = q8w;
        q8w.setVerticalScrollBarEnabled(false);
        this.A01.setHorizontalScrollBarEnabled(false);
        this.A01.setWebViewClient(new Q91(this));
        this.A01.getSettings().setJavaScriptEnabled(true);
        this.A01.loadUrl(this.A05);
        C66581MXm.A1A(this.A01, -1);
        this.A01.setVisibility(4);
        this.A01.getSettings().setSavePassword(false);
        this.A01.getSettings().setSaveFormData(false);
        this.A01.setFocusable(true);
        this.A01.setFocusableInTouchMode(true);
        C11507SbU.A00(this.A01, 6, this);
        linearLayout.setPadding(intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        linearLayout.addView(this.A01);
        linearLayout.setBackgroundColor(-872415232);
        this.A02.addView(linearLayout);
        this.A02.addView(this.A03, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.A02);
    }

    public final void onStart() {
        super.onStart();
        A01();
    }
}
