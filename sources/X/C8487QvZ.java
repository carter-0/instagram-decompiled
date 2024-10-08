package X;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.internal.gtm.zzce;
import com.google.android.gms.internal.gtm.zzcf;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.QvZ  reason: case insensitive filesystem */
public final class C8487QvZ extends C8492Qve {
    public zzce A00;
    public final SVX A01 = new SVX(this);
    public final SHG A02;
    public final C11233SGt A03;

    public static final void A00(C8487QvZ qvZ) {
        qvZ.A03.A00 = SystemClock.elapsedRealtime();
        qvZ.A02.A01(AnonymousClass7TE.A0R(SDN.A06.A00));
    }

    public C8487QvZ(C11381SQt sQt) {
        super(sQt);
        this.A03 = new C11233SGt(sQt.A04);
        this.A02 = new C8493Qvf(sQt, this);
    }

    public final void A0K() {
        C11200SFa.A00();
        A0J();
        try {
            AnonymousClass64D.A00().A02(this.A00.A00, this.A01);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.A00 != null) {
            this.A00 = null;
            C8481QvT qvT = this.A00.A06;
            C11381SQt.A02(qvT);
            qvT.A0J();
            C11200SFa.A00();
            C8490Qvc qvc = qvT.A00;
            C11200SFa.A00();
            qvc.A0J();
            ST5.A0B(qvc, "Service disconnected", 2);
        }
    }

    public final boolean A0L(C11250SHk sHk) {
        SNL snl;
        Parcel obtain;
        int A032;
        Parcel obtain2;
        AnonymousClass3Qk.A02(sHk);
        C11200SFa.A00();
        A0J();
        zzce zzce = this.A00;
        if (zzce == null) {
            return false;
        }
        if (sHk.A05) {
            snl = SDN.A0N;
        } else {
            snl = SDN.A0M;
        }
        String str = (String) snl.A00;
        List emptyList = Collections.emptyList();
        try {
            Map map = sHk.A04;
            long j = sHk.A02;
            zzcf zzcf = (zzcf) zzce;
            int A033 = AnonymousClass0fD.A03(-1871983851);
            int A034 = AnonymousClass0fD.A03(-2115548688);
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
            AnonymousClass0fD.A0A(-1648238637, A034);
            obtain.writeMap(map);
            obtain.writeLong(j);
            obtain.writeString(str);
            obtain.writeTypedList(emptyList);
            A032 = AnonymousClass0fD.A03(2049074816);
            obtain2 = Parcel.obtain();
            zzcf.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0fD.A0A(687312579, A032);
            AnonymousClass0fD.A0A(1728345890, A033);
            A00(this);
            return true;
        } catch (RemoteException unused) {
            ST5.A0B(this, "Failed to send hits to AnalyticsService", 2);
            return false;
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0fD.A0A(790498842, A032);
            throw th;
        }
    }
}
