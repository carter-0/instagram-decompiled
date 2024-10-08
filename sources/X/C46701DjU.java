package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.DjU  reason: case insensitive filesystem */
public final class C46701DjU extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass70J A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A06(context));
    }

    public C46701DjU(Context context, AnonymousClass0iw r2, UserSession userSession, AnonymousClass70J r4, User user, String str) {
        this.A03 = r4;
        this.A04 = user;
        this.A05 = str;
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onClick(View view) {
        AnonymousClass70J r10 = this.A03;
        String fbidV2 = this.A04.A03.getFbidV2();
        if (fbidV2 != null) {
            Context requireContext = r10.A08.requireContext();
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            HashMap A1E3 = AnonymousClass7TE.A1E();
            BitSet A0w = DbS.A0w(1);
            A1E.put("profile_id", fbidV2);
            A0w.set(0);
            IgBloksScreenConfig A0N = DbS.A0N(r10.A03);
            if (A0w.nextClearBit(0) >= 1) {
                C46649DiU diU = new C46649DiU(C359608dC.A01(A1E), A1E2, "com.bloks.www.nme.ig_profile.verified_label_bottom_sheet");
                C46649DiU.A0B(diU, 719983200);
                diU.A03 = null;
                diU.A02 = null;
                diU.A04 = null;
                diU.A0H(A1E3);
                diU.A0E(requireContext, A0N);
            } else {
                throw DbU.A0i();
            }
        }
        String str = this.A05;
        F7A.A00(this.A01, this.A02, "ig_profile", str);
    }
}
