package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.barcelonaig.fragment.BarcelonaIgViewModel$handleWebLinkClick$1;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$commentLikeClicked$1;
import java.util.Map;

public final class JK3 extends 0Yg implements 0sI {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JK3(Object obj, int i) {
        super(5);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        0sL r6;
        C318136oS r2;
        String str;
        Object obj6 = obj3;
        Object obj7 = obj5;
        Object obj8 = obj4;
        Object obj9 = obj2;
        Object obj10 = obj;
        switch (this.A00) {
            case 0:
                C51965G9l.A1U(obj9);
                String str2 = (String) obj6;
                C286575Wy r0 = (C286575Wy) obj8;
                int A0M = AnonymousClass7TE.A0M(obj7);
                AnonymousClass7TF.A1B(obj10, 0, str2);
                if ((A0M & 384) == 0) {
                    A0M |= G9t.A0Q(r0, str2);
                }
                if ((A0M & 1153) == 1152 && r0.Bwn()) {
                    r0.Evl();
                    break;
                } else {
                    if (0fL.A02()) {
                        0fL.A01(284522705, "com.instagram.barcelona.feed.post.ui.RelevantTagsRow.<anonymous>.<anonymous>.<anonymous> (RelevantTagsRow.kt:51)");
                    }
                    boolean z = false;
                    AnonymousClass2DO A002 = C287975bA.A00(r0, R.drawable.barcelona_search_filled_26, 0);
                    long A0D = C51966G9m.A0D(r0);
                    C285245Qk r7 = Modifier.A00;
                    C288165bT.A03(r0, C287205Zk.A0C(G9w.A0I(r7, 6.0f), 12.0f), A002, A0D);
                    long A0D2 = C51966G9m.A0D(r0);
                    AnonymousClass5Z4 A0c = C51966G9m.A0c(r0);
                    AnonymousClass5Z4 r5 = AnonymousClass5Z4.A03;
                    AnonymousClass5Z4 A0D3 = A0c.A0D(new AnonymousClass5Z4((AnonymousClass5Z2) null, (C268454dQ) null, (AnonymousClass5ZD) null, 0, 0, 16777213, 0, AnonymousClass5Z7.A01(13), 0, 0));
                    r0.ExS(-250959487);
                    Object obj11 = this.A01;
                    boolean AGu = r0.AGu(obj11);
                    if ((A0M & 896) == 256) {
                        z = true;
                    }
                    boolean z2 = AGu | z;
                    Object ECw = r0.ECw();
                    if (z2 || ECw == AnonymousClass5XT.A00) {
                        ECw = C51970G9q.A0y(r0, obj11, str2, 17);
                    }
                    C51965G9l.A1X(r0, false);
                    AnonymousClass5ZZ.A0M(r0, C288235ba.A04(r0, r7, (C62320sa) ECw), A0D3, str2, (A0M >> 6) & 14, A0D2);
                    if (0fL.A02()) {
                        0fL.A00(1086099854);
                        break;
                    }
                }
                break;
            case 1:
                String str3 = (String) obj10;
                String str4 = (String) obj9;
                2EG r1 = (2EG) obj6;
                long A0R = AnonymousClass7TE.A0R(obj8);
                AnonymousClass7TG.A1T(str3, str4, r1);
                C52955Gg8 gg8 = (C52955Gg8) this.A01;
                r2 = C318116oQ.A00(gg8);
                r6 = new BarcelonaIgViewModel$handleWebLinkClick$1(gg8, r1, str3, str4, (String) obj7, (AnonymousClass4D7) null, A0R);
                break;
            case 2:
                Boolean bool = (Boolean) obj10;
                boolean booleanValue = bool.booleanValue();
                AnonymousClass8HJ r4 = (AnonymousClass8HJ) obj9;
                C39735A7b a7b = (C39735A7b) obj6;
                float A04 = AnonymousClass7TE.A04(obj8);
                float A042 = AnonymousClass7TE.A04(obj7);
                0qQ.A0B(r4, 1);
                if (booleanValue && a7b != null) {
                    I09 i09 = (I09) this.A01;
                    Map map = i09.A04;
                    if (!map.containsKey(r4)) {
                        i09.A09 = r4;
                        map.put(r4, a7b);
                    }
                    C39735A7b a7b2 = (C39735A7b) map.get(r4);
                    if (a7b2 != null) {
                        String str5 = a7b.A04;
                        C39735A7b.A00(a7b2.A05);
                        a7b2.A05 = str5;
                        if (A04 >= 0.0f) {
                            a7b2.A00 = A04;
                        }
                        if (A042 >= 0.0f && A042 >= a7b2.A00) {
                            a7b2.A01 = A042;
                        }
                    }
                }
                I09 i092 = (I09) this.A01;
                i092.A05.set(0);
                0sL r22 = i092.A02;
                if (r22 != null) {
                    if (a7b != null) {
                        str = a7b.A04;
                    } else {
                        str = null;
                    }
                    r22.invoke(bool, str);
                    break;
                }
                break;
            case 5:
                String str6 = (String) obj10;
                String str7 = (String) obj9;
                AnonymousClass7TF.A1H(str6, str7);
                ((C61838KOc) this.A01).A0A(new C61000Juw((Integer) null, (Integer) null, str7, (String) obj7, (String) obj6, str6, 0, false));
                return null;
            case 6:
                1Xj r52 = (1Xj) obj10;
                AnonymousClass3W1 r42 = (AnonymousClass3W1) obj9;
                int A0M2 = AnonymousClass7TE.A0M(obj6);
                String str8 = (String) obj8;
                C51974G9v.A1K(r52, r42, str8);
                ((C55873Hou) this.A01).A03.DNR(r52, r42, str8, new C58684Ivt(obj7, 32), A0M2);
                break;
            case 7:
                boolean A1a = AnonymousClass7TE.A1a(obj10);
                C283155Gi r43 = (C283155Gi) obj9;
                int A0M3 = AnonymousClass7TE.A0M(obj6);
                boolean A1a2 = AnonymousClass7TE.A1a(obj8);
                0qQ.A0B(r43, 1);
                ActivityFeedViewModel activityFeedViewModel = (ActivityFeedViewModel) this.A01;
                r2 = C318116oQ.A00(activityFeedViewModel);
                r6 = new ActivityFeedViewModel$commentLikeClicked$1((JV7) obj7, r43, activityFeedViewModel, (AnonymousClass4D7) null, A0M3, A1a2, A1a);
                break;
            case 8:
                1Xj r53 = (1Xj) obj10;
                C296995qz r44 = (C296995qz) obj9;
                C51965G9l.A1U(obj6);
                View view = (View) obj8;
                MotionEvent motionEvent = (MotionEvent) obj7;
                0qQ.A0B(r53, 0);
                AnonymousClass7TG.A0w(1, r44, view, motionEvent);
                C232692uG r62 = ((C15286UZq) this.A01).A09;
                if (r62 == null) {
                    0qQ.A0F("previewMediaController");
                    throw AnonymousClass00P.createAndThrow();
                }
                return Boolean.valueOf(r62.Dsa(motionEvent, view, r53, (r44.A01 * 3) + r44.A00));
            case 9:
                AnonymousClass7TG.A1N(obj10, obj9);
                ((C55897HpI) this.A01).A08.invoke(obj10, obj9);
                break;
            default:
                0qQ.A0A(obj10);
                0qQ.A0A(obj9);
                ((0sJ) ((C59721JVf) ((C59832Ja7) this.A01).A00).A01).invoke(obj10, obj9, obj6, obj7);
                return null;
        }
        AnonymousClass7TE.A1Z(r6, r2);
        return C60340gF.A00;
    }
}
