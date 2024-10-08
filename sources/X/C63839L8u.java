package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.L8u  reason: case insensitive filesystem */
public final class C63839L8u {
    public int A00;
    public final Context A01;
    public final C364988mL A02;
    public final UserSession A03;
    public final FilterGroupModel A04 = new FilterGroupModelImpl(new FilterChain(), (PhotoFilter) null, AnonymousClass05K.A00, -1, true);

    public C63839L8u(Context context, C364988mL r8, UserSession userSession) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r8;
    }
}
