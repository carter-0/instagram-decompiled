package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0vL  reason: invalid class name and case insensitive filesystem */
public final class C62740vL implements AnonymousClass02f {
    public final ContentInfo.Builder A00;

    public final AnonymousClass02h AED() {
        return new AnonymousClass02h(new C62730vI(this.A00.build()));
    }

    public final void ERf(ClipData clipData) {
        this.A00.setClip(clipData);
    }

    public final void EWs(int i) {
        this.A00.setFlags(i);
    }

    public final void EcD(Uri uri) {
        this.A00.setLinkUri(uri);
    }

    public final void setExtras(Bundle bundle) {
        this.A00.setExtras(bundle);
    }

    public C62740vL(AnonymousClass02h r3) {
        this.A00 = new ContentInfo.Builder(r3.A01());
    }

    public C62740vL(ClipData clipData, int i) {
        this.A00 = new ContentInfo.Builder(clipData, i);
    }
}
