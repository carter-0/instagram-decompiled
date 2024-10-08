package X;

import android.content.Context;
import com.facebook.avatar.expresso.odr.ODRController;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource;
import java.util.List;
import java.util.Map;

public final class MDU extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final int A0A;
    public final Object A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDU(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A0A = i;
        this.A0B = obj;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.MDU, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A0A;
        this.A09 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        switch (i) {
            case 0:
                return ((ODRController) this.A0B).A0A((C60793JrO) null, (C60795JrQ) null, (String) null, (String) null, (Map) null, this, (C262224Cq) null);
            case 1:
                return ClipsACRBrowserPagingSource.A02((ClipsACRBrowserPagingSource) this.A0B, (List) null, (List) null, (List) null, this);
            default:
                return I7H.A04((Context) null, (ClipsDraftPreviewItemRepository) null, (UserSession) null, (I7H) this.A0B, this, 0);
        }
    }
}
