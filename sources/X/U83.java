package X;

import androidx.fragment.app.Fragment;
import java.util.List;

public final class U83 extends 0hp {
    public final List A00;

    public U83(0hq r2, List list) {
        super(r2, 1);
        this.A00 = list;
    }

    public final Fragment A01(int i) {
        return (Fragment) ((0eP) this.A00.get(i)).A01;
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final CharSequence getPageTitle(int i) {
        return (CharSequence) ((0eP) this.A00.get(i)).A00;
    }
}
