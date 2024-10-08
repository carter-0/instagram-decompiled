package X;

import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0ye  reason: invalid class name and case insensitive filesystem */
public final class C63190ye extends 0VN {
    public boolean A00;

    public final int getSupportedProviders() {
        return ExternalProviders.A07.A01;
    }

    public final int getTracingProviders() {
        if (this.A00) {
            return ExternalProviders.A07.A01;
        }
        return 0;
    }

    public final void disable() {
        int A03 = AnonymousClass0fD.A03(-327011069);
        Systrace.A00 = 0;
        this.A00 = false;
        AnonymousClass0fD.A0A(334625755, A03);
    }

    public final void enable() {
        int A03 = AnonymousClass0fD.A03(-1921993945);
        Systrace.A00 = 4855650081448481L;
        this.A00 = true;
        AnonymousClass0fD.A0A(1149872055, A03);
    }
}
