package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.JXp  reason: case insensitive filesystem */
public final class C59772JXp implements AnonymousClass8Q3 {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final C66505MUj A07;

    public final void Dxd(int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3.A00 != 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C59772JXp r3) {
        /*
            android.view.View r2 = r3.A04
            boolean r0 = r3.A02
            r1 = 1
            if (r0 != 0) goto L_0x0012
            int r0 = r3.A01
            if (r0 == r1) goto L_0x0012
            int r1 = r3.A00
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r1 == 0) goto L_0x0014
        L_0x0012:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0014:
            r2.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59772JXp.A00(X.JXp):void");
    }

    public final void CL9(boolean z) {
        AnonymousClass7TE.A1U(this.A06, z);
    }

    public final void Eto(AnonymousClass51R r5, boolean z, boolean z2) {
        ViewGroup viewGroup = this.A06;
        viewGroup.setVisibility(0);
        if (!this.A03) {
            this.A03 = true;
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new LZ1(this, 1));
        }
        A00(this);
        AnonymousClass7TG.A1A(viewGroup, z);
    }

    public C59772JXp(ViewGroup viewGroup, C66505MUj mUj) {
        AnonymousClass7TG.A1O(viewGroup, mUj);
        this.A06 = viewGroup;
        this.A07 = mUj;
        View A0G = AnonymousClass7TF.A0G(viewGroup, R.id.clips_review_delete_button);
        this.A04 = A0G;
        C61685KHt.A00(AnonymousClass7TE.A0m(A0G), this, 25);
        View requireViewById = viewGroup.requireViewById(R.id.clips_review_trim_button);
        this.A05 = requireViewById;
        C61685KHt.A00(AnonymousClass7TE.A0m(requireViewById), this, 26);
    }
}
