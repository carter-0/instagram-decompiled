package X;

import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.archive.fragment.ArchiveReelRecycleBinFragment;
import java.util.Set;

/* renamed from: X.WaU  reason: case insensitive filesystem */
public final class C19482WaU implements C2813857k {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19482WaU(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onFinish() {
        if (this.A00 != 0) {
            ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment = (ArchiveReelRecycleBinFragment) this.A02;
            archiveReelRecycleBinFragment.A07.removeAll(00k.A0k((Iterable) this.A01));
            archiveReelRecycleBinFragment.A08.remove(this);
            return;
        }
        ArchiveReelFragment archiveReelFragment = (ArchiveReelFragment) this.A01;
        Set set = archiveReelFragment.A0S;
        set.getClass();
        ((Iterable) this.A02).forEach(new C73452Pcu((Object) set, 0));
        archiveReelFragment.A0T.remove(this);
        ArchiveReelFragment.A04(archiveReelFragment);
    }
}
