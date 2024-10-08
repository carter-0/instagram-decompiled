package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.ADj  reason: case insensitive filesystem */
public final class C39887ADj {
    public static final LruCache A04 = new LruCache(5);
    public C357938a6 A00;
    public String A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;

    public final void A00(C357938a6 r5, MusicAssetModel musicAssetModel) {
        Integer num;
        this.A01 = null;
        this.A00 = r5;
        UserSession userSession = this.A03;
        if (!AnonymousClass30D.A06(userSession)) {
            num = AnonymousClass05K.A00;
        } else if (!musicAssetModel.A0O) {
            num = AnonymousClass05K.A01;
        } else {
            AnonymousClass9SE r1 = (AnonymousClass9SE) A04.get(musicAssetModel.A0E);
            if (r1 != null) {
                C357938a6 r0 = this.A00;
                if (r0 != null) {
                    r0.DPU(r1);
                    this.A00 = null;
                    return;
                }
                return;
            }
            String str = musicAssetModel.A0E;
            this.A01 = str;
            0qQ.A07(str);
            String str2 = musicAssetModel.A0B;
            0qQ.A07(str2);
            1OC A002 = AnonymousClass9SP.A00(userSession, str, str2);
            A002.A00 = new NM2(str, this, 3);
            this.A02.schedule(A002);
            return;
        }
        C357938a6 r02 = this.A00;
        if (r02 != null) {
            r02.DPT(num);
            this.A00 = null;
        }
    }

    public C39887ADj(AnonymousClass4DH r1, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = r1;
    }
}
