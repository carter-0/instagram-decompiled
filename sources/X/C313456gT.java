package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6gT  reason: invalid class name and case insensitive filesystem */
public final class C313456gT implements C313466gU, C313476gV {
    public int A00 = -1;
    public int A01 = -1;
    public final Map A02;
    public final Context A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C313486gW A06;
    public Set preparedMedias;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6gW, X.3ou] */
    public C313456gT(Context context, AnonymousClass0iw r5, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = r5;
        AnonymousClass4DU r52 = (AnonymousClass4DU) r5;
        0qQ.A0B(r52, 2);
        this.A06 = new C252313ou(userSession, r52, (String) null, false);
        this.preparedMedias = new LinkedHashSet();
        this.A02 = new ConcurrentHashMap();
    }

    public final void ECe(C255773uh r3) {
        if (r3.A0j != null) {
            ECQ(false);
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        int i3;
        if (i > Math.min(i2, 0)) {
            if (this.A00 + 1 >= this.A02.size()) {
                i3 = 0;
            } else {
                i3 = this.A00 + 1;
            }
            this.A00 = i3;
            A00();
        }
    }

    private final void A00() {
        1Xj r0;
        C54507HGt hGt;
        int i = this.A00;
        Set set = this.preparedMedias;
        Map map = this.A02;
        C54507HGt hGt2 = (C54507HGt) map.get(Integer.valueOf(i));
        if (hGt2 != null) {
            r0 = hGt2.A00;
        } else {
            r0 = null;
        }
        if (!00k.A0u(set, r0) && (hGt = (C54507HGt) map.get(Integer.valueOf(this.A00))) != null) {
            this.preparedMedias.contains(hGt.A00);
            this.A01 = this.A00;
        }
    }

    public final void Dxv(1Xj r5) {
        1Xj r0;
        if (r5 != null) {
            this.preparedMedias.add(r5);
            if (this.A00 != -1) {
                int i = this.A01;
                Set set = this.preparedMedias;
                C54507HGt hGt = (C54507HGt) this.A02.get(Integer.valueOf(i));
                if (hGt != null) {
                    r0 = hGt.A00;
                } else {
                    r0 = null;
                }
                if (00k.A0u(set, r0)) {
                    this.A00 = this.A01;
                    A00();
                    this.A01 = -1;
                }
            }
        }
    }

    public final void ECQ(boolean z) {
        this.preparedMedias.clear();
        this.A02.clear();
        this.A00 = -1;
    }

    public final void EIx() {
        if (this.A00 == -1) {
            this.A00 = 0;
        }
        A00();
    }

    public final void onCompletion() {
        int i;
        if (this.A00 + 1 >= this.A02.size()) {
            i = 0;
        } else {
            i = this.A00 + 1;
        }
        this.A00 = i;
        A00();
    }

    public final void pause() {
    }
}
