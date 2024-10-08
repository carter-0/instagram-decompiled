package X;

import android.content.Context;
import android.view.View;

public final class H54 extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r5, C276544tV r6, Object obj) {
        AnonymousClass6K2 r4 = (AnonymousClass6K2) view;
        try {
            if (0Gl.A01(C308206Td.A0A(r5)) != null) {
                r4.A01.A00 = r6.A02(44, 0.0f) / r6.A02(42, 0.0f);
                return null;
            }
        } catch (NullPointerException unused) {
        }
        1Kn.A02("BKShowreelVideoPlayerBinderUtils", "Attempt to render Bloks showreel video player component outside a logged in user context.");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        AnonymousClass6K2 r1 = new AnonymousClass6K2(context);
        r1.setTag("showreel_composition_video_view_tag");
        return r1;
    }

    public H54(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
