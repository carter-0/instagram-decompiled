package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.Arrays;

public final class H46 extends C231632rz {
    public final String getBinderGroupName() {
        return "Header";
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        if (i == 0) {
            return 0;
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(429972440);
        AnonymousClass7TG.A1O(view, obj);
        int i2 = 0;
        if (((AnonymousClass2rW) obj).A02() == 0) {
            i2 = 8;
        }
        view.setVisibility(i2);
        AnonymousClass0fD.A0A(1872632510, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -113837115);
        if (i == 0) {
            View A0D = DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.layout_privacy_label_view, false);
            AnonymousClass0fD.A0A(1161331551, A04);
            return A0D;
        }
        IllegalArgumentException A0a = DbW.A0a(AnonymousClass000.A00(964), i);
        AnonymousClass0fD.A0A(-752629305, A04);
        throw A0a;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(AnonymousClass7TF.A1b(i));
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
