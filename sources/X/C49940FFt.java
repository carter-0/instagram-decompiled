package X;

import com.facebook.dsp.core.ColorData;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;

/* renamed from: X.FFt  reason: case insensitive filesystem */
public final class C49940FFt {
    public EX7 A00 = C46471DfZ.A0O;
    public EX6 A01 = C46471DfZ.A0R;
    public C46627Di7 A02 = C46471DfZ.A0S;
    public C46626Di6 A03 = C46471DfZ.A0T;
    public CdsOpenScreenDismissCallback A04;
    public Integer A05 = AnonymousClass05K.A0C;

    public static C46471DfZ A02(VQZ vqz, EX7 ex7, EX6 ex6, C46627Di7 di7, C46626Di6 di6, CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback, Integer num, boolean z) {
        C49668F1a f1a = C46471DfZ.A0P;
        return new C46471DfZ(vqz, (ColorData) null, (ColorData) null, CdsBottomSheetDimmingBehaviour.Default.A00, (CdsBottomSheetTopSpan) null, ex7, (CdsOpenScreenConfig$BottomSheetMargins) null, EX5.SAME_SIZE, ex6, di7, di6, cdsOpenScreenDismissCallback, num, (Integer) null, (Integer) null, AnonymousClass05K.A00, (String) null, 16542, false, z, false, false, false, false);
    }

    public static C49940FFt A00() {
        C49940FFt fFt = new C49940FFt();
        fFt.A03 = C46626Di6.FULL_SCREEN;
        fFt.A02 = C46627Di7.DISABLED;
        return fFt;
    }

    public static C46471DfZ A01(C49940FFt fFt, Object obj, int i) {
        fFt.A04 = new CdsOpenScreenCallerDismissCallback(new C51112Foi(obj, i));
        return fFt.A03();
    }

    public final C46471DfZ A03() {
        C49668F1a f1a = C46471DfZ.A0P;
        Integer num = this.A05;
        C46627Di7 di7 = this.A02;
        C46626Di6 di6 = this.A03;
        EX7 ex7 = this.A00;
        EX6 ex6 = this.A01;
        return new C46471DfZ((VQZ) null, (ColorData) null, (ColorData) null, CdsBottomSheetDimmingBehaviour.Default.A00, (CdsBottomSheetTopSpan) null, ex7, (CdsOpenScreenConfig$BottomSheetMargins) null, EX5.SAME_SIZE, ex6, di7, di6, this.A04, num, (Integer) null, (Integer) null, AnonymousClass05K.A00, (String) null, 16542, false, false, false, false, false, false);
    }
}
