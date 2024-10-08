package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Ue9  reason: case insensitive filesystem */
public final class C15520Ue9 extends C231632rz {
    public final C17255VOi A00;
    public final AnonymousClass4DH A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15520Ue9(AnonymousClass4DH r1, C17255VOi vOi) {
        this.A00 = vOi;
        this.A01 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = AnonymousClass0fD.A03(1152903024);
        AnonymousClass7TG.A1O(view, obj);
        1Xj r6 = (1Xj) obj;
        Resources A0R = JTR.A0R(this.A01);
        0qQ.A0B(r6, 1);
        switch (r6.A1Z().ordinal()) {
            case 1:
                i2 = 2131971738;
                break;
            case 2:
                i2 = 2131971732;
                break;
            case 3:
                i2 = 2131953965;
                break;
            case 4:
                i2 = 2131971735;
                break;
            case 5:
                i2 = 2131971734;
                break;
            case 7:
                i2 = 2131971733;
                break;
            case 8:
                i2 = 2131971737;
                break;
            case 10:
                i2 = 2131952249;
                break;
            default:
                i2 = 2131971736;
                break;
        }
        AnonymousClass7TE.A0d(view, R.id.row_title).setText(AnonymousClass7TF.A0d(A0R, i2));
        WBD.A00(view, 5, this, r6);
        AnonymousClass0fD.A0A(-1113420268, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(876465922);
        View A0D = DbT.A0D(DbX.A0F(viewGroup, 1), viewGroup, R.layout.row_promote, false);
        AnonymousClass0fD.A0A(582534896, A03);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
