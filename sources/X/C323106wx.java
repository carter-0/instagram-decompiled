package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6wx  reason: invalid class name and case insensitive filesystem */
public final class C323106wx implements AnonymousClass1GR {
    public boolean A00;
    public final 1P0 A01;
    public final UserSession A02;

    public final void DEO(C268654dm r5, AnonymousClass1QW r6) {
        0qQ.A0B(r5, 1);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailStreamingCallback.onFailed", -1044940199);
        }
        try {
            this.A01.onFail(r5);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(692882616);
            }
        }
    }

    public final /* synthetic */ void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* bridge */ /* synthetic */ void DTy(1XR r5, AnonymousClass1QW r6, AnonymousClass2ZK r7) {
        0qQ.A0B(r5, 2);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailStreamingCallback.onNewDataInBackground", 110551065);
        }
        try {
            this.A01.onSuccessInBackground(r5);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1770783410);
            }
        }
    }

    public final /* synthetic */ void DeX() {
    }

    public final void Den() {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public final void D58(AnonymousClass1QW r5, AnonymousClass2ZK r6) {
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailStreamingCallback.onComplete", -1467509814);
        }
        try {
            this.A01.onFinish();
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1412573538);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r7, AnonymousClass1QW r8, AnonymousClass2ZK r9) {
        AnonymousClass370 r72 = (AnonymousClass370) r7;
        0qQ.A0B(r72, 2);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailStreamingCallback.onNewData", 329667797);
        }
        try {
            this.A01.onSuccess(r72);
            User A002 = C324696zk.A00(r72);
            if (A002 != null && !this.A00) {
                this.A00 = true;
                AnonymousClass5CG.A00(this.A02).ENY(A002.A0J(), A002.getId());
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(296439779);
            }
        }
    }

    public C323106wx(1P0 r1, UserSession userSession) {
        this.A01 = r1;
        this.A02 = userSession;
    }
}
