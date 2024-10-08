package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.AeJ  reason: case insensitive filesystem */
public final class C40572AeJ implements C66496MTz {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C381669c8 A01;
    public final /* synthetic */ C63946LEm A02;
    public final /* synthetic */ AnonymousClass83B A03;

    public final void DAG(MusicAssetModel musicAssetModel) {
        0qQ.A0B(musicAssetModel, 0);
        C262224Cq r0 = this.A03.A01;
        C381669c8 r2 = this.A01;
        UserSession userSession = this.A00;
        AnonymousClass7TE.A1Z(new MHF(r2, this.A02, musicAssetModel, userSession, (AnonymousClass4D7) null, 1), r0);
    }

    public C40572AeJ(UserSession userSession, C381669c8 r2, C63946LEm lEm, AnonymousClass83B r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = userSession;
        this.A02 = lEm;
    }

    public final void DAH() {
        0kD.A06("SFXAudioRepository", 002.A0g(AnonymousClass000.A00(1043), this.A01.A03, " sound effect for draft."), (Throwable) null);
    }
}
