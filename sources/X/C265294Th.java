package X;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4Th  reason: invalid class name and case insensitive filesystem */
public abstract class C265294Th {
    public final int A00;
    public final int A01;
    public final C256683wB A02;
    public final C264854Ro A03;

    public int A00() {
        if (this instanceof C265284Tg) {
            return ((C265284Tg) this).A00;
        }
        return ((AnonymousClass4XG) this).A07;
    }

    public boolean A01(C265294Th r6) {
        boolean z;
        boolean z2;
        int i;
        String str;
        int i2;
        if (this instanceof AnonymousClass4XG) {
            AnonymousClass4XG r2 = (AnonymousClass4XG) this;
            AnonymousClass4XG r62 = (AnonymousClass4XG) r6;
            if (!r2.A09 && !Util.A0I(r2.A02.A0W, r62.A02.A0W)) {
                return false;
            }
            if (r2.A08.A07) {
                return true;
            }
            if (r2.A0F != r62.A0F) {
                return false;
            }
            z = r2.A0E;
            z2 = r62.A0E;
        } else {
            C265284Tg r22 = (C265284Tg) this;
            C265284Tg r63 = (C265284Tg) r6;
            C264484Qb r3 = r22.A01;
            if (!r3.A02 && ((i2 = r22.A02.A06) == -1 || i2 != r63.A02.A06)) {
                return false;
            }
            if (!r3.A04 && ((str = r22.A02.A0W) == null || !TextUtils.equals(str, r63.A02.A0W))) {
                return false;
            }
            if (!r3.A05 && ((i = r22.A02.A0G) == -1 || i != r63.A02.A0G)) {
                return false;
            }
            if (r3.A03) {
                return true;
            }
            if (r22.A04 != r63.A04) {
                return false;
            }
            z = r22.A03;
            z2 = r63.A03;
        }
        if (z == z2) {
            return true;
        }
        return false;
    }

    public C265294Th(C264854Ro r2, int i, int i2) {
        this.A00 = i;
        this.A03 = r2;
        this.A01 = i2;
        this.A02 = r2.A04[i2];
    }
}
