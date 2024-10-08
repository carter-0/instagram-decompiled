package X;

import android.content.Context;

/* renamed from: X.Anh  reason: case insensitive filesystem */
public final class C41059Anh implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public C41059Anh(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    public final void run() {
        C59689JTv.A00(this.A00, this.A01, "prepopulate_audio_error", 0);
    }
}
