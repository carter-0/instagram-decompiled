package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.Example$$serializer;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3zp  reason: invalid class name and case insensitive filesystem */
public final class C258903zp implements C258913zq {
    public final C258883zn A00;
    public final AnonymousClass0JP A01;

    public C258903zp(AnonymousClass0JP r2, C258883zn r3) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final AnonymousClass40G CL1(String str, long j) {
        String A002;
        boolean z = false;
        0qQ.A0B(str, 0);
        AnonymousClass40G EJD = EJD(str);
        boolean z2 = false;
        if (!EJD.A02) {
            return AnonymousClass40H.A00(EJD, false);
        }
        if (this.A01.now() <= ((Number) EJD.A00).longValue() + (j * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) {
            z = true;
            z2 = true;
            A002 = null;
        } else {
            A002 = AnonymousClass000.A00(3962);
        }
        return new AnonymousClass40G(z2, A002, z);
    }

    public final AnonymousClass40G E6N(Long l, String str) {
        0qQ.A0B(str, 0);
        C258883zn r1 = this.A00;
        if (!((C258873zm) r1).A00.hasKey(str)) {
            return new AnonymousClass40G(Example.A03, "example not found in cache", false);
        }
        try {
            C250873mC r2 = C250863mB.A03;
            String string = r1.getString(str);
            C255463uA[] r0 = Example.A04;
            return new AnonymousClass40G(r2.A00(string, Example$$serializer.INSTANCE), (String) null, true);
        } catch (Exception unused) {
            return new AnonymousClass40G(Example.A03, "example not found in cache", false);
        }
    }

    public final List E6O(String str) {
        0qQ.A0B(str, 0);
        return 00l.A0R(this.A00.getString(002.A0R(str, "_exampleIds")), new String[]{","}, 0);
    }

    public final void EyX(Example example, String str, long j) {
        C258883zn r6 = this.A00;
        String A0T = 002.A0T(str, AnonymousClass000.A00(773), '_');
        TimeUnit timeUnit = TimeUnit.DAYS;
        long millis = timeUnit.toMillis(30);
        0qQ.A0B(A0T, 0);
        ((C258873zm) r6).E5K(A0T, String.valueOf(j), millis);
        C250873mC r3 = C250863mB.A03;
        C255463uA[] r2 = Example.A04;
        r6.E5K(str, r3.A02(example, Example$$serializer.INSTANCE), timeUnit.toMillis(30));
    }

    public final void EyZ(String str, List list) {
        0qQ.A0B(str, 0);
        this.A00.E5K(002.A0R(str, "_exampleIds"), 00k.A0P(",", "", "", list, (0sP) null), TimeUnit.DAYS.toMillis(30));
    }

    public final void Eya(Example example, String str, long j) {
        0qQ.A0B(str, 0);
        0qQ.A0B(example, 1);
        EyX(example, str, j);
    }

    public final AnonymousClass40G EJD(String str) {
        String A002 = AnonymousClass000.A00(3488);
        0qQ.A0B(str, 0);
        try {
            C258883zn r2 = this.A00;
            String A0T = 002.A0T(str, AnonymousClass000.A00(773), '_');
            0qQ.A0B(A0T, 0);
            return new AnonymousClass40G(Long.valueOf(Long.parseLong(((C258873zm) r2).getString(A0T))), (String) null, true);
        } catch (C258923zr | NumberFormatException unused) {
            return new AnonymousClass40G(-1L, A002, false);
        }
    }
}
