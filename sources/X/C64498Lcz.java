package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Lcz  reason: case insensitive filesystem */
public final class C64498Lcz implements MTO {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass07i A01;
    public final /* synthetic */ LS7 A02;
    public final /* synthetic */ Ki3 A03;
    public final /* synthetic */ 1P0 A04;

    public C64498Lcz(Context context, AnonymousClass07i r2, LS7 ls7, Ki3 ki3, 1P0 r5) {
        this.A02 = ls7;
        this.A03 = ki3;
        this.A04 = r5;
        this.A00 = context;
        this.A01 = r2;
    }

    public final void D7V(Rect rect, ImageUrl imageUrl, String str) {
        LS7 ls7 = this.A02;
        ls7.A00.getClass();
        if (ls7.A00.A03 == null) {
            ls7.A00 = new C63830L8l(rect, imageUrl, (String) null, str);
        }
    }

    public final void onFinish() {
        LS7 ls7 = this.A02;
        Ki3 ki3 = this.A03;
        ls7.A02.getClass();
        Reel reel = ls7.A02;
        UserSession userSession = ls7.A05;
        List<C255773uh> A0O = reel.A0O(userSession);
        HashSet hashSet = new HashSet(A0O.size());
        for (C255773uh r0 : A0O) {
            1Xj r02 = r0.A0b;
            r02.getClass();
            hashSet.add(r02.getId());
        }
        C239693Hq r03 = ls7.A02.A0L;
        r03.getClass();
        String str = r03.A02;
        C63830L8l l8l = ls7.A00;
        l8l.getClass();
        String str2 = l8l.A04;
        if (str == null && str2 == null) {
            1Xj r04 = ls7.A02.A0A(userSession, 0).A0b;
            r04.getClass();
            str = r04.getId();
        }
        String str3 = ls7.A02.A0r;
        if (str3 == null) {
            str3 = "";
        }
        C63830L8l l8l2 = ls7.A00;
        ImageUrl imageUrl = l8l2.A02;
        int height = imageUrl.getHeight();
        int width = imageUrl.getWidth();
        List A022 = C64184LSr.A02(l8l2);
        String id = ls7.A02.getId();
        AnonymousClass7TF.A1H(userSession, ki3);
        1OC A002 = AnonymousClass738.A00(ki3, userSession, str3, str, str2, id, A022, hashSet, height, width, false);
        A002.A00 = this.A04;
        1ES.A00(this.A00, this.A01, A002);
    }
}
