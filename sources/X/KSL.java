package X;

public final class KSL extends AnonymousClass2xK {
    public final /* synthetic */ C314496iM A00;
    public final /* synthetic */ String A01;

    public KSL(C314496iM r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void DsH(AnonymousClass5Gv r5) {
        0xY A0s;
        int i;
        C314496iM r3 = this.A00;
        String str = this.A01;
        if (0qQ.A0K(str, "story_remix_reply")) {
            A0s = JTR.A0s(r3.A06);
            i = 2437;
        } else if (0qQ.A0K(str, AnonymousClass000.A00(372))) {
            A0s = JTR.A0s(r3.A06);
            i = 2438;
        } else {
            return;
        }
        A0s.E5T(C273654mx.A00(i), true);
        A0s.apply();
    }
}
