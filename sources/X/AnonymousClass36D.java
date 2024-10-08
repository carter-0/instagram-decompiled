package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.36D  reason: invalid class name */
public class AnonymousClass36D extends C252233om implements 27S {
    public final Handler A00;
    public final AnonymousClass36F A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass36D(UserSession userSession, AnonymousClass36F r3, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A02 = userSession;
        this.A01 = r3;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = new AnonymousClass36G(this);
    }

    public final void A00() {
        this.A00.removeMessages(0);
    }

    public final void A01() {
        AnonymousClass1Nd.A00(this.A02).A01(this, 1qJ.class);
    }

    public final void A02() {
        if (this.A03) {
            A00();
        }
        AnonymousClass1Nd.A00(this.A02).A02(this, 1qJ.class);
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        1qJ r3 = (1qJ) obj;
        0qQ.A0B(r3, 0);
        return this.A01.AJb(r3.A00);
    }

    public final void D6z(View view) {
        if (this.A04) {
            A01();
        }
    }

    public final void onCreate() {
        if (!this.A04) {
            A01();
        }
    }

    public final void onDestroy() {
        if (!this.A04) {
            A02();
        }
    }

    public final void onDestroyView() {
        if (this.A04) {
            A02();
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-29562701);
        1qJ r7 = (1qJ) obj;
        int A033 = AnonymousClass0fD.A03(-433159240);
        0qQ.A0B(r7, 0);
        if (r7.A01) {
            this.A01.DQv(r7.A00);
        } else {
            Handler handler = this.A00;
            handler.removeMessages(0);
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = r7.A00;
            handler.sendMessageDelayed(obtain, 100);
        }
        AnonymousClass0fD.A0A(853951192, A033);
        AnonymousClass0fD.A0A(-1948787642, A032);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass36D(UserSession userSession, AnonymousClass36F r3) {
        this(userSession, r3, false, false);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
    }
}
