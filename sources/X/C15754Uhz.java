package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Uhz  reason: case insensitive filesystem */
public final class C15754Uhz extends C232222tE {
    public final C20898X3p A00;

    public C15754Uhz(C20898X3p x3p) {
        0qQ.A0B(x3p, 1);
        this.A00 = x3p;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C14840UBu(DbT.A0D(layoutInflater, viewGroup, R.layout.tab_bar, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r13, C249703kE r14) {
        TextView A0E;
        String str;
        C19280WSo wSo = (C19280WSo) r13;
        C14840UBu uBu = (C14840UBu) r14;
        boolean A1U = AnonymousClass7TF.A1U(0, wSo, uBu);
        ViewGroup viewGroup = uBu.A00;
        C17797VgA vgA = wSo.A01;
        C16672Uz8 uz8 = wSo.A02;
        C20898X3p x3p = this.A00;
        AnonymousClass7TF.A1C(viewGroup, 0, x3p);
        List list = vgA.A01;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < size) {
                C18479VsV vsV = (C18479VsV) list.get(i);
                if (i < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i);
                    0qQ.A0C(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    A0E = (TextView) childAt;
                } else {
                    A0E = C66582MXn.A0E(DbV.A0D(viewGroup), viewGroup, R.layout.button_group_tab, false);
                    viewGroup.addView(A0E);
                }
                String str2 = vsV.A02;
                if (str2 == null) {
                    str = DialogModule.KEY_TITLE;
                    break;
                }
                A0E.setText(str2);
                String str3 = vsV.A01;
                if (str3 == null) {
                    str = "contentDescription";
                    break;
                }
                A0E.setContentDescription(str3);
                C16672Uz8 uz82 = vsV.A00;
                if (uz82 == null) {
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
                    break;
                }
                if (uz82 != uz8) {
                    z = false;
                }
                A0E.setSelected(z);
                WBG.A01(A0E, 9, vsV, x3p);
                i++;
            } else {
                int childCount = viewGroup.getChildCount() - (A1U ? 1 : 0);
                int size2 = list.size();
                if (size2 <= childCount) {
                    while (true) {
                        viewGroup.removeViewAt(childCount);
                        if (childCount != size2) {
                            childCount--;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Class modelClass() {
        return C19280WSo.class;
    }
}
