package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;

/* renamed from: X.Fbf  reason: case insensitive filesystem */
public final class C50432Fbf implements C51929G7x {
    public final /* synthetic */ E6e A00;

    public C50432Fbf(E6e e6e) {
        this.A00 = e6e;
    }

    public final boolean AJe(String str) {
        E9M e9m = this.A00.A01;
        if (e9m != null) {
            return e9m.A01.contains(str);
        }
        0qQ.A0F("oneCategoryAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1OC BDo() {
        String str;
        E6e e6e = this.A00;
        String str2 = e6e.A03;
        0lg A0X = DbT.A0X(e6e.A09);
        String str3 = e6e.A02;
        String str4 = null;
        if (str3 == null) {
            str = "category";
        } else {
            EEU eeu = e6e.A00;
            if (eeu == null) {
                str = "accountDiscoveryController";
            } else {
                if (eeu.A02) {
                    str4 = e6e.A04;
                }
                0qQ.A0B(A0X, 1);
                1NY A0b = AnonymousClass7TG.A0b(A0X);
                A0b.A0A("discover/account_discovery/");
                A0b.A0Q(C43836CFc.class, D2Q.class);
                A0b.A9m("category", str3);
                A0b.A0G(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                if (!(str4 == null || str4.length() == 0)) {
                    A0b.A9m("forced_user_ids", str4);
                }
                return A0b.A0M();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void DFN(1XR r4) {
        String str;
        C43836CFc cFc = (C43836CFc) r4;
        0qQ.A0B(cFc, 0);
        E9M e9m = this.A00.A01;
        if (e9m == null) {
            str = "oneCategoryAdapter";
        } else {
            F2I f2i = cFc.A00;
            if (f2i != null) {
                ArrayList A002 = f2i.A00();
                if (DbT.A1b(A002)) {
                    ArrayList arrayList = e9m.A00;
                    arrayList.clear();
                    arrayList.addAll(A002);
                    E9M.A00(e9m);
                    return;
                }
                return;
            }
            str = "category";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FK4() {
        E9M e9m = this.A00.A01;
        if (e9m == null) {
            0qQ.A0F("oneCategoryAdapter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            E9M.A00(e9m);
        }
    }
}
