package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6UX  reason: invalid class name */
public abstract class AnonymousClass6UX {
    public Reel A00;
    public final AnonymousClass6UY A01;
    public final C230222pE A02;
    public final String A03;
    public final Activity A04;

    public ImageUrl A04(UserSession userSession, Reel reel) {
        return null;
    }

    public void A05(Reel reel, C255773uh r2) {
    }

    public boolean A07() {
        return false;
    }

    public abstract AnonymousClass6KT A08(Reel reel, C255773uh r2);

    public void A09(Reel reel) {
        AnonymousClass6UW r2 = (AnonymousClass6UW) this;
        C2366034j r0 = r2.A07;
        r0.getClass();
        int CMG = r0.CMG(reel);
        if (CMG != -1) {
            r2.A00 = CMG;
        }
    }

    public void A0A(Reel reel, C255773uh r8) {
        AnonymousClass6UW r5 = (AnonymousClass6UW) this;
        RecyclerView recyclerView = r5.A03;
        LinearLayoutManager linearLayoutManager = r5.A02;
        linearLayoutManager.getClass();
        0qQ.A0B(recyclerView, 0);
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a <= A1b) {
            while (true) {
                C249703kE A0W = recyclerView.A0W(A1a);
                if (A0W != null && (A0W instanceof AnonymousClass3N2)) {
                    ((AnonymousClass3N3) A0W).Eu3(r5.A04);
                }
                if (A1a == A1b) {
                    break;
                }
                A1a++;
            }
        }
        AnonymousClass3N2 A002 = AnonymousClass6UW.A00(reel, r5);
        if (A002 != null) {
            A002.CLE();
        }
    }

    public abstract void A0C(Reel reel, C255773uh r2);

    public final void A02(Reel reel) {
        if (!2PP.A00(this.A00, reel)) {
            this.A00 = reel;
            C230222pE r0 = this.A02;
            if (r0 != null) {
                r0.DcC(reel);
            }
        }
    }

    public final void A03(List list) {
        if (this instanceof AnonymousClass6UW) {
            AnonymousClass6UW r0 = (AnonymousClass6UW) this;
            C2366034j r2 = r0.A07;
            r2.getClass();
            r2.Ei9(list, false, r0.A05);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r5.A08 == false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(com.instagram.model.reels.Reel r10, X.C255773uh r11, X.C305916Kb r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.AnonymousClass6UW
            if (r0 == 0) goto L_0x0014
            r5 = r9
            X.6UW r5 = (X.AnonymousClass6UW) r5
            androidx.recyclerview.widget.RecyclerView r4 = r5.A03
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x0018
            java.lang.String r1 = "TrayReelViewerInteractiveHideAnimationCoordinator#prepareBackingViewsForAnimation"
            java.lang.String r0 = "mTrayRecyclerView not attached to window at call time."
            X.0wb.A03(r1, r0)
        L_0x0014:
            r12.AFC()
            return
        L_0x0018:
            X.34j r0 = r5.A07
            r0.getClass()
            r0.notifyDataSetChanged()
            int r1 = r5.A00
            androidx.recyclerview.widget.LinearLayoutManager r3 = r5.A02
            r3.getClass()
            int r0 = r3.A1c()
            if (r1 < r0) goto L_0x0046
            int r0 = r3.A1d()
            if (r1 > r0) goto L_0x0046
            com.instagram.common.session.UserSession r6 = r5.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328663045717510(0x8110ba00013e06, double:3.0377310216717294E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0046
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x009b
        L_0x0046:
            X.3AS r0 = r4.A0C
            r5.A01 = r0
            r0 = 0
            r4.setItemAnimator(r0)
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x00ab
            X.2Rw r0 = r4.A0A
            r0.getClass()
            int r0 = r0.getItemCount()
            int r6 = r0 + -1
        L_0x005d:
            r7 = 0
            int r2 = r5.A00
            X.3BQ r1 = r5.A06
            com.instagram.common.session.UserSession r8 = r5.A05
            r0 = 2
            X.0qQ.A0B(r1, r0)
            r0 = 4
            X.0qQ.A0B(r8, r0)
            if (r2 == 0) goto L_0x0098
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_STORIES_TRAY
            if (r1 == r0) goto L_0x0098
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY
            if (r1 == r0) goto L_0x0098
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328663045783047(0x8110ba00023e07, double:3.037731021713175E-306)
            boolean r1 = X.182.A06(r2, r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x0098
            r1 = 0
            android.view.View r0 = r3.A0X(r7)
            if (r0 == 0) goto L_0x0097
            int r0 = r0.getWidth()
            int r1 = r0 / 4
        L_0x0097:
            r7 = r1
        L_0x0098:
            r3.A1p(r6, r7)
        L_0x009b:
            X.6KH r3 = new X.6KH
            r3.<init>(r12, r5, r14)
            r0 = 40
            X.6KI r2 = new X.6KI
            r2.<init>(r12, r5)
            X.0nA.A0s(r4, r3, r2, r0)
            return
        L_0x00ab:
            int r6 = r5.A00
            X.3BQ r1 = r5.A06
            com.instagram.common.session.UserSession r7 = r5.A05
            r0 = 2
            X.0qQ.A0B(r1, r0)
            r0 = 4
            X.0qQ.A0B(r7, r0)
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_STORIES_TRAY
            if (r1 == r0) goto L_0x005d
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY
            if (r1 == r0) goto L_0x005d
            if (r6 != 0) goto L_0x00c5
            r6 = 0
            goto L_0x005d
        L_0x00c5:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328663045651973(0x8110ba00003e05, double:3.0377310216302836E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x005d
            int r6 = r6 + -1
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UX.A06(com.instagram.model.reels.Reel, X.3uh, X.6Kb, boolean, boolean):void");
    }

    public void A0B(Reel reel, C255773uh r4) {
        C230222pE r1 = this.A02;
        if (r1 != null) {
            r1.DFj(reel, this.A01);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6UY, java.lang.Object] */
    public AnonymousClass6UX(Activity activity, C230222pE r4) {
        this.A04 = activity;
        this.A02 = r4;
        this.A01 = new Object();
        String obj = UUID.randomUUID().toString();
        this.A03 = obj;
        AnonymousClass6UZ.A00.put(obj, this);
    }

    public AnonymousClass6UX() {
        this((Activity) null, (C230222pE) null);
    }
}
