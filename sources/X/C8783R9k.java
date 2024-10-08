package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.R9k  reason: case insensitive filesystem */
public final class C8783R9k extends 2Cl {
    public final int A00;
    public final Object A01;

    public C8783R9k(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00(List list) {
        ArrayList A1C;
        C8776R9c r9c = (C8776R9c) this.A01;
        List list2 = r9c.A00;
        if (list2 != null) {
            A1C = AnonymousClass7TE.A1D(list2);
        } else {
            A1C = AnonymousClass7TE.A1C();
        }
        if (list == null) {
            list = AnonymousClass7TE.A1C();
        }
        r9c.A00 = list;
        if (!A1C.equals(list)) {
            C13676Tel tel = r9c.A03;
            List list3 = r9c.A00;
            if (list3 != null && tel != null) {
                tel.Ds3(list3);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context;
        AnonymousClass0aP r1;
        DataOutputStream dataOutputStream;
        switch (this.A00) {
            case 0:
                C10706Rwk rwk = (C10706Rwk) this.A01;
                synchronized (rwk) {
                    C227082ic AR2 = rwk.A02.AR2("previous_session");
                    0Zt A002 = rwk.A00.A00();
                    if (!(AR2.A00 == null || A002 == null)) {
                        AnonymousClass3Ey r4 = (AnonymousClass3Ey) AR2.A00();
                        try {
                            dataOutputStream = new DataOutputStream(r4);
                            0Rg r2 = rwk.A01;
                            dataOutputStream.writeShort(251);
                            dataOutputStream.writeShort(2);
                            dataOutputStream.writeLong(r2.A00());
                            r2.A01(A002, dataOutputStream);
                            dataOutputStream.writeBoolean(14i.A08());
                            dataOutputStream.flush();
                            r4.flush();
                            r4.A03();
                            dataOutputStream.close();
                        } catch (IOException e) {
                            try {
                                0wb.A07("BatteryMetricsPersistentCache", e);
                            } catch (Throwable th) {
                                r4.A02();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            C9153RRe.A00(th, th2);
                            break;
                        }
                        r4.A02();
                    }
                }
                return null;
            case 1:
                E3Y e3y = (E3Y) this.A01;
                context = e3y.getContext();
                r1 = e3y.A05;
                break;
            case 2:
                E54 e54 = (E54) this.A01;
                if (e54.getContext() != null) {
                    context = e54.getContext();
                    String str = E54.A0X;
                    r1 = e54.A06;
                    break;
                } else {
                    throw new Exception("the context should not bu null.");
                }
            case 3:
                C8776R9c r9c = (C8776R9c) this.A01;
                context = r9c.A01;
                if (context != null) {
                    r1 = r9c.A02;
                    break;
                } else {
                    return AnonymousClass7TE.A1C();
                }
            default:
                try {
                    return C11205SFf.A00(((Fragment) this.A01).requireContext());
                } catch (IllegalStateException e2) {
                    onFail(e2);
                    return null;
                }
        }
        return FH1.A02(context, (AnonymousClass0iw) null, r1, (String) null);
        throw th;
    }

    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 266;
            case 1:
                return 270;
            case 2:
                return 269;
            case 3:
                return C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION;
            default:
                return 443;
        }
    }

    public final void onFail(Exception exc) {
        String str;
        switch (this.A00) {
            case 0:
                str = "BatteryMetricsPersistentCache";
                break;
            case 3:
                A00(AnonymousClass7TE.A1C());
                return;
            case 4:
                ESF.A07((ESF) this.A01, true);
                str = "omvp_app_updates";
                break;
            default:
                C8783R9k.super.onFail(exc);
                return;
        }
        0wb.A07(str, exc);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                1ES.A04(((C10706Rwk) this.A01).A03, 267, 3, 600000, true, true);
                return;
            case 1:
                ((E3Y) this.A01).A0S = (List) obj;
                return;
            case 2:
                String str = E54.A0X;
                ((E54) this.A01).A0F = (List) obj;
                return;
            case 3:
                A00((List) obj);
                return;
            default:
                ESF esf = (ESF) this.A01;
                esf.A00 = (C11205SFf) obj;
                ESF.A07(esf, false);
                return;
        }
    }
}
