package X;

import android.content.Context;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;

/* renamed from: X.HIp  reason: case insensitive filesystem */
public final class C54554HIp extends C56604I4d {
    public static boolean A0B;
    public static final C55236HeR A0C = new Object();
    public C53017Gh8 A00;
    public C53036GhS A01;
    public WriteWithAICreationViewModel A02;
    public Integer A03 = AnonymousClass05K.A0C;
    public 0sP A04;
    public final C56564I1s A05;
    public final I45 A06;
    public final C56661I6q A07;
    public final C56095Hsi A08;
    public final AnonymousClass0eM A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54554HIp(Context context, FoaUserSession foaUserSession, C56095Hsi hsi, 0sP r6) {
        super(context, foaUserSession);
        0qQ.A0B(foaUserSession, 2);
        this.A08 = hsi;
        this.A04 = r6;
        C56568I1x i1x = hsi.A01;
        this.A06 = new I45(foaUserSession, i1x);
        this.A07 = new C56661I6q(i1x);
        this.A05 = C250563lf.A0B("IMPLEMENTATION").A00;
        this.A0A = C250563lf.A0B("IMPLEMENTATION").A03;
        this.A09 = AnonymousClass0eN.A00(0eO.A02, C58697Iw6.A00(context, foaUserSession, this, 29));
    }

    public static final I4X A00(C54554HIp hIp) {
        return new I4X(new CdsBottomSheetDimmingBehaviour.FixedAlpha(0.5f), C46626Di6.WRAP_CONTENT_SHEET, hIp.A03, AnonymousClass05K.A01, C58708IwH.A01(hIp, 33), 48, true);
    }

    public static final String A01(C54554HIp hIp) {
        C54562HIx hIx;
        String str;
        WriteWithAICreationViewModel writeWithAICreationViewModel = hIp.A02;
        if (writeWithAICreationViewModel == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        C54721HQa hQa = ((C56141HtT) writeWithAICreationViewModel.A0D.getValue()).A01;
        if (!(hQa instanceof C54562HIx) || (hIx = (C54562HIx) hQa) == null || (str = hIx.A00) == null) {
            return "";
        }
        return str;
    }

    public static final String A02(C54554HIp hIp) {
        C54562HIx hIx;
        String str;
        WriteWithAICreationViewModel writeWithAICreationViewModel = hIp.A02;
        if (writeWithAICreationViewModel == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        C54721HQa hQa = ((C56141HtT) writeWithAICreationViewModel.A0D.getValue()).A01;
        if (!(hQa instanceof C54562HIx) || (hIx = (C54562HIx) hQa) == null || (str = hIx.A01) == null) {
            return "";
        }
        return str;
    }
}
