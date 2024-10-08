package X;

import android.os.Looper;
import android.os.Message;

/* renamed from: X.Skn  reason: case insensitive filesystem */
public final class C12026Skn implements C274834pA {
    public static final C12026Skn A00 = new Object();

    public final void Ewt(Message message) {
        String A10;
        0qQ.A0B(message, 0);
        if (08j.A01()) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            if (message.getTarget() != null) {
                A1A.append(C66581MXm.A0y(message.getTarget()));
            }
            if (message.getCallback() != null) {
                A1A.append("/");
                A1A.append(C66581MXm.A0y(message.getCallback()));
            } else {
                A1A.append("/what:");
                A1A.append(message.what);
            }
            if (A1A.length() > 127) {
                A10 = A1A.substring(0, 127);
                0qQ.A0A(A10);
            } else {
                A10 = DbT.A10(A1A);
            }
            08j.A00(A10);
        }
    }

    public final void Ex8(Looper looper, String str) {
    }

    public final void AVV(Message message) {
        if (08j.A01()) {
            AnonymousClass08k.A00();
        }
    }

    public final void AVY() {
        if (08j.A01()) {
            AnonymousClass08k.A00();
        }
    }

    public final void ExE() {
        if (08j.A01()) {
            08j.A00("nativePollOnce");
        }
    }
}
