package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.PXU  reason: case insensitive filesystem */
public final class C73135PXU implements Runnable {
    public final /* synthetic */ C69106Nel A00;

    public C73135PXU(C69106Nel nel) {
        this.A00 = nel;
    }

    public final void run() {
        Bitmap bitmap;
        C69106Nel nel = this.A00;
        ((Dialog) nel.A0L.getValue()).hide();
        UserSession userSession = nel.A0B;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36310327830315026L)) {
            String str = nel.A06;
            if (str != null && (bitmap = nel.A02) != null) {
                Context context = nel.A0A;
                1ES.A05(new C290815g0(new MB2(context, bitmap, (Bitmap) null, new C72290Ozz(nel, str), false, false), 473), 1601186431, 1, true, false);
                nel.A0D.A05(new PNZ(AnonymousClass7TE.A16(context, 2131969428), AnonymousClass7TE.A16(context, 2131952148), new C58694Iw3(str, nel, 11)));
            }
        } else if (182.A06(r2, userSession, 2342153337044336661L)) {
            String str2 = nel.A06;
            if (str2 != null) {
                nel.A0D.A03(new C72823PLl(userSession, nel.A09, str2));
                nel.A0F.A00.A00(new C72772PJm(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING));
            }
        } else {
            Bitmap bitmap2 = nel.A02;
            0qQ.A0A(bitmap2);
            nel.A0J(new N9U(bitmap2, AnonymousClass05K.A00, false, true));
        }
    }
}
