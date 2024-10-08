package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class SHV {
    public static final C13698TfG A04 = new Object();
    public static final C9210RTn A05 = new Object();
    public final 02U A00;
    public final C9210RTn A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final Set A03 = AnonymousClass7TE.A1F();

    public final synchronized C13698TfG A00(Class cls, Class cls2) {
        C13698TfG tfG;
        try {
            ArrayList A1C = AnonymousClass7TE.A1C();
            boolean z = false;
            for (C10529Rti rti : this.A02) {
                Set set = this.A03;
                if (set.contains(rti)) {
                    z = true;
                } else if (rti.A02.isAssignableFrom(cls) && rti.A01.isAssignableFrom(cls2)) {
                    set.add(rti);
                    C13698TfG AEG = rti.A00.AEG(this);
                    C9217RTu.A00(AEG);
                    A1C.add(AEG);
                    set.remove(rti);
                }
            }
            if (A1C.size() > 1) {
                tfG = new C11938SjC(this.A00, A1C);
            } else if (A1C.size() == 1) {
                tfG = (C13698TfG) A1C.get(0);
            } else if (z) {
                tfG = A04;
            } else {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Failed to find any ModelLoaders for model: ");
                A1A.append(cls);
                throw new RuntimeException(AnonymousClass7TG.A0m(cls2, " and data: ", A1A));
            }
        } catch (Throwable th) {
            this.A03.clear();
            throw th;
        }
        return tfG;
    }

    public SHV(02U r3) {
        C9210RTn rTn = A05;
        this.A00 = r3;
        this.A01 = rTn;
    }
}
