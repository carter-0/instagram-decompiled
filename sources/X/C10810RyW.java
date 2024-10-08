package X;

import android.content.Context;
import com.facebook.videolite.transcoder.resizer.DummySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.RyW  reason: case insensitive filesystem */
public final class C10810RyW {
    public DummySurface A00;
    public final Context A01;
    public final C11354SOn A02;
    public final C10796RyI A03;
    public final C9608Rdm A04;
    public final C7334Q4k A05;
    public final C13726Tfw A06;
    public final Map A07;

    public C10810RyW(Context context, C11354SOn sOn, C10796RyI ryI, C9608Rdm rdm, C7334Q4k q4k, C13726Tfw tfw, Q1G q1g) {
        this.A03 = ryI;
        this.A06 = tfw;
        this.A01 = context;
        this.A02 = sOn;
        this.A05 = q4k;
        this.A04 = rdm;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        this.A07 = A1H;
        if (q1g != null) {
            C51967G9n.A1O(q1g, A1H, 0);
        }
    }
}
