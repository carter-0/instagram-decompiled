package X;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.KAa  reason: case insensitive filesystem */
public final class C61495KAa extends 1P0 {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ EditMediaInfoFragment A03;

    public C61495KAa(EditMediaInfoFragment editMediaInfoFragment, String str, boolean z, boolean z2) {
        this.A03 = editMediaInfoFragment;
        this.A02 = z;
        this.A01 = z2;
        this.A00 = str;
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(1715772476);
        EditMediaInfoFragment editMediaInfoFragment = this.A03;
        FragmentActivity activity = editMediaInfoFragment.getActivity();
        String A012 = C347037wA.A01(r6);
        if (TextUtils.isEmpty(A012)) {
            A012 = DbV.A05(editMediaInfoFragment).getString(2131961521);
        }
        C59689JTv.A03(activity, A012, "edit_error", 0);
        AnonymousClass0fD.A0A(900496924, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-222286425);
        EditMediaInfoFragment.A0L(this.A03, false);
        AnonymousClass0fD.A0A(-512049995, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-1480582827);
        EditMediaInfoFragment.A0L(this.A03, true);
        AnonymousClass0fD.A0A(177562707, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = AnonymousClass0fD.A03(-950780963);
        C61290K1b k1b = (C61290K1b) obj;
        int A033 = AnonymousClass0fD.A03(-2066039261);
        EditMediaInfoFragment editMediaInfoFragment = this.A03;
        EditMediaInfoFragment.A0I(editMediaInfoFragment, k1b.A00);
        editMediaInfoFragment.A02.post(new M3E(this));
        String str2 = this.A00;
        if (str2 != null) {
            String str3 = editMediaInfoFragment.A0R;
            if (str3 != null) {
                AtomicBoolean atomicBoolean = 1Xj.A0i;
                str = 1Xv.A06(str3);
            } else {
                str = null;
            }
            27p.A01(editMediaInfoFragment.getSession()).A1w("SHARE_SHEET_REPLACE_AUDIO_DONE", str, str2);
        }
        1Xj r8 = k1b.A00;
        C354958Oa A002 = AnonymousClass8OY.A00(editMediaInfoFragment.getSession());
        String id = r8.getId();
        id.getClass();
        List A003 = A002.A00(id);
        List A3Y = r8.A3Y();
        1as.A04.A0G(editMediaInfoFragment.getSession(), "FEED", A3Y, A003);
        Iterator it = A3Y.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            DirectShareTarget directShareTarget = new DirectShareTarget(A0k);
            if (AnonymousClass8OY.A01(editMediaInfoFragment.getSession()) || (A003 != null && JTQ.A1T(A0k, A003))) {
                1as r1 = 1as.A04;
                editMediaInfoFragment.requireContext();
                r1.A0B(editMediaInfoFragment.getSession(), r8, directShareTarget);
            }
        }
        AnonymousClass0fD.A0A(2048372023, A033);
        AnonymousClass0fD.A0A(789132886, A032);
    }
}
