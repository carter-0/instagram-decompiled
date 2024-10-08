package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.LqP  reason: case insensitive filesystem */
public final class C65270LqP implements C51903G6x {
    public final /* synthetic */ MXF A00;
    public final /* synthetic */ C62320sa A01;

    public final void onShareTap(List list) {
    }

    public C65270LqP(MXF mxf, C62320sa r2) {
        this.A00 = mxf;
        this.A01 = r2;
    }

    public final void onShareOneTap(DirectShareTarget directShareTarget) {
        String str;
        String str2;
        MXF mxf = this.A00;
        Integer num = AnonymousClass05K.A0l;
        HashMap A1E = AnonymousClass7TE.A1E();
        String str3 = null;
        if (directShareTarget != null) {
            str2 = "";
            str = 00k.A0P(",", str2, str2, directShareTarget.A0B(), (0sP) null);
        } else {
            str = "";
            str2 = str;
        }
        A1E.put("recipient_ids", str);
        if (directShareTarget != null) {
            str3 = directShareTarget.A08();
        }
        A1E.put("thread_ids", 00k.A0P(",", str2, str2, 00k.A0X(AnonymousClass7TE.A1I(str3)), (0sP) null));
        C64127LPb.A02(mxf, num, A1E);
        this.A01.invoke();
    }
}
