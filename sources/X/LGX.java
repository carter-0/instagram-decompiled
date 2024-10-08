package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.CancellationException;

public final class LGX {
    public C358418as A00;
    public C63677L2n A01;
    public boolean A02;
    public boolean A03;
    public Handler A04;
    public String A05;
    public C262204Co A06;
    public boolean A07;
    public final View A08;
    public final EditText A09;
    public final C635813i A0A;
    public final AnonymousClass4DH A0B;
    public final UserSession A0C;
    public final User A0D;
    public final C313556gd A0E;
    public final C313666go A0F;
    public final LM9 A0G;
    public final LES A0H;
    public final C313776gz A0I;
    public final LSD A0J;

    public final void A03(String str) {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass7TF.A1O(this.A0I.A02().A0G, true);
            String str2 = this.A05;
            if (str2 == null || 2PP.A00(str2, str)) {
                this.A04 = AnonymousClass7TF.A0D();
                this.A08.setVisibility(0);
                if (this.A05 == null) {
                    this.A05 = str;
                    View A0G2 = AnonymousClass7TF.A0G(this.A0B.requireView(), R.id.dismiss_view_background);
                    A0G2.setVisibility(4);
                    A0G2.setOnTouchListener(new C64282LYi(6, this, new GestureDetector(A0G2.getContext(), new C60799JrU(this, 2))));
                }
                if (this.A06 == null) {
                    this.A06 = AnonymousClass11O.A03(DbV.A0J(this.A0B), MHB.A02(this, C313776gz.A0K.A00(this.A0C, this.A0F).A04.A08, 37));
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A1B("IgLiveReactionsPresenter started with different broadcastId");
        }
    }

    public final void A00() {
        0nA.A0N(this.A0B.requireView());
    }

    public final void A01() {
        if (this.A07) {
            this.A07 = false;
            AnonymousClass7TF.A1O(this.A0I.A02().A0G, false);
            C262204Co r0 = this.A06;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            this.A06 = null;
            this.A08.setVisibility(8);
            C339667jy.A02 = null;
            Handler handler = this.A04;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
        }
    }

    public final void A02(int i) {
        Context context;
        AnonymousClass37D A022;
        if (!this.A02) {
            boolean z = this.A03;
            boolean A1W = C51970G9q.A1W(i, AnonymousClass7TE.A0M(this.A0A.get()));
            this.A03 = A1W;
            if (!A1W || (context = this.A0B.getContext()) == null || (A022 = AnonymousClass37D.A00.A02(context)) == null || !((AnonymousClass37F) A022).A0g) {
                LSD lsd = this.A0J;
                if (lsd != null) {
                    lsd.A01 = (float) i;
                    LSD.A02(lsd, AnonymousClass05K.A00, true);
                }
                boolean z2 = this.A03;
                if (z != z2 && !z2 && !C61290mR.A07()) {
                    AnonymousClass4DH r0 = this.A0B;
                    Window A0G2 = DbV.A0G(r0);
                    0qQ.A07(A0G2);
                    2db.A07(r0.mView, A0G2, false);
                }
            }
        }
    }

    public final void A04(boolean z) {
        LSD lsd;
        if (this.A07 && (lsd = this.A0J) != null && lsd.A03 != z) {
            lsd.A03 = z;
            LSD.A01(lsd);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LGX(X.C635813i r4, X.AnonymousClass4DH r5, com.instagram.common.session.UserSession r6, com.instagram.user.model.User r7, X.C313556gd r8, X.C313666go r9, X.C313776gz r10, X.LSD r11) {
        /*
            r3 = this;
            X.LES r1 = r10.A02()
            r0 = 5
            X.AnonymousClass7TF.A1F(r4, r0, r1)
            r3.<init>()
            r3.A0C = r6
            r3.A0B = r5
            r3.A0D = r7
            r3.A0J = r11
            r3.A0A = r4
            r3.A0I = r10
            r3.A0H = r1
            r3.A0F = r9
            r3.A0E = r8
            X.LM9 r0 = new X.LM9
            r0.<init>(r5, r6)
            r3.A0G = r0
            android.view.View r1 = r5.requireView()
            r0 = 2131434463(0x7f0b1bdf, float:1.849074E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r1, r0)
            r3.A08 = r0
            android.view.View r1 = r5.requireView()
            r0 = 2131430479(0x7f0b0c4f, float:1.848266E38)
            android.view.View r0 = X.AnonymousClass7TF.A0F(r1, r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r3.A09 = r0
            X.8as r0 = new X.8as
            r0.<init>(r5, r6)
            r3.A00 = r0
            X.6go r0 = X.C313666go.VIEWER
            if (r9 != r0) goto L_0x0061
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321262817649884(0x8109ff000a24dc, double:3.033051087643436E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0061
            X.0xx r1 = X.DbW.A0E(r5)
            r0 = 39
            X.MG2.A01(r3, r1, r0)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LGX.<init>(X.13i, X.4DH, com.instagram.common.session.UserSession, com.instagram.user.model.User, X.6gd, X.6go, X.6gz, X.LSD):void");
    }
}
