package X;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* renamed from: X.03s  reason: invalid class name and case insensitive filesystem */
public final class C586303s implements OnReceiveContentListener {
    public final AnonymousClass03R A00;

    public C586303s(AnonymousClass03R r1) {
        this.A00 = r1;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        AnonymousClass02h A002 = AnonymousClass02h.A00(contentInfo);
        AnonymousClass02h Dbd = this.A00.Dbd(view, A002);
        if (Dbd == null) {
            return null;
        }
        if (Dbd != A002) {
            return Dbd.A01();
        }
        return contentInfo;
    }
}
