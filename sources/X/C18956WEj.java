package X;

/* renamed from: X.WEj  reason: case insensitive filesystem */
public final class C18956WEj implements AnonymousClass08u {
    public float A00;
    public int A01 = -1;
    public final AnonymousClass08u A02;
    public final /* synthetic */ UFT A03;

    public C18956WEj(AnonymousClass08u r2, UFT uft) {
        this.A03 = uft;
        this.A02 = r2;
    }

    public final void onPageScrollStateChanged(int i) {
        if (!this.A03.A01) {
            this.A02.onPageScrollStateChanged(i);
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        UFT uft = this.A03;
        if (!uft.A01) {
            if (!(f == 0.0f && i2 == 0)) {
                i++;
            }
            08m adapter = uft.getAdapter();
            if (adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            if (f >= 0.0f || this.A00 <= 0.0f || (i3 = this.A01) != i) {
                this.A01 = i;
                this.A00 = f;
            } else {
                i = i3 + 1;
                this.A01 = i;
                this.A00 = 0.0f;
                f = 0.0f;
            }
            AnonymousClass08u r1 = this.A02;
            if (f > 0.0f) {
                f = 1.0f - f;
            }
            r1.onPageScrolled(i, f, i2);
        }
    }

    public final void onPageSelected(int i) {
        UFT uft = this.A03;
        if (!uft.A01) {
            AnonymousClass08u r1 = this.A02;
            08m adapter = uft.getAdapter();
            if (adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            r1.onPageSelected(i);
        }
    }
}
