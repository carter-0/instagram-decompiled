package X;

import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lcw  reason: case insensitive filesystem */
public final class C64495Lcw implements C317776no, C228142kr {
    public final int A00;
    public final Object A01;

    public C64495Lcw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DJQ(boolean z) {
        if (this.A00 == 0) {
            K7Z.A01((K7Z) this.A01, true);
        }
    }

    public final void DJS(AnonymousClass3HO r8, List list, boolean z) {
        int i = this.A00;
        0qQ.A0B(list, 2);
        switch (i) {
            case 0:
                K7Z k7z = (K7Z) this.A01;
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    Reel reel = (Reel) next;
                    HighlightReelTypeStr highlightReelTypeStr = reel.A09;
                    if (!(highlightReelTypeStr == HighlightReelTypeStr.FAN_CLUB || highlightReelTypeStr == HighlightReelTypeStr.FAN_CLUB_WELCOME_FEEDBACK_STORY || reel.A0l())) {
                        A1C.add(next);
                    }
                }
                k7z.A05 = A1C;
                K7Z.A01(k7z, false);
                AnonymousClass37D A0i = DbX.A0i(k7z);
                if (A0i != null) {
                    A0i.A0V(true);
                    return;
                }
                return;
            case 1:
                L93 l93 = (L93) this.A01;
                C60416Jl9 jl9 = l93.A03;
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (Object next2 : list) {
                    DbV.A1U(next2, A1C2, ((Reel) next2).A0l() ? 1 : 0);
                }
                List list2 = jl9.A02;
                list2.clear();
                int size = A1C2.size();
                int i2 = 5;
                if (5 > size) {
                    i2 = size;
                }
                list2.addAll(00k.A0d(A1C2, i2));
                jl9.notifyDataSetChanged();
                KHT.A00(l93.A04.A00);
                return;
            default:
                K7W k7w = (K7W) this.A01;
                ArrayList<Reel> A1C3 = AnonymousClass7TE.A1C();
                for (Object next3 : list) {
                    DbV.A1U(next3, A1C3, ((Reel) next3).A0l() ? 1 : 0);
                }
                ViewModelListUpdate A0R = DbS.A0R();
                ArrayList A0r = AnonymousClass7TG.A0r(A1C3);
                for (Reel lhf : A1C3) {
                    A0r.add(new C64763Lhf(lhf));
                }
                A0R.A01(A0r);
                ((AnonymousClass2t9) AnonymousClass7TE.A14(k7w.A04)).A05(A0R);
                return;
        }
    }

    public final /* synthetic */ void DWD(long j, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DWE(long j) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DJP(boolean z) {
    }

    public final /* synthetic */ void DJR(boolean z) {
    }
}
