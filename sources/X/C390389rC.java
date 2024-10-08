package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.9rC  reason: invalid class name and case insensitive filesystem */
public final class C390389rC extends C15291UZw {
    public static final String __redex_internal_original_name = "MapLocationStickerFragment";
    public 28D A00;
    public String A01;
    public final C41837B2s A02 = new WUP(this, 14);

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        String str;
        0qQ.A0B(viewGroup, 0);
        RectF A04 = AnonymousClass7TH.A04(this);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0D(A002, this.A02, this);
        AnonymousClass80I r1 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        AnonymousClass80D.A09(userSession, r1, A002, this);
        A002.A09 = viewGroup;
        28D r0 = this.A00;
        if (r0 == null) {
            str = "cameraEntryPoint";
        } else {
            A002.A0B = r0;
            AnonymousClass80D.A03(A04, this, A002);
            AnonymousClass80D.A0A(A002);
            String str2 = this.A01;
            if (str2 == null) {
                str = "stickerId";
            } else {
                A002.A2p = str2;
                A002.A0A = AnonymousClass57C.MAP_LOCATION_STICKER;
                AnonymousClass80D.A0B(A002);
                return A002;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "map_location_sticker_fragment";
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-873505384);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = AnonymousClass7TH.A07(bundle2, "MapLocationStickerShareConstants.ARGUMENTS_KEY_ENTRY_POINT");
            String string = bundle2.getString("MapLocationStickerShareConstants.ARGUMENTS_STICKER_ID");
            if (string != null) {
                this.A01 = string;
                AnonymousClass0fD.A09(-337169930, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -661680125;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -176763526;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
