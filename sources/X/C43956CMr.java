package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CMr  reason: case insensitive filesystem */
public final class C43956CMr extends 17P implements AnonymousClass3Ig {
    public final PendingShareToFriendsStoryBadgePreviewState Af3() {
        return (PendingShareToFriendsStoryBadgePreviewState) A0N(-377361986, DLV.A00);
    }

    public final List BQT() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3Ig, X.CMr] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CbN.A00(this));
    }

    public final String Aum() {
        return A0i(-1349119146);
    }

    public final AnonymousClass3If F7Q(1E9 r7) {
        ArrayList arrayList;
        PendingShareToFriendsStoryBadgePreviewState Af3 = Af3();
        String A0i = A0i(-1349119146);
        ImmutableList A08 = A08(-3719259, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList A0p = AnonymousClass7TF.A0p(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r7, A0p, it);
            }
            arrayList = AnonymousClass7TF.A0p(A0p);
            Iterator it2 = A0p.iterator();
            while (it2.hasNext()) {
                C41848B3p.A1V(r7, arrayList, it2);
            }
        } else {
            arrayList = null;
        }
        return new AnonymousClass3If(Af3, A0i, arrayList);
    }
}
