package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.FrameLayout;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;

/* renamed from: X.SHo  reason: case insensitive filesystem */
public final class C11254SHo {
    public FrameLayout A00;
    public C12060Sln A01;
    public C13554TcQ A02;
    public C40161AUb A03;
    public boolean A04;
    public final Context A05;
    public final L36 A06;
    public final AESelfieCaptureConfig A07;
    public final C11120SAz A08;

    public static final Activity A00(Context context, C11254SHo sHo) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        0qQ.A07(baseContext);
        return A00(baseContext, sHo);
    }

    public final void A01() {
        C40161AUb aUb = this.A03;
        if (aUb != null) {
            aUb.pause();
        }
        Activity A002 = A00(this.A05, this);
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        Pxi.A1J(A002, 19E.A02(AnonymousClass12y.A00), 19);
    }

    public C11254SHo(Context context, L36 l36, C11120SAz sAz, AESelfieCaptureConfig aESelfieCaptureConfig) {
        C51972G9s.A1D(l36, sAz);
        this.A05 = context;
        this.A07 = aESelfieCaptureConfig;
        this.A06 = l36;
        this.A08 = sAz;
    }
}
