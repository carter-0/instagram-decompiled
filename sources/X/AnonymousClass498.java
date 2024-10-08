package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.typedurl.ImageCacheKey;

/* renamed from: X.498  reason: invalid class name */
public final /* synthetic */ class AnonymousClass498 implements Runnable {
    public final /* synthetic */ AnonymousClass2iL A00;

    public /* synthetic */ AnonymousClass498(AnonymousClass2iL r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass2iL r2 = this.A00;
        if (!TextUtils.isEmpty(r2.A0Z)) {
            1NK r3 = r2.A0c;
            Context context = r3.A0C;
            AnonymousClass1Nu r6 = r3.A0F;
            String A0R = 002.A0R(((ImageCacheKey) r2.A0L.AjH()).A03, "_mini");
            ImageCacheKey imageCacheKey = new ImageCacheKey(A0R, A0R, -1, -1);
            String str = r2.A0Z;
            int i = r2.A0T;
            String str2 = r2.A0N;
            boolean z = false;
            if (r2.A03 > 0) {
                z = true;
            }
            AnonymousClass2l8 A002 = new AnonymousClass499(context, r6, imageCacheKey, str, str2, i, !z).A00();
            r2.A08 = A002;
            if (A002 != null && A002.A00 != null) {
                1NW r1 = r3.A0M;
                r1.sendMessage(r1.obtainMessage(6, r2));
            }
        }
    }
}
