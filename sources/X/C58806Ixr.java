package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1;

/* renamed from: X.Ixr  reason: case insensitive filesystem */
public final class C58806Ixr extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ LazyListState A03;
    public final /* synthetic */ C284945Oz A04;
    public final /* synthetic */ C54630HLn A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ C262224Cq A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58806Ixr(LazyListState lazyListState, C284945Oz r3, C54630HLn hLn, 0sP r5, C262224Cq r6, float f, float f2, float f3) {
        super(1);
        this.A06 = r5;
        this.A05 = hLn;
        this.A07 = r6;
        this.A03 = lazyListState;
        this.A04 = r3;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        this.A06.invoke(obj);
        C54630HLn hLn = this.A05;
        if (hLn == C54630HLn.MULTI || hLn == C54630HLn.SINGLE) {
            AnonymousClass7TE.A1Z(new IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1(this.A03, this.A04, (AnonymousClass4D7) null, this.A00, this.A01, this.A02), this.A07);
        }
        return C60340gF.A00;
    }
}
