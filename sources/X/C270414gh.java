package X;

import android.database.DataSetObserver;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.4gh  reason: invalid class name and case insensitive filesystem */
public interface C270414gh extends C270424gi {
    C255773uh B69(C250973mM r1);

    C309426Yf Bz3(C255773uh r1);

    void Cs4();

    C250973mM EET(int i);

    void Ei7(List list);

    void EzG(Reel reel, C250973mM r2);

    int getCount();

    Object getItem(int i);

    boolean isEmpty();

    void notifyDataSetChanged();

    void registerDataSetObserver(DataSetObserver dataSetObserver);

    void unregisterDataSetObserver(DataSetObserver dataSetObserver);
}
