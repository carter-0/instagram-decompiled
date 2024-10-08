package X;

import android.os.Bundle;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.ModalActivity;
import java.util.List;

public final class GL2 extends 03J implements 0sH {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GL2(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001b;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.I4A> r3 = X.I4A.class
            r1 = 6
            java.lang.String r4 = "launchAudioPage"
            java.lang.String r5 = "launchAudioPage(Lcom/instagram/clips/model/metadata/ClipsAudioMetadata;Ljava/util/List;Ljava/lang/String;Lcom/facebook/analytics/structuredlogger/enums/InstagramPivotPageEntryPoint;Lcom/instagram/api/schemas/MidCardInfoV2;Ljava/lang/String;)V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.K4m> r3 = X.C61368K4m.class
            r1 = 6
            java.lang.String r4 = "onCreateAiClicked"
            java.lang.String r5 = "onCreateAiClicked(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/instagram/common/typedurl/ImageUrl;Ljava/lang/String;Ljava/lang/String;)V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.GBM> r3 = X.GBM.class
            r1 = 6
            java.lang.String r4 = "launchAdsOverflowMenu"
            java.lang.String r5 = "launchAdsOverflowMenu(Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/viewer/ui/state/ClipsItemState;Ljava/lang/String;ZZZ)V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GL2.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object obj7 = obj5;
        Object obj8 = obj6;
        Object obj9 = obj4;
        Object obj10 = obj3;
        Object obj11 = obj2;
        Object obj12 = obj;
        switch (this.A00) {
            case 0:
                String str = (String) obj12;
                String str2 = (String) obj11;
                String str3 = (String) obj10;
                ImageUrl imageUrl = (ImageUrl) obj9;
                String str4 = (String) obj7;
                0qQ.A0B(str, 0);
                C51974G9v.A1P(str2, str3, imageUrl, str4);
                C61368K4m k4m = (C61368K4m) C51965G9l.A0s(obj8, this, 5);
                AnonymousClass0eM r5 = k4m.A02;
                String str5 = ((C60316JjJ) r5.getValue()).A02;
                1Ln A002 = LTH.A00((LTH) k4m.A00.getValue());
                if (DbT.A1Y(A002)) {
                    A002.A0l("creation_template_details_screen_create_ai_clicked");
                    A002.A0v(str5);
                    A002.Cgf();
                }
                ((C60316JjJ) r5.getValue()).A00.A0B.Epw(str2);
                C60316JjJ jjJ = (C60316JjJ) r5.getValue();
                AnonymousClass0eM r52 = k4m.A01;
                UserSession A0l = AnonymousClass7TE.A0l(r52);
                boolean A06 = 182.A06(AnonymousClass7TF.A0H(A0l), A0l, 36324076024639255L);
                jjJ.A00.A06(imageUrl, str2, str4, jjJ.A02, str, str2, str3, A06);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString(AnonymousClass000.A00(868), str4);
                C309516Yo A0P = DbZ.A0P(k4m, r52);
                K63 k63 = new K63();
                k63.setArguments(A0a);
                Dba.A12(k63, A0P);
                break;
            case 1:
                C267324bN r11 = (C267324bN) obj12;
                C52058GDe gDe = (C52058GDe) obj11;
                String str6 = (String) obj10;
                boolean A1a = AnonymousClass7TE.A1a(obj9);
                boolean A1a2 = AnonymousClass7TE.A1a(obj7);
                boolean A1a3 = AnonymousClass7TE.A1a(obj8);
                boolean A1U = AnonymousClass7TF.A1U(0, r11, gDe);
                GBM gbm = (GBM) this.receiver;
                String str7 = null;
                boolean A1W = AnonymousClass7TF.A1W(gbm.A02, ClipsViewerSource.DIRECT);
                if (str6 != null) {
                    str7 = str6;
                }
                0sJ r4 = gbm.A01;
                if (r4 != null) {
                    C51967G9n.A1L(r11.A06(), new C54382HAx(gDe, gbm.A03, r11.A06()), new C55894HpF(str7, (String) null, (String) null, A1W, A1U, A1U, A1a3, false, A1U, false, false, false, false, false, A1a, A1a2, false), r4, gDe.A09());
                    break;
                } else {
                    0qQ.A0F("displayAdsOverflowMenu");
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                C2606046i r112 = (C2606046i) obj12;
                List list = (List) obj11;
                String str8 = (String) obj8;
                AnonymousClass7TG.A1N(r112, list);
                I4A i4a = (I4A) C51965G9l.A0s(str8, this, 5);
                UserSession userSession = i4a.A04;
                C229352nF A0Y = C51967G9n.A0Y(userSession);
                String A0j = AnonymousClass7TG.A0j();
                A0Y.A02(A0j).A04 = list;
                Bundle A02 = C250563lf.A02((C54689HOu) null, (AnonymousClass8ZN) obj9, LT9.A00(i4a.A01, (AudioFilterType) null, r112, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, A0j, (String) obj10, C51971G9r.A1a(list, i4a.A00), true), str8);
                DbU.A0w(i4a.A02, A02, userSession, ModalActivity.class, "audio_page");
                break;
        }
        return C60340gF.A00;
    }
}
