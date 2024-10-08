package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.6tP  reason: invalid class name and case insensitive filesystem */
public abstract class C320996tP {
    public static final Drawable A00(Context context, UserSession userSession, C317966o8 r24, boolean z, boolean z2) {
        int A01;
        String str;
        C317966o8 r0;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        C317966o8 r6 = r24;
        ImageUrl imageUrl = r6.A0H;
        if (z2) {
            String url = imageUrl.getUrl();
            0qQ.A07(url);
            return A03(context2, url, r6.A0c);
        }
        0qQ.A07(imageUrl);
        String url2 = C226972iH.A00(imageUrl).getUrl();
        0qQ.A07(url2);
        C317966o8 r4 = r6.A0I;
        int A012 = AnonymousClass1GB.A01(r6.A00 * r6.A01);
        if (r4 == null) {
            A01 = -1;
        } else {
            A01 = AnonymousClass1GB.A01(r4.A01 * r4.A00);
        }
        int A013 = AnonymousClass8XF.A01(context2) * AnonymousClass8XF.A00(context2);
        boolean z3 = true;
        if (A012 + 1 > A01 || A01 > A013) {
            z3 = false;
        }
        ImageUrl imageUrl2 = null;
        if (z3 && (r0 = r6.A0I) != null) {
            imageUrl2 = r0.A0H;
        }
        String str2 = r6.A0S;
        0qQ.A07(str2);
        Integer valueOf = Integer.valueOf(r6.A09);
        String str3 = r6.A0Z;
        String str4 = r6.A0c;
        if (imageUrl2 == null || (str = imageUrl2.getUrl()) == null) {
            str = url2;
        }
        return new C321006tQ(context2, userSession2, C321066tW.A01(context2, r6.A01(), r6.A01 / r6.A00, context2.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large)), (C320986tO) null, valueOf, url2, str2, str3, str4, str, (float) context2.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin), context2.getColor(R.color.cds_white_a20), context2.getColor(R.color.fds_white_alpha60), z, true, false);
    }

    public static final Drawable A02(Context context, UserSession userSession, String str, int i, int i2, boolean z) {
        return A01(context, userSession, (C320986tO) null, str, (String) null, (String) null, (String) null, i, i2, false, true, z, true, false);
    }

    public static final Drawable A01(Context context, UserSession userSession, C320986tO r18, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str5 = str3;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        String str6 = str;
        0qQ.A0B(str6, 2);
        String str7 = str2;
        if (z3) {
            return A03(context2, str6, str7);
        }
        int i3 = R.color.fds_transparent;
        int i4 = R.color.fds_transparent;
        if (z4) {
            i3 = R.color.cds_white_a20;
            i4 = R.color.fds_white_alpha60;
        }
        String url = C226972iH.A00(new SimpleImageUrl(str6)).getUrl();
        0qQ.A07(url);
        if (str3 == null) {
            str5 = str6;
        }
        int i5 = i2;
        String str8 = str4;
        boolean z6 = z;
        boolean z7 = z2;
        return new C321006tQ(context2, userSession2, C321066tW.A00(1.0f, i5, i, -1), r18, (Integer) null, url, str5, str8, str7, url, (float) context2.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin), context2.getColor(i3), context2.getColor(i4), z6, z7, z5);
    }

    public static final Drawable A03(Context context, String str, String str2) {
        1Sw.A00();
        C226662he A00 = AnonymousClass6QK.A00(0cp.A03(str), 0se.A0M(new 0eP(AnonymousClass000.A00(1451), "animation")));
        1TS A01 = C226722hk.A01();
        Resources resources = context.getResources();
        0qQ.A07(resources);
        C226732hl A02 = A01.A02(resources, 1U1.A0b, A00, false);
        C226742hm r1 = (C226742hm) C226722hk.A00().ALv();
        C226732hl BGF = r1.BGF();
        if (BGF != null && !BGF.equals(A02)) {
            C226722hk.A00().ECf(r1);
        }
        r1.EiD(new C57896IiD(r1, A02, str2));
        Runnable BlC = r1.BlC();
        if (BlC != null) {
            BlC.run();
        }
        r1.Eqj(new C56916IHl(r1));
        return (Drawable) r1;
    }
}
