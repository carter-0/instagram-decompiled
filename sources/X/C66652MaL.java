package X;

import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.List;

/* renamed from: X.MaL  reason: case insensitive filesystem */
public final class C66652MaL implements AnonymousClass11X {
    public final AnonymousClass7SD A00;
    public final Integer A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public volatile List A05;
    public volatile List A06;
    public final /* synthetic */ C330287Me A07;

    public final String getName() {
        return "UpdateThreadRowsTask";
    }

    public final int getRunnableId() {
        return 303;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public C66652MaL(C330287Me r1, AnonymousClass7SD r2, Integer num, List list, List list2, List list3) {
        this.A07 = r1;
        this.A00 = r2;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A01 = num;
    }

    public final void onFinish() {
        IGFOAMessagingLocalSendSpeedLogger A002;
        if (!(this.A05 == null || this.A05.size() != 1 || ((AnonymousClass7LQ) this.A05.get(0)).A0e.A0f() == null || (A002 = C328727Fx.A00(this.A07.A06, Integer.valueOf(((AnonymousClass7LQ) this.A05.get(0)).A0e.A0f().hashCode()))) == null)) {
            A002.onLogFinishThreadRowUpdateTask();
        }
        C330287Me r1 = this.A07;
        r1.A00--;
        if (!r1.A03) {
            r1.A09.Dva(this.A00, this.A01, this.A05, this.A03, this.A06);
        }
    }

    public final void run() {
        IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger;
        List list = this.A02;
        if (list == null || list.size() != 1 || ((C254703su) list.get(0)).A0f() == null) {
            iGFOAMessagingLocalSendSpeedLogger = null;
        } else {
            iGFOAMessagingLocalSendSpeedLogger = C328727Fx.A00(this.A07.A06, Integer.valueOf(((C254703su) list.get(0)).A0f().hashCode()));
            if (iGFOAMessagingLocalSendSpeedLogger != null) {
                iGFOAMessagingLocalSendSpeedLogger.onLogScheduleThreadRowUpdateTaskEnd();
            }
        }
        List list2 = this.A04;
        if (list2 != null) {
            this.A06 = this.A07.A08.F03(this.A00, list2);
        }
        if (list != null) {
            if (iGFOAMessagingLocalSendSpeedLogger != null) {
                iGFOAMessagingLocalSendSpeedLogger.onLogGenerateMessageRowDataStart();
            }
            this.A05 = this.A07.A08.F03(this.A00, list);
            if (iGFOAMessagingLocalSendSpeedLogger != null) {
                iGFOAMessagingLocalSendSpeedLogger.onLogGenerateMessageRowDataEnd();
            }
        }
    }
}
