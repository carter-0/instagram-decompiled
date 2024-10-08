package X;

import androidx.media3.common.Metadata;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Xus  reason: case insensitive filesystem */
public final class C22066Xus implements Y8w {
    public final int A00;
    public final Object A01;

    public C22066Xus(C21490Xch xch, int i) {
        this.A00 = i;
        this.A01 = xch;
    }

    public final void CNv(Object obj) {
        switch (this.A00) {
            case 0:
                C22009Xqt xqt = (C22009Xqt) this.A01;
                C22056Xui xui = C22056Xui.$redex_init_class;
                ((YB3) obj).DXV(xqt.A0E, xqt.A00);
                return;
            case 1:
                C22056Xui xui2 = C22056Xui.$redex_init_class;
                ((YB3) obj).DXj(((C22009Xqt) this.A01).A02);
                return;
            case 2:
                C22056Xui xui3 = C22056Xui.$redex_init_class;
                ((YB3) obj).DLk(((C22009Xqt) this.A01).A07());
                return;
            case 3:
                C22056Xui xui4 = C22056Xui.$redex_init_class;
                ((YB3) obj).DXZ(((C22009Xqt) this.A01).A05);
                return;
            case 4:
                C22056Xui xui5 = C22056Xui.$redex_init_class;
                ((YB3) obj).DXo(((C22009Xqt) this.A01).A07);
                return;
            case 5:
                C22056Xui xui6 = C22056Xui.$redex_init_class;
                ((YB3) obj).DXl(((C22009Xqt) this.A01).A07);
                return;
            case 6:
                C22056Xui xui7 = C22056Xui.$redex_init_class;
                ((YB3) obj).DtF(((C22009Xqt) this.A01).A0B.A00);
                return;
            case 7:
                C22056Xui xui8 = C22056Xui.$redex_init_class;
                ((YB3) obj).DQb((C21979XoR) this.A01);
                return;
            case 8:
                C22056Xui xui9 = C22056Xui.$redex_init_class;
                ((YB3) obj).DLi(((C22009Xqt) this.A01).A0D);
                return;
            case 9:
                C22009Xqt xqt2 = (C22009Xqt) this.A01;
                C22056Xui xui10 = C22056Xui.$redex_init_class;
                ((YB3) obj).DXp(xqt2.A0E, xqt2.A01);
                return;
            case 10:
                C22056Xui xui11 = C22056Xui.$redex_init_class;
                ((YB3) obj).DXh(((C22009Xqt) this.A01).A01);
                return;
            case 11:
                ((YB3) obj).CxB(((C22056Xui) this.A01).A07);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                ((YB3) obj).onCues((List) this.A01);
                return;
            case 13:
                C22056Xui xui12 = ((C22042XuR) this.A01).A00;
                C22056Xui xui13 = C22056Xui.$redex_init_class;
                ((YB3) obj).DQb(xui12.A05);
                return;
            case 14:
                ((YB3) obj).DS4((Metadata) this.A01);
                return;
            case 15:
                ((YB3) obj).D7N((C21957Xmm) this.A01);
                return;
            case 16:
                ((YB3) obj).DyI((C21974XoJ) this.A01);
                return;
            default:
                return;
        }
    }

    public C22066Xus(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
