package X;

import com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor;

/* renamed from: X.Kov  reason: case insensitive filesystem */
public abstract class C62943Kov {
    public final C18751Vzm A00() {
        String A0R;
        String str;
        long j;
        if (this instanceof KSc) {
            A0R = "tree_model";
            str = "unknown";
            j = 0;
        } else {
            IgSignalsDcpPredictor igSignalsDcpPredictor = (IgSignalsDcpPredictor) this;
            A0R = 002.A0R("odin_", C63286KuV.A00(igSignalsDcpPredictor.A03));
            C63773L6f l6f = igSignalsDcpPredictor.A02;
            str = l6f.A02;
            j = l6f.A00;
        }
        return new C18751Vzm(A0R, str, j);
    }

    public final void A01(C65380LsL lsL, 0sP r9) {
        C65380LsL lsL2 = lsL;
        0sP r3 = r9;
        if (this instanceof KSc) {
            KSc kSc = (KSc) this;
            AnonymousClass7TE.A1Z(new C66929MfO(lsL2, r3, kSc, (AnonymousClass4D7) null, 29), kSc.A03);
            return;
        }
        IgSignalsDcpPredictor igSignalsDcpPredictor = (IgSignalsDcpPredictor) this;
        AnonymousClass7TE.A1Z(new MHE(lsL2, r3, igSignalsDcpPredictor, (AnonymousClass4D7) null, 46), igSignalsDcpPredictor.A07);
    }
}
