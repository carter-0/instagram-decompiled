package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.Iterator;

/* renamed from: X.6ZX  reason: invalid class name */
public final class AnonymousClass6ZX implements 1wn {
    public final /* synthetic */ AnonymousClass6ZO A00;

    public AnonymousClass6ZX(AnonymousClass6ZO r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(319229903);
        AnonymousClass3PD r9 = (AnonymousClass3PD) obj;
        int A032 = AnonymousClass0fD.A03(-96285349);
        0qQ.A0B(r9, 0);
        C273384mU r6 = this.A00.A06;
        Reel reel = r9.A00;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r6;
        if (reel.A0P == ReelType.A0W && reelViewerFragment.mViewPager != null) {
            Iterator it = ((C310566bG) reelViewerFragment.A1E).A0B.A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C250973mM r2 = (C250973mM) it.next();
                String id = r2.A0H.getId();
                0qQ.A07(id);
                if (id.equals(reel.getId())) {
                    reelViewerFragment.A1E.EzG(reel, r2);
                    reelViewerFragment.FK0(-1);
                    reelViewerFragment.A1E.notifyDataSetChanged();
                    break;
                }
            }
        }
        AnonymousClass0fD.A0A(-842851175, A032);
        AnonymousClass0fD.A0A(-1386287308, A03);
    }
}
