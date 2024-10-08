package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.model.reels.Reel;

public final class KAU extends 1P0 {
    public final Context A00;
    public final Fragment A01;
    public final Reel A02;
    public final AnonymousClass6ST A03;
    public final boolean A04;
    public final /* synthetic */ C64501Ld2 A05;

    public KAU(Fragment fragment, C64501Ld2 ld2, Reel reel, boolean z) {
        this.A05 = ld2;
        this.A01 = fragment;
        Context requireContext = fragment.requireContext();
        this.A00 = requireContext;
        this.A04 = z;
        this.A03 = new AnonymousClass6ST(requireContext);
        this.A02 = reel;
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(1052427689);
        this.A03.dismiss();
        Context context = this.A00;
        C59689JTv.A03(context, context.getString(2131975944), "UpdateHighlight_unknown_error_occured", 0);
        AnonymousClass0fD.A0A(-1430250318, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(2133866167);
        Context context = this.A00;
        int i = 2131972143;
        if (this.A04) {
            i = 2131952463;
        }
        String string = context.getString(i);
        AnonymousClass6ST r0 = this.A03;
        r0.A00(string);
        AnonymousClass0fN.A00(r0);
        AnonymousClass0fD.A0A(-2017497324, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-917223137);
        K14 k14 = (K14) obj;
        int A033 = AnonymousClass0fD.A03(-977703694);
        this.A03.dismiss();
        Reel reel = this.A02;
        reel.getClass();
        C64501Ld2 ld2 = this.A05;
        1Xj r2 = ld2.A03;
        if (r2 != null) {
            boolean z = this.A04;
            String id = reel.getId();
            if (z) {
                r2.A4E(id);
            } else {
                r2.A4F(id);
            }
        }
        int i = 2131964349;
        if (this.A04) {
            i = 2131964348;
        }
        if (k14.A00 == null) {
            ld2.A00(reel.A07(), AnonymousClass7TF.A0e(this.A00.getResources(), reel.A0r, i));
            1OP.A05(ld2.A02).A0c(reel.getId());
        } else {
            Reel A0I = 1OP.A05(ld2.A02).A0I(k14.A00, true);
            ld2.A00(A0I.A07(), AnonymousClass7TF.A0e(this.A00.getResources(), reel.A0r, i));
            ld2.A01.A05(new AnonymousClass376(A0I));
        }
        JTU.A0o(this.A01);
        AnonymousClass0fD.A0A(61359834, A033);
        AnonymousClass0fD.A0A(-1217773782, A032);
    }
}
