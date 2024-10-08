package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;

/* renamed from: X.8Mb  reason: invalid class name and case insensitive filesystem */
public final class C354448Mb implements 1wn {
    public final /* synthetic */ AnonymousClass8ME A00;

    public C354448Mb(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        NewFundraiserInfo newFundraiserInfo;
        int A03 = AnonymousClass0fD.A03(-868489715);
        C354818Nm r4 = (C354818Nm) obj;
        int A032 = AnonymousClass0fD.A03(1518045599);
        0qQ.A0B(r4, 0);
        AnonymousClass8ME r3 = this.A00;
        C3499082j r9 = r4.A00;
        ArrayList A0T = r3.A1m.A0T(new AWN(AnonymousClass9X1.class));
        0qQ.A0B(A0T, 0);
        C347017w8 r8 = (C347017w8) 00k.A0J(A0T);
        if (r8 == null) {
            AnonymousClass8ME.A0Y(r3, r9);
            r3.A1B.E3H(new C39647A3n(r9));
        } else {
            0qQ.A0C(r8, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.RotatableDrawable");
            Object obj2 = r8.A03;
            if (!(!(obj2 instanceof C3499082j) || ((C3499082j) obj2).A01 == null || (newFundraiserInfo = r9.A01) == null)) {
                r8.A03 = r9;
                UserSession userSession = r3.A0r;
                Context context = r3.A0f;
                TargetViewSizeProvider targetViewSizeProvider = r3.A10;
                0qQ.A0B(context, 1);
                r3.EFO(r8, ABT.A00(context, userSession, targetViewSizeProvider, r9, 0sr.A1P(new String[]{"multiple_avatar_standalone_sticker_id", "standalone_fundraiser_sticker_id"})));
                FragmentActivity requireActivity = r3.A0l.requireActivity();
                String str = newFundraiserInfo.A01;
                str.getClass();
                String str2 = newFundraiserInfo.A07;
                LTV.A08(requireActivity, userSession, Integer.valueOf(newFundraiserInfo.A00), str, str2, newFundraiserInfo.A05, r3.A1p, newFundraiserInfo.A08);
            }
        }
        AnonymousClass0fD.A0A(259072209, A032);
        AnonymousClass0fD.A0A(-1167630158, A03);
    }
}
