package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.JkK  reason: case insensitive filesystem */
public final class C60369JkK extends C355538Qj {
    public int A00 = 12;
    public int A01 = -1;
    public int A02 = -1;
    public boolean A03;
    public final UserSession A04;
    public final C66508MUm A05;
    public final ClipsCreationViewModel A06;
    public final AnonymousClass8RF A07;

    public final int getMovementFlags(RecyclerView recyclerView, C249703kE r5) {
        int i;
        0qQ.A0B(r5, 1);
        AnonymousClass8RH A0E = this.A07.A0E();
        if (((!(A0E instanceof AnonymousClass8RG) || ((AnonymousClass8RG) A0E).A00) && !(A0E instanceof AnonymousClass8RU)) || (!(r5 instanceof C60691Jpc) && !(r5 instanceof KMZ))) {
            i = 0;
        } else {
            i = this.A00;
        }
        return C355538Qj.makeMovementFlags(i, 0);
    }

    public final int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        0qQ.A0B(recyclerView, 0);
        int signum = ((int) Math.signum((double) i2)) * 5;
        if (0 > j || j >= 1501) {
            return super.interpolateOutOfBoundsScroll(recyclerView, i, i2, i3, j);
        }
        return signum;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMove(androidx.recyclerview.widget.RecyclerView r8, X.C249703kE r9, X.C249703kE r10) {
        /*
            r7 = this;
            r6 = 0
            boolean r5 = X.C51973G9u.A1b(r8, r9, r10)
            X.8JI r1 = X.AnonymousClass8JI.SEQUENTIAL_REMIX
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r7.A06
            X.83H r0 = r0.A0L
            X.8J0 r0 = r0.A00
            if (r0 == 0) goto L_0x0028
            X.8JI r0 = r0.A03
            if (r1 != r0) goto L_0x0028
            int r0 = r9.getBindingAdapterPosition()
            int r0 = r0 / 2
            int r0 = r0 + -1
            if (r0 <= 0) goto L_0x0027
            int r0 = r10.getBindingAdapterPosition()
            int r0 = r0 / 2
            int r0 = r0 + -1
            if (r0 > 0) goto L_0x0028
        L_0x0027:
            return r6
        L_0x0028:
            boolean r0 = r10 instanceof X.C60691Jpc
            if (r0 != 0) goto L_0x0030
            boolean r0 = r10 instanceof X.C60590Jnz
            if (r0 == 0) goto L_0x0027
        L_0x0030:
            int r4 = r9.getBindingAdapterPosition()
            boolean r0 = r10 instanceof X.C60590Jnz
            r3 = 2
            if (r0 == 0) goto L_0x0072
            int r0 = r10.getBindingAdapterPosition()
            if (r0 == 0) goto L_0x0045
            int r0 = r10.getBindingAdapterPosition()
            int r3 = r0 + -2
        L_0x0045:
            int r2 = r7.A02
            r0 = -1
            if (r2 != r0) goto L_0x004d
            r7.A02 = r4
            r2 = r4
        L_0x004d:
            boolean r1 = r7.A03
            if (r1 == 0) goto L_0x0056
            if (r2 >= r3) goto L_0x0069
            r7.A03 = r6
            r1 = 0
        L_0x0056:
            if (r2 <= r3) goto L_0x0069
            if (r4 <= r3) goto L_0x005c
            r7.A03 = r5
        L_0x005c:
            r7.A01 = r3
            X.MUm r0 = r7.A05
            r0.Coh(r4, r3)
            if (r4 == r3) goto L_0x0068
            r8.performHapticFeedback(r5)
        L_0x0068:
            return r5
        L_0x0069:
            int r0 = r3 % 2
            if (r0 == 0) goto L_0x005c
            if (r1 == 0) goto L_0x005c
            int r3 = r3 + 1
            goto L_0x005c
        L_0x0072:
            int r3 = r10.getBindingAdapterPosition()
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60369JkK.onMove(androidx.recyclerview.widget.RecyclerView, X.3kE, X.3kE):boolean");
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    public final void onSelectedChanged(C249703kE r4, int i) {
        if (r4 != null && i == 2) {
            this.A05.DST(r4.getBindingAdapterPosition());
        } else if (i == 0) {
            this.A05.DSS(this.A02, this.A01);
            this.A02 = -1;
            this.A01 = -1;
            this.A03 = false;
        }
    }

    public C60369JkK(UserSession userSession, C66508MUm mUm, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r5) {
        this.A04 = userSession;
        this.A05 = mUm;
        this.A07 = r5;
        this.A06 = clipsCreationViewModel;
    }
}
