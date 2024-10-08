package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.EDx  reason: case insensitive filesystem */
public final class C47714EDx extends C14097Tpp {
    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.FrameLayout, X.Djp, java.lang.Object, android.view.ViewGroup] */
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 1);
        ? frameLayout = new FrameLayout(context);
        2dZ A01 = 2dY.A01((View.OnClickListener) null, DbX.A0I(LayoutInflater.from(context).inflate(R.layout.action_bar, frameLayout), R.id.action_bar_container));
        frameLayout.A00 = A01;
        String str = "actionBarService";
        A01.Eu4(true);
        2dZ r0 = frameLayout.A00;
        if (r0 != null) {
            r0.A0Q().setBackground((Drawable) null);
            2dZ r02 = frameLayout.A00;
            if (r02 != null) {
                r02.Ets(false);
                2dZ r03 = frameLayout.A00;
                if (r03 != null) {
                    SearchEditText ErO = r03.ErO();
                    frameLayout.A01 = ErO;
                    if (ErO == null) {
                        str = "_editText";
                    } else {
                        ErO.setSearchIconEnabled(false);
                        return frameLayout;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r10, C276544tV r11, Object obj) {
        C46718Djp djp = (C46718Djp) view;
        C307786Rm r5 = r10;
        C276544tV r7 = r11;
        C48238EbJ ebJ = (C48238EbJ) C307476Qg.A06(r10, r11);
        if (ebJ != null) {
            SearchEditText editText = djp.getEditText();
            String A0E = r11.A0E();
            if (A0E != null) {
                editText.setHint(A0E);
            }
            String str = ebJ.A02;
            if (str != null) {
                editText.setText(str);
            }
            C277014uI A08 = r11.A08();
            if (A08 != null) {
                editText.setOnFocusChangeListener(new WBK(this, r10, r11, A08));
            }
            editText.A0C = new C51005Fms(this, ebJ, r10, r11);
            editText.setClearButtonEnabled(!r11.A0R(35, false));
            C277014uI A0A = r11.A0A(42);
            if (A0A == null) {
                return null;
            }
            AnonymousClass0fU.A00(new FO6(0, this, r5, A0A, r7), djp.getBackButton());
            return null;
        }
        throw AnonymousClass7TE.A15(Pxd.A00(27));
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        C46718Djp djp = (C46718Djp) view;
        SearchEditText editText = djp.getEditText();
        editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        editText.A0C = null;
        DbS.A1C(editText);
        editText.setHint((CharSequence) null);
        djp.getBackButton().setOnClickListener((View.OnClickListener) null);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C47714EDx(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
