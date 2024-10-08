package X;

import androidx.fragment.app.Fragment;
import com.instagram.model.reels.Reel;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PId  reason: case insensitive filesystem */
public final class C72746PId implements C46202DQe {
    public final int A00;
    public final Object A01;

    public C72746PId(HighlightsMigrationFragment highlightsMigrationFragment, int i) {
        this.A00 = i;
        this.A01 = highlightsMigrationFragment;
    }

    public final void Doh(List list) {
        List<C47173Dro> A002;
        if (this.A00 != 0) {
            if (list != null) {
                HighlightsMigrationFragment highlightsMigrationFragment = (HighlightsMigrationFragment) this.A01;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Reel A0M = 1OP.A05(AnonymousClass7TE.A0l(highlightsMigrationFragment.A0C)).A0M(((C47173Dro) it.next()).A02);
                    if (A0M != null) {
                        HighlightsMigrationFragment.A00(A0M, highlightsMigrationFragment, 0, false);
                    }
                }
            }
            DbX.A1J((Fragment) this.A01);
        } else if (list != null && (A002 = C73429PcU.A00(list, 38)) != null) {
            HighlightsMigrationFragment highlightsMigrationFragment2 = (HighlightsMigrationFragment) this.A01;
            for (C47173Dro dro : A002) {
                Reel A0M2 = 1OP.A05(AnonymousClass7TE.A0l(highlightsMigrationFragment2.A0C)).A0M(dro.A02);
                if (A0M2 != null) {
                    if (dro.A03) {
                        HighlightsMigrationFragment.A00(A0M2, highlightsMigrationFragment2, dro.A01, true);
                    } else {
                        HighlightsMigrationFragment.A00(A0M2, highlightsMigrationFragment2, 0, false);
                    }
                }
            }
        }
    }
}
