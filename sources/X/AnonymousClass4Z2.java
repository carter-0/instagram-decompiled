package X;

import android.content.Context;
import android.location.Location;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.stash.core.Stash;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Random;

/* renamed from: X.4Z2  reason: invalid class name */
public final class AnonymousClass4Z2 implements AnonymousClass1D3 {
    public final int A00;
    public final Context A01;
    public final 1DF A02;
    public final 1DI A03;
    public final 1Da A04;
    public final 0lg A05;
    public final Random A06 = new Random();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A00(0eO.A04, AnonymousClass4Z3.A00);
    public final boolean A08;
    public final boolean A09;
    public final 0wc A0A;
    public final String A0B;

    private final boolean A00(String str, long j) {
        if (str != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append('_');
                sb.append(str);
                String obj = sb.toString();
                AnonymousClass0eM r1 = this.A07;
                Object value = r1.getValue();
                0qQ.A07(value);
                if (((Stash) value).readResourceToMemory(obj) == null) {
                    Object value2 = r1.getValue();
                    0qQ.A07(value2);
                    byte[] bytes = "".getBytes(AnonymousClass15Q.A05);
                    0qQ.A07(bytes);
                    ((Stash) value2).write(obj, bytes);
                    return true;
                }
            } catch (IOException e) {
                0KC.A0F("IgPapayaLogger", "Error reading/writing from cache ", e);
                return true;
            }
        }
        return false;
    }

    public final void Chz(AnonymousClass3J4 r9) {
        1Wr r1;
        int i;
        String valueOf;
        0qQ.A0B(r9, 0);
        int i2 = this.A00;
        if (i2 > 0 && this.A06.nextInt(i2) == 0 && r9.A03.startupStatusOnAdded() == 0) {
            Context context = this.A01;
            if (!0qQ.A0K(C61970qY.A02(context).first, NetInfoModule.CONNECTION_TYPE_WIFI)) {
                try {
                    if (!14i.A08() && 1Wr.isLocationEnabled(context)) {
                        String str = null;
                        if (1Wr.isLocationPermitted(context, (UserSession) null, "IG_PAPAYA_LOGGER")) {
                            UserSession userSession = this.A05;
                            if ((userSession instanceof UserSession) && (r1 = 1Wr.A00) != null) {
                                0qQ.A0C(userSession, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                                Location lastLocation = r1.getLastLocation(userSession, "IgPapayaLogger");
                                if (lastLocation != null) {
                                    String A002 = RV8.A00(lastLocation.getLatitude(), lastLocation.getLongitude(), 14);
                                    if (this.A09) {
                                        str = RV8.A00(lastLocation.getLatitude(), lastLocation.getLongitude(), 16);
                                    }
                                    if (!(A002 == null && str == null)) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        long j = (currentTimeMillis / 86400000) * 86400000;
                                        boolean A003 = A00(A002, j);
                                        boolean A004 = A00(str, j);
                                        if (A003 || A004) {
                                            0wc r2 = this.A0A;
                                            0Aj A005 = r2.A00(r2.A00, "user_visitation_event_v2");
                                            A005.AAJ("quad_key_14", A002);
                                            A005.AAJ("quad_key_16", str);
                                            if (!this.A08) {
                                                valueOf = null;
                                            } else {
                                                1DF r0 = this.A02;
                                                if (r0 != null) {
                                                    i = r0.A00.getSimCarrierId();
                                                } else {
                                                    i = 0;
                                                }
                                                valueOf = String.valueOf(i);
                                            }
                                            A005.AAJ("carrier_id", valueOf);
                                            String A0b = this.A03.A0b();
                                            if (A0b == null || 00l.A0W(A0b)) {
                                                A0b = this.A04.A01();
                                            }
                                            A005.AAJ("mcc_mnc", A0b);
                                            A005.A9F("time_stamp_ms", Long.valueOf(currentTimeMillis));
                                            A005.AAJ("fa_task_metadata", this.A0B);
                                            A005.Cgf();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            0KC.A0C("IgPapayaLogger", "Error getting quadkeys");
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public AnonymousClass4Z2(Context context, 0lg r5) {
        this.A05 = r5;
        this.A01 = context;
        this.A0A = AnonymousClass0kN.A01(AnonymousClass1D4.A00, r5);
        1DI A002 = AnonymousClass1D8.A00();
        0qQ.A07(A002);
        this.A03 = A002;
        this.A02 = AnonymousClass1DA.A00(context, (AnonymousClass0eK) null);
        this.A04 = new 1Da(context);
        this.A09 = 0yU.A07(AnonymousClass0yP.A00(36330441162834565L));
        this.A08 = 0yU.A07(AnonymousClass0yP.A00(36330441162572419L));
        this.A00 = (int) 0yU.A01(AnonymousClass0yP.A00(36611916139075881L));
        this.A0B = 0yU.A03(AnonymousClass0yP.A00(36893391115912147L));
    }
}
