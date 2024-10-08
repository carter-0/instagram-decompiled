package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;

/* renamed from: X.7bW  reason: invalid class name and case insensitive filesystem */
public final class C334577bW implements 1wn {
    public final /* synthetic */ C334537bS A00;

    public C334577bW(C334537bS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(462178672);
        C240283Kh r14 = (C240283Kh) obj;
        int A032 = AnonymousClass0fD.A03(701643055);
        0qQ.A0B(r14, 0);
        C334537bS r3 = this.A00;
        1Xj r6 = r14.A00;
        AnonymousClass4DU r7 = r3.A0G;
        String A002 = C273654mx.A00(856);
        0lg r5 = r3.A0E;
        int i = -1;
        if (r6.A5D()) {
            i = 0;
        }
        C233822wX.A0Q(r5, r6, r7, (C249763kK) null, (Integer) null, (Integer) null, A002, i);
        Fragment fragment = r3.A01;
        I6Q.A00(fragment, r5, r6);
        FragmentActivity fragmentActivity = r3.A02;
        Bundle bundle = new Bundle();
        bundle.putString(AnonymousClass000.A00(228), r6.getId());
        AnonymousClass6W8 r62 = new AnonymousClass6W8(fragmentActivity, bundle, r5, ModalActivity.class, "likers_list");
        r62.A05 = AnonymousClass000.A00(3573);
        r62.A0C(fragment.requireContext());
        AnonymousClass0fD.A0A(1600426780, A032);
        AnonymousClass0fD.A0A(1505863896, A03);
    }
}
