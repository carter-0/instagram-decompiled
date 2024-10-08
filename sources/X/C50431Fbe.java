package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;

/* renamed from: X.Fbe  reason: case insensitive filesystem */
public final class C50431Fbe implements C51929G7x {
    public final /* synthetic */ C47526E6m A00;

    public C50431Fbe(C47526E6m e6m) {
        this.A00 = e6m;
    }

    public final boolean AJe(String str) {
        E9L e9l = this.A00.A00;
        if (e9l != null) {
            return e9l.A02.contains(str);
        }
        0qQ.A0F("accountDiscoveryAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1OC BDo() {
        C47526E6m e6m = this.A00;
        0lg A0X = DbT.A0X(e6m.A08);
        String str = e6m.A02;
        1NY A0M = DbZ.A0M(A0X);
        A0M.A0A("discover/account_discovery/");
        A0M.A0Q(C43837CFd.class, D2R.class);
        A0M.A0G(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        return A0M.A0M();
    }

    public final /* bridge */ /* synthetic */ void DFN(1XR r4) {
        String str;
        C43837CFd cFd = (C43837CFd) r4;
        0qQ.A0B(cFd, 0);
        E9L e9l = this.A00.A00;
        if (e9l == null) {
            str = "accountDiscoveryAdapter";
        } else {
            ArrayList arrayList = cFd.A00;
            if (arrayList == null) {
                str = "categories";
            } else if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = e9l.A01;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                e9l.A00();
                return;
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FK4() {
        E9L e9l = this.A00.A00;
        if (e9l == null) {
            0qQ.A0F("accountDiscoveryAdapter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            e9l.A00();
        }
    }
}
