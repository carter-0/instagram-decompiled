package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.87B  reason: invalid class name */
public final class AnonymousClass87B {
    public View A00;
    public View A01;
    public ImageView A02;
    public IgTextView A03;
    public TouchInterceptorFrameLayout A04;
    public final int A05;
    public final Context A06;
    public final View A07;
    public final C71662eb A08;
    public final AnonymousClass87D A09;
    public final AnonymousClass87A A0A;
    public final AnonymousClass80U A0B;

    public final void A00() {
        AnonymousClass87D r4 = this.A09;
        AnonymousClass87B r3 = r4.A0B.A00;
        r3.A00.getClass();
        r3.A00.setBackgroundColor(r3.A06.getColor(R.color.black_60_transparent));
        r3.A00.setOnTouchListener(new C40040AOw(r3));
        r4.A03.setText((CharSequence) null);
        r4.A08 = true;
        r4.A07.setOnFocusChangeListener(r4);
        SearchEditText searchEditText = r4.A07;
        searchEditText.A0C = r4;
        searchEditText.A0F = r4;
        searchEditText.A05();
    }

    public AnonymousClass87B(Context context, View view, AnonymousClass3E6 r9, C71662eb r10, AnonymousClass87A r11, AnonymousClass80U r12, boolean z) {
        int i;
        this.A06 = context;
        this.A0A = r11;
        this.A0B = r12;
        this.A08 = r10;
        AnonymousClass3E6 r2 = r9;
        this.A09 = new AnonymousClass87D(context, r2, new AnonymousClass87C(this), r11, r12);
        this.A07 = view;
        Resources resources = context.getResources();
        if (z) {
            i = resources.getDimensionPixelOffset(R.dimen.audition_flow_picker_subtitle_margin_bottom);
        } else {
            i = 0;
        }
        this.A05 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r6.A05() > 1) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AA8 r6) {
        /*
            r5 = this;
            boolean r0 = r6.A0H()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0037
            android.widget.ImageView r0 = r5.A02
            android.view.View[] r1 = new android.view.View[]{r0}
            X.2co r0 = X.C315596kB.A02
            r0 = 0
            X.C294975nL.A04(r0, r1, r2)
            android.view.View[] r1 = new android.view.View[r2]
            com.instagram.common.ui.base.IgTextView r0 = r5.A03
        L_0x0018:
            r1[r3] = r0
            X.C315596kB.A08(r1, r3)
        L_0x001d:
            boolean r1 = r6.A0I()
            X.87D r0 = r5.A09
            if (r1 == 0) goto L_0x008e
            X.2eb r0 = r0.A06
            r0.getClass()
            android.view.View r0 = r0.A01()
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r2)
            return
        L_0x0037:
            int r0 = r6.A05()
            if (r0 <= 0) goto L_0x0082
            boolean r0 = r6 instanceof X.C387529mM
            if (r0 != 0) goto L_0x0080
            int r0 = r6.A05()
            r1 = 1
            if (r0 <= r2) goto L_0x0080
        L_0x0048:
            android.content.Context r4 = r5.A06
            if (r1 == 0) goto L_0x0078
            r1 = 2131952189(0x7f13023d, float:1.9540814E38)
            int r0 = r6.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = r4.getString(r1, r0)
        L_0x005f:
            com.instagram.common.ui.base.IgTextView r0 = r5.A03
            r0.getClass()
            r0.setText(r1)
            com.instagram.common.ui.base.IgTextView r0 = r5.A03
            android.view.View[] r1 = new android.view.View[]{r0}
            X.2co r0 = X.C315596kB.A02
            r0 = 0
            X.C294975nL.A04(r0, r1, r2)
            android.view.View[] r1 = new android.view.View[r2]
            android.widget.ImageView r0 = r5.A02
            goto L_0x0018
        L_0x0078:
            r0 = 2131952188(0x7f13023c, float:1.9540812E38)
            java.lang.String r1 = r4.getString(r0)
            goto L_0x005f
        L_0x0080:
            r1 = 0
            goto L_0x0048
        L_0x0082:
            android.widget.ImageView r1 = r5.A02
            com.instagram.common.ui.base.IgTextView r0 = r5.A03
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            X.C315596kB.A08(r0, r2)
            goto L_0x001d
        L_0x008e:
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87B.A01(X.AA8):void");
    }
}
