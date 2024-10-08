package X;

import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

public final class JU0 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public JU0(LE1 le1, MXB mxb, int i, boolean z, boolean z2) {
        this.A02 = mxb;
        this.A03 = le1;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JU0)) {
                return false;
            }
            JU0 ju0 = (JU0) obj;
            if (ju0.A00 == 1 && this.A05 == ju0.A05 && 0qQ.A0K(this.A02, ju0.A02) && this.A04 == ju0.A04 && this.A01 == ju0.A01 && 0qQ.A0K(this.A03, ju0.A03)) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof JU0)) {
                return false;
            }
            JU0 ju02 = (JU0) obj;
            if (ju02.A00 == 0 && 0qQ.A0K(this.A02, ju02.A02) && 0qQ.A0K(this.A03, ju02.A03) && this.A05 == ju02.A05 && this.A04 == ju02.A04 && this.A01 == ju02.A01) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A09;
        int i;
        if (this.A00 != 0) {
            A09 = (AnonymousClass7TF.A09(this.A04, (C51965G9l.A05(this.A05) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A01) * 31;
            i = this.A03.hashCode();
        } else {
            A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TG.A0C(this.A02) * 31)));
            i = this.A01;
        }
        return A09 + i;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ThreadsXpostUiState(linkedBarcelonaProfile=");
        A1A.append(this.A02);
        A1A.append(", stateHolder=");
        A1A.append(this.A03);
        A1A.append(", isUnlinkedUser=");
        A1A.append(this.A05);
        A1A.append(", isRowAvailable=");
        A1A.append(this.A04);
        A1A.append(", _counterToTriggerObserver=");
        return C51975G9x.A0j(A1A, this.A01);
    }

    public JU0(AnonymousClass7FE r2, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, int i, boolean z, boolean z2) {
        this.A05 = z;
        this.A02 = privacyMediaOverlayViewModel;
        this.A04 = z2;
        this.A01 = i;
        this.A03 = r2;
    }
}
