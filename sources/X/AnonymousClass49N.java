package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.49N  reason: invalid class name */
public final class AnonymousClass49N extends AnonymousClass49O {
    public int A00;
    public final RecyclerView A01;
    public final C2366034j A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass49N(RecyclerView recyclerView, AnonymousClass0iw r3, UserSession userSession, AnonymousClass49M r5, String str) {
        super(r3, userSession);
        0qQ.A0B(r3, 4);
        this.A01 = recyclerView;
        this.A03 = str;
        this.A02 = recyclerView.A0A;
        recyclerView.A15(new AnonymousClass4C7(this, r5));
    }

    public static final void A00(AnonymousClass49N r6, AnonymousClass49M r7) {
        int i;
        int itemCount;
        RecyclerView recyclerView = r6.A01;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
        int i2 = -1;
        if (linearLayoutManager != null) {
            i = linearLayoutManager.A1a() - 4;
        } else {
            i = -1;
        }
        int max = Math.max(0, i);
        2Rw r0 = recyclerView.A0A;
        if (r0 == null) {
            itemCount = -1;
        } else {
            itemCount = r0.getItemCount() - 1;
        }
        if (linearLayoutManager != null) {
            i2 = linearLayoutManager.A1b() + 4;
        }
        int min = Math.min(itemCount, i2);
        C2366034j r5 = r6.A02;
        if (r5 != null) {
            String str = r6.A03;
            if (max >= 0 && max <= min) {
                2HY r02 = new 2HY(max, min);
                ArrayList arrayList = new ArrayList();
                0sh it = r02.iterator();
                while (it.hasNext()) {
                    Object Bkf = r5.Bkf(it.A00());
                    if ((Bkf instanceof Reel) && Bkf != null) {
                        arrayList.add(Bkf);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Reel reel = (Reel) next;
                        if (!reel.A0z(r6.A02) && !reel.A1P) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        String id = ((Reel) it3.next()).getId();
                        0qQ.A07(id);
                        Set set = r6.A05;
                        if (!set.contains(id) && !r6.A04.contains(id)) {
                            set.add(id);
                            r6.A06.push(id);
                        }
                    }
                    AnonymousClass49O.A01(r6, r7, str);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
