package X;

import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.GiV  reason: case insensitive filesystem */
public final class C53097GiV extends C249403jg {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ C54077Gz1 A01;
    public final /* synthetic */ AnonymousClass2pM A02;
    public final /* synthetic */ C53109Gih A03;
    public final /* synthetic */ C57286IVv A04;
    public final /* synthetic */ C55852HoZ A05;
    public final /* synthetic */ boolean A06;

    public C53097GiV(IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, AnonymousClass2pM r3, C53109Gih gih, C57286IVv iVv, C55852HoZ hoZ, boolean z) {
        this.A00 = intentAwareAdPivotState;
        this.A02 = r3;
        this.A01 = gz1;
        this.A06 = z;
        this.A04 = iVv;
        this.A03 = gih;
        this.A05 = hoZ;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        int A0D = AnonymousClass7TG.A0D(recyclerView, -411881598);
        if (i == 0) {
            IntentAwareAdPivotState intentAwareAdPivotState = this.A00;
            if (!intentAwareAdPivotState.A0A) {
                intentAwareAdPivotState.A0A = true;
                AnonymousClass2pM r3 = this.A02;
                r3.A08.A0E(intentAwareAdPivotState, this.A01);
                r3.A02.A01 = null;
            }
            Handler handler = C55411HhH.A01;
            handler.removeCallbacksAndMessages((Object) null);
            handler.postDelayed(new C57845IhO(recyclerView, intentAwareAdPivotState), 200);
        }
        if (this.A06 && (i == 0 || i == 1 || i == 2)) {
            C252553pI r1 = this.A04.A02.A0D;
            if ((r1 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r1) != null) {
                int A1b = linearLayoutManager.A1b();
                if (Integer.valueOf(A1b) != null && A1b >= 0) {
                    C255913uv r0 = this.A03.A00;
                    if (r0 != null) {
                        r0.setCurrentPage(A1b);
                        this.A00.A00 = A1b;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-1547840180, A0D);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0fD.A03(1886362305);
        C55852HoZ hoZ = this.A05;
        UserSession userSession = hoZ.A01;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36312887633839496L) && !182.A06(r2, userSession, 36312887635281300L)) {
            hoZ.A02.A01();
        }
        AnonymousClass0fD.A0A(732381129, A032);
    }
}
