package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Do  reason: invalid class name and case insensitive filesystem */
public final class C375439Do {
    public static C375439Do A03;
    public static final C375449Dp A04 = new Object();
    public final Context A00;
    public final UserSession A01;
    public final Map A02;

    public C375439Do(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        0qQ.A07(synchronizedMap);
        this.A02 = synchronizedMap;
    }
}
