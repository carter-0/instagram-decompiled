package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.regex.Pattern;

public final class ICH implements View.OnClickListener {
    public final /* synthetic */ C246193eB A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ C53157GjT A03;
    public final /* synthetic */ AnonymousClass3W1 A04;

    public ICH(C246193eB r1, UserSession userSession, 1Xj r3, C53157GjT gjT, AnonymousClass3W1 r5) {
        this.A03 = gjT;
        this.A01 = userSession;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1413778756);
        C53157GjT gjT = this.A03;
        UserSession userSession = this.A01;
        1Xj r11 = this.A02;
        AnonymousClass3W1 r0 = this.A04;
        C246193eB r7 = this.A00;
        C2363233h r9 = gjT.A02;
        if (r9 != null) {
            C54667HMy A002 = C56315HwS.A00(r7);
            if (A002 != null) {
                switch (A002.ordinal()) {
                    case 0:
                        String str = r0.A1V;
                        Pattern pattern = 0mp.A00;
                        if (str == null) {
                            str = "";
                        }
                        r9.Eul(r11, r0, str);
                        break;
                    case 10:
                        String id = r11.getId();
                        if (id != null) {
                            r9.Ev8(r11, r0, C16677UzD.MEDIA, id);
                            break;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    case 11:
                        r9.E12(r11, gjT, r0);
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        C2363233h r1 = gjT.A02;
                        if (r1 != null) {
                            r1.EuH(r11, r0);
                            break;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    case 13:
                        C2363233h r12 = gjT.A02;
                        if (r12 != null) {
                            r12.EuJ(r11, r0);
                            break;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    case 19:
                        C2363233h r13 = gjT.A02;
                        if (r13 != null) {
                            r13.E0t(AnonymousClass05K.A01);
                            break;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    case 24:
                        C2363233h r14 = gjT.A02;
                        if (r14 != null) {
                            r14.Cfd(r11, "tombstone_view");
                            break;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    default:
                        String id2 = r11.getId();
                        if (id2 != null) {
                            String C9L = r11.C9L();
                            int position = r0.getPosition();
                            r9.Ds5(r11.B5J(), r11, id2, C9L, r7.getId(), r7.getData(), (String) null, r0.A1V, -1, position, !r11.CcK(), AnonymousClass7TF.A1W(r0.A0m, AnonymousClass3WA.ADS_LWNF), false);
                            r0.A1H = r7.getId();
                            r0.A1G = r7.getData();
                            if (r7.AwK() != null) {
                                AnonymousClass1eD AwK = r7.AwK();
                                if (AwK != null) {
                                    C2363733m.A04(AwK, userSession, r11, gjT, r0);
                                    break;
                                } else {
                                    throw AnonymousClass7TE.A0w("Required value was null.");
                                }
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        break;
                }
                C2363733m.A05(r11, gjT, r0);
            }
            AnonymousClass0fD.A0C(1582608498, A05);
            return;
        }
        throw AnonymousClass7TE.A0w("TombstoneViewHolder.mDelegate should not be null");
    }
}
