package X;

/* renamed from: X.6H0  reason: invalid class name */
public final class AnonymousClass6H0 implements AnonymousClass6H1 {
    public final /* synthetic */ C305216Gz A00;

    public AnonymousClass6H0(C305216Gz r1) {
        this.A00 = r1;
    }

    public final float EKW(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        C305216Gz r5 = this.A00;
        float floatValue = ((Number) r5.A05.invoke(Float.valueOf(f))).floatValue();
        C284945Oz r3 = r5.A03;
        boolean z = true;
        boolean z2 = false;
        if (floatValue > 0.0f) {
            z2 = true;
        }
        r3.Epw(Boolean.valueOf(z2));
        C284945Oz r1 = r5.A02;
        if (floatValue >= 0.0f) {
            z = false;
        }
        r1.Epw(Boolean.valueOf(z));
        return floatValue;
    }
}
