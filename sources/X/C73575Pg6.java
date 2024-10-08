package X;

import android.text.SpannableString;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Pg6  reason: case insensitive filesystem */
public final class C73575Pg6 extends 0Yk implements 0sL {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C73575Pg6(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            java.lang.Class<X.NKO> r3 = X.NKO.class
            r1 = 2
            if (r9 == 0) goto L_0x0012
            java.lang.String r4 = "handleEvent"
            java.lang.String r5 = "handleEvent(Lcom/instagram/friendmap/viewmodel/FriendMapPresenceReplyViewModel$UIEvent;)V"
        L_0x000c:
            r6 = 4
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.String r4 = "handleState"
            java.lang.String r5 = "handleState(Lcom/instagram/friendmap/viewmodel/FriendMapPresenceReplyViewModel$UIState;)V"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73575Pg6.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        TextView A0I;
        SpannableString A0D;
        String str2;
        List list;
        AnonymousClass913 r1;
        C279864zZ BWY;
        if (this.A00 != 0) {
            C74573PxM pxM = (C74573PxM) obj;
            NKO nko = (NKO) this.receiver;
            if (pxM instanceof C72699PGd) {
                AnonymousClass0eM r12 = nko.A0A;
                AnonymousClass7TE.A0c(r12).clearFocus();
                0nA.A0N(AnonymousClass7TE.A0c(r12));
                DbZ.A15(nko);
            } else if (pxM instanceof C72698PGc) {
                C72698PGc pGc = (C72698PGc) pxM;
                1xC r3 = 1xC.A01;
                C310336ap A0a = DbS.A0a();
                A0a.A0D = C70286O0q.A00(nko.requireContext(), pGc.A02);
                A0a.A0D(C70286O0q.A00(nko.requireContext(), pGc.A01));
                A0a.A06();
                A0a.A0B(C310356ar.AVATAR);
                A0a.A09 = pGc.A00;
                A0a.A0L = true;
                A0a.A0A(new C72729PHj(6, pGc, nko));
                DbY.A1K(r3, A0a);
            } else if (pxM instanceof C72700PGe) {
                AnonymousClass2S0.A01.A03();
            } else {
                throw AnonymousClass7TE.A1K();
            }
        } else {
            C68279N8q n8q = (C68279N8q) obj;
            NKO nko2 = (NKO) this.receiver;
            ((C308476Uk) nko2.A0E.getValue()).A01((Boolean) null, n8q.A03, true);
            N4t n4t = n8q.A00;
            if (n4t != null) {
                nko2.A00 = n4t;
                0eP A06 = C67587MqL.A06(nko2.requireContext(), n4t.A02);
                String str3 = (String) A06.A00;
                boolean A1a = AnonymousClass7TE.A1a(A06.A01);
                IgImageView A0R = C66580MXl.A0R(nko2.A0G);
                User user = n4t.A06;
                DbU.A1S(nko2, A0R, user);
                JTO.A0I(nko2.A0I).setText(user.B8Q());
                int i = R.attr.igds_color_secondary_text;
                if (A1a) {
                    i = R.attr.igds_color_active_badge;
                }
                int A03 = AnonymousClass7TF.A03(nko2.requireContext(), i);
                AnonymousClass4AB r9 = n4t.A05;
                boolean A1V = AnonymousClass7TF.A1V(r9);
                AnonymousClass0eM r2 = nko2.A07;
                if (A1V) {
                    DbW.A1R(r2, 0);
                    String str4 = null;
                    nko2.A05.A00(new C59671JTb(n8q.A02, 10), (IgSimpleImageView) null, nko2.A04, (IgBouncyUfiButtonImageView) r2.getValue());
                    AnonymousClass0eM r7 = nko2.A0H;
                    JTO.A0I(r7).setMaxLines(2);
                    if (!n4t.A04() || n4t.A07 == AnonymousClass05K.A00) {
                        Integer num = n4t.A07;
                        Integer num2 = AnonymousClass05K.A00;
                        TextView A0I2 = JTO.A0I(r7);
                        if (num == num2) {
                            str2 = nko2.requireContext().getString(2131962764);
                        } else {
                            str2 = n4t.A09;
                        }
                        A0I2.setText(str2);
                    } else {
                        TextView A0I3 = JTO.A0I(r7);
                        if (!(r9 == null || (list = r9.A0J) == null || (r1 = (AnonymousClass913) 00k.A0J(list)) == null || (BWY = r1.BWY()) == null)) {
                            str4 = BWY.A0J;
                        }
                        A0I3.setText(str4);
                        JTS.A0u(nko2.requireContext(), JTO.A0I(r7), R.attr.igds_color_primary_text);
                    }
                    String A0d = AnonymousClass7TF.A0d(DbV.A05(nko2), 2131962759);
                    String A0g = 002.A0g(A0d, " • ", str3);
                    A0I = JTO.A0I(nko2.A0F);
                    A0D = C66580MXl.A0D(A0g);
                    A0D.setSpan(C66580MXl.A0E(A03), A0d.length() + 3, A0g.length(), 33);
                } else {
                    C51969G9p.A1M(r2.getValue());
                    AnonymousClass0eM r22 = nko2.A0H;
                    JTO.A0I(r22).setMaxLines(1);
                    String str5 = n4t.A09;
                    if (str5 == null || str5.length() == 0) {
                        str = str3;
                    } else {
                        str = 002.A0g(str3, " • ", str5);
                    }
                    A0I = JTO.A0I(r22);
                    A0D = C66580MXl.A0D(str);
                    A0D.setSpan(C66580MXl.A0E(A03), 0, str3.length(), 33);
                }
                A0I.setText(A0D);
            }
        }
        return C60340gF.A00;
    }
}
