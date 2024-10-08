package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.9r7  reason: invalid class name and case insensitive filesystem */
public final class C390339r7 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelSupportPersonalizedAdsStickerShareFragment";
    public 28D A00;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        RectF A04 = AnonymousClass7TH.A04(this);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80I r1 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        AnonymousClass80D.A09(userSession, r1, A002, this);
        A002.A09 = viewGroup;
        A002.A0B = this.A00;
        AnonymousClass80D.A03(A04, this, A002);
        AnonymousClass80D.A0A(A002);
        A002.A0D = new BBV((String) null, 10);
        return A002;
    }

    public final String getModuleName() {
        return C273654mx.A00(3245);
    }

    public final void onCreate(Bundle bundle) {
        28D r0;
        int A02 = AnonymousClass0fD.A02(-1569284477);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            if (bundle2.get("ReelSupportPersonalizedAdsStickerShareConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT") instanceof 28D) {
                r0 = (28D) bundle2.get("ReelSupportPersonalizedAdsStickerShareConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT");
            } else {
                r0 = 28D.A5J;
            }
            this.A00 = r0;
            AnonymousClass0fD.A09(1567024605, A02);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(287520477, A02);
        throw A0y;
    }
}
