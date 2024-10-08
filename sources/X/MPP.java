package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class MPP extends 0Yg implements 0sK {
    public static final MPP A00 = new MPP();

    public MPP() {
        super(3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        UserSession userSession = (UserSession) obj3;
        AnonymousClass7TF.A1B(viewGroup, 0, userSession);
        List list = C60680JpR.A00;
        return new C61781KLu(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.layout_stacked_timeline_bottom_sheet_color_filter_item, false), userSession);
    }
}
