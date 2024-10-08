package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DmG  reason: case insensitive filesystem */
public final class C46840DmG extends 2Rw {
    public final C231422re A00;
    public final L2F A01;
    public final C46801Dld A02;

    public C46840DmG(L2F l2f) {
        0qQ.A0B(l2f, 1);
        this.A01 = l2f;
        C46801Dld dld = new C46801Dld(0);
        this.A02 = dld;
        this.A00 = new C231422re((C252303ot) dld, (2Rw) this);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46948Do2(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.internal_sticker_participant, false));
    }

    public final List A00() {
        Object obj;
        List<C47174Drp> list = this.A00.A02;
        ArrayList A15 = DbV.A15(list);
        for (C47174Drp drp : list) {
            if (!(drp == null || (obj = drp.A02) == null)) {
                A15.add(obj);
            }
        }
        return A15;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        C46948Do2 do2 = (C46948Do2) r7;
        0qQ.A0B(do2, 0);
        L2F l2f = this.A01;
        Object obj = this.A00.A02.get(i);
        0qQ.A07(obj);
        C47174Drp drp = (C47174Drp) obj;
        0qQ.A0B(drp, 2);
        IgTextView igTextView = do2.A00;
        igTextView.setText(drp.A03);
        C244273av.A0B(igTextView, drp.A05);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = do2.A01;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, new FUO(), (ImageUrl) drp.A01);
        gradientSpinnerAvatarView.setGradientSpinnerActivated(drp.A04);
        FPH.A00(gradientSpinnerAvatarView, l2f, drp, do2, 54);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(951919146);
        int size = this.A00.A02.size();
        AnonymousClass0fD.A0A(-1835978454, A03);
        return size;
    }
}
