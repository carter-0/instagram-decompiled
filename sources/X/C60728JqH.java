package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.JqH  reason: case insensitive filesystem */
public final class C60728JqH extends C14191TrW {
    public final List A00;
    public final 0sP A01;

    public final Fragment A03(int i) {
        return (Fragment) this.A01.invoke(this.A00.get(i));
    }

    public C60728JqH(Fragment fragment, List list, 0sP r3) {
        super(fragment);
        this.A00 = list;
        this.A01 = r3;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1131680914);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1311340129, A03);
        return size;
    }
}
