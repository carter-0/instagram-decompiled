package X;

import com.instagram.save.model.SavedCollection;
import java.util.List;

public final /* synthetic */ class IXO implements JOW {
    public final /* synthetic */ H15 A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ IXO(H15 h15, Runnable runnable, List list) {
        this.A00 = h15;
        this.A02 = list;
        this.A01 = runnable;
    }

    public final void Coi(SavedCollection savedCollection) {
        H15 h15 = this.A00;
        List list = this.A02;
        Runnable runnable = this.A01;
        h15.A0G.A03(new I90(7, (Object) savedCollection, (Object) list, (Object) runnable, (Object) h15), savedCollection.A0G, list.size());
    }
}
