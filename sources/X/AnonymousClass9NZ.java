package X;

import java.io.IOException;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.9NZ  reason: invalid class name */
public final class AnonymousClass9NZ implements Runnable {
    public final /* synthetic */ AnonymousClass9NU A00;
    public final /* synthetic */ AnonymousClass9NS A01;
    public final /* synthetic */ PyE A02;
    public final /* synthetic */ Set A03;

    public AnonymousClass9NZ(AnonymousClass9NU r1, AnonymousClass9NS r2, PyE pyE, Set set) {
        this.A01 = r2;
        this.A03 = set;
        this.A00 = r1;
        this.A02 = pyE;
    }

    public final void run() {
        IOException iOException;
        try {
            AnonymousClass9NS r2 = this.A01;
            Set<String> set = this.A03;
            AnonymousClass9NU r4 = this.A00;
            Collection<2K0> collection = r2.A05;
            for (2K0 A06 : collection) {
                A06.A06(r4);
            }
            try {
                for (String str : set) {
                    iOException = null;
                    try {
                        for (2K0 A032 : collection) {
                            A032.A03(r4, str);
                        }
                        AnonymousClass2K3 r1 = r2.A03;
                        synchronized (r1) {
                            r1.A00.A04(str);
                        }
                        for (2K0 A022 : collection) {
                            A022.A02(r4, (IOException) null, str);
                        }
                    } catch (IOException e) {
                        try {
                            0KC.A0L("AppModuleActionQueryV2", "Exception while loading module %s", e, new Object[]{str});
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            iOException = e;
                        }
                    }
                }
                for (2K0 A0A : collection) {
                    A0A.A0A(r4, (IOException) null);
                }
                this.A02.A01(new C293175kI((C294495mY) null, (Exception) null, true));
                return;
                for (2K0 A023 : collection) {
                    A023.A02(r4, iOException, str);
                }
                throw th;
            } catch (IOException e2) {
                throw e2;
            } catch (Throwable th2) {
                for (2K0 A0A2 : collection) {
                    A0A2.A0A(r4, e2);
                }
                throw th2;
            }
        } catch (IOException e3) {
            this.A02.A01(new C293175kI(new C294495mY((Throwable) null, -1, false, false), e3, false));
        }
    }
}
