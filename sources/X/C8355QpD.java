package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;

/* renamed from: X.QpD  reason: case insensitive filesystem */
public final class C8355QpD extends AnonymousClass63I {
    public final /* bridge */ /* synthetic */ AnonymousClass647 A00(Context context, Looper looper, AnonymousClass63y r12, AnonymousClass640 r13, AnonymousClass643 r14, Object obj) {
        AnonymousClass643 r8 = r14;
        Integer num = r14.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable) null);
        if (num != null) {
            A0a.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        A0a.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        A0a.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        A0a.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        A0a.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        A0a.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        A0a.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        A0a.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        A0a.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new C8405QqA(context, A0a, looper, r12, r13, r8);
    }
}
