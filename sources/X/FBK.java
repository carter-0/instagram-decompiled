package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public final class FBK {
    public final 1Zn A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C51773G1i.A00);
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C51774G1j.A00);

    public FBK(1Zn r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public static final boolean A00(FBK fbk) {
        if (!AnonymousClass7TF.A1Z(fbk.A01)) {
            return false;
        }
        if (C229632nm.A04(2SP.A00, new 2HY(1, DbX.A07(fbk.A02))) != 1) {
            return true;
        }
        return false;
    }

    public final void A01(AnonymousClass2Ep r5, Exception exc) {
        if (!A00(this)) {
            1Zp A002 = this.A00.A00(AnonymousClass05K.A1I, 817891655, 0, false);
            A002.A05(exc);
            String C6C = r5.C6C();
            if (C6C == null) {
                C6C = "null";
            }
            A002.A03(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C);
            A002.A04("is_group", r5.CUG());
            A002.A04(C273654mx.A00(771), r5.CQ2());
            A002.A03("member_ids", DbT.A0z(",", r5.BRV(), (0sP) null));
            A002.A03("system_folder", r5.C3d().name());
            A002.A00();
        }
    }
}
