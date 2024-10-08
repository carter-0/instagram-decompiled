package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.util.HashSet;

public final class PRY implements G82 {
    public final /* synthetic */ C68483NKa A00;

    public final boolean CZf(User user) {
        0qQ.A0B(user, 0);
        return this.A00.A0K.contains(user.getId());
    }

    public final boolean CbR(User user) {
        return true;
    }

    public final void CtI(User user) {
    }

    public final boolean Dw3(User user, boolean z) {
        Integer num;
        0qQ.A0B(user, 0);
        C68483NKa nKa = this.A00;
        HashSet hashSet = nKa.A0K;
        if (!z) {
            hashSet.remove(user.getId());
        } else if (hashSet.size() < 10) {
            hashSet.add(user.getId());
            if (nKa.A0H) {
                nKa.A02(user, true);
            }
        } else {
            C59689JTv.A07(nKa.getContext(), 2131972398);
            return false;
        }
        int size = hashSet.size();
        String A0d = AnonymousClass7TF.A0d(DbV.A05(nKa), 2131971410);
        boolean z2 = false;
        boolean z3 = false;
        if (size > 0) {
            z3 = true;
            StringBuilder A0n = AnonymousClass7TF.A0n(A0d);
            A0n.append(" (");
            A0d = C51975G9x.A0j(A0n, size);
        }
        2da r0 = nKa.A00;
        if (r0 == null) {
            0qQ.A0F("actionBarConfigurer");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.setTitle(A0d);
        IgdsButton igdsButton = nKa.A05;
        if (igdsButton != null) {
            igdsButton.setEnabled(z3);
        }
        if (!nKa.A0H) {
            C252553pI r1 = nKa.getRecyclerView().A0D;
            0qQ.A0C(r1, C273654mx.A00(7));
            Object item = nKa.getAdapter().getItem(((LinearLayoutManager) r1).A1b());
            if (item instanceof F06) {
                z2 = C66582MXn.A1T(((F06) item).A01, user);
            }
        }
        boolean A1b = DbT.A1b(hashSet);
        IgEditText igEditText = nKa.A01;
        if (igEditText != null) {
            num = Integer.valueOf(igEditText.getVisibility());
        } else {
            num = null;
        }
        int A01 = DbW.A01(A1b ? 1 : 0);
        if (num == null || A01 != num.intValue()) {
            if (z2) {
                int i = -1;
                if (A1b) {
                    i = 1;
                }
                nKa.getRecyclerView().scrollBy(0, DbV.A05(nKa).getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height) * i);
            }
            IgEditText igEditText2 = nKa.A01;
            if (igEditText2 != null) {
                igEditText2.setVisibility(A01);
            }
            IgView igView = nKa.A04;
            if (igView != null) {
                igView.setVisibility(A01);
            }
        }
        return true;
    }

    public PRY(C68483NKa nKa) {
        this.A00 = nKa;
    }
}
