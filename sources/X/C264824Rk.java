package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;

/* renamed from: X.4Rk  reason: invalid class name and case insensitive filesystem */
public final class C264824Rk extends Handler {
    public final /* synthetic */ AnonymousClass4R2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C264824Rk(Looper looper, AnonymousClass4R2 r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        AnonymousClass4R2 r5 = this.A00;
        Message message2 = message;
        int i = message2.what;
        boolean z = true;
        if (i == 0) {
            C264864Rp r6 = (C264864Rp) message2.obj;
            int i2 = message2.arg1;
            int i3 = message2.arg2;
            if (i3 == -1) {
                z = false;
            }
            int i4 = r5.A02 - i2;
            r5.A02 = i4;
            if (i4 == 0) {
                if (r6.A02 == -9223372036854775807L) {
                    r6 = r6.A01(r6.A05, 0, r6.A01, r6.A0D);
                }
                boolean z2 = false;
                if (r5.A0B.A03.A02() == 0) {
                    z2 = true;
                }
                if ((!z2 || r5.A0J) && r6.A03.A02() == 0) {
                    r5.A00 = 0;
                    r5.A01 = 0;
                    r5.A06 = 0;
                    r5.A05 = 0;
                }
                int i5 = 2;
                if (r5.A0J) {
                    i5 = 0;
                }
                boolean z3 = r5.A0K;
                r5.A0J = false;
                r5.A0K = false;
                AnonymousClass4R2.A02(r5, r6, i3, i5, z, z3);
            }
        } else if (i == 1) {
            AnonymousClass4P7 r2 = (AnonymousClass4P7) message2.obj;
            if (!r5.A0C.equals(r2)) {
                r5.A0C = r2;
                Iterator it = r5.A0b.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass4RS) it.next()).DXa(r2);
                }
            }
        } else if (i == 2) {
            C2612348u r22 = (C2612348u) message2.obj;
            r5.A07 = r22;
            Iterator it2 = r5.A0b.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass4RS) it2.next()).DXm(r22);
            }
        } else if (i == 3) {
            int i6 = r5.A03 - 1;
            r5.A03 = i6;
            if (i6 == 0) {
                r5.A0M = ((Boolean) message2.obj).booleanValue();
                Iterator it3 = r5.A0b.iterator();
                while (it3.hasNext()) {
                    AnonymousClass4RS r23 = (AnonymousClass4RS) it3.next();
                    boolean z4 = r5.A0M;
                    if (z4) {
                        r23.DXp(z4, r5.A0B.A00);
                    }
                }
            }
        } else if (i == 4) {
            Iterator it4 = r5.A0b.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        } else if (i == 5) {
            Iterator it5 = r5.A0b.iterator();
            while (it5.hasNext()) {
                ((AnonymousClass4RS) it5.next()).Dud((String) message2.obj);
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
