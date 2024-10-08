package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;

public final class KJH extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C66496MTz A02;
    public final /* synthetic */ C353638Im A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJH(Context context, UserSession userSession, C66496MTz mTz, C353638Im r7, String str, String str2, String str3) {
        super(91, 3, false, false);
        this.A06 = str;
        this.A03 = r7;
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = mTz;
        this.A04 = str2;
        this.A05 = str3;
    }

    public final void run() {
        C353638Im r6;
        C66496MTz mTz;
        int i;
        1OC r1;
        int i2;
        String str;
        String str2 = this.A06;
        if (str2 != null) {
            r6 = this.A03;
            UserSession userSession = this.A01;
            mTz = this.A02;
            i = 0;
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0Q(CFB.class, C45657D0h.class);
            A0a.A0A("music/original_sound_audio_assets/");
            try {
                StringWriter A0v = JTO.A0v();
                17W A0e = C51970G9q.A0e(A0v);
                A0e.A0t(str2);
                A0a.A9m("original_media_ids", JTS.A0k(A0e, A0v));
            } catch (IOException e) {
                AnonymousClass7TF.A19(0wj.A01.AEf("ReelApiUtil.createOriginalSoundRequestTask", 817902720), DialogModule.KEY_MESSAGE, "IOException", e);
            }
            r1 = A0a.A0M();
            i2 = 10;
        } else {
            String str3 = this.A04;
            if (str3 == null || (str = this.A05) == null) {
                this.A02.DAH();
                return;
            }
            r6 = this.A03;
            UserSession userSession2 = this.A01;
            mTz = this.A02;
            i = 0;
            1NY A0a2 = AnonymousClass7TG.A0a(userSession2);
            A0a2.A0Q(K1D.class, LJN.class);
            A0a2.A0A("music/audio_assets/");
            try {
                StringWriter A0v2 = JTO.A0v();
                15p r12 = AnonymousClass15o.A00;
                17W A0A = r12.A0A(A0v2);
                A0A.A0b();
                A0A.A0t(str3);
                A0a2.A9m("audio_asset_ids", JTS.A0k(A0A, A0v2));
                String A002 = AnonymousClass000.A00(2670);
                StringWriter A0v3 = JTO.A0v();
                17W A0A2 = r12.A0A(A0v3);
                A0A2.A0b();
                A0A2.A0t(str);
                A0a2.A9m(A002, JTS.A0k(A0A2, A0v3));
            } catch (IOException e2) {
                0wb.A06("ReelApiUtil.createAudioAssetsRequestTask", "IOException", e2);
            }
            r1 = A0a2.A0M();
            i2 = 9;
        }
        C61499KAe.A00(r1, mTz, r6, i2);
        1ET A012 = 1ES.A01();
        0qQ.A0B(A012, i);
        A012.schedule(r1);
    }
}
