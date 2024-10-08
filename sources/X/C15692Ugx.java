package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ugx  reason: case insensitive filesystem */
public final class C15692Ugx extends C252233om implements AnonymousClass0iw, View.OnKeyListener {
    public static final String __redex_internal_original_name = "CanvasVideoModule";
    public RecyclerView A00;
    public boolean A01;
    public final Rect A02 = new Rect();
    public final Handler A03;
    public final LinearLayoutManager A04;
    public final UAS A05;
    public final C16387Uu4 A06;
    public final AnonymousClass0iw A07;
    public final C249403jg A08;

    public final void onResume() {
        this.A01 = true;
        this.A03.sendEmptyMessage(0);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A15(this.A08);
        }
    }

    public final String getModuleName() {
        return this.A07.getModuleName();
    }

    public final void onDestroyView() {
        this.A03.removeCallbacksAndMessages((Object) null);
        this.A00 = null;
    }

    public final void onPause() {
        this.A03.removeCallbacksAndMessages((Object) null);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A16(this.A08);
        }
        C16387Uu4 uu4 = this.A06;
        uu4.A03 = null;
        AnonymousClass4M3 r0 = uu4.A02;
        if (r0 != null) {
            uu4.A02();
            r0.ECP("fragment_paused");
            uu4.A02 = null;
        }
        this.A01 = false;
    }

    public C15692Ugx(Context context, RecyclerView recyclerView, UAS uas, AnonymousClass0iw r8, UserSession userSession) {
        C252553pI r0;
        AnonymousClass7TG.A1O(context, uas);
        0qQ.A0B(userSession, 4);
        this.A05 = uas;
        this.A00 = recyclerView;
        this.A07 = r8;
        C16387Uu4 uu4 = new C16387Uu4(context, userSession);
        uu4.A00 = this;
        this.A06 = uu4;
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 == null || (r0 = recyclerView2.A0D) == null) {
            throw AnonymousClass7TE.A0y();
        }
        this.A04 = (LinearLayoutManager) r0;
        this.A03 = new C14697U1x(Looper.getMainLooper(), this, 3);
        this.A08 = new UB1(this, 4);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        DbY.A1S(view, keyEvent);
        return this.A06.onKey(view, i, keyEvent);
    }
}
