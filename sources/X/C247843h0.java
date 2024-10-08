package X;

import com.facebook.systrace.Systrace;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.3h0  reason: invalid class name and case insensitive filesystem */
public abstract class C247843h0 {
    public static final void A00(AnonymousClass0iw r2, C246953fX r3, IgProgressImageView igProgressImageView) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(igProgressImageView, 1);
        0qQ.A0B(r2, 2);
        A01(r2, r3, igProgressImageView, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass0iw r10, X.C246953fX r11, com.instagram.feed.widget.IgProgressImageView r12, boolean r13, boolean r14) {
        /*
            r4 = 0
            r9 = r11
            X.0qQ.A0B(r11, r4)
            r3 = 1
            r2 = 2
            r0 = 1
            boolean r5 = com.facebook.systrace.Systrace.A0E(r0)
            if (r5 == 0) goto L_0x0017
            r1 = 1018807279(0x3cb9c3ef, float:0.022676436)
            java.lang.String r0 = "FeedImageViewBinder#bindView"
            X.0fS.A01(r0, r1)
        L_0x0017:
            r1 = 2131435124(0x7f0b1e74, float:1.8492081E38)
            java.lang.String r0 = r11.A06
            r8 = r12
            r12.setTag(r1, r0)
            r0 = 32
            X.9Kz r1 = new X.9Kz
            r1.<init>(r12, r0)
            java.lang.String r0 = "set_clear_animation"
            A02(r0, r1)
            r0 = 31
            X.9Ls r1 = new X.9Ls
            r1.<init>(r0, r12, r11)
            java.lang.String r0 = "set_mini_preview"
            A02(r0, r1)
            java.lang.String r0 = r11.A05
            if (r0 == 0) goto L_0x0048
            int r1 = android.graphics.Color.parseColor(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r12.setPlaceHolderColor((android.graphics.drawable.ColorDrawable) r0)
        L_0x0048:
            X.3fT r0 = r11.A04
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x0101
            if (r1 == r3) goto L_0x00f2
            if (r1 == r2) goto L_0x00e7
            r0 = 3
            if (r1 != r0) goto L_0x010c
            r0 = 33
            X.9Kz r1 = new X.9Kz
            r1.<init>(r12, r0)
            java.lang.String r0 = "set_no_image"
        L_0x0060:
            A02(r0, r1)
        L_0x0063:
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0089
            android.content.Context r0 = r12.getContext()
            X.0qQ.A07(r0)
            boolean r0 = X.C255983v2.A00(r0)
            if (r0 == 0) goto L_0x0089
            r0 = 34
            X.9Kz r1 = new X.9Kz
            r1.<init>(r12, r0)
            java.lang.String r0 = "clips_set_fit_center"
            A02(r0, r1)
            if (r5 == 0) goto L_0x0088
            r0 = -1406499012(0xffffffffac2a873c, float:-2.4233523E-12)
        L_0x0085:
            X.0fS.A00(r0)
        L_0x0088:
            return
        L_0x0089:
            if (r14 == 0) goto L_0x00dd
            r0 = 35
            X.9Kz r1 = new X.9Kz
            r1.<init>(r12, r0)
            java.lang.String r0 = "set_fit_center"
        L_0x0094:
            A02(r0, r1)
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x00bc
            com.instagram.common.typedurl.ImageUrl r3 = r9.A01
            if (r3 == 0) goto L_0x00c2
            r12.setUrl(r3, r10)
            X.1qt r0 = r9.A00
            if (r0 == 0) goto L_0x00bc
            com.instagram.api.schemas.MediaCroppingCoordinatesIntf r2 = r0.B5Q()
            if (r2 == 0) goto L_0x00bc
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x00bc
            android.view.ViewTreeObserver r1 = r12.getViewTreeObserver()
            X.WCK r0 = new X.WCK
            r0.<init>(r2, r3, r12)
            r1.addOnPreDrawListener(r0)
        L_0x00bc:
            if (r5 == 0) goto L_0x0088
            r0 = -1625886998(0xffffffff9f16eeea, float:-3.196136E-20)
            goto L_0x0085
        L_0x00c2:
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x00bc
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r12.getIgImageView()
            r0 = 0
            r1.setImageBitmap(r0)
            android.content.Context r1 = r12.getContext()
            r0 = 2131100246(0x7f060256, float:1.7812868E38)
            int r0 = r1.getColor(r0)
            r12.setBackgroundColor(r0)
            goto L_0x00bc
        L_0x00dd:
            r0 = 36
            X.9Kz r1 = new X.9Kz
            r1.<init>(r12, r0)
            java.lang.String r0 = "set_center_crop"
            goto L_0x0094
        L_0x00e7:
            r0 = 39
            X.Inz r1 = new X.Inz
            r1.<init>(r0, r12, r11, r10)
            java.lang.String r0 = "set_video_image"
            goto L_0x0060
        L_0x00f2:
            r7 = 23
            X.9MP r6 = new X.9MP
            r11 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r0 = "set_remote_image"
            A02(r0, r6)
            goto L_0x0063
        L_0x0101:
            r0 = 19
            X.9ME r1 = new X.9ME
            r1.<init>(r0, r12, r11, r10)
            java.lang.String r0 = "set_local_image"
            goto L_0x0060
        L_0x010c:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247843h0.A01(X.0iw, X.3fX, com.instagram.feed.widget.IgProgressImageView, boolean, boolean):void");
    }

    public static final void A02(String str, C62320sa r3) {
        boolean A0E = Systrace.A0E(1);
        if (A0E) {
            0fS.A01(str, -1801831957);
        }
        r3.invoke();
        if (A0E) {
            0fS.A00(-1177036129);
        }
    }
}
