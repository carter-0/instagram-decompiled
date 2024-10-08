package X;

import com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Utj  reason: case insensitive filesystem */
public final class C16366Utj extends C243843aC {
    public final int A00;
    public final Object A01;

    public C16366Utj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        if (this.A00 != 0) {
            NametagResultCardView nametagResultCardView = (NametagResultCardView) this.A01;
            nametagResultCardView.A0C = true;
            X5D x5d = nametagResultCardView.A08;
            x5d.getClass();
            user.getUsername();
            user.getId();
            ((WJp) x5d).A0A = true;
            return;
        }
        0qQ.A0B(user, 0);
        C14032ToY toY = (C14032ToY) this.A01;
        int bindingAdapterPosition = toY.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            C14031ToX toX = toY.A02.A00;
            Object A012 = toX.A01(bindingAdapterPosition);
            if (A012 instanceof AnonymousClass3UL) {
                C320216s0 r0 = toX.A03;
                if (r0 != null) {
                    r0.A0D((AnonymousClass3UL) A012, bindingAdapterPosition);
                }
            } else {
                C320216s0 r02 = toX.A03;
                if (r02 != null) {
                    r02.A09(user, bindingAdapterPosition);
                }
            }
            FollowStatus A0N = AnonymousClass2f1.A00(toX.A08).A0N(user);
            if (A0N == FollowStatus.A05 || A0N == FollowStatus.A07) {
                toX.A0C.run();
            }
            toX.notifyItemChanged(bindingAdapterPosition);
        }
    }

    public final void DGO(User user) {
        if (1 - this.A00 != 0) {
            super.DGO(user);
        }
    }

    public final void DGP(User user) {
        if (1 - this.A00 != 0) {
            super.DGP(user);
        }
    }

    public final void DGR(EWA ewa, User user) {
        if (1 - this.A00 != 0) {
            super.DGR(ewa, user);
        }
    }
}
