package X;

import com.instagram.archive.fragment.ArchiveReelHighlightsFragment;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Wb5  reason: case insensitive filesystem */
public final class C19519Wb5 implements C230242pG {
    public final /* synthetic */ ArchiveReelHighlightsFragment A00;

    public final void CLl(String str) {
    }

    public final void D0J(Reel reel) {
    }

    public final void DIR() {
    }

    public final /* synthetic */ void DR6() {
    }

    public final void DU2() {
    }

    public final void DVw() {
    }

    public final void DcY(C62539KhV khV, String str) {
    }

    public final /* synthetic */ void DcZ(Reel reel, AnonymousClass3BN r2, int i) {
    }

    public final void Dca(C249703kE r8, AnonymousClass3O9 r9, Integer num, String str, String str2, List list, int i, boolean z) {
        AnonymousClass32A r0;
        AnonymousClass6VJ r1;
        0qQ.A0B(str, 0);
        ArchiveReelHighlightsFragment archiveReelHighlightsFragment = this.A00;
        AnonymousClass32A r02 = archiveReelHighlightsFragment.A01;
        if (!(r02 == null || (r1 = r02.A07) == null)) {
            r1.A05(AnonymousClass05K.A15);
        }
        C19381WWx wWx = archiveReelHighlightsFragment.A00;
        if (wWx == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        List<C19269WSc> list2 = wWx.A0A;
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        for (C19269WSc wSc : list2) {
            A0r.add(wSc.A01);
        }
        Reel A0S = C13991Tnr.A0S(str, archiveReelHighlightsFragment.A05);
        if (A0S != null && (r0 = archiveReelHighlightsFragment.A01) != null) {
            r0.A05(A0S, AnonymousClass3BQ.HIGHLIGHTS_ARCHIVE_GRID_SUBTAB, (AnonymousClass3N3) null, A0r, A0r, A0r);
        }
    }

    public final /* synthetic */ void Dcb(C249703kE r1, AnonymousClass3O9 r2, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    public final void Dcd(Reel reel, AnonymousClass3BN r2, Integer num, int i) {
    }

    public final void Dcf(List list, int i, String str) {
        0qQ.A0B(str, 0);
        ArchiveReelHighlightsFragment archiveReelHighlightsFragment = this.A00;
        AnonymousClass0eM r1 = archiveReelHighlightsFragment.A05;
        Reel A0S = C13991Tnr.A0S(str, r1);
        if (A0S != null && A0S.A0W != null) {
            new W2M(archiveReelHighlightsFragment.requireActivity(), archiveReelHighlightsFragment, archiveReelHighlightsFragment, AnonymousClass7TE.A0l(r1), A0S).A04(new C19146WNc(archiveReelHighlightsFragment, str), AnonymousClass05K.A0C);
        }
    }

    public final void Dci(String str) {
    }

    public final void Du3(int i) {
    }

    public final void E0D(C249703kE r1, Reel reel, Integer num, String str, String str2, List list) {
    }

    public C19519Wb5(ArchiveReelHighlightsFragment archiveReelHighlightsFragment) {
        this.A00 = archiveReelHighlightsFragment;
    }

    public final /* synthetic */ int C8o() {
        return 0;
    }
}
