package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.8IA  reason: invalid class name */
public final class AnonymousClass8IA extends 2YL {
    public final UserSession A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;

    public AnonymousClass8IA(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        02z A012 = 106.A01(AnonymousClass8IB.A00);
        this.A01 = A012;
        this.A02 = A012;
    }

    public final void A00() {
        String str;
        MusicAssetModel musicAssetModel;
        AnonymousClass8IC r2 = (AnonymousClass8IC) this.A01.getValue();
        if (r2 instanceof C381949cq) {
            1Av A002 = 1Au.A00(this.A00);
            MusicAttributionConfig musicAttributionConfig = ((C381949cq) r2).A01;
            if (musicAttributionConfig == null || (musicAssetModel = musicAttributionConfig.A02) == null) {
                str = null;
            } else {
                str = musicAssetModel.A0E;
            }
            0xY AR4 = A002.A01.AR4();
            AR4.E5g(AnonymousClass000.A00(3491), str);
            AR4.apply();
        }
    }
}
