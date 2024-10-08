package X;

/* renamed from: X.Xvr  reason: case insensitive filesystem */
public final class C22127Xvr implements C231452rh {
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03 = 1;
    public int A04;
    public final C22558YAp A05;
    public final C22558YAp A06;
    public final C231452rh A07;

    public C22127Xvr(C22558YAp yAp, C22558YAp yAp2, C231452rh r5) {
        this.A06 = yAp;
        this.A05 = yAp2;
        this.A07 = r5;
        this.A02 = yAp.Bcr();
        this.A00 = yAp.Bcq();
        this.A04 = yAp.Bzs();
    }

    public final void D1O(int i, int i2, Object obj) {
        this.A07.D1O(i + this.A02, i2, obj);
    }

    public final void DKr(int i, int i2) {
        if (i >= this.A04 && this.A01 != 2) {
            int min = Math.min(i2, this.A00);
            if (min > 0) {
                this.A01 = 3;
                this.A07.D1O(this.A02 + i, min, C21242XQn.PLACEHOLDER_TO_ITEM);
                this.A00 -= min;
            }
            int i3 = i2 - min;
            if (i3 > 0) {
                this.A07.DKr(i + min + this.A02, i3);
            }
        } else if (i > 0 || this.A03 == 2) {
            this.A07.DKr(i + this.A02, i2);
        } else {
            int i4 = this.A02;
            int min2 = Math.min(i2, i4);
            if (min2 > 0) {
                this.A03 = 3;
                this.A07.D1O((-min2) + i4, min2, C21242XQn.PLACEHOLDER_TO_ITEM);
                i4 = this.A02 - min2;
                this.A02 = i4;
            }
            int i5 = i2 - min2;
            if (i5 > 0) {
                this.A07.DKr(i4, i5);
            }
        }
        this.A04 += i2;
    }

    public final void DSU(int i, int i2) {
        C231452rh r1 = this.A07;
        int i3 = this.A02;
        r1.DSU(i + i3, i2 + i3);
    }

    public final void Ddf(int i, int i2) {
        if (i + i2 >= this.A04 && this.A01 != 3) {
            int min = Math.min(this.A05.Bcq() - this.A00, i2);
            if (min < 0) {
                min = 0;
            }
            int i3 = i2 - min;
            if (min > 0) {
                this.A01 = 2;
                this.A07.D1O(this.A02 + i, min, C21242XQn.ITEM_TO_PLACEHOLDER);
                this.A00 += min;
            }
            if (i3 > 0) {
                this.A07.Ddf(i + min + this.A02, i3);
            }
        } else if (i > 0 || this.A03 == 3) {
            this.A07.Ddf(i + this.A02, i2);
        } else {
            int Bcr = this.A05.Bcr();
            int i4 = this.A02;
            int min2 = Math.min(Bcr - i4, i2);
            if (min2 < 0) {
                min2 = 0;
            }
            int i5 = i2 - min2;
            if (i5 > 0) {
                this.A07.Ddf(i4, i5);
            }
            if (min2 > 0) {
                this.A03 = 2;
                this.A07.D1O(this.A02, min2, C21242XQn.ITEM_TO_PLACEHOLDER);
                this.A02 += min2;
            }
        }
        this.A04 -= i2;
    }
}
