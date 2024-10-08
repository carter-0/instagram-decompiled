package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.List;

public final class EEQ extends C252233om implements C228132kq, C2365234b {
    public View A00;
    public C230252pH A01;
    public AnonymousClass6VJ A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final C227812jx A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C228162kt A07;
    public final C228102kn A08;
    public final C2365334c A09;
    public final C2365934i A0A;
    public final 1Ng A0B;
    public final 1wn A0C;
    public final G72 A0D;
    public final C2366834r A0E;

    public final void CLl(String str) {
    }

    public final void D0J(Reel reel) {
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        C2365334c r0 = this.A09;
        r0.A03();
        this.A00 = r0.A03;
        DcX(false, false);
        this.A0D.Em4(this.A00);
    }

    public final void DIR() {
    }

    public final void DJL(boolean z) {
    }

    public final /* synthetic */ void DR6() {
    }

    public final void DU2() {
    }

    public final void DVw() {
    }

    public final void DWD(long j, int i) {
    }

    public final void DWE(long j) {
    }

    public final void DcK(int i) {
    }

    public final void DcY(C62539KhV khV, String str) {
    }

    public final /* synthetic */ void DcZ(Reel reel, AnonymousClass3BN r2, int i) {
    }

    public final void Dca(C249703kE r7, AnonymousClass3O9 r8, Integer num, String str, String str2, List list, int i, boolean z) {
        long j;
        0qQ.A0B(str, 0);
        C2365334c r5 = this.A09;
        Reel A012 = r5.A01(str);
        if (A012 != null) {
            AnonymousClass6VJ r1 = this.A02;
            if (r1 != null) {
                r1.A05(AnonymousClass05K.A0C);
            }
            RecyclerView recyclerView = r5.A03;
            if (recyclerView != null) {
                recyclerView.A0o(r5.A0C.CMG(A012));
            }
            View view = this.A00;
            if (view != null) {
                C51360Fss fss = new C51360Fss(this, A012);
                if (r5.A00(A012) != null) {
                    j = 0;
                } else {
                    j = 100;
                }
                view.postDelayed(fss, j);
            }
        }
    }

    public final /* synthetic */ void Dcb(C249703kE r1, AnonymousClass3O9 r2, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    public final void Dcd(Reel reel, AnonymousClass3BN r9, Integer num, int i) {
        DbY.A1S(reel, r9);
        this.A01.A02(reel, r9, (Boolean) null, (Boolean) null, (Integer) null, i);
    }

    public final void Dcf(List list, int i, String str) {
    }

    public final void Dcg(Integer num, int i, long j, boolean z) {
        Integer num2 = num;
        0qQ.A0B(num, 3);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(new C51202FqJ(this), 250);
        }
        C230252pH r2 = this.A01;
        UserSession userSession = this.A06;
        r2.A04(new AnonymousClass3BN(userSession, 1OP.A05(userSession).A0P()), this.A08, num2, i, j, z);
    }

    public final void Dch(1OE r13, String str, int i, long j, boolean z, boolean z2) {
        boolean A1Z = AnonymousClass7TG.A1Z(r13, str);
        UserSession userSession = this.A06;
        AnonymousClass0iw r5 = this.A05;
        AnonymousClass7TF.A1B(userSession, A1Z ? 1 : 0, r5);
        C230252pH r4 = new C230252pH(r5, userSession, (String) null, str, r13.A07);
        this.A01 = r4;
        C2366834r r1 = this.A0E;
        r1.A06.A00 = r4;
        r1.A05.A00 = r4;
        r1.A04.A00 = r4;
        1OP r0 = 1OP.$redex_init_class;
        ReelStore A032 = ReelStore.A03(userSession);
        0qQ.A07(A032);
        r4.A03(new AnonymousClass3BN(userSession, A032.A0P()), this.A08, (Double) null, r13.A04, j, z);
    }

    public final void Dci(String str) {
    }

    public final /* synthetic */ void Dcj() {
    }

    public final void Du3(int i) {
    }

    public final void E0D(C249703kE r1, Reel reel, Integer num, String str, String str2, List list) {
    }

    public final void EBe(View view, int i, boolean z) {
    }

    public final void EC6(View view, int i) {
    }

    public final void ECI(View view, Reel reel, AnonymousClass3BN r9, int i) {
        0qQ.A0B(view, 0);
        this.A0E.A00(view, reel, r9, (Boolean) null, i);
    }

    public final void EGP(long j, int i) {
    }

    public final void EGQ(long j) {
    }

    public EEQ(Context context, C227812jx r17, AnonymousClass0iw r18, UserSession userSession, 2el r20, G72 g72, C228162kt r22) {
        G72 g722 = g72;
        C228162kt r1 = r22;
        AnonymousClass7TG.A1R(r1, g722);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 6);
        C227812jx r3 = r17;
        this.A04 = r3;
        this.A07 = r1;
        this.A0D = g722;
        this.A06 = userSession2;
        AnonymousClass0iw r5 = r18;
        this.A05 = r5;
        C228102kn A002 = C228092km.A00(userSession2);
        0qQ.A07(A002);
        this.A08 = A002;
        C2365334c r2 = new C2365334c(r3.requireActivity(), context, r5, userSession2, (AnonymousClass34Y) null, this);
        this.A09 = r2;
        this.A0A = r2.A0C;
        C230252pH r9 = new C230252pH(r5, userSession2, (String) null, (String) null, (String) null);
        this.A01 = r9;
        this.A0E = new C2366834r(r20, (C228322lL) null, r9, A002);
        this.A0B = AnonymousClass1Nd.A00(userSession2);
        this.A0C = FXZ.A00(this, 19);
    }

    public final /* synthetic */ int C8o() {
        return 0;
    }

    public final void DcX(boolean z, boolean z2) {
        if (this.A00 != null) {
            UserSession userSession = this.A06;
            ArrayList A0P = 1OP.A05(userSession).A0P();
            C2365334c r2 = this.A09;
            r2.A0C.Ei9(A0P, false, r2.A0B);
            1OP.A03(userSession).A08(AnonymousClass3BU.CONTEXTUAL_RESORT, A0P);
            if (z) {
                r2.A06();
            }
        }
    }

    public final void onCreate() {
        this.A08.A0F(this);
        this.A0B.A01(this.A0C, AnonymousClass376.class);
    }

    public final void onDestroy() {
        this.A08.A0G(this);
        this.A0B.A02(this.A0C, AnonymousClass376.class);
    }

    public final void onDestroyView() {
        this.A09.A04();
        if (this.A00 != null) {
            this.A00 = null;
            this.A0D.AHs();
        }
        AnonymousClass6VJ r1 = this.A02;
        if (r1 != null) {
            this.A07.FJ2(r1);
        }
    }

    public final void onPause() {
        C228102kn r2 = this.A08;
        r2.A02 = System.currentTimeMillis();
        this.A09.A05();
        r2.A0G(this);
        AnonymousClass6VJ r1 = this.A02;
        if (r1 != null) {
            r1.A05(AnonymousClass05K.A0N);
        }
    }

    public final void onResume() {
        C2365934i r1 = this.A0A;
        r1.notifyDataSetChanged();
        if (this.A00 != null && r1.getItemCount() > 0) {
            r1.notifyDataSetChanged();
        }
        this.A08.A0F(this);
    }
}
