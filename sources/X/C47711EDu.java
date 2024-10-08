package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.io.IOException;

/* renamed from: X.EDu  reason: case insensitive filesystem */
public final class C47711EDu extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new IgdsInlineSearchBox(context, false);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r8, C276544tV r9, Object obj) {
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view;
        0qQ.A0B(igdsInlineSearchBox, 0);
        AnonymousClass7TG.A1O(r8, r9);
        C48238EbJ ebJ = (C48238EbJ) C307476Qg.A06(r8, r9);
        if (ebJ != null) {
            if (r9.A0R(49, false)) {
                igdsInlineSearchBox.setSearchRowBackgroundColor(R.drawable.elevated_searchbar_background);
            }
            if (r9.A0D() != null) {
                String A0D = r9.A0D();
                0qQ.A0A(A0D);
                igdsInlineSearchBox.setHint(A0D);
            }
            String str = ebJ.A02;
            if (str != null) {
                igdsInlineSearchBox.A0E.setText(str);
            }
            int i = ebJ.A01;
            if (i == -1) {
                String str2 = ebJ.A02;
                if (str2 != null) {
                    igdsInlineSearchBox.setSelection(str2.length());
                }
            } else {
                igdsInlineSearchBox.A0E.setSelection(i, ebJ.A00);
            }
            C277014uI A0A = r9.A0A(38);
            if (A0A != null) {
                igdsInlineSearchBox.A00 = new FPL(r8, r9, A0A);
            }
            String A11 = DbV.A11(r9, "", 48);
            if (A11.equals("slider")) {
                igdsInlineSearchBox.A06(new FPE(6, (Object) r8, (Object) r9), R.drawable.instagram_sliders_outline_16, 2131962420);
            } else {
                1Kn.A03("BKSearchBarBinderUtils", new IOException(002.A0R("Unsupported icon type: ", A11)));
            }
            igdsInlineSearchBox.A02 = new WY2(0, ebJ, r8, r9);
            igdsInlineSearchBox.A03 = r9.A0R(41, false);
            return null;
        }
        throw AnonymousClass7TE.A15(Pxd.A00(27));
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r5, C276544tV r6, Object obj, Object obj2) {
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view;
        AnonymousClass7TG.A1T(igdsInlineSearchBox, r5, r6);
        Object A06 = C307476Qg.A06(r5, r6);
        if (A06 != null) {
            C48238EbJ ebJ = (C48238EbJ) A06;
            if (igdsInlineSearchBox.getSelectionStart() != null) {
                Integer selectionStart = igdsInlineSearchBox.getSelectionStart();
                0qQ.A0A(selectionStart);
                ebJ.A01 = selectionStart.intValue();
            }
            if (igdsInlineSearchBox.getSelectionEnd() != null) {
                Integer selectionEnd = igdsInlineSearchBox.getSelectionEnd();
                0qQ.A0A(selectionEnd);
                ebJ.A00 = selectionEnd.intValue();
            }
            igdsInlineSearchBox.A02 = null;
            igdsInlineSearchBox.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            igdsInlineSearchBox.A0E.setText("");
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Extension mapper missing controller for extension with id: ");
        A1A.append(C49821F8j.A00);
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(".STYLE_ID", A1A));
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C47711EDu(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
