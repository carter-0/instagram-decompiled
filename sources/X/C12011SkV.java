package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.File;

/* renamed from: X.SkV  reason: case insensitive filesystem */
public final class C12011SkV implements 1v4 {
    public long A00;
    public File A01;
    public File A02;
    public File A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = false;
    public final int A08;
    public final Context A09;
    public final 1uw A0A;
    public final C67271si A0B;
    public final C67271si A0C;
    public final Class A0D;
    public final boolean A0E;
    public final C66891qr A0F;
    public final 1sY A0G;

    private synchronized void A00(long j, long j2) {
        synchronized (this) {
            if (!this.A06) {
                Context context = this.A09;
                1qQ A042 = 1ss.A00(context).A04(this.A0D.getName());
                int i = 19;
                if (this.A0A.A03 == AnonymousClass05K.A01) {
                    i = 18;
                }
                1z1.A00(new Q5w(this), context, Pxf.A0H(A042.ALR("JobRanReceiver", i)));
                this.A06 = true;
            }
            if (this.A04 == null) {
                if (!this.A05) {
                    this.A05 = true;
                    this.A00 = 1v1.A00(this.A09).A01(this.A08);
                }
                long j3 = j;
                if (this.A00 > j) {
                    long j4 = j2;
                    if (j == 0 && j2 == 0) {
                        A02();
                    } else {
                        1v1.A00(this.A09).A02(this.A0A, (String) null, this.A08, j3, j4);
                        this.A00 = j;
                    }
                }
            }
        }
    }

    public static synchronized void A01(C12011SkV skV) {
        synchronized (skV) {
            skV.A00 = Long.MAX_VALUE;
        }
    }

    public final void Crk() {
        C67271si r0;
        C67271si r02;
        synchronized (this) {
            this.A02 = this.A01;
        }
        if (14i.A08()) {
            r0 = this.A0B;
        } else {
            r0 = this.A0C;
        }
        long j = r0.A02;
        if (14i.A08()) {
            r02 = this.A0B;
        } else {
            r02 = this.A0C;
        }
        A00(j, r02.A00);
    }

    public final void Cro() {
        C67271si r0;
        C67271si r02;
        synchronized (this) {
            this.A03 = this.A01;
        }
        if (14i.A08()) {
            r0 = this.A0B;
        } else {
            r0 = this.A0C;
        }
        long j = r0.A03;
        if (14i.A08()) {
            r02 = this.A0B;
        } else {
            r02 = this.A0C;
        }
        A00(j, r02.A01);
    }

    public final synchronized void FHz() {
        A02();
    }

    public final synchronized void A02() {
        synchronized (this) {
            Context context = this.A09;
            C251413n4 A002 = 1v1.A00(context);
            int i = this.A08;
            A002.A01.cancel(i);
            A01(this);
            String A003 = AnonymousClass000.A00(1189);
            try {
                this.A04 = A003;
                if (!C67581ty.A00(context).A01()) {
                    C251423n5.A01().A02(context, (Bundle) null, this.A0A, new C251433n6(0, 0, A003), A003, i);
                } else {
                    try {
                        C251423n5 A012 = C251423n5.A01();
                        1uw r6 = this.A0A;
                        A012.A03(context, r6, A003, i, 300000, this.A0E);
                        this.A07 = true;
                        C251463n9.A00(context).A05(new C251443n7(context, (Bundle) null, (Messenger) null, r6, new C251433n6(0, 0, A003), A003, i), A003);
                    } catch (IllegalArgumentException e) {
                        th = C41845B3m.A0j(e);
                        throw th;
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final synchronized void CsG(String str) {
        synchronized (this) {
            try {
                this.A02 = null;
                this.A03 = null;
                Context context = this.A09;
                C251413n4 A002 = 1v1.A00(context);
                int i = this.A08;
                A002.A01.cancel(i);
                A01(this);
                String A003 = AnonymousClass000.A00(2829);
                this.A04 = A003;
                String str2 = str;
                if (!C67581ty.A00(context).A01()) {
                    C251423n5 A012 = C251423n5.A01();
                    1uw r14 = this.A0A;
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
                    A012.A02(context, A0a, r14, (C251433n6) null, A003, i);
                } else {
                    try {
                        C251463n9 A004 = C251463n9.A00(context);
                        Bundle A0a2 = AnonymousClass7TE.A0a();
                        A0a2.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
                        A004.A05(new C251443n7(context, A0a2, (Messenger) null, this.A0A, (C251433n6) null, A003, i), A003);
                    } catch (IllegalArgumentException e) {
                        th = C41845B3m.A0j(e);
                        throw th;
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void Ean(Object obj) {
        File file = (File) obj;
        synchronized (this) {
            this.A01 = file;
        }
    }

    public C12011SkV(Context context, C66891qr r3, 1uw r4, C67271si r5, C67271si r6, 1sY r7, Class cls, int i, boolean z) {
        this.A09 = context;
        this.A08 = i;
        this.A0A = r4;
        this.A0F = r3;
        this.A0D = cls;
        this.A0C = r5;
        this.A0B = r6;
        A01(this);
        this.A0E = z;
        this.A0G = r7;
    }

    public final void Crp(long j) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Crq(long[] jArr, int i, int i2) {
        throw AnonymousClass00P.createAndThrow();
    }
}
