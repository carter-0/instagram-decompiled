package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6a8  reason: invalid class name */
public final class AnonymousClass6a8 implements C233782wS {
    public final /* synthetic */ ReelViewerFragment A00;

    public final void D1r() {
    }

    public AnonymousClass6a8(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void Dwr(Collection collection, int i) {
        int i2;
        int i3;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C250973mM r1 = (C250973mM) it.next();
            ReelViewerFragment reelViewerFragment = this.A00;
            CallerContext callerContext = ReelViewerFragment.A3S;
            if (reelViewerFragment.A2K || r1.A0H.CcK()) {
                AnonymousClass3BV A002 = AnonymousClass3BV.A00(reelViewerFragment.getSession());
                Reel reel = r1.A0H;
                String id = reel.getId();
                0qQ.A07(id);
                if (r1.A0L) {
                    i2 = 0;
                } else {
                    i2 = r1.A00;
                }
                String moduleName = reelViewerFragment.getModuleName();
                AnonymousClass3PJ r7 = new AnonymousClass3PJ(AnonymousClass3BU.AD, id, 3, i2, -1);
                ArrayList arrayList = new ArrayList();
                arrayList.add(r7);
                A002.A0B((C2813857k) null, moduleName, (String) null, arrayList, false);
                C250973mM r12 = reelViewerFragment.A0a;
                if (r12 != null) {
                    i3 = reelViewerFragment.A1E.CMI(r12);
                } else {
                    i3 = -1;
                }
                int i4 = reelViewerFragment.A05;
                int i5 = i;
                if (i5 == -1) {
                    i5 = i4;
                }
                AnonymousClass6UP r2 = new AnonymousClass6UP(i3, i4, i5);
                C309986aF r0 = reelViewerFragment.A0o;
                String id2 = reel.getId();
                0qQ.A07(id2);
                r0.A05.put(id2, r2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void D6A(Object obj, List list, int i) {
    }
}
