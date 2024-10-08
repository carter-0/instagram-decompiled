package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.FbG  reason: case insensitive filesystem */
public final class C50408FbG implements C74460PvF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50408FbG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void D7X() {
    }

    public final void DBt(C317486nL r4) {
        String str;
        IgSimpleImageView igSimpleImageView;
        int i = this.A00;
        ((C331157Pu) this.A01).A0L((C332277Ui) null);
        Object obj = this.A02;
        if (i != 0) {
            C62041KXd kXd = (C62041KXd) obj;
            str = r4.A02;
            kXd.A09 = str;
            igSimpleImageView = kXd.A03;
        } else {
            C47485E4p e4p = (C47485E4p) obj;
            str = r4.A02;
            e4p.A04 = str;
            igSimpleImageView = e4p.A00;
        }
        if (igSimpleImageView != null) {
            I7E.A07(igSimpleImageView, str);
        }
    }

    public final void Dis() {
    }
}
