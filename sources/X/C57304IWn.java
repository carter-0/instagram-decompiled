package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.IWn  reason: case insensitive filesystem */
public final class C57304IWn implements C230222pE {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public C57304IWn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DFj(Reel reel, AnonymousClass6UY r3) {
        C62320sa r0;
        switch (this.A00) {
            case 0:
                C54227H3w h3w = ((H07) this.A01).A01;
                if (h3w == null) {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    h3w.notifyDataSetChanged();
                    return;
                }
            case 1:
                C52476GUc.A00(((IU7) this.A01).A01);
                return;
            case 2:
                r0 = (C62320sa) this.A01;
                break;
            default:
                r0 = (C62320sa) this.A01;
                if (r0 == null) {
                    return;
                }
                break;
        }
        r0.invoke();
    }
}
