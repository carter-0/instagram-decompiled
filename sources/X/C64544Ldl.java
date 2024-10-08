package X;

import com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ldl  reason: case insensitive filesystem */
public final class C64544Ldl implements B2W {
    public final /* synthetic */ ClipsNetworkImportDraftRepository A00;
    public final /* synthetic */ AnonymousClass55Q A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C62320sa A03;

    public final /* synthetic */ void Dlo(List list) {
    }

    public C64544Ldl(ClipsNetworkImportDraftRepository clipsNetworkImportDraftRepository, AnonymousClass55Q r2, String str, C62320sa r4) {
        this.A00 = clipsNetworkImportDraftRepository;
        this.A02 = str;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void onFailure() {
        this.A03.invoke();
    }

    public final void onSuccess() {
        AnonymousClass80P A06;
        27r A012 = 27p.A01(this.A00.A03);
        String str = this.A02;
        Long l = this.A01.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!(l == null || (A06 = 2AL.A06(l)) == null)) {
            0bb r2 = new 0bb();
            r2.A01(A06, "tool");
            r2.A05("segment_index", C51971G9r.A0m());
            A1C.add(r2);
        }
        27r.A0D(A012, str, A1C, false);
        this.A03.invoke();
    }
}
