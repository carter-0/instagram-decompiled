package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.GjV  reason: case insensitive filesystem */
public final class C53159GjV extends C14191TrW {
    public final 01s A00 = new 01s(10);
    public final List A01;

    public final Fragment A03(int i) {
        Fragment h1m;
        01s r2 = this.A00;
        Fragment fragment = (Fragment) AnonymousClass01t.A00(r2, i);
        if (fragment == null) {
            int ordinal = ((C54694HOz) this.A01.get(i)).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    h1m = new H1M();
                } else if (ordinal == 2) {
                    h1m = new H07();
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                fragment = h1m;
            } else {
                fragment = new H18();
            }
            r2.A07(i, fragment);
        }
        return fragment;
    }

    public C53159GjV(Fragment fragment, List list) {
        super(fragment);
        this.A01 = list;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-2028192120);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-1284834179, A03);
        return size;
    }
}
