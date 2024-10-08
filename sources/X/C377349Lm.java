package X;

import java.util.List;

/* renamed from: X.9Lm  reason: invalid class name and case insensitive filesystem */
public final class C377349Lm extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377349Lm(AnonymousClass7LM r2, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A03 = r2;
        switch (i3) {
            case 0:
            case 1:
            case 3:
                this.A02 = i;
                this.A01 = i2;
                break;
            default:
                this.A01 = i;
                this.A02 = i2;
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass7LM) this.A03).A01.notifyItemRangeChanged(this.A02, this.A01);
                break;
            case 1:
                ((AnonymousClass7LM) this.A03).A01.notifyItemRangeInserted(this.A02, this.A01);
                break;
            case 2:
                ((AnonymousClass7LM) this.A03).A01.notifyItemMoved(this.A01, this.A02);
                break;
            case 3:
                ((AnonymousClass7LM) this.A03).A01.notifyItemRangeRemoved(this.A02, this.A01);
                break;
            case 4:
                2aD r1 = 2aD.A09;
                int i = this.A02;
                2aX r3 = new 2aX(r1, (List) null, i, i);
                2aD r2 = 2aD.A0I;
                int i2 = this.A01;
                return 2aV.A00(0sr.A1P(new 2aX[]{r3, new 2aX(r2, (List) null, i2, i2)}), C294245m8.A00);
            default:
                AnonymousClass4M1 r4 = ((AnonymousClass4X8) this.A03).A00;
                C263814Nl r32 = r4.A0O;
                if (r32 != null && r4.A0M == AnonymousClass3OB.PLAYING) {
                    AnonymousClass4MF r22 = r4.A0o;
                    C263754Nf r0 = r32.A0B;
                    r22.EHB(AnonymousClass4M1.A00(r0, r4), r0.A03);
                    break;
                }
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377349Lm(Object obj, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
    }
}
