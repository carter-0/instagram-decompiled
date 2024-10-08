package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class MEM extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public Object A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEM(NJR njr, AnonymousClass4D7 r3, long j) {
        super(1, r3);
        this.A02 = 0;
        this.A04 = njr;
        this.A03 = j;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MEM, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MEM, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r11) {
        Object obj;
        long j;
        Object obj2;
        int i;
        AnonymousClass4D7 r6 = r11;
        switch (this.A02) {
            case 0:
                return new MEM((NJR) this.A04, r11, this.A03);
            case 1:
                obj = this.A04;
                j = this.A03;
                obj2 = this.A01;
                i = 1;
                break;
            default:
                obj = this.A04;
                j = this.A03;
                obj2 = this.A01;
                i = 2;
                break;
        }
        return new MEM(obj, obj2, r6, i, j);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MEM) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.MEM, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        NJR njr;
        C60340gF r0;
        C60340gF r02;
        switch (this.A02) {
            case 0:
                1Hj r3 = 1Hj.A02;
                if (this.A00 != 0) {
                    njr = (NJR) this.A01;
                    0eS.A00(obj);
                } else {
                    0eS.A00(obj);
                    njr = (NJR) this.A04;
                    long j = this.A03;
                    this.A01 = njr;
                    this.A00 = 1;
                    if (C241603Pv.A01(this, j) == r3) {
                        return r3;
                    }
                }
                Context context = njr.getContext();
                if (context == null) {
                    return null;
                }
                UserSession A05 = njr.A05();
                String str = njr.A08;
                Dba.A0j(1, A05, str);
                OZ3.A00(A05, "customer_details_tos_impression", str, 0Yt.A0E());
                1xC.A01.A00(new AnonymousClass3GS(new LD7(context, njr.A05(), new C65268LqN(njr)).A00()));
                return C60340gF.A00;
            case 1:
                1Hj r32 = 1Hj.A02;
                if (this.A00 != 0) {
                    0eS.A00(obj);
                } else {
                    0eS.A00(obj);
                    UserSession userSession = ((L7R) this.A04).A01;
                    long j2 = this.A03;
                    this.A00 = 1;
                    1NY A0a = AnonymousClass7TG.A0a(userSession);
                    A0a.A0A("mental_well_being/update_daily_limit_settings/");
                    A0a.A0D("daily_limit_length_in_sec", j2);
                    DbX.A1M(A0a, "entrypoint", "android_client_dl_update");
                    obj = A0a.A0M().A00(296496486, this);
                    if (obj == r32) {
                        return r32;
                    }
                }
                Object obj2 = obj;
                C63745L5d l5d = (C63745L5d) this.A01;
                C60340gF r5 = null;
                if (obj instanceof C239793Ih) {
                    if (l5d != null) {
                        2B0.A01.A0A(l5d.A01.A00, -1);
                        r0 = C60340gF.A00;
                    } else {
                        r0 = null;
                    }
                    obj2 = C41845B3m.A0d(r0);
                } else if (!(obj instanceof C297815sO)) {
                    throw AnonymousClass7TE.A1K();
                }
                if (obj2 instanceof C239793Ih) {
                    return obj2;
                }
                if (obj2 instanceof C297815sO) {
                    if (l5d != null) {
                        2B0.A01.A0A(l5d.A01.A00, l5d.A00);
                        r5 = C60340gF.A00;
                    }
                    return C41845B3m.A0c(r5);
                }
                throw AnonymousClass7TE.A1K();
            default:
                1Hj r33 = 1Hj.A02;
                if (this.A00 != 0) {
                    0eS.A00(obj);
                } else {
                    0eS.A00(obj);
                    UserSession userSession2 = ((LDL) this.A04).A00;
                    long j3 = this.A03;
                    this.A00 = 1;
                    1NY A0a2 = AnonymousClass7TG.A0a(userSession2);
                    A0a2.A0A("mental_well_being/update_take_a_break_controls/");
                    A0a2.A0D("break_reminder_length_in_sec", j3);
                    DbX.A1M(A0a2, "entrypoint", "android_client_tab_update");
                    obj = A0a2.A0M().A00(1527586101, this);
                    if (obj == r33) {
                        return r33;
                    }
                }
                Object obj3 = obj;
                MUY muy = (MUY) this.A01;
                long j4 = this.A03;
                C60340gF r4 = null;
                if (obj instanceof C239793Ih) {
                    if (muy != null) {
                        muy.DoA(j4);
                        r02 = C60340gF.A00;
                    } else {
                        r02 = null;
                    }
                    obj3 = C41845B3m.A0d(r02);
                } else if (!(obj instanceof C297815sO)) {
                    throw AnonymousClass7TE.A1K();
                }
                if (obj3 instanceof C239793Ih) {
                    return obj3;
                }
                if (obj3 instanceof C297815sO) {
                    if (muy != null) {
                        muy.DCb(j4);
                        r4 = C60340gF.A00;
                    }
                    return C41845B3m.A0c(r4);
                }
                throw AnonymousClass7TE.A1K();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEM(Object obj, Object obj2, AnonymousClass4D7 r4, int i, long j) {
        super(1, r4);
        this.A02 = i;
        this.A04 = obj;
        this.A03 = j;
        this.A01 = obj2;
    }
}
