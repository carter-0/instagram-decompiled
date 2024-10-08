package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.P7i  reason: case insensitive filesystem */
public final class C72473P7i implements C328347El {
    public final Map A00;
    public final AnonymousClass0eM A01;

    public C72473P7i(Map map, AnonymousClass0eM r3) {
        0qQ.A0B(map, 2);
        this.A01 = r3;
        this.A00 = map;
    }

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r36, C331837So r37, AnonymousClass7L2 r38, 17i r39, boolean z) {
        N3T n3t;
        ImageUrl imageUrl;
        String str;
        ExtendedImageUrl A012;
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r37, context2);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r15 = r38;
        17i r12 = r39;
        C51974G9v.A1P(userSession2, r12, r15, A0Y);
        AnonymousClass9HC r7 = r36;
        boolean A1S = C66582MXn.A1S(userSession2, r7, z);
        C254703su r10 = A0Y.A0e;
        String A0u = C66582MXn.A0u(r10, A1S ? 1 : 0);
        0qQ.A0A(A0u);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass0eM r11 = this.A01;
        Map map = this.A00;
        DbW.A1O(r11, 2, map);
        Object obj = r10.A1T;
        0qQ.A0C(obj, C273654mx.A00(3079));
        Product A002 = C14502TxO.A00((ProductDetailsProductItemDict) ((C61078JwG) obj).A00);
        User user = A002.A0B;
        ImageInfo imageInfo = A002.A08;
        String str2 = null;
        if (imageInfo == null || (A012 = 1iI.A01(context2, imageInfo)) == null) {
            n3t = null;
        } else {
            n3t = new N3T(A012, 1iI.A00(imageInfo));
        }
        SpannableStringBuilder A0C = DbS.A0C(C324476zN.A08(context2, A002, Integer.valueOf(R.style.FullPriceSubtitleStyle), Integer.valueOf(R.style.ProductPriceColor)));
        String str3 = A002.A0K;
        if (str3 != null) {
            A0C.append(" ");
            A0C.append(C324476zN.A02(context2, userSession2, str3, A002.A05()));
        }
        User user2 = A0Y.A0K;
        String str4 = A002.A0H;
        map.put(str4, A002);
        if (user != null) {
            imageUrl = user.Bh3();
            str = user.getUsername();
        } else {
            imageUrl = null;
            str = null;
        }
        0qQ.A0A(str);
        if (user2 != null) {
            str2 = user2.getUsername();
        }
        String str5 = A002.A0J;
        0qQ.A0A(str5);
        return new N6V(AnonymousClass7FX.A03(context2, userSession2, r7, A0Y, r15, r12), new C68818NYc(imageUrl, C66580MXl.A0Y(context2, userSession2, r7, A0Y, r10), AnonymousClass7FD.A04(userSession2, r7, A0Y, r15, r10.A10, r11), n3t, A0C, str, str2, str4, str5, A002.A04()), A0u);
    }
}
