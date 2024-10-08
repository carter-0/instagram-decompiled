package X;

import android.graphics.PointF;
import android.text.SpannableString;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.8Nn  reason: invalid class name and case insensitive filesystem */
public final class C354828Nn implements 1wn {
    public final /* synthetic */ AnonymousClass8ME A00;

    public C354828Nn(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        Product A07;
        Product product;
        Float f;
        PointF pointF;
        int A03 = AnonymousClass0fD.A03(-976483584);
        C354838No r4 = (C354838No) obj;
        int A032 = AnonymousClass0fD.A03(418927208);
        0qQ.A0B(r4, 0);
        C239803Ii r5 = r4.A00;
        if ((r5 instanceof C239793Ih) && 0qQ.A0K(r4.A01, "stories")) {
            0qQ.A0C(r5, AnonymousClass000.A00(1642));
            List list = (List) ((C239793Ih) r5).A00;
            if (list != null && !list.isEmpty()) {
                AnonymousClass8ME r6 = this.A00;
                if (r6.A1B.CZU()) {
                    AJ2 aj2 = (AJ2) r6.A1a.get();
                    List list2 = ((C62930Koi) list.get(0)).A02;
                    InteractiveDrawableContainer interactiveDrawableContainer = r6.A1m;
                    r6.A13.A02.A00();
                    0qQ.A0B(list2, 0);
                    MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) 00k.A0J(LTX.A08(list2));
                    if (!(mediaSuggestedProductTag == null || (A07 = mediaSuggestedProductTag.A07()) == null)) {
                        AIV aiv = new AIV(A07);
                        if (AJ2.A00(aiv, interactiveDrawableContainer) == null && (product = aiv.A00) != null) {
                            String str = product.A0J;
                            if (str == null) {
                                str = "";
                            }
                            SpannableString spannableString = new SpannableString(str);
                            C62565Khv khv = C62565Khv.AUTO_TAG;
                            AJ2.A03(spannableString, aj2, aiv, khv, (C358868bb) null, (String) null, -1, false, true);
                            aj2.A00.A00(aj2.A02.requireActivity(), interactiveDrawableContainer, interactiveDrawableContainer, AnonymousClass05K.A1F);
                            UserSession userSession = aj2.A04;
                            AnonymousClass0iw r11 = aj2.A03;
                            String str2 = aj2.A08;
                            String str3 = A07.A0H;
                            MediaSuggestedProductTag mediaSuggestedProductTag2 = (MediaSuggestedProductTag) 00k.A0J(LTX.A08(list2));
                            if (mediaSuggestedProductTag2 != null) {
                                f = mediaSuggestedProductTag2.A08();
                            } else {
                                f = null;
                            }
                            MediaSuggestedProductTag mediaSuggestedProductTag3 = (MediaSuggestedProductTag) 00k.A0J(LTX.A08(list2));
                            if (mediaSuggestedProductTag3 != null) {
                                pointF = mediaSuggestedProductTag3.A00;
                            } else {
                                pointF = null;
                            }
                            LTQ.A04(pointF, (C60762Jqt) null, r11, userSession, khv, f, 0, str2, "add", str3, str3, (String) null, "stories", "seller", 0, false);
                        }
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-748272801, A032);
        AnonymousClass0fD.A0A(-2135443099, A03);
    }
}
