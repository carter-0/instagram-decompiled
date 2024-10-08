package X;

import android.graphics.RectF;
import android.view.ViewGroup;
import com.instagram.user.model.User;

/* renamed from: X.9r0  reason: invalid class name and case insensitive filesystem */
public final class C390269r0 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelMentionShareFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new MJ2(this, 3));

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        AnonymousClass0eM r5 = this.A00;
        if (r5.getValue() == null) {
            return null;
        }
        RectF A0C = AnonymousClass7TF.A0C((float) AnonymousClass0nB.A01(requireContext()), (float) AnonymousClass0nB.A00(requireContext()));
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
        A002.A09 = viewGroup;
        AnonymousClass80D.A07(28D.A5J, this, A002);
        AnonymousClass80D.A01(A0C, (RectF) null, A002);
        AnonymousClass80D.A0A(A002);
        A002.A3Q = true;
        A002.A1v = (User) r5.getValue();
        return A002;
    }

    public final String getModuleName() {
        return "reel_mention_share_fragment";
    }
}
