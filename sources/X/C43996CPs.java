package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CPs  reason: case insensitive filesystem */
public final class C43996CPs extends 17P implements DUU {
    public StoryPromptTappableDataIntf A00;
    public List A01;

    public final C46264DSt BOE() {
        return (C46264DSt) A05(-894921330, C43997CPt.class);
    }

    public final List BQO() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'mediaInfos' field.");
    }

    public final StoryPromptTappableDataIntf Bhq() {
        StoryPromptTappableDataIntf storyPromptTappableDataIntf = this.A00;
        if (storyPromptTappableDataIntf == null) {
            return (StoryPromptTappableDataIntf) A04(-305109662, ImmutablePandoStoryPromptTappableData.class);
        }
        return storyPromptTappableDataIntf;
    }

    public final DUU E9B(1E9 r4) {
        List A0o = A0o(-3896982, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r4, A0r, it);
        }
        this.A01 = A0r;
        StoryPromptTappableDataIntf Bhq = Bhq();
        Bhq.E8t(r4);
        this.A00 = Bhq;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DUU, com.facebook.pando.TreeJNI, X.CPs] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44461CfJ.A00(this));
    }

    public final List Bkq() {
        List A0n = A0n(-745300429);
        if (A0n == null) {
            return 0sn.A00;
        }
        return A0n;
    }

    public final BHV FBo(1E9 r6) {
        BHW bhw;
        C46264DSt BOE = BOE();
        if (BOE != null) {
            bhw = BOE.FBq();
        } else {
            bhw = null;
        }
        List A0o = A0o(-3896982, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r6, A0r, it);
        }
        ArrayList A0r2 = AnonymousClass7TG.A0r(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41848B3p.A1V(r6, A0r2, it2);
        }
        return new BHV(Bhq().FAr(r6), bhw, A0r2, Bkq());
    }

    public final BHV FBp(1E6 r2) {
        return FBo(C41847B3o.A0q(r2));
    }
}
