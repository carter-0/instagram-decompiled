package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

/* renamed from: X.9nA  reason: invalid class name and case insensitive filesystem */
public final class C388029nA extends AnonymousClass8D8 {
    public final Drawable A00;
    public final Context A01;
    public final UserSession A02;

    public C388029nA(Context context, UserSession userSession, AnonymousClass8BA r13) {
        super(r13, (AnonymousClass8BH) null, (Integer) null, 111, false, false);
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = new C346997w6(context, userSession, new MusicPickStickerModel(AnonymousClass7TE.A1I(AnonymousClass7TF.A0Q(userSession))), "music_pick_reshare_from_qp");
    }
}
