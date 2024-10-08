package X;

import com.instagram.archive.fragment.ArchiveReelFragment;
import java.util.ArrayList;

/* renamed from: X.Wof  reason: case insensitive filesystem */
public final /* synthetic */ class C20290Wof implements Runnable {
    public final /* synthetic */ ArchiveReelFragment A00;
    public final /* synthetic */ ArrayList A01;
    public final /* synthetic */ ArrayList A02;

    public /* synthetic */ C20290Wof(ArchiveReelFragment archiveReelFragment, ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = archiveReelFragment;
        this.A01 = arrayList;
        this.A02 = arrayList2;
    }

    public final void run() {
        ArchiveReelFragment archiveReelFragment = this.A00;
        LSf.A02(archiveReelFragment.requireActivity(), archiveReelFragment, archiveReelFragment.A04, AnonymousClass000.A00(1770), AnonymousClass000.A00(1096), this.A01, this.A02);
        archiveReelFragment.A09 = null;
    }
}
