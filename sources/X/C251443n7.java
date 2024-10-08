package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.os.PowerManager;
import com.facebook.common.build.BuildConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3n7  reason: invalid class name and case insensitive filesystem */
public final class C251443n7 {
    public static List A09;
    public PowerManager.WakeLock A00;
    public C251513nE A01;
    public final int A02;
    public final Context A03;
    public final Bundle A04;
    public final Messenger A05;
    public final 1uw A06;
    public final C251433n6 A07;
    public final String A08;

    public static C251443n7 A00(Context context, Bundle bundle) {
        C251433n6 r8;
        Bundle bundle2 = bundle;
        Messenger messenger = (Messenger) bundle2.getParcelable("_messenger");
        Bundle bundle3 = bundle2.getBundle("_extras");
        String string = bundle2.getString("_hack_action");
        int i = bundle2.getInt("_job_id", -1);
        if (i != -1) {
            Bundle bundle4 = bundle2.getBundle("_fallback_config");
            1uw r7 = new 1uw(bundle2.getBundle("_upload_job_config"));
            if (bundle4 != null) {
                r8 = new C251433n6(bundle4.getLong("min_delay_ms", -1), bundle4.getLong("max_delay_ms", -1), bundle4.getString("action"));
            } else {
                r8 = null;
            }
            return new C251443n7(context, bundle3, messenger, r7, r8, string, i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_job_id is ");
        sb.append(bundle2.get("_job_id"));
        throw new Exception(sb.toString());
    }

    public static List A01() {
        List list;
        synchronized (C251443n7.class) {
            list = A09;
            if (list == null) {
                list = Collections.synchronizedList(new ArrayList(1));
                A09 = list;
            }
        }
        return list;
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("_messenger", this.A05);
        bundle.putBundle("_extras", this.A04);
        bundle.putString("_hack_action", this.A08);
        1uw r3 = this.A06;
        Bundle bundle2 = new Bundle();
        bundle2.putString("uploader_class", r3.A0B);
        bundle2.putString("flexible_sampling_updater", r3.A08);
        bundle2.putString("privacy_policy", r3.A07);
        bundle2.putString("thread_handler_factory", r3.A09);
        bundle2.putString("upload_job_instrumentation", r3.A0A);
        bundle2.putString("priority_dir", r3.A02.getAbsolutePath());
        bundle2.putInt("network_priority", r3.A03.intValue());
        bundle2.putString("marauder_tier", r3.A06);
        bundle2.putInt("multi_batch_payload_size", r3.A01);
        bundle2.putInt("non_sticky_handling", r3.A0C ? 1 : 0);
        bundle2.putInt("use_fifo_uploads", r3.A0D ? 1 : 0);
        bundle2.putString("batch_payload_iterator_factory", r3.A04);
        bundle2.putString("acs_provider", r3.A00);
        bundle2.putString("ffdb_provider", r3.A05);
        bundle.putBundle("_upload_job_config", new Bundle(bundle2));
        bundle.putInt("_job_id", this.A02);
        C251433n6 r4 = this.A07;
        if (r4 != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("min_delay_ms", r4.A01);
            bundle3.putLong("max_delay_ms", r4.A00);
            bundle3.putString("action", r4.A02);
            bundle3.putInt("__VERSION_CODE", BuildConstants.A01());
            bundle.putBundle("_fallback_config", bundle3);
        }
        return bundle;
    }

    public C251443n7(Context context, Bundle bundle, Messenger messenger, 1uw r4, C251433n6 r5, String str, int i) {
        this.A05 = messenger;
        this.A04 = bundle;
        this.A08 = str;
        this.A06 = r4;
        this.A02 = i;
        this.A03 = context;
        this.A07 = r5;
    }
}
