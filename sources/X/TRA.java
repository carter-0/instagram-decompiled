package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import com.facebook.analytics2.logger.legacy.uploader.HighPriUploadRetryReceiver;

public final class TRA extends Thread {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ HighPriUploadRetryReceiver A03;

    public TRA(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent, HighPriUploadRetryReceiver highPriUploadRetryReceiver) {
        this.A03 = highPriUploadRetryReceiver;
        this.A02 = intent;
        this.A01 = context;
        this.A00 = pendingResult;
    }

    public final void run() {
        try {
            Bundle extras = this.A02.getExtras();
            Context context = this.A01;
            C251443n7 A002 = C251443n7.A00(context, extras);
            C251463n9 A003 = C251463n9.A00(context);
            String A004 = AnonymousClass000.A00(1189);
            A003.A05(new C251443n7(context, (Bundle) null, (Messenger) null, A002.A06, new C251433n6(0, 0, A004), A004, A002.A02), A004);
            this.A00.finish();
        } catch (C258093yS e) {
            0KC.A0J("HighPriUploadRetryReceiver", "Exception when scheduling high pri upload via alarm", e);
        }
    }
}
