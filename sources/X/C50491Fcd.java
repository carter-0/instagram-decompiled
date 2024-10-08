package X;

import android.content.Context;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fcd  reason: case insensitive filesystem */
public final class C50491Fcd implements C367608rH {
    public final /* synthetic */ 28D A00;
    public final /* synthetic */ ACRType A01;
    public final /* synthetic */ C355148Ov A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ AnonymousClass6Z5 A04;

    public C50491Fcd(28D r1, ACRType aCRType, C355148Ov r3, C255773uh r4, AnonymousClass6Z5 r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = aCRType;
    }

    public final void onClick() {
        Context context;
        AnonymousClass6Z5 r11 = this.A04;
        C255773uh r10 = this.A03;
        C355148Ov r2 = this.A02;
        int i = 3;
        if (r10.A1J()) {
            i = 108;
        }
        28D r6 = this.A00;
        ACRType aCRType = this.A01;
        AnonymousClass4DH r8 = (AnonymousClass4DH) r11.A1A.get();
        if (r8 != null && (context = r8.getContext()) != null) {
            UserSession userSession = r11.A09;
            if (userSession != null) {
                AnonymousClass8ZP A002 = AnonymousClass8ZO.A00(userSession);
                0qQ.A0B(r6, 0);
                1QP r14 = A002.A02;
                long flowStartForMarker = r14.flowStartForMarker(246623994, AnonymousClass000.A00(2676), false);
                A002.A00 = flowStartForMarker;
                r14.flowAnnotate(flowStartForMarker, "camera_entry_point", r6.A00);
                r2.dismiss();
                r11.A17.EHY("story_feed_creation_loading");
                UserSession userSession2 = r11.A09;
                if (userSession2 != null) {
                    Reel A0M = ReelStore.A03(userSession2).A0M(r10.A0k);
                    if (A0M != null) {
                        UserSession userSession3 = r11.A09;
                        if (userSession3 != null) {
                            List<C255773uh> A0O = A0M.A0O(userSession3);
                            if (A0O != null) {
                                ArrayList A1C = AnonymousClass7TE.A1C();
                                for (C255773uh r0 : A0O) {
                                    1Xj r02 = r0.A0b;
                                    if (r02 != null) {
                                        A1C.add(r02);
                                    }
                                }
                                List A0a = 00k.A0a(A1C);
                                ArrayList A1C2 = AnonymousClass7TE.A1C();
                                for (Object next : A0a) {
                                    if (((1Xj) next).A1t() == AnonymousClass3QO.DEFAULT) {
                                        A1C2.add(next);
                                    }
                                }
                                List A0d = 00k.A0d(A1C2, 10);
                                if (A0d != null) {
                                    FCO.A02(context, new C50904Fkj(context, r6, aCRType, r8, A002, r10, r11, A0d, i), A0d);
                                    return;
                                }
                            }
                        }
                    }
                    AnonymousClass6Z5.A01(context, A002, r11, "NavigateToFeedCreationWithReelItem_NullMediaList");
                    return;
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
