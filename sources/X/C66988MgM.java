package X;

import com.facebook.msys.mci.AuthData;

/* renamed from: X.MgM  reason: case insensitive filesystem */
public final class C66988MgM extends AnonymousClass0T0 implements C74247Prb {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final AuthData A05;
    public final C74549Pwi A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66988MgM) {
                C66988MgM mgM = (C66988MgM) obj;
                if (!(this.A08 == mgM.A08 && this.A07 == mgM.A07 && this.A09 == mgM.A09 && 0qQ.A0K(this.A06, mgM.A06) && this.A01 == mgM.A01 && this.A02 == mgM.A02 && this.A04 == mgM.A04 && 0qQ.A0K(this.A05, mgM.A05) && this.A00 == mgM.A00 && this.A03 == mgM.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A07, C51965G9l.A05(this.A08));
        return ((((C51972G9s.A07(this.A04, (((((AnonymousClass7TF.A09(this.A09, A092) + AnonymousClass7TG.A0C(this.A06)) * 31) + this.A01) * 31) + this.A02) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31) + this.A00) * 31) + this.A03;
    }

    public C66988MgM(AuthData authData, C74549Pwi pwi, int i, int i2, int i3, int i4, long j, boolean z, boolean z2, boolean z3) {
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A06 = pwi;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = j;
        this.A05 = authData;
        this.A00 = i3;
        this.A03 = i4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SecureThreadListLoadingState(isLoading=");
        A1A.append(this.A08);
        A1A.append(", isFirstLoadComplete=");
        A1A.append(this.A07);
        A1A.append(", isLoadingFromMsysUpdate=");
        A1A.append(this.A09);
        A1A.append(", threadList=");
        A1A.append(this.A06);
        A1A.append(", initialLimit=");
        A1A.append(this.A01);
        A1A.append(", pageSize=");
        A1A.append(this.A02);
        A1A.append(", oldestThreadLoadTimestamp=");
        A1A.append(this.A04);
        A1A.append(", authData=");
        A1A.append(this.A05);
        A1A.append(", folderType=");
        A1A.append(this.A00);
        A1A.append(", threadFolder=");
        return C51975G9x.A0j(A1A, this.A03);
    }
}
