package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.9rG  reason: invalid class name and case insensitive filesystem */
public final class C390429rG extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelHashtagStickerShareFragment";
    public float A00;
    public 28D A01;
    public PendingRecipient A02;
    public String A03;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        AnonymousClass80E r0;
        String str;
        0qQ.A0B(viewGroup, 0);
        getContext();
        float A09 = (float) 0nA.A09(requireContext());
        float A08 = (float) 0nA.A08(requireContext());
        RectF A0C = AnonymousClass7TF.A0C(A09, A08);
        RectF rectF = new RectF(0.0f, 0.0f, A09, A08);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0C(A002, this.A03, this);
        AnonymousClass80I r1 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        AnonymousClass80D.A09(userSession, r1, A002, this);
        A002.A09 = viewGroup;
        28D r12 = this.A01;
        C387359m5 r02 = null;
        if (r12 == null) {
            str = "cameraEntryPoint";
        } else {
            AnonymousClass80D.A07(r12, this, A002);
            AnonymousClass80D.A01(A0C, rectF, A002);
            A002.A3g = true;
            AnonymousClass80D.A0B(A002);
            Context context = getContext();
            if (context != null) {
                int A012 = AnonymousClass8XF.A01(context);
                String str2 = this.A03;
                if (str2 == null) {
                    str = "hashtagStickerText";
                } else {
                    r02 = new C387359m5(str2, A012, this.A00);
                }
            }
            A002.A0Y = r02;
            A002.A3Q = true;
            PendingRecipient pendingRecipient = this.A02;
            if (pendingRecipient != null) {
                A002.A1S = pendingRecipient;
                r0 = AnonymousClass80E.GROUP_PROFILE;
            } else {
                r0 = AnonymousClass80E.ALL;
            }
            A002.A0y = r0;
            return A002;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "reel_hashtag_sticker_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1397812774);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = C320236s2.A01(requireArguments, AnonymousClass000.A00(2437));
        this.A00 = requireArguments.getFloat(AnonymousClass000.A00(2438));
        Object obj = requireArguments.get(AnonymousClass000.A00(2436));
        if (obj != null) {
            this.A01 = (28D) obj;
            this.A02 = (PendingRecipient) requireArguments.getParcelable(AnonymousClass000.A00(2439));
            AnonymousClass0fD.A09(1393725181, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1550541132, A022);
        throw A0y;
    }
}
