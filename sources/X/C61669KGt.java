package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;

/* renamed from: X.KGt  reason: case insensitive filesystem */
public final class C61669KGt extends 2Cn {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ I0v A02;
    public final /* synthetic */ String A03;

    public C61669KGt(Context context, 1Xj r2, I0v i0v, String str) {
        this.A01 = r2;
        this.A02 = i0v;
        this.A00 = context;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass3Q2 A022;
        File file = (File) obj;
        0qQ.A0B(file, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            String A0Z = JTQ.A0Z();
            1Xj r6 = this.A01;
            User A11 = C51966G9m.A11(r6);
            if (A11 != null) {
                String id = A11.getId();
                if (!r6.CeS()) {
                    A022 = AnonymousClass9T3.A01(A0Z);
                    String str = this.A03;
                    A022.A33 = canonicalPath;
                    A022.A3L = canonicalPath;
                    A022.A0e(ShareType.FOLLOWERS_SHARE);
                    A022.A0N = 14;
                    A022.A3D = str;
                    A022.A3E = id;
                    A022.A5e = true;
                    A022.A32 = r6.A2n();
                    ImageUrl A1Q = r6.A1Q();
                    if (A1Q != null) {
                        A022.A39 = A1Q.getUrl();
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    C59796JYp A012 = C59796JYp.A01(canonicalPath, 0);
                    0qQ.A07(A012);
                    String str2 = A012.A07;
                    0qQ.A07(str2);
                    long j = A012.A03;
                    ClipInfo A032 = Q0X.A03(this.A02.A00, str2, j, j);
                    File A013 = AnonymousClass457.A01();
                    C64188LSv.A01(A032, A013, A032.A09, A032.A06, 100, 0, true);
                    String canonicalPath2 = A013.getCanonicalPath();
                    A022 = AnonymousClass9T3.A02(A0Z);
                    String str3 = this.A03;
                    A022.A0i(A012.A07);
                    A022.A33 = canonicalPath2;
                    String str4 = A012.A07;
                    A022.A3L = str4;
                    A022.A02 = A032.A00;
                    A022.A3Z = str4;
                    A022.A0e(ShareType.FOLLOWERS_SHARE);
                    A022.A3D = str3;
                    A022.A3E = id;
                    A022.A0N = 14;
                    A022.A5e = true;
                    A022.A32 = r6.A2n();
                    ImageUrl A1Q2 = r6.A1Q();
                    if (A1Q2 != null) {
                        A022.A39 = A1Q2.getUrl();
                        Q0X.A04(A032, A022);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                1ud r2 = 1ua.A0G;
                Context context = this.A00;
                UserSession userSession = this.A02.A00;
                1ua A014 = r2.A01(context, userSession);
                JTQ.A1J(A022, A014, A022.A12() ? 1 : 0);
                28K.A00(userSession).A0B(DbT.A05(context));
                A014.A0B(A022);
            }
        } catch (IOException e) {
            0wb.A06("open_carousel_network_helper", "Error getting image file path", e);
        }
    }
}
