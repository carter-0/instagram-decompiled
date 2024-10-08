package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveHeartbeatApi;
import com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi;
import com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl;

/* renamed from: X.9JV  reason: invalid class name */
public final class AnonymousClass9JV extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JV(C324026yU r2, AnonymousClass4D7 r3) {
        super(r3);
        this.A03 = 4;
        this.A01 = r2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9JV) || ((AnonymousClass9JV) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9JV, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((IgLiveHeartbeatApi) this.A02).A00((Integer) null, (String) null, this);
            case 1:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RespectfulNudgeApi) this.A02).A02((UserSession) null, (String) null, this);
            case 2:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RespectfulNudgePluginImpl) this.A02).A02((0wc) null, (UserSession) null, (Integer) null, this);
            case 3:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((2No) this.A02).A00(this, false);
            case 4:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((C324026yU) this.A01).emit((Object) null, this);
            case 5:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((2Nv) this.A02).A01(this);
            default:
                this.A01 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                Object A022 = 1HR.A02(this, (1HR) this.A02);
                if (A022 != 1Hj.A02) {
                    return new 1Wq(A022);
                }
                return A022;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JV(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }
}
