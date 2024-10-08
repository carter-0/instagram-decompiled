package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.archive.fragment.ArchiveReelFragment;

/* renamed from: X.Wdw  reason: case insensitive filesystem */
public final class C19694Wdw implements C322776wO {
    public final int A00;
    public final Object A01;

    public C19694Wdw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DBx() {
    }

    public final void DBy() {
        C309516Yo r2;
        Fragment fragment;
        switch (this.A00) {
            case 0:
                ((ArchiveReelFragment) this.A01).A03.A02();
                return;
            case 1:
                ArchiveReelFragment archiveReelFragment = (ArchiveReelFragment) this.A01;
                r2 = new C309516Yo(archiveReelFragment.requireActivity(), archiveReelFragment.A04);
                fragment = C250563lf.A0D();
                break;
            case 2:
                C15397Uc0 uc0 = (C15397Uc0) this.A01;
                FragmentActivity activity = uc0.getActivity();
                if (activity != null) {
                    r2 = new C309516Yo(activity, uc0.A03);
                    fragment = Eq6.A00(C21251XQw.TAGS_AND_MENTIONS, (String) null);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r2.A0E(fragment);
        r2.A04();
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }
}
