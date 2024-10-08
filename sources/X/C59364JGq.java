package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.JGq  reason: case insensitive filesystem */
public final class C59364JGq extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0sP A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59364JGq(C284945Oz r2, String str, String str2, 0sP r5, int i) {
        super(3);
        this.A03 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r3 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-780475519, "com.instagram.aistudio.editor.AiConversationScreen.<anonymous>.<anonymous>.<anonymous> (AiConversationScreen.kt:58)");
            }
            String A002 = C288035bG.A00(r3, 2131952837);
            C285245Qk r4 = Modifier.A00;
            C284945Oz r11 = this.A01;
            C59485JLj jLj = (C59485JLj) r11.getValue();
            String str = this.A03;
            r3.ExS(-1663395334);
            int i = this.A00;
            boolean AGs = r3.AGs(i);
            String str2 = this.A02;
            boolean A1Z = C51965G9l.A1Z(r3, str2, AGs);
            0sP r10 = this.A04;
            boolean A1Z2 = C51965G9l.A1Z(r3, r10, A1Z);
            Object ECw = r3.ECw();
            if (A1Z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58770IxH(r10, r11, str2, i, 1);
                r3.FLL(ECw);
            }
            C51965G9l.A1X(r3, false);
            I7P.A06(r3, r4, jLj, Integer.valueOf(i), str, A002, (0sP) ECw, 2, Integer.MAX_VALUE, 1772544);
            if (0fL.A02()) {
                0fL.A00(1407441281);
            }
        } else {
            r3.Evl();
        }
        return C60340gF.A00;
    }
}
