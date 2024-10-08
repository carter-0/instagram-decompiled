package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.M9x  reason: case insensitive filesystem */
public final class C66064M9x implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ 0hq A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C66064M9x(Intent intent, Uri uri, 0hq r3, String str, String str2) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = intent;
        this.A01 = uri;
        this.A02 = r3;
    }

    public final void run() {
        String str = this.A04;
        String str2 = this.A03;
        String type = this.A00.getType();
        Uri uri = this.A01;
        K0X k0x = new K0X();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A0a.putString("external_shared_text", str2);
        A0a.putString("share_type", type);
        A0a.putParcelable("external_uri", uri);
        k0x.setArguments(A0a);
        k0x.A0B(this.A02, "external_share_sheet_intent_handler_activity");
    }
}
