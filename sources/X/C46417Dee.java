package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.Dee  reason: case insensitive filesystem */
public final class C46417Dee extends 1XP implements 1XU {
    public long A00 = -1;
    public AnonymousClass3UH A01;
    public AnonymousClass3UH A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public long A08 = -1;

    public final /* synthetic */ void EQF(String str) {
    }

    public final List A00() {
        List A032;
        AnonymousClass3UH r0 = this.A02;
        if (r0 != null) {
            boolean A072 = r0.A07();
            AnonymousClass3UH r02 = this.A02;
            if (!A072) {
                A032 = r02.A0M;
            } else {
                A032 = r02.A03();
            }
            if (A032 != null) {
                return A032;
            }
        }
        return Collections.emptyList();
    }

    public final long AjJ() {
        return this.A08;
    }

    public final long AjP() {
        return this.A00;
    }

    public final boolean CPt() {
        return AnonymousClass7TF.A1P((this.A00 > -1 ? 1 : (this.A00 == -1 ? 0 : -1)));
    }

    public final void EQE(long j) {
        this.A08 = j;
    }

    public final void EQG(long j) {
        this.A00 = j;
    }
}
