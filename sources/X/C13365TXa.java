package X;

import android.media.MediaCodecInfo;

/* renamed from: X.TXa  reason: case insensitive filesystem */
public final class C13365TXa extends 0Yg implements 0sP {
    public static final C13365TXa A00 = new C13365TXa();

    public C13365TXa() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = (MediaCodecInfo.CodecProfileLevel) obj;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('(');
        A1A.append(codecProfileLevel.profile);
        A1A.append(',');
        return C51975G9x.A0j(A1A, codecProfileLevel.level);
    }
}
