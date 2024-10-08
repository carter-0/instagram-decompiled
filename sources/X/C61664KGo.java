package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KGo  reason: case insensitive filesystem */
public final class C61664KGo extends C232232tF {
    public final AnonymousClass0iw A00;
    public final 1Xj A01;
    public final C317376nA A02;
    public final K74 A03;
    public final Class A04 = C64809LiU.class;

    public C61664KGo(AnonymousClass0iw r2, 1Xj r3, C317376nA r4, K74 k74) {
        this.A03 = k74;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r30, C249703kE r31) {
        C64809LiU liU = (C64809LiU) r30;
        C53150GjM gjM = (C53150GjM) r31;
        AnonymousClass7TG.A1N(liU, gjM);
        C247733gp r10 = liU.A02;
        if (r10 != null) {
            r10.A02(this.A01);
        }
        ImageUrl imageUrl = liU.A01;
        String str = liU.A06;
        String str2 = liU.A05;
        Long l = liU.A03;
        boolean z = liU.A07;
        boolean z2 = liU.A08;
        int i = liU.A00;
        boolean z3 = liU.A09;
        AnonymousClass0iw r5 = this.A00;
        MJ8 mj8 = new MJ8(17, liU, this);
        MJ8 mj82 = new MJ8(18, liU, this);
        MJ8 mj83 = new MJ8(19, liU, this);
        MJ8 mj84 = new MJ8(20, liU, this);
        MJ8 mj85 = mj8;
        MJ8 mj86 = mj82;
        String str3 = str;
        String str4 = str2;
        C53150GjM gjM2 = gjM;
        Long l2 = l;
        AnonymousClass0iw r14 = r5;
        ImageUrl imageUrl2 = imageUrl;
        C55096Hc5.A00(r14, imageUrl2, gjM2, l2, str3, str4, mj85, mj86, mj83, mj84, i, z, z2, z3);
        if (r10 != null) {
            this.A02.A00(gjM.A00, r10);
        }
    }

    public final Class modelClass() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53150GjM(DbT.A0D(layoutInflater, viewGroup, R.layout.row_story_dashboard_comment, false));
    }
}
