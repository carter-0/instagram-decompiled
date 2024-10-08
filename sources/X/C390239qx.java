package X;

import android.graphics.RectF;
import android.view.ViewGroup;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.9qx  reason: invalid class name and case insensitive filesystem */
public final class C390239qx extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelUserPaySubscribeStickerCameraFragment";

    /* JADX WARNING: type inference failed for: r0v11, types: [X.Aee, java.lang.Object] */
    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        float A09 = (float) 0nA.A09(requireContext());
        float A08 = (float) 0nA.A08(requireContext());
        RectF A0C = AnonymousClass7TF.A0C(A09, A08);
        RectF rectF = new RectF(0.0f, 0.0f, A09, A08);
        WUP wup = new WUP(this, 28);
        AnonymousClass80D A00 = AnonymousClass80D.A00();
        AnonymousClass80D.A0C(A00, wup, this);
        AnonymousClass80I r2 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        AnonymousClass80D.A09(userSession, r2, A00, this);
        A00.A09 = viewGroup;
        AnonymousClass80D.A07(28D.A5P, this, A00);
        AnonymousClass80D.A01(A0C, rectF, A00);
        AnonymousClass80D.A0A(A00);
        A00.A3Q = true;
        SubscriptionStickerDict subscriptionStickerDict = new SubscriptionStickerDict(AnonymousClass7TF.A0Q(AnonymousClass7TE.A0k(this)), (String) null, (String) null, (String) null);
        ? obj = new Object();
        obj.A00 = subscriptionStickerDict;
        A00.A1n = obj;
        return A00;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }
}
