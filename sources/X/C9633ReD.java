package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.ReD  reason: case insensitive filesystem */
public abstract class C9633ReD {
    public static final void A00(Fragment fragment, C13451Tae tae) {
        String str;
        AnonymousClass7TG.A1N(tae, fragment);
        if (tae instanceof Su0) {
            0qQ.A07(AnonymousClass2E0.A02().A03.get());
            Su0 su0 = (Su0) tae;
            String str2 = su0.A01;
            Fragment A00 = ((C10987S3z) AnonymousClass2E0.A02().A02.get()).A00(su0.A00, str2);
            if (A00 != null) {
                C309516Yo A0M = DbS.A0M(fragment.requireActivity(), ((C10299Rpx) C66580MXl.A0s(AnonymousClass2E0.A02().A03)).A00);
                A0M.A0D(A00);
                A0M.A04();
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (tae instanceof C12420Sty) {
            C12420Sty sty = (C12420Sty) tae;
            0SM r1 = fragment.mParentFragment;
            if (r1 instanceof C8606Qxn) {
                str = "null cannot be cast to non-null type com.facebookpay.msc.bottomsheet.BSCBottomSheetDialogFragment";
            } else if (!(r1 instanceof QAM) || sty.A00) {
                DbS.A0M(fragment.requireActivity(), ((C10299Rpx) C66580MXl.A0s(AnonymousClass2E0.A02().A03)).A00).A06();
                return;
            } else {
                str = "null cannot be cast to non-null type com.facebookpay.msc.widget.dialog.BSCDialogFragment";
            }
            0qQ.A0C(r1, str);
            r1.A07();
        } else if (tae instanceof C12421Stz) {
            AnonymousClass2E0.A07().A00(fragment.requireContext(), ((C12421Stz) tae).A00);
        }
    }
}
