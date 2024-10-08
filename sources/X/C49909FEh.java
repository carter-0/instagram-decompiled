package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;

/* renamed from: X.FEh  reason: case insensitive filesystem */
public final class C49909FEh {
    public static final C49909FEh A00 = new Object();

    public static final void A00(Context context, String str) {
        AnonymousClass7TF.A0D().postDelayed(new C51352Fsk(context, str), 500);
    }

    public final void A01(Activity activity, SpannableStringBuilder spannableStringBuilder) {
        if (C71172bH.A00() == null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("destination_id", "mainfeed");
            FHB.A03(activity, A0a);
        }
        AnonymousClass7TF.A0D().postDelayed(new C51351Fsj(activity, spannableStringBuilder), 500);
    }
}
