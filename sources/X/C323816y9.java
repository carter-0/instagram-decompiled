package X;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.6y9  reason: invalid class name and case insensitive filesystem */
public final class C323816y9 implements AnonymousClass08u {
    public int A00;
    public int A01;
    public final WeakReference A02;

    public final void onPageScrollStateChanged(int i) {
        this.A00 = this.A01;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r6.A0A(r9, r8, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r7.A00 == 1) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == 2) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r7.A00 == 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageScrolled(int r8, float r9, int r10) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.A02
            java.lang.Object r6 = r0.get()
            com.google.android.material.tabs.TabLayout r6 = (com.google.android.material.tabs.TabLayout) r6
            if (r6 == 0) goto L_0x0021
            int r5 = r7.A01
            r4 = 0
            r3 = 2
            r2 = 1
            if (r5 != r3) goto L_0x0016
            int r0 = r7.A00
            r1 = 0
            if (r0 != r2) goto L_0x0019
        L_0x0016:
            r1 = 1
            if (r5 != r3) goto L_0x001d
        L_0x0019:
            int r0 = r7.A00
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r4 = 1
        L_0x001e:
            r6.A0A(r9, r8, r1, r4)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323816y9.onPageScrolled(int, float, int):void");
    }

    public final void onPageSelected(int i) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.A02.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.A0c.size()) {
            int i2 = this.A01;
            if (i2 == 0 || (i2 == 2 && this.A00 == 0)) {
                z = true;
            } else {
                z = false;
            }
            tabLayout.A0F(tabLayout.A07(i), z);
        }
    }

    public C323816y9(TabLayout tabLayout) {
        this.A02 = new WeakReference(tabLayout);
    }
}
