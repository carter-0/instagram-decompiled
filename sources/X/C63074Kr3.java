package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.creation.MediaCaptureConfig;

/* renamed from: X.Kr3  reason: case insensitive filesystem */
public abstract class C63074Kr3 {
    public static final Object A00(C307896Rx r5) {
        FragmentActivity A04 = C308206Td.A04(r5);
        AnonymousClass36U A00 = AnonymousClass36R.A00(A04, C308206Td.A0B(r5), new C50348FZf(A04, 0));
        AnonymousClass36W r2 = AnonymousClass36W.FOLLOWERS_SHARE;
        JWU jwu = new JWU(r2);
        jwu.A0A = false;
        jwu.A0F = true;
        A00.Ewc(EXF.A0B, new MediaCaptureConfig(jwu), r2);
        return null;
    }
}
