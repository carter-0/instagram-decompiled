package X;

import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;

/* renamed from: X.GPb  reason: case insensitive filesystem */
public final class C52356GPb extends 0ng {
    public final /* synthetic */ AudioPageAssetModel A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ GLN A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52356GPb(AudioPageAssetModel audioPageAssetModel, UserSession userSession, GLN gln, String str, String str2) {
        super(607231408, 5, true, false);
        this.A02 = gln;
        this.A04 = str;
        this.A00 = audioPageAssetModel;
        this.A01 = userSession;
        this.A03 = str2;
    }

    public final void run() {
        GLN.A00(this.A00, this.A01, this.A02, this.A04, this.A03);
    }
}
