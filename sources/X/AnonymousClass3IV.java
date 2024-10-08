package X;

import android.app.PendingIntent;

/* renamed from: X.3IV  reason: invalid class name */
public enum AnonymousClass3IV {
    A06("action_batch_upload", 300000),
    A07("action_upload_retry", 3600000);
    
    public long A00;
    public PendingIntent A01;
    public boolean A02;
    public final String A03;

    /* access modifiers changed from: public */
    static {
        AnonymousClass3IV[] r0;
        A04 = 0oU.A00(r0);
    }

    /* access modifiers changed from: public */
    AnonymousClass3IV(String str, long j) {
        this.A03 = str;
        this.A00 = j;
    }
}
