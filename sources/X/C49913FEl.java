package X;

import android.content.Context;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.FEl  reason: case insensitive filesystem */
public final class C49913FEl {
    public static C49913FEl A01;
    public 1NH A00;

    /* JADX WARNING: type inference failed for: r4v2, types: [X.FEl, java.lang.Object] */
    public static synchronized C49913FEl A00(Context context) {
        C49913FEl fEl;
        synchronized (C49913FEl.class) {
            C49913FEl fEl2 = A01;
            fEl = fEl2;
            if (fEl2 == null) {
                Context applicationContext = context.getApplicationContext();
                ? obj = new Object();
                obj.A00 = new 1NH(applicationContext, new C50246FVd(obj, 1), "registration_flow_extras");
                1xC.A01.A02(FXZ.A00(obj, 59), AnonymousClass08Z.class);
                A01 = obj;
                fEl = obj;
            }
        }
        return fEl;
    }

    public static C49913FEl A01(Fragment fragment, C48156EZy eZy, RegFlowExtras regFlowExtras) {
        regFlowExtras.A0N = eZy.A00.name();
        regFlowExtras.A03(regFlowExtras.A01());
        return A00(fragment.getContext());
    }

    public static void A02(Context context) {
        A00(context).A00.A04("reg_flow_extras_serialize_key");
    }

    public final void A03(0lg r10, RegFlowExtras regFlowExtras) {
        String str;
        regFlowExtras.A00 = System.currentTimeMillis();
        Parcel obtain = Parcel.obtain();
        regFlowExtras.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        RegFlowExtras regFlowExtras2 = (RegFlowExtras) RegFlowExtras.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        String str2 = null;
        regFlowExtras2.A0P = null;
        this.A00.A05("reg_flow_extras_serialize_key", regFlowExtras2);
        EXD A012 = regFlowExtras2.A01();
        C46634DiE diE = null;
        try {
            String str3 = regFlowExtras2.A0N;
            if (str3 != null) {
                diE = C46634DiE.valueOf(str3);
            }
        } catch (IllegalArgumentException unused) {
        }
        double A013 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r10), "reg_flow_extras_cached");
        Dbc.A0X(A0e, A013, A002);
        DbW.A11(A0e);
        if (A012 != null) {
            str = A012.A00;
        } else {
            str = null;
        }
        FH8.A0E(A0e, "flow", str);
        FH8.A0D(A0e, r10, "module", "waterfall_log_in");
        if (diE != null) {
            str2 = diE.A01;
        }
        DbS.A1H(A0e, str2);
        A0e.Cgf();
    }
}
