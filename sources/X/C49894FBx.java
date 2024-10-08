package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.FBx  reason: case insensitive filesystem */
public abstract class C49894FBx {
    public static final void A01(Activity activity, String str) {
        String A00 = AnonymousClass000.A00(4413);
        AnonymousClass7TF.A1H(activity, str);
        Object A0e = DbZ.A0e(activity.getApplicationContext());
        0qQ.A0C(A0e, AnonymousClass000.A00(85));
        ((ClipboardManager) A0e).setPrimaryClip(ClipData.newPlainText(A00, str));
        if (C59689JTv.A01(activity, (String) null, 2131953125, 0) == null) {
            C59689JTv.A07(activity, 2131953126);
        }
    }

    public static final void A00(Activity activity, EffectAttribution effectAttribution, UserSession userSession) {
        DbY.A1S(userSession, activity);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("ar_effect_licensing", effectAttribution);
        DbU.A1D(A0a, userSession);
        DbU.A0w(activity, A0a, userSession, TransparentModalActivity.class, AnonymousClass000.A00(281));
    }

    public static final void A02(Context context, Integer num, String str) {
        StringBuilder A0n;
        int intValue;
        AnonymousClass7TG.A1N(context, str);
        Intent A09 = DbS.A09();
        A09.setAction("android.intent.action.SEND");
        String A00 = C66579MXk.A00(328);
        if (num == null || !((intValue = num.intValue()) == 10 || intValue == 9)) {
            A0n = AnonymousClass7TF.A0n(A00);
        } else {
            A0n = AnonymousClass7TF.A0n(A00);
            A0n.append(str);
            str = "/?src=vc";
        }
        A09.putExtra("android.intent.extra.TEXT", AnonymousClass7TF.A0l(str, A0n));
        A09.setType("text/plain");
        0kR.A0D(context, Intent.createChooser(A09, (CharSequence) null));
    }
}
