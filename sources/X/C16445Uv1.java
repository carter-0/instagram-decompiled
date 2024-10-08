package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

/* renamed from: X.Uv1  reason: case insensitive filesystem */
public final class C16445Uv1 extends C15291UZw {
    public static final String __redex_internal_original_name = "FollowerMilestoneStickerFragment";
    public Bitmap A00;
    public String A01;
    public String A02;

    public final String getModuleName() {
        return C273654mx.A00(701);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(2082087316);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A01 = bundle2.getString(AnonymousClass000.A00(2430));
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                this.A02 = bundle3.getString(AnonymousClass000.A00(2432));
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null) {
                    String string = bundle4.getString(AnonymousClass000.A00(2431));
                    if (string != null) {
                        this.A00 = BitmapFactory.decodeFile(string);
                    }
                    AnonymousClass0fD.A09(-142539555, A022);
                    return;
                }
                illegalStateException = new IllegalStateException("Required value was null.");
                i = 861879108;
            } else {
                illegalStateException = new IllegalStateException("Required value was null.");
                i = 1677568888;
            }
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -401501130;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
