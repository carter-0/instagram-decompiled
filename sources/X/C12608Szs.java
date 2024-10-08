package X;

import com.facebook.common.locale.LocaleMember;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2;
import java.lang.reflect.Type;

/* renamed from: X.Szs  reason: case insensitive filesystem */
public final class C12608Szs implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;

    public C12608Szs(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public final Object apply(Object obj) {
        C250663lr r0;
        switch (this.A00) {
            case 0:
                SJM sjm = C11695Ses.A0X;
                return obj;
            case 1:
            case 4:
            case 9:
            case 11:
                return ((0sP) this.A01).invoke(obj);
            case 2:
                return ((LocaleMember) obj).A00.getISO3Country();
            case 3:
                return C11179SEf.A00((C11179SEf) this.A01, (String) obj);
            case 5:
                C256683wB r02 = FragmentedMp4Extractor2.A0X;
                return obj;
            case 6:
                ((AWU) this.A01).A01.set(obj);
                return obj;
            case 7:
                return ((R0m) this.A01).A00.A00.AXL(obj);
            case 8:
                return ((RDL) this.A01).A00((Type) obj);
            case 10:
                C250663lr r5 = (C250663lr) obj;
                C2818659w r3 = (C2818659w) this.A01;
                if (r5 != null) {
                    r0 = r5.A03(C7787QWy.class, "add_credit_card_proof_to_autofill(data:$input)", -1064166066);
                } else {
                    r0 = null;
                }
                r3.A02(C11097S9y.A00(String.valueOf(r0)));
                return C60340gF.A00;
            default:
                return null;
        }
    }

    public C12608Szs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
