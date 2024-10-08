package X;

/* renamed from: X.JJs  reason: case insensitive filesystem */
public final class C59443JJs extends 0Yg implements 0sJ {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C47183Dry A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sK A09;
    public final /* synthetic */ 0sK A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59443JJs(AnonymousClass0iw r2, C47183Dry dry, String str, C62320sa r5, C62320sa r6, C62320sa r7, C62320sa r8, 0sP r9, 0sP r10, 0sK r11, 0sK r12, boolean z) {
        super(4);
        this.A01 = dry;
        this.A08 = r9;
        this.A09 = r11;
        this.A0A = r12;
        this.A07 = r10;
        this.A06 = r5;
        this.A05 = r6;
        this.A04 = r7;
        this.A03 = r8;
        this.A0B = z;
        this.A02 = str;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C61064Jw2 jw2;
        int A0M = AnonymousClass7TE.A0M(obj);
        HLK hlk = (HLK) obj2;
        C286575Wy r15 = (C286575Wy) obj3;
        int A0M2 = AnonymousClass7TE.A0M(obj4);
        0qQ.A0B(hlk, 1);
        if ((A0M2 & 6) == 0) {
            i = A0M2 | G9t.A05(r15, A0M);
        } else {
            i = A0M2;
        }
        if ((A0M2 & 48) == 0) {
            i |= G9t.A0P(r15, hlk);
        }
        if ((i & 147) != 146 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-164475262, "com.instagram.opal.impl.ui.OpalTabContent.<anonymous> (OpalTabContent.kt:102)");
            }
            C47183Dry dry = this.A01;
            int ordinal = ((HLK) dry.A08.get(A0M)).ordinal();
            if (ordinal == 0) {
                jw2 = dry.A03;
            } else if (ordinal == 1) {
                jw2 = dry.A02;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            0sP r12 = this.A08;
            0sK r9 = this.A09;
            0sK r8 = this.A0A;
            0sP r7 = this.A07;
            C62320sa r6 = this.A06;
            C62320sa r5 = this.A05;
            C62320sa r4 = this.A04;
            C62320sa r3 = this.A03;
            boolean z = this.A0B;
            String str = this.A02;
            C62320sa r24 = r3;
            C62320sa r23 = r4;
            C62320sa r22 = r5;
            C62320sa r21 = r6;
            String str2 = str;
            HLK hlk2 = hlk;
            AnonymousClass0iw r18 = this.A00;
            C61064Jw2 jw22 = jw2;
            C56592I2w.A00(r15, C51968G9o.A0O(), jw22, r18, hlk2, str2, r21, r22, r23, r24, r12, r7, r9, r8, (i << 24) & 1879048192, 3072, z);
            if (0fL.A02()) {
                0fL.A00(-1266220931);
            }
        } else {
            r15.Evl();
        }
        return C60340gF.A00;
    }
}
