package X;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.avatar.expresso.odr.ODRController;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.keyword.Keyword;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.InX  reason: case insensitive filesystem */
public final class C58167InX extends 03J implements 0sI {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58167InX(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001b;
                case 2: goto L_0x0023;
                case 3: goto L_0x002b;
                case 4: goto L_0x0033;
                case 5: goto L_0x003b;
                case 6: goto L_0x0043;
                case 7: goto L_0x004b;
                case 8: goto L_0x0006;
                case 9: goto L_0x0043;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.GBN> r3 = X.GBN.class
            r1 = 5
            java.lang.String r4 = "openLikesList"
            java.lang.String r5 = "openLikesList(Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/viewer/ui/state/ClipsItemState;Lcom/instagram/feed/media/Media;ILandroid/view/View;)V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<com.facebook.avatar.expresso.odr.ODRController> r3 = com.facebook.avatar.expresso.odr.ODRController.class
            r1 = 5
            java.lang.String r4 = "downloadAsset"
            java.lang.String r5 = "downloadAsset(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/facebook/avatar/expresso/utils/ODRSuccess$TemplateInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.Hrc> r3 = X.C56030Hrc.class
            r1 = 5
            java.lang.String r4 = "onCommentPollVoteAdded"
            java.lang.String r5 = "onCommentPollVoteAdded(Ljava/lang/String;Ljava/lang/String;Lcom/instagram/reels/polling/PollIntf;Ljava/lang/Integer;I)V"
            goto L_0x000d
        L_0x0023:
            java.lang.Class<X.Hrc> r3 = X.C56030Hrc.class
            r1 = 5
            java.lang.String r4 = "showOffensiveWarning"
            java.lang.String r5 = "showOffensiveWarning(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Lcom/instagram/feed/media/CommentOffensiveScore;Lcom/instagram/wellbeing/warning/intf/OffensiveContentWarningProgress;)V"
            goto L_0x000d
        L_0x002b:
            java.lang.Class<X.UZq> r3 = X.C15286UZq.class
            r1 = 5
            java.lang.String r4 = "handleTriMediaKeywordMediaClick"
            java.lang.String r5 = "handleTriMediaKeywordMediaClick(Lcom/instagram/discovery/recyclerview/model/TriMediaKeywordGridItemViewModel;Lcom/instagram/feed/media/Media;Lcom/instagram/common/recyclerview/grid/model/GridPosition;ILandroid/view/View;)V"
            goto L_0x000d
        L_0x0033:
            java.lang.Class<X.UbA> r3 = X.C15358UbA.class
            r1 = 5
            java.lang.String r4 = "handleTriMediaKeywordMediaClick"
            java.lang.String r5 = "handleTriMediaKeywordMediaClick(Lcom/instagram/discovery/recyclerview/model/TriMediaKeywordGridItemViewModel;Lcom/instagram/feed/media/Media;Lcom/instagram/common/recyclerview/grid/model/GridPosition;ILandroid/view/View;)V"
            goto L_0x000d
        L_0x003b:
            java.lang.Class<X.UbA> r3 = X.C15358UbA.class
            r1 = 5
            java.lang.String r4 = "handleTriMediaKeywordMediaTouch"
            java.lang.String r5 = "handleTriMediaKeywordMediaTouch(Lcom/instagram/feed/media/Media;Lcom/instagram/common/recyclerview/grid/model/GridPosition;ILandroid/view/View;Landroid/view/MotionEvent;)Z"
            goto L_0x000d
        L_0x0043:
            java.lang.Class<X.1ES> r3 = X.1ES.class
            r1 = 5
            java.lang.String r4 = "scheduleOnThreadPool"
            java.lang.String r5 = "scheduleOnThreadPool(Lcom/instagram/common/task/ObservableTask;IIZZ)V"
            goto L_0x000d
        L_0x004b:
            java.lang.Class<X.GBI> r3 = X.GBI.class
            r1 = 5
            java.lang.String r4 = "launchVideoEffectPage"
            java.lang.String r5 = "launchVideoEffectPage(Lcom/instagram/feed/media/Media;Lcom/instagram/feed/ui/state/MediaState;Lcom/instagram/feed/media/EffectPreviewIntf;Lcom/facebook/analytics/structuredlogger/enums/InstagramPivotPageEntryPoint;Z)V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58167InX.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ArrayList arrayList;
        Object obj6 = obj4;
        Object obj7 = obj5;
        Object obj8 = obj3;
        Object obj9 = obj2;
        Object obj10 = obj;
        switch (this.A00) {
            case 0:
                return ODRController.A03((ODRController) this.receiver, (LG2) obj6, (File) obj9, (String) obj10, (String) obj8, (AnonymousClass4D7) obj7);
            case 1:
                String str = (String) obj10;
                String str2 = (String) obj9;
                C272034jz r2 = (C272034jz) obj8;
                int A0M = AnonymousClass7TE.A0M(obj7);
                AnonymousClass7TG.A1T(str, str2, r2);
                ((C56030Hrc) this.receiver).A02.A0T(r2, (Integer) obj6, str, str2, A0M);
                break;
            case 2:
                0qQ.A0B(obj10, 0);
                AnonymousClass7TG.A0w(1, obj9, obj6, obj7);
                break;
            case 3:
                HAU hau = (HAU) obj10;
                1Xj r10 = (1Xj) obj9;
                C296995qz r22 = (C296995qz) obj8;
                C51965G9l.A1U(obj6);
                AnonymousClass7TG.A1T(hau, r10, r22);
                C15286UZq uZq = (C15286UZq) C51965G9l.A0s(obj7, this, 4);
                uZq.A0A(r22, hau, r10);
                FragmentActivity requireActivity = uZq.requireActivity();
                UserSession A04 = uZq.A04();
                C298795u2 r0 = hau.A02;
                Keyword A002 = r0.A00();
                String moduleName = uZq.getModuleName();
                String A0j = AnonymousClass7TG.A0j();
                List list = r0.A05;
                if (list != null) {
                    arrayList = AnonymousClass7TE.A1C();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C51971G9r.A1M(C51966G9m.A0t(it), arrayList);
                    }
                } else {
                    arrayList = null;
                }
                C18243VoA.A01(requireActivity, A04, (C14005To7) null, uZq, r10, A002, A0j, moduleName, "", (String) null, arrayList, C55141Hcp.A00(uZq.A04()));
                break;
            case 4:
                HAU hau2 = (HAU) obj10;
                1Xj r102 = (1Xj) obj9;
                C296995qz r23 = (C296995qz) obj8;
                C51965G9l.A1U(obj6);
                AnonymousClass7TG.A1T(hau2, r102, r23);
                C15358UbA ubA = (C15358UbA) C51965G9l.A0s(obj7, this, 4);
                0jB E4l = ubA.E4l(r102);
                C298795u2 r02 = hau2.A02;
                C18244VoB.A00(E4l, r02);
                C15358UbA.A01(r23, hau2, r102, ubA);
                C15358UbA.A02(r102, r02.A00(), ubA, r02.A05);
                break;
            case 5:
                1Xj r1 = (1Xj) obj10;
                C296995qz r103 = (C296995qz) obj9;
                int A0M2 = AnonymousClass7TE.A0M(obj8);
                View view = (View) obj6;
                MotionEvent motionEvent = (MotionEvent) obj7;
                0qQ.A0B(r1, 0);
                AnonymousClass7TG.A0w(1, r103, view, motionEvent);
                AnonymousClass2uE r24 = ((C15358UbA) this.receiver).A07;
                if (r24 != null) {
                    return Boolean.valueOf(r24.Dsa(motionEvent, view, r1, (r103.A01 * 3) + A0M2));
                }
                0qQ.A0F("peekMediaController");
                throw AnonymousClass00P.createAndThrow();
            case 7:
                1Xj r12 = (1Xj) obj10;
                AnonymousClass3W1 r104 = (AnonymousClass3W1) obj9;
                EffectPreviewIntf effectPreviewIntf = (EffectPreviewIntf) obj8;
                AnonymousClass7TG.A1T(r12, r104, effectPreviewIntf);
                ((GBI) this.receiver).A02((AnonymousClass8ZN) obj6, effectPreviewIntf, r12, r104);
                break;
            case 8:
                C267324bN r13 = (C267324bN) obj10;
                C52058GDe gDe = (C52058GDe) obj9;
                1Xj r25 = (1Xj) obj8;
                int A0M3 = AnonymousClass7TE.A0M(obj6);
                View view2 = (View) obj7;
                boolean A1b = C51973G9u.A1b(r13, gDe, r25);
                GBN gbn = (GBN) this.receiver;
                Boolean valueOf = Boolean.valueOf(A1b);
                0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(112), valueOf);
                0eP A1L2 = AnonymousClass7TE.A1L(AnonymousClass000.A00(236), valueOf);
                0eP A1L3 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1055), false);
                0eP A1L4 = AnonymousClass7TE.A1L(AnonymousClass000.A00(1054), false);
                0eP A1L5 = AnonymousClass7TE.A1L(AnonymousClass000.A00(228), r25.getId());
                UserSession userSession = gbn.A00;
                Bundle A003 = Q21.A00(A1L, A1L2, A1L3, A1L4, A1L5, AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05));
                AnonymousClass3W1 r7 = gDe.A0E;
                if (r7 != null) {
                    int i = r7.A03;
                    if (Integer.valueOf(i) != null) {
                        A003.putInt(AnonymousClass000.A00(113), i);
                    }
                }
                if (r13.CcK()) {
                    C324666zh.A02(A003, userSession, r13.A06());
                }
                Fragment CrB = gbn.A01.A00.CrB(A003, userSession);
                C62880wX r9 = userSession.A03;
                String A16 = AnonymousClass7TE.A16(r9.A06(), A0M3);
                C56042Hrp hrp = gbn.A02;
                hrp.A00(view2, CrB, A16, false);
                if ((CrB instanceof C47522E6i) && C46342Dck.A01(userSession, r25)) {
                    C331137Ps A0h = C51971G9r.A0h(0);
                    A0h.A02 = R.drawable.instagram_info_outline_16;
                    A0h.A07 = AnonymousClass7TE.A16(r9.A06(), 2131969514);
                    A0h.A0A = A1b;
                    A0h.A05 = new C56762IBl(r25, gbn, A16, 4);
                    C331147Pt A004 = A0h.A00();
                    C331157Pu r03 = hrp.A03;
                    if (r03 != null) {
                        r03.A0K(A004, A1b);
                        break;
                    }
                }
                break;
            default:
                AnonymousClass11X r14 = (AnonymousClass11X) obj10;
                1ES.A05(r14, AnonymousClass7TE.A0M(obj9), AnonymousClass7TE.A0M(obj8), AnonymousClass7TE.A1a(obj6), C51975G9x.A1X(obj7, r14));
                break;
        }
        return C60340gF.A00;
    }
}
