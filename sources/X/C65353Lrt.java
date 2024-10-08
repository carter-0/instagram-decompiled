package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.avatars.store.AvatarStore;

/* renamed from: X.Lrt  reason: case insensitive filesystem */
public final class C65353Lrt implements G77 {
    public final int A00;
    public final Object A01;

    public C65353Lrt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSearchCleared(String str) {
        if (3 - this.A00 == 0) {
            C64964Ll3 ll3 = (C64964Ll3) this.A01;
            if (!ll3.A0E) {
                View view = ll3.A06;
                if (view != null) {
                    view.setVisibility(4);
                }
                AnonymousClass7TF.A16(ll3.A09);
            }
        }
    }

    public final void onSearchTextChanged(String str) {
        AnonymousClass27H r1;
        View view;
        View view2;
        switch (this.A00) {
            case 0:
                0qQ.A0B(str, 0);
                ((C61364K4g) this.A01).A0B().A05(str);
                return;
            case 1:
                0qQ.A0B(str, 0);
                C61359K4b k4b = (C61359K4b) this.A01;
                AvatarStore avatarStore = k4b.A00;
                if (avatarStore != null) {
                    r1 = avatarStore.A01.A00;
                } else {
                    r1 = null;
                }
                if (0qQ.A0K(r1, C299715vi.A00)) {
                    ((C335987ds) k4b.A09.getValue()).A00(str);
                }
                if (str.length() == 0) {
                    ((C60163Jgi) k4b.A0B.getValue()).A03.Epw(K90.A00);
                    return;
                }
                2YL A0H = DbS.A0H(k4b.A0B);
                MGE.A01(A0H, str, C318116oQ.A00(A0H), 34);
                return;
            case 2:
                0qQ.A0B(str, 0);
                K7G k7g = (K7G) this.A01;
                C74586PxZ pxZ = k7g.A01;
                if (pxZ != null) {
                    C68470NJi A0R = k7g.getChildFragmentManager().A0R(((PRE) pxZ).A02);
                    if (A0R instanceof C68470NJi) {
                        A0R.Dhu(str);
                        return;
                    }
                    return;
                }
                return;
            default:
                0qQ.A0B(str, 0);
                C64964Ll3 ll3 = (C64964Ll3) this.A01;
                if (!ll3.A0E) {
                    int length = str.length();
                    view = ll3.A06;
                    if (length < 2) {
                        if (view != null) {
                            view.setVisibility(4);
                        }
                        RecyclerView recyclerView = ll3.A09;
                        if (recyclerView != null) {
                            recyclerView.setVisibility(0);
                            return;
                        }
                        return;
                    } else if (view != null) {
                        RecyclerView recyclerView2 = ll3.A09;
                        if (recyclerView2 != null) {
                            recyclerView2.setVisibility(8);
                        }
                    } else {
                        return;
                    }
                } else {
                    ll3.A0N.clear();
                    C64964Ll3.A03(ll3, (String) null, false);
                    View view3 = ll3.A06;
                    if (((view3 == null || view3.getVisibility() != 4) && ((view2 = ll3.A06) == null || view2.getVisibility() != 8)) || (view = ll3.A06) == null) {
                        return;
                    }
                }
                AnonymousClass7TG.A1A(view, true);
                return;
        }
    }
}
