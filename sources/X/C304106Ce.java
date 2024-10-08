package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6Ce  reason: invalid class name and case insensitive filesystem */
public abstract class C304106Ce {
    public static final AnonymousClass2DO A00(C286575Wy r9, ImageUrl imageUrl, int i, int i2, long j) {
        C286575Wy r2 = r9;
        long j2 = j;
        r2.ExS(629419123);
        if ((i2 & 2) != 0) {
            j2 = AnonymousClass5aQ.A00(r2).A0f;
        }
        if (0fL.A02()) {
            0fL.A01(2079580285, "com.instagram.barcelona.common.ui.image.rememberBdsImagePainter (BdsImagePainter.kt:25)");
        }
        AnonymousClass2DN A01 = A01(r2, new AnonymousClass6BY(imageUrl), (C62320sa) null, (C62320sa) null, (C62320sa) null, (i & 112) | (i & 896) | (i & 7168) | (i & 57344), j2);
        if (0fL.A02()) {
            0fL.A00(1934859328);
        }
        C286565Wx.A0I((C286565Wx) r2);
        return A01;
    }

    public static final AnonymousClass2DN A01(C286575Wy r16, AnonymousClass6BY r17, C62320sa r18, C62320sa r19, C62320sa r20, int i, long j) {
        Boolean bool;
        Boolean bool2;
        0lg r5;
        0lg r52;
        int i2 = i;
        C286575Wy r7 = r16;
        r7.ExS(1802799528);
        if (0fL.A02()) {
            0fL.A01(850270981, "com.instagram.barcelona.common.ui.image.rememberBdsImagePainter (BdsImagePainter.kt:43)");
        }
        C267314bM r6 = C286895Yf.A00;
        C286565Wx r2 = (C286565Wx) r7;
        Object A01 = C286615Xc.A01(r6, C286565Wx.A04(r2));
        if (!(A01 instanceof UserSession) || (r52 = (0lg) A01) == null || (bool = Boolean.valueOf(182.A06(0Tu.A05, r52, 36320193370136670L))) == null) {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        r7.ExS(338149188);
        ImageUrl imageUrl = r17.A00;
        Object A012 = C286615Xc.A01(r6, C286565Wx.A04(r2));
        if (!(A012 instanceof UserSession) || (r5 = (0lg) A012) == null || (bool2 = Boolean.valueOf(182.A06(0Tu.A05, r5, 36322602846857510L))) == null) {
            bool2 = false;
        }
        C62320sa r9 = r18;
        C62320sa r10 = r19;
        C62320sa r11 = r20;
        AnonymousClass2DN A02 = 1zC.A02(r7, imageUrl, r9, r10, r11, (i & 112) | (i2 & 896) | (i2 & 7168) | (i & 57344), 0, j, booleanValue, bool2.booleanValue());
        C286565Wx.A0L(r2, false);
        if (0fL.A02()) {
            0fL.A00(-528380158);
        }
        C286565Wx.A0L(r2, false);
        return A02;
    }
}
