package X;

import android.content.Context;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.67p  reason: invalid class name and case insensitive filesystem */
public final class C3031567p implements C3031367n {
    public final /* synthetic */ void Ezd() {
    }

    public final /* bridge */ /* synthetic */ void EpW(Object obj) {
        C3031167l r8 = (C3031167l) obj;
        0qQ.A0B(r8, 0);
        AnonymousClass1aS r0 = 1aD.A06;
        NetworkSession A00 = MsysInfraNoSqliteObjectHolder.A00();
        if (A00 != null) {
            if (182.A06(0Tu.A05, r8.A02, 36329088247545632L)) {
                C9826Rho rho = C11197SEx.A03;
                C11197SEx sEx = C11197SEx.A04;
                if (sEx == null) {
                    synchronized (rho) {
                        sEx = C11197SEx.A04;
                        if (sEx == null) {
                            sEx = new C11197SEx(A00);
                            C11197SEx.A04 = sEx;
                        }
                    }
                }
                Context context = r8.A00;
                if (!sEx.A02) {
                    AnonymousClass19S A02 = AnonymousClass1HX.A02(-4, 3);
                    C73566Pfn pfn = new C73566Pfn(context, sEx, (AnonymousClass4D7) null, 27);
                    1Eo.A03(AnonymousClass05K.A00, 19B.A00, pfn, A02);
                    return;
                }
                return;
            }
            AnonymousClass6AK r6 = AnonymousClass6AJ.A03;
            AnonymousClass6AJ r5 = AnonymousClass6AJ.A04;
            if (r5 == null) {
                synchronized (r6) {
                    r5 = AnonymousClass6AJ.A04;
                    if (r5 == null) {
                        r5 = new AnonymousClass6AJ(A00);
                        AnonymousClass6AJ.A04 = r5;
                    }
                }
            }
            Context context2 = r8.A00;
            AtomicBoolean atomicBoolean = r5.A02;
            if (!atomicBoolean.get()) {
                boolean A0F = C61970qY.A0F(context2);
                synchronized (r5) {
                    r5.A01.set(A0F);
                    Execution.executeAsync(new AnonymousClass6AL(r5, A0F), (AccountSession) null, 1);
                }
                C62670v5.A0B.A03(r5);
                atomicBoolean.set(true);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
