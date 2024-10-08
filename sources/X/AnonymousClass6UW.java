package X;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6UW  reason: invalid class name */
public final class AnonymousClass6UW extends AnonymousClass6UX {
    public int A00 = -1;
    public AnonymousClass3AS A01;
    public final LinearLayoutManager A02;
    public final RecyclerView A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final AnonymousClass3BQ A06;
    public final C2366034j A07;
    public final boolean A08;
    public final Context A09;

    public final void A0C(Reel reel, C255773uh r2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3 > r1.A1b()) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3N2 A00(com.instagram.model.reels.Reel r3, X.AnonymousClass6UW r4) {
        /*
            X.34j r0 = r4.A07
            r0.getClass()
            int r3 = r0.CMG(r3)
            androidx.recyclerview.widget.LinearLayoutManager r1 = r4.A02
            r1.getClass()
            int r0 = r1.A1a()
            if (r3 < r0) goto L_0x001b
            int r1 = r1.A1b()
            r0 = 1
            if (r3 <= r1) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r2 = 0
            if (r0 == 0) goto L_0x002c
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            X.3kE r1 = r0.A0W(r3)
            boolean r0 = r1 instanceof X.AnonymousClass3N2
            if (r0 == 0) goto L_0x002c
            r2 = r1
            X.3N2 r2 = (X.AnonymousClass3N2) r2
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UW.A00(com.instagram.model.reels.Reel, X.6UW):X.3N2");
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r4) {
        if (2PP.A00(this.A00, reel)) {
            this.A00 = null;
        } else {
            C2366034j r0 = this.A07;
            r0.getClass();
            C249703kE A0W = this.A03.A0W(r0.CMG(reel));
            if (A0W != null && (A0W instanceof AnonymousClass3N3) && A0W.itemView.isAttachedToWindow()) {
                return AnonymousClass6KT.A04(((AnonymousClass3N3) A0W).AeG());
            }
        }
        return AnonymousClass6KT.A00();
    }

    public AnonymousClass6UW(Activity activity, RecyclerView recyclerView, AnonymousClass0iw r4, UserSession userSession, AnonymousClass3BQ r6, C230222pE r7, boolean z) {
        super(activity, r7);
        this.A05 = userSession;
        this.A09 = recyclerView.getContext();
        this.A04 = r4;
        this.A03 = recyclerView;
        this.A06 = r6;
        this.A07 = recyclerView.A0A;
        this.A02 = (LinearLayoutManager) recyclerView.A0D;
        this.A08 = z;
    }

    public final void A0B(Reel reel, C255773uh r4) {
        super.A0B(reel, r4);
        AnonymousClass3N2 A002 = A00(reel, this);
        if (A002 != null) {
            A002.Eu3(this.A04);
        }
        this.A00 = -1;
        1OP.A08(this.A09, this.A05).A00();
    }
}
