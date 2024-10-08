package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.3Vj  reason: invalid class name and case insensitive filesystem */
public abstract class C242663Vj {
    public static final AnonymousClass1MK A00 = new C242673Vk();

    public static C242693Vo A02(Context context, UserSession userSession, 1Xj r9, Integer num, String str) {
        String id = r9.getId();
        UserSession userSession2 = userSession;
        C226952iF A002 = A00(context, userSession2, r9, num, str, false, false);
        0qQ.A0B(userSession2, 1);
        return new C242693Vo(A002, (AnonymousClass3WR) null, id);
    }

    public static C242693Vo A03(Context context, UserSession userSession, 1Xj r8, Integer num, String str) {
        return A04(context, userSession, r8, num, str, false);
    }

    public static C242693Vo A04(Context context, UserSession userSession, 1Xj r10, Integer num, String str, boolean z) {
        AnonymousClass3WR CEL;
        1Xj r6 = r10;
        if (r10.CeS() || r10.A5h()) {
            CEL = r10.CEL();
        } else {
            CEL = null;
        }
        return new C242693Vo(A00(context, userSession, r6, num, str, z, false), CEL, r10.getId());
    }

    public static C242693Vo A05(Context context, UserSession userSession, 1Xj r12, String str, boolean z) {
        return new C242693Vo(A00(context, userSession, r12, AnonymousClass05K.A01, str, false, z), (AnonymousClass3WR) null, r12.getId());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C226952iF A00(android.content.Context r4, com.instagram.common.session.UserSession r5, X.1Xj r6, java.lang.Integer r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r7 == r0) goto L_0x0006
            if (r9 == 0) goto L_0x007d
        L_0x0006:
            boolean r0 = r6.A5Y()
            if (r0 == 0) goto L_0x0064
            com.instagram.model.mediasize.ImageInfo r0 = r6.A1p()
            if (r0 == 0) goto L_0x0064
            com.instagram.model.mediasize.AdditionalCandidates r0 = r0.AZb()
            if (r0 == 0) goto L_0x0064
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r0.BFm()
            if (r0 == 0) goto L_0x0064
            com.instagram.model.mediasize.ImageInfo r0 = r6.A1p()
            if (r0 == 0) goto L_0x0082
            com.instagram.model.mediasize.AdditionalCandidates r0 = r0.AZb()
            if (r0 == 0) goto L_0x0082
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r0.BFm()
        L_0x002e:
            if (r1 == 0) goto L_0x0082
            r6.getId()
            java.lang.String r4 = r6.BTL()
            X.1MK r3 = A00
            boolean r2 = r6.CeS()
            r6.A17()
            X.1NK r0 = X.1NK.A00()
            X.1OO r1 = r0.A0J(r1, r8)
            r0 = 1
            r1.A0I = r0
            r1.A05 = r5
            r1.A0L = r10
            r1.A0K = r2
            X.1wY.A00(r5)
            r1.A02(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x005f
            r1.A09 = r4
        L_0x005f:
            X.2iF r0 = r1.A00()
            return r0
        L_0x0064:
            X.1Xy r0 = r6.A0C
            com.instagram.api.schemas.CollectionMediaRole r1 = r0.Aom()
            com.instagram.api.schemas.CollectionMediaRole r0 = com.instagram.api.schemas.CollectionMediaRole.THUMBNAIL_MEDIA
            if (r1 == r0) goto L_0x007d
            X.1Xy r0 = r6.A0C
            com.instagram.api.schemas.CollectionMediaRole r1 = r0.Aom()
            com.instagram.api.schemas.CollectionMediaRole r0 = com.instagram.api.schemas.CollectionMediaRole.MAIN_MEDIA
            if (r1 == r0) goto L_0x007d
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r6.A1n(r4)
            goto L_0x002e
        L_0x007d:
            com.instagram.common.typedurl.ImageUrl r1 = r6.A1Q()
            goto L_0x002e
        L_0x0082:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242663Vj.A00(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, java.lang.Integer, java.lang.String, boolean, boolean):X.2iF");
    }

    public static SimpleImageUrl A01(1Xj r2) {
        if (r2.A1q() == null || r2.A1q().ByT() == null || r2.A1q().ByT().get(0) == null) {
            return null;
        }
        return new SimpleImageUrl((ImageUrl) r2.A1q().ByT().get(0));
    }

    public static C242693Vo A06(UserSession userSession, ImageUrl imageUrl, String str) {
        String str2 = ((ImageCacheKey) imageUrl.AjH()).A03;
        imageUrl.AjH();
        AnonymousClass1MK r5 = A00;
        1OO A0J = 1NK.A00().A0J(imageUrl, str);
        A0J.A0I = true;
        A0J.A05 = userSession;
        A0J.A0L = false;
        A0J.A0K = false;
        1wY.A00(userSession);
        A0J.A02(r5);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A0J.A09 = null;
        }
        C226952iF A002 = A0J.A00();
        0qQ.A0B(userSession, 1);
        return new C242693Vo(A002, (AnonymousClass3WR) null, str2);
    }
}
