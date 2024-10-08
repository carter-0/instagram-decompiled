package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.facebook.common.build.BuildConstants;
import com.instagram.android.R;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.3R1  reason: invalid class name */
public final class AnonymousClass3R1 implements AnonymousClass3R2 {
    public final Context A00;
    public final 2Qi A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;

    public final /* synthetic */ PushChannelType B3t() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DOx() {
    }

    public final PushChannelType BiL() {
        return PushChannelType.FCM;
    }

    public final void CMj(1XZ r2, String str, boolean z) {
        this.A01.A00 = r2;
    }

    public final void CsW(C3733895d r5, Integer num) {
        2Qi r0 = this.A01;
        0qQ.A0B(num, 0);
        1XZ r2 = r0.A00;
        if (r2 != null) {
            r2.A02(r0.A01, PushChannelType.FCM, num, 0);
        }
        0nY.A00().ATE(new C3733795c(this, r5, num));
    }

    public final void EBN(Integer num) {
        if (C61970qY.A0E(this.A00)) {
            CsW((C3733895d) null, num);
        }
        2Qi r1 = this.A01;
        0qQ.A0B(num, 0);
        AnonymousClass2QH r12 = (AnonymousClass2QH) r1.A02.getValue();
        if (r12 != null) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("trigger", C3733595a.A00(num));
            long j = 2Qi.A03;
            long j2 = j + (j / 2);
            persistableBundle.putInt("__VERSION_CODE", BuildConstants.A01());
            if (j >= 0) {
                if (j2 < 0) {
                    throw new IllegalArgumentException("You must call setSoftMaximumLatencyMs(long) or setHardMaximumLatencyMs(long)");
                } else if (j2 <= j) {
                    throw new IllegalArgumentException("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
                }
            }
            if (j2 < 0 || j >= 0) {
                try {
                    Class A002 = AnonymousClass2QH.A00(r12, R.id.fcm_refresh_push_token_job_service_id);
                    if (A002 != null) {
                        Context context = r12.A03;
                        AnonymousClass2Qc A003 = AnonymousClass2Qc.A00(context);
                        synchronized (A003) {
                            ComponentName componentName = new ComponentName(context, A002);
                            try {
                                JobScheduler jobScheduler = r12.A01;
                                JobInfo.Builder builder = new JobInfo.Builder(R.id.fcm_refresh_push_token_job_service_id, componentName);
                                if (j > -1) {
                                    builder.setMinimumLatency(j);
                                }
                                builder.setRequiredNetworkType(1);
                                builder.setExtras(persistableBundle);
                                if (jobScheduler.schedule(builder.build()) > 0) {
                                    A003.A00.put(R.id.fcm_refresh_push_token_job_service_id, true);
                                }
                            } catch (IllegalArgumentException e) {
                                RV0.A00(componentName, context, e);
                            } catch (NullPointerException e2) {
                                if (!Build.MANUFACTURER.equalsIgnoreCase("OPPO") && !Build.BRAND.equalsIgnoreCase("OPPO")) {
                                    throw e2;
                                }
                            }
                        }
                    }
                } catch (IllegalArgumentException e3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Service not found exception: ");
                    sb.append(e3);
                    0wb.A03("FCMTokenJobService", sb.toString());
                }
            } else {
                throw new IllegalArgumentException("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
            }
        }
    }

    public AnonymousClass3R1(Context context, 2Qi r2, AnonymousClass0eM r3, AnonymousClass0eM r4) {
        this.A00 = context;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }
}
