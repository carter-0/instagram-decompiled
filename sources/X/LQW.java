package X;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;

public final class LQW {
    public final ContentResolver A00;
    public final Uri A01;
    public final C10549Ru3 A02;
    public final AnonymousClass1Tr A03;
    public final 1To A04;

    public LQW(ContentResolver contentResolver, C10549Ru3 ru3, AnonymousClass1Tr r4, 1To r5) {
        Uri uri = C64076LLu.A00;
        this.A02 = ru3;
        this.A00 = contentResolver;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = uri;
    }

    public static Bundle A00(Bundle bundle, LQW lqw) {
        Bundle A002 = S92.A00(lqw.A00, lqw.A01, bundle.deepCopy(), lqw.A02, "authenticate");
        C64076LLu lLu = C64076LLu.A01;
        S92.A01(A002, lqw.A03, "authenticate");
        return A002;
    }

    public static Bundle A01(Bundle bundle, LQW lqw) {
        Bundle A002 = S92.A00(lqw.A00, lqw.A01, bundle.deepCopy(), lqw.A02, "start");
        C64076LLu lLu = C64076LLu.A01;
        S92.A01(A002, lqw.A03, "start");
        return A002;
    }
}
