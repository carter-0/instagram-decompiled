package X;

/* renamed from: X.Ink  reason: case insensitive filesystem */
public final class C58180Ink extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58180Ink(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012c, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b4, code lost:
        return new X.C47699EDi(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x000c;
                case 2: goto L_0x001d;
                case 3: goto L_0x0005;
                case 4: goto L_0x000f;
                case 5: goto L_0x000c;
                case 6: goto L_0x001d;
                case 7: goto L_0x0005;
                case 8: goto L_0x0024;
                case 9: goto L_0x0032;
                case 10: goto L_0x003c;
                case 11: goto L_0x0044;
                case 12: goto L_0x004c;
                case 13: goto L_0x0055;
                case 14: goto L_0x0060;
                case 15: goto L_0x006b;
                case 16: goto L_0x004c;
                case 17: goto L_0x0074;
                case 18: goto L_0x0096;
                case 19: goto L_0x00a0;
                case 20: goto L_0x00b2;
                case 21: goto L_0x004c;
                case 22: goto L_0x00c0;
                case 23: goto L_0x00c9;
                case 24: goto L_0x00ed;
                case 25: goto L_0x00f6;
                case 26: goto L_0x00ff;
                case 27: goto L_0x0108;
                case 28: goto L_0x0111;
                case 29: goto L_0x011a;
                case 30: goto L_0x00f6;
                case 31: goto L_0x0123;
                case 32: goto L_0x012d;
                case 33: goto L_0x0136;
                case 34: goto L_0x013f;
                case 35: goto L_0x0149;
                case 36: goto L_0x0153;
                case 37: goto L_0x0158;
                case 38: goto L_0x0161;
                case 39: goto L_0x0166;
                case 40: goto L_0x0170;
                case 41: goto L_0x0175;
                case 42: goto L_0x017e;
                case 43: goto L_0x0183;
                case 44: goto L_0x0188;
                case 45: goto L_0x018d;
                case 46: goto L_0x0192;
                case 47: goto L_0x0197;
                case 48: goto L_0x01a1;
                case 49: goto L_0x01ab;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A01
            X.07f r2 = X.DbY.A0I(r0)
            return r2
        L_0x000c:
            java.lang.Object r2 = r4.A01
            return r2
        L_0x000f:
            java.lang.Object r1 = r4.A01
            X.4DH r1 = (X.AnonymousClass4DH) r1
            android.os.Bundle r0 = r1.requireArguments()
            X.U8E r2 = new X.U8E
            r2.<init>(r0, r1, r1)
            return r2
        L_0x001d:
            java.lang.Object r0 = r4.A01
            java.lang.Object r2 = X.DbT.A0r(r0)
            return r2
        L_0x0024:
            java.lang.Object r1 = r4.A01
            X.4DH r1 = (X.AnonymousClass4DH) r1
            android.os.Bundle r0 = r1.requireArguments()
            X.U8D r2 = new X.U8D
            r2.<init>(r0, r1, r1)
            return r2
        L_0x0032:
            java.lang.Object r0 = r4.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.VOL r2 = new X.VOL
            r2.<init>(r0)
            return r2
        L_0x003c:
            java.lang.Object r0 = r4.A01
            X.0r6[] r0 = (X.AnonymousClass0r6[]) r0
            int r0 = r0.length
            X.JwA[] r2 = new X.C61072JwA[r0]
            return r2
        L_0x0044:
            java.lang.Object r0 = r4.A01
            X.0r6[] r0 = (X.AnonymousClass0r6[]) r0
            int r0 = r0.length
            java.lang.String[] r2 = new java.lang.String[r0]
            return r2
        L_0x004c:
            java.lang.Object r0 = r4.A01
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r0.A09()
            goto L_0x012a
        L_0x0055:
            java.lang.Object r1 = r4.A01
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = (com.instagram.common.ui.widget.imageview.CircularImageView) r1
            int r0 = r1.A00
            r1.setStrokeAlpha(r0)
            goto L_0x012a
        L_0x0060:
            java.lang.Object r0 = r4.A01
            X.3NM r0 = (X.AnonymousClass3NM) r0
            if (r0 == 0) goto L_0x012a
            r0.A03()
            goto L_0x012a
        L_0x006b:
            java.lang.Object r0 = r4.A01
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r0
            r0.A02()
            goto L_0x012a
        L_0x0074:
            java.lang.Object r0 = r4.A01
            com.instagram.user.follow.FollowButtonBase r0 = (com.instagram.user.follow.FollowButtonBase) r0
            X.4at r0 = r0.A0J
            com.instagram.user.follow.FollowButtonBase r0 = r0.A0R
            r2 = 0
            r0.setOnClickListener(r2)
            r0.setOnLongClickListener(r2)
            X.4at r1 = r0.A0J
            r1.A09 = r2
            r1.A08 = r2
            r0 = 0
            r1.A0M = r0
            r1.A0B = r2
            r1.A0O = r0
            r1.A0A = r2
            r1.A0N = r0
            goto L_0x012a
        L_0x0096:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setBackgroundResource(r0)
            goto L_0x012a
        L_0x00a0:
            java.lang.Object r1 = r4.A01
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r1 = (com.instagram.reels.ui.badge.ReelBrandingBadgeView) r1
            r0 = 0
            r1.setIconDrawable((android.graphics.drawable.Drawable) r0)
            r0 = 0
            r1.setBorderWidth(r0)
            r0 = 0
            int[] r0 = new int[r0]
            r1.A00 = r0
            goto L_0x012a
        L_0x00b2:
            java.lang.Object r1 = r4.A01
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            r0 = 0
            r1.setCornerRadius(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setColor(r0)
            goto L_0x012a
        L_0x00c0:
            java.lang.Object r1 = r4.A01
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1
            r0 = 0
            r1.setOnSeekBarChangeListener(r0)
            goto L_0x012a
        L_0x00c9:
            java.lang.Object r2 = r4.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            long r0 = X.C244013aV.A0A(r2)
            int r3 = X.C51969G9p.A09(r2, r0)
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            long r0 = X.C244013aV.A0C(r2, r0)
            int r1 = X.C51969G9p.A09(r2, r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = X.C244013aV.A02(r2, r0)
            X.Jct r2 = new X.Jct
            r2.<init>(r3, r3, r0, r1)
            return r2
        L_0x00ed:
            java.lang.Object r1 = r4.A01
            com.facebook.shimmer.ShimmerFrameLayout r1 = (com.facebook.shimmer.ShimmerFrameLayout) r1
            r0 = 0
            r1.A04(r0)
            goto L_0x012a
        L_0x00f6:
            java.lang.Object r1 = r4.A01
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 0
            r1.setMovementMethod(r0)
            goto L_0x012a
        L_0x00ff:
            java.lang.Object r1 = r4.A01
            com.instagram.feed.ui.text.BulletAwareTextView r1 = (com.instagram.feed.ui.text.BulletAwareTextView) r1
            r0 = 0
            r1.setSpacingAdd(r0)
            goto L_0x012a
        L_0x0108:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setPadding(r0, r0, r0, r0)
            goto L_0x012a
        L_0x0111:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setBackground(r0)
            goto L_0x012a
        L_0x011a:
            java.lang.Object r1 = r4.A01
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 0
            r1.setText(r0)
            goto L_0x012a
        L_0x0123:
            java.lang.Object r1 = r4.A01
            com.instagram.ui.widget.textview.IgTextLayoutView r1 = (com.instagram.ui.widget.textview.IgTextLayoutView) r1
            r0 = 0
            r1.A01 = r0
        L_0x012a:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x012d:
            java.lang.Object r1 = r4.A01
            r0 = 2
            X.Sna r2 = new X.Sna
            r2.<init>(r1, r0)
            return r2
        L_0x0136:
            java.lang.Object r0 = r4.A01
            X.0lg r0 = (X.0lg) r0
            X.0wc r2 = X.AnonymousClass0kN.A02(r0)
            return r2
        L_0x013f:
            java.lang.Object r0 = r4.A01
            X.ESP r0 = (X.ESP) r0
            X.Fqd r2 = new X.Fqd
            r2.<init>(r0)
            return r2
        L_0x0149:
            java.lang.Object r0 = r4.A01
            X.ESP r0 = (X.ESP) r0
            X.Fqe r2 = new X.Fqe
            r2.<init>(r0)
            return r2
        L_0x0153:
            java.lang.Object r1 = r4.A01
            r0 = 23
            goto L_0x01af
        L_0x0158:
            java.lang.Object r1 = r4.A01
            r0 = 7
            X.FQe r2 = new X.FQe
            r2.<init>(r1, r0)
            return r2
        L_0x0161:
            java.lang.Object r1 = r4.A01
            r0 = 24
            goto L_0x01af
        L_0x0166:
            java.lang.Object r1 = r4.A01
            r0 = 41
            X.FP3 r2 = new X.FP3
            r2.<init>((java.lang.Object) r1, (int) r0)
            return r2
        L_0x0170:
            java.lang.Object r1 = r4.A01
            r0 = 26
            goto L_0x01af
        L_0x0175:
            java.lang.Object r1 = r4.A01
            r0 = 6
            X.ESy r2 = new X.ESy
            r2.<init>(r1, r0)
            return r2
        L_0x017e:
            java.lang.Object r1 = r4.A01
            r0 = 27
            goto L_0x01af
        L_0x0183:
            java.lang.Object r1 = r4.A01
            r0 = 28
            goto L_0x01af
        L_0x0188:
            java.lang.Object r1 = r4.A01
            r0 = 29
            goto L_0x01af
        L_0x018d:
            java.lang.Object r1 = r4.A01
            r0 = 30
            goto L_0x01af
        L_0x0192:
            java.lang.Object r1 = r4.A01
            r0 = 31
            goto L_0x01af
        L_0x0197:
            java.lang.Object r1 = r4.A01
            r0 = 42
            X.FP3 r2 = new X.FP3
            r2.<init>((java.lang.Object) r1, (int) r0)
            return r2
        L_0x01a1:
            java.lang.Object r0 = r4.A01
            X.E3L r0 = (X.E3L) r0
            X.Fmh r2 = new X.Fmh
            r2.<init>(r0)
            return r2
        L_0x01ab:
            java.lang.Object r1 = r4.A01
            r0 = 32
        L_0x01af:
            X.EDi r2 = new X.EDi
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58180Ink.invoke():java.lang.Object");
    }
}
