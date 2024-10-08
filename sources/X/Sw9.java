package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import com.facebook.location.platform.api.Location;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

public final class Sw9 implements C13630Tdw {
    public final Context A00;
    public final C9145RQw A01;
    public final C13969TmX A02;

    /* JADX INFO: finally extract failed */
    public final void EKM(C9144RQv rQv, int i, boolean z) {
        long j;
        Context context = this.A00;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(ReactWebViewManager.HTML_ENCODING)));
        C9144RQv rQv2 = rQv;
        C8311Qnr qnr = (C8311Qnr) rQv2;
        String str = qnr.A01;
        adler32.update(str.getBytes(Charset.forName(ReactWebViewManager.HTML_ENCODING)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        RE0 re0 = qnr.A00;
        allocate.putInt(C11149SCe.A00(re0));
        adler32.update(allocate.array());
        byte[] bArr = qnr.A02;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        int i2 = i;
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        String.format("Upload for context %s is already scheduled. Returning...", new Object[]{rQv2});
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((C12524SwA) this.A02).A03().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(C11149SCe.A00(re0))});
        try {
            if (rawQuery.moveToNext()) {
                j = rawQuery.getLong(0);
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            rawQuery.close();
            long longValue = valueOf.longValue();
            C9145RQw rQw = this.A01;
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(rQw.A00(re0, i2, longValue));
            Set set = ((C8313Qnt) ((RLs) ((C8314Qnu) rQw).A01.get(re0))).A02;
            if (set.contains(RE1.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(RE1.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(RE1.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", C11149SCe.A00(re0));
            if (bArr != null) {
                persistableBundle.putString(Location.EXTRAS, Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[]{rQv2, Integer.valueOf(value), Long.valueOf(rQw.A00(re0, i2, longValue)), valueOf, Integer.valueOf(i2)});
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public Sw9(Context context, C9145RQw rQw, C13969TmX tmX) {
        this.A00 = context;
        this.A02 = tmX;
        this.A01 = rQw;
    }
}
