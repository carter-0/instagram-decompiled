package X;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.reels.MultiProductSticker;
import java.util.List;

/* renamed from: X.6WY  reason: invalid class name */
public abstract class AnonymousClass6WY {
    public static final void A00(UserSession userSession, C255773uh r18, C316906mP r19, C309876Zy r20) {
        C389709q4 r7;
        int A01;
        int i;
        C316906mP r15 = r19;
        0qQ.A0B(r15, 0);
        C255773uh r3 = r18;
        C255783ui A00 = C289745e8.A00(AnonymousClass3WT.MULTI_PRODUCT, r3.A0b());
        if (A00 != null) {
            MultiProductSticker multiProductSticker = A00.A0n;
            if (multiProductSticker != null) {
                List list = multiProductSticker.A09;
                if (list != null) {
                    Context context = r15.A01;
                    0qQ.A06(context);
                    String A002 = CnO.A00(multiProductSticker);
                    List A02 = C14502TxO.A02(list);
                    int A022 = AnonymousClass4EQ.A02(context);
                    if (C316216lI.A0C(context)) {
                        A01 = (int) (((float) A022) * 0.5625f);
                    } else {
                        A01 = AnonymousClass0nB.A01(context);
                    }
                    if (r3.CcK()) {
                        A01 -= context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) * 2;
                    }
                    r7 = new C389709q4(context, A002, A02, A01, r3.CcK());
                    String str = multiProductSticker.A07;
                    if (str != null) {
                        i = Color.parseColor(str);
                    } else {
                        i = -1;
                    }
                    r7.A01(multiProductSticker.A03, i);
                    C380069Wl r0 = r7.A00;
                    r0.A02 = i;
                    r0.invalidateSelf();
                    r7.setTextFormat(C358878bc.A00(multiProductSticker.A04));
                } else {
                    r7 = null;
                }
                AnonymousClass0eM r6 = r15.A04;
                ImageView imageView = (ImageView) r6.getValue();
                imageView.setImageDrawable(r7);
                imageView.setFocusable(true);
                imageView.setVisibility(0);
                imageView.requestLayout();
                0nA.A0q(imageView, new C57915IiW(r3, A00, r15));
                ImageView imageView2 = (ImageView) r6.getValue();
                if (r3.CcK() && r7 != null) {
                    AnonymousClass0fU.A00(new AOO(imageView2, A00, r7, r15, r20), imageView2);
                }
                if (!r3.CcK() && r7 != null) {
                    UserSession userSession2 = userSession;
                    if (182.A06(0Tu.A05, userSession2, 36312187553842153L)) {
                        C258103yT r02 = r15.A00;
                        if (r02 == null) {
                            r02 = new C258103yT(userSession2);
                            r15.A00 = r02;
                        }
                        r02.A00((Context) null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        r15.A03.setVisibility(8);
    }
}
