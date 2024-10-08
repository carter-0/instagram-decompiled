package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.EnumMap;

/* renamed from: X.8Xk  reason: invalid class name and case insensitive filesystem */
public final class C357318Xk implements C3502283u {
    public View A00;
    public C339287jM A01;
    public C339287jM A02;
    public Runnable A03;
    public boolean A04;
    public final EnumMap A05 = new EnumMap(C357328Xl.class);
    public final Handler A06 = new Handler(Looper.getMainLooper());
    public final ViewGroup A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final AnonymousClass821 A0A;

    public C357318Xk(ViewGroup viewGroup, AnonymousClass0iw r4, UserSession userSession, AnonymousClass821 r6) {
        0qQ.A0B(viewGroup, 1);
        0qQ.A0B(r4, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r6, 4);
        this.A07 = viewGroup;
        this.A08 = r4;
        this.A09 = userSession;
        this.A0A = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0279, code lost:
        if (r0.getVisibility() != 0) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02a5, code lost:
        if (r14 == false) goto L_0x0181;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C357318Xk r18, X.C339287jM r19) {
        /*
            r10 = 0
            r12 = r18
            X.7jM r0 = r12.A01
            r2 = 0
            r9 = 1
            r11 = r19
            if (r11 != r0) goto L_0x02b8
            r12.A03 = r2
        L_0x000d:
            android.view.View r0 = r12.A00
            if (r0 != 0) goto L_0x0080
            android.view.ViewGroup r6 = r12.A07
            android.content.res.Resources r1 = r6.getResources()
            int r0 = r11.A04
            int r5 = r1.getDimensionPixelOffset(r0)
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624399(0x7f0e01cf, float:1.8875977E38)
            android.view.View r4 = r1.inflate(r0, r6, r10)
            X.0qQ.A0A(r4)
            X.9U8 r0 = new X.9U8
            r0.<init>(r4)
            r4.setTag(r0)
            r0 = -2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r0, r0)
            r3.gravity = r9
            X.821 r1 = r12.A0A
            X.2Fk r0 = r1.Bp5()
            java.lang.Object r0 = r0.A02()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x02b5
            int r0 = r0.intValue()
        L_0x0051:
            int r0 = r0 + r5
            r3.topMargin = r0
            r0 = 8
            r4.setVisibility(r0)
            r6.addView(r4, r3)
            r4.bringToFront()
            X.9U7 r0 = new X.9U7
            r0.<init>(r12)
            X.AnonymousClass0fU.A00(r0, r4)
            r12.A00 = r4
            X.2Fk r4 = r1.Bp5()
            X.07Z r3 = X.C71362ch.A00(r6)
            if (r3 == 0) goto L_0x02d1
            X.9Ll r1 = new X.9Ll
            r1.<init>(r12, r5, r9)
            X.9Tt r0 = new X.9Tt
            r0.<init>(r1)
            r4.A06(r3, r0)
        L_0x0080:
            X.7jM r0 = r12.A01
            if (r0 == 0) goto L_0x0086
            X.8Xl r2 = r0.A09
        L_0x0086:
            X.8Xl r8 = r11.A09
            if (r2 == r8) goto L_0x00ae
            if (r0 == 0) goto L_0x009b
            java.util.EnumMap r1 = r12.A05
            X.8Xl r0 = r0.A09
            java.lang.Object r0 = r1.get(r0)
            X.B2l r0 = (X.C41830B2l) r0
            if (r0 == 0) goto L_0x009b
            r0.DnG()
        L_0x009b:
            X.7jM r0 = r12.A01
            if (r0 == 0) goto L_0x00ae
            java.util.EnumMap r1 = r12.A05
            X.8Xl r0 = r0.A09
            java.lang.Object r0 = r1.get(r0)
            X.B2l r0 = (X.C41830B2l) r0
            if (r0 == 0) goto L_0x00ae
            r0.DnH()
        L_0x00ae:
            r12.A01 = r11
            android.view.View r7 = r12.A00
            if (r7 == 0) goto L_0x0270
            com.instagram.common.session.UserSession r0 = r12.A09
            r19 = r0
            X.0iw r13 = r12.A08
            java.lang.Object r6 = r7.getTag()
            if (r6 == 0) goto L_0x02c9
            X.9U8 r6 = (X.AnonymousClass9U8) r6
            android.content.Context r5 = r7.getContext()
            com.instagram.common.typedurl.ImageUrl r2 = r11.A07
            int r0 = r11.A02
            r1 = 0
            if (r0 == 0) goto L_0x00d1
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r0)
        L_0x00d1:
            android.graphics.drawable.Drawable r4 = r11.A05
            if (r4 != 0) goto L_0x00dc
            r0 = 2131238086(0x7f081cc6, float:1.809244E38)
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
        L_0x00dc:
            boolean r0 = r11.A0H
            if (r0 == 0) goto L_0x00fb
            r0 = 2131442915(0x7f0b3ce3, float:1.8507883E38)
            android.view.View r3 = r7.requireViewById(r0)
            X.0qQ.A07(r3)
            r0 = 2131442914(0x7f0b3ce2, float:1.8507881E38)
            android.view.View r0 = r7.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            X.0qQ.A0B(r0, r10)
            r6.A00 = r0
            r3.setVisibility(r10)
        L_0x00fb:
            r3 = 8
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A00
            if (r2 == 0) goto L_0x02a9
            r0.setUrl(r2, r13)
        L_0x0104:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A00
            r0.setVisibility(r10)
        L_0x0109:
            com.instagram.common.ui.base.IgTextView r2 = r6.A04
            java.lang.String r1 = r11.A0C
            int r0 = r11.A03
            X.C379449Ty.A00(r2, r1, r0)
            boolean r14 = r11.A0G
            if (r14 == 0) goto L_0x029c
            java.lang.String r0 = r11.A0B
            r18 = r0
            if (r0 == 0) goto L_0x029c
            com.instagram.common.ui.base.IgTextView r13 = r6.A03
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r17 = r0.getResources()
            r1 = 2131165226(0x7f07002a, float:1.7944663E38)
            r0 = r17
            int r0 = r0.getDimensionPixelSize(r1)
            float r14 = (float) r0
            android.text.TextPaint r1 = r13.getPaint()
            java.lang.String r0 = "From 's reel"
            float r0 = r1.measureText(r0)
            float r14 = r14 - r0
            r16 = 2131955596(0x7f130f8c, float:1.9547724E38)
            android.text.TextPaint r1 = r13.getPaint()
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r15 = r1
            r1 = r0
            r0 = r18
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r0, r15, r14, r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r14 = new java.lang.Object[]{r0}
            r1 = r16
            r0 = r17
            java.lang.String r0 = r0.getString(r1, r14)
            X.0qQ.A07(r0)
            r13.setText(r0)
        L_0x0162:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.CharSequence r0 = r2.getText()
            r1.append(r0)
            java.lang.CharSequence r0 = r13.getText()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.setContentDescription(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r7, r0)
        L_0x0181:
            boolean r0 = r11.A0D
            if (r0 == 0) goto L_0x018a
            android.widget.ImageView r0 = r6.A01
            r0.setVisibility(r3)
        L_0x018a:
            if (r4 == 0) goto L_0x0198
            android.widget.ImageView r1 = r6.A01
            r1.setImageDrawable(r4)
            android.view.View$OnClickListener r0 = r11.A06
            if (r0 == 0) goto L_0x0198
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0198:
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x0206
            X.0qQ.A0A(r5)
            X.8ZG r1 = new X.8ZG
            r1.<init>(r5)
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r0 = r4.getDimensionPixelSize(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r4.getDimensionPixelSize(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0A = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.A06 = r0
            r1.A0C = r0
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r1.A02(r0)
            r0 = 2130970241(0x7f040681, float:1.7549187E38)
            int r0 = X.2Yu.A0H(r5, r0)
            int r0 = r5.getColor(r0)
            r1.A01(r0)
            r1.A0E = r9
            X.8ZK r0 = new X.8ZK
            r0.<init>(r11)
            r1.A02 = r0
            X.8ZI r0 = r1.A00()
            android.widget.ImageView r1 = r6.A02
            r1.setImageDrawable(r0)
            r1.setVisibility(r10)
            X.LWk r0 = new X.LWk
            r0.<init>(r11)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0206:
            X.8Xl r0 = X.C357328Xl.FEED_CREATION_AUDIO_UPSELL
            if (r8 != r0) goto L_0x025f
            android.widget.ImageView r6 = r6.A01
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            if (r4 == 0) goto L_0x02c1
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r4.height = r0
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
            r4.width = r0
            r6.setLayoutParams(r4)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165367(0x7f0700b7, float:1.794495E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMaxWidth(r0)
            X.4Ke r6 = r11.A0A
            if (r6 == 0) goto L_0x025f
            r0 = 2131436639(0x7f0b245f, float:1.8495154E38)
            android.view.View r0 = r7.requireViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.52z r4 = new X.52z
            r4.<init>(r0)
            r1 = 0
            r0 = r19
            X.C263314Kg.A04(r0, r1, r4, r6)
            X.GAM r0 = r4.A04
            if (r0 == 0) goto L_0x025c
            r0.A01()
        L_0x025c:
            r2.setVisibility(r3)
        L_0x025f:
            boolean r1 = r11.A0E
            r0 = 2131231269(0x7f080225, float:1.8078614E38)
            if (r1 == 0) goto L_0x0269
            r0 = 2131231271(0x7f080227, float:1.8078618E38)
        L_0x0269:
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r7.setBackground(r0)
        L_0x0270:
            android.view.View r0 = r12.A00
            if (r0 == 0) goto L_0x027b
            int r0 = r0.getVisibility()
            r2 = 0
            if (r0 == 0) goto L_0x0284
        L_0x027b:
            r2 = 1
            android.view.View r1 = r12.A00
            if (r1 == 0) goto L_0x0284
            r0 = 0
            r1.setAlpha(r0)
        L_0x0284:
            android.view.View r0 = r12.A00
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r2)
            java.util.EnumMap r0 = r12.A05
            java.lang.Object r0 = r0.get(r8)
            X.B2l r0 = (X.C41830B2l) r0
            if (r0 == 0) goto L_0x029b
            r0.DnI()
        L_0x029b:
            return
        L_0x029c:
            com.instagram.common.ui.base.IgTextView r13 = r6.A03
            java.lang.String r1 = r11.A0B
            int r0 = r11.A01
            X.C379449Ty.A00(r13, r1, r0)
            if (r14 == 0) goto L_0x0181
            goto L_0x0162
        L_0x02a9:
            if (r1 == 0) goto L_0x02b0
            r0.setImageDrawable(r1)
            goto L_0x0104
        L_0x02b0:
            r0.setVisibility(r3)
            goto L_0x0109
        L_0x02b5:
            r0 = 0
            goto L_0x0051
        L_0x02b8:
            if (r0 == 0) goto L_0x000d
            int r1 = r0.A00
            int r0 = r11.A00
            if (r1 >= r0) goto L_0x000d
            return
        L_0x02c1:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x02c9:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x02d1:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357318Xk.A00(X.8Xk, X.7jM):void");
    }

    public final void A02(C339287jM r3, long j) {
        0qQ.A0B(r3, 0);
        C339287jM r0 = this.A01;
        if (r0 == null || r0.A00 >= r3.A00) {
            A01();
            C379259Td r1 = new C379259Td(this, r3);
            this.A03 = r1;
            this.A01 = r3;
            this.A06.postDelayed(r1, j);
        }
    }

    public final void DHa(float f, float f2) {
        boolean z = false;
        if (f > 0.0f) {
            z = true;
        }
        if (this.A04 != z) {
            this.A04 = z;
            if (z) {
                this.A02 = this.A01;
                A04(true);
                return;
            }
            C339287jM r0 = this.A02;
            if (r0 != null) {
                A00(this, r0);
            }
            this.A02 = null;
        }
    }

    public final void A01() {
        Runnable runnable = this.A03;
        if (runnable != null) {
            this.A06.removeCallbacks(runnable);
        }
        this.A03 = null;
    }

    public final void A03(AnonymousClass8ZH r3) {
        View view = this.A00;
        if (view != null) {
            Object tag = view.getTag();
            if (tag != null) {
                Drawable drawable = ((AnonymousClass9U8) tag).A02.getDrawable();
                0qQ.A0C(drawable, AnonymousClass000.A00(3667));
                ((AnonymousClass8ZI) drawable).A01(r3);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final boolean A05() {
        View view = this.A00;
        if ((view == null || view.getVisibility() != 0) && this.A03 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3.getVisibility() != 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(boolean r5) {
        /*
            r4 = this;
            r4.A01()
            X.7jM r0 = r4.A01
            if (r0 == 0) goto L_0x0016
            java.util.EnumMap r1 = r4.A05
            X.8Xl r0 = r0.A09
            java.lang.Object r0 = r1.get(r0)
            X.B2l r0 = (X.C41830B2l) r0
            if (r0 == 0) goto L_0x0016
            r0.DnG()
        L_0x0016:
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0023
            int r0 = r3.getVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            r1 = 8
            X.Afq r0 = new X.Afq
            r0.<init>(r4)
            X.C294975nL.A03(r3, r0, r1, r2)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357318Xk.A04(boolean):void");
    }
}
