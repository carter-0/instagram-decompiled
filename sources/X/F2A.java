package X;

import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.api.schemas.StoryUnlockableStickerData;
import com.instagram.api.schemas.UnlockableStickerStatus;
import com.instagram.common.session.UserSession;

public final class F2A {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass6Z5 A01;

    public F2A(AnonymousClass4DH r1, AnonymousClass6Z5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(StoryUnlockableStickerData storyUnlockableStickerData) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(387), storyUnlockableStickerData.getId());
        A0a.putSerializable(AnonymousClass000.A00(388), C48081EUz.DEFAULT);
        AnonymousClass4DH r3 = this.A00;
        AnonymousClass6Z5 r5 = this.A01;
        C273434mZ r2 = r5.A16;
        UserSession userSession = r5.A09;
        if (userSession != null) {
            C49263Es6.A00((RectF) null, A0a, r3, userSession, r2);
            String id = storyUnlockableStickerData.getId();
            if (id != null) {
                UserSession userSession2 = r5.A09;
                if (userSession2 != null) {
                    Object obj = C50333FYo.A00(userSession2).A00.get(id);
                    if (obj == null) {
                        obj = UnlockableStickerStatus.LOCKED;
                    }
                    UnlockableStickerStatus unlockableStickerStatus = UnlockableStickerStatus.UNLOCKED;
                    if (obj != unlockableStickerStatus) {
                        UserSession userSession3 = r5.A09;
                        if (userSession3 != null) {
                            C50333FYo.A00(userSession3).A00.put(id, unlockableStickerStatus);
                            UserSession userSession4 = r5.A09;
                            if (userSession4 != null) {
                                C379669Uv.A01(new EB6(1), userSession4, id);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }
}
