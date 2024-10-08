package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.instagram.user.model.User;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Ukd  reason: case insensitive filesystem */
public final class C15913Ukd extends AnonymousClass8D8 {
    public final C16141UpS A00;

    public C15913Ukd(Context context, AnonymousClass8BA r10, C17998Vja vja) {
        super(r10, (AnonymousClass8BH) null, (Integer) null, 111, false, false);
        C16141UpS upS = new C16141UpS(context);
        this.A00 = upS;
        C15839UjP ujP = upS.A04;
        int[] iArr = {vja.A01, vja.A00};
        ujP.A0A.setColors(iArr);
        GradientDrawable gradientDrawable = ujP.A05;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(iArr);
        }
        C306386Ly r5 = upS.A05;
        r5.A0F(vja.A02);
        ujP.A08();
        User user = vja.A03;
        ujP.A0B.A00(user.Bh3());
        r5.A0M(DbW.A0h(upS.A03, user.B8Q(), 2131962825).toUpperCase(Locale.getDefault()));
        upS.setBounds(0, 0, upS.A02, upS.getIntrinsicHeight());
    }

    public final Integer A05() {
        return AnonymousClass05K.A0j;
    }

    public final Map A06() {
        C16141UpS upS = this.A00;
        C317876nz r0 = C317876nz.A1T;
        return AnonymousClass7TF.A0w(upS, C317886o0.A06(C318046oG.FUNDRAISER_THANKS, "fundraiser_sticker_thanks").A01());
    }
}
