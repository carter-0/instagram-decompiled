package X;

/* renamed from: X.GmV  reason: case insensitive filesystem */
public final class C53345GmV extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final C250973mM A03;
    public final C309426Yf A04;
    public final String A05 = "long_press_end";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53345GmV) {
                C53345GmV gmV = (C53345GmV) obj;
                if (!0qQ.A0K(this.A03, gmV.A03) || !0qQ.A0K(this.A05, gmV.A05) || Float.compare(this.A01, gmV.A01) != 0 || Float.compare(this.A02, gmV.A02) != 0 || !0qQ.A0K(this.A04, gmV.A04) || Float.compare(this.A00, gmV.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53345GmV(C250973mM r2, C309426Yf r3, float f, float f2, float f3) {
        this.A03 = r2;
        this.A01 = f;
        this.A02 = f2;
        this.A04 = r3;
        this.A00 = f3;
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0K(this.A03)), this.A01), this.A02)), this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LongPressGestureEventInfo(model=");
        A1A.append(this.A03);
        A1A.append(", gestureType=");
        A1A.append(this.A05);
        A1A.append(", xCoordinatePx=");
        A1A.append(this.A01);
        A1A.append(", yCoordinatePx=");
        A1A.append(this.A02);
        A1A.append(", reelItemState=");
        A1A.append(this.A04);
        A1A.append(", longPressStartTime=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
