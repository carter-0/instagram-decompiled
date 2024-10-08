package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;

public final class Sz0 implements C365558nJ {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass63Q A03;
    public final AnonymousClass63T A04;

    public Sz0(AnonymousClass63Q r1, AnonymousClass63T r2, int i, long j, long j2) {
        this.A04 = r2;
        this.A00 = i;
        this.A03 = r1;
        this.A01 = j;
        this.A02 = j2;
    }

    public static ConnectionTelemetryConfiguration A00(AnonymousClass63w r5, BaseGmsClient baseGmsClient, int i) {
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration;
        zzk zzk = baseGmsClient.A0Q;
        if (zzk == null) {
            connectionTelemetryConfiguration = null;
        } else {
            connectionTelemetryConfiguration = zzk.A02;
        }
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.A02) {
            int[] iArr = connectionTelemetryConfiguration.A04;
            if (iArr != null) {
                int i2 = 0;
                while (true) {
                    if (i2 < iArr.length) {
                        if (iArr[i2] == i) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            } else {
                int[] iArr2 = connectionTelemetryConfiguration.A05;
                if (iArr2 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < iArr2.length) {
                            if (iArr2[i3] == i) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (r5.A00 < connectionTelemetryConfiguration.A00) {
                return connectionTelemetryConfiguration;
            }
        }
        return null;
    }

    public final void D59(AnonymousClass9GD r20) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        AnonymousClass63T r4 = this.A04;
        if (r4.A08()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = C295525oN.A00().A00;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.A03) {
                AnonymousClass63w r9 = (AnonymousClass63w) r4.A09.get(this.A03);
                if (r9 != null) {
                    AnonymousClass647 r8 = r9.A04;
                    if (r8 instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) r8;
                        long j2 = this.A01;
                        boolean z = true;
                        long j3 = 0;
                        boolean A1R = AnonymousClass7TF.A1R((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)));
                        int i7 = baseGmsClient.A0E;
                        if (rootTelemetryConfiguration != null) {
                            A1R &= rootTelemetryConfiguration.A04;
                            i2 = rootTelemetryConfiguration.A01;
                            i3 = rootTelemetryConfiguration.A02;
                            i = rootTelemetryConfiguration.A00;
                            if (baseGmsClient.A0Q != null && !baseGmsClient.CQT()) {
                                ConnectionTelemetryConfiguration A002 = A00(r9, baseGmsClient, this.A00);
                                if (A002 != null) {
                                    if (!A002.A03 || j2 <= 0) {
                                        z = false;
                                    }
                                    i3 = A002.A00;
                                    A1R = z;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 5000;
                            i3 = 100;
                        }
                        AnonymousClass9GD r82 = r20;
                        if (r82.A0E()) {
                            i4 = 0;
                            i5 = 0;
                        } else {
                            if (r82.A05) {
                                i4 = 100;
                            } else {
                                Exception A05 = r82.A05();
                                if (A05 instanceof RKT) {
                                    Status status = ((RKT) A05).A00;
                                    i4 = status.A00;
                                    ConnectionResult connectionResult = status.A02;
                                    if (connectionResult != null) {
                                        i5 = connectionResult.A01;
                                    }
                                } else {
                                    i4 = 101;
                                }
                            }
                            i5 = -1;
                        }
                        if (A1R) {
                            j3 = j2;
                            long j4 = this.A02;
                            j = System.currentTimeMillis();
                            i6 = (int) Pxe.A0C(j4);
                        } else {
                            j = 0;
                            i6 = -1;
                        }
                        AnonymousClass7TE.A1S(r4.A06, new C10701Rwf(new MethodInvocation((String) null, (String) null, this.A00, i4, i5, i7, i6, j3, j), i, i3, (long) i2), 18);
                    }
                }
            }
        }
    }
}
