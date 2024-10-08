package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.UeL  reason: case insensitive filesystem */
public final class C15532UeL extends C231632rz {
    public final C20983X7y A00;
    public final AnonymousClass0iw A01;
    public final C15683Ugo A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        C16727V3k v3k = (C16727V3k) obj;
        AnonymousClass7TF.A1H(r4, v3k);
        C20983X7y x7y = this.A00;
        User user = v3k.A00;
        0qQ.A07(user);
        x7y.A8A(user);
        r4.A7U(0);
    }

    public C15532UeL(AnonymousClass0iw r1, C15683Ugo ugo, C20983X7y x7y) {
        this.A01 = r1;
        this.A00 = x7y;
        this.A02 = ugo;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(65867584);
        AnonymousClass7TG.A1O(view, obj);
        this.A00.EBX(view);
        Object tag = view.getTag();
        if (tag != null) {
            UDY udy = (UDY) tag;
            C16727V3k v3k = (C16727V3k) obj;
            AnonymousClass0iw r6 = this.A01;
            String str = v3k.A02;
            0qQ.A07(str);
            String str2 = v3k.A01;
            ImageUrl Bh3 = v3k.A00.Bh3();
            WBE wbe = new WBE(13, obj, (Object) this);
            AnonymousClass7TG.A1N(udy, r6);
            AnonymousClass0fU.A00(wbe, udy.A00);
            udy.A02.setText(str);
            udy.A01.setText(str2);
            udy.A03.setUrl(Bh3, r6);
            AnonymousClass0fD.A0A(1586750567, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-827677120, A03);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -2025024343);
        View A09 = DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.account_section, false);
        A09.setTag(new UDY(A09));
        AnonymousClass0fD.A0A(1529786192, A04);
        return A09;
    }
}
