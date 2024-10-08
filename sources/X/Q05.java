package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.Map;

public abstract class Q05 {
    public static C307456Qe A00(C307896Rx r2) {
        C307456Qe r0 = r2.A04;
        if (r0 != null) {
            return r0;
        }
        C307786Rm r02 = r2.A03;
        if (r02 != null) {
            C307446Qd A02 = C307476Qg.A02(r02);
            C245983dn.A02("Tree resources can only be read from the UI Thread");
            return A02.A04.A07((Map) null, A02.A08);
        }
        throw new NullPointerException("No tree resources available in the Scripting Environment. This is an infra error that you should post in the Bloks Q&A group about.");
    }

    public static AnonymousClass9G2 A01(C307896Rx r1, String str) {
        AnonymousClass9G2 r0 = (AnonymousClass9G2) A00(r1).A04.get(str);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TF.A0W(002.A0g("Payload for referenced embedded payload id ", str, " not found!"), "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.");
    }

    public static BloksScript A02(C307896Rx r3, String str) {
        C3034268t r1 = A00(r3).A00;
        0qQ.A0B(str, 1);
        BloksScript bloksScript = (BloksScript) r1.A00.get(str);
        if (bloksScript != null) {
            BloksScript A00 = bloksScript.A00(r3.A02, r3.A0D);
            if (A00 instanceof C277004uH) {
                A00.ASe(r3.A00);
            }
            return A00;
        }
        throw new IllegalArgumentException(002.A0R("Expression for Script ID not found!", "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about."));
    }

    public static Object A03(C307896Rx r2, String str) {
        Object obj = A00(r2).A08.get(str);
        AnonymousClass6SD r0 = r2.A05;
        if (r0 != null) {
            r0.A7d(str);
        }
        return obj;
    }
}
