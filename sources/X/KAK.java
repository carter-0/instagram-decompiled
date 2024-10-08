package X;

import android.content.Context;
import android.widget.TextView;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

public final class KAK extends 1P0 {
    public final Context A00;
    public final InlineAddHighlightFragment A01;
    public final /* synthetic */ C64501Ld2 A02;

    public KAK(C64501Ld2 ld2, InlineAddHighlightFragment inlineAddHighlightFragment) {
        this.A02 = ld2;
        this.A01 = inlineAddHighlightFragment;
        this.A00 = inlineAddHighlightFragment.requireContext();
    }

    public final void onFail(C268654dm r6) {
        TextView textView;
        int A03 = AnonymousClass0fD.A03(-1911656248);
        InlineAddHighlightFragment inlineAddHighlightFragment = this.A01;
        if (!(inlineAddHighlightFragment.getContext() == null || (textView = inlineAddHighlightFragment.mActionButton) == null)) {
            textView.setEnabled(true);
        }
        Context context = this.A00;
        C59689JTv.A03(context, context.getString(2131975944), "CreateHighlight_unknown_error_occured", 0);
        AnonymousClass0fD.A0A(-386448698, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2042066664);
        int A032 = AnonymousClass0fD.A03(-2118422781);
        C64501Ld2 ld2 = this.A02;
        UserSession userSession = ld2.A02;
        ReelStore A05 = 1OP.A05(userSession);
        AnonymousClass3HX r0 = ((K14) obj).A00;
        r0.getClass();
        Reel A0I = A05.A0I(r0, true);
        for (C255773uh r2 : A0I.A0O(userSession)) {
            if (r2.A0e == C250963mL.MEDIA) {
                1Xj r1 = r2.A0b;
                r1.getClass();
                r1.A4E(A0I.getId());
            }
        }
        ld2.A00(A0I.A07(), AnonymousClass7TF.A0e(this.A00.getResources(), A0I.A0r, 2131964348));
        ld2.A01.A05(new AnonymousClass376(A0I));
        0xY A0N = AnonymousClass7TF.A0N(userSession);
        A0N.E5T(AnonymousClass000.A00(3215), true);
        A0N.apply();
        JTU.A0o(this.A01);
        AnonymousClass0fD.A0A(1295736628, A032);
        AnonymousClass0fD.A0A(704777308, A03);
    }
}
