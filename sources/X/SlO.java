package X;

import android.content.Intent;
import android.view.ViewStub;
import com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.instagram.android.R;

public final class SlO implements C13847TiP {
    public BwPBrowserLiteChrome A00;
    public final ViewStub A01;
    public final C340027ka A02;
    public final C340037kb A03;

    public final /* synthetic */ void AJB(boolean z, int i, int i2, int i3, int i4) {
    }

    public final /* synthetic */ void Cnb() {
    }

    public final void Dvv(String str) {
    }

    public final void EVZ(int i) {
    }

    public final boolean EvO() {
        return false;
    }

    public final int getHeightPx() {
        return 0;
    }

    public final void setProgressBarVisibility(int i) {
    }

    public final void CMu() {
        BrowserLiteProgressBar browserLiteProgressBar;
        BwPBrowserLiteChrome bwPBrowserLiteChrome = this.A00;
        if (bwPBrowserLiteChrome != null && (browserLiteProgressBar = bwPBrowserLiteChrome.A07) != null) {
            browserLiteProgressBar.setProgress(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Egj(android.content.Intent r16, java.lang.String r17, int r18) {
        /*
            r15 = this;
            android.view.ViewStub r0 = r15.A01
            r1 = r18
            android.view.View r5 = X.JTP.A0H(r0, r1)
            com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome r5 = (com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome) r5
            r15.A00 = r5
            X.7ka r1 = r15.A02
            X.7kb r0 = r15.A03
            r5.setControllers(r1, r0)
            android.content.Context r9 = r5.getContext()
            r0 = 2130970080(0x7f0405e0, float:1.754886E38)
            int r0 = X.2Yu.A0H(r9, r0)
            X.DbT.A16(r9, r5, r0)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r1.height = r0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r9)
            r0 = 2131626016(0x7f0e0820, float:1.8879256E38)
            r1.inflate(r0, r5)
            r0 = 2131434122(0x7f0b1a8a, float:1.849005E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r5, r0)
            r5.A05 = r0
            r0 = 2131434121(0x7f0b1a89, float:1.8490047E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r5, r0)
            r5.A06 = r0
            r0 = 2131434124(0x7f0b1a8c, float:1.8490053E38)
            android.widget.ImageView r0 = X.DbS.A0G(r5, r0)
            r5.A04 = r0
            r0 = 2131434123(0x7f0b1a8b, float:1.8490051E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A02 = r0
            r0 = 2131434116(0x7f0b1a84, float:1.8490037E38)
            android.view.View r0 = r5.findViewById(r0)
            com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar r0 = (com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar) r0
            r5.A07 = r0
            r0 = 2131434119(0x7f0b1a87, float:1.8490043E38)
            android.widget.ImageView r0 = X.DbS.A0G(r5, r0)
            r5.A03 = r0
            X.SPF r7 = X.SPF.A06
            r0 = 2131434117(0x7f0b1a85, float:1.8490039E38)
            android.widget.ImageView r2 = X.DbU.A0F(r5, r0)
            r0 = 2131951627(0x7f13000b, float:1.9539674E38)
            X.DbT.A1A(r4, r2, r0)
            r1 = 2131231188(0x7f0801d4, float:1.807845E38)
            android.content.res.Resources r0 = r9.getResources()
            X.Pxe.A1M(r0, r2, r1)
            r3 = 1
            r2.setClickable(r3)
            X.Sae r0 = new X.Sae
            r0.<init>(r5)
            r2.setOnClickListener(r0)
            if (r7 == 0) goto L_0x00c1
            boolean r0 = r7.A01()
            if (r0 == 0) goto L_0x018f
            android.widget.ImageView r1 = r5.A03
            if (r1 == 0) goto L_0x00c1
            r0 = 2131951716(0x7f130064, float:1.9539854E38)
            X.DbU.A12(r9, r1, r0)
            android.widget.ImageView r2 = r5.A03
            r1 = 2131231192(0x7f0801d8, float:1.8078458E38)
            android.content.res.Resources r0 = r9.getResources()
            X.Pxe.A1M(r0, r2, r1)
            android.widget.ImageView r1 = r5.A03
            X.Saf r0 = new X.Saf
            r0.<init>(r5)
        L_0x00be:
            r1.setOnClickListener(r0)
        L_0x00c1:
            android.content.Intent r1 = r5.A00
            android.os.Bundle r6 = r5.A01
            r2 = 0
            if (r1 == 0) goto L_0x00fd
            if (r6 == 0) goto L_0x00fd
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_LINK_HISTORY_HEADER_ICON_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = "Tracking.ENABLED"
            boolean r0 = r6.getBoolean(r0)
            if (r0 == 0) goto L_0x00fd
            if (r7 == 0) goto L_0x00fd
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x00fd
            r0 = 2131434118(0x7f0b1a86, float:1.849004E38)
            android.widget.ImageView r1 = X.DbU.A0F(r5, r0)
            r0 = 2131238132(0x7f081cf4, float:1.8092534E38)
            X.0qQ.A0B(r1, r2)
            r1.setVisibility(r2)
            X.DbU.A13(r9, r1, r0)
            X.Sb4 r0 = new X.Sb4
            r0.<init>(r6, r3)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00fd:
            android.widget.TextView r6 = r5.A06
            if (r6 == 0) goto L_0x0135
            X.SPF r3 = X.SPF.A06
            java.lang.String r1 = "BwPBrowserLiteChrome"
            if (r3 != 0) goto L_0x0172
            java.lang.String r0 = "BwPContext is null"
        L_0x0109:
            X.0KC.A0E(r1, r0)
        L_0x010c:
            android.widget.ImageView r1 = r5.A04
            if (r1 == 0) goto L_0x0135
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x0135
            r0 = 2131238512(0x7f081e70, float:1.8093305E38)
            r1.setImageResource(r0)
            android.view.View r1 = r5.A02
            X.SbK r0 = new X.SbK
            r0.<init>(r5, r2)
            r1.setOnClickListener(r0)
            android.widget.ImageView r0 = r5.A04
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0135
            android.widget.ImageView r0 = r5.A04
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r0.clearColorFilter()
        L_0x0135:
            X.SPF r6 = X.SPF.A06
            java.lang.String r3 = "BwPBrowserLiteChrome"
            if (r6 != 0) goto L_0x0146
            java.lang.String r0 = "BwPContext is null"
        L_0x013d:
            X.0KC.A0E(r3, r0)
        L_0x0140:
            com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome r0 = r15.A00
            r0.bringToFront()
            return
        L_0x0146:
            r0 = 2131963547(0x7f132e9b, float:1.956385E38)
            java.lang.String r2 = r4.getString(r0)
            android.widget.TextView r1 = r5.A05
            if (r1 == 0) goto L_0x0140
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x015e
            r0 = 2131963551(0x7f132e9f, float:1.9563859E38)
            r1.setText(r0)
            goto L_0x0140
        L_0x015e:
            boolean r0 = r6.A02()
            if (r0 == 0) goto L_0x016f
            X.QP8 r0 = r6.A01
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x016b
            r2 = r0
        L_0x016b:
            r1.setText(r2)
            goto L_0x0140
        L_0x016f:
            java.lang.String r0 = "Invalid BwP type"
            goto L_0x013d
        L_0x0172:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0180
            X.S3V r0 = r3.A04
            java.lang.String r0 = r0.A05
        L_0x017c:
            r6.setText(r0)
            goto L_0x010c
        L_0x0180:
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x018b
            X.S3V r0 = r3.A04
            java.lang.String r0 = r0.A06
            goto L_0x017c
        L_0x018b:
            java.lang.String r0 = "Invalid BwP type"
            goto L_0x0109
        L_0x018f:
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x00c1
            android.widget.ImageView r0 = r5.A03
            if (r0 == 0) goto L_0x00c1
            android.content.Intent r1 = r5.A00
            if (r1 == 0) goto L_0x00c1
            X.7ka r0 = r5.A08
            if (r0 == 0) goto L_0x00c1
            X.7kb r0 = r5.A09
            if (r0 == 0) goto L_0x00c1
            android.os.Bundle r10 = r5.A01
            if (r10 == 0) goto L_0x00c1
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_MENU_ITEMS"
            java.util.ArrayList r14 = r1.getParcelableArrayListExtra(r0)
            if (r14 != 0) goto L_0x01b5
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
        L_0x01b5:
            boolean r0 = r14.isEmpty()
            r6 = 0
            if (r0 != 0) goto L_0x01d1
            java.lang.Object r1 = r14.get(r6)
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "action"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "ACTION_REPORT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d1
            r6 = 1
        L_0x01d1:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r0 = 2131964208(0x7f133130, float:1.9565191E38)
            java.lang.String r1 = r9.getString(r0)
            java.lang.String r0 = "KEY_LABEL"
            r2.putString(r0, r1)
            java.lang.String r1 = "KEY_ICON_RES"
            r0 = -1
            r2.putInt(r1, r0)
            java.lang.String r1 = "action"
            java.lang.String r0 = "ACTION_BWP_MORE_INFO"
            r2.putString(r1, r0)
            r14.add(r6, r2)
            android.widget.ImageView r11 = r5.A03
            X.7ka r12 = r5.A08
            X.7kb r13 = r5.A09
            X.RyD r8 = new X.RyD
            r8.<init>(r9, r10, r11, r12, r13, r14)
            android.widget.ImageView r1 = r5.A03
            r0 = 2131951716(0x7f130064, float:1.9539854E38)
            X.DbU.A12(r9, r1, r0)
            android.widget.ImageView r2 = r5.A03
            r1 = 2131231192(0x7f0801d8, float:1.8078458E38)
            android.content.res.Resources r0 = r9.getResources()
            X.Pxe.A1M(r0, r2, r1)
            android.widget.ImageView r1 = r5.A03
            X.SbM r0 = X.C11499SbM.A00(r5, r8, r3)
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SlO.Egj(android.content.Intent, java.lang.String, int):void");
    }

    public final void setProgress(int i) {
        BwPBrowserLiteChrome bwPBrowserLiteChrome = this.A00;
        if (bwPBrowserLiteChrome != null) {
            bwPBrowserLiteChrome.setProgress(i);
        }
    }

    public SlO(ViewStub viewStub, C340027ka r4, C340037kb r5) {
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = viewStub;
        Egj((Intent) null, (String) null, R.layout.bwp_browser_header_stub);
    }
}
