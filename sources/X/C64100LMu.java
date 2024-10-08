package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LMu  reason: case insensitive filesystem */
public final class C64100LMu {
    public static final String[] A05 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    public C339797kB A00;
    public final Activity A01;
    public final Context A02;
    public final UserSession A03;
    public final C62926Koe A04;

    public C64100LMu(Activity activity, Context context, UserSession userSession, C62926Koe koe) {
        this.A01 = activity;
        this.A02 = context;
        this.A04 = koe;
        this.A03 = userSession;
    }
}
