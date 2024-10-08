package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.Vwm  reason: case insensitive filesystem */
public abstract class C18688Vwm {
    public static void A01(Activity activity, 28D r10, UserSession userSession, C3499082j r12) {
        C3499082j r4 = r12;
        String str = r12.A04;
        if (str == null) {
            str = "";
        }
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(str, 50, 50);
        String A01 = 2RR.A01();
        Activity activity2 = activity;
        int color = activity.getColor(R.color.grey_9);
        LTL.A04(activity2, extendedImageUrl, new FZC(1, r10, activity2, r4, userSession), A01, color, false);
    }

    public static void A00(Activity activity, 28D r6, UserSession userSession) {
        Bundle bundle = new Bundle();
        AnonymousClass87G r3 = new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, AnonymousClass87I.FUNDRAISER, (String) null));
        try {
            bundle.putString(AnonymousClass000.A00(574), D0Y.A00(r3));
            C13992Tns.A0Z(bundle, r6);
            Dba.A0l(activity, bundle, userSession, "attribution_quick_camera_fragment");
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(C273654mx.A00(216));
            AnonymousClass87I r0 = r3.A04;
            if (r0 == null) {
                r0 = AnonymousClass87I.EMPTY;
            }
            0wb.A06(C273654mx.A00(389), AnonymousClass7TF.A0i(r0, sb), e);
        }
    }

    public static void A02(Context context, 28D r7, UserSession userSession, C19475WaN waN, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(AnonymousClass000.A00(118), r7);
        bundle.putBoolean("ReelFundraiserShareConstants.ARGUMENTS_KEY_IS_DUPLICATE_STICKER", z);
        try {
            AnonymousClass8YF r3 = waN.A00;
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            AB9.A00(A0A, r3, true);
            A0A.close();
            bundle.putString("ReelFundraiserShareConstants.ARGUMENTS_KEY_FUNDRAISER_MODEL", stringWriter.toString());
            AnonymousClass6W8.A02((Activity) context, bundle, userSession, TransparentModalActivity.class, C273654mx.A00(3241)).A0C(context);
        } catch (IOException unused) {
            0wb.A03(AnonymousClass000.A00(1011), "Could not json serialize model User for the fundraiser duplicate sticker.");
        }
    }
}
