package com.facebook.browser.lite.chrome.container;

import X.0qQ;
import X.2Yu;
import X.A9z;
import X.AnonymousClass1GD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.C11347SOg;
import X.C11483Sb6;
import X.C13414TZu;
import X.C340027ka;
import X.C340037kb;
import X.C41803B1i;
import X.DbT;
import X.QA3;
import X.QLA;
import X.RUD;
import X.SRY;
import X.SlA;
import X.TFU;
import X.X9X;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.iabeventlogging.model.IABEvent;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public final class IGWatchAndBrowseLiteChrome extends RelativeLayout implements X9X {
    public Intent A00;
    public Bundle A01 = AnonymousClass7TE.A0a();
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public TextView A0A;
    public QA3 A0B;
    public QA3 A0C;
    public C340027ka A0D;
    public C340037kb A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public ImageView A0I;
    public ImageView A0J;
    public LinearLayout A0K;
    public LinearLayout A0L;
    public LinearLayout A0M;
    public TextView A0N;
    public BrowserLiteProgressBar A0O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGWatchAndBrowseLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public final void AJB(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        int i5 = 0;
        if (z) {
            if (i == 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                Resources resources = getResources();
                layoutParams.height = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
                if (A04() && (textView = this.A0A) != null) {
                    textView.setText(resources.getString(2131963547));
                }
            } else if (i == 8) {
                getLayoutParams().height = 0;
                LinearLayout linearLayout = this.A08;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
            }
            LinearLayout linearLayout2 = this.A08;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            LinearLayout linearLayout3 = this.A0M;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(i);
            }
            A00(i, i, i3);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (i != 8) {
            i5 = getPartialSheetHeight();
        }
        layoutParams2.height = i5;
        LinearLayout linearLayout4 = this.A0M;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(8);
        }
        LinearLayout linearLayout5 = this.A08;
        if (linearLayout5 != null) {
            linearLayout5.setVisibility(i);
        }
        A00(8, i2, i3);
    }

    public final void EuU(int i) {
        Resources resources;
        int i2;
        TextView textView;
        if (i == -8 || i == -1) {
            resources = getResources();
            i2 = 2131964361;
        } else {
            resources = getResources();
            i2 = 2131964360;
        }
        String string = resources.getString(i2);
        this.A0F = string;
        TextView textView2 = this.A0A;
        if (textView2 != null) {
            textView2.setText(string);
        }
        if (A05() && (textView = this.A09) != null) {
            textView.setText(this.A0F);
        }
        AnonymousClass7TH.A0R(this.A0K);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r4.A01.getBoolean("Tracking.ENABLED") == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(int r5, int r6, int r7) {
        /*
            r4 = this;
            android.widget.ImageView r0 = r4.A02
            if (r0 == 0) goto L_0x0007
            r0.setVisibility(r6)
        L_0x0007:
            android.widget.ImageView r0 = r4.A05
            if (r0 == 0) goto L_0x000e
            r0.setVisibility(r7)
        L_0x000e:
            android.widget.ImageView r0 = r4.A04
            if (r0 == 0) goto L_0x0015
            r0.setVisibility(r5)
        L_0x0015:
            android.widget.ImageView r3 = r4.A03
            if (r3 == 0) goto L_0x0038
            if (r5 != 0) goto L_0x0033
            android.content.Intent r2 = r4.A00
            r1 = 0
            if (r2 == 0) goto L_0x0033
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_LINK_HISTORY_HEADER_ICON_ENABLED"
            boolean r0 = r2.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0033
            android.os.Bundle r1 = r4.A01
            java.lang.String r0 = "Tracking.ENABLED"
            boolean r1 = r1.getBoolean(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0035
        L_0x0033:
            r0 = 8
        L_0x0035:
            r3.setVisibility(r0)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome.A00(int, int, int):void");
    }

    public static final void A02(IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome) {
        QLA C8U;
        ArrayList subItems;
        String A052;
        String str;
        C340037kb r0 = iGWatchAndBrowseLiteChrome.A0E;
        if (r0 != null && (C8U = r0.C8U()) != null) {
            if (((C8U.A0b && (str = C8U.A0M) != null && str.length() != 0) || ((A052 = C8U.A05()) != null && A052.length() != 0)) && (subItems = iGWatchAndBrowseLiteChrome.getSubItems()) != null && !subItems.isEmpty()) {
                QA3 A002 = QA3.A00(iGWatchAndBrowseLiteChrome.getContext(), new SlA(iGWatchAndBrowseLiteChrome), subItems, false);
                iGWatchAndBrowseLiteChrome.A0B = A002;
                iGWatchAndBrowseLiteChrome.A01(iGWatchAndBrowseLiteChrome.A06, A002);
            }
        }
    }

    public static final void A03(IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome) {
        IABEvent iABEvent;
        QLA C8U;
        ArrayList subItems;
        String A052;
        String str;
        C340027ka r4 = iGWatchAndBrowseLiteChrome.A0D;
        if (r4 != null) {
            SRY A002 = SRY.A00();
            BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) r4;
            A9z a9z = browserLiteFragment.A0d;
            if (a9z != null) {
                iABEvent = a9z.A00();
            } else {
                iABEvent = null;
            }
            A002.A06(iGWatchAndBrowseLiteChrome.A01, iABEvent, browserLiteFragment.A0e);
            C340037kb r0 = iGWatchAndBrowseLiteChrome.A0E;
            if (r0 != null && (C8U = r0.C8U()) != null) {
                if (((C8U.A0b && (str = C8U.A0M) != null && str.length() != 0) || ((A052 = C8U.A05()) != null && A052.length() != 0)) && (subItems = iGWatchAndBrowseLiteChrome.getSubItems()) != null && !subItems.isEmpty()) {
                    QA3 A003 = QA3.A00(iGWatchAndBrowseLiteChrome.getContext(), new SlA(iGWatchAndBrowseLiteChrome), subItems, false);
                    iGWatchAndBrowseLiteChrome.A0C = A003;
                    iGWatchAndBrowseLiteChrome.A01(iGWatchAndBrowseLiteChrome.A04, A003);
                }
            }
        }
    }

    private final boolean A04() {
        Intent intent = this.A00;
        if (intent != null) {
            return intent.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_SHOULD_SHOW_INSTAGRAM_AND_URL_ON_PARTIAL_SHEET", true);
        }
        return true;
    }

    private final boolean A05() {
        Intent intent = this.A00;
        if (intent != null) {
            return intent.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_WEB_TITLE_ON_PARTIAL_SHEET_ENABLED", false);
        }
        return false;
    }

    private final ArrayList getSubItems() {
        ArrayList parcelableArrayListExtra;
        C340027ka r2;
        C340037kb r3;
        Intent intent = this.A00;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS")) == null || parcelableArrayListExtra.isEmpty() || (r2 = this.A0D) == null || (r3 = this.A0E) == null) {
            return null;
        }
        C11347SOg sOg = new C11347SOg();
        RUD.A00(getContext(), sOg, r2, r3, parcelableArrayListExtra, AnonymousClass7TE.A1F());
        return sOg.A04;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b7, code lost:
        if (((com.facebook.browser.lite.webview.SystemWebView) r0).A04.getCertificate() == null) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setChromeSubsection(java.lang.String r4) {
        /*
            r3 = this;
            X.7kb r0 = r3.A0E
            if (r0 == 0) goto L_0x00e6
            X.QLA r2 = r0.C8U()
        L_0x0008:
            r1 = 0
            if (r2 == 0) goto L_0x0054
            boolean r0 = r2.A0b
            if (r0 == 0) goto L_0x0054
            java.lang.String r2 = r2.A0M
            if (r2 == 0) goto L_0x0054
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0054
            android.widget.LinearLayout r0 = r3.A0K
            if (r0 == 0) goto L_0x0020
            r0.setVisibility(r1)
        L_0x0020:
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x002d
            android.widget.LinearLayout r0 = r3.A0L
            if (r0 == 0) goto L_0x002d
            r0.setVisibility(r1)
        L_0x002d:
            android.widget.TextView r1 = r3.A0N
            if (r1 == 0) goto L_0x0038
            java.lang.String r0 = X.RUE.A00(r2)
            r1.setText(r0)
        L_0x0038:
            boolean r0 = r3.A05()
            if (r0 != 0) goto L_0x0049
            android.widget.TextView r1 = r3.A09
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = X.RUE.A00(r2)
            r1.setText(r0)
        L_0x0049:
            android.widget.ImageView r0 = r3.A0J
            r3.setupUnsafeIcon(r0)
            android.widget.ImageView r0 = r3.A0I
            r3.setupUnsafeIcon(r0)
        L_0x0053:
            return
        L_0x0054:
            if (r4 == 0) goto L_0x00cf
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00cf
            android.widget.LinearLayout r0 = r3.A0K
            if (r0 == 0) goto L_0x0063
            r0.setVisibility(r1)
        L_0x0063:
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0070
            android.widget.LinearLayout r0 = r3.A0L
            if (r0 == 0) goto L_0x0070
            r0.setVisibility(r1)
        L_0x0070:
            java.lang.String r0 = r3.A0G
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a4
            android.net.Uri r2 = X.Pxg.A0L(r4)
            if (r2 == 0) goto L_0x00a2
            android.widget.TextView r1 = r3.A0N
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = X.DbT.A10(r2)
            java.lang.String r0 = X.RUE.A00(r0)
            r1.setText(r0)
        L_0x008d:
            boolean r0 = r3.A05()
            if (r0 != 0) goto L_0x00a2
            android.widget.TextView r1 = r3.A09
            if (r1 == 0) goto L_0x00a2
            java.lang.String r0 = X.DbT.A10(r2)
            java.lang.String r0 = X.RUE.A00(r0)
            r1.setText(r0)
        L_0x00a2:
            r3.A0G = r4
        L_0x00a4:
            X.7kb r0 = r3.A0E
            if (r0 == 0) goto L_0x00b9
            X.QLA r0 = r0.C8U()
            if (r0 == 0) goto L_0x00b9
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            android.net.http.SslCertificate r0 = r0.getCertificate()
            r2 = 1
            if (r0 != 0) goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            android.widget.ImageView r1 = r3.A0J
            android.widget.LinearLayout r0 = r3.A0K
            r3.setupSecureIcon(r1, r2, r0)
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0053
            android.widget.ImageView r1 = r3.A0I
            android.widget.LinearLayout r0 = r3.A0L
            r3.setupSecureIcon(r1, r2, r0)
            return
        L_0x00cf:
            android.widget.LinearLayout r0 = r3.A0K
            r1 = 8
            if (r0 == 0) goto L_0x00d8
            r0.setVisibility(r1)
        L_0x00d8:
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0053
            android.widget.LinearLayout r0 = r3.A0L
            if (r0 == 0) goto L_0x0053
            r0.setVisibility(r1)
            return
        L_0x00e6:
            r2 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome.setChromeSubsection(java.lang.String):void");
    }

    private final void setPrimaryIconColorTintList(ImageView imageView) {
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(getPrimaryIconColor())));
        }
    }

    private final void setSecondaryIconColorTintList(ImageView imageView) {
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(getSecondaryIconColor())));
        }
    }

    private final void setupSecureIcon(ImageView imageView, boolean z, View view) {
        Drawable drawable;
        if (imageView != null) {
            imageView.setVisibility(0);
            int i = R.drawable.instagram_error_pano_outline_24;
            if (z) {
                i = R.drawable.instagram_lock_pano_filled_24;
            }
            imageView.setImageResource(i);
        }
        setSecondaryIconColorTintList(imageView);
        if (!(imageView == null || (drawable = imageView.getDrawable()) == null)) {
            drawable.clearColorFilter();
        }
        if (view != null) {
            view.setOnClickListener(new C11483Sb6(1, this, z));
        }
        if (imageView != null) {
            Resources resources = getResources();
            int i2 = 2131968522;
            if (z) {
                i2 = 2131972951;
            }
            DbT.A1A(resources, imageView, i2);
        }
    }

    private final void setupUnsafeIcon(ImageView imageView) {
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.instagram_warning_pano_filled_24);
            imageView.setColorFilter(getContext().getColor(R.color.igds_error_or_destructive));
        }
    }

    public final void Cnb() {
        if (this.A0H) {
            A03(this);
            this.A0H = false;
        }
    }

    public void setControllers(C340027ka r1, C340037kb r2) {
        this.A0D = r1;
        this.A0E = r2;
    }

    public void setIntent(Intent intent) {
        if (intent != null) {
            this.A00 = intent;
            Bundle bundleExtra = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
            if (bundleExtra == null) {
                bundleExtra = this.A01;
            }
            this.A01 = bundleExtra;
        }
    }

    public void setProgress(int i) {
        BrowserLiteProgressBar browserLiteProgressBar = this.A0O;
        if (browserLiteProgressBar != null) {
            browserLiteProgressBar.setProgress(i);
        }
        BrowserLiteProgressBar browserLiteProgressBar2 = this.A0O;
        if (browserLiteProgressBar2 != null) {
            int i2 = 0;
            if (i == 100) {
                i2 = 8;
            }
            browserLiteProgressBar2.setVisibility(i2);
        }
    }

    public void setProgressBarVisibility(int i) {
        BrowserLiteProgressBar browserLiteProgressBar = this.A0O;
        if (browserLiteProgressBar != null) {
            browserLiteProgressBar.setVisibility(i);
        }
    }

    private final void A01(ImageView imageView, QA3 qa3) {
        qa3.A01(2Yu.A0H(getContext(), R.attr.iabMenuBackgroundRes));
        qa3.setAnchorView(imageView);
        qa3.show();
        ListView listView = qa3.getListView();
        if (listView != null) {
            listView.setOverScrollMode(2);
            listView.setVerticalScrollBarEnabled(false);
            listView.setDivider((Drawable) null);
        }
    }

    private final int getPartialSheetHeight() {
        Resources resources;
        int i;
        if (A05()) {
            resources = getResources();
            i = R.dimen.abc_star_medium;
        } else {
            boolean A042 = A04();
            resources = getResources();
            i = R.dimen.abc_dialog_padding_material;
            if (A042) {
                i = R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size;
            }
        }
        return resources.getDimensionPixelSize(i);
    }

    private final int getPrimaryIconColor() {
        if (AnonymousClass1GD.A03()) {
            return R.color.grey_0;
        }
        return R.color.black;
    }

    private final int getSecondaryIconColor() {
        if (AnonymousClass1GD.A03()) {
            return R.color.grey_4;
        }
        return R.color.grey_6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CMp() {
        /*
            r6 = this;
            android.content.Context r4 = r6.getContext()
            r0 = 2130970080(0x7f0405e0, float:1.754886E38)
            int r0 = X.2Yu.A0H(r4, r0)
            X.DbT.A16(r4, r6, r0)
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            int r0 = r6.getPartialSheetHeight()
            r1.height = r0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131626039(0x7f0e0837, float:1.8879303E38)
            r1.inflate(r0, r6)
            r0 = 2131434103(0x7f0b1a77, float:1.849001E38)
            android.widget.LinearLayout r0 = X.Pxe.A0M(r6, r0)
            r6.A07 = r0
            r0 = 2131434106(0x7f0b1a7a, float:1.8490017E38)
            android.widget.LinearLayout r0 = X.Pxe.A0M(r6, r0)
            r6.A08 = r0
            r0 = 2131434105(0x7f0b1a79, float:1.8490015E38)
            android.widget.LinearLayout r0 = X.Pxe.A0M(r6, r0)
            r6.A0L = r0
            r0 = 2131434110(0x7f0b1a7e, float:1.8490025E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r6, r0)
            r6.A09 = r0
            r0 = 2131434104(0x7f0b1a78, float:1.8490013E38)
            android.widget.ImageView r0 = X.DbS.A0G(r6, r0)
            r6.A0I = r0
            r0 = 2131434112(0x7f0b1a80, float:1.8490029E38)
            android.widget.LinearLayout r0 = X.Pxe.A0M(r6, r0)
            r6.A0M = r0
            r0 = 2131434114(0x7f0b1a82, float:1.8490033E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r6, r0)
            r6.A0A = r0
            r0 = 2131434113(0x7f0b1a81, float:1.849003E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r6, r0)
            r6.A0N = r0
            r0 = 2131434165(0x7f0b1ab5, float:1.8490136E38)
            android.widget.ImageView r0 = X.DbS.A0G(r6, r0)
            r6.A0J = r0
            r0 = 2131434125(0x7f0b1a8d, float:1.8490055E38)
            android.widget.LinearLayout r0 = X.Pxe.A0M(r6, r0)
            r6.A0K = r0
            r0 = 2131434099(0x7f0b1a73, float:1.8490002E38)
            android.widget.ImageView r0 = X.DbS.A0G(r6, r0)
            r6.A02 = r0
            r0 = 2131434102(0x7f0b1a76, float:1.8490008E38)
            android.widget.ImageView r0 = X.DbS.A0G(r6, r0)
            r6.A05 = r0
            r0 = 2131434100(0x7f0b1a74, float:1.8490004E38)
            android.widget.ImageView r0 = X.DbS.A0G(r6, r0)
            r6.A03 = r0
            r0 = 2131434101(0x7f0b1a75, float:1.8490006E38)
            android.widget.ImageView r0 = X.DbS.A0G(r6, r0)
            r6.A04 = r0
            r0 = 2131434163(0x7f0b1ab3, float:1.8490132E38)
            android.widget.ImageView r0 = X.DbS.A0G(r6, r0)
            r6.A06 = r0
            android.widget.ImageView r2 = r6.A04
            if (r2 == 0) goto L_0x00b7
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131951716(0x7f130064, float:1.9539854E38)
            X.DbT.A1A(r1, r2, r0)
        L_0x00b7:
            android.widget.ImageView r2 = r6.A04
            if (r2 == 0) goto L_0x00c4
            r1 = 2
            X.SbK r0 = new X.SbK
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
        L_0x00c4:
            android.widget.ImageView r0 = r6.A04
            r6.setPrimaryIconColorTintList(r0)
            android.content.Intent r1 = r6.A00
            r3 = 1
            if (r1 == 0) goto L_0x00d6
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOW_PARTIAL_MENU_ITEM"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x0124
        L_0x00d6:
            X.7ka r5 = r6.A0D
            if (r5 == 0) goto L_0x0124
            boolean r0 = r6.A04()
            if (r0 == 0) goto L_0x00ed
            android.widget.ImageView r1 = r6.A06
            if (r1 == 0) goto L_0x00ed
            r0 = 2131238568(0x7f081ea8, float:1.8093418E38)
            X.DbU.A13(r4, r1, r0)
            r6.setPrimaryIconColorTintList(r1)
        L_0x00ed:
            android.widget.ImageView r0 = r6.A06
            X.AnonymousClass7TF.A16(r0)
            android.widget.ImageView r2 = r6.A06
            if (r2 == 0) goto L_0x0100
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131951716(0x7f130064, float:1.9539854E38)
            X.DbT.A1A(r1, r2, r0)
        L_0x0100:
            android.widget.ImageView r1 = r6.A06
            if (r1 == 0) goto L_0x010c
            r0 = 3
            X.SbM r0 = X.C11499SbM.A00(r5, r6, r0)
            r1.setOnClickListener(r0)
        L_0x010c:
            android.widget.LinearLayout r1 = r6.A07
            if (r1 == 0) goto L_0x0118
            X.SbK r0 = new X.SbK
            r0.<init>(r5, r3)
            r1.setOnClickListener(r0)
        L_0x0118:
            android.widget.ImageView r1 = r6.A06
            if (r1 == 0) goto L_0x0124
            X.TBG r0 = new X.TBG
            r0.<init>(r6)
            r1.post(r0)
        L_0x0124:
            boolean r0 = r6.A05()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0239
            r0 = 2131434107(0x7f0b1a7b, float:1.8490019E38)
            X.C51967G9n.A0x(r6, r0, r1)
            r0 = 2131434109(0x7f0b1a7d, float:1.8490023E38)
            X.C51967G9n.A0x(r6, r0, r1)
            android.widget.LinearLayout r0 = r6.A08
            if (r0 == 0) goto L_0x0150
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            if (r5 == 0) goto L_0x0150
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.height = r0
        L_0x0150:
            android.widget.TextView r5 = r6.A09
            if (r5 == 0) goto L_0x017e
            android.widget.TextView r0 = r6.A0A
            if (r0 == 0) goto L_0x0236
            android.graphics.Typeface r0 = r0.getTypeface()
        L_0x015c:
            r5.setTypeface(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            float r0 = r1.getDimension(r0)
            r5.setTextSize(r2, r0)
            int r1 = r5.getPaddingEnd()
            int r0 = r5.getPaddingEnd()
            r5.setPadding(r1, r2, r0, r2)
            r0 = 2131963548(0x7f132e9c, float:1.9563853E38)
            r5.setText(r0)
        L_0x017e:
            android.widget.ImageView r0 = r6.A06
            r6.setPrimaryIconColorTintList(r0)
        L_0x0183:
            android.widget.LinearLayout r0 = r6.A08
            if (r0 == 0) goto L_0x018a
            r0.setVisibility(r2)
        L_0x018a:
            android.widget.LinearLayout r0 = r6.A07
            if (r0 == 0) goto L_0x0191
            r0.setVisibility(r2)
        L_0x0191:
            android.widget.ImageView r5 = r6.A02
            if (r5 == 0) goto L_0x019f
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131951627(0x7f13000b, float:1.9539674E38)
            X.DbT.A1A(r1, r5, r0)
        L_0x019f:
            android.widget.ImageView r0 = r6.A02
            if (r0 == 0) goto L_0x01a6
            r0.setClickable(r3)
        L_0x01a6:
            android.widget.ImageView r3 = r6.A02
            if (r3 == 0) goto L_0x01b4
            r1 = 2131231188(0x7f0801d4, float:1.807845E38)
            android.content.res.Resources r0 = r4.getResources()
            X.Pxe.A1M(r0, r3, r1)
        L_0x01b4:
            android.widget.ImageView r0 = r6.A02
            r6.setPrimaryIconColorTintList(r0)
            android.content.Intent r1 = r6.A00
            r0 = 0
            if (r1 == 0) goto L_0x01c4
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_KEEP_BROWSER_OPEN_ON_BACK_PRESSED"
            boolean r0 = r1.getBooleanExtra(r0, r2)
        L_0x01c4:
            android.widget.ImageView r1 = r6.A02
            if (r0 == 0) goto L_0x022e
            if (r1 == 0) goto L_0x01d4
            X.Sah r0 = new X.Sah
            r0.<init>(r6)
        L_0x01cf:
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r1.setOnClickListener(r0)
        L_0x01d4:
            android.widget.ImageView r3 = r6.A05
            if (r3 == 0) goto L_0x01e2
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131951633(0x7f130011, float:1.9539686E38)
            X.DbT.A1A(r1, r3, r0)
        L_0x01e2:
            android.widget.ImageView r1 = r6.A05
            if (r1 == 0) goto L_0x01ea
            r0 = 1
            r1.setClickable(r0)
        L_0x01ea:
            android.widget.ImageView r0 = r6.A05
            r6.setPrimaryIconColorTintList(r0)
            android.widget.ImageView r1 = r6.A05
            if (r1 == 0) goto L_0x01fb
            X.Sah r0 = new X.Sah
            r0.<init>(r6)
            r1.setOnClickListener(r0)
        L_0x01fb:
            android.widget.ImageView r1 = r6.A03
            if (r1 == 0) goto L_0x0205
            r0 = 2131238132(0x7f081cf4, float:1.8092534E38)
            X.DbU.A13(r4, r1, r0)
        L_0x0205:
            android.widget.ImageView r0 = r6.A03
            r6.setPrimaryIconColorTintList(r0)
            android.widget.ImageView r1 = r6.A03
            if (r1 == 0) goto L_0x0216
            X.Sb4 r0 = new X.Sb4
            r0.<init>(r6, r2)
            r1.setOnClickListener(r0)
        L_0x0216:
            android.content.Intent r1 = r6.A00
            if (r1 == 0) goto L_0x022d
            java.lang.String r0 = "WATCH_AND_BROWSE_HIDE_BROWSER_HEADER"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x022d
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.height = r2
            android.widget.LinearLayout r0 = r6.A08
            X.AnonymousClass7TH.A0R(r0)
        L_0x022d:
            return
        L_0x022e:
            if (r1 == 0) goto L_0x01d4
            X.Sai r0 = new X.Sai
            r0.<init>(r6)
            goto L_0x01cf
        L_0x0236:
            r0 = 0
            goto L_0x015c
        L_0x0239:
            boolean r0 = r6.A04()
            if (r0 == 0) goto L_0x0183
            r0 = 2131434107(0x7f0b1a7b, float:1.8490019E38)
            X.C51967G9n.A0x(r6, r0, r1)
            r0 = 2131434109(0x7f0b1a7d, float:1.8490023E38)
            X.C51967G9n.A0x(r6, r0, r1)
            r0 = 2131434111(0x7f0b1a7f, float:1.8490027E38)
            X.C51967G9n.A0x(r6, r0, r2)
            goto L_0x0183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome.CMp():void");
    }

    public final void CMu() {
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) requireViewById(R.id.ig_browser_chrome_progress_bar);
        this.A0O = browserLiteProgressBar;
        if (browserLiteProgressBar != null) {
            browserLiteProgressBar.setVisibility(0);
        }
        BrowserLiteProgressBar browserLiteProgressBar2 = this.A0O;
        if (browserLiteProgressBar2 != null) {
            browserLiteProgressBar2.setProgress(0);
        }
    }

    public final void Dvv(String str) {
        TextView textView;
        int i;
        String str2;
        TextView textView2;
        QLA C8U;
        if (!A04()) {
            C340027ka r0 = this.A0D;
            if (r0 == null || (C8U = r0.C8U()) == null || !C8U.A0b) {
                C340037kb r02 = this.A0E;
                if (r02 == null || (str2 = ((BrowserLiteFragment) r02).A0k) == null || str2.length() == 0) {
                    TextView textView3 = this.A0A;
                    if (textView3 != null) {
                        textView3.setText(2131963548);
                    }
                    if (A05() && (textView = this.A09) != null) {
                        i = 2131963548;
                    }
                } else if (!str2.equals(this.A0F)) {
                    TextView textView4 = this.A0A;
                    if (textView4 != null) {
                        textView4.setText(str2);
                    }
                    this.A0F = str2;
                    if (A05() && (textView2 = this.A09) != null) {
                        textView2.setText(str2);
                    }
                }
            } else {
                TextView textView5 = this.A0A;
                if (textView5 != null) {
                    textView5.setText(2131975984);
                }
                if (A05() && (textView = this.A09) != null) {
                    i = 2131975984;
                }
            }
            textView.setText(i);
        }
        setChromeSubsection(str);
    }

    public final boolean EvO() {
        ViewSwitcher viewSwitcher = (ViewSwitcher) findViewById(R.id.title_text_switcher);
        if (viewSwitcher != null) {
            Context context = getContext();
            viewSwitcher.setInAnimation(context, R.anim.bottom_in);
            viewSwitcher.setOutAnimation(context, R.anim.top_out);
            viewSwitcher.showNext();
        }
        return AnonymousClass7TF.A0D().postDelayed(new TFU(viewSwitcher, this), 3000);
    }

    public int getHeightPx() {
        int height = getHeight();
        if (height <= 0) {
            return (int) getResources().getDimension(R.dimen.abc_alert_dialog_button_dimen);
        }
        return height;
    }
}
