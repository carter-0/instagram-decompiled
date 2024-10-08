package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.GJf  reason: case insensitive filesystem */
public final class C52214GJf implements View.OnClickListener {
    public final /* synthetic */ GDB A00;

    public C52214GJf(GDB gdb) {
        this.A00 = gdb;
    }

    public final void onClick(View view) {
        1Xj r4;
        int A05 = AnonymousClass0fD.A05(541246441);
        GDB gdb = this.A00;
        gdb.A0H.A00("back_or_exit_button");
        JR1 jr1 = gdb.A0K;
        C52318GNk gNk = C52318GNk.ITEM_INTERACTION_NEW_PAGE;
        GD9 gd9 = gdb.A0M;
        jr1.AGC(gd9.A02(), gNk, C52317GNj.A06);
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        FragmentActivity fragmentActivity = gdb.A0D;
        AnonymousClass37D A01 = r0.A01(fragmentActivity);
        if (!gdb.A0E.A00() || A01 == null || !((AnonymousClass37F) A01).A0g) {
            fragmentActivity.onBackPressed();
        } else {
            C267324bN A02 = gd9.A02();
            if (!(A02 == null || (r4 = A02.A02) == null)) {
                GDT.A00(gdb.A0G, r4, gdb.A0J.A19, AnonymousClass000.A00(3708), "dismiss");
            }
            A01.A0S(AnonymousClass05K.A00);
        }
        AnonymousClass0fD.A0C(-1112270737, A05);
    }
}
