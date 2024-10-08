package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;

/* renamed from: X.LjB  reason: case insensitive filesystem */
public final class C64849LjB implements MTS {
    public final /* synthetic */ MusicOverlayStickerModel A00;
    public final /* synthetic */ C63792L6y A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C64849LjB(MusicOverlayStickerModel musicOverlayStickerModel, C63792L6y l6y, String str, String str2) {
        this.A01 = l6y;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = musicOverlayStickerModel;
    }

    public final void onFailure(Exception exc) {
        C59689JTv.A0C(this.A01.A00, AnonymousClass000.A00(276));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        C63792L6y l6y = this.A01;
        UserSession userSession = l6y.A02;
        C22031Xty.A0J(l6y.A01, userSession, userSession.A06, AnonymousClass000.A00(1713), AnonymousClass000.A00(1077), "");
        String canonicalPath = file.getCanonicalPath();
        String str = this.A02;
        String str2 = this.A03;
        MusicOverlayStickerModel musicOverlayStickerModel = this.A00;
        Bundle A0B = DbV.A0B(canonicalPath, 0);
        A0B.putString(AnonymousClass000.A00(2475), canonicalPath);
        A0B.putString(AnonymousClass000.A00(2476), str);
        A0B.putString(AnonymousClass000.A00(2478), str2);
        A0B.putParcelable(AnonymousClass000.A00(2477), musicOverlayStickerModel);
        DbU.A0x(l6y.A00, A0B, userSession, TransparentModalActivity.class, C273654mx.A00(3235));
    }
}
