package X;

import android.animation.Animator;

/* renamed from: X.GMk  reason: case insensitive filesystem */
public final class C52294GMk extends 0Yg implements 0sP {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ Animator A01;
    public final /* synthetic */ Animator A02;
    public final /* synthetic */ C376459Ib A03;
    public final /* synthetic */ 2V5 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52294GMk(Animator animator, Animator animator2, Animator animator3, C376459Ib r5, 2V5 r6, String str, C62320sa r8, boolean z, boolean z2) {
        super(1);
        this.A07 = z;
        this.A03 = r5;
        this.A05 = str;
        this.A04 = r6;
        this.A00 = animator;
        this.A08 = z2;
        this.A01 = animator2;
        this.A02 = animator3;
        this.A06 = r8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A07) {
            C376459Ib r2 = this.A03;
            String str = this.A05;
            if (C51971G9r.A1a(str, (0sP) r2.A00)) {
                C51967G9n.A19(this.A04, 1.0f);
            } else {
                this.A00.start();
                C51965G9l.A1W(r2.A01, str);
            }
        }
        if (this.A08) {
            this.A01.start();
            this.A02.start();
        }
        this.A06.invoke();
        return C60340gF.A00;
    }
}
