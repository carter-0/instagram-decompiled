package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Dlu  reason: case insensitive filesystem */
public final class C46818Dlu extends 2Rw {
    public final C231422re A00;
    public final C46801Dld A01;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46949Do3(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.story_party_participant, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        C46949Do3 do3 = (C46949Do3) r6;
        0qQ.A0B(do3, 0);
        Object obj = this.A00.A02.get(i);
        0qQ.A07(obj);
        C47174Drp drp = (C47174Drp) obj;
        0qQ.A0B(drp, 1);
        IgTextView igTextView = do3.A00;
        igTextView.setText(drp.A03);
        C244273av.A0B(igTextView, drp.A05);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = do3.A01;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, new FUP(), (ImageUrl) drp.A02);
        gradientSpinnerAvatarView.setGradientSpinnerActivated(drp.A04);
        AnonymousClass0fU.A00((View.OnClickListener) drp.A01, gradientSpinnerAvatarView);
    }

    public C46818Dlu() {
        C46801Dld dld = new C46801Dld(1);
        this.A01 = dld;
        this.A00 = new C231422re((C252303ot) dld, (2Rw) this);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1425407077);
        int size = this.A00.A02.size();
        AnonymousClass0fD.A0A(1717258918, A03);
        return size;
    }
}
